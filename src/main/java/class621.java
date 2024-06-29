import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class621 extends class389 {
   @OriginalMember(
      owner = "client!he",
      name = "F",
      descriptor = "I"
   )
   public int field9184 = 99;
   @OriginalMember(
      owner = "client!he",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9194 = new String[]{method4609(method4608("\u0018:|1x")), method4609(method4608("\u0018:|>x")), method4609(method4608("\u001e*>\u0015")), method4609(method4608("\u000bq|W-")), method4609(method4608("\u0018:|?x")), method4609(method4608("\u0018:|8x")), method4609(method4608("\u0018:|<x")), method4609(method4608("\u000483")), method4609(method4608("\u0018:|:x")), method4609(method4608("\u0018:|;x")), method4609(method4608("\u0018:|=x")), method4609(method4608("\u0018:|0x"))};
   @OriginalMember(
      owner = "client!he",
      name = "K",
      descriptor = "I"
   )
   public static int field9188 = -1;
   @OriginalMember(
      owner = "client!he",
      name = "R",
      descriptor = "I"
   )
   public static int field9185 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "J",
      descriptor = "Ll;"
   )
   public static class292 field9189 = new class292("", 12);
   @OriginalMember(
      owner = "client!he",
      name = "P",
      descriptor = "I"
   )
   public static int field9180;
   @OriginalMember(
      owner = "client!he",
      name = "S",
      descriptor = "I"
   )
   public static int field9181;
   @OriginalMember(
      owner = "client!he",
      name = "M",
      descriptor = "I"
   )
   public static int field9182;
   @OriginalMember(
      owner = "client!he",
      name = "Q",
      descriptor = "I"
   )
   public static int field9183;
   @OriginalMember(
      owner = "client!he",
      name = "I",
      descriptor = "I"
   )
   public static int field9186;
   @OriginalMember(
      owner = "client!he",
      name = "N",
      descriptor = "I"
   )
   public static int field9187;
   @OriginalMember(
      owner = "client!he",
      name = "L",
      descriptor = "I"
   )
   public static int field9190;
   @OriginalMember(
      owner = "client!he",
      name = "O",
      descriptor = "I"
   )
   public static int field9191;
   @OriginalMember(
      owner = "client!he",
      name = "H",
      descriptor = "I"
   )
   public static int field9192;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!he",
      name = "G",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9193;

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(Lha;IILko;III)V"
   )
   public final void method4598(class479 arg0, int arg1, int arg2, class327 arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9191;
         int var8 = -31 / ((-72 - arg1) / 40);
         class660 var9 = this.method4606(arg6, arg4, arg2, arg5, -2);
         if (var9 != null) {
            class294 var10 = class438.field5967.method929((byte)-77, var9.method175((byte)9));
            int var11 = var9.method181(-6696);
            int var12 = var9.method184(true);
            if (var10.method2369(121)) {
               class737.method5351(0, arg2, var10, arg5, arg6);
            }

            if (var9.method180((byte)-123)) {
               var9.method182(-22276, arg0);
            }

            if (arg4 == 0) {
               class250.method1985(arg6, arg5, arg2);
               if (~var10.field4039 != -1) {
                  arg3.method2589(!var10.field4068, arg5, var11, arg2, -1, var12, var10.field4032);
               }

               if (var10.field4113 == 1) {
                  if (~var12 != -1) {
                     if (~var12 == -2) {
                        class791.method5712(2, arg6, arg5, arg2 + 1, 22525);
                        return;
                     }

                     if (~var12 == -3) {
                        class791.method5712(1, arg6, arg5 - -1, arg2, 22525);
                        return;
                     }

                     if (var12 == 3) {
                        class791.method5712(2, arg6, arg5, arg2, 22525);
                        return;
                     }
                  } else {
                     class791.method5712(1, arg6, arg5, arg2, 22525);
                  }

                  return;
               }
            } else if (~arg4 != -2) {
               if (arg4 == 2) {
                  class271.method2155(arg6, arg5, arg2, field9193 != null ? field9193 : (field9193 = method4607(field9194[7])));
                  if (~var10.field4039 != -1 && ~super.field5374 < ~(arg5 - -var10.field4038) && ~super.field5385 < ~(var10.field4038 + arg2) && super.field5374 > var10.field4066 + arg5 && ~(var10.field4066 + arg2) > ~super.field5385) {
                     arg3.method2583(var10.field4038, arg2, var10.field4066, var12, !var10.field4068, var10.field4032, arg5, false);
                  }

                  if (var11 == 9) {
                     if ((var12 & 1) == 0) {
                        class791.method5712(8, arg6, arg5, arg2, 22525);
                        return;
                     }

                     class791.method5712(16, arg6, arg5, arg2, 22525);
                     return;
                  }

                  return;
               }

               if (~arg4 == -4) {
                  class52.method383(arg6, arg5, arg2);
                  if (var10.field4039 == 1) {
                     arg3.method2592(arg2, arg5, -30341);
                     return;
                  }
               }
            } else {
               class405.method3175(arg6, arg5, arg2);
            }

         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field9194[6] + (arg0 != null ? field9194[3] : field9194[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9194[3] : field9194[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ZBLha;)V"
   )
   public final void method4599(boolean param1, byte param2, class479 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ILko;IIIIIILha;II)V"
   )
   public final void method4600(int arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class479 arg8, int arg9, int arg10) {
      boolean var12 = client.field1481;

      try {
         ++field9186;
         if (~class757.field11093.field10978.method2092(-18033) != -1 || class684.method4977(class600.field8858, -108, arg9, arg7, arg6)) {
            if (~this.field9184 < ~arg4) {
               this.field9184 = arg4;
            }

            class294 var13 = class438.field5967.method929((byte)-107, arg2);
            if (class757.field11093.field10973.method5420(-18033) != 0 || !var13.field4121) {
               int var14;
               int var15;
               label854: {
                  if (~arg0 == -2 || ~arg0 == -4) {
                     var14 = var13.field4038;
                     var15 = var13.field4066;
                     if (!var12) {
                        break label854;
                     }
                  }

                  var15 = var13.field4038;
                  var14 = var13.field4066;
               }

               int var16;
               int var17;
               label780: {
                  if (super.field5374 < arg6 + var15) {
                     var16 = arg6;
                     var17 = arg6 + 1;
                     if (!var12) {
                        break label780;
                     }
                  }

                  var17 = arg6 - -(var15 + 1 >> 1);
                  var16 = (var15 >> 1) + arg6;
               }

               int var18;
               int var19;
               label775: {
                  if (~(arg9 + var14) >= ~super.field5385) {
                     var18 = (var14 >> 1) + arg9;
                     var19 = arg9 - -(var14 + 1 >> 1);
                     if (!var12) {
                        break label775;
                     }
                  }

                  var18 = arg9;
                  var19 = arg9 + 1;
               }

               class423 var20 = class659.field9815[arg7];
               int var21 = var20.method3284(-1, var16, var18) - (-var20.method3284(-1, var17, var18) + -var20.method3284(-1, var16, var19)) + var20.method3284(-1, var17, var19) >> 2;
               int var22 = (arg6 << 9) + (var15 << 8);
               int var23 = (arg9 << 9) + (var14 << 8);
               boolean var24 = class288.field3983 && !super.field5398 && var13.field4094;
               if (var13.method2369(arg10 + 19018)) {
                  class647.method4754(256, (class783)null, arg9, arg4, arg6, var13, arg0, (class81)null);
               }

               boolean var25 = ~arg3 == 0 && var13.field4122 == -1 && var13.field4069 == null && var13.field4036 == null && !var13.field4034 && !var13.field4058;
               if (!class795.field11622 || (!class776.method5603(-10, arg5) || ~var13.field4113 == -2) && (!class489.method3710((byte)-27, arg5) || ~var13.field4113 != -1)) {
                  if (arg10 != -18899) {
                     this.method4604(82, (class479)null, (byte)83, (byte[])null, -91, -63, 3, 71, -82, 16, (class327[])null);
                  }

                  if (arg5 == 22) {
                     if (class757.field11093.field11011.method4665(arg10 + 866) != 0 || ~var13.field4079 != -1 || ~var13.field4039 == -2 || var13.field4091) {
                        class403 var27;
                        label514: {
                           if (var25) {
                              class538 var26 = new class538(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg0, var24);
                              if (var26.method180((byte)-122)) {
                                 var26.method187(arg8, -113);
                              }

                              var27 = var26;
                              if (!var12) {
                                 break label514;
                              }
                           }

                           var27 = new class359(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg0, arg3);
                        }

                        class364.method2867(arg4, arg6, arg9, var27);
                        if (~var13.field4039 == -2 && arg1 != null) {
                           arg1.method2595(arg10 ^ -281043, arg6, arg9);
                        }

                     }
                  } else if (~arg5 != -11 && ~arg5 != -12) {
                     if (~arg5 <= -13 && ~arg5 >= -18 || ~arg5 <= -19 && arg5 <= 21) {
                        class680 var35;
                        label524: {
                           if (var25) {
                              class746 var34 = new class746(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg6, arg6 - 1 + var15, arg9, arg9 - 1 + var14, arg5, arg0, var24);
                              var35 = var34;
                              if (!var34.method180((byte)-123)) {
                                 break label524;
                              }

                              var34.method187(arg8, arg10 + 18789);
                              if (!var12) {
                                 break label524;
                              }
                           }

                           var35 = new class641(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg6, arg6 + -1 + var15, arg9, arg9 + var14 - 1, arg5, arg0, arg3);
                        }

                        class606.method4491(var35, false);
                        if (class288.field3983 && !super.field5398 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg4 > 0 && ~var13.field4113 != -1) {
                           super.field5383[arg4][arg6][arg9] = (byte)class2.method15(super.field5383[arg4][arg6][arg9], 4);
                        }

                        if (var13.field4039 != 0 && arg1 != null) {
                           arg1.method2600(arg6, var14, arg9, var15, var13.field4032, !var13.field4068, (byte)7);
                        }

                     } else if (~arg5 == -1) {
                        int var36 = var13.field4113;
                        if (class128.field1645 && var13.field4113 == -1) {
                           var36 = 1;
                        }

                        class30 var38;
                        label559: {
                           if (var25) {
                              class23 var37 = new class23(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0, var24);
                              var38 = var37;
                              if (!var37.method180((byte)-128)) {
                                 break label559;
                              }

                              var37.method187(arg8, -109);
                              if (!var12) {
                                 break label559;
                              }
                           }

                           var38 = new class485(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0, arg3);
                        }

                        label803: {
                           class652.method4788(arg4, arg6, arg9, var38, (class30)null);
                           if (~arg0 != -1) {
                              if (arg0 == 1) {
                                 if (class288.field3983 && var13.field4101) {
                                    var20.method958(arg6, arg9 + 1, 50);
                                    var20.method958(arg6 - -1, arg9 + 1, 50);
                                 }

                                 if (~var36 != -2 || super.field5398) {
                                    break label803;
                                 }

                                 class697.method5082(2, var13.field4125, arg9 + 1, arg10 ^ 125, arg4, -var13.field4059, arg6);
                                 if (!var12) {
                                    break label803;
                                 }
                              }

                              if (arg0 != 2) {
                                 if (arg0 != 3) {
                                    break label803;
                                 }

                                 if (class288.field3983 && var13.field4101) {
                                    var20.method958(arg6, arg9, 50);
                                    var20.method958(arg6 + 1, arg9, 50);
                                 }

                                 if (var36 != 1 || super.field5398) {
                                    break label803;
                                 }

                                 class697.method5082(2, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6);
                                 if (!var12) {
                                    break label803;
                                 }
                              }

                              if (class288.field3983 && var13.field4101) {
                                 var20.method958(arg6 - -1, arg9, 50);
                                 var20.method958(arg6 - -1, arg9 + 1, 50);
                              }

                              if (~var36 != -2 || super.field5398) {
                                 break label803;
                              }

                              class697.method5082(1, var13.field4125, arg9, -18864, arg4, -var13.field4059, arg6 + 1);
                              if (!var12) {
                                 break label803;
                              }
                           }

                           if (class288.field3983 && var13.field4101) {
                              var20.method958(arg6, arg9, 50);
                              var20.method958(arg6, arg9 + 1, 50);
                           }

                           if (var36 == 1 && !super.field5398) {
                              class697.method5082(1, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6);
                           }
                        }

                        if (~var13.field4039 != -1 && arg1 != null) {
                           arg1.method2588(arg0, arg5, !var13.field4068, false, arg9, var13.field4032, arg6);
                        }

                        if (~var13.field4035 != -65) {
                           class502.method3797(arg4, arg6, arg9, var13.field4035);
                        }

                     } else if (arg5 == 1) {
                        class30 var40;
                        label582: {
                           if (var25) {
                              class23 var39 = new class23(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0, var24);
                              if (var39.method180((byte)-127)) {
                                 var39.method187(arg8, arg10 + 18779);
                              }

                              var40 = var39;
                              if (!var12) {
                                 break label582;
                              }
                           }

                           var40 = new class485(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0, arg3);
                        }

                        class652.method4788(arg4, arg6, arg9, var40, (class30)null);
                        if (var13.field4101 && class288.field3983) {
                           label574: {
                              if (arg0 != 0) {
                                 if (~arg0 == -2) {
                                    var20.method958(arg6 + 1, arg9 - -1, 50);
                                    if (!var12) {
                                       break label574;
                                    }
                                 }

                                 if (arg0 != 2) {
                                    if (arg0 != 3) {
                                       break label574;
                                    }

                                    var20.method958(arg6, arg9, 50);
                                    if (!var12) {
                                       break label574;
                                    }
                                 }

                                 var20.method958(arg6 - -1, arg9, 50);
                                 if (!var12) {
                                    break label574;
                                 }
                              }

                              var20.method958(arg6, arg9 + 1, 50);
                           }
                        }

                        if (var13.field4039 != 0 && arg1 != null) {
                           arg1.method2588(arg0, arg5, !var13.field4068, false, arg9, var13.field4032, arg6);
                        }

                     } else if (arg5 == 2) {
                        class30 var44;
                        class30 var45;
                        label612: {
                           int var41 = arg0 + 1 & 3;
                           if (var25) {
                              class23 var42 = new class23(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0 + 4, var24);
                              class23 var43 = new class23(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, var41, var24);
                              if (var42.method180((byte)56)) {
                                 var42.method187(arg8, -115);
                              }

                              var44 = var43;
                              if (var43.method180((byte)-126)) {
                                 var43.method187(arg8, -124);
                              }

                              var45 = var42;
                              if (!var12) {
                                 break label612;
                              }
                           }

                           var45 = new class485(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0 + 4, arg3);
                           var44 = new class485(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, var41, arg3);
                        }

                        class652.method4788(arg4, arg6, arg9, var45, var44);
                        if ((~var13.field4113 == -2 || class128.field1645 && ~var13.field4113 == 0) && !super.field5398) {
                           label597: {
                              if (arg0 != 0) {
                                 if (~arg0 != -2) {
                                    if (arg0 == 2) {
                                       class697.method5082(1, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6 - -1);
                                       class697.method5082(2, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6);
                                       if (!var12) {
                                          break label597;
                                       }
                                    }

                                    if (~arg0 != -4) {
                                       break label597;
                                    }

                                    class697.method5082(1, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6);
                                    class697.method5082(2, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6);
                                    if (!var12) {
                                       break label597;
                                    }
                                 }

                                 class697.method5082(1, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6 + 1);
                                 class697.method5082(2, var13.field4125, arg9 - -1, -18864, arg4, var13.field4059, arg6);
                                 if (!var12) {
                                    break label597;
                                 }
                              }

                              class697.method5082(1, var13.field4125, arg9, -18864, arg4, var13.field4059, arg6);
                              class697.method5082(2, var13.field4125, arg9 + 1, -18864, arg4, var13.field4059, arg6);
                           }
                        }

                        if (var13.field4039 != 0 && arg1 != null) {
                           arg1.method2588(arg0, arg5, !var13.field4068, false, arg9, var13.field4032, arg6);
                        }

                        if (var13.field4035 != 64) {
                           class502.method3797(arg4, arg6, arg9, var13.field4035);
                        }

                     } else if (arg5 == 3) {
                        class30 var46;
                        label813: {
                           if (!var25) {
                              var46 = new class485(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0, arg3);
                              if (!var12) {
                                 break label813;
                              }
                           }

                           class23 var47 = new class23(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg5, arg0, var24);
                           if (var47.method180((byte)86)) {
                              var47.method187(arg8, -118);
                           }

                           var46 = var47;
                        }

                        class652.method4788(arg4, arg6, arg9, var46, (class30)null);
                        if (var13.field4101 && class288.field3983) {
                           label814: {
                              if (~arg0 == -1) {
                                 var20.method958(arg6, arg9 - -1, 50);
                                 if (!var12) {
                                    break label814;
                                 }
                              }

                              if (~arg0 != -2) {
                                 if (arg0 == 2) {
                                    var20.method958(arg6 + 1, arg9, 50);
                                    if (!var12) {
                                       break label814;
                                    }
                                 }

                                 if (~arg0 != -4) {
                                    break label814;
                                 }

                                 var20.method958(arg6, arg9, 50);
                                 if (!var12) {
                                    break label814;
                                 }
                              }

                              var20.method958(arg6 - -1, arg9 + 1, 50);
                           }
                        }

                        if (~var13.field4039 != -1 && arg1 != null) {
                           arg1.method2588(arg0, arg5, !var13.field4068, false, arg9, var13.field4032, arg6);
                        }

                     } else if (arg5 == 9) {
                        class680 var49;
                        label652: {
                           if (var25) {
                              class746 var48 = new class746(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg6, arg6, arg9, arg9, arg5, arg0, var24);
                              var49 = var48;
                              if (!var48.method180((byte)-122)) {
                                 break label652;
                              }

                              var48.method187(arg8, -117);
                              if (!var12) {
                                 break label652;
                              }
                           }

                           var49 = new class641(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg6, arg6 - (-var15 - -1), arg9, arg9 + var14 - 1, arg5, arg0, arg3);
                        }

                        class606.method4491(var49, false);
                        if (var13.field4113 == 1 && !super.field5398) {
                           byte var50;
                           label642: {
                              if ((1 & arg0) != 0) {
                                 var50 = 16;
                                 if (!var12) {
                                    break label642;
                                 }
                              }

                              var50 = 8;
                           }

                           class697.method5082(var50, var13.field4125, arg9, -18864, arg4, 0, arg6);
                        }

                        if (~var13.field4039 != -1 && arg1 != null) {
                           arg1.method2600(arg6, var14, arg9, var15, var13.field4032, !var13.field4068, (byte)7);
                        }

                        if (~var13.field4035 != -65) {
                           class502.method3797(arg4, arg6, arg9, var13.field4035);
                        }

                     } else if (~arg5 == -5) {
                        class762 var51;
                        label817: {
                           if (!var25) {
                              var51 = new class623(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, 0, 0, arg5, arg0, arg3);
                              if (!var12) {
                                 break label817;
                              }
                           }

                           class737 var52 = new class737(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, 0, 0, arg5, arg0);
                           if (var52.method180((byte)69)) {
                              var52.method187(arg8, -107);
                           }

                           var51 = var52;
                        }

                        class40.method301(arg4, arg6, arg9, var51, (class762)null);
                     } else if (~arg5 == -6) {
                        int var53 = 65;
                        class660 var54 = (class660)class776.method5607(arg4, arg6, arg9);
                        if (var54 != null) {
                           var53 = 1 + class438.field5967.method929((byte)-77, var54.method175((byte)9)).field4035;
                        }

                        class762 var55;
                        label666: {
                           if (!var25) {
                              var55 = new class623(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, class783.field11451[arg0] * var53, class271.field3469[arg0] * var53, arg5, arg0, arg3);
                              if (!var12) {
                                 break label666;
                              }
                           }

                           class737 var56 = new class737(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, class783.field11451[arg0] * var53, class271.field3469[arg0] * var53, arg5, arg0);
                           var55 = var56;
                           if (var56.method180((byte)-126)) {
                              var56.method187(arg8, arg10 + 18784);
                           }
                        }

                        class40.method301(arg4, arg6, arg9, var55, (class762)null);
                     } else if (~arg5 == -7) {
                        int var57 = 33;
                        class660 var58 = (class660)class776.method5607(arg4, arg6, arg9);
                        if (var58 != null) {
                           var57 = class438.field5967.method929((byte)-80, var58.method175((byte)9)).field4035 / 2 + 1;
                        }

                        class762 var59;
                        label820: {
                           if (!var25) {
                              var59 = new class623(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, class146.field1828[arg0] * var57, class557.field8159[arg0] * var57, arg5, arg0 + 4, arg3);
                              if (!var12) {
                                 break label820;
                              }
                           }

                           class737 var60 = new class737(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, class783.field11451[arg0] * var57, class271.field3469[arg0] * var57, arg5, arg0 - -4);
                           if (var60.method180((byte)-18)) {
                              var60.method187(arg8, arg10 ^ 18860);
                           }

                           var59 = var60;
                        }

                        class40.method301(arg4, arg6, arg9, var59, (class762)null);
                     } else if (~arg5 == -8) {
                        class762 var62;
                        label682: {
                           int var61 = arg0 + 2 & 3;
                           if (!var25) {
                              var62 = new class623(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, 0, 0, arg5, var61 + 4, arg3);
                              if (!var12) {
                                 break label682;
                              }
                           }

                           class737 var63 = new class737(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, 0, 0, arg5, var61 + 4);
                           var62 = var63;
                           if (var63.method180((byte)-128)) {
                              var63.method187(arg8, -109);
                           }
                        }

                        class40.method301(arg4, arg6, arg9, var62, (class762)null);
                     } else if (arg5 == 8) {
                        int var64 = 3 & arg0 + 2;
                        int var65 = 33;
                        class660 var66 = (class660)class776.method5607(arg4, arg6, arg9);
                        if (var66 != null) {
                           var65 = 1 + class438.field5967.method929((byte)-79, var66.method175((byte)9)).field4035 / 2;
                        }

                        class762 var69;
                        class762 var70;
                        label822: {
                           if (!var25) {
                              class623 var67 = new class623(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, class146.field1828[arg0] * var65, class557.field8159[arg0] * var65, arg5, arg0 + 4, arg3);
                              class623 var68 = new class623(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, 0, 0, arg5, var64 - -4, arg3);
                              var69 = var67;
                              var70 = var68;
                              if (!var12) {
                                 break label822;
                              }
                           }

                           class737 var71 = new class737(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, class146.field1828[arg0] * var65, class557.field8159[arg0] * var65, arg5, arg0 + 4);
                           class737 var72 = new class737(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, 0, 0, arg5, var64 + 4);
                           if (var71.method180((byte)-128)) {
                              var71.method187(arg8, -116);
                           }

                           if (var72.method180((byte)-128)) {
                              var72.method187(arg8, -122);
                           }

                           var69 = var71;
                           var70 = var72;
                        }

                        class40.method301(arg4, arg6, arg9, var69, var70);
                     }
                  } else {
                     class746 var28 = null;
                     class680 var30;
                     int var31;
                     if (var25) {
                        class746 var29 = new class746(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg6, arg6 - -var15 + -1, arg9, arg9 + var14 - 1, arg5, arg0, var24);
                        var30 = var29;
                        var31 = var29.method5404((byte)122);
                        var28 = var29;
                     } else {
                        var30 = new class641(arg8, var13, arg4, arg7, var22, var21, var23, super.field5398, arg6, var15 - 1 + arg6, arg9, arg9 - -var14 - 1, arg5, arg0, arg3);
                        var31 = 15;
                     }

                     if (class606.method4491(var30, false)) {
                        if (var28 != null && var28.method180((byte)15)) {
                           var28.method187(arg8, -120);
                        }

                        if (var13.field4101 && class288.field3983) {
                           if (var31 > 30) {
                              var31 = 30;
                           }

                           int var32 = 0;
                           if (var12 || ~var15 <= ~var32) {
                              do {
                                 int var33 = 0;
                                 if (var12) {
                                    var20.method958(arg6 + var32, arg9 - -var33, var31);
                                    ++var33;
                                 }

                                 while(true) {
                                    while(~var33 >= ~var14) {
                                       var20.method958(arg6 + var32, arg9 - -var33, var31);
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

                     if (var13.field4039 != 0 && arg1 != null) {
                        arg1.method2600(arg6, var14, arg9, var15, var13.field4032, !var13.field4068, (byte)7);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class93.method866(var74, field9194[1] + arg0 + ',' + (arg1 != null ? field9194[3] : field9194[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field9194[3] : field9194[2]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IILha;B[B[Lko;)V"
   )
   public final void method4601(int arg0, int arg1, class479 arg2, byte arg3, byte[] arg4, class327[] arg5) {
      boolean var7 = client.field1481;

      try {
         ++field9190;
         class66 var8 = new class66(arg4);
         int var9 = -1;
         if (arg3 != -78) {
            this.method4602(-126, (int[])null, -76, 51, -127, (class479)null, 61, 73, (class66)null, -7, -48);
         }

         label69:
         do {
            int var10 = var8.method635(arg3 ^ -78);
            if (var10 == 0) {
               break;
            }

            int var10000 = var9;
            int var10001 = var10;

            while(true) {
               var9 = var10000 + var10001;
               int var11 = 0;

               while(true) {
                  int var12 = var8.method653((byte)-61);
                  if (~var12 == -1) {
                     continue label69;
                  }

                  var11 += var12 - 1;
                  int var13 = var11 & 63;
                  int var14 = var11 >> 6 & 63;
                  int var15 = var11 >> 12;
                  int var16 = var8.method640(255);
                  int var17 = var16 >> 2;
                  int var18 = 3 & var16;
                  int var19 = arg0 + var14;
                  int var20 = arg1 + var13;
                  if (~var19 < -1) {
                     var10000 = ~var20;
                     var10001 = -1;
                     if (var7) {
                        break;
                     }

                     if (var10000 < -1 && super.field5374 + -1 > var19 && ~(super.field5385 + -1) < ~var20) {
                        class327 var21 = null;
                        if (!super.field5398) {
                           int var22 = var15;
                           if (~(2 & class245.field3092[1][var19][var20]) == -3) {
                              var22 = var15 - 1;
                           }

                           if (~var22 <= -1) {
                              var21 = arg5[var22];
                           }
                        }

                        this.method4600(var18, var21, var9, -1, var15, var17, var19, var15, arg2, var20, -18899);
                        if (var7) {
                           continue label69;
                        }
                     }
                  }
               }
            }
         } while(!var7);

      } catch (RuntimeException var24) {
         throw class93.method866(var24, field9194[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9194[3] : field9194[2]) + ',' + arg3 + ',' + (arg4 != null ? field9194[3] : field9194[2]) + ',' + (arg5 != null ? field9194[3] : field9194[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(I[IIIILha;IILgea;II)V"
   )
   public final void method4602(int arg0, int[] arg1, int arg2, int arg3, int arg4, class479 arg5, int arg6, int arg7, class66 arg8, int arg9, int arg10) {
      boolean var12 = client.field1481;

      try {
         ++field9181;
         if (!super.field5398) {
            boolean var13 = false;
            class244 var14 = null;
            if (arg1 != null) {
               arg1[0] = -1;
            }

            int var15 = (7 & arg10) * 8;
            int var16 = (7 & arg2) * 8;
            int var17 = 27 / ((arg6 - -73) / 33);

            do {
               while(~arg8.field864 > ~arg8.field859.length) {
                  int var18 = arg8.method640(255);
                  if (~var18 != -1) {
                     if (~var18 != -2) {
                        if (~var18 == -3) {
                           if (var14 == null) {
                              var14 = new class244();
                           }

                           var14.method1938(arg8, 8);
                           if (!var12) {
                              continue;
                           }
                        }

                        if (~var18 != -129) {
                           if (~var18 != -130) {
                              throw new IllegalStateException("");
                           }

                           if (super.field5378 == null) {
                              super.field5378 = new byte[4][][];
                           }

                           int var19 = 0;
                           if (var12 || ~var19 > -5) {
                              do {
                                 byte var20 = arg8.method628((byte)-12);
                                 if (~var20 != -1 || super.field5378[arg3] == null) {
                                    if (~var20 != -2) {
                                       ++var19;
                                       continue;
                                    }

                                    if (super.field5378[arg3] == null) {
                                       super.field5378[arg3] = new byte[super.field5374 + 1][super.field5385 - -1];
                                    }

                                    int var21 = 0;
                                    if (var12 || var21 < 64) {
                                       do {
                                          int var22 = 0;
                                          if (var12 || var22 < 64) {
                                             do {
                                                byte var23 = arg8.method628((byte)-12);
                                                if (var19 > arg7) {
                                                   var22 += 4;
                                                } else {
                                                   int var24 = var21;
                                                   if (!var12 && var21 >= var21 + 4) {
                                                      var22 += 4;
                                                   } else {
                                                      do {
                                                         int var25 = var22;
                                                         int var26;
                                                         int var27;
                                                         if (var12) {
                                                            if (var15 <= var24 && var24 < var15 + 8 && var22 >= var16 && var16 < var16 + 8) {
                                                               var26 = class565.method4246(arg4, 7 & var22, 7 & var24, 17182) + arg9;
                                                               var27 = arg0 - -class115.method1026(arg4, 17616, 7 & var24, var22 & 7);
                                                               if (~var26 <= -1 && ~super.field5374 < ~var26 && ~var27 <= -1 && ~var27 > ~super.field5385) {
                                                                  super.field5378[arg3][var26][var27] = var23;
                                                               }
                                                            }

                                                            var25 = var22 + 1;
                                                         }

                                                         while(true) {
                                                            while(~var25 > ~(var22 + 4)) {
                                                               if (var15 <= var24 && var24 < var15 + 8 && var25 >= var16 && var16 < var16 + 8) {
                                                                  var26 = class565.method4246(arg4, 7 & var25, 7 & var24, 17182) + arg9;
                                                                  var27 = arg0 - -class115.method1026(arg4, 17616, 7 & var24, var25 & 7);
                                                                  if (~var26 <= -1 && ~super.field5374 < ~var26 && ~var27 <= -1 && ~var27 > ~super.field5385) {
                                                                     super.field5378[arg3][var26][var27] = var23;
                                                                  }
                                                               }

                                                               ++var25;
                                                            }

                                                            if (!var12) {
                                                               ++var24;
                                                               break;
                                                            }

                                                            ++var25;
                                                         }
                                                      } while(var24 < var21 + 4);

                                                      var22 += 4;
                                                   }
                                                }
                                             } while(var22 < 64);
                                          }

                                          var21 += 4;
                                       } while(var21 < 64);
                                    }

                                    if (!var12) {
                                       ++var19;
                                       continue;
                                    }
                                 }

                                 if (~arg7 <= ~var19) {
                                    int var28 = arg9;
                                    int var29 = arg9 + 7;
                                    int var30 = arg0;
                                    if (~arg0 <= -1) {
                                       if (~super.field5385 >= ~arg0) {
                                          var30 = super.field5385;
                                          if (var12) {
                                             var30 = 0;
                                          }
                                       }
                                    } else {
                                       var30 = 0;
                                    }

                                    if (arg9 < 0) {
                                       var28 = 0;
                                       if (var12 && var28 >= super.field5374) {
                                          var28 = super.field5374;
                                       }
                                    } else if (arg9 >= super.field5374) {
                                       var28 = super.field5374;
                                    }

                                    int var31 = arg0 + 7;
                                    if (~var29 <= -1) {
                                       if (super.field5374 <= var29) {
                                          var29 = super.field5374;
                                          if (var12) {
                                             var29 = 0;
                                          }
                                       }
                                    } else {
                                       var29 = 0;
                                    }

                                    label352: {
                                       if (~var31 <= -1) {
                                          if (~var31 > ~super.field5385) {
                                             if (~var29 >= ~var28) {
                                                ++var19;
                                                continue;
                                             }
                                             break label352;
                                          }

                                          var31 = super.field5385;
                                          if (!var12) {
                                             if (~var29 >= ~var28) {
                                                ++var19;
                                                continue;
                                             }
                                             break label352;
                                          }
                                       }

                                       var31 = 0;
                                       if (var12) {
                                          super.field5378[arg3][var28][var30] = 0;
                                          ++var30;
                                       } else if (~var29 >= ~var28) {
                                          ++var19;
                                          continue;
                                       }
                                    }

                                    while(true) {
                                       while(~var30 > ~var31) {
                                          super.field5378[arg3][var28][var30] = 0;
                                          ++var30;
                                       }

                                       if (!var12) {
                                          ++var28;
                                          if (~var29 >= ~var28) {
                                             ++var19;
                                             break;
                                          }
                                       } else {
                                          ++var30;
                                       }
                                    }
                                 } else {
                                    ++var19;
                                 }
                              } while(~var19 > -5);
                           }

                           if (!var12) {
                              continue;
                           }
                        }

                        if (arg1 == null) {
                           arg8.field864 += 10;
                           if (!var12) {
                              continue;
                           }
                        }

                        arg1[0] = arg8.method603(-2);
                        arg1[1] = arg8.method652((byte)90);
                        arg1[2] = arg8.method652((byte)37);
                        arg1[3] = arg8.method652((byte)-99);
                        arg1[4] = arg8.method603(-2);
                        if (!var12) {
                           continue;
                        }
                     }

                     int var32 = arg8.method640(255);
                     if (~var32 >= -1) {
                        continue;
                     }

                     int var33 = 0;
                     if (var12 || var33 < var32) {
                        do {
                           class664 var34 = new class664(arg5, arg8, 2);
                           if (var34.field9846 == 31) {
                              class590 var35 = class784.field11462.method2044(31, arg8.method603(-2));
                              var34.method4851(var35.field8693, var35.field8685, var35.field8686, true, var35.field8694);
                           }

                           if (~arg5.method487() < -1) {
                              class243 var36 = var34.field9839;
                              int var37 = var36.method1927((byte)-8) >> 9;
                              int var38 = var36.method1928(-122) >> 9;
                              if (var34.field9836 == arg7 && var15 <= var37 && var37 < var15 + 8 && ~var38 <= ~var16 && ~(var16 + 8) < ~var38) {
                                 int var39 = (arg9 << 9) - -class324.method2542(4095, var36.method1928(-67) & 4095, arg4, var36.method1927((byte)-8) & 4095);
                                 int var40 = var39 >> 9;
                                 int var41 = (arg0 << 9) + class450.method3450(arg4, var36.method1927((byte)-8) & 4095, -1, var36.method1928(58) & 4095);
                                 int var42 = var41 >> 9;
                                 if (~var40 <= -1 && var42 >= 0 && var40 < super.field5374 && ~var42 > ~super.field5385) {
                                    var36.method1537(true, var39, super.field5371[arg7][var40][var42] - var36.method1926(-67), var41);
                                    class31.method250(var34);
                                 }
                              }
                           }

                           ++var33;
                        } while(var33 < var32);
                     }

                     if (!var12) {
                        continue;
                     }
                  }

                  var14 = new class244(arg8);
               }
            } while(var12);

            if (var14 != null) {
               class746.method5407(arg0 >> 3, (byte)11, arg9 >> 3, var14);
            }

            if (!var13 && super.field5378 != null && super.field5378[arg3] != null) {
               int var43 = arg9 + 7;
               int var44 = arg0 + 7;
               int var45 = arg9;
               if (var12 || var43 > arg9) {
                  do {
                     int var46 = arg0;
                     if (var12) {
                        super.field5378[arg3][var45][arg0] = 0;
                        var46 = arg0 + 1;
                     }

                     while(true) {
                        while(var46 < var44) {
                           super.field5378[arg3][var45][var46] = 0;
                           ++var46;
                        }

                        if (!var12) {
                           ++var45;
                           break;
                        }

                        ++var46;
                     }
                  } while(var43 > var45);

               }
            }
         }
      } catch (RuntimeException var48) {
         throw class93.method866(var48, field9194[4] + arg0 + ',' + (arg1 != null ? field9194[3] : field9194[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9194[3] : field9194[2]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field9194[3] : field9194[2]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4603(int arg0) {
      try {
         if (arg0 == 0) {
            field9189 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9194[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ILha;B[BIIIIII[Lko;)V"
   )
   public final void method4604(int arg0, class479 arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class327[] arg10) {
      boolean var12 = client.field1481;

      try {
         ++field9192;
         class66 var13 = new class66(arg3);
         int var14 = 97 / ((arg2 - -40) / 46);
         int var15 = -1;

         label77:
         do {
            int var16 = var13.method635(0);
            int var10000 = ~var16;
            int var10001 = -1;

            while(var10000 != var10001) {
               var15 += var16;
               int var17 = 0;

               while(true) {
                  int var18 = var13.method653((byte)-114);
                  if (~var18 == -1) {
                     continue label77;
                  }

                  var17 += var18 + -1;
                  int var19 = var17 & 63;
                  int var20 = (var17 & 4063) >> 6;
                  int var21 = var17 >> 12;
                  int var22 = var13.method640(255);
                  int var23 = var22 >> 2;
                  int var24 = var22 & 3;
                  if (~arg8 == ~var21) {
                     var10000 = ~arg0;
                     var10001 = ~var20;
                     if (var12) {
                        break;
                     }

                     if (var10000 >= var10001 && ~var20 > ~(arg0 + 8) && ~var19 <= ~arg5 && var19 < arg5 + 8) {
                        class294 var25 = class438.field5967.method929((byte)-102, var15);
                        int var26 = class580.method4337(arg4, var25.field4038, var24, var19 & 7, var25.field4066, 7 & var20, (byte)67) + arg9;
                        int var27 = class280.method2206(var20 & 7, var25.field4038, var25.field4066, -3, arg4, var19 & 7, var24) + arg7;
                        if (~var26 < -1 && ~var27 < -1 && ~(super.field5374 + -1) < ~var26 && ~(super.field5385 + -1) < ~var27) {
                           class327 var28 = null;
                           if (!super.field5398) {
                              int var29 = arg6;
                              if (~(class245.field3092[1][var26][var27] & 2) == -3) {
                                 var29 = arg6 - 1;
                              }

                              if (~var29 <= -1) {
                                 var28 = arg10[var29];
                              }
                           }

                           this.method4600(3 & var24 - -arg4, var28, var15, -1, arg6, var23, var26, arg6, arg1, var27, -18899);
                           if (var12) {
                              continue label77;
                           }
                        }
                     }
                  }
               }
            }

            return;
         } while(!var12);

      } catch (RuntimeException var31) {
         throw class93.method866(var31, field9194[5] + arg0 + ',' + (arg1 != null ? field9194[3] : field9194[2]) + ',' + arg2 + ',' + (arg3 != null ? field9194[3] : field9194[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field9194[3] : field9194[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ILgea;I[ILha;I)V"
   )
   public final void method4605(int param1, class66 param2, int param3, int[] param4, class479 param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "(IIIII)Ltga;"
   )
   public final class660 method4606(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9182;
         class660 var6 = null;
         if (~arg1 == -1) {
            var6 = (class660)class776.method5607(arg0, arg3, arg2);
         }

         if (~arg1 == arg4) {
            var6 = (class660)class623.method4610(arg0, arg3, arg2);
         }

         if (~arg1 == -3) {
            var6 = (class660)class338.method2672(arg0, arg3, arg2, field9193 != null ? field9193 : (field9193 = method4607(field9194[7])));
         }

         if (arg1 == 3) {
            var6 = (class660)class688.method5028(arg0, arg3, arg2);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9194[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "<init>",
      descriptor = "(IIIZ)V"
   )
   public class621(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class553.field8135, class215.field2735);
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4607(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4608(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4609(char[] arg0) {
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
            var10005 = 95;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
