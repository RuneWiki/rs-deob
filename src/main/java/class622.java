import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class622 extends class428 {
   @OriginalMember(
      owner = "client!rj",
      name = "q",
      descriptor = "Lll;"
   )
   public class387 field9154 = new class387();
   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9161 = new String[]{method4528(method4527("|y")), method4528(method4527("u`\"a")), method4528(method4527("i\u007f`NI")), method4528(method4527("`;`#\u001c")), method4528(method4527("i\u007f`OI"))};
   @OriginalMember(
      owner = "client!rj",
      name = "p",
      descriptor = "I"
   )
   public static int field9156 = 0;
   @OriginalMember(
      owner = "client!rj",
      name = "m",
      descriptor = "Lqea;"
   )
   public static class139 field9157 = new class139();
   @OriginalMember(
      owner = "client!rj",
      name = "n",
      descriptor = "I"
   )
   public static int field9155;
   @OriginalMember(
      owner = "client!rj",
      name = "r",
      descriptor = "I"
   )
   public static int field9158;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!rj",
      name = "s",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9160;
   @OriginalMember(
      owner = "client!rj",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field9159;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method4526(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(Z)V",
      line = 9
   )
   public static void method4523(boolean arg0) {
      try {
         field9159 = null;
         if (!arg0) {
            field9157 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9161[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "()V",
      line = 29
   )
   public static final void method4524() {
      for(int var0 = 0; var0 < class299.field4095; ++var0) {
         if (!class195.field2759[var0]) {
            class637 var1 = class220.field3145[var0];
            class389 var2 = var1.field9324;
            int var3 = var1.field9327;
            int var4 = var2.method2958((byte)120) - class436.field6247;
            int var5 = (var4 * 2 >> class773.field11359) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method2955(false) - var4 >> class773.field11359;
            int var9 = var2.method2963(true) - var4 >> class773.field11359;
            int var10 = var2.method2963(true) + var4 >> class773.field11359;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class16.field190) {
               var10 = class16.field190 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field9329[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class457.field6539) {
                  var16 = class457.field6539 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class627 var19 = class691.method5042(var3, var17, var11, field9160 != null ? field9160 : (field9160 = method4526(field9161[0])));
                  if (var19 != null && var19.field9206 != 0) {
                     if (var19.field9206 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field9329[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field9329[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field9329[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field9329[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class195.field2759[var0] = true;
            class731.field10698[var3].method1619(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(Lrd;IILha;ILdja;)Z",
      line = 207
   )
   public static final boolean method4525(class357 arg0, int arg1, int arg2, class66 arg3, int arg4, class326 arg5) {
      boolean var6 = client.field4360;

      try {
         ++field9155;
         int var7 = Integer.MAX_VALUE;
         int var8 = Integer.MIN_VALUE;
         int var9 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         if (arg5.field4428 != null) {
            var7 = (class650.field9510 - class650.field9507) * (-class650.field9505 + arg0.field4795 + arg5.field4416) / (-class650.field9505 + class650.field9509) + class650.field9507;
            var9 = -((arg5.field4415 - -arg0.field4801 + -class650.field9515) * (-class650.field9521 + class650.field9508) / (-class650.field9515 + class650.field9517)) + class650.field9508;
            var8 = (arg0.field4795 + arg5.field4435 + -class650.field9505) * (-class650.field9507 + class650.field9510) / (-class650.field9505 + class650.field9509) + class650.field9507;
            var10 = class650.field9508 - (arg5.field4459 - (-arg0.field4801 - -class650.field9515)) * (class650.field9508 - class650.field9521) / (-class650.field9515 + class650.field9517);
         }

         class492 var11 = null;
         if (arg2 > -86) {
            return true;
         } else {
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (~arg5.field4452 != 0) {
               if (arg0.field4799 && ~arg5.field4430 != 0) {
                  var11 = arg5.method2413(arg3, -4, true);
               } else {
                  var11 = arg5.method2413(arg3, -4, false);
               }

               if (var11 != null) {
                  var12 = arg0.field4800 - (var11.method960() + 1 >> 1);
                  var13 = arg0.field4800 + (1 + var11.method960() >> 1);
                  if (var7 > var12) {
                     var7 = var12;
                  }

                  if (~var13 < ~var8) {
                     var8 = var13;
                  }

                  var14 = arg0.field4802 + -(1 + var11.method957() >> 1);
                  if (~var14 > ~var9) {
                     var9 = var14;
                  }

                  var15 = arg0.field4802 + (var11.method957() - -1 >> 1);
                  if (var10 < var15) {
                     var10 = var15;
                  }
               }
            }

            class476 var16 = null;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            if (arg5.field4461 != null) {
               var16 = class527.method3809(arg5.field4457, 30811);
               if (var16 != null) {
                  label164: {
                     var17 = class705.field10283.method1629(false, class305.field4181, (class492[])null, arg5.field4461, (int[])null);
                     var18 = (-class650.field9507 + class650.field9510) * arg5.field4445 / (-class650.field9505 + class650.field9509) + arg0.field4800;
                     var19 = -((-class650.field9521 + class650.field9508) * arg5.field4420 / (-class650.field9515 + class650.field9517)) + arg0.field4802;
                     if (var11 != null) {
                        var19 -= (var11.method957() >> 1) + var16.method3463() * var17;
                        if (!var6) {
                           break label164;
                        }
                     }

                     var19 -= var16.method3465() * var17 / 2;
                  }

                  int var25 = 0;
                  if (var6 || var17 > var25) {
                     do {
                        String var26 = class305.field4181[var25];
                        if (~var25 > ~(var17 + -1)) {
                           var26 = var26.substring(0, var26.length() + -4);
                        }

                        int var27 = var16.method3461(var26);
                        if (~var27 < ~var20) {
                           var20 = var27;
                        }

                        ++var25;
                     } while(var17 > var25);
                  }

                  var21 = var18 - var20 / 2 + arg1;
                  if (var21 < var7) {
                     var7 = var21;
                  }

                  var22 = var20 / 2 + (var18 - -arg1);
                  var23 = var19 - -arg4;
                  if (var8 < var22) {
                     var8 = var22;
                  }

                  var24 = arg4 + var17 * var16.method3463() + var19;
                  if (~var23 > ~var9) {
                     var9 = var23;
                  }

                  if (var24 > var10) {
                     var10 = var24;
                  }
               }
            }

            if (~var8 <= ~class650.field9507 && ~var7 >= ~class650.field9510 && var10 >= class650.field9521 && ~class650.field9508 <= ~var9) {
               class650.method4749(arg3, arg0, arg5);
               if (var11 != null) {
                  if (~class592.field8717 < -1 && (class612.field8977 != -1 && class612.field8977 == arg0.field4793 || class504.field7317 != -1 && ~class504.field7317 == ~arg5.field4447)) {
                     int var28;
                     label135: {
                        if (class697.field10218 > 50) {
                           var28 = (-class697.field10218 + 100) * 2;
                           if (!var6) {
                              break label135;
                           }
                        }

                        var28 = class697.field10218 * 2;
                     }

                     int var29 = 16776960 | var28 << 24;
                     arg3.method559(arg0.field4800, 7 + var11.method958() / 2, var29, arg0.field4802, false);
                     arg3.method559(arg0.field4800, 5 + var11.method958() / 2, var29, arg0.field4802, false);
                     arg3.method559(arg0.field4800, 3 + var11.method958() / 2, var29, arg0.field4802, false);
                     arg3.method559(arg0.field4800, 1 + var11.method958() / 2, var29, arg0.field4802, false);
                     arg3.method559(arg0.field4800, var11.method958() / 2, var29, arg0.field4802, false);
                  }

                  var11.method3575(arg0.field4800 - (var11.method960() >> 1), arg0.field4802 - (var11.method957() >> 1));
               }

               if (arg5.field4461 != null && var16 != null) {
                  class351.method2564(arg5, arg0, var17, var16, var18, (byte)-79, var20, arg3, var19);
               }

               if (~arg5.field4452 != 0 || arg5.field4461 != null) {
                  class586 var30 = new class586(arg0);
                  var30.field8660 = var22;
                  var30.field8661 = var14;
                  var30.field8664 = var15;
                  var30.field8667 = var21;
                  var30.field8663 = var12;
                  var30.field8659 = var23;
                  var30.field8668 = var13;
                  var30.field8669 = var24;
                  class792.field11613.method2930((byte)-75, var30);
               }

               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var32) {
         throw class237.method1823(var32, field9161[2] + (arg0 != null ? field9161[3] : field9161[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9161[3] : field9161[1]) + ',' + arg4 + ',' + (arg5 != null ? field9161[3] : field9161[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
