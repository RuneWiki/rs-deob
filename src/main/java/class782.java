import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class782 extends class302 {
   @OriginalMember(
      owner = "client!gfa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11411 = new String[]{method5625(method5624("Hm\u0013Nt")), method5625(method5624("]6Q\f")), method5625(method5624("T%\\NL\u001b")), method5625(method5624("T%\\NK\u001b")), method5625(method5624("T%\\NO\u001b")), method5625(method5624("T%\\NH\u001b")), method5625(method5624("T%\\NJ\u001b"))};
   @OriginalMember(
      owner = "client!gfa",
      name = "L",
      descriptor = "I"
   )
   public static int field11405;
   @OriginalMember(
      owner = "client!gfa",
      name = "I",
      descriptor = "I"
   )
   public static int field11407;
   @OriginalMember(
      owner = "client!gfa",
      name = "J",
      descriptor = "I"
   )
   public static int field11408;
   @OriginalMember(
      owner = "client!gfa",
      name = "H",
      descriptor = "I"
   )
   public static int field11409;
   @OriginalMember(
      owner = "client!gfa",
      name = "K",
      descriptor = "I"
   )
   public static int field11410;
   @OriginalMember(
      owner = "client!gfa",
      name = "M",
      descriptor = "[Lne;"
   )
   private class335[] field11406;

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field11407;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (arg0 != -90) {
            this.method401(5, -108);
         }

         if (super.field4292.field6892) {
            int var5 = class344.field5238;
            int var6 = class501.field7439;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field4292.method3412(arg0 + 217);
            this.method5623(var7, 0);
            int var9 = 0;
            if (var3 != 0 || ~class501.field7439 < ~var9) {
               do {
                  int[] var10 = var7[var9];
                  int[][] var11 = var8[var9];
                  int[] var12 = var11[0];
                  int[] var13 = var11[1];
                  int[] var14 = var11[2];
                  int var15 = 0;
                  if (var3 != 0 || class344.field5238 > var15) {
                     do {
                        int var16 = var10[var15];
                        var14[var15] = class153.method1262(255, var16) << 4;
                        var13[var15] = class153.method1262(var16 >> 4, 4080);
                        var12[var15] = class153.method1262(16711680, var16) >> 12;
                        ++var15;
                     } while(class344.field5238 > var15);
                  }

                  ++var9;
               } while(~class501.field7439 < ~var9);
            }
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field11411[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      try {
         ++field11405;
         int[] var3 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            this.method5623(super.field4298.method3176(-1), 0);
         }

         if (arg1 > -37) {
            this.method5623((int[][])null, 43);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11411[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(ILjj;)Loaa;"
   )
   public static final class302 method5622(int arg0, class128 arg1) {
      int var2 = client.field4530;

      try {
         arg1.method1104(arg0 + 255);
         ++field11410;
         int var3 = arg1.method1104(255);
         class302 var4 = class270.method2088(-70, var3);
         var4.field4312 = arg1.method1104(255);
         int var5 = arg1.method1104(255);
         int var6 = arg0;
         if (var2 == 0 && ~var5 >= ~arg0) {
            var4.method708((byte)-114);
            return var4;
         } else {
            do {
               int var7 = arg1.method1104(arg0 + 255);
               var4.method244(var7, 0, arg1);
               ++var6;
            } while(~var5 < ~var6);

            var4.method708((byte)-114);
            return var4;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11411[2] + arg0 + ',' + (arg1 != null ? field11411[0] : field11411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "([[II)V"
   )
   private final void method5623(int[][] arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field11409;
         int var4 = class344.field5238;
         int var5 = class501.field7439;
         class185.method1439(arg0, (byte)109);
         class102.method888(0, class275.field3837, class264.field3612, 53, arg1);
         if (this.field11406 != null) {
            int var6 = 0;
            if (var3 != 0 || ~var6 > ~this.field11406.length) {
               do {
                  class335 var7 = this.field11406[var6];
                  int var8 = var7.field4793;
                  int var9 = var7.field4791;
                  if (~var8 <= -1) {
                     if (~var9 > -1) {
                        var7.method2537(var5, (byte)114, var4);
                        if (var3 != 0) {
                           var7.method2541(var4, arg1, var5);
                           if (var3 != 0) {
                              if (var9 >= 0) {
                                 var7.method2540((byte)106, var5, var4);
                              }

                              ++var6;
                           } else {
                              ++var6;
                           }
                        } else {
                           ++var6;
                        }
                     } else {
                        var7.method2541(var4, arg1, var5);
                        if (var3 != 0) {
                           if (var9 >= 0) {
                              var7.method2540((byte)106, var5, var4);
                           }

                           ++var6;
                        } else {
                           ++var6;
                        }
                     }
                  } else {
                     if (var9 >= 0) {
                        var7.method2540((byte)106, var5, var4);
                     }

                     ++var6;
                  }
               } while(~var6 > ~this.field11406.length);

            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field11411[6] + (arg0 != null ? field11411[0] : field11411[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         ++field11408;
         if (arg1 != 0) {
            this.method244(29, 80, (class128)null);
         }

         if (~arg0 != -1) {
            if (arg0 == 1) {
               super.field4313 = ~arg2.method1104(255) == -2;
               return;
            }
         } else {
            this.field11406 = new class335[arg2.method1104(255)];
            int var5 = 0;
            if (var4 != 0 || ~var5 > ~this.field11406.length) {
               do {
                  int var6 = arg2.method1104(255);
                  if (var6 != 0) {
                     if (~var6 != -2) {
                        if (var6 != 2) {
                           if (var6 == 3) {
                              if (var4 != 0) {
                                 this.field11406[var5] = class583.method4301(arg2, -11872);
                                 if (var4 != 0) {
                                    this.field11406[var5] = class486.method3606(arg2, true);
                                    if (var4 != 0) {
                                       this.field11406[var5] = class388.method2977(arg2, (byte)-126);
                                       if (var4 != 0) {
                                          this.field11406[var5] = class159.method1316(arg2, 0);
                                          ++var5;
                                       } else {
                                          ++var5;
                                       }
                                    } else {
                                       ++var5;
                                    }
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 this.field11406[var5] = class159.method1316(arg2, 0);
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           this.field11406[var5] = class388.method2977(arg2, (byte)-126);
                           if (var4 != 0) {
                              this.field11406[var5] = class159.method1316(arg2, 0);
                              ++var5;
                           } else {
                              ++var5;
                           }
                        }
                     } else {
                        this.field11406[var5] = class486.method3606(arg2, true);
                        if (var4 != 0) {
                           this.field11406[var5] = class388.method2977(arg2, (byte)-126);
                           if (var4 != 0) {
                              this.field11406[var5] = class159.method1316(arg2, 0);
                              ++var5;
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     }
                  } else {
                     this.field11406[var5] = class583.method4301(arg2, -11872);
                     if (var4 != 0) {
                        this.field11406[var5] = class486.method3606(arg2, true);
                        if (var4 != 0) {
                           this.field11406[var5] = class388.method2977(arg2, (byte)-126);
                           if (var4 != 0) {
                              this.field11406[var5] = class159.method1316(arg2, 0);
                              ++var5;
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        ++var5;
                     }
                  }
               } while(~var5 > ~this.field11406.length);
            }
         }

      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11411[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11411[0] : field11411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "<init>",
      descriptor = "()V"
   )
   public class782() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5624(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5625(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
