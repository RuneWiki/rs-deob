import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class729 {
   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "Liw;"
   )
   private class107 field10386 = new class107(256);
   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "Ldaa;"
   )
   private class226 field10379;
   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "Ld;"
   )
   private class672 field10381;
   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10391 = new String[]{method5289(method5288("c`_\u001dH")), method5289(method5288("c`_\u001eH")), method5289(method5288("u!_w\u001d")), method5289(method5288("`z\u001d5")), method5289(method5288("c`_e\t`f\u0005gH")), method5289(method5288("c`_\u001bH")), method5289(method5288("c`_\u001cH")), method5289(method5288("c`_\u001aH")), method5289(method5288("c`_\u0011H")), method5289(method5288("c`_\u0018H")), method5289(method5288("c`_\u001fH"))};
   @OriginalMember(
      owner = "client!mo",
      name = "f",
      descriptor = "[Lpha;"
   )
   public static class757[] field10383 = new class757[8];
   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "I"
   )
   public static int field10384 = 0;
   @OriginalMember(
      owner = "client!mo",
      name = "i",
      descriptor = "I"
   )
   public static int field10378;
   @OriginalMember(
      owner = "client!mo",
      name = "e",
      descriptor = "I"
   )
   public static int field10380;
   @OriginalMember(
      owner = "client!mo",
      name = "j",
      descriptor = "I"
   )
   public static int field10382;
   @OriginalMember(
      owner = "client!mo",
      name = "h",
      descriptor = "I"
   )
   public static int field10385;
   @OriginalMember(
      owner = "client!mo",
      name = "l",
      descriptor = "I"
   )
   public static int field10387;
   @OriginalMember(
      owner = "client!mo",
      name = "k",
      descriptor = "I"
   )
   public static int field10388;
   @OriginalMember(
      owner = "client!mo",
      name = "m",
      descriptor = "I"
   )
   public static int field10390;
   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field10389;

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method5280(byte arg0) {
      try {
         ++field10390;
         ++class139.field2229;
         class242 var1 = class735.method5318(-120);
         if (arg0 < 48) {
            method5282(-120, -116, -73, 107, false, 61);
         }

         class381 var2 = class801.method5775(class245.field3758, 0, var1.field3718);
         var2.field5570.method656((byte)43, 0);
         var1.method2111(14024, var2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10391[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(II)Lpga;"
   )
   public final class371 method5281(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10378;
         Object var4 = this.field10386.method1041((long)arg0, 8);
         if (var4 != null) {
            return (class371)var4;
         } else {
            int var5 = -71 / ((55 - arg1) / 49);
            if (!this.field10381.method2036(arg0, (byte)-121)) {
               return null;
            } else {
               class390 var6;
               class371 var9;
               label58: {
                  var6 = this.field10381.method2043(-87, arg0);
                  int var7 = var6.field5685 ? 64 : this.field10379.field3439;
                  if (var6.field5666 && this.field10379.method237()) {
                     float[] var8 = this.field10381.method2035(var7, false, var7, arg0, 0.7F, (byte)105);
                     var9 = this.field10379.method1981(class31.field438, var8, var7, 4, var7, var6.field5675 != 0);
                     if (!var3) {
                        break label58;
                     }
                  }

                  int[] var10;
                  label42: {
                     if (var6.field5678 != 2 && class130.method1325((byte)3, var6.field5668)) {
                        var10 = this.field10381.method2038(0.7F, var7, true, arg0, var7, -23361);
                        if (!var3) {
                           break label42;
                        }
                     }

                     var10 = this.field10381.method2042(0.7F, arg0, false, var7, var7, true);
                  }

                  var9 = this.field10379.method2017(~var6.field5675 != -1, var7, 0, var7, var10);
               }

               var9.method31(var6.field5672, false, var6.field5682);
               this.field10386.method1050(-82, var9, (long)arg0);
               return var9;
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field10391[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(IIIIZI)V"
   )
   public static final void method5282(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field10388;
         if (~arg0 > -2) {
            arg0 = 1;
         }

         if (~arg2 > -2) {
            arg2 = 1;
         }

         int var7;
         label61: {
            var7 = arg0 - 334;
            if (arg1 < ~var7) {
               var7 = 0;
               if (!var6) {
                  break label61;
               }
            }

            if (var7 > 100) {
               var7 = 100;
            }
         }

         int var8;
         label56: {
            var8 = (-class394.field5714 + class570.field8080) * var7 / 100 + class394.field5714;
            if (class709.field10188 <= var8) {
               if (~class198.field2870 <= ~var8) {
                  break label56;
               }

               var8 = class198.field2870;
               if (!var6) {
                  break label56;
               }
            }

            var8 = class709.field10188;
         }

         label49: {
            int var9 = arg0 * var8 * 512 / (arg2 * 334);
            if (class264.field4038 <= var9) {
               if (class193.field2809 >= var9) {
                  break label49;
               }

               short var10 = class193.field2809;
               var8 = arg2 * 334 * var10 / (arg0 * 512);
               if (class709.field10188 <= var8) {
                  break label49;
               }

               var8 = class709.field10188;
               int var11 = arg2 * var10 * 334 / (var8 * 512);
               int var12 = (arg0 - var11) / 2;
               if (arg4) {
                  class54.field794.method231();
                  class54.field794.method223(arg5, arg2, 1, arg3, -16777216, var12);
                  class54.field794.method223(arg5 - -arg0 - var12, arg2, 1, arg3, -16777216, var12);
               }

               arg5 += var12;
               arg0 -= var12 * 2;
               if (!var6) {
                  break label49;
               }
            }

            short var13 = class264.field4038;
            var8 = arg2 * var13 * 334 / (arg0 * 512);
            if (class198.field2870 < var8) {
               var8 = class198.field2870;
               int var14 = arg0 * var8 * 512 / (var13 * 334);
               int var15 = (-var14 + arg2) / 2;
               if (arg4) {
                  class54.field794.method231();
                  class54.field794.method223(arg5, var15, 1, arg3, -16777216, arg0);
                  class54.field794.method223(arg5, var15, 1, -var15 + arg2 + arg3, -16777216, arg0);
               }

               arg2 -= var15 * 2;
               arg3 += var15;
            }
         }

         class103.field1625 = (short)arg2;
         class509.field7227 = arg3;
         class283.field4269 = arg5;
         class66.field967 = arg0 * var8 / 334;
         class225.field3199 = (short)arg0;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field10391[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5283(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5284(int arg0) {
      try {
         field10389 = null;
         field10383 = null;
         if (arg0 != 2) {
            field10389 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10391[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5285(byte arg0) {
      boolean var1 = client.field10022;

      try {
         int var2 = -38 % ((-16 - arg0) / 35);
         ++field10387;
         if (class744.field10589 == null) {
            class744.field10589 = new int[65536];
            if (!var1) {
               double var3 = 0.7D + -0.015D + 0.03D * Math.random();
               int var5 = 0;
               if (!var1 && var5 >= 65536) {
                  return;
               }

               do {
                  double var6 = (double)(63 & var5 >> 10) / 64.0D + 0.0078125D;
                  double var8 = (double)((938 & var5) >> 7) / 8.0D + 0.0625D;
                  double var10 = (double)(var5 & 127) / 128.0D;
                  double var12 = var10;
                  double var14 = var10;
                  double var16 = var10;
                  if (var8 != 0.0D) {
                     label127: {
                        double var18;
                        label110: {
                           if (!(var10 < 0.5D)) {
                              var18 = var8 + var10 - var8 * var10;
                              if (!var1) {
                                 break label110;
                              }
                           }

                           var18 = (var8 + 1.0D) * var10;
                        }

                        double var20 = var10 * 2.0D - var18;
                        double var22 = var6 + 0.3333333333333333D;
                        if (var22 > 1.0D) {
                           --var22;
                        }

                        double var26;
                        label123: {
                           var26 = var6 - 0.3333333333333333D;
                           if (var22 * 6.0D < 1.0D) {
                              var12 = (var18 - var20) * 6.0D * var22 + var20;
                              if (!var1) {
                                 break label123;
                              }
                           }

                           if (var22 * 2.0D < 1.0D) {
                              var12 = var18;
                              if (!var1) {
                                 break label123;
                              }
                           }

                           if (var22 * 3.0D < 2.0D) {
                              var12 = (var18 - var20) * (-var22 + 0.6666666666666666D) * 6.0D + var20;
                              if (var1) {
                                 var12 = var20;
                              }
                           } else {
                              var12 = var20;
                           }
                        }

                        label124: {
                           if (var6 * 6.0D < 1.0D) {
                              var14 = (-var20 + var18) * 6.0D * var6 + var20;
                              if (!var1) {
                                 break label124;
                              }
                           }

                           if (var6 * 2.0D < 1.0D) {
                              var14 = var18;
                              if (!var1) {
                                 break label124;
                              }
                           }

                           if (!(var6 * 3.0D < 2.0D)) {
                              var14 = var20;
                              if (!var1) {
                                 break label124;
                              }
                           }

                           var14 = (-var20 + var18) * (-var6 + 0.6666666666666666D) * 6.0D + var20;
                        }

                        if (var26 < 0.0D) {
                           ++var26;
                        }

                        if (!(var26 * 6.0D < 1.0D)) {
                           if (!(var26 * 2.0D < 1.0D)) {
                              if (var26 * 3.0D < 2.0D) {
                                 var16 = (0.6666666666666666D - var26) * (-var20 + var18) * 6.0D + var20;
                                 if (!var1) {
                                    break label127;
                                 }
                              }

                              var16 = var20;
                              if (!var1) {
                                 break label127;
                              }
                           }

                           var16 = var18;
                           if (!var1) {
                              break label127;
                           }
                        }

                        var16 = (-var20 + var18) * 6.0D * var26 + var20;
                     }
                  }

                  double var28 = Math.pow(var12, var3);
                  double var30 = Math.pow(var14, var3);
                  double var32 = Math.pow(var16, var3);
                  int var34 = (int)(var28 * 256.0D);
                  int var35 = (int)(var30 * 256.0D);
                  int var36 = (int)(var32 * 256.0D);
                  int var37 = (var35 << 8) + ((var34 << 16) - -var36);
                  class744.field10589[var5] = var37;
                  ++var5;
               } while(var5 < 65536);

               return;
            }
         }

      } catch (RuntimeException var39) {
         throw class612.method4503(var39, field10391[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "<init>",
      descriptor = "(Ldaa;Ld;)V"
   )
   public class729(class226 arg0, class672 arg1) {
      try {
         this.field10379 = arg0;
         this.field10381 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10391[4] + (arg0 != null ? field10391[2] : field10391[3]) + ',' + (arg1 != null ? field10391[2] : field10391[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5286(int arg0) {
      try {
         if (arg0 <= 24) {
            method5280((byte)41);
         }

         this.field10386.method1048(5, -8543);
         ++field10382;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10391[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5287(int arg0) {
      try {
         ++field10380;
         if (arg0 == -474) {
            this.field10386.method1052(true);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10391[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5288(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5289(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
