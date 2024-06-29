import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class253 extends class667 {
   @OriginalMember(
      owner = "client!rga",
      name = "N",
      descriptor = "I"
   )
   public int field3446 = 99;
   @OriginalMember(
      owner = "client!rga",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3457 = new String[]{method1943(method1942("\u001adJ?V")), method1943(method1942("\u000f?\b}")), method1943(method1942("\u0013-\u0005?}I")), method1943(method1942("\u0013-\u0005?zI")), method1943(method1942("\u0013-\u0005?h b")), method1943(method1942("\u0013-\u0005?j b")), method1943(method1942("\u0013-\u0005?i b")), method1943(method1942("\u0013-\u0005?xI")), method1943(method1942("\u000f,")), method1943(method1942("\u0013-\u0005?yI")), method1943(method1942("\u0013-\u0005?\u007fI")), method1943(method1942("\u0013-\u0005?{I")), method1943(method1942("\u0013-\u0005?|I")), method1943(method1942("\u0013-\u0005?~I"))};
   @OriginalMember(
      owner = "client!rga",
      name = "P",
      descriptor = "I"
   )
   public static int field3441;
   @OriginalMember(
      owner = "client!rga",
      name = "K",
      descriptor = "I"
   )
   public static int field3442;
   @OriginalMember(
      owner = "client!rga",
      name = "H",
      descriptor = "I"
   )
   public static int field3443;
   @OriginalMember(
      owner = "client!rga",
      name = "Q",
      descriptor = "I"
   )
   public static int field3444;
   @OriginalMember(
      owner = "client!rga",
      name = "I",
      descriptor = "I"
   )
   public static int field3445;
   @OriginalMember(
      owner = "client!rga",
      name = "O",
      descriptor = "I"
   )
   public static int field3447;
   @OriginalMember(
      owner = "client!rga",
      name = "J",
      descriptor = "I"
   )
   public static int field3448;
   @OriginalMember(
      owner = "client!rga",
      name = "T",
      descriptor = "I"
   )
   public static int field3449;
   @OriginalMember(
      owner = "client!rga",
      name = "G",
      descriptor = "I"
   )
   public static int field3450;
   @OriginalMember(
      owner = "client!rga",
      name = "R",
      descriptor = "I"
   )
   public static int field3451;
   @OriginalMember(
      owner = "client!rga",
      name = "M",
      descriptor = "I"
   )
   public static int field3453;
   @OriginalMember(
      owner = "client!rga",
      name = "F",
      descriptor = "I"
   )
   public static int field3454;
   @OriginalMember(
      owner = "client!rga",
      name = "S",
      descriptor = "I"
   )
   public static int field3455;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!rga",
      name = "E",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3456;
   @OriginalMember(
      owner = "client!rga",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field3452;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1941(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "([BLha;I[Luo;II)V",
      line = 4
   )
   public final void method1930(byte[] arg0, class66 arg1, int arg2, class603[] arg3, int arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         ++field3444;
         class147 var8 = new class147(arg0);
         if (arg4 != 0) {
            this.method1939(-55, (class66)null, (byte)-19, 82, (int[])null, (class147)null);
         }

         int var9 = -1;

         label71:
         do {
            int var10 = var8.method1144((byte)-91);
            int var10000 = var10;

            while(var10000 != 0) {
               var9 += var10;
               int var11 = 0;

               while(true) {
                  int var12 = var8.method1145((byte)82);
                  if (~var12 == -1) {
                     continue label71;
                  }

                  var11 += var12 + -1;
                  int var13 = 63 & var11;
                  int var14 = (4037 & var11) >> 6;
                  int var15 = var11 >> 12;
                  int var16 = var8.method1143(arg4 ^ -15465);
                  int var17 = var16 >> 2;
                  int var18 = 3 & var16;
                  int var19 = arg2 + var14;
                  int var20 = arg5 + var13;
                  if (~var19 < -1) {
                     var10000 = var20;
                     if (var7) {
                        break;
                     }

                     if (var20 > 0 && super.field9698 + -1 > var19 && var20 < super.field9688 - 1) {
                        class603 var21 = null;
                        if (!super.field9691) {
                           int var22 = var15;
                           if (~(class613.field9016[1][var19][var20] & 2) == -3) {
                              var22 = var15 - 1;
                           }

                           if (var22 >= 0) {
                              var21 = arg3[var22];
                           }
                        }

                        this.method1931(var20, var9, var17, -1, var15, arg1, (byte)104, var15, var21, var19, var18);
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
         throw class237.method1823(var24, field3457[6] + (arg0 != null ? field3457[0] : field3457[1]) + ',' + (arg1 != null ? field3457[0] : field3457[1]) + ',' + arg2 + ',' + (arg3 != null ? field3457[0] : field3457[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(IIIIILha;BILuo;II)V",
      line = 80
   )
   public final void method1931(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, byte arg6, int arg7, class603 arg8, int arg9, int arg10) {
      boolean var12 = client.field4360;

      try {
         ++field3443;
         if (~class300.field4107.field6412.method1017(86) != -1 || class572.method4091(arg7, arg9, class169.field2359, arg0, arg6 + -199)) {
            if (arg4 < this.field3446) {
               this.field3446 = arg4;
            }

            class259 var13 = class387.field5618.method3977(arg1, (byte)75);
            if (class300.field4107.field6434.method1454(-31) != 0 || !var13.field3557) {
               int var14;
               int var15;
               label787: {
                  if (~arg10 != -2 && ~arg10 != -4) {
                     var14 = var13.field3583;
                     var15 = var13.field3595;
                     if (!var12) {
                        break label787;
                     }
                  }

                  var14 = var13.field3595;
                  var15 = var13.field3583;
               }

               int var16;
               int var17;
               label781: {
                  if (arg9 + var15 <= super.field9698) {
                     var16 = arg9 - -(var15 >> 1);
                     var17 = (var15 + 1 >> 1) + arg9;
                     if (!var12) {
                        break label781;
                     }
                  }

                  var16 = arg9;
                  var17 = arg9 + 1;
               }

               int var18;
               int var19;
               label776: {
                  if (arg0 - -var14 > super.field9688) {
                     var18 = arg0 + 1;
                     var19 = arg0;
                     if (!var12) {
                        break label776;
                     }
                  }

                  var19 = (var14 >> 1) + arg0;
                  var18 = (var14 + 1 >> 1) + arg0;
               }

               class295 var20 = class731.field10698[arg7];
               int var21 = var20.method2219(true, var16, var19) + var20.method2219(true, var17, var19) + var20.method2219(true, var16, var18) + var20.method2219(true, var17, var18) >> 2;
               int var22 = (arg9 << 9) + (var15 << 8);
               int var23 = (arg0 << 9) + (var14 << 8);
               boolean var24 = class783.field11475 && !super.field9691 && var13.field3590;
               if (var13.method1977(-77)) {
                  class695.method5062((class121)null, var13, arg4, arg0, arg9, (class506)null, 256, arg10);
               }

               boolean var25 = arg3 == -1 && var13.field3607 == -1 && var13.field3565 == null && var13.field3539 == null && !var13.field3562 && !var13.field3512;
               if (!class596.field8762 || (!class705.method5130((byte)51, arg2) || var13.field3596 == 1) && (!class689.method5029(arg2, (byte)-94) || var13.field3596 != 0)) {
                  if (arg2 == 22) {
                     if (class300.field4107.field6448.method4664(-21) != 0 || var13.field3587 != 0 || var13.field3553 == 1 || var13.field3545) {
                        class226 var27;
                        label516: {
                           if (var25) {
                              class616 var26 = new class616(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg10, var24);
                              var27 = var26;
                              if (!var26.method247(-6091)) {
                                 break label516;
                              }

                              var26.method240(-85, arg5);
                              if (!var12) {
                                 break label516;
                              }
                           }

                           var27 = new class238(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg10, arg3);
                        }

                        class483.method3503(arg4, arg9, arg0, var27);
                        if (var13.field3553 == 1 && arg8 != null) {
                           arg8.method4394(arg9, arg0, (byte)119);
                        }

                     }
                  } else if (~arg2 != -11 && arg2 != 11) {
                     if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && ~arg2 >= -22) {
                        class627 var34;
                        label801: {
                           if (!var25) {
                              var34 = new class288(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg9, arg9 + -1 + var15, arg0, arg0 + -1 - -var14, arg2, arg10, arg3);
                              if (!var12) {
                                 break label801;
                              }
                           }

                           class25 var35 = new class25(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg9, var15 + -1 + arg9, arg0, arg0 + var14 + -1, arg2, arg10, var24);
                           if (var35.method247(-6091)) {
                              var35.method240(arg6 + -136, arg5);
                           }

                           var34 = var35;
                        }

                        class430.method3180(var34, false);
                        if (class783.field11475 && !super.field9691 && ~arg2 <= -13 && ~arg2 >= -18 && ~arg2 != -14 && ~arg4 < -1 && ~var13.field3596 != -1) {
                           super.field9703[arg4][arg9][arg0] = (byte)class300.method2238(super.field9703[arg4][arg9][arg0], 4);
                        }

                        if (~var13.field3553 != -1 && arg8 != null) {
                           arg8.method4386(1073741824, arg9, arg0, var14, var15, var13.field3537, !var13.field3523);
                        }

                     } else if (arg2 == 0) {
                        int var36 = var13.field3596;
                        if (class33.field474 && ~var13.field3596 == 0) {
                           var36 = 1;
                        }

                        class688 var38;
                        label559: {
                           if (var25) {
                              class176 var37 = new class176(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10, var24);
                              var38 = var37;
                              if (!var37.method247(-6091)) {
                                 break label559;
                              }

                              var37.method240(-30, arg5);
                              if (!var12) {
                                 break label559;
                              }
                           }

                           var38 = new class617(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10, arg3);
                        }

                        label803: {
                           class768.method5555(arg4, arg9, arg0, var38, (class688)null);
                           if (arg10 == 0) {
                              if (class783.field11475 && var13.field3510) {
                                 var20.method1613(arg9, arg0, 50);
                                 var20.method1613(arg9, arg0 - -1, 50);
                              }

                              if (var36 != 1 || super.field9691) {
                                 break label803;
                              }

                              class322.method2385(arg4, 255, arg9, 1, arg0, var13.field3582, var13.field3521);
                              if (!var12) {
                                 break label803;
                              }
                           }

                           if (arg10 != 1) {
                              if (arg10 != 2) {
                                 if (~arg10 != -4) {
                                    break label803;
                                 }

                                 if (class783.field11475 && var13.field3510) {
                                    var20.method1613(arg9, arg0, 50);
                                    var20.method1613(arg9 + 1, arg0, 50);
                                 }

                                 if (~var36 != -2 || super.field9691) {
                                    break label803;
                                 }

                                 class322.method2385(arg4, 255, arg9, 2, arg0, var13.field3582, var13.field3521);
                                 if (!var12) {
                                    break label803;
                                 }
                              }

                              if (class783.field11475 && var13.field3510) {
                                 var20.method1613(arg9 + 1, arg0, 50);
                                 var20.method1613(arg9 + 1, arg0 - -1, 50);
                              }

                              if (~var36 != -2 || super.field9691) {
                                 break label803;
                              }

                              class322.method2385(arg4, 255, arg9 - -1, 1, arg0, -var13.field3582, var13.field3521);
                              if (!var12) {
                                 break label803;
                              }
                           }

                           if (class783.field11475 && var13.field3510) {
                              var20.method1613(arg9, arg0 + 1, 50);
                              var20.method1613(arg9 + 1, arg0 - -1, 50);
                           }

                           if (~var36 == -2 && !super.field9691) {
                              class322.method2385(arg4, 255, arg9, 2, arg0 - -1, -var13.field3582, var13.field3521);
                           }
                        }

                        if (~var13.field3553 != -1 && arg8 != null) {
                           arg8.method4383(arg9, var13.field3537, arg2, arg6 + -49, !var13.field3523, arg0, arg10);
                        }

                        if (~var13.field3576 != -65) {
                           class254.method1945(arg4, arg9, arg0, var13.field3576);
                        }

                     } else if (~arg2 == -2) {
                        class688 var40;
                        label582: {
                           if (var25) {
                              class176 var39 = new class176(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10, var24);
                              if (var39.method247(-6091)) {
                                 var39.method240(arg6 ^ -49, arg5);
                              }

                              var40 = var39;
                              if (!var12) {
                                 break label582;
                              }
                           }

                           var40 = new class617(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10, arg3);
                        }

                        class768.method5555(arg4, arg9, arg0, var40, (class688)null);
                        if (var13.field3510 && class783.field11475) {
                           label574: {
                              if (~arg10 != -1) {
                                 if (~arg10 == -2) {
                                    var20.method1613(arg9 + 1, arg0 + 1, 50);
                                    if (!var12) {
                                       break label574;
                                    }
                                 }

                                 if (arg10 == 2) {
                                    var20.method1613(arg9 + 1, arg0, 50);
                                    if (!var12) {
                                       break label574;
                                    }
                                 }

                                 if (arg10 != 3) {
                                    break label574;
                                 }

                                 var20.method1613(arg9, arg0, 50);
                                 if (!var12) {
                                    break label574;
                                 }
                              }

                              var20.method1613(arg9, arg0 + 1, 50);
                           }
                        }

                        if (var13.field3553 != 0 && arg8 != null) {
                           arg8.method4383(arg9, var13.field3537, arg2, 24, !var13.field3523, arg0, arg10);
                        }

                     } else if (arg2 == 2) {
                        class688 var42;
                        class688 var43;
                        label810: {
                           int var41 = arg10 + 1 & 3;
                           if (!var25) {
                              var42 = new class617(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10 + 4, arg3);
                              var43 = new class617(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, var41, arg3);
                              if (!var12) {
                                 break label810;
                              }
                           }

                           class176 var44 = new class176(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10 + 4, var24);
                           class176 var45 = new class176(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, var41, var24);
                           if (var44.method247(-6091)) {
                              var44.method240(arg6 + -231, arg5);
                           }

                           if (var45.method247(arg6 + -6195)) {
                              var45.method240(-72, arg5);
                           }

                           var43 = var45;
                           var42 = var44;
                        }

                        class768.method5555(arg4, arg9, arg0, var42, var43);
                        if ((~var13.field3596 == -2 || class33.field474 && ~var13.field3596 == 0) && !super.field9691) {
                           label811: {
                              if (arg10 == 0) {
                                 class322.method2385(arg4, 255, arg9, 1, arg0, var13.field3582, var13.field3521);
                                 class322.method2385(arg4, 255, arg9, 2, arg0 + 1, var13.field3582, var13.field3521);
                                 if (!var12) {
                                    break label811;
                                 }
                              }

                              if (~arg10 == -2) {
                                 class322.method2385(arg4, 255, arg9 + 1, 1, arg0, var13.field3582, var13.field3521);
                                 class322.method2385(arg4, 255, arg9, 2, arg0 - -1, var13.field3582, var13.field3521);
                                 if (!var12) {
                                    break label811;
                                 }
                              }

                              if (~arg10 == -3) {
                                 class322.method2385(arg4, arg6 ^ 151, arg9 - -1, 1, arg0, var13.field3582, var13.field3521);
                                 class322.method2385(arg4, 255, arg9, 2, arg0, var13.field3582, var13.field3521);
                                 if (!var12) {
                                    break label811;
                                 }
                              }

                              if (~arg10 == -4) {
                                 class322.method2385(arg4, 255, arg9, 1, arg0, var13.field3582, var13.field3521);
                                 class322.method2385(arg4, 255, arg9, 2, arg0, var13.field3582, var13.field3521);
                              }
                           }
                        }

                        if (var13.field3553 != 0 && arg8 != null) {
                           arg8.method4383(arg9, var13.field3537, arg2, -127, !var13.field3523, arg0, arg10);
                        }

                        if (var13.field3576 != 64) {
                           class254.method1945(arg4, arg9, arg0, var13.field3576);
                        }

                     } else if (arg2 == 3) {
                        class688 var46;
                        label813: {
                           if (!var25) {
                              var46 = new class617(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10, arg3);
                              if (!var12) {
                                 break label813;
                              }
                           }

                           class176 var47 = new class176(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg2, arg10, var24);
                           if (var47.method247(arg6 ^ -6051)) {
                              var47.method240(-109, arg5);
                           }

                           var46 = var47;
                        }

                        class768.method5555(arg4, arg9, arg0, var46, (class688)null);
                        if (var13.field3510 && class783.field11475) {
                           label624: {
                              if (~arg10 != -1) {
                                 if (arg10 == 1) {
                                    var20.method1613(arg9 + 1, arg0 + 1, 50);
                                    if (!var12) {
                                       break label624;
                                    }
                                 }

                                 if (~arg10 != -3) {
                                    if (arg10 != 3) {
                                       break label624;
                                    }

                                    var20.method1613(arg9, arg0, 50);
                                    if (!var12) {
                                       break label624;
                                    }
                                 }

                                 var20.method1613(arg9 + 1, arg0, 50);
                                 if (!var12) {
                                    break label624;
                                 }
                              }

                              var20.method1613(arg9, arg0 + 1, 50);
                           }
                        }

                        if (~var13.field3553 != -1 && arg8 != null) {
                           arg8.method4383(arg9, var13.field3537, arg2, -124, !var13.field3523, arg0, arg10);
                        }

                     } else if (~arg2 == -10) {
                        class627 var48;
                        label646: {
                           if (!var25) {
                              var48 = new class288(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg9, arg9 + var15 + -1, arg0, arg0 + -1 - -var14, arg2, arg10, arg3);
                              if (!var12) {
                                 break label646;
                              }
                           }

                           class25 var49 = new class25(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg9, arg9, arg0, arg0, arg2, arg10, var24);
                           var48 = var49;
                           if (var49.method247(-6091)) {
                              var49.method240(-39, arg5);
                           }
                        }

                        class430.method3180(var48, false);
                        if (var13.field3596 == 1 && !super.field9691) {
                           byte var50;
                           label638: {
                              if (~(1 & arg10) != -1) {
                                 var50 = 16;
                                 if (!var12) {
                                    break label638;
                                 }
                              }

                              var50 = 8;
                           }

                           class322.method2385(arg4, arg6 + 151, arg9, var50, arg0, 0, var13.field3521);
                        }

                        if (~var13.field3553 != -1 && arg8 != null) {
                           arg8.method4386(1073741824, arg9, arg0, var14, var15, var13.field3537, !var13.field3523);
                        }

                        if (var13.field3576 != 64) {
                           class254.method1945(arg4, arg9, arg0, var13.field3576);
                        }

                     } else if (arg2 == 4) {
                        class300 var51;
                        label653: {
                           if (!var25) {
                              var51 = new class609(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, 0, 0, arg2, arg10, arg3);
                              if (!var12) {
                                 break label653;
                              }
                           }

                           class539 var52 = new class539(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, 0, 0, arg2, arg10);
                           var51 = var52;
                           if (var52.method247(-6091)) {
                              var52.method240(-46, arg5);
                           }
                        }

                        class256.method1959(arg4, arg9, arg0, var51, (class300)null);
                     } else if (arg2 == 5) {
                        int var53 = 65;
                        class604 var54 = (class604)class45.method381(arg4, arg9, arg0);
                        if (var54 != null) {
                           var53 = 1 + class387.field5618.method3977(var54.method236(28154), (byte)75).field3576;
                        }

                        class300 var56;
                        label662: {
                           if (var25) {
                              class539 var55 = new class539(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, class618.field9108[arg10] * var53, class685.field10092[arg10] * var53, arg2, arg10);
                              var56 = var55;
                              if (!var55.method247(-6091)) {
                                 break label662;
                              }

                              var55.method240(-48, arg5);
                              if (!var12) {
                                 break label662;
                              }
                           }

                           var56 = new class609(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, class618.field9108[arg10] * var53, class685.field10092[arg10] * var53, arg2, arg10, arg3);
                        }

                        class256.method1959(arg4, arg9, arg0, var56, (class300)null);
                     } else {
                        if (arg6 != 104) {
                           this.method1934(false, (class66)null, (byte)-97);
                        }

                        if (~arg2 == -7) {
                           int var57 = 33;
                           class604 var58 = (class604)class45.method381(arg4, arg9, arg0);
                           if (var58 != null) {
                              var57 = 1 + class387.field5618.method3977(var58.method236(arg6 + 28050), (byte)75).field3576 / 2;
                           }

                           class300 var59;
                           label818: {
                              if (!var25) {
                                 var59 = new class609(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, class375.field5421[arg10] * var57, class101.field1296[arg10] * var57, arg2, arg10 - -4, arg3);
                                 if (!var12) {
                                    break label818;
                                 }
                              }

                              class539 var60 = new class539(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, class618.field9108[arg10] * var57, class685.field10092[arg10] * var57, arg2, arg10 + 4);
                              if (var60.method247(-6091)) {
                                 var60.method240(-56, arg5);
                              }

                              var59 = var60;
                           }

                           class256.method1959(arg4, arg9, arg0, var59, (class300)null);
                        } else if (~arg2 == -8) {
                           class300 var63;
                           label677: {
                              int var61 = arg10 + 2 & 3;
                              if (var25) {
                                 class539 var62 = new class539(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, 0, 0, arg2, var61 - -4);
                                 if (var62.method247(-6091)) {
                                    var62.method240(arg6 + -227, arg5);
                                 }

                                 var63 = var62;
                                 if (!var12) {
                                    break label677;
                                 }
                              }

                              var63 = new class609(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, 0, 0, arg2, var61 + 4, arg3);
                           }

                           class256.method1959(arg4, arg9, arg0, var63, (class300)null);
                        } else if (arg2 == 8) {
                           int var64 = 3 & arg10 + 2;
                           int var65 = 33;
                           class604 var66 = (class604)class45.method381(arg4, arg9, arg0);
                           if (var66 != null) {
                              var65 = class387.field5618.method3977(var66.method236(28154), (byte)75).field3576 / 2 - -1;
                           }

                           class300 var69;
                           class300 var70;
                           label687: {
                              if (var25) {
                                 class539 var67 = new class539(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, class375.field5421[arg10] * var65, class101.field1296[arg10] * var65, arg2, arg10 + 4);
                                 class539 var68 = new class539(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, 0, 0, arg2, var64 + 4);
                                 if (var67.method247(-6091)) {
                                    var67.method240(arg6 + -213, arg5);
                                 }

                                 var69 = var68;
                                 var70 = var67;
                                 if (!var68.method247(-6091)) {
                                    break label687;
                                 }

                                 var68.method240(arg6 ^ -21, arg5);
                                 if (!var12) {
                                    break label687;
                                 }
                              }

                              class609 var71 = new class609(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, class375.field5421[arg10] * var65, class101.field1296[arg10] * var65, arg2, arg10 + 4, arg3);
                              class609 var72 = new class609(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, 0, 0, arg2, var64 + 4, arg3);
                              var70 = var71;
                              var69 = var72;
                           }

                           class256.method1959(arg4, arg9, arg0, var70, var69);
                        }
                     }
                  } else {
                     class25 var28 = null;
                     int var30;
                     class627 var31;
                     if (var25) {
                        class25 var29 = new class25(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg9, arg9 - (-var15 + 1), arg0, arg0 + var14 + -1, arg2, arg10, var24);
                        var30 = var29.method235(arg6 ^ 108);
                        var28 = var29;
                        var31 = var29;
                     } else {
                        var31 = new class288(arg5, var13, arg4, arg7, var22, var21, var23, super.field9691, arg9, arg9 - -var15 + -1, arg0, arg0 + var14 + -1, arg2, arg10, arg3);
                        var30 = 15;
                     }

                     if (class430.method3180(var31, false)) {
                        if (var28 != null && var28.method247(-6091)) {
                           var28.method240(-66, arg5);
                        }

                        if (var13.field3510 && class783.field11475) {
                           if (var30 > 30) {
                              var30 = 30;
                           }

                           int var32 = 0;
                           if (var12 || ~var15 <= ~var32) {
                              do {
                                 int var33 = 0;
                                 if (var12) {
                                    var20.method1613(arg9 - -var32, arg0 + var33, var30);
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var14 >= var33) {
                                       var20.method1613(arg9 - -var32, arg0 + var33, var30);
                                       ++var33;
                                    }

                                    if (!var12) {
                                       ++var32;
                                       break;
                                    }

                                    ++var33;
                                 }
                              } while(~var15 <= ~var32);
                           }
                        }
                     }

                     if (~var13.field3553 != -1 && arg8 != null) {
                        arg8.method4386(1073741824, arg9, arg0, var14, var15, var13.field3537, !var13.field3523);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class237.method1823(var74, field3457[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3457[0] : field3457[1]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field3457[0] : field3457[1]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(IIIII)Lnf;",
      line = 707
   )
   public final class604 method1932(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3442;
         class604 var6 = null;
         if (arg2 == 0) {
            var6 = (class604)class45.method381(arg0, arg1, arg4);
         }

         if (arg2 == 1) {
            var6 = (class604)class500.method3630(arg0, arg1, arg4);
         }

         if (~arg2 == -3) {
            var6 = (class604)class691.method5042(arg0, arg1, arg4, field3456 != null ? field3456 : (field3456 = method1941(field3457[8])));
         }

         if (arg3 > -15) {
            field3450 = -60;
         }

         if (arg2 == 3) {
            var6 = (class604)class216.method1708(arg0, arg1, arg4);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3457[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(ZLha;)V",
      line = 732
   )
   public static final void method1933(boolean arg0, class66 arg1) {
      try {
         ++field3445;
         class215.field3075 = class553.method3969(true, arg1, class660.field9616, 80);
         if (arg0) {
            field3450 = 55;
         }

         class705.field10283 = class264.method2020(arg1, class660.field9616, (byte)124);
         class427.field6124 = class553.method3969(true, arg1, class351.field4726, 63);
         class347.field4690 = class264.method2020(arg1, class351.field4726, (byte)-63);
         class455.field6465 = class553.method3969(true, arg1, class709.field10357, 89);
         class467.field6723 = class264.method2020(arg1, class709.field10357, (byte)-80);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3457[12] + arg0 + ',' + (arg1 != null ? field3457[0] : field3457[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(ZLha;B)V",
      line = 748
   )
   public final void method1934(boolean param1, class66 param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(B)V",
      line = 887
   )
   public static final void method1935(byte arg0) {
      try {
         ++field3454;
         if (arg0 > 71) {
            class624.method4536(-115);
            class274.field3758 = null;
            class342.field4643 = null;
            class153.field2163 = null;
            class310.field4258 = null;
            class749.field11082 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3457[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(IIIIILha;III[Luo;[B)V",
      line = 907
   )
   public final void method1936(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6, int arg7, int arg8, class603[] arg9, byte[] arg10) {
      boolean var12 = client.field4360;

      try {
         ++field3451;
         if (arg1 != 1) {
            this.field3446 = 61;
         }

         class147 var13 = new class147(arg10);
         int var14 = -1;

         label81:
         do {
            int var15 = var13.method1144((byte)-121);
            if (var15 == 0) {
               break;
            }

            int var10000 = var14;
            int var10001 = var15;

            while(true) {
               var14 = var10000 + var10001;
               int var16 = 0;

               while(true) {
                  int var17 = var13.method1145((byte)115);
                  if (var17 == 0) {
                     continue label81;
                  }

                  var16 += var17 + -1;
                  int var18 = var16 & 63;
                  int var19 = 63 & var16 >> 6;
                  int var20 = var16 >> 12;
                  int var21 = var13.method1143(-15465);
                  int var22 = var21 >> 2;
                  int var23 = var21 & 3;
                  if (arg4 == var20) {
                     var10000 = var19;
                     var10001 = arg3;
                     if (var12) {
                        break;
                     }

                     if (var19 >= arg3 && ~var19 > ~(arg3 + 8) && var18 >= arg0 && ~var18 > ~(arg0 + 8)) {
                        class259 var24 = class387.field5618.method3977(var14, (byte)75);
                        int var25 = class73.method667(arg1 + -29914, var19 & 7, var24.field3583, var18 & 7, var23, arg2, var24.field3595) + arg8;
                        int var26 = arg6 - -class405.method3051(var24.field3583, var23, var24.field3595, var19 & 7, arg2, var18 & 7, 0);
                        if (~var25 < -1 && ~var26 < -1 && ~(super.field9698 - 1) < ~var25 && var26 < super.field9688 + -1) {
                           class603 var27 = null;
                           if (!super.field9691) {
                              int var28 = arg7;
                              if ((2 & class613.field9016[1][var25][var26]) == 2) {
                                 var28 = arg7 - 1;
                              }

                              if (var28 >= 0) {
                                 var27 = arg9[var28];
                              }
                           }

                           this.method1931(var26, var14, var22, -1, arg7, arg5, (byte)104, arg7, var27, var25, arg2 + var23 & 3);
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
         throw class237.method1823(var30, field3457[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3457[0] : field3457[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field3457[0] : field3457[1]) + ',' + (arg10 != null ? field3457[0] : field3457[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(IZI)Z",
      line = 989
   )
   public static final boolean method1937(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            method1933(false, (class66)null);
         }

         ++field3455;
         return (arg0 & 458752) != 0 | class108.method879(arg0, 106, arg2) || class652.method4779(arg0, arg2, (byte)-100);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3457[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Lha;ILuo;ZIII)V",
      line = 1000
   )
   public final void method1938(class66 arg0, int arg1, class603 arg2, boolean arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field3441;
         class604 var9 = this.method1932(arg1, arg5, arg6, -34, arg4);
         if (var9 != null) {
            label147: {
               class259 var10 = class387.field5618.method3977(var9.method236(28154), (byte)75);
               int var11 = var9.method237(-73);
               int var12 = var9.method252((byte)6);
               if (var10.method1977(-92)) {
                  class469.method3402((byte)126, arg1, arg4, arg5, var10);
               }

               if (var9.method247(-6091)) {
                  var9.method249(-109, arg0);
               }

               if (~arg6 != -1) {
                  if (~arg6 != -2) {
                     if (arg6 != 2) {
                        if (arg6 != 3) {
                           break label147;
                        }

                        class216.method1707(arg1, arg5, arg4);
                        if (~var10.field3553 != -2) {
                           break label147;
                        }

                        arg2.method4395(arg4, arg5, (byte)77);
                        if (!var8) {
                           break label147;
                        }
                     }

                     class77.method702(arg1, arg5, arg4, field3456 != null ? field3456 : (field3456 = method1941(field3457[8])));
                     if (~var10.field3553 != -1 && ~super.field9698 < ~(arg5 - -var10.field3595) && ~(var10.field3595 + arg4) > ~super.field9688 && var10.field3583 + arg5 < super.field9698 && super.field9688 > var10.field3583 + arg4) {
                        arg2.method4391(arg4, 8, !var10.field3523, var10.field3583, var10.field3595, var10.field3537, var12, arg5);
                     }

                     if (var11 != 9) {
                        break label147;
                     }

                     if (~(var12 & 1) == -1) {
                        class709.method5156(arg5, 8, 16, arg4, arg1);
                        if (!var8) {
                           break label147;
                        }
                     }

                     class709.method5156(arg5, 16, 16, arg4, arg1);
                     if (!var8) {
                        break label147;
                     }
                  }

                  class731.method5324(arg1, arg5, arg4);
                  if (!var8) {
                     break label147;
                  }
               }

               class446.method3275(arg1, arg5, arg4);
               if (~var10.field3553 != -1) {
                  arg2.method4393(var12, 84, var11, !var10.field3523, arg4, arg5, var10.field3537);
               }

               if (~var10.field3596 == -2) {
                  label116: {
                     if (~var12 != -1) {
                        if (~var12 == -2) {
                           class709.method5156(arg5, 2, 16, arg4 + 1, arg1);
                           if (!var8) {
                              break label116;
                           }
                        }

                        if (var12 == 2) {
                           class709.method5156(arg5 + 1, 1, 16, arg4, arg1);
                           if (!var8) {
                              break label116;
                           }
                        }

                        if (~var12 != -4) {
                           break label116;
                        }

                        class709.method5156(arg5, 2, 16, arg4, arg1);
                        if (!var8) {
                           break label116;
                        }
                     }

                     class709.method5156(arg5, 1, 16, arg4, arg1);
                  }
               }
            }
         }

         if (!arg3) {
            this.method1939(-26, (class66)null, (byte)-75, 43, (int[])null, (class147)null);
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field3457[13] + (arg0 != null ? field3457[0] : field3457[1]) + ',' + arg1 + ',' + (arg2 != null ? field3457[0] : field3457[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "<init>",
      descriptor = "(IIIZ)V",
      line = 1102
   )
   public class253(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class266.field3701, class375.field5415);
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(ILha;BI[ILwf;)V",
      line = 1107
   )
   public final void method1939(int param1, class66 param2, byte param3, int param4, int[] param5, class147 param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(III[ILwf;Lha;IIIII)V",
      line = 1477
   )
   public final void method1940(int param1, int param2, int param3, int[] param4, class147 param5, class66 param6, int param7, int param8, int param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1942(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1943(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
