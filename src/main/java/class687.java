import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class687 {
   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10075 = new String[]{method5018(method5017("\u0001[z\u0013\u001f")), method5018(method5017("\u0001[z\u0011\u001f")), method5018(method5017("\u001e^8<")), method5018(method5017("\u000b\u0005z~J")), method5018(method5017("\u0001[z\u0012\u001f"))};
   @OriginalMember(
      owner = "client!qp",
      name = "c",
      descriptor = "I"
   )
   public static int field10072;
   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "I"
   )
   public static int field10073;
   @OriginalMember(
      owner = "client!qp",
      name = "b",
      descriptor = "I"
   )
   public static int field10074;

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(ILha;IIZI)V"
   )
   public static final void method5014(int arg0, class65 arg1, int arg2, int arg3, boolean arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field10072;
         arg1.method577(arg2, arg0, arg2 + arg3, arg0 + arg5);
         arg1.method510(3966, arg0, arg2, -16777216, arg3, arg5);
         if (class93.field1236 >= 100) {
            int var8;
            int var9;
            label93: {
               float var7 = (float)class618.field8636 / (float)class618.field8642;
               var8 = arg3;
               var9 = arg5;
               if (var7 < 1.0F) {
                  var9 = (int)((float)arg3 * var7);
                  if (!var6) {
                     break label93;
                  }
               }

               var8 = (int)((float)arg5 / var7);
            }

            int var24 = (arg5 - var9) / 2 + arg0;
            int var25 = (-var8 + arg3) / 2 + arg2;
            if (class338.field4838 == null || ~class338.field4838.method2126() != ~arg3 || ~arg5 != ~class338.field4838.method2137()) {
               class618.method4484(class618.field8644, class618.field8636 + class618.field8627, class618.field8644 - -class618.field8642, class618.field8627, var25, var24, var25 + var8, var24 - -var9);
               class618.method4480(arg1);
               class338.field4838 = arg1.method513(var25, var24, var8, var9, false);
            }

            if (arg4) {
               class338.field4838.method5482(var25, var24);
               int var10 = class90.field1154 * var8 / class618.field8642;
               int var11 = class572.field7869 * var9 / class618.field8636;
               int var12 = class528.field7243 * var8 / class618.field8642 + var25;
               int var13 = var24 - -var9 - class493.field6782 * var9 / class618.field8636 + -var11;
               int var14 = -1996554240;
               if (class381.field5334 == class339.field4866) {
                  var14 = -1996488705;
               }

               arg1.method508(var12, var13, var10, var11, var14, 1);
               arg1.method523(var12, var13, var10, var11, var14, 0);
               if (~class595.field8288 < -1) {
                  int var15;
                  label56: {
                     if (class730.field10685 <= 50) {
                        var15 = class730.field10685 * 5;
                        if (!var6) {
                           break label56;
                        }
                     }

                     var15 = (100 - class730.field10685) * 5;
                  }

                  class168 var16 = (class168)class618.field8624.method3855(115);
                  if (var6 || var16 != null) {
                     do {
                        class297 var17 = class618.field8609.method5236(var16.field2123, (byte)70);
                        if (class543.method3920((byte)104, var17)) {
                           label105: {
                              if (~class367.field5175 != ~var16.field2123) {
                                 if (~class701.field10210 == 0 || class701.field10210 != var17.field3902) {
                                    break label105;
                                 }

                                 int var18 = var16.field2118 * var8 / class618.field8642 + var25;
                                 int var19 = (-var16.field2124 + class618.field8636) * var9 / class618.field8636 + var24;
                                 arg1.method510(3966, var19 + -2, var18 + -2, var15 << 24 | 16776960, 4, 4);
                                 if (!var6) {
                                    break label105;
                                 }
                              }

                              int var20 = var16.field2118 * var8 / class618.field8642 + var25;
                              int var21 = var24 - -((-var16.field2124 + class618.field8636) * var9 / class618.field8636);
                              arg1.method510(3966, var21 + -2, var20 + -2, var15 << 24 | 16776960, 4, 4);
                           }
                        }

                        var16 = (class168)class618.field8624.method3866((byte)111);
                     } while(var16 != null);

                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field10075[1] + arg0 + ',' + (arg1 != null ? field10075[3] : field10075[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5015(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         ++field10074;
         int var6 = 0;
         int var7 = arg4;
         int var8 = -arg4;
         byte var9 = -1;
         int var10 = class138.method1159(arg0 + arg4, class663.field9442, (byte)-44, class265.field3451);
         int var11 = class138.method1159(-arg4 + arg0, class663.field9442, (byte)-44, class265.field3451);
         class125.method1046(-23355, var10, class17.field236[arg1], arg2, var11);
         int var10000;
         int var10001;
         int var22;
         if (var5) {
            var22 = var9 + 2;
            var10000 = var8;
            var10001 = var22;
         } else {
            if (~var6 <= ~arg4) {
               if (arg3 > -4) {
                  method5016(43, -128, -122, 118);
                  return;
               }

               return;
            }

            var22 = var9 + 2;
            var10000 = var8;
            var10001 = var22;
         }

         while(true) {
            while(true) {
               var8 = var10000 + var10001;
               if (var8 > 0) {
                  --var7;
                  var8 -= var7 << 1;
                  int var12 = arg1 - var7;
                  int var13 = arg1 - -var7;
                  if (~var13 <= ~class478.field6604 && var12 <= class313.field4171) {
                     int var14 = class138.method1159(arg0 + var6, class663.field9442, (byte)-44, class265.field3451);
                     int var15 = class138.method1159(-var6 + arg0, class663.field9442, (byte)-44, class265.field3451);
                     if (var13 <= class313.field4171) {
                        class125.method1046(-23355, var14, class17.field236[var13], arg2, var15);
                     }

                     if (class478.field6604 <= var12) {
                        class125.method1046(-23355, var14, class17.field236[var12], arg2, var15);
                     }
                  }
               }

               ++var6;
               int var16 = -var6 + arg1;
               int var17 = arg1 - -var6;
               if (~var17 > ~class478.field6604) {
                  break;
               }

               var10000 = ~var16;
               var10001 = ~class313.field4171;
               if (!var5) {
                  if (var10000 >= var10001) {
                     int var18 = class138.method1159(arg0 + var7, class663.field9442, (byte)-44, class265.field3451);
                     int var19 = class138.method1159(-var7 + arg0, class663.field9442, (byte)-44, class265.field3451);
                     if (~var17 >= ~class313.field4171) {
                        class125.method1046(-23355, var18, class17.field236[var17], arg2, var19);
                     }

                     if (~var16 <= ~class478.field6604) {
                        class125.method1046(-23355, var18, class17.field236[var16], arg2, var19);
                     }
                  }
                  break;
               }
            }

            if (~var6 <= ~var7) {
               if (arg3 > -4) {
                  method5016(43, -128, -122, 118);
                  return;
               }

               return;
            }

            var22 += 2;
            var10000 = var8;
            var10001 = var22;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field10075[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method5016(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10073;
         if (class93.field1241 == null) {
            return 0;
         } else {
            if (arg3 != 2) {
               method5016(-44, -7, 11, -91);
            }

            int var4 = arg0 >> 9;
            int var5 = arg2 >> 9;
            if (~var4 <= -1 && ~var5 <= -1 && ~var4 >= ~(class507.field7030 + -1) && var5 <= class215.field2667 - 1) {
               int var6 = arg1;
               if (arg1 < 3 && (class100.field1295[1][var4][var5] & 2) != 0) {
                  var6 = arg1 + 1;
               }

               return class93.field1241[var6].method2220(125, arg0, arg2);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10075[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5017(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5018(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
