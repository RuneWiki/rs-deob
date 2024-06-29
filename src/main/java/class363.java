import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class363 extends class116 {
   @OriginalMember(
      owner = "client!gha",
      name = "H",
      descriptor = "I"
   )
   public int field5418 = 99;
   @OriginalMember(
      owner = "client!gha",
      name = "ab",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5427 = new String[]{method2851(method2850("d\u0005S\u007f\u001dBE")), method2851(method2850("xC\u001c\u007f%")), method2851(method2850("m\u0018^=")), method2851(method2850("d\u0005S\u007f\u001aBE")), method2851(method2850("d\u0005S\u007f\f+")), method2851(method2850("s\t")), method2851(method2850("d\u0005S\u007f\r+")), method2851(method2850("d\u0005S\u007f\u0019BE")), method2851(method2850("d\u0005S\u007f\u001eBE")), method2851(method2850("d\u0005S\u007f\u001cBE")), method2851(method2850("d\u0005S\u007f\u001fBE")), method2851(method2850("d\u0005S\u007f\u000f+")), method2851(method2850("d\u0005S\u007f\u000b+")), method2851(method2850("d\u0005S\u007f\u001bBE")), method2851(method2850("d\u0005S\u007f\u000e+"))};
   @OriginalMember(
      owner = "client!gha",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field5415 = new int[1000];
   @OriginalMember(
      owner = "client!gha",
      name = "P",
      descriptor = "I"
   )
   public static int field5412;
   @OriginalMember(
      owner = "client!gha",
      name = "T",
      descriptor = "I"
   )
   public static int field5413;
   @OriginalMember(
      owner = "client!gha",
      name = "Z",
      descriptor = "I"
   )
   public static int field5414;
   @OriginalMember(
      owner = "client!gha",
      name = "X",
      descriptor = "I"
   )
   public static int field5416;
   @OriginalMember(
      owner = "client!gha",
      name = "W",
      descriptor = "I"
   )
   public static int field5417;
   @OriginalMember(
      owner = "client!gha",
      name = "V",
      descriptor = "I"
   )
   public static int field5419;
   @OriginalMember(
      owner = "client!gha",
      name = "M",
      descriptor = "I"
   )
   public static int field5420;
   @OriginalMember(
      owner = "client!gha",
      name = "R",
      descriptor = "I"
   )
   public static int field5421;
   @OriginalMember(
      owner = "client!gha",
      name = "Q",
      descriptor = "I"
   )
   public static int field5422;
   @OriginalMember(
      owner = "client!gha",
      name = "Y",
      descriptor = "I"
   )
   public static int field5423;
   @OriginalMember(
      owner = "client!gha",
      name = "S",
      descriptor = "I"
   )
   public static int field5424;
   @OriginalMember(
      owner = "client!gha",
      name = "U",
      descriptor = "I"
   )
   public static int field5425;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gha",
      name = "O",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5426;

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(IILcf;ILha;IIIIII)V"
   )
   public final void method2837(int arg0, int arg1, class628 arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var12 = client.field4564;

      try {
         ++field5413;
         if (class510.field7454.field11159.method1137(false) != 0 || class554.method4139(arg3, class359.field5371, (byte)112, arg7, arg6)) {
            if (~this.field5418 < ~arg9) {
               this.field5418 = arg9;
            }

            class670 var13 = class634.field9256.method2559(arg8, 0);
            if (class510.field7454.field11166.method5470(false) != 0 || !var13.field9832) {
               int var14;
               int var15;
               label792: {
                  if (~arg1 != -2 && ~arg1 != -4) {
                     var14 = var13.field9807;
                     var15 = var13.field9830;
                     if (!var12) {
                        break label792;
                     }
                  }

                  var14 = var13.field9830;
                  var15 = var13.field9807;
               }

               int var16;
               int var17;
               label786: {
                  if (super.field1890 >= arg6 + var15) {
                     var16 = arg6 - -(var15 - -1 >> 1);
                     var17 = (var15 >> 1) + arg6;
                     if (!var12) {
                        break label786;
                     }
                  }

                  var17 = arg6;
                  var16 = arg6 + 1;
               }

               int var18;
               int var19;
               label781: {
                  if (~(arg3 + var14) >= ~super.field1875) {
                     var18 = (var14 + 1 >> 1) + arg3;
                     var19 = (var14 >> 1) + arg3;
                     if (!var12) {
                        break label781;
                     }
                  }

                  var19 = arg3;
                  var18 = arg3 + 1;
               }

               class293 var20 = class269.field3810[arg7];
               int var21 = var20.method2289(var17, var19, (byte)118) + var20.method2289(var16, var19, (byte)123) + var20.method2289(var17, var18, (byte)113) - -var20.method2289(var16, var18, (byte)112) >> 2;
               int var22 = (arg6 << 9) - -(var15 << 8);
               if (arg10 > -75) {
                  method2839((byte)-105);
               }

               int var23 = (arg3 << 9) - -(var14 << 8);
               boolean var24 = class252.field3606 && !super.field1904 && var13.field9756;
               if (var13.method4898(11231)) {
                  class132.method1261(arg9, arg3, false, arg6, (class451)null, (class457)null, arg1, var13);
               }

               boolean var25 = ~arg0 == 0 && var13.field9816 == -1 && var13.field9792 == null && var13.field9805 == null && !var13.field9781 && !var13.field9813;
               if (!class223.field3328 || (!class514.method3889(arg5, -4) || var13.field9797 == 1) && (!class234.method1925(arg5, (byte)127) || ~var13.field9797 != -1)) {
                  if (arg5 == 22) {
                     if (class510.field7454.field11188.method3669(false) != 0 || ~var13.field9770 != -1 || var13.field9761 == 1 || var13.field9777) {
                        class417 var26;
                        label803: {
                           if (!var25) {
                              var26 = new class397(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg1, arg0);
                              if (!var12) {
                                 break label803;
                              }
                           }

                           class216 var27 = new class216(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg1, var24);
                           if (var27.method595((byte)-81)) {
                              var27.method584(arg4, true);
                           }

                           var26 = var27;
                        }

                        class163.method1485(arg9, arg6, arg3, var26);
                        if (var13.field9761 == 1 && arg2 != null) {
                           arg2.method4616(arg3, arg6, -61);
                        }

                     }
                  } else if (~arg5 != -11 && ~arg5 != -12) {
                     if (arg5 >= 12 && ~arg5 >= -18 || arg5 >= 18 && ~arg5 >= -22) {
                        class144 var35;
                        label523: {
                           if (var25) {
                              class682 var34 = new class682(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg6, arg6 + var15 + -1, arg3, arg3 - (-var14 - -1), arg5, arg1, var24);
                              if (var34.method595((byte)-81)) {
                                 var34.method584(arg4, true);
                              }

                              var35 = var34;
                              if (!var12) {
                                 break label523;
                              }
                           }

                           var35 = new class48(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg6, var15 - 1 + arg6, arg3, arg3 + var14 + -1, arg5, arg1, arg0);
                        }

                        class627.method4591(var35, false);
                        if (class252.field3606 && !super.field1904 && arg5 >= 12 && ~arg5 >= -18 && arg5 != 13 && ~arg9 < -1 && var13.field9797 != 0) {
                           super.field1884[arg9][arg6][arg3] = (byte)class93.method899(super.field1884[arg9][arg6][arg3], 4);
                        }

                        if (var13.field9761 != 0 && arg2 != null) {
                           arg2.method4608(arg3, arg6, var15, var14, 131072, var13.field9838, !var13.field9760);
                        }

                     } else if (~arg5 == -1) {
                        int var36 = var13.field9797;
                        if (class455.field6650 && var13.field9797 == -1) {
                           var36 = 1;
                        }

                        class496 var38;
                        label558: {
                           if (var25) {
                              class285 var37 = new class285(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1, var24);
                              var38 = var37;
                              if (!var37.method595((byte)-81)) {
                                 break label558;
                              }

                              var37.method584(arg4, true);
                              if (!var12) {
                                 break label558;
                              }
                           }

                           var38 = new class270(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1, arg0);
                        }

                        label808: {
                           class594.method4389(arg9, arg6, arg3, var38, (class496)null);
                           if (arg1 == 0) {
                              if (class252.field3606 && var13.field9753) {
                                 var20.method2280(arg6, arg3, 50);
                                 var20.method2280(arg6, arg3 - -1, 50);
                              }

                              if (~var36 != -2 || super.field1904) {
                                 break label808;
                              }

                              class70.method746(arg3, var13.field9835, var13.field9825, 1, arg6, arg9, 1);
                              if (!var12) {
                                 break label808;
                              }
                           }

                           if (~arg1 == -2) {
                              if (class252.field3606 && var13.field9753) {
                                 var20.method2280(arg6, arg3 + 1, 50);
                                 var20.method2280(arg6 + 1, arg3 + 1, 50);
                              }

                              if (var36 != 1 || super.field1904) {
                                 break label808;
                              }

                              class70.method746(arg3 + 1, var13.field9835, -var13.field9825, 2, arg6, arg9, 1);
                              if (!var12) {
                                 break label808;
                              }
                           }

                           if (arg1 == 2) {
                              if (class252.field3606 && var13.field9753) {
                                 var20.method2280(arg6 + 1, arg3, 50);
                                 var20.method2280(arg6 + 1, arg3 + 1, 50);
                              }

                              if (~var36 != -2 || super.field1904) {
                                 break label808;
                              }

                              class70.method746(arg3, var13.field9835, -var13.field9825, 1, arg6 + 1, arg9, 1);
                              if (!var12) {
                                 break label808;
                              }
                           }

                           if (arg1 == 3) {
                              if (class252.field3606 && var13.field9753) {
                                 var20.method2280(arg6, arg3, 50);
                                 var20.method2280(arg6 + 1, arg3, 50);
                              }

                              if (~var36 == -2 && !super.field1904) {
                                 class70.method746(arg3, var13.field9835, var13.field9825, 2, arg6, arg9, 1);
                              }
                           }
                        }

                        if (~var13.field9761 != -1 && arg2 != null) {
                           arg2.method4613(!var13.field9760, var13.field9838, arg5, arg1, arg6, (byte)-47, arg3);
                        }

                        if (var13.field9814 != 64) {
                           class682.method4976(arg9, arg6, arg3, var13.field9814);
                        }

                     } else if (~arg5 == -2) {
                        class496 var40;
                        label581: {
                           if (var25) {
                              class285 var39 = new class285(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1, var24);
                              if (var39.method595((byte)-81)) {
                                 var39.method584(arg4, true);
                              }

                              var40 = var39;
                              if (!var12) {
                                 break label581;
                              }
                           }

                           var40 = new class270(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1, arg0);
                        }

                        class594.method4389(arg9, arg6, arg3, var40, (class496)null);
                        if (var13.field9753 && class252.field3606) {
                           label573: {
                              if (arg1 != 0) {
                                 if (arg1 != 1) {
                                    if (~arg1 == -3) {
                                       var20.method2280(arg6 + 1, arg3, 50);
                                       if (!var12) {
                                          break label573;
                                       }
                                    }

                                    if (~arg1 != -4) {
                                       break label573;
                                    }

                                    var20.method2280(arg6, arg3, 50);
                                    if (!var12) {
                                       break label573;
                                    }
                                 }

                                 var20.method2280(arg6 + 1, arg3 - -1, 50);
                                 if (!var12) {
                                    break label573;
                                 }
                              }

                              var20.method2280(arg6, arg3 + 1, 50);
                           }
                        }

                        if (~var13.field9761 != -1 && arg2 != null) {
                           arg2.method4613(!var13.field9760, var13.field9838, arg5, arg1, arg6, (byte)-128, arg3);
                        }

                     } else if (~arg5 == -3) {
                        class496 var44;
                        class496 var45;
                        label611: {
                           int var41 = 3 & arg1 + 1;
                           if (var25) {
                              class285 var42 = new class285(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1 - -4, var24);
                              class285 var43 = new class285(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, var41, var24);
                              if (var42.method595((byte)-81)) {
                                 var42.method584(arg4, true);
                              }

                              if (var43.method595((byte)-81)) {
                                 var43.method584(arg4, true);
                              }

                              var44 = var42;
                              var45 = var43;
                              if (!var12) {
                                 break label611;
                              }
                           }

                           var44 = new class270(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1 - -4, arg0);
                           var45 = new class270(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, var41, arg0);
                        }

                        class594.method4389(arg9, arg6, arg3, var44, var45);
                        if ((var13.field9797 == 1 || class455.field6650 && var13.field9797 == -1) && !super.field1904) {
                           label596: {
                              if (~arg1 != -1) {
                                 if (~arg1 == -2) {
                                    class70.method746(arg3, var13.field9835, var13.field9825, 1, arg6 + 1, arg9, 1);
                                    class70.method746(arg3 - -1, var13.field9835, var13.field9825, 2, arg6, arg9, 1);
                                    if (!var12) {
                                       break label596;
                                    }
                                 }

                                 if (arg1 != 2) {
                                    if (arg1 != 3) {
                                       break label596;
                                    }

                                    class70.method746(arg3, var13.field9835, var13.field9825, 1, arg6, arg9, 1);
                                    class70.method746(arg3, var13.field9835, var13.field9825, 2, arg6, arg9, 1);
                                    if (!var12) {
                                       break label596;
                                    }
                                 }

                                 class70.method746(arg3, var13.field9835, var13.field9825, 1, arg6 + 1, arg9, 1);
                                 class70.method746(arg3, var13.field9835, var13.field9825, 2, arg6, arg9, 1);
                                 if (!var12) {
                                    break label596;
                                 }
                              }

                              class70.method746(arg3, var13.field9835, var13.field9825, 1, arg6, arg9, 1);
                              class70.method746(arg3 - -1, var13.field9835, var13.field9825, 2, arg6, arg9, 1);
                           }
                        }

                        if (var13.field9761 != 0 && arg2 != null) {
                           arg2.method4613(!var13.field9760, var13.field9838, arg5, arg1, arg6, (byte)-116, arg3);
                        }

                        if (var13.field9814 != 64) {
                           class682.method4976(arg9, arg6, arg3, var13.field9814);
                        }

                     } else if (~arg5 == -4) {
                        class496 var46;
                        label633: {
                           if (!var25) {
                              var46 = new class270(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1, arg0);
                              if (!var12) {
                                 break label633;
                              }
                           }

                           class285 var47 = new class285(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg5, arg1, var24);
                           var46 = var47;
                           if (var47.method595((byte)-81)) {
                              var47.method584(arg4, true);
                           }
                        }

                        class594.method4389(arg9, arg6, arg3, var46, (class496)null);
                        if (var13.field9753 && class252.field3606) {
                           label818: {
                              if (arg1 == 0) {
                                 var20.method2280(arg6, arg3 + 1, 50);
                                 if (!var12) {
                                    break label818;
                                 }
                              }

                              if (~arg1 == -2) {
                                 var20.method2280(arg6 + 1, arg3 - -1, 50);
                                 if (!var12) {
                                    break label818;
                                 }
                              }

                              if (arg1 == 2) {
                                 var20.method2280(arg6 + 1, arg3, 50);
                                 if (!var12) {
                                    break label818;
                                 }
                              }

                              if (~arg1 == -4) {
                                 var20.method2280(arg6, arg3, 50);
                              }
                           }
                        }

                        if (var13.field9761 != 0 && arg2 != null) {
                           arg2.method4613(!var13.field9760, var13.field9838, arg5, arg1, arg6, (byte)-45, arg3);
                        }

                     } else if (~arg5 == -10) {
                        class144 var49;
                        label650: {
                           if (var25) {
                              class682 var48 = new class682(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg6, arg6, arg3, arg3, arg5, arg1, var24);
                              var49 = var48;
                              if (!var48.method595((byte)-81)) {
                                 break label650;
                              }

                              var48.method584(arg4, true);
                              if (!var12) {
                                 break label650;
                              }
                           }

                           var49 = new class48(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg6, arg6 + var15 + -1, arg3, var14 + -1 + arg3, arg5, arg1, arg0);
                        }

                        class627.method4591(var49, false);
                        if (~var13.field9797 == -2 && !super.field1904) {
                           byte var50;
                           label640: {
                              if (~(1 & arg1) != -1) {
                                 var50 = 16;
                                 if (!var12) {
                                    break label640;
                                 }
                              }

                              var50 = 8;
                           }

                           class70.method746(arg3, var13.field9835, 0, var50, arg6, arg9, 1);
                        }

                        if (~var13.field9761 != -1 && arg2 != null) {
                           arg2.method4608(arg3, arg6, var15, var14, 131072, var13.field9838, !var13.field9760);
                        }

                        if (~var13.field9814 != -65) {
                           class682.method4976(arg9, arg6, arg3, var13.field9814);
                        }

                     } else if (arg5 == 4) {
                        class383 var51;
                        label820: {
                           if (!var25) {
                              var51 = new class566(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, 0, 0, arg5, arg1, arg0);
                              if (!var12) {
                                 break label820;
                              }
                           }

                           class193 var52 = new class193(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, 0, 0, arg5, arg1);
                           if (var52.method595((byte)-81)) {
                              var52.method584(arg4, true);
                           }

                           var51 = var52;
                        }

                        class301.method2347(arg9, arg6, arg3, var51, (class383)null);
                     } else if (~arg5 == -6) {
                        int var53 = 65;
                        class268 var54 = (class268)class245.method1990(arg9, arg6, arg3);
                        if (var54 != null) {
                           var53 = class634.field9256.method2559(var54.method591((byte)-123), 0).field9814 - -1;
                        }

                        class383 var55;
                        label822: {
                           if (!var25) {
                              var55 = new class566(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, class29.field448[arg1] * var53, class46.field1014[arg1] * var53, arg5, arg1, arg0);
                              if (!var12) {
                                 break label822;
                              }
                           }

                           class193 var56 = new class193(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, class29.field448[arg1] * var53, class46.field1014[arg1] * var53, arg5, arg1);
                           if (var56.method595((byte)-81)) {
                              var56.method584(arg4, true);
                           }

                           var55 = var56;
                        }

                        class301.method2347(arg9, arg6, arg3, var55, (class383)null);
                     } else if (~arg5 == -7) {
                        int var57 = 33;
                        class268 var58 = (class268)class245.method1990(arg9, arg6, arg3);
                        if (var58 != null) {
                           var57 = class634.field9256.method2559(var58.method591((byte)-65), 0).field9814 / 2 + 1;
                        }

                        class383 var59;
                        label824: {
                           if (!var25) {
                              var59 = new class566(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, class306.field4423[arg1] * var57, class596.field8591[arg1] * var57, arg5, arg1 - -4, arg0);
                              if (!var12) {
                                 break label824;
                              }
                           }

                           class193 var60 = new class193(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, class29.field448[arg1] * var57, class46.field1014[arg1] * var57, arg5, arg1 + 4);
                           if (var60.method595((byte)-81)) {
                              var60.method584(arg4, true);
                           }

                           var59 = var60;
                        }

                        class301.method2347(arg9, arg6, arg3, var59, (class383)null);
                     } else if (~arg5 == -8) {
                        class383 var62;
                        label825: {
                           int var61 = arg1 - -2 & 3;
                           if (!var25) {
                              var62 = new class566(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, 0, 0, arg5, var61 + 4, arg0);
                              if (!var12) {
                                 break label825;
                              }
                           }

                           class193 var63 = new class193(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, 0, 0, arg5, var61 + 4);
                           if (var63.method595((byte)-81)) {
                              var63.method584(arg4, true);
                           }

                           var62 = var63;
                        }

                        class301.method2347(arg9, arg6, arg3, var62, (class383)null);
                     } else if (~arg5 == -9) {
                        int var64 = arg1 + 2 & 3;
                        int var65 = 33;
                        class268 var66 = (class268)class245.method1990(arg9, arg6, arg3);
                        if (var66 != null) {
                           var65 = 1 + class634.field9256.method2559(var66.method591((byte)-101), 0).field9814 / 2;
                        }

                        class383 var69;
                        class383 var70;
                        label690: {
                           if (var25) {
                              class193 var67 = new class193(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, class306.field4423[arg1] * var65, class596.field8591[arg1] * var65, arg5, arg1 - -4);
                              class193 var68 = new class193(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, 0, 0, arg5, var64 - -4);
                              if (var67.method595((byte)-81)) {
                                 var67.method584(arg4, true);
                              }

                              var69 = var68;
                              var70 = var67;
                              if (!var68.method595((byte)-81)) {
                                 break label690;
                              }

                              var68.method584(arg4, true);
                              if (!var12) {
                                 break label690;
                              }
                           }

                           class566 var71 = new class566(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, class306.field4423[arg1] * var65, class596.field8591[arg1] * var65, arg5, arg1 + 4, arg0);
                           var70 = var71;
                           class566 var72 = new class566(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, 0, 0, arg5, var64 + 4, arg0);
                           var69 = var72;
                        }

                        class301.method2347(arg9, arg6, arg3, var70, var69);
                     }
                  } else {
                     class682 var28;
                     int var29;
                     class144 var30;
                     label748: {
                        var28 = null;
                        if (!var25) {
                           var29 = 15;
                           var30 = new class48(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg6, var15 + -1 + arg6, arg3, arg3 - -var14 + -1, arg5, arg1, arg0);
                           if (!var12) {
                              break label748;
                           }
                        }

                        class682 var31 = new class682(arg4, var13, arg9, arg7, var22, var21, var23, super.field1904, arg6, arg6 + var15 + -1, arg3, arg3 - (-var14 + 1), arg5, arg1, var24);
                        var30 = var31;
                        var28 = var31;
                        var29 = var31.method4977((byte)22);
                     }

                     if (class627.method4591(var30, false)) {
                        if (var28 != null && var28.method595((byte)-81)) {
                           var28.method584(arg4, true);
                        }

                        if (var13.field9753 && class252.field3606) {
                           if (~var29 < -31) {
                              var29 = 30;
                           }

                           int var32 = 0;
                           if (var12 || var32 <= var15) {
                              do {
                                 int var33 = 0;
                                 if (var12) {
                                    var20.method2280(arg6 + var32, arg3 - -var33, var29);
                                    ++var33;
                                 }

                                 while(true) {
                                    while(~var33 >= ~var14) {
                                       var20.method2280(arg6 + var32, arg3 - -var33, var29);
                                       ++var33;
                                    }

                                    if (!var12) {
                                       ++var32;
                                       break;
                                    }

                                    ++var33;
                                 }
                              } while(var32 <= var15);
                           }
                        }
                     }

                     if (var13.field9761 != 0 && arg2 != null) {
                        arg2.method4608(arg3, arg6, var15, var14, 131072, var13.field9838, !var13.field9760);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class608.method4462(var74, field5427[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5427[1] : field5427[2]) + ',' + arg3 + ',' + (arg4 != null ? field5427[1] : field5427[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2838(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gha",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2839(byte arg0) {
      try {
         if (arg0 == 88) {
            field5415 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5427[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(ILha;IIILcf;I)V"
   )
   public final void method2840(int arg0, class65 arg1, int arg2, int arg3, int arg4, class628 arg5, int arg6) {
      try {
         ++field5424;
         class268 var8 = this.method2845(arg3, arg6, arg4, arg2, false);
         if (arg0 == 3106) {
            if (var8 != null) {
               class670 var9 = class634.field9256.method2559(var8.method591((byte)-52), arg0 + -3106);
               int var10 = var8.method596(16202);
               int var11 = var8.method587(true);
               if (var9.method4898(arg0 + 8125)) {
                  class389.method3015(arg6, arg4, -52811575, var9, arg3);
               }

               if (var8.method595((byte)-81)) {
                  var8.method581(arg1, 120);
               }

               if (~arg2 != -1) {
                  if (arg2 != 1) {
                     if (arg2 == 2) {
                        class132.method1258(arg3, arg4, arg6, field5426 != null ? field5426 : (field5426 = method2849(field5427[5])));
                        if (~var9.field9761 != -1 && ~(var9.field9830 + arg4) > ~super.field1890 && var9.field9830 + arg6 < super.field1875 && ~(var9.field9807 + arg4) > ~super.field1890 && super.field1875 > arg6 - -var9.field9807) {
                           arg5.method4598(var9.field9830, false, arg4, var9.field9807, var9.field9838, !var9.field9760, var11, arg6);
                        }

                        if (var10 == 9) {
                           if ((var11 & 1) != 0) {
                              class1.method1(1, arg4, arg6, arg3, 16);
                              return;
                           }

                           class1.method1(1, arg4, arg6, arg3, 8);
                           return;
                        }

                        return;
                     }

                     if (~arg2 == -4) {
                        class208.method1772(arg3, arg4, arg6);
                        if (var9.field9761 == 1) {
                           arg5.method4603(false, arg4, arg6);
                           return;
                        }
                     }
                  } else {
                     class448.method3376(arg3, arg4, arg6);
                  }

                  return;
               }

               class763.method5521(arg3, arg4, arg6);
               if (~var9.field9761 != -1) {
                  arg5.method4605(-1, var10, var11, var9.field9838, arg4, arg6, !var9.field9760);
               }

               if (~var9.field9797 == -2) {
                  if (~var11 == -1) {
                     class1.method1(arg0 + -3105, arg4, arg6, arg3, 1);
                     return;
                  }

                  if (~var11 == -2) {
                     class1.method1(arg0 + -3105, arg4, arg6 + 1, arg3, 2);
                     return;
                  }

                  if (var11 != 2) {
                     if (~var11 == -4) {
                        class1.method1(1, arg4, arg6, arg3, 2);
                        return;
                     }
                  } else {
                     class1.method1(arg0 ^ 3107, arg4 - -1, arg6, arg3, 1);
                  }

                  return;
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field5427[4] + arg0 + ',' + (arg1 != null ? field5427[1] : field5427[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5427[1] : field5427[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(ILjava/lang/String;B)V"
   )
   public static final void method2841(int arg0, String arg1, byte arg2) {
      boolean var3 = client.field4564;

      try {
         ++field5414;
         int var4 = class158.field2525;
         int[] var5 = class442.field6446;
         boolean var6 = false;
         int var7 = 0;
         int var8 = -70 % ((arg2 - -21) / 35);
         if (var3 || ~var7 > ~var4) {
            do {
               class457 var9 = class458.field6723[var5[var7]];
               if (var9 != null && class304.field4398 != var9 && var9.field6665 != null && var9.field6665.equalsIgnoreCase(arg1)) {
                  var6 = true;
                  if (arg0 == 1) {
                     ++class188.field2835;
                     class542 var10 = class549.method4093((byte)-113, class318.field4595, class126.field2108);
                     var10.field7859.method3557(12879, 0);
                     var10.field7859.method3541(-23112, var5[var7]);
                     class740.method5332(var10, (byte)77);
                     if (!var3) {
                        break;
                     }
                  }

                  if (arg0 != 4) {
                     if (~arg0 != -6) {
                        if (~arg0 != -7) {
                           if (~arg0 != -8) {
                              if (~arg0 != -10) {
                                 break;
                              }

                              class542 var11 = class549.method4093((byte)-113, class458.field6718, class126.field2108);
                              var11.field7859.method3557(12879, 0);
                              var11.field7859.method3554(var5[var7], 255);
                              class740.method5332(var11, (byte)77);
                              if (!var3) {
                                 break;
                              }
                           }

                           ++class578.field8320;
                           class542 var12 = class549.method4093((byte)-113, class570.field8252, class126.field2108);
                           var12.field7859.method3555(var5[var7], (byte)-49);
                           var12.field7859.method3557(12879, 0);
                           class740.method5332(var12, (byte)77);
                           if (!var3) {
                              break;
                           }
                        }

                        ++class119.field1935;
                        class542 var13 = class549.method4093((byte)-113, class12.field134, class126.field2108);
                        var13.field7859.method3571(255, 0);
                        var13.field7859.method3555(var5[var7], (byte)113);
                        class740.method5332(var13, (byte)77);
                        if (!var3) {
                           break;
                        }
                     }

                     ++class358.field5352;
                     class542 var14 = class549.method4093((byte)-113, class531.field7743, class126.field2108);
                     var14.field7859.method3554(var5[var7], 255);
                     var14.field7859.method3571(255, 0);
                     class740.method5332(var14, (byte)77);
                     if (!var3) {
                        break;
                     }
                  }

                  ++class33.field496;
                  class542 var15 = class549.method4093((byte)-113, class790.field11552, class126.field2108);
                  var15.field7859.method3541(-23112, var5[var7]);
                  var15.field7859.method3557(12879, 0);
                  class740.method5332(var15, (byte)77);
                  if (!var3) {
                     break;
                  }
               }

               ++var7;
            } while(~var7 > ~var4);
         }

         if (!var6) {
            class126.method1228(class100.field1620.method961(class385.field5684, true) + arg1, (byte)123, 4);
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field5427[9] + arg0 + ',' + (arg1 != null ? field5427[1] : field5427[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(IIIIIIBLha;[B[Lcf;I)V"
   )
   public final void method2842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class65 arg7, byte[] arg8, class628[] arg9, int arg10) {
      boolean var12 = client.field4564;

      try {
         ++field5412;
         class473 var13 = new class473(arg8);
         if (arg6 != -58) {
            field5420 = -117;
         }

         int var14 = -1;

         label81:
         do {
            int var15 = var13.method3544(arg6 + 176);
            if (var15 == 0) {
               break;
            }

            int var10000 = var14;
            int var10001 = var15;

            while(true) {
               var14 = var10000 + var10001;
               int var16 = 0;

               while(true) {
                  int var17 = var13.method3586(122);
                  if (~var17 == -1) {
                     continue label81;
                  }

                  var16 += var17 + -1;
                  int var18 = 63 & var16;
                  int var19 = var16 >> 6 & 63;
                  int var20 = var16 >> 12;
                  int var21 = var13.method3564((byte)-56);
                  int var22 = var21 >> 2;
                  int var23 = var21 & 3;
                  if (arg3 == var20) {
                     var10000 = arg2;
                     var10001 = var19;
                     if (var12) {
                        break;
                     }

                     if (arg2 <= var19 && ~(arg2 + 8) < ~var19 && arg0 <= var18 && ~var18 > ~(arg0 - -8)) {
                        class670 var24 = class634.field9256.method2559(var14, 0);
                        int var25 = arg4 + class227.method1890(arg1, -1, var18 & 7, var24.field9830, 7 & var19, var23, var24.field9807);
                        int var26 = class573.method4248(var24.field9807, arg1, (byte)-79, var24.field9830, var18 & 7, var19 & 7, var23) + arg5;
                        if (~var25 < -1 && ~var26 < -1 && super.field1890 + -1 > var25 && var26 < super.field1875 + -1) {
                           class628 var27 = null;
                           if (!super.field1904) {
                              int var28 = arg10;
                              if (~(class608.field8732[1][var25][var26] & 2) == -3) {
                                 var28 = arg10 - 1;
                              }

                              if (~var28 <= -1) {
                                 var27 = arg9[var28];
                              }
                           }

                           this.method2837(-1, 3 & arg1 + var23, var27, var26, arg7, var22, var25, arg10, var14, arg10, arg6 + -60);
                           if (var12) {
                              continue label81;
                           }
                        }
                     }
                  }
               }
            }
         } while(!var12);

      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field5427[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field5427[1] : field5427[2]) + ',' + (arg8 != null ? field5427[1] : field5427[2]) + ',' + (arg9 != null ? field5427[1] : field5427[2]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(ILha;Z)V"
   )
   public final void method2843(int param1, class65 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(ILuda;ILha;III[IBII)V"
   )
   public final void method2844(int param1, class473 param2, int param3, class65 param4, int param5, int param6, int param7, int[] param8, byte param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(IIIIZ)Lpd;"
   )
   public final class268 method2845(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field5421;
         class268 var6 = null;
         if (arg3 == 0) {
            var6 = (class268)class245.method1990(arg0, arg2, arg1);
         }

         if (~arg3 == -2) {
            var6 = (class268)class615.method4514(arg0, arg2, arg1);
         }

         if (arg3 == 2) {
            var6 = (class268)class740.method5337(arg0, arg2, arg1, field5426 != null ? field5426 : (field5426 = method2849(field5427[5])));
         }

         if (arg4) {
            field5415 = null;
         }

         if (~arg3 == -4) {
            var6 = (class268)class439.method3309(arg0, arg2, arg1);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5427[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "<init>",
      descriptor = "(IIIZ)V"
   )
   public class363(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class201.field3017, class193.field2905);
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(IB[BLha;I[Lcf;)V"
   )
   public final void method2846(int arg0, byte arg1, byte[] arg2, class65 arg3, int arg4, class628[] arg5) {
      boolean var7 = client.field4564;

      try {
         if (arg1 != 92) {
            method2839((byte)-38);
         }

         ++field5417;
         class473 var8 = new class473(arg2);
         int var9 = -1;

         label71:
         do {
            int var10 = var8.method3544(110);
            int var10000 = ~var10;
            byte var10001 = -1;

            while(var10000 != var10001) {
               var9 += var10;
               int var11 = 0;

               while(true) {
                  int var12 = var8.method3586(124);
                  if (var12 == 0) {
                     continue label71;
                  }

                  var11 += var12 - 1;
                  int var13 = var11 & 63;
                  int var14 = var11 >> 6 & 63;
                  int var15 = var11 >> 12;
                  int var16 = var8.method3564((byte)-81);
                  int var17 = var16 >> 2;
                  int var18 = 3 & var16;
                  int var19 = var14 - -arg4;
                  int var20 = var13 - -arg0;
                  if (~var19 < -1) {
                     var10000 = ~var20;
                     var10001 = -1;
                     if (var7) {
                        break;
                     }

                     if (var10000 < -1 && var19 < super.field1890 + -1 && super.field1875 + -1 > var20) {
                        class628 var21 = null;
                        if (!super.field1904) {
                           int var22 = var15;
                           if ((2 & class608.field8732[1][var19][var20]) == 2) {
                              var22 = var15 - 1;
                           }

                           if (~var22 <= -1) {
                              var21 = arg5[var22];
                           }
                        }

                        this.method2837(-1, var18, var21, var20, arg3, var17, var19, var15, var9, var15, -122);
                        if (var7) {
                           continue label71;
                        }
                     }
                  }
               }
            }

            return;
         } while(!var7);

      } catch (RuntimeException var24) {
         throw class608.method4462(var24, field5427[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5427[1] : field5427[2]) + ',' + (arg3 != null ? field5427[1] : field5427[2]) + ',' + arg4 + ',' + (arg5 != null ? field5427[1] : field5427[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(BZI)V"
   )
   public static final void method2847(byte arg0, boolean arg1, int arg2) {
      try {
         if (arg0 != 34) {
            field5415 = null;
         }

         class170.method1533(-4, arg2, arg1, class100.field1611.method961(class385.field5684, true));
         ++field5422;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5427[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(ILha;I[IILuda;)V"
   )
   public final void method2848(int param1, class65 param2, int param3, int[] param4, int param5, class473 param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2849(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
