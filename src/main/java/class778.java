import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class778 {
   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11355 = new String[]{method5624(method5623("\u0003'o\u0007\r")), method5624(method5623("\tm \u00075P")), method5624(method5623("\u0016|-E")), method5624(method5623("\tm \u00074P")), method5624(method5623("\tm \u00073P")), method5624(method5623("\tm \u00072P")), method5624(method5623("\tm \u00071P")), method5624(method5623("\tm \u00076P"))};
   @OriginalMember(
      owner = "client!qda",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field11340 = true;
   @OriginalMember(
      owner = "client!qda",
      name = "q",
      descriptor = "I"
   )
   public static int field11342 = 0;
   @OriginalMember(
      owner = "client!qda",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field11349 = new int[1];
   @OriginalMember(
      owner = "client!qda",
      name = "n",
      descriptor = "I"
   )
   public int field11333;
   @OriginalMember(
      owner = "client!qda",
      name = "k",
      descriptor = "I"
   )
   public int field11335;
   @OriginalMember(
      owner = "client!qda",
      name = "o",
      descriptor = "I"
   )
   public int field11336;
   @OriginalMember(
      owner = "client!qda",
      name = "u",
      descriptor = "I"
   )
   public static int field11338;
   @OriginalMember(
      owner = "client!qda",
      name = "b",
      descriptor = "I"
   )
   public static int field11339;
   @OriginalMember(
      owner = "client!qda",
      name = "l",
      descriptor = "I"
   )
   public int field11341;
   @OriginalMember(
      owner = "client!qda",
      name = "s",
      descriptor = "I"
   )
   public int field11343;
   @OriginalMember(
      owner = "client!qda",
      name = "h",
      descriptor = "I"
   )
   public int field11344;
   @OriginalMember(
      owner = "client!qda",
      name = "r",
      descriptor = "I"
   )
   public int field11345;
   @OriginalMember(
      owner = "client!qda",
      name = "v",
      descriptor = "I"
   )
   public static int field11346;
   @OriginalMember(
      owner = "client!qda",
      name = "m",
      descriptor = "I"
   )
   public int field11347;
   @OriginalMember(
      owner = "client!qda",
      name = "p",
      descriptor = "I"
   )
   public int field11348;
   @OriginalMember(
      owner = "client!qda",
      name = "e",
      descriptor = "I"
   )
   public int field11350;
   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "I"
   )
   public static int field11351;
   @OriginalMember(
      owner = "client!qda",
      name = "g",
      descriptor = "I"
   )
   public int field11352;
   @OriginalMember(
      owner = "client!qda",
      name = "d",
      descriptor = "I"
   )
   public int field11353;
   @OriginalMember(
      owner = "client!qda",
      name = "f",
      descriptor = "I"
   )
   public static int field11354;
   @OriginalMember(
      owner = "client!qda",
      name = "c",
      descriptor = "Ljl;"
   )
   public static class733 field11334;
   @OriginalMember(
      owner = "client!qda",
      name = "t",
      descriptor = "[[Loca;"
   )
   public static class642[][] field11337;

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(ILha;IIII)V"
   )
   public static final void method5617(int arg0, class479 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         arg1.method460(arg3, arg2, arg3 - -arg0, arg2 + arg4);
         if (arg5 == 4) {
            ++field11351;
            arg1.method3643(false, arg2, -16777216, arg3, arg0, arg4);
            if (class264.field3355 >= 100) {
               int var8;
               int var9;
               label89: {
                  float var7 = (float)class326.field4486 / (float)class326.field4492;
                  var8 = arg0;
                  var9 = arg4;
                  if (var7 < 1.0F) {
                     var9 = (int)((float)arg0 * var7);
                     if (!var6) {
                        break label89;
                     }
                  }

                  var8 = (int)((float)arg4 / var7);
               }

               int var25 = (-var8 + arg0) / 2 + arg3;
               int var24 = (-var9 + arg4) / 2 + arg2;
               if (class202.field2571 == null || class202.field2571.method2394() != arg0 || ~class202.field2571.method2404() != ~arg4) {
                  class326.method2575(class326.field4502, class326.field4499 + class326.field4486, class326.field4502 + class326.field4492, class326.field4499, var25, var24, var25 + var8, var24 + var9);
                  class326.method2564(arg1);
                  class202.field2571 = arg1.method414(var25, var24, var8, var9, false);
               }

               class202.field2571.method4760(var25, var24);
               int var10 = class391.field5416 * var8 / class326.field4492;
               int var11 = class147.field1837 * var9 / class326.field4486;
               int var12 = class604.field8875 * var8 / class326.field4492 + var25;
               int var13 = var24 + var9 + -var11 + -(class642.field9565 * var9 / class326.field4486);
               int var14 = -1996554240;
               if (class776.field11312 == class688.field10127) {
                  var14 = -1996488705;
               }

               arg1.method513(var12, var13, var10, var11, var14, 1);
               arg1.method462(var12, var13, var10, var11, var14, 0);
               if (class768.field11204 > 0) {
                  int var15;
                  label57: {
                     if (class495.field6905 <= 50) {
                        var15 = class495.field6905 * 5;
                        if (!var6) {
                           break label57;
                        }
                     }

                     var15 = -(class495.field6905 * 5) + 500;
                  }

                  class160 var16 = (class160)class326.field4479.method288(0);
                  if (var6 || var16 != null) {
                     do {
                        class519 var17 = class326.field4471.method4937(var16.field2052, true);
                        if (class199.method1651(11, var17)) {
                           label102: {
                              if (class204.field2600 == var16.field2052) {
                                 int var18 = var16.field2046 * var8 / class326.field4492 + var25;
                                 int var19 = var24 - -((-var16.field2048 + class326.field4486) * var9 / class326.field4486);
                                 arg1.method3643(false, var19 + -2, 16776960 | var15 << 24, var18 - 2, 4, 4);
                                 if (!var6) {
                                    break label102;
                                 }
                              }

                              if (~class16.field282 != 0 && class16.field282 == var17.field7280) {
                                 int var20 = var25 - -(var16.field2046 * var8 / class326.field4492);
                                 int var21 = (class326.field4486 - var16.field2048) * var9 / class326.field4486 + var24;
                                 arg1.method3643(false, var21 + -2, 16776960 | var15 << 24, var20 + -2, 4, 4);
                              }
                           }
                        }

                        var16 = (class160)class326.field4479.method290(arg5 ^ 17954);
                     } while(var16 != null);

                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field11355[3] + arg0 + ',' + (arg1 != null ? field11355[0] : field11355[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5618(int arg0) {
      try {
         field11334 = null;
         field11337 = null;
         field11349 = null;
         if (arg0 <= 69) {
            method5620((byte[])null, -11, 52, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11355[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method5619(long arg0, long arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11355[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "([BIILjava/lang/String;)I"
   )
   public static final int method5620(byte[] arg0, int arg1, int arg2, String arg3) {
      boolean var4 = client.field1481;

      try {
         ++field11338;
         int var5 = arg1;
         int var6 = arg3.length();
         if (arg2 != -4403) {
            method5620((byte[])null, -121, 54, (String)null);
         }

         int var7 = 0;
         int var10000;
         if (var4) {
            var10000 = class376.method2968(arg3.charAt(var7), -1);
         } else if (var6 <= var7) {
            var10000 = -arg1 + arg1;
            if (!var4) {
               return var10000;
            }
         } else {
            var10000 = class376.method2968(arg3.charAt(var7), -1);
         }

         do {
            while(true) {
               int var8 = var10000;
               int var9 = ~(var7 + 1) <= ~var6 ? -1 : class376.method2968(arg3.charAt(var7 - -1), arg2 + 4402);
               int var10 = ~var6 < ~(var7 + 2) ? class376.method2968(arg3.charAt(var7 + 2), -1) : -1;
               int var11 = ~(var7 - -3) > ~var6 ? class376.method2968(arg3.charAt(var7 + 3), arg2 + 4402) : -1;
               arg0[arg1++] = (byte)class2.method15(var8 << 2, var9 >>> 4);
               if (~var10 == 0 && !var4) {
                  var10000 = -var5 + arg1;
                  break;
               }

               arg0[arg1++] = (byte)class2.method15(var10 >>> 2, class109.method974(var9 << 4, 240));
               if (~var11 == 0) {
                  if (!var4) {
                     var10000 = -var5 + arg1;
                     if (!var4) {
                        return var10000;
                     }
                     continue;
                  }

                  arg0[arg1++] = (byte)class2.method15(var11, class109.method974(192, var10 << 6));
                  var7 += 4;
               } else {
                  arg0[arg1++] = (byte)class2.method15(var11, class109.method974(192, var10 << 6));
                  var7 += 4;
               }

               if (var6 <= var7) {
                  var10000 = -var5 + arg1;
                  if (!var4) {
                     return var10000;
                  }
               } else {
                  var10000 = class376.method2968(arg3.charAt(var7), -1);
               }
            }
         } while(var4);

         return var10000;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field11355[1] + (arg0 != null ? field11355[0] : field11355[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11355[0] : field11355[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5621(int arg0, int arg1, int arg2) {
      try {
         ++field11346;
         if (arg1 != -6117) {
            field11337 = null;
         }

         return false;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11355[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(ZLqda;)Z"
   )
   public final boolean method5622(boolean arg0, class778 arg1) {
      try {
         if (arg0) {
            method5618(-65);
         }

         ++field11354;
         return this.field11341 == arg1.field11341 && this.field11333 == arg1.field11333 && ~this.field11336 == ~arg1.field11336;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11355[7] + arg0 + ',' + (arg1 != null ? field11355[0] : field11355[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5623(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5624(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
