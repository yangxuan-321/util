package com.twitter.io

import org.scalatest.wordspec.AnyWordSpec

class TempDirectoryTest extends AnyWordSpec {

  "TempDirectory" should {

    "create a directory when deleteAtExit is true" in {
      val dir = TempDirectory.create(true)
      assert(dir.exists())
      assert(dir.isDirectory)
    }

    "create a directory when deleteAtExit is false" in {
      val dir = TempDirectory.create(false)
      assert(dir.exists())
      assert(dir.isDirectory)
    }
  }
}
