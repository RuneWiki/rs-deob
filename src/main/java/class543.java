import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class543 extends class115 {
   @OriginalMember(
      owner = "client!eh",
      name = "K",
      descriptor = "I"
   )
   public int field7655 = 99;
   @OriginalMember(
      owner = "client!eh",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7664 = new String[]{method4062(method4061("U\u007fgZ")), method4062(method4061("@$%\u0018s")), method4062(method4061("^b%t&")), method4062(method4061("^b%~&")), method4062(method4061("^b%p&")), method4062(method4061("^b%|&")), method4062(method4061("^b%{&")), method4062(method4061("^b%}&")), method4062(method4061("^b%q&")), method4062(method4061("Rk")), method4062(method4061("^b%u&")), method4062(method4061("^b%s&")), method4062(method4061("^b%w&")), method4062(method4061("^b%\u007f&")), method4062(method4061("^b%z&")), method4062(method4061("^b%r&"))};
   @OriginalMember(
      owner = "client!eh",
      name = "G",
      descriptor = "Ldi;"
   )
   public static class577 field7660 = new class577(9, 2);
   @OriginalMember(
      owner = "client!eh",
      name = "E",
      descriptor = "I"
   )
   public static int field7649;
   @OriginalMember(
      owner = "client!eh",
      name = "P",
      descriptor = "I"
   )
   public static int field7650;
   @OriginalMember(
      owner = "client!eh",
      name = "O",
      descriptor = "I"
   )
   public static int field7651;
   @OriginalMember(
      owner = "client!eh",
      name = "H",
      descriptor = "I"
   )
   public static int field7652;
   @OriginalMember(
      owner = "client!eh",
      name = "Q",
      descriptor = "I"
   )
   public static int field7653;
   @OriginalMember(
      owner = "client!eh",
      name = "C",
      descriptor = "I"
   )
   public static int field7654;
   @OriginalMember(
      owner = "client!eh",
      name = "L",
      descriptor = "I"
   )
   public static int field7656;
   @OriginalMember(
      owner = "client!eh",
      name = "M",
      descriptor = "I"
   )
   public static int field7657;
   @OriginalMember(
      owner = "client!eh",
      name = "J",
      descriptor = "I"
   )
   public static int field7658;
   @OriginalMember(
      owner = "client!eh",
      name = "D",
      descriptor = "I"
   )
   public static int field7659;
   @OriginalMember(
      owner = "client!eh",
      name = "I",
      descriptor = "I"
   )
   public static int field7661;
   @OriginalMember(
      owner = "client!eh",
      name = "F",
      descriptor = "I"
   )
   public static int field7662;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!eh",
      name = "N",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7663;

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "([Lbc;Lha;[BIII)V"
   )
   public final void method4047(class663[] arg0, class17 arg1, byte[] arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         if (arg5 >= 89) {
            ++field7654;
            class65 var8 = new class65(arg2);
            int var9 = -1;

            label71:
            do {
               int var10 = var8.method639(31305);
               int var10000 = ~var10;
               byte var10001 = -1;

               while(var10000 != var10001) {
                  var9 += var10;
                  int var11 = 0;

                  while(true) {
                     int var12 = var8.method682(-68);
                     if (~var12 == -1) {
                        continue label71;
                     }

                     var11 += var12 + -1;
                     int var13 = var11 & 63;
                     int var14 = var11 >> 6 & 63;
                     int var15 = var11 >> 12;
                     int var16 = var8.method665(false);
                     int var17 = var16 >> 2;
                     int var18 = 3 & var16;
                     int var19 = var14 - -arg3;
                     int var20 = var13 - -arg4;
                     if (~var19 < -1) {
                        var10000 = ~var20;
                        var10001 = -1;
                        if (var7) {
                           break;
                        }

                        if (var10000 < -1 && ~var19 > ~(super.field1833 + -1) && super.field1814 - 1 > var20) {
                           class663 var21 = null;
                           if (!super.field1832) {
                              int var22 = var15;
                              if ((class644.field9070[1][var19][var20] & 2) == 2) {
                                 var22 = var15 - 1;
                              }

                              if (~var22 <= -1) {
                                 var21 = arg0[var22];
                              }
                           }

                           this.method4048(var15, var21, var17, arg1, false, var18, var15, -1, var20, var19, var9);
                           if (var7) {
                              continue label71;
                           }
                        }
                     }
                  }
               }

               return;
            } while(!var7);

         }
      } catch (RuntimeException var24) {
         throw class612.method4503(var24, field7664[4] + (arg0 != null ? field7664[1] : field7664[0]) + ',' + (arg1 != null ? field7664[1] : field7664[0]) + ',' + (arg2 != null ? field7664[1] : field7664[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(ILbc;ILha;ZIIIIII)V"
   )
   public final void method4048(int arg0, class663 arg1, int arg2, class17 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var12 = client.field10022;

      try {
         ++field7658;
         if (class476.field6870.field9133.method2232(-93) != 0 || class392.method3042(0, class697.field10057, arg6, arg9, arg8)) {
            if (this.field7655 > arg0) {
               this.field7655 = arg0;
            }

            class544 var13 = class549.field7834.method3850(3917, arg10);
            if (class476.field6870.field9138.method2740(-74) != 0 || !var13.field7738) {
               int var14;
               int var15;
               label853: {
                  if (arg5 == 1 || ~arg5 == -4) {
                     var14 = var13.field7755;
                     var15 = var13.field7687;
                     if (!var12) {
                        break label853;
                     }
                  }

                  var14 = var13.field7687;
                  var15 = var13.field7755;
               }

               int var16;
               int var17;
               label779: {
                  if (~(arg9 + var15) >= ~super.field1833) {
                     var16 = (var15 + 1 >> 1) + arg9;
                     var17 = (var15 >> 1) + arg9;
                     if (!var12) {
                        break label779;
                     }
                  }

                  var17 = arg9;
                  var16 = arg9 + 1;
               }

               int var18;
               int var19;
               label774: {
                  if (arg8 + var14 > super.field1814) {
                     var18 = arg8;
                     var19 = arg8 + 1;
                     if (!var12) {
                        break label774;
                     }
                  }

                  var18 = arg8 - -(var14 >> 1);
                  var19 = (var14 + 1 >> 1) + arg8;
               }

               class751 var20 = class225.field3197[arg6];
               if (arg4) {
                  method4051((byte)110);
               }

               int var21 = var20.method5400(-1, var18, var17) + var20.method5400(-1, var18, var16) + var20.method5400(-1, var19, var17) + var20.method5400(-1, var19, var16) >> 2;
               int var22 = (arg9 << 9) - -(var15 << 8);
               int var23 = (arg8 << 9) - -(var14 << 8);
               boolean var24 = class801.field11658 && !super.field1832 && var13.field7737;
               if (var13.method4065((byte)-99)) {
                  class449.method3479(73, arg8, (class799)null, arg5, arg0, (class158)null, var13, arg9);
               }

               boolean var25 = arg7 == -1 && !var13.method4071(true) && var13.field7741 == null && !var13.field7718 && !var13.field7727;
               if (!class78.field1246 || (!class240.method2104(512, arg2) || var13.field7733 == 1) && (!class278.method2339(arg2, (byte)126) || var13.field7733 != 0)) {
                  if (arg2 == 22) {
                     if (~class476.field6870.field9151.method847(-75) != -1 || var13.field7716 != 0 || var13.field7731 == 1 || var13.field7703) {
                        class349 var27;
                        label514: {
                           if (var25) {
                              class330 var26 = new class330(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg5, var24);
                              var27 = var26;
                              if (!var26.method721((byte)112)) {
                                 break label514;
                              }

                              var26.method727(arg3, -26496);
                              if (!var12) {
                                 break label514;
                              }
                           }

                           var27 = new class155(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg5, arg7);
                        }

                        class586.method4302(arg0, arg9, arg8, var27);
                        if (var13.field7731 == 1 && arg1 != null) {
                           arg1.method4811(arg8, (byte)-43, arg9);
                        }

                     }
                  } else if (arg2 != 10 && arg2 != 11) {
                     if (~arg2 <= -13 && ~arg2 >= -18 || ~arg2 <= -19 && arg2 <= 21) {
                        class578 var34;
                        label801: {
                           if (!var25) {
                              var34 = new class69(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg9, var15 + -1 + arg9, arg8, arg8 - -var14 - 1, arg2, arg5, arg7);
                              if (!var12) {
                                 break label801;
                              }
                           }

                           class589 var35 = new class589(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg9, var15 + -1 + arg9, arg8, arg8 + var14 + -1, arg2, arg5, var24);
                           if (var35.method721((byte)126)) {
                              var35.method727(arg3, -26496);
                           }

                           var34 = var35;
                        }

                        class575.method4259(var34, false);
                        if (class801.field11658 && !super.field1832 && arg2 >= 12 && ~arg2 >= -18 && ~arg2 != -14 && ~arg0 < -1 && ~var13.field7733 != -1) {
                           super.field1820[arg0][arg9][arg8] = (byte)class91.method932(super.field1820[arg0][arg9][arg8], 4);
                        }

                        if (var13.field7731 != 0 && arg1 != null) {
                           arg1.method4823(var13.field7720, arg8, arg9, false, var15, !var13.field7670, var14);
                        }

                     } else if (~arg2 == -1) {
                        int var36 = var13.field7733;
                        if (class144.field2290 && ~var13.field7733 == 0) {
                           var36 = 1;
                        }

                        class565 var38;
                        label555: {
                           if (var25) {
                              class431 var37 = new class431(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5, var24);
                              if (var37.method721((byte)108)) {
                                 var37.method727(arg3, -26496);
                              }

                              var38 = var37;
                              if (!var12) {
                                 break label555;
                              }
                           }

                           var38 = new class501(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5, arg7);
                        }

                        label803: {
                           class337.method2695(arg0, arg9, arg8, var38, (class565)null);
                           if (arg5 != 0) {
                              if (arg5 != 1) {
                                 if (~arg5 != -3) {
                                    if (~arg5 != -4) {
                                       break label803;
                                    }

                                    if (class801.field11658 && var13.field7750) {
                                       var20.method48(arg9, arg8, 50);
                                       var20.method48(arg9 + 1, arg8, 50);
                                    }

                                    if (~var36 != -2 || super.field1832) {
                                       break label803;
                                    }

                                    class172.method1595(94, arg8, var13.field7672, var13.field7692, arg9, 2, arg0);
                                    if (!var12) {
                                       break label803;
                                    }
                                 }

                                 if (class801.field11658 && var13.field7750) {
                                    var20.method48(arg9 + 1, arg8, 50);
                                    var20.method48(arg9 - -1, arg8 + 1, 50);
                                 }

                                 if (var36 != 1 || super.field1832) {
                                    break label803;
                                 }

                                 class172.method1595(17, arg8, var13.field7672, -var13.field7692, arg9 + 1, 1, arg0);
                                 if (!var12) {
                                    break label803;
                                 }
                              }

                              if (class801.field11658 && var13.field7750) {
                                 var20.method48(arg9, arg8 + 1, 50);
                                 var20.method48(arg9 - -1, arg8 - -1, 50);
                              }

                              if (var36 != 1 || super.field1832) {
                                 break label803;
                              }

                              class172.method1595(13, arg8 + 1, var13.field7672, -var13.field7692, arg9, 2, arg0);
                              if (!var12) {
                                 break label803;
                              }
                           }

                           if (class801.field11658 && var13.field7750) {
                              var20.method48(arg9, arg8, 50);
                              var20.method48(arg9, arg8 + 1, 50);
                           }

                           if (~var36 == -2 && !super.field1832) {
                              class172.method1595(-107, arg8, var13.field7672, var13.field7692, arg9, 1, arg0);
                           }
                        }

                        if (var13.field7731 != 0 && arg1 != null) {
                           arg1.method4816((byte)98, var13.field7720, arg2, arg8, arg5, arg9, !var13.field7670);
                        }

                        if (var13.field7723 != 64) {
                           class663.method4815(arg0, arg9, arg8, var13.field7723);
                        }

                     } else if (~arg2 == -2) {
                        class565 var39;
                        label577: {
                           if (!var25) {
                              var39 = new class501(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5, arg7);
                              if (!var12) {
                                 break label577;
                              }
                           }

                           class431 var40 = new class431(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5, var24);
                           var39 = var40;
                           if (var40.method721((byte)103)) {
                              var40.method727(arg3, -26496);
                           }
                        }

                        class337.method2695(arg0, arg9, arg8, var39, (class565)null);
                        if (var13.field7750 && class801.field11658) {
                           label570: {
                              if (~arg5 != -1) {
                                 if (arg5 != 1) {
                                    if (arg5 != 2) {
                                       if (arg5 != 3) {
                                          break label570;
                                       }

                                       var20.method48(arg9, arg8, 50);
                                       if (!var12) {
                                          break label570;
                                       }
                                    }

                                    var20.method48(arg9 + 1, arg8, 50);
                                    if (!var12) {
                                       break label570;
                                    }
                                 }

                                 var20.method48(arg9 + 1, arg8 + 1, 50);
                                 if (!var12) {
                                    break label570;
                                 }
                              }

                              var20.method48(arg9, arg8 + 1, 50);
                           }
                        }

                        if (var13.field7731 != 0 && arg1 != null) {
                           arg1.method4816((byte)84, var13.field7720, arg2, arg8, arg5, arg9, !var13.field7670);
                        }

                     } else if (arg2 == 2) {
                        class565 var42;
                        class565 var43;
                        label809: {
                           int var41 = arg5 + 1 & 3;
                           if (!var25) {
                              var42 = new class501(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5 - -4, arg7);
                              var43 = new class501(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, var41, arg7);
                              if (!var12) {
                                 break label809;
                              }
                           }

                           class431 var44 = new class431(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5 + 4, var24);
                           class431 var45 = new class431(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, var41, var24);
                           if (var44.method721((byte)86)) {
                              var44.method727(arg3, -26496);
                           }

                           var43 = var45;
                           if (var45.method721((byte)100)) {
                              var45.method727(arg3, -26496);
                           }

                           var42 = var44;
                        }

                        class337.method2695(arg0, arg9, arg8, var42, var43);
                        if ((var13.field7733 == 1 || class144.field2290 && ~var13.field7733 == 0) && !super.field1832) {
                           label592: {
                              if (arg5 != 0) {
                                 if (~arg5 == -2) {
                                    class172.method1595(-117, arg8, var13.field7672, var13.field7692, arg9 - -1, 1, arg0);
                                    class172.method1595(92, arg8 + 1, var13.field7672, var13.field7692, arg9, 2, arg0);
                                    if (!var12) {
                                       break label592;
                                    }
                                 }

                                 if (~arg5 == -3) {
                                    class172.method1595(85, arg8, var13.field7672, var13.field7692, arg9 + 1, 1, arg0);
                                    class172.method1595(-119, arg8, var13.field7672, var13.field7692, arg9, 2, arg0);
                                    if (!var12) {
                                       break label592;
                                    }
                                 }

                                 if (arg5 != 3) {
                                    break label592;
                                 }

                                 class172.method1595(81, arg8, var13.field7672, var13.field7692, arg9, 1, arg0);
                                 class172.method1595(-128, arg8, var13.field7672, var13.field7692, arg9, 2, arg0);
                                 if (!var12) {
                                    break label592;
                                 }
                              }

                              class172.method1595(-121, arg8, var13.field7672, var13.field7692, arg9, 1, arg0);
                              class172.method1595(97, arg8 + 1, var13.field7672, var13.field7692, arg9, 2, arg0);
                           }
                        }

                        if (var13.field7731 != 0 && arg1 != null) {
                           arg1.method4816((byte)124, var13.field7720, arg2, arg8, arg5, arg9, !var13.field7670);
                        }

                        if (~var13.field7723 != -65) {
                           class663.method4815(arg0, arg9, arg8, var13.field7723);
                        }

                     } else if (arg2 == 3) {
                        class565 var46;
                        label812: {
                           if (!var25) {
                              var46 = new class501(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5, arg7);
                              if (!var12) {
                                 break label812;
                              }
                           }

                           class431 var47 = new class431(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg2, arg5, var24);
                           if (var47.method721((byte)84)) {
                              var47.method727(arg3, -26496);
                           }

                           var46 = var47;
                        }

                        class337.method2695(arg0, arg9, arg8, var46, (class565)null);
                        if (var13.field7750 && class801.field11658) {
                           label813: {
                              if (arg5 == 0) {
                                 var20.method48(arg9, arg8 - -1, 50);
                                 if (!var12) {
                                    break label813;
                                 }
                              }

                              if (arg5 == 1) {
                                 var20.method48(arg9 + 1, arg8 - -1, 50);
                                 if (!var12) {
                                    break label813;
                                 }
                              }

                              if (~arg5 != -3) {
                                 if (arg5 != 3) {
                                    break label813;
                                 }

                                 var20.method48(arg9, arg8, 50);
                                 if (!var12) {
                                    break label813;
                                 }
                              }

                              var20.method48(arg9 - -1, arg8, 50);
                           }
                        }

                        if (var13.field7731 != 0 && arg1 != null) {
                           arg1.method4816((byte)71, var13.field7720, arg2, arg8, arg5, arg9, !var13.field7670);
                        }

                     } else if (arg2 == 9) {
                        class578 var49;
                        label645: {
                           if (var25) {
                              class589 var48 = new class589(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg9, arg9, arg8, arg8, arg2, arg5, var24);
                              var49 = var48;
                              if (!var48.method721((byte)108)) {
                                 break label645;
                              }

                              var48.method727(arg3, -26496);
                              if (!var12) {
                                 break label645;
                              }
                           }

                           var49 = new class69(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg9, arg9 + -1 + var15, arg8, var14 + -1 + arg8, arg2, arg5, arg7);
                        }

                        class575.method4259(var49, false);
                        if (~var13.field7733 == -2 && !super.field1832) {
                           byte var50;
                           label635: {
                              if ((1 & arg5) != 0) {
                                 var50 = 16;
                                 if (!var12) {
                                    break label635;
                                 }
                              }

                              var50 = 8;
                           }

                           class172.method1595(-101, arg8, var13.field7672, 0, arg9, var50, arg0);
                        }

                        if (~var13.field7731 != -1 && arg1 != null) {
                           arg1.method4823(var13.field7720, arg8, arg9, false, var15, !var13.field7670, var14);
                        }

                        if (~var13.field7723 != -65) {
                           class663.method4815(arg0, arg9, arg8, var13.field7723);
                        }

                     } else if (~arg2 == -5) {
                        class566 var51;
                        label652: {
                           if (!var25) {
                              var51 = new class737(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, 0, 0, arg2, arg5, arg7);
                              if (!var12) {
                                 break label652;
                              }
                           }

                           class169 var52 = new class169(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, 0, 0, arg2, arg5);
                           var51 = var52;
                           if (var52.method721((byte)84)) {
                              var52.method727(arg3, -26496);
                           }
                        }

                        class617.method4534(arg0, arg9, arg8, var51, (class566)null);
                     } else if (~arg2 == -6) {
                        int var53 = 65;
                        class338 var54 = (class338)class421.method3284(arg0, arg9, arg8);
                        if (var54 != null) {
                           var53 = class549.field7834.method3850(3917, var54.method724(23976)).field7723 - -1;
                        }

                        class566 var55;
                        label659: {
                           if (!var25) {
                              var55 = new class737(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, class155.field2360[arg5] * var53, class790.field11510[arg5] * var53, arg2, arg5, arg7);
                              if (!var12) {
                                 break label659;
                              }
                           }

                           class169 var56 = new class169(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, class155.field2360[arg5] * var53, class790.field11510[arg5] * var53, arg2, arg5);
                           var55 = var56;
                           if (var56.method721((byte)126)) {
                              var56.method727(arg3, -26496);
                           }
                        }

                        class617.method4534(arg0, arg9, arg8, var55, (class566)null);
                     } else if (~arg2 == -7) {
                        int var57 = 33;
                        class338 var58 = (class338)class421.method3284(arg0, arg9, arg8);
                        if (var58 != null) {
                           var57 = 1 + class549.field7834.method3850(3917, var58.method724(23976)).field7723 / 2;
                        }

                        class566 var59;
                        label817: {
                           if (!var25) {
                              var59 = new class737(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, class346.field5092[arg5] * var57, class283.field4264[arg5] * var57, arg2, arg5 + 4, arg7);
                              if (!var12) {
                                 break label817;
                              }
                           }

                           class169 var60 = new class169(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, class155.field2360[arg5] * var57, class790.field11510[arg5] * var57, arg2, arg5 - -4);
                           if (var60.method721((byte)116)) {
                              var60.method727(arg3, -26496);
                           }

                           var59 = var60;
                        }

                        class617.method4534(arg0, arg9, arg8, var59, (class566)null);
                     } else if (arg2 == 7) {
                        class566 var63;
                        label677: {
                           int var61 = arg5 + 2 & 3;
                           if (var25) {
                              class169 var62 = new class169(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, 0, 0, arg2, var61 + 4);
                              var63 = var62;
                              if (!var62.method721((byte)113)) {
                                 break label677;
                              }

                              var62.method727(arg3, -26496);
                              if (!var12) {
                                 break label677;
                              }
                           }

                           var63 = new class737(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, 0, 0, arg2, var61 - -4, arg7);
                        }

                        class617.method4534(arg0, arg9, arg8, var63, (class566)null);
                     } else if (~arg2 == -9) {
                        int var64 = 3 & arg5 - -2;
                        int var65 = 33;
                        class338 var66 = (class338)class421.method3284(arg0, arg9, arg8);
                        if (var66 != null) {
                           var65 = class549.field7834.method3850(3917, var66.method724(23976)).field7723 / 2 + 1;
                        }

                        class566 var68;
                        class566 var70;
                        label819: {
                           if (!var25) {
                              class737 var67 = new class737(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, class346.field5092[arg5] * var65, class283.field4264[arg5] * var65, arg2, arg5 + 4, arg7);
                              var68 = var67;
                              class737 var69 = new class737(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, 0, 0, arg2, var64 + 4, arg7);
                              var70 = var69;
                              if (!var12) {
                                 break label819;
                              }
                           }

                           class169 var71 = new class169(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, class346.field5092[arg5] * var65, class283.field4264[arg5] * var65, arg2, arg5 + 4);
                           class169 var72 = new class169(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, 0, 0, arg2, var64 + 4);
                           if (var71.method721((byte)89)) {
                              var71.method727(arg3, -26496);
                           }

                           var68 = var71;
                           if (var72.method721((byte)92)) {
                              var72.method727(arg3, -26496);
                           }

                           var70 = var72;
                        }

                        class617.method4534(arg0, arg9, arg8, var68, var70);
                     }
                  } else {
                     class589 var28;
                     int var29;
                     class578 var30;
                     label742: {
                        var28 = null;
                        if (!var25) {
                           var29 = 15;
                           var30 = new class69(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg9, var15 + -1 + arg9, arg8, arg8 + var14 + -1, arg2, arg5, arg7);
                           if (!var12) {
                              break label742;
                           }
                        }

                        class589 var31 = new class589(arg3, var13, arg0, arg6, var22, var21, var23, super.field1832, arg9, arg9 + var15 + -1, arg8, arg8 + -1 + var14, arg2, arg5, var24);
                        var30 = var31;
                        var29 = var31.method4321(11312);
                        var28 = var31;
                     }

                     if (class575.method4259(var30, false)) {
                        if (var28 != null && var28.method721((byte)94)) {
                           var28.method727(arg3, -26496);
                        }

                        if (var13.field7750 && class801.field11658) {
                           if (~var29 < -31) {
                              var29 = 30;
                           }

                           int var32 = 0;
                           if (var12 || ~var15 <= ~var32) {
                              do {
                                 int var33 = 0;
                                 if (var12) {
                                    var20.method48(arg9 + var32, arg8 + var33, var29);
                                    ++var33;
                                 }

                                 while(true) {
                                    while(~var14 <= ~var33) {
                                       var20.method48(arg9 + var32, arg8 + var33, var29);
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

                     if (var13.field7731 != 0 && arg1 != null) {
                        arg1.method4823(var13.field7720, arg8, arg9, arg4, var15, !var13.field7670, var14);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class612.method4503(var74, field7664[11] + arg0 + ',' + (arg1 != null ? field7664[1] : field7664[0]) + ',' + arg2 + ',' + (arg3 != null ? field7664[1] : field7664[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4049(int arg0) {
      try {
         field7660 = null;
         if (arg0 != 24562) {
            method4053((byte)43, 11);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7664[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method4050(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field7657;
         class17 var2 = class54.field794;
         boolean var3 = false;
         if (class476.field6870.field9109.method4676(-85) != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class243.method2121(-73, 0, var4, 0, (class39)null, (class672)null);
            var3 = true;
         }

         if (arg0 <= 112) {
            return 117;
         } else {
            long var5 = class604.method4452(-126);
            int var7 = 0;
            if (var1) {
               var2.method162(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
               ++var7;
            }

            while(true) {
               while(~var7 > -10001) {
                  var2.method162(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
                  ++var7;
               }

               int var8 = (int)(-var5 + class604.method4452(-3));
               var2.method223(0, 100, 1, 0, -16777216, 100);
               if (!var1) {
                  if (var3) {
                     var2.method181(true);
                  }

                  return var8;
               }

               ++var7;
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7664[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4051(byte arg0) {
      try {
         class767.field11012.method3096(arg0 ^ -93);
         ++field7650;
         if (arg0 != 42) {
            field7660 = null;
         }

         class410.field6010.method3096(-114);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7664[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "<init>",
      descriptor = "(IIIZ)V"
   )
   public class543(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class9.field160, class142.field2263);
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Lcu;IILha;I)V"
   )
   public final void method4052(class65 param1, int param2, int param3, class17 param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4053(byte arg0, int arg1) {
      try {
         int var2 = 8 / ((61 - arg0) / 58);
         ++field7652;
         class111 var3 = class796.method5734(3, (long)arg1, (byte)-125);
         var3.method1083(-24);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7664[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(IIB)B"
   )
   public static final byte method4054(int arg0, int arg1, byte arg2) {
      try {
         ++field7651;
         if (arg2 >= -126) {
            method4050(-89);
         }

         if (~arg1 != -10) {
            return 0;
         } else {
            return (byte)(~(arg0 & 1) != -1 ? 2 : 1);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7664[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(IBIILha;[Lbc;I[BIII)V"
   )
   public final void method4055(int arg0, byte arg1, int arg2, int arg3, class17 arg4, class663[] arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
      boolean var12 = client.field10022;

      try {
         ++field7649;
         if (arg1 != -122) {
            field7660 = null;
         }

         class65 var13 = new class65(arg7);
         int var14 = -1;

         label81:
         do {
            int var15 = var13.method639(31305);
            int var10000 = ~var15;
            int var10001 = -1;

            while(var10000 != var10001) {
               var14 += var15;
               int var16 = 0;

               while(true) {
                  int var17 = var13.method682(-91);
                  if (~var17 == -1) {
                     continue label81;
                  }

                  var16 += var17 - 1;
                  int var18 = 63 & var16;
                  int var19 = var16 >> 6 & 63;
                  int var20 = var16 >> 12;
                  int var21 = var13.method665(false);
                  int var22 = var21 >> 2;
                  int var23 = 3 & var21;
                  if (arg0 == var20) {
                     var10000 = ~var19;
                     var10001 = ~arg6;
                     if (var12) {
                        break;
                     }

                     if (var10000 <= var10001 && ~(arg6 + 8) < ~var19 && ~var18 <= ~arg8 && arg8 + 8 > var18) {
                        class544 var24 = class549.field7834.method3850(3917, var14);
                        int var25 = class80.method859(var24.field7755, var23, var24.field7687, var18 & 7, 7 & var19, arg10, (byte)-6) + arg3;
                        int var26 = arg2 - -class468.method3591(7 & var19, arg1 ^ -122, var23, var24.field7687, var18 & 7, var24.field7755, arg10);
                        if (~var25 < -1 && ~var26 < -1 && ~(super.field1833 + -1) < ~var25 && var26 < super.field1814 - 1) {
                           class663 var27 = null;
                           if (!super.field1832) {
                              int var28 = arg9;
                              if ((2 & class644.field9070[1][var25][var26]) == 2) {
                                 var28 = arg9 - 1;
                              }

                              if (var28 >= 0) {
                                 var27 = arg5[var28];
                              }
                           }

                           this.method4048(arg9, var27, var22, arg4, false, arg10 + var23 & 3, arg9, -1, var26, var25, var14);
                           if (var12) {
                              continue label81;
                           }
                        }
                     }
                  }
               }
            }

            return;
         } while(!var12);

      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field7664[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7664[1] : field7664[0]) + ',' + (arg5 != null ? field7664[1] : field7664[0]) + ',' + arg6 + ',' + (arg7 != null ? field7664[1] : field7664[0]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(IIIIILcu;Lha;III)V"
   )
   public final void method4056(int param1, int param2, int param3, int param4, int param5, class65 param6, class17 param7, int param8, int param9, int param10) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(IIIILbc;Lha;I)V"
   )
   public final void method4057(int arg0, int arg1, int arg2, int arg3, class663 arg4, class17 arg5, int arg6) {
      try {
         if (arg2 != -2562) {
            field7660 = null;
         }

         ++field7661;
         class338 var8 = this.method4058(arg6, arg0, (byte)100, arg1, arg3);
         if (var8 != null) {
            class544 var9 = class549.field7834.method3850(3917, var8.method724(23976));
            int var10 = var8.method733(28344);
            int var11 = var8.method734(arg2 + -3161);
            if (var9.method4065((byte)-95)) {
               class231.method2057(arg1, (byte)103, arg0, arg6, var9);
            }

            if (var8.method721((byte)85)) {
               var8.method736(arg2 ^ 17965, arg5);
            }

            if (arg3 != 0) {
               if (arg3 != 1) {
                  if (~arg3 != -3) {
                     if (arg3 == 3) {
                        class326.method2616(arg6, arg0, arg1);
                        if (~var9.field7731 == -2) {
                           arg4.method4819((byte)-25, arg1, arg0);
                           return;
                        }
                     }

                     return;
                  }

                  class263.method2255(arg6, arg0, arg1, field7663 != null ? field7663 : (field7663 = method4060(field7664[9])));
                  if (var9.field7731 != 0 && super.field1833 > var9.field7755 + arg0 && ~(var9.field7755 + arg1) > ~super.field1814 && var9.field7687 + arg0 < super.field1833 && super.field1814 > arg1 - -var9.field7687) {
                     arg4.method4821(var9.field7720, !var9.field7670, var11, arg1, arg0, var9.field7755, var9.field7687, (byte)38);
                  }

                  if (var10 == 9) {
                     if (~(var11 & 1) == -1) {
                        class326.method2617(arg6, 8, 20675, arg0, arg1);
                        return;
                     }

                     class326.method2617(arg6, 16, 20675, arg0, arg1);
                     return;
                  }
               } else {
                  class583.method4286(arg6, arg0, arg1);
               }

               return;
            }

            class266.method2274(arg6, arg0, arg1);
            if (var9.field7731 != 0) {
               arg4.method4818(var9.field7720, !var9.field7670, var10, arg0, var11, -29417, arg1);
            }

            if (~var9.field7733 == -2) {
               if (var11 == 0) {
                  class326.method2617(arg6, 1, 20675, arg0, arg1);
                  return;
               }

               if (var11 == 1) {
                  class326.method2617(arg6, 2, arg2 + 23237, arg0, arg1 + 1);
                  return;
               }

               if (~var11 == -3) {
                  class326.method2617(arg6, 1, 20675, arg0 + 1, arg1);
                  return;
               }

               if (var11 == 3) {
                  class326.method2617(arg6, 2, arg2 + 23237, arg0, arg1);
                  return;
               }
            }
         }

      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7664[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7664[1] : field7664[0]) + ',' + (arg5 != null ? field7664[1] : field7664[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(IIBII)Lia;"
   )
   public final class338 method4058(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         if (arg2 != 100) {
            method4054(-23, -42, (byte)-122);
         }

         ++field7662;
         class338 var6 = null;
         if (arg4 == 0) {
            var6 = (class338)class421.method3284(arg0, arg1, arg3);
         }

         if (~arg4 == -2) {
            var6 = (class338)class336.method2692(arg0, arg1, arg3);
         }

         if (arg4 == 2) {
            var6 = (class338)class331.method2653(arg0, arg1, arg3, field7663 != null ? field7663 : (field7663 = method4060(field7664[9])));
         }

         if (~arg4 == -4) {
            var6 = (class338)class495.method3755(arg0, arg1, arg3);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7664[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(ZILha;)V"
   )
   public final void method4059(boolean param1, int param2, class17 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4060(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4061(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4062(char[] arg0) {
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
            var10005 = 10;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
