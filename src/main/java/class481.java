import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class481 implements class726 {
   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private String field6998;
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7003 = new String[]{method3641(method3640("\u001d\u0007\u0004dS")), method3641(method3640("\b\\F&")), method3641(method3640("\u0015E\u0004\f\u0006")), method3641(method3640("\u0015E\u0004vG\b@^t\u0006")), method3641(method3640("\u0015E\u0004\u000b\u0006")), method3641(method3640("\u0015E\u0004\u000f\u0006")), method3641(method3640("\u0015E\u0004\b\u0006")), method3641(method3640("\u0015E\u0004\t\u0006")), method3641(method3640("\u0015E\u0004\u000e\u0006"))};
   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "I"
   )
   public static int field6995;
   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "I"
   )
   public static int field6997;
   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "I"
   )
   public static int field6999;
   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "I"
   )
   public static int field7000;
   @OriginalMember(
      owner = "client!sl",
      name = "h",
      descriptor = "I"
   )
   public static int field7001;
   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "I"
   )
   public static int field7002;
   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "Z"
   )
   private boolean field6996;

   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3636(byte arg0) {
      try {
         ++field6997;
         if (arg0 <= 73) {
            method3637(77, (class155)null, (class269)null, (class65)null, 69, (byte)-8);
         }

         return this.field6996;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7003[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(ILct;Lsda;Lha;IB)Z"
   )
   public static final boolean method3637(int arg0, class155 arg1, class269 arg2, class65 arg3, int arg4, byte arg5) {
      boolean var6 = client.field4564;

      try {
         ++field6999;
         int var7 = Integer.MAX_VALUE;
         int var8 = Integer.MIN_VALUE;
         int var9 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         if (arg1.field2494 != null) {
            var8 = (arg1.field2485 + arg2.field3803 + -class370.field5504) * (-class370.field5514 + class370.field5507) / (-class370.field5504 + class370.field5510) + class370.field5514;
            var7 = class370.field5514 - -((-class370.field5504 + arg2.field3803 + arg1.field2472) * (-class370.field5514 + class370.field5507) / (-class370.field5504 + class370.field5510));
            var10 = -((-class370.field5501 + arg2.field3805 + arg1.field2478) * (-class370.field5500 + class370.field5515) / (class370.field5502 - class370.field5501)) + class370.field5515;
            var9 = class370.field5515 - (-class370.field5501 + arg1.field2479 + arg2.field3805) * (-class370.field5500 + class370.field5515) / (-class370.field5501 + class370.field5502);
         }

         class476 var11 = null;
         if (arg5 != -126) {
            return false;
         } else {
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (~arg1.field2504 != 0) {
               if (arg2.field3802 && ~arg1.field2469 != 0) {
                  var11 = arg1.method1430(arg3, -118, true);
               } else {
                  var11 = arg1.method1430(arg3, -107, false);
               }

               if (var11 != null) {
                  var12 = arg2.field3804 - (var11.method3009() - -1 >> 1);
                  var13 = arg2.field3804 - -(1 + var11.method3009() >> 1);
                  if (var12 < var7) {
                     var7 = var12;
                  }

                  var14 = arg2.field3798 + -(1 + var11.method3000() >> 1);
                  if (~var13 < ~var8) {
                     var8 = var13;
                  }

                  if (~var14 > ~var9) {
                     var9 = var14;
                  }

                  var15 = arg2.field3798 + (var11.method3000() - -1 >> 1);
                  if (~var15 < ~var10) {
                     var10 = var15;
                  }
               }
            }

            class297 var16 = null;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            if (arg1.field2501 != null) {
               var16 = class617.method4525((byte)-41, arg1.field2463);
               if (var16 != null) {
                  label164: {
                     var17 = class4.field45.method3347((class476[])null, 0, (int[])null, arg1.field2501, class344.field4910);
                     var19 = -((-class370.field5500 + class370.field5515) * arg1.field2470 / (-class370.field5501 + class370.field5502)) + arg2.field3798;
                     var18 = (class370.field5507 - class370.field5514) * arg1.field2477 / (class370.field5510 - class370.field5504) + arg2.field3804;
                     if (var11 != null) {
                        var19 -= (var11.method3000() >> 1) + var17 * var16.method2319();
                        if (!var6) {
                           break label164;
                        }
                     }

                     var19 -= var16.method2316() * var17 / 2;
                  }

                  int var25 = 0;
                  if (var6 || ~var25 > ~var17) {
                     do {
                        String var26 = class344.field4910[var25];
                        if (~var25 > ~(var17 + -1)) {
                           var26 = var26.substring(0, var26.length() + -4);
                        }

                        int var27 = var16.method2318(var26);
                        if (var20 < var27) {
                           var20 = var27;
                        }

                        ++var25;
                     } while(~var25 > ~var17);
                  }

                  var21 = arg0 + var18 + -(var20 / 2);
                  if (~var7 < ~var21) {
                     var7 = var21;
                  }

                  var22 = arg0 + var18 - -(var20 / 2);
                  var23 = arg4 + var19;
                  if (~var8 > ~var22) {
                     var8 = var22;
                  }

                  if (~var9 < ~var23) {
                     var9 = var23;
                  }

                  var24 = var17 * var16.method2319() + var19 - -arg4;
                  if (var10 < var24) {
                     var10 = var24;
                  }
               }
            }

            if (class370.field5514 <= var8 && var7 <= class370.field5507 && ~var10 <= ~class370.field5500 && ~var9 >= ~class370.field5515) {
               class370.method2885(arg3, arg2, arg1);
               if (var11 != null) {
                  if (class265.field3776 > 0 && (class580.field8338 != -1 && class580.field8338 == arg2.field3806 || class669.field9744 != -1 && ~class669.field9744 == ~arg1.field2505)) {
                     int var28;
                     label135: {
                        if (class372.field5541 > 50) {
                           var28 = -(class372.field5541 * 2) + 200;
                           if (!var6) {
                              break label135;
                           }
                        }

                        var28 = class372.field5541 * 2;
                     }

                     int var29 = 16776960 | var28 << 24;
                     arg3.method694(arg2.field3798, 7 + var11.method3002() / 2, var29, 1, arg2.field3804);
                     arg3.method694(arg2.field3798, var11.method3002() / 2 - -5, var29, 1, arg2.field3804);
                     arg3.method694(arg2.field3798, 3 + var11.method3002() / 2, var29, 1, arg2.field3804);
                     arg3.method694(arg2.field3798, var11.method3002() / 2 - -1, var29, arg5 ^ -125, arg2.field3804);
                     arg3.method694(arg2.field3798, var11.method3002() / 2, var29, arg5 + 127, arg2.field3804);
                  }

                  var11.method3609(arg2.field3804 + -(var11.method3009() >> 1), arg2.field3798 + -(var11.method3000() >> 1));
               }

               if (arg1.field2501 != null && var16 != null) {
                  class788.method5678(var16, arg3, var19, arg1, var17, var20, 2, var18, arg2);
               }

               if (~arg1.field2504 != 0 || arg1.field2501 != null) {
                  class78 var30 = new class78(arg2);
                  var30.field1351 = var23;
                  var30.field1345 = var15;
                  var30.field1354 = var21;
                  var30.field1355 = var14;
                  var30.field1357 = var22;
                  var30.field1356 = var13;
                  var30.field1353 = var24;
                  var30.field1352 = var12;
                  class791.field11560.method2585(var30, arg5 ^ 27);
               }

               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var32) {
         throw class608.method4462(var32, field7003[2] + arg0 + ',' + (arg1 != null ? field7003[0] : field7003[1]) + ',' + (arg2 != null ? field7003[0] : field7003[1]) + ',' + (arg3 != null ? field7003[0] : field7003[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(III[F[FFIIIBI)V"
   )
   public static final void method3638(int arg0, int arg1, int arg2, float[] arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
      boolean var11 = client.field4564;

      try {
         float var16;
         float var17;
         label38: {
            int var24 = arg1 - arg2;
            ++field7000;
            int var23 = arg0 - arg10;
            int var25 = arg7 - arg8;
            float var12 = arg4[2] * (float)var23 + arg4[0] * (float)var25 + arg4[1] * (float)var24;
            float var13 = arg4[5] * (float)var23 + arg4[4] * (float)var24 + arg4[3] * (float)var25;
            float var14 = arg4[8] * (float)var23 + arg4[6] * (float)var25 + arg4[7] * (float)var24;
            float var15 = (float)Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
            var16 = (float)Math.atan2((double)var12, (double)var14) / 6.2831855F + 0.5F;
            var17 = arg5 + 0.5F + (float)Math.asin((double)(var13 / var15)) / 3.1415927F;
            if (arg6 != 1) {
               if (~arg6 != -3) {
                  if (arg6 != 3) {
                     break label38;
                  }

                  float var18 = var16;
                  var16 = var17;
                  var17 = -var18;
                  if (!var11) {
                     break label38;
                  }
               }

               var17 = -var17;
               var16 = -var16;
               if (!var11) {
                  break label38;
               }
            }

            float var19 = var16;
            var16 = -var17;
            var17 = var19;
         }

         arg3[0] = var16;
         arg3[1] = var17;
         int var20 = 67 / ((arg9 - 49) / 45);
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field7003[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7003[0] : field7003[1]) + ',' + (arg4 != null ? field7003[0] : field7003[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class481(String arg0) {
      try {
         this.field6998 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7003[3] + (arg0 != null ? field7003[0] : field7003[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method3639(byte arg0) {
      try {
         int var1 = -122 % ((-34 - arg0) / 35);
         ++field7001;
         class380 var2 = (class380)class489.field7140.method2579(-801);
         boolean var3 = class665.field9664 != null || ~class13.field181 < -1;
         int var4 = var2.method1284((byte)42);
         int var5 = var2.method1278(2);
         if (var3) {
            class680.field9971 = 1;
         }

         if (var3) {
            class518.field7524 = class450.field6572;
         } else {
            class26.method182(-2, var5, class450.field6572, var4);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7003[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(B)Lpu;"
   )
   public final class586 method1382(byte arg0) {
      try {
         ++field6995;
         if (arg0 != 79) {
            this.field6996 = false;
         }

         return class586.field8473;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7003[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1379(byte arg0) {
      try {
         ++field7002;
         if (arg0 <= 52) {
            return 69;
         } else {
            int var2 = class272.method2149(-99, this.field6998);
            if (var2 >= 0 && ~var2 >= -101) {
               return var2;
            } else {
               this.field6996 = true;
               return 100;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7003[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3640(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3641(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
