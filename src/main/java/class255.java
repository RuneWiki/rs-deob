import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class255 extends class606 {
   @OriginalMember(
      owner = "client!kr",
      name = "E",
      descriptor = "I"
   )
   private int field3861 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "J",
      descriptor = "I"
   )
   private int field3868 = 2048;
   @OriginalMember(
      owner = "client!kr",
      name = "N",
      descriptor = "I"
   )
   private int field3867 = 10;
   @OriginalMember(
      owner = "client!kr",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3873 = new String[]{method2179(method2178("U~\u000bY")), method2179(method2178("@%I\u001bN")), method2179(method2178("PyIt\u001b")), method2179(method2178("PyIv\u001b")), method2179(method2178("PyIp\u001b")), method2179(method2178("PyI~\u001b")), method2179(method2178("PyI}\u001b"))};
   @OriginalMember(
      owner = "client!kr",
      name = "K",
      descriptor = "Lhha;"
   )
   public static class724 field3870 = new class724(40, 0);
   @OriginalMember(
      owner = "client!kr",
      name = "I",
      descriptor = "I"
   )
   public static int field3872 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "L",
      descriptor = "I"
   )
   public static int field3862;
   @OriginalMember(
      owner = "client!kr",
      name = "H",
      descriptor = "I"
   )
   public static int field3864;
   @OriginalMember(
      owner = "client!kr",
      name = "F",
      descriptor = "I"
   )
   public static int field3865;
   @OriginalMember(
      owner = "client!kr",
      name = "M",
      descriptor = "I"
   )
   public static int field3866;
   @OriginalMember(
      owner = "client!kr",
      name = "D",
      descriptor = "Lsa;"
   )
   public static class39 field3871;
   @OriginalMember(
      owner = "client!kr",
      name = "O",
      descriptor = "[I"
   )
   private int[] field3863;
   @OriginalMember(
      owner = "client!kr",
      name = "G",
      descriptor = "[I"
   )
   private int[] field3869;

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field3865;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            this.method8((class65)null, 47, -73);
         }

         if (super.field8645.field4884) {
            int var5 = class693.field10001[arg1];
            if (this.field3861 == 0) {
               label205: {
                  short var6 = 0;
                  int var7 = 0;
                  if (var3) {
                     if (var5 >= this.field3869[var7]) {
                        if (~this.field3869[var7 + 1] < ~var5) {
                           if (~this.field3863[var7] < ~var5) {
                              var6 = 4096;
                              if (var3) {
                                 ++var7;
                              } else {
                                 class474.method3643(var4, 0, class563.field8014, var6);
                                 if (!var3) {
                                    break label205;
                                 }

                                 ++var7;
                              }
                           } else {
                              class474.method3643(var4, 0, class563.field8014, var6);
                              if (!var3) {
                                 break label205;
                              }

                              ++var7;
                           }
                        } else {
                           ++var7;
                        }
                     } else {
                        ++var7;
                     }
                  }

                  label204:
                  while(true) {
                     while(~var7 > ~this.field3867) {
                        if (var5 >= this.field3869[var7]) {
                           if (~this.field3869[var7 + 1] < ~var5) {
                              if (~this.field3863[var7] < ~var5) {
                                 var6 = 4096;
                                 if (var3) {
                                    ++var7;
                                 } else {
                                    class474.method3643(var4, 0, class563.field8014, var6);
                                    if (!var3) {
                                       break label204;
                                    }

                                    ++var7;
                                 }
                              } else {
                                 class474.method3643(var4, 0, class563.field8014, var6);
                                 if (!var3) {
                                    break label204;
                                 }

                                 ++var7;
                              }
                           } else {
                              ++var7;
                           }
                        } else {
                           ++var7;
                        }
                     }

                     class474.method3643(var4, 0, class563.field8014, var6);
                     if (!var3) {
                        break;
                     }

                     ++var7;
                  }
               }

               if (!var3) {
                  return var4;
               }
            }

            int var8 = 0;
            if (var3 || var8 < class563.field8014) {
               do {
                  int var9;
                  short var10;
                  label78: {
                     int var11;
                     label77: {
                        label76: {
                           var9 = 0;
                           var10 = 0;
                           var11 = class387.field5650[var8];
                           int var12 = this.field3861;
                           if (var12 != 1) {
                              if (~var12 == -3) {
                                 break label76;
                              }

                              if (~var12 != -4) {
                                 break label78;
                              }

                              if (!var3) {
                                 break label77;
                              }
                           }

                           var9 = var11;
                           if (!var3) {
                              break label78;
                           }
                        }

                        var9 = (var11 - -var5 - 4096 >> 1) + 2048;
                        if (!var3) {
                           break label78;
                        }
                     }

                     var9 = (-var5 + var11 >> 1) + 2048;
                  }

                  label136: {
                     int var13 = 0;
                     if (var3) {
                        if (this.field3869[var13] <= var9) {
                           if (var9 < this.field3869[var13 + 1]) {
                              if (~this.field3863[var13] < ~var9) {
                                 var10 = 4096;
                                 if (var3) {
                                    ++var13;
                                 } else {
                                    var4[var8] = var10;
                                    if (!var3) {
                                       break label136;
                                    }

                                    ++var13;
                                 }
                              } else {
                                 var4[var8] = var10;
                                 if (!var3) {
                                    break label136;
                                 }

                                 ++var13;
                              }
                           } else {
                              ++var13;
                           }
                        } else {
                           ++var13;
                        }
                     }

                     label135:
                     while(true) {
                        while(~this.field3867 < ~var13) {
                           if (this.field3869[var13] <= var9) {
                              if (var9 < this.field3869[var13 + 1]) {
                                 if (~this.field3863[var13] < ~var9) {
                                    var10 = 4096;
                                    if (var3) {
                                       ++var13;
                                    } else {
                                       var4[var8] = var10;
                                       if (!var3) {
                                          break label135;
                                       }

                                       ++var13;
                                    }
                                 } else {
                                    var4[var8] = var10;
                                    if (!var3) {
                                       break label135;
                                    }

                                    ++var13;
                                 }
                              } else {
                                 ++var13;
                              }
                           } else {
                              ++var13;
                           }
                        }

                        var4[var8] = var10;
                        if (!var3) {
                           break;
                        }

                        ++var13;
                     }
                  }

                  ++var8;
               } while(var8 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field3873[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         if (arg0 < 118) {
            this.method9(-55, -122);
         }

         this.method2176(4096);
         ++field3862;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3873[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label46: {
            label45: {
               label44: {
                  if (~arg1 != -1) {
                     if (~arg1 == -2) {
                        break label44;
                     }

                     if (~arg1 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field3867 = arg0.method665(false);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field3868 = arg0.method685(-2);
               if (!var4) {
                  break label46;
               }
            }

            this.field3861 = arg0.method665(false);
         }

         ++field3866;
         if (arg2 > -6) {
            field3871 = null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3873[2] + (arg0 != null ? field3873[1] : field3873[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "<init>",
      descriptor = "()V"
   )
   public class255() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!kr",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method2176(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kr",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2177(int arg0) {
      try {
         field3871 = null;
         if (arg0 != 4096) {
            field3872 = 10;
         }

         field3870 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3873[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2178(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2179(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
