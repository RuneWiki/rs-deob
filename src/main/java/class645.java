import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public abstract class class645 {
   @OriginalMember(
      owner = "client!jia",
      name = "r",
      descriptor = "[B"
   )
   private byte[] field9433;
   @OriginalMember(
      owner = "client!jia",
      name = "y",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field9440;
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field9414;
   @OriginalMember(
      owner = "client!jia",
      name = "g",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field9435;
   @OriginalMember(
      owner = "client!jia",
      name = "l",
      descriptor = "Lwv;"
   )
   private class37 field9425;
   @OriginalMember(
      owner = "client!jia",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9442 = new String[]{method4684(method4683("zFl\u0016\u00058")), method4684(method4683("zFl\u0016\u00068")), method4684(method4683("{Ny]")), method4684(method4683("zFl\u0016\u00018")), method4684(method4683("zFl\u0016\u00128")), method4684(method4683("zFl\u0016\u001c8")), method4684(method4683("VNdT0t\u000fyWu|@l\\uzNjL=u@\u007fYu|FoJ4bV")), method4684(method4683("zNjL=u@\u007fY")), method4684(method4683("zFl\u0016iyAdLk8")), method4684(method4683("zFl\u0016\u001f8")), method4684(method4683("zFl\u0016\u001d8")), method4684(method4683("zFl\u0016\u00188")), method4684(method4683("zFl\u0016\u00078")), method4684(method4683("zFl\u0016\u00048")), method4684(method4683("zFl\u0016\u00138")), method4684(method4683("zFl\u0016\u001a8")), method4684(method4683("zFl\u0016\u001e8")), method4684(method4683("zFl\u0016\u001b8")), method4684(method4683("k\u0001#\u0016(")), method4684(method4683("~ZaT")), method4684(method4683("zFl\u0016\u00198"))};
   @OriginalMember(
      owner = "client!jia",
      name = "q",
      descriptor = "Lgo;"
   )
   public static class656 field9423 = new class656();
   @OriginalMember(
      owner = "client!jia",
      name = "k",
      descriptor = "I"
   )
   public static int field9416;
   @OriginalMember(
      owner = "client!jia",
      name = "n",
      descriptor = "I"
   )
   public static int field9417;
   @OriginalMember(
      owner = "client!jia",
      name = "v",
      descriptor = "I"
   )
   public static int field9419;
   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "I"
   )
   public static int field9421;
   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "I"
   )
   public static int field9422;
   @OriginalMember(
      owner = "client!jia",
      name = "f",
      descriptor = "I"
   )
   public static int field9424;
   @OriginalMember(
      owner = "client!jia",
      name = "e",
      descriptor = "I"
   )
   public static int field9427;
   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "I"
   )
   public static int field9429;
   @OriginalMember(
      owner = "client!jia",
      name = "h",
      descriptor = "I"
   )
   public static int field9431;
   @OriginalMember(
      owner = "client!jia",
      name = "x",
      descriptor = "I"
   )
   public static int field9432;
   @OriginalMember(
      owner = "client!jia",
      name = "o",
      descriptor = "I"
   )
   public static int field9434;
   @OriginalMember(
      owner = "client!jia",
      name = "C",
      descriptor = "I"
   )
   public static int field9437;
   @OriginalMember(
      owner = "client!jia",
      name = "u",
      descriptor = "I"
   )
   public static int field9439;
   @OriginalMember(
      owner = "client!jia",
      name = "w",
      descriptor = "I"
   )
   public static int field9441;
   @OriginalMember(
      owner = "client!jia",
      name = "B",
      descriptor = "Lgg;"
   )
   private class188 field9428;
   @OriginalMember(
      owner = "client!jia",
      name = "p",
      descriptor = "Lmea;"
   )
   private class456 field9438;
   @OriginalMember(
      owner = "client!jia",
      name = "i",
      descriptor = "Lraa;"
   )
   private class634 field9413;
   @OriginalMember(
      owner = "client!jia",
      name = "m",
      descriptor = "Lgi;"
   )
   public static class708 field9420;
   @OriginalMember(
      owner = "client!jia",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field9415;
   @OriginalMember(
      owner = "client!jia",
      name = "A",
      descriptor = "Z"
   )
   private boolean field9418;
   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "Z"
   )
   private boolean field9426;
   @OriginalMember(
      owner = "client!jia",
      name = "j",
      descriptor = "Z"
   )
   private boolean field9430;
   @OriginalMember(
      owner = "client!jia",
      name = "t",
      descriptor = "Z"
   )
   private boolean field9436;

   @OriginalMember(
      owner = "client!jia",
      name = "f",
      descriptor = "(I)V",
      line = 3
   )
   private final void method4667(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field9429;
         class508 var3 = (class508)this.field9425.method328(arg0 + 1745388291);
         class188 var10000;
         int var4;
         if (var2) {
            var10000 = this.field9428;
         } else if (var3 == null) {
            var10000 = this.field9428;
            if (!var2) {
               if (var10000 == null) {
                  return;
               }

               var4 = arg0;
               if (!var2) {
                  if (~arg0 <= -11) {
                     return;
                  }

                  if (!this.method4669((byte)-99)) {
                     return;
                  }
               }

               while(~this.field9428.field7405.packetOut() == -2) {
                  this.field9428.method3696(this.field9435, 115);
                  if (var2) {
                     break;
                  }

                  ++var4;
                  if (~var4 <= -11) {
                     return;
                  }

                  if (!this.method4669((byte)-99)) {
                     return;
                  }
               }

               this.method4673(false);
               return;
            }
         } else {
            var10000 = this.field9428;
         }

         while(true) {
            class508 var7;
            label149: {
               if (var10000 == var3) {
                  if (var2) {
                     var3.method3696(this.field9435, 120);
                  } else {
                     var7 = (class508)this.field9425.method325(arg0 + -4629);
                     if (!var2) {
                        break label149;
                     }

                     var7.method3696(this.field9435, 120);
                  }
               }

               while(true) {
                  while(~var3.field7405.packetOut() == -2) {
                     var3.method3696(this.field9435, 120);
                  }

                  var7 = (class508)this.field9425.method325(arg0 + -4629);
                  if (!var2) {
                     break;
                  }

                  var7.method3696(this.field9435, 120);
               }
            }

            var3 = var7;
            if (var3 == null) {
               var10000 = this.field9428;
               if (!var2) {
                  if (var10000 == null) {
                     return;
                  }

                  var4 = arg0;
                  if (!var2) {
                     if (~arg0 <= -11) {
                        return;
                     }

                     if (!this.method4669((byte)-99)) {
                        return;
                     }
                  }

                  while(~this.field9428.field7405.packetOut() == -2) {
                     this.field9428.method3696(this.field9435, 115);
                     if (var2) {
                        break;
                     }

                     ++var4;
                     if (~var4 <= -11) {
                        return;
                     }

                     if (!this.method4669((byte)-99)) {
                        return;
                     }
                  }

                  this.method4673(false);
                  return;
               }
            } else {
               var10000 = this.field9428;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9442[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(I)Leu;",
      line = 43
   )
   private final class508 method4668(int arg0) throws IOException {
      boolean var2 = client.field4360;

      try {
         ++field9427;
         if (this.field9436) {
            throw new IllegalStateException();
         } else if (this.field9418) {
            return null;
         } else {
            label137:
            while(~this.field9440.pageOut(this.field9414) >= -1) {
               int var3 = this.method4670(this.field9433, -9);

               do {
                  if (~var3 == 0) {
                     this.field9418 = true;
                     return null;
                  }

                  if (~var3 == -1) {
                     return null;
                  }

                  if (this.field9440.write(this.field9433, var3)) {
                     continue label137;
                  }
               } while(var2);

               throw new RuntimeException("");
            }

            if (arg0 != -29480) {
               this.field9436 = true;
            }

            int var4 = this.field9414.getSerialNumber();
            if (!this.field9414.isBOS()) {
               class508 var5 = (class508)this.field9425.method329((byte)108, (long)var4);
               if (!var5.field7405.pageIn(this.field9414)) {
                  throw new IllegalStateException();
               } else {
                  return var5;
               }
            } else {
               OggStreamState var6 = new OggStreamState(var4);
               if (!var6.pageIn(this.field9414)) {
                  throw new IllegalStateException();
               } else if (~var6.packetPeek(this.field9435) != -2) {
                  throw new IllegalStateException();
               } else {
                  class508 var11;
                  label153: {
                     if (this.field9428 != null || !this.field9435.isTheora()) {
                        if (this.field9438 != null || !this.field9435.isVorbis()) {
                           label152: {
                              byte[] var7 = this.field9435.getData();
                              StringBuffer var8 = new StringBuffer();
                              int var9 = 1;
                              String var10;
                              boolean var10000;
                              if (var2) {
                                 var10000 = Character.isLetterOrDigit((char)var7[var9]);
                              } else if (~var9 <= ~var7.length) {
                                 var10 = var8.toString();
                                 var10000 = var10.equals(field9442[2]);
                                 if (!var2) {
                                    if (!var10000) {
                                       var11 = new class591(var6);
                                       if (!var2) {
                                          break label153;
                                       }
                                    }

                                    var11 = new class634(var6);
                                    if (!var2) {
                                       break label153;
                                    }
                                    break label152;
                                 }
                              } else {
                                 var10000 = Character.isLetterOrDigit((char)var7[var9]);
                              }

                              label111:
                              while(true) {
                                 while(!var10000) {
                                    var10 = var8.toString();
                                    var10000 = var10.equals(field9442[2]);
                                    if (!var2) {
                                       if (!var10000) {
                                          var11 = new class591(var6);
                                          if (!var2) {
                                             break label153;
                                          }
                                       }

                                       var11 = new class634(var6);
                                       if (!var2) {
                                          break label153;
                                       }
                                       break label111;
                                    }
                                 }

                                 var8.append((char)var7[var9]);
                                 ++var9;
                                 if (~var9 <= ~var7.length) {
                                    var10 = var8.toString();
                                    var10000 = var10.equals(field9442[2]);
                                    if (!var2) {
                                       if (!var10000) {
                                          var11 = new class591(var6);
                                          if (!var2) {
                                             break label153;
                                          }
                                       }

                                       var11 = new class634(var6);
                                       if (!var2) {
                                          break label153;
                                       }
                                       break;
                                    }
                                 } else {
                                    var10000 = Character.isLetterOrDigit((char)var7[var9]);
                                 }
                              }
                           }
                        }

                        this.field9438 = new class456(var6);
                        var11 = this.field9438;
                        if (!var2) {
                           break label153;
                        }
                     }

                     this.field9428 = new class188(var6);
                     var11 = this.field9428;
                  }

                  this.field9425.method336(-1, (long)var4, var11);
                  return var11;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field9442[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "(B)Z",
      line = 162
   )
   private final boolean method4669(byte arg0) {
      try {
         ++field9439;
         int var2 = -91 % ((arg0 - -53) / 45);
         if (this.field9438 == null) {
            double var3 = (double)this.field9428.method1484((byte)-114);
            return var3 == 0.0D || (double)class133.method1054(-29025) >= (double)this.field9428.method1490(-110) + 1000.0D / var3;
         } else {
            return !this.field9428.method1488(-124) || this.method4672(124) > this.field9428.method1491(false);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9442[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "(I)V",
      line = 187
   )
   private final void method4671(int arg0) throws IOException {
      boolean var2 = client.field4360;

      try {
         ++field9432;
         if (arg0 == 0) {
            label36:
            while(true) {
               if (~this.field9428.field7405.packetOut(this.field9435) == -2) {
                  this.field9428.method3696(this.field9435, arg0 ^ 103);
                  return;
               }

               class508 var3 = this.method4668(-29480);

               do {
                  if (var3 == null) {
                     break label36;
                  }

                  if (this.field9413 != var3) {
                     continue label36;
                  }

                  this.method4677(false);
               } while(var2);

               if (var2) {
                  break;
               }
            }

            if (this.field9418) {
               this.method4667(0);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9442[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(I)D",
      line = 219
   )
   public final double method4672(int arg0) {
      try {
         ++field9434;
         if (this.field9438 != null) {
            return this.field9438.method3329(0);
         } else if (this.field9428 != null) {
            return this.field9428.method1491(false);
         } else {
            return arg0 < 110 ? -0.9920342370776953D : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "(Z)V",
      line = 241
   )
   public final void method4673(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field9417;
         if (!this.field9436) {
            class508 var3 = (class508)this.field9425.method328(1745388291);
            if (var2) {
               var3.method1486(-5238);
               var3.field7405.method5388();
               var3 = (class508)this.field9425.method325(-4629);
            }

            while(true) {
               if (var3 == null) {
                  this.field9435.method5388();
                  this.field9414.method5388();
                  this.field9440.method5388();
                  this.field9436 = true;
                  if (!var2) {
                     if (arg0) {
                        this.method4677(false);
                        return;
                     }

                     return;
                  }
               } else {
                  var3.method1486(-5238);
                  var3.field7405.method5388();
               }

               var3 = (class508)this.field9425.method325(-4629);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9442[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "e",
      descriptor = "(I)Lmea;",
      line = 268
   )
   public final class456 method4674(int arg0) {
      try {
         if (arg0 != -32268) {
            this.field9428 = null;
         }

         ++field9416;
         return this.field9438;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "(I)Z",
      line = 279
   )
   public final boolean method4675(int arg0) {
      try {
         ++field9419;
         if (!this.field9436 && !this.field9418) {
            return false;
         } else {
            if (arg0 < 75) {
               this.method4667(2);
            }

            return this.field9438 == null || this.field9438.method3328((byte)-78) <= 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 298
   )
   public final void method4676(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Z)V",
      line = 352
   )
   private final void method4677(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(B)V",
      line = 389
   )
   public final void method4678(byte param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(B)V",
      line = 507
   )
   public static void method4679(byte arg0) {
      try {
         int var1 = -122 % ((arg0 - -11) / 42);
         field9420 = null;
         field9423 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(Z)Lraa;",
      line = 522
   )
   public final class634 method4680(boolean arg0) {
      try {
         ++field9422;
         if (arg0) {
            this.field9440 = null;
         }

         return this.field9413;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "(Z)Lgg;",
      line = 534
   )
   public final class188 method4681(boolean arg0) {
      try {
         ++field9441;
         if (arg0) {
            this.field9436 = false;
         }

         return this.field9428;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IZ)V",
      line = 548
   )
   public final void method4682(int arg0, boolean arg1) {
      try {
         ++field9424;
         if (this.field9438 != null) {
            class685 var3 = this.field9438.method3325(30361);
            if (var3 != null) {
               var3.method5001(arg1, (byte)-122);
            }
         }

         this.field9430 = !this.field9430;
         if (arg0 != 0) {
            this.field9440 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9442[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "<init>",
      descriptor = "(I)V",
      line = 580
   )
   public class645(int arg0) {
      try {
         if (!class715.method5188(-19503, field9442[7])) {
            throw new RuntimeException(field9442[6]);
         } else {
            this.field9433 = new byte[arg0];
            this.field9440 = new OggSyncState();
            this.field9414 = new OggPage();
            this.field9435 = new OggPacket();
            this.field9425 = new class37(8);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9442[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "([BI)I"
   )
   public abstract int method4670(byte[] arg0, int arg1) throws IOException;

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4683(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4684(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
