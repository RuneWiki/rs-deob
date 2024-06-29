import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class526 extends class105 {

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "S")
    public short field7425;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field7426 = 0;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        if (arg0 >= -85) {
            field7426 = -23;
        }
        ++field7429;
        return class662.method3629(super.field1258, 843095752, super.field1250 >> class660.field9038, super.field1264 >> class660.field9038);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIII)V")
    public class526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field1255 = arg1;
        super.field1250 = arg2;
        super.field1258 = (byte) arg4;
        this.field7425 = (short) arg5;
        super.field1266 = (byte) arg3;
        super.field1264 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIIIIIIIII[Ljb;)V")
    public static final void method3069(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class493[] arg10) {
        ++field7431;
        class268.field3831.method469(arg5, arg8, arg3, arg4);
        if (arg2 != -13123) {
            method3069(false, -37, -104, 16, 76, -34, 124, -25, 49, 68, (class493[]) null);
        }
        for (int var11 = 0; ~arg10.length < ~var11; ++var11) {
            class493 var12 = arg10[var11];
            if (var12 != null && (var12.field7078 == arg1 || arg1 == -1412584499 && class643.field8813 == var12)) {
                int var13 = var12.field6954 + arg9;
                int var14 = var12.field6975 - -arg7;
                int var15 = var12.field7095 + var13 + 1;
                int var16 = var14 + 1 + var12.field7031;
                int var17;
                if (arg6 != -1) {
                    var17 = arg6;
                } else {
                    class686.field9382[class540.field7565].setBounds(var12.field6954 + arg9, var12.field6975 - -arg7, var12.field7095, var12.field7031);
                    var17 = class540.field7565++;
                }
                var12.field7010 = var17;
                var12.field7093 = class740.field10285;
                if (!client.method1947(var12)) {
                    if (var12.field7021 != 0) {
                        class24.method153(0, var12);
                    }
                    int var18 = var12.field6954 + arg9;
                    int var19 = var12.field6975 + arg7;
                    int var20 = 0;
                    int var21 = 0;
                    if (class589.field8295) {
                        var20 = class171.method1102(arg2 + 18590);
                        var21 = class575.method3288((byte) -125);
                    }
                    int var22 = var12.field7070;
                    if (class600.field8422 && (~client.method1950(var12).field6767 != -1 || ~var12.field7016 == -1) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class643.field8813 == var12) {
                        if (~arg1 != 1412584498 && (class492.field6940 == var12.field7042 || ~class124.field1506 == ~var12.field7042)) {
                            class593.field8352 = arg10;
                            class193.field2583 = arg9;
                            class498.field7153 = arg7;
                            continue;
                        }
                        if (class390.field5517 && class403.field5706) {
                            int var23 = class530.field7470.method1094(arg2 + 13036) - -var20;
                            int var24 = var21 + class530.field7470.method1089((byte) -63);
                            int var25 = var23 - class481.field6800;
                            int var26 = var24 - class640.field8791;
                            if (var25 < class733.field10223) {
                                var25 = class733.field10223;
                            }
                            if (~(var25 - -var12.field7095) < ~(class733.field10223 + class76.field991.field7095)) {
                                var25 = class733.field10223 + class76.field991.field7095 + -var12.field7095;
                            }
                            if (class424.field5967 > var26) {
                                var26 = class424.field5967;
                            }
                            var18 = var25;
                            if (var26 - -var12.field7031 > class424.field5967 - -class76.field991.field7031) {
                                var26 = class424.field5967 - (-class76.field991.field7031 - -var12.field7031);
                            }
                            var19 = var26;
                        }
                        if (~class124.field1506 == ~var12.field7042) {
                            var22 = 128;
                        }
                    }
                    int var27;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field7016 == 2) {
                        var27 = arg8;
                        var28 = arg3;
                        var29 = arg4;
                        var30 = arg5;
                    } else {
                        int var31 = var12.field7095 + var18;
                        int var32 = var12.field7031 + var19;
                        var30 = arg5 >= var18 ? arg5 : var18;
                        if (~var12.field7016 == -10) {
                            ++var32;
                            ++var31;
                        }
                        var27 = ~arg8 <= ~var19 ? arg8 : var19;
                        var28 = ~var31 > ~arg3 ? var31 : arg3;
                        var29 = ~var32 <= ~arg4 ? arg4 : var32;
                    }
                    if (~var28 < ~var30 && ~var29 < ~var27) {
                        if (var12.field7021 != 0) {
                            if (class681.field9339 == var12.field7021 || ~class380.field5437 == ~var12.field7021) {
                                class545.method3156(var18, var19, var12, 0);
                                if (!class589.field8295) {
                                    class662.method3631(class380.field5437 == var12.field7021, var12.field7031, var12.field7095, (byte) -128, var18, var19);
                                    class268.field3831.method469(arg5, arg8, arg3, arg4);
                                }
                                class583.field8210[var17] = true;
                                continue;
                            }
                            if (~class68.field840 == ~var12.field7021) {
                                if (var12.method2944((byte) 117, class268.field3831) != null) {
                                    class485.method2904((byte) -126);
                                    class207.method1270(var19, class268.field3831, 1, var18, var12);
                                    class220.field2877[var17] = true;
                                    class268.field3831.method469(arg5, arg8, arg3, arg4);
                                    if (class589.field8295) {
                                        if (arg0) {
                                            class189.method1186(var16, var15, (byte) -98, var13, var14);
                                        } else {
                                            class595.method3356(var15, var16, -1, var13, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (~class270.field3870 == ~var12.field7021) {
                                if (var12.method2944((byte) 120, class268.field3831) != null) {
                                    class475.method2841(var19, (byte) -98, var18, var12);
                                    class220.field2877[var17] = true;
                                    class268.field3831.method469(arg5, arg8, arg3, arg4);
                                    if (class589.field8295) {
                                        if (arg0) {
                                            class189.method1186(var16, var15, (byte) -77, var13, var14);
                                        } else {
                                            class595.method3356(var15, var16, -1, var13, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (~class553.field7775 == ~var12.field7021) {
                                class104.method740(var12.field7095, (byte) -80, class268.field3831, var19, var18, class665.field9066, var12.field7031);
                                class583.field8210[var17] = true;
                                class268.field3831.method469(arg5, arg8, arg3, arg4);
                                continue;
                            }
                            if (~class28.field370 == ~var12.field7021) {
                                class146.method1012(var18, class268.field3831, var12.field7031, var19, (byte) 101, var12.field7095);
                                class583.field8210[var17] = true;
                                class268.field3831.method469(arg5, arg8, arg3, arg4);
                                continue;
                            }
                            if (~class424.field5974 == ~var12.field7021) {
                                if (!class59.field737 && !class33.field430) {
                                    continue;
                                }
                                int var33 = var18 - -var12.field7095;
                                if (class589.field8295) {
                                    if (!arg0) {
                                        class595.method3356(var15, var16, -1, var13, var14);
                                    } else {
                                        class189.method1186(var16, var15, (byte) -92, var13, var14);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class59.field737) {
                                    int var35 = -256;
                                    if (~class411.field5801 > -21) {
                                        var35 = -65536;
                                    }
                                    class478.field6780.method506((byte) -88, -1, var33, "Fps:" + class411.field5801, var35, var34);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class199.field2623) {
                                            class414.method2544(false);
                                            for (int var39 = 0; var39 < 10; ++var39) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class642.method3549(true, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class478.field6780.method506((byte) -104, -1, var33, "Mem:" + var37 + "k", var38, var34);
                                    var34 += 15;
                                    class478.field6780.method506((byte) -103, -1, var33, "In:" + class674.field9140 + "B/s Out:" + class187.field2521 + "B/s", -256, var34);
                                    var34 += 15;
                                    int var40 = class268.field3831.method465() / 1024;
                                    class478.field6780.method506((byte) -84, -1, var33, "Offheap:" + var40 + "k", var40 > 65536 ? -65536 : -256, var34);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; ~var44 > -38; ++var44) {
                                        if (class422.field5960[var44] != null) {
                                            var41 += class422.field5960[var44].method4062(0);
                                            var42 += class422.field5960[var44].method4067(true);
                                            var43 += class422.field5960[var44].method4063(false);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class556.method3211((byte) 113, true, 0, (long) var46, 2) + "% (" + var45 + "%)";
                                    class352.field4974.method506((byte) -95, -1, var33, var47, -256, var34);
                                    var34 += 12;
                                }
                                if (class409.field5798 > 0) {
                                    class352.field4974.method506((byte) -114, -1, var33, "Particles: " + class356.field5068 + " / " + class409.field5798, -256, var34);
                                }
                                var34 += 12;
                                if (class33.field430) {
                                    class352.field4974.method506((byte) -116, -1, var33, "Polys: " + class268.field3831.method382() + " Models: " + class268.field3831.method407(), -256, var34);
                                    var34 += 12;
                                    class352.field4974.method506((byte) -114, -1, var33, "Ls: " + class53.field604 + " La: " + class151.field2140 + " NPC: " + class223.field2924 + " Pl: " + class9.field137, -256, var34);
                                    var34 += 12;
                                    class50.method312((byte) -101);
                                }
                                class583.field8210[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field7016 == 0) {
                            if (class408.field5785 == var12.field7021 && class268.field3831.method491()) {
                                class268.field3831.method486(var18, var19, var12.field7095, var12.field7031);
                            }
                            method3069(arg0, var12.field6956, -13123, var28, var29, var30, var17, -var12.field7073 + var19, var27, -var12.field7046 + var18, arg10);
                            if (var12.field7009 != null) {
                                method3069(arg0, var12.field6956, -13123, var28, var29, var30, var17, -var12.field7073 + var19, var27, -var12.field7046 + var18, var12.field7009);
                            }
                            class47 var48 = (class47) class475.field6744.method1180((byte) 26, (long) var12.field6956);
                            if (var48 != null) {
                                class253.method1677(50, var27, var19, var28, var30, var48.field550, var18, var17, var29);
                            }
                            if (~class408.field5785 == ~var12.field7021 && class268.field3831.method491()) {
                                class268.field3831.method472();
                            }
                            class268.field3831.method469(arg5, arg8, arg3, arg4);
                        }
                        if (class722.field10021[var17] || class422.field5956 > 1) {
                            if (var12.field7016 == 3) {
                                if (~var22 != -1) {
                                    if (var12.field7027) {
                                        class268.field3831.method431(var18, var19, var12.field7095, var12.field7031, 16777215 & var12.field7062 | -(255 & var22) + 255 << 24, 1);
                                    } else {
                                        class268.field3831.method445(var18, var19, var12.field7095, var12.field7031, var12.field7062 & 16777215 | -(255 & var22) + 255 << 24, 1);
                                    }
                                } else if (var12.field7027) {
                                    class268.field3831.method431(var18, var19, var12.field7095, var12.field7031, var12.field7062, 0);
                                } else {
                                    class268.field3831.method445(var18, var19, var12.field7095, var12.field7031, var12.field7062, 0);
                                }
                                if (class589.field8295) {
                                    if (arg0) {
                                        class189.method1186(var16, var15, (byte) -92, var13, var14);
                                    } else {
                                        class595.method3356(var15, var16, -1, var13, var14);
                                    }
                                }
                            } else if (~var12.field7016 == -5) {
                                class59 var49 = var12.method2942(class268.field3831, arg2 ^ -13123);
                                if (var49 == null) {
                                    if (class586.field8254) {
                                        class543.method3149(var12, 1);
                                    }
                                } else {
                                    int var50 = var12.field7062;
                                    String var51 = var12.field6966;
                                    if (var12.field6952 != -1) {
                                        class551 var52 = class682.field9361.method3424(var12.field6952, false);
                                        var51 = var52.field7677;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((~var52.field7734 == -2 || var12.field7057 != 1) && var12.field7057 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class315.method2031(var12.field7057, arg2 + 13215);
                                        }
                                    }
                                    if (~var12.field7037 != 0) {
                                        var51 = class640.method3547(false, var12.field7037);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class486.field6819 == var12) {
                                        var51 = class71.field927.method588((byte) 119, class549.field7669);
                                        var50 = var12.field7062;
                                    }
                                    if (class100.field1193) {
                                        class268.field3831.method394(var18, var19, var12.field7095 + var18, var12.field7031 + var19);
                                    }
                                    var49.method500(var12.field7028, 111, class716.field9948, var12.field6961, 0, var12.field7092, 0, var12.field7095, !var12.field6994 ? -1 : -(255 & var22) + 255 << 24, var12.field7074, var19, var12.field7031, (int[]) null, var50 | -(var22 & 255) + 255 << 24, var51, var18, (class486) null);
                                    if (class100.field1193) {
                                        class268.field3831.method469(arg5, arg8, arg3, arg4);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (class100.field1193) {
                                            if (class589.field8295) {
                                                if (arg0) {
                                                    class189.method1186(var16, var15, (byte) -85, var13, var14);
                                                } else {
                                                    class595.method3356(var15, var16, -1, var13, var14);
                                                }
                                            }
                                        } else {
                                            class143 var53 = class10.method63(-78, class268.field3831, var12.field6973);
                                            int var54 = var53.method998(174, var12.field7095, var51, class716.field9948);
                                            int var55 = var53.method996(0, var51, var12.field7095, var12.field6961, class716.field9948);
                                            if (class589.field8295) {
                                                if (!arg0) {
                                                    class595.method3356(var18 + var54, var19 + var55, -1, var18, var19);
                                                } else {
                                                    class189.method1186(var19 + var55, var18 + var54, (byte) -114, var18, var19);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var12.field7016 == -6) {
                                if (var12.field7088 < 0) {
                                    class88 var57;
                                    if (var12.field6952 != -1) {
                                        class621 var56 = var12.field6970 ? class660.field9039.field3983 : null;
                                        var57 = class682.field9361.method3414(class268.field3831, var12.field7039 | -16777216, var12.field6959, var12.field6951, var56, (byte) -100, var12.field7057, var12.field6952);
                                    } else if (~var12.field7037 == 0) {
                                        var57 = var12.method2938(class268.field3831, -1);
                                    } else {
                                        var57 = class455.method2706(2107742921, var12.field7037, class268.field3831);
                                    }
                                    if (var57 == null) {
                                        if (class586.field8254) {
                                            class543.method3149(var12, 1);
                                        }
                                    } else {
                                        int var58 = var57.method656();
                                        int var59 = var57.method670();
                                        int var60 = (~var12.field7062 == -1 ? 16777215 : 16777215 & var12.field7062) | -(255 & var22) + 255 << 24;
                                        if (!var12.field6967) {
                                            if (var12.field7062 == 0 && var22 == 0) {
                                                if (var12.field7072 != 0) {
                                                    var57.method664((float) var12.field7095 / 2.0F + (float) var18, (float) var12.field7031 / 2.0F + (float) var19, var12.field7095 * 4096 / var58, var12.field7072);
                                                } else if (~var12.field7095 == ~var58 && ~var12.field7031 == ~var59) {
                                                    var57.method658(var18, var19);
                                                } else {
                                                    var57.method668(var18, var19, var12.field7095, var12.field7031);
                                                }
                                            } else if (var12.field7072 == 0) {
                                                if (var12.field7095 == var58 && var12.field7031 == var59) {
                                                    var57.method672(var18, var19, 0, var60, 1);
                                                } else {
                                                    var57.method654(var18, var19, var12.field7095, var12.field7031, 0, var60, 1);
                                                }
                                            } else {
                                                var57.method669((float) var12.field7095 / 2.0F + (float) var18, (float) var12.field7031 / 2.0F + (float) var19, var12.field7095 * 4096 / var58, var12.field7072, 0, var60, 1);
                                            }
                                        } else {
                                            class268.field3831.method394(var18, var19, var18 - -var12.field7095, var12.field7031 + var19);
                                            if (~var12.field7072 == -1) {
                                                if (~var12.field7062 == -1 && var22 == 0) {
                                                    var57.method666(var18, var19, var12.field7095, var12.field7031);
                                                } else {
                                                    var57.method673(var18, var19, var12.field7095, var12.field7031, 0, var60, 1);
                                                }
                                            } else {
                                                int var61 = (var12.field7095 + -1 + var58) / var58;
                                                int var62 = (var12.field7031 + var59 + -1) / var59;
                                                for (int var63 = 0; ~var63 > ~var61; ++var63) {
                                                    for (int var64 = 0; ~var64 > ~var62; ++var64) {
                                                        if (var12.field7062 != 0) {
                                                            var57.method669((float) var58 / 2.0F + (float) (var18 - -(var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field7072, 0, var60, 1);
                                                        } else {
                                                            var57.method664((float) var58 / 2.0F + (float) (var18 - -(var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field7072);
                                                        }
                                                    }
                                                }
                                            }
                                            class268.field3831.method469(arg5, arg8, arg3, arg4);
                                        }
                                    }
                                } else {
                                    var12.method2936(-117, class192.field2556, class6.field64).method3582(0, var12.field6995 << 3, var19, 5063, 0, var12.field6971 << 3, var18, var12.field7031, var12.field7095, class268.field3831);
                                }
                                if (class589.field8295) {
                                    if (!arg0) {
                                        class595.method3356(var15, var16, arg2 ^ 13122, var13, var14);
                                    } else {
                                        class189.method1186(var16, var15, (byte) -76, var13, var14);
                                    }
                                }
                            } else if (~var12.field7016 != -7) {
                                if (var12.field7016 == 9) {
                                    int var84;
                                    int var85;
                                    int var86;
                                    int var87;
                                    if (var12.field6990) {
                                        var84 = var19;
                                        var85 = var18;
                                        var86 = var12.field7031 + var19;
                                        var87 = var12.field7095 + var18;
                                    } else {
                                        var85 = var18;
                                        var87 = var12.field7095 + var18;
                                        var86 = var19;
                                        var84 = var12.field7031 + var19;
                                    }
                                    if (~var12.field6977 != -2) {
                                        class268.field3831.method437(var85, var86, var87, var84, var12.field7062, var12.field6977, 0);
                                    } else {
                                        class268.field3831.method378(var85, var86, var87, var84, var12.field7062, 0);
                                    }
                                    if (class589.field8295) {
                                        if (!arg0) {
                                            class595.method3356(var15, var16, -1, var13, var14);
                                        } else {
                                            class189.method1186(var16, var15, (byte) -80, var13, var14);
                                        }
                                    }
                                }
                            } else {
                                class237.method1521((byte) 126);
                                class471 var65 = null;
                                int var66 = 0;
                                if (var12.field6952 == -1) {
                                    if (var12.field7082 == 5) {
                                        int var67 = var12.field6997;
                                        if (var67 >= 0 && var67 < 2048) {
                                            class280 var68 = class309.field4311[var67];
                                            class709 var69 = ~var12.field6976 != 0 ? class343.field4785.method3525(var12.field6976, (byte) 95) : null;
                                            if (var68 != null && (~class389.field5512 == ~var67 || class662.method3632(var68.field3965, -27550) == var12.field7047)) {
                                                var65 = var68.field3983.method3484(var12.field6987, 2048, (class709) null, -1, 0, class682.field9361, 0, class200.field2638, class268.field3831, 0, var69, (int[]) null, var12.field7030, class606.field8530, class343.field4785, true, (class132[]) null, var12.field7024, class231.field3110, class101.field1201, arg2 ^ -13123);
                                            }
                                        }
                                    } else if (~var12.field7082 != -9 && var12.field7082 != 9) {
                                        if (var12.field6976 != -1) {
                                            class709 var70 = class343.field4785.method3525(var12.field6976, (byte) 111);
                                            var65 = var12.method2937(class101.field1201, var12.field7030, var12.field7024, var70, class231.field3110, class682.field9361, class660.field9039.field3983, 15859, 2048, class606.field8530, class343.field4785, class200.field2638, class268.field3831, var12.field6987);
                                            if (var65 == null && class586.field8254) {
                                                class543.method3149(var12, 1);
                                            }
                                        } else {
                                            var65 = var12.method2937(class101.field1201, -1, -1, (class709) null, class231.field3110, class682.field9361, class660.field9039.field3983, 15859, 2048, class606.field8530, class343.field4785, class200.field2638, class268.field3831, 0);
                                            if (var65 == null && class586.field8254) {
                                                class543.method3149(var12, 1);
                                            }
                                        }
                                    } else {
                                        class95 var71 = class71.method589(false, -9854, var12.field6997);
                                        class709 var72 = ~var12.field6976 != 0 ? class343.field4785.method3525(var12.field6976, (byte) 127) : null;
                                        if (var71 != null) {
                                            class621 var73 = !var12.field6970 ? null : class660.field9039.field3983;
                                            var65 = var71.method704(~var12.field7082 == -10, (byte) -104, var72, var12.field7047, class268.field3831, 2048, var12.field7030, var12.field6987, var12.field7024, var73);
                                        }
                                    }
                                } else {
                                    class551 var74 = class682.field9361.method3424(var12.field6952, false);
                                    if (var74 != null) {
                                        class551 var75 = var74.method3182(var12.field7057, false);
                                        class709 var76 = ~var12.field6976 != 0 ? class343.field4785.method3525(var12.field6976, (byte) 124) : null;
                                        class621 var77 = var12.field6970 ? class660.field9039.field3983 : null;
                                        var65 = var75.method3192(2048, false, class268.field3831, var77, 1, var12.field7030, var76, var12.field6987, var12.field7024);
                                        if (var65 != null) {
                                            var66 = -var65.method253() >> 1;
                                        } else {
                                            class543.method3149(var12, arg2 + 13124);
                                        }
                                    }
                                }
                                if (var65 != null) {
                                    int var78;
                                    if (var12.field7101 <= 0) {
                                        var78 = 512;
                                    } else {
                                        var78 = (var12.field7095 << 9) / var12.field7101;
                                    }
                                    int var79;
                                    if (~var12.field7065 >= -1) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field7031 << 9) / var12.field7065;
                                    }
                                    int var80 = var18 - -(var12.field7095 / 2);
                                    int var81 = var12.field7031 / 2 + var19;
                                    if (!var12.field6984) {
                                        var80 += var12.field7018 * var78 >> 9;
                                        var81 += var12.field7033 * var79 >> 9;
                                    }
                                    class631.field8724.method351();
                                    class268.field3831.method483(class631.field8724);
                                    class268.field3831.method391(var80, var81, var78, var79);
                                    class268.field3831.method440();
                                    if (var12.field7077) {
                                        class268.field3831.method490(false);
                                    }
                                    if (!var12.field6984) {
                                        int var82 = (var12.field7083 << 2) * class164.field2258[var12.field6981 << 3] >> 14;
                                        int var83 = (var12.field7083 << 2) * class164.field2252[var12.field6981 << 3] >> 14;
                                        class542.field7576.method342(-var12.field7011 << 3);
                                        class542.field7576.method347(var12.field7063 << 3);
                                        class542.field7576.method360(var12.field7080 << 2, (var12.field7001 << 2) + var82 + var66, (var12.field7001 << 2) + var83);
                                        class542.field7576.method350(var12.field6981 << 3);
                                    } else {
                                        class542.field7576.method362(var12.field6981);
                                        class542.field7576.method347(var12.field7063);
                                        class542.field7576.method356(var12.field7011);
                                        class542.field7576.method360(var12.field7018, var12.field7033, var12.field6955);
                                    }
                                    var12.method2952((byte) 116, class740.field10285, class542.field7576, class268.field3831, var65);
                                    if (class100.field1193) {
                                        class268.field3831.method394(var18, var19, var18 - -var12.field7095, var12.field7031 + var19);
                                    }
                                    if (!var12.field6984) {
                                        if (!var12.field7050) {
                                            var65.method221(class542.field7576, (class137) null, 1);
                                            if (var12.field7061 != null) {
                                                class268.field3831.method381(var12.field7061.method3122());
                                            }
                                        } else {
                                            var65.method262(class542.field7576, (class137) null, var12.field7083 << 2, 1);
                                        }
                                    } else if (var12.field7050) {
                                        var65.method262(class542.field7576, (class137) null, var12.field7083, 1);
                                    } else {
                                        var65.method221(class542.field7576, (class137) null, 1);
                                        if (var12.field7061 != null) {
                                            class268.field3831.method381(var12.field7061.method3122());
                                        }
                                    }
                                    if (class100.field1193) {
                                        class268.field3831.method469(arg5, arg8, arg3, arg4);
                                    }
                                    if (var12.field7077) {
                                        class268.field3831.method490(true);
                                    }
                                }
                                if (class589.field8295) {
                                    if (arg0) {
                                        class189.method1186(var16, var15, (byte) -89, var13, var14);
                                    } else {
                                        class595.method3356(var15, var16, -1, var13, var14);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)Z")
    public final boolean method617(int arg0) {
        ++field7428;
        if (arg0 != -21499) {
            this.method617(-20);
        }
        return class589.field8299[(super.field1264 >> class660.field9038) + -class136.field1982 + class453.field6405][(super.field1250 >> class660.field9038) - class481.field6801 + class453.field6405];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([Lwi;I)I")
    public final int method618(class465[] arg0, int arg1) {
        if (arg1 != -1) {
            this.method611(15);
        }
        ++field7427;
        return this.method742(super.field1264 >> class660.field9038, arg0, (byte) -22, super.field1250 >> class660.field9038);
    }
}
