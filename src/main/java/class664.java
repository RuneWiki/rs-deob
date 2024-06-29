import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class664 {

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public int field9372;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    private int field9373;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "[I")
    public static int[] field9371 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "F")
    public static float field9378 = 1.0F;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "[I")
    public static int[] field9377 = new int[13];

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 4)
    public static void method3670(int arg0) {
        field9377 = null;
        if (arg0 == 0) {
            field9371 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "([Lvg;IIIIIIIII)V", line = 18)
    public static final void method3671(class49[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9376++;
        class282.field4228.method168(arg5, arg1, arg7, arg2);
        int var10 = 0;
        if (arg9 > -125) {
            field9378 = 1.3175155F;
        }
        while (var10 < arg0.length) {
            class49 var11 = arg0[var10];
            if (var11 != null && (var11.field885 == arg6 || arg6 == -1412584499 && class648.field9107 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class210.field2933[class28.field407].setBounds(var11.field957 + arg8, var11.field920 - -arg4, var11.field967, var11.field877);
                    var12 = class28.field407++;
                } else {
                    var12 = arg3;
                }
                var11.field864 = class564.field7962;
                var11.field965 = var12;
                if (!client.method1763(var11)) {
                    label603: {
                        if (var11.field963 != 0) {
                            class326.method2057((byte) 125, var11);
                        }
                        int var13 = var11.field957 + arg8;
                        int var14 = var11.field920 + arg4;
                        int var15 = var11.field893;
                        if (class681.field9611 && (client.method1767(var11).field1943 != 0 || var11.field980 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class648.field9107 == var11) {
                            if (arg6 != -1412584499 && (class672.field9495 == var11.field978 || class639.field9019 == var11.field978)) {
                                class626.field8770 = arg0;
                                class78.field1341 = arg4;
                                class190.field2744 = arg8;
                                break label603;
                            }
                            if (class315.field4670 && class593.field8367) {
                                int var16 = class508.field7171.method2090(-7249);
                                int var17 = class508.field7171.method2093(22302);
                                int var18 = var16 - class60.field1143;
                                int var19 = var17 - class197.field2804;
                                if (var18 < class644.field9058) {
                                    var18 = class644.field9058;
                                }
                                if (class527.field7429 > var19) {
                                    var19 = class527.field7429;
                                }
                                if (class644.field9058 + class461.field6646.field967 < var11.field967 + var18) {
                                    var18 = class644.field9058 + class461.field6646.field967 - var11.field967;
                                }
                                var13 = var18;
                                if ((class527.field7429 + class461.field6646.field877) < (var19 + var11.field877)) {
                                    var19 = class527.field7429 + class461.field6646.field877 - var11.field877;
                                }
                                var14 = var19;
                            }
                            if (class639.field9019 == var11.field978) {
                                var15 = 128;
                            }
                        }
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (var11.field980 == 2) {
                            var22 = arg1;
                            var24 = arg7;
                            var25 = arg2;
                            var23 = arg5;
                        } else {
                            int var20 = var11.field967 + var13;
                            int var21 = var11.field877 + var14;
                            var22 = var14 <= arg1 ? arg1 : var14;
                            if (var11.field980 == 9) {
                                var20++;
                                var21++;
                            }
                            var23 = arg5 >= var13 ? arg5 : var13;
                            var24 = var20 >= arg7 ? arg7 : var20;
                            var25 = arg2 <= var21 ? arg2 : var21;
                        }
                        if (var23 < var24 && var22 < var25) {
                            label605: {
                                if (var11.field963 != 0) {
                                    if (class235.field3642 == var11.field963 || class129.field1906 == var11.field963) {
                                        class622.method3459(class129.field1906 == var11.field963, var11.field967, 25755, var14, var13, var11.field877);
                                        class508.field7177[var12] = true;
                                        class282.field4228.method168(arg5, arg1, arg7, arg2);
                                        break label605;
                                    }
                                    if (class224.field3153 == var11.field963) {
                                        if (var11.method553(124, class282.field4228) != null) {
                                            class263.method1730(-1);
                                            class328.method2062(var11, true, var13, var14, class282.field4228);
                                            class380.field5381[var12] = true;
                                            class282.field4228.method168(arg5, arg1, arg7, arg2);
                                        }
                                        break label605;
                                    }
                                    if (class657.field9228 == var11.field963) {
                                        if (var11.method553(118, class282.field4228) != null) {
                                            class452.method2676(var13, var14, var11, -22348);
                                            class380.field5381[var12] = true;
                                            class282.field4228.method168(arg5, arg1, arg7, arg2);
                                        }
                                        break label605;
                                    }
                                    if (class599.field8477 == var11.field963) {
                                        class361.method2201(var11.field877, var13, (byte) -119, class373.field5324, var14, var11.field967, class282.field4228);
                                        class508.field7177[var12] = true;
                                        class282.field4228.method168(arg5, arg1, arg7, arg2);
                                        break label605;
                                    }
                                    if (class108.field1666 == var11.field963) {
                                        class403.method2455(var11.field967, class282.field4228, var11.field877, (byte) -92, var13, var14);
                                        class508.field7177[var12] = true;
                                        class282.field4228.method168(arg5, arg1, arg7, arg2);
                                        break label605;
                                    }
                                    if (class43.field698 == var11.field963) {
                                        if (!class122.field1830 && !class207.field2913) {
                                            break label605;
                                        }
                                        int var26 = var11.field967 + var13;
                                        int var27 = var14 + 15;
                                        if (class122.field1830) {
                                            int var28 = -256;
                                            if (class697.field9864 < 20) {
                                                var28 = -65536;
                                            }
                                            class563.field7931.method2507(var27, "Fps:" + class697.field9864, -1, var26, -118, var28);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 65536) {
                                                var31 = -65536;
                                                if (class544.field7663) {
                                                    class619.method3444(6);
                                                    for (int var32 = 0; var32 < 10; var32++) {
                                                        System.gc();
                                                    }
                                                    var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                                    if (var30 > 65536) {
                                                        class60.method639(4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 65535);
                                                    }
                                                }
                                            }
                                            class563.field7931.method2507(var27, "Mem:" + var30 + "k", -1, var26, -107, var31);
                                            var27 += 15;
                                            class563.field7931.method2507(var27, "In:" + class131.field1930 + "B/s Out:" + class50.field1027 + "B/s", -1, var26, -116, -256);
                                            var27 += 15;
                                            int var33 = class282.field4228.method147() / 1024;
                                            class563.field7931.method2507(var27, "Offheap:" + var33 + "k", -1, var26, -122, var33 > 65536 ? -65536 : -256);
                                            var27 += 15;
                                            int var34 = 0;
                                            int var35 = 0;
                                            int var36 = 0;
                                            for (int var37 = 0; var37 < 35; var37++) {
                                                if (class174.field2480[var37] != null) {
                                                    var34 += class174.field2480[var37].method817(0);
                                                    var35 += class174.field2480[var37].method820(250);
                                                    var36 += class174.field2480[var37].method818(-92);
                                                }
                                            }
                                            int var38 = var36 * 100 / var34;
                                            int var39 = var35 * 10000 / var34;
                                            String var40 = "Cache:" + class150.method1062((long) var39, true, 0, -3258, 2) + "% (" + var38 + "%)";
                                            class351.field5064.method2507(var27, var40, -1, var26, -127, -256);
                                            var27 += 12;
                                        }
                                        if (class505.field7153 > 0) {
                                            class351.field5064.method2507(var27, "Particles: " + class552.field7830 + " / " + class505.field7153, -1, var26, -113, -256);
                                        }
                                        var27 += 12;
                                        if (class207.field2913) {
                                            class351.field5064.method2507(var27, "Polys: " + class282.field4228.method192() + " Models: " + class282.field4228.method200(), -1, var26, -123, -256);
                                            var27 += 12;
                                            class351.field5064.method2507(var27, "Ls: " + class699.field9886 + " La: " + class20.field226 + " NPC: " + class498.field7054 + " Pl: " + class479.field6801, -1, var26, -110, -256);
                                            var27 += 12;
                                            class443.method2629((byte) 66);
                                        }
                                        class508.field7177[var12] = true;
                                        break label605;
                                    }
                                }
                                if (var11.field980 == 0) {
                                    if (class70.field1247 == var11.field963 && class282.field4228.method127()) {
                                        class282.field4228.method176(var13, var14, var11.field967, var11.field877);
                                    }
                                    method3671(arg0, var22, var25, var12, var14 - var11.field891, var23, var11.field977, var24, var13 - var11.field909, -127);
                                    if (var11.field1014 != null) {
                                        method3671(var11.field1014, var22, var25, var12, var14 - var11.field891, var23, var11.field977, var24, var13 - var11.field909, -127);
                                    }
                                    class320 var41 = (class320) class654.field9178.method1405((long) var11.field977, (byte) -85);
                                    if (var41 != null) {
                                        class693.method3810(var14, true, var23, var22, var25, var12, var24, var41.field4703, var13);
                                    }
                                    if (class70.field1247 == var11.field963 && class282.field4228.method127()) {
                                        class282.field4228.method174();
                                    }
                                    class282.field4228.method168(arg5, arg1, arg7, arg2);
                                }
                                if (class312.field4620[var12] || class700.field9890 > 1) {
                                    if (var11.field980 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field955) {
                                                class282.field4228.method114(var13, var14, var11.field967, var11.field877, var11.field972, 0);
                                            } else {
                                                class282.field4228.method219(var13, var14, var11.field967, var11.field877, var11.field972, 0);
                                            }
                                        } else if (var11.field955) {
                                            class282.field4228.method114(var13, var14, var11.field967, var11.field877, var11.field972 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        } else {
                                            class282.field4228.method219(var13, var14, var11.field967, var11.field877, 255 - (var15 & 0xFF) << 24 | var11.field972 & 0xFFFFFF, 1);
                                        }
                                    } else if (var11.field980 == 4) {
                                        class416 var42 = var11.method565(128, class282.field4228);
                                        if (var42 != null) {
                                            int var43 = var11.field972;
                                            String var44 = var11.field950;
                                            if (var11.field1023 != -1) {
                                                class186 var45 = class41.field682.method2228(var11.field1023, 0);
                                                var44 = var45.field2629;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }
                                                if ((var45.field2684 == 1 || var11.field1017 != 1) && var11.field1017 != -1) {
                                                    var44 = "<col=ff9040>" + var44 + "</col> x" + class389.method2399(var11.field1017, 11);
                                                }
                                            }
                                            if (class37.field634 == var11) {
                                                var44 = class274.field4147.method1804(7175, class512.field7203);
                                                var43 = var11.field972;
                                            }
                                            if (class600.field8481) {
                                                class282.field4228.method107(var13, var14, var11.field967 + var13, var11.field877 + var14);
                                            }
                                            var42.method2500(0, var11.field964, false, var11.field960, var11.field877, var11.field967, var44, var11.field932, var11.field860, var11.field989 ? 255 - (var15 & 0xFF) << 24 : -1, var13, null, var14, 255 - (var15 & 0xFF) << 24 | var43, class258.field3939, 0, null);
                                            if (class600.field8481) {
                                                class282.field4228.method168(arg5, arg1, arg7, arg2);
                                            }
                                        } else if (class334.field4952) {
                                            class563.method3215(true, var11);
                                        }
                                    } else if (var11.field980 == 5) {
                                        if (var11.field979 >= 0) {
                                            var11.method552(class177.field2526, class226.field3182, false).method1025(var11.field877, 0, (byte) -108, var11.field967, var11.field906 << 3, 0, var11.field1003 << 3, class282.field4228, var14, var13);
                                        } else {
                                            class702 var46;
                                            if (var11.field1023 == -1) {
                                                var46 = var11.method556(23, class282.field4228);
                                            } else {
                                                class505 var47 = var11.field911 ? class648.field9106.field6993 : null;
                                                var46 = class41.field682.method2227(var11.field995 | 0xFF000000, var11.field924, var11.field1017, var11.field898, var11.field1023, class282.field4228, var47, -21207);
                                            }
                                            if (var46 != null) {
                                                int var48 = var46.method931();
                                                int var49 = var46.method936();
                                                int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field972 == 0 ? 16777215 : var11.field972 & 0xFFFFFF);
                                                if (var11.field876) {
                                                    class282.field4228.method107(var13, var14, var11.field967 + var13, var14 - -var11.field877);
                                                    if (var11.field1001 != 0) {
                                                        int var51 = (var48 + var11.field967 - 1) / var48;
                                                        int var52 = (var49 + var11.field877 - 1) / var49;
                                                        for (int var53 = 0; var53 < var51; var53++) {
                                                            for (int var54 = 0; var54 < var52; var54++) {
                                                                if (var11.field972 == 0) {
                                                                    var46.method3912((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1001);
                                                                } else {
                                                                    var46.method3907((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1001, 0, var50, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field972 == 0 && var15 == 0) {
                                                        var46.method3911(var13, var14, var11.field967, var11.field877);
                                                    } else {
                                                        var46.method926(var13, var14, var11.field967, var11.field877, 0, var50, 1);
                                                    }
                                                    class282.field4228.method168(arg5, arg1, arg7, arg2);
                                                } else if (var11.field972 == 0 && var15 == 0) {
                                                    if (var11.field1001 != 0) {
                                                        var46.method3912((float) var11.field967 / 2.0F + (float) var13, (float) var11.field877 / 2.0F + (float) var14, var11.field967 * 4096 / var48, var11.field1001);
                                                    } else if (var11.field967 == var48 && var11.field877 == var49) {
                                                        var46.method3916(var13, var14);
                                                    } else {
                                                        var46.method3908(var13, var14, var11.field967, var11.field877);
                                                    }
                                                } else if (var11.field1001 != 0) {
                                                    var46.method3907((float) var11.field967 / 2.0F + (float) var13, (float) var11.field877 / 2.0F + (float) var14, var11.field967 * 4096 / var48, var11.field1001, 0, var50, 1);
                                                } else if (var11.field967 == var48 && var11.field877 == var49) {
                                                    var46.method929(var13, var14, 0, var50, 1);
                                                } else {
                                                    var46.method3909(var13, var14, var11.field967, var11.field877, 0, var50, 1);
                                                }
                                            } else if (class334.field4952) {
                                                class563.method3215(true, var11);
                                            }
                                        }
                                    } else if (var11.field980 == 6) {
                                        class345.method2144((byte) -110);
                                        class55 var55 = null;
                                        int var56 = 0;
                                        if (var11.field1023 != -1) {
                                            class186 var64 = class41.field682.method2228(var11.field1023, 0);
                                            if (var64 != null) {
                                                class186 var65 = var64.method1250(0, var11.field1017);
                                                class30 var66 = var11.field895 == -1 ? null : class188.field2708.method2140(var11.field895, 125);
                                                class505 var67 = var11.field911 ? class648.field9106.field6993 : null;
                                                var55 = var65.method1251(255, var11.field886, 2048, var11.field942, 1, var67, var11.field870, class282.field4228, var66);
                                                if (var55 == null) {
                                                    class563.method3215(true, var11);
                                                } else {
                                                    var56 = -var55.method488() >> 1;
                                                }
                                            }
                                        } else if (var11.field927 == 5) {
                                            int var61 = var11.field1004;
                                            if (var61 >= 0 && var61 < 2048) {
                                                class491 var62 = class141.field2087[var61];
                                                class30 var63 = var11.field895 == -1 ? null : class188.field2708.method2140(var11.field895, 127);
                                                if (var62 != null && (class99.field1551 == var61 || class594.method3365(var62.field6981, 0) == var11.field902)) {
                                                    var55 = var62.field6993.method2905(null, var11.field870, class41.field682, class61.field1163, null, var11.field886, 2048, class282.field4228, -1, 0, class188.field2708, true, class339.field4991, class145.field2120, var63, 0, (byte) -123, var11.field942, class393.field5824);
                                                }
                                            }
                                        } else if (var11.field927 == 8 || var11.field927 == 9) {
                                            class138 var58 = class642.method3576(var11.field1004, (byte) -80, false);
                                            class30 var59 = var11.field895 == -1 ? null : class188.field2708.method2140(var11.field895, 125);
                                            if (var58 != null) {
                                                class505 var60 = var11.field911 ? class648.field9106.field6993 : null;
                                                var55 = var58.method999(var11.field870, var11.field927 == 9, var11.field886, var11.field942, class282.field4228, 2048, (byte) 37, var60, var11.field902, var59);
                                            }
                                        } else if (var11.field895 == -1) {
                                            var55 = var11.method557(class145.field2120, class41.field682, -1, class648.field9106.field6993, null, class339.field4991, -8, 0, 2048, class282.field4228, class188.field2708, -1, class393.field5824, class61.field1163);
                                            if (var55 == null && class334.field4952) {
                                                class563.method3215(true, var11);
                                            }
                                        } else {
                                            class30 var57 = class188.field2708.method2140(var11.field895, 127);
                                            var55 = var11.method557(class145.field2120, class41.field682, var11.field942, class648.field9106.field6993, var57, class339.field4991, -8, var11.field870, 2048, class282.field4228, class188.field2708, var11.field886, class393.field5824, class61.field1163);
                                            if (var55 == null && class334.field4952) {
                                                class563.method3215(true, var11);
                                            }
                                        }
                                        if (var55 != null) {
                                            int var68;
                                            if (var11.field938 > 0) {
                                                var68 = (var11.field967 << 9) / var11.field938;
                                            } else {
                                                var68 = 512;
                                            }
                                            int var69;
                                            if (var11.field865 <= 0) {
                                                var69 = 512;
                                            } else {
                                                var69 = (var11.field877 << 9) / var11.field865;
                                            }
                                            int var70 = var11.field967 / 2 + var13;
                                            int var71 = var11.field877 / 2 + var14;
                                            if (!var11.field946) {
                                                var70 += var11.field962 * var68 >> 9;
                                                var71 += var11.field992 * var69 >> 9;
                                            }
                                            class318.field4690.method271();
                                            class282.field4228.method155(class318.field4690);
                                            class282.field4228.method184(var70, var71, var68, var69);
                                            class282.field4228.method194();
                                            if (var11.field879) {
                                                class282.field4228.method178(false);
                                            }
                                            if (var11.field946) {
                                                class303.field4524.method256(var11.field913);
                                                class303.field4524.method272(var11.field1011);
                                                class303.field4524.method258(var11.field858);
                                                class303.field4524.method270(var11.field962, var11.field992, var11.field974);
                                            } else {
                                                int var72 = (var11.field923 << 2) * class189.field2719[var11.field913 << 3] >> 14;
                                                int var73 = (var11.field923 << 2) * class189.field2721[var11.field913 << 3] >> 14;
                                                class303.field4524.method249(-var11.field858 << 3);
                                                class303.field4524.method272(var11.field1011 << 3);
                                                class303.field4524.method270(var11.field954 << 2, (var11.field859 << 2) + var72 + var56, (var11.field859 << 2) + var73);
                                                class303.field4524.method248(var11.field913 << 3);
                                            }
                                            var11.method554(var55, class303.field4524, class282.field4228, class564.field7962, 126);
                                            if (class600.field8481) {
                                                class282.field4228.method107(var13, var14, var11.field967 + var13, var11.field877 + var14);
                                            }
                                            if (var11.field946) {
                                                if (var11.field901) {
                                                    var55.method495(class303.field4524, null, var11.field923, 1);
                                                } else {
                                                    var55.method513(class303.field4524, null, 1);
                                                    if (var11.field862 != null) {
                                                        class282.field4228.method156(var11.field862.method335());
                                                    }
                                                }
                                            } else if (var11.field901) {
                                                var55.method495(class303.field4524, null, var11.field923 << 2, 1);
                                            } else {
                                                var55.method513(class303.field4524, null, 1);
                                                if (var11.field862 != null) {
                                                    class282.field4228.method156(var11.field862.method335());
                                                }
                                            }
                                            if (class600.field8481) {
                                                class282.field4228.method168(arg5, arg1, arg7, arg2);
                                            }
                                            if (var11.field879) {
                                                class282.field4228.method178(true);
                                            }
                                        }
                                    } else if (var11.field980 == 9) {
                                        int var74;
                                        int var75;
                                        int var76;
                                        int var77;
                                        if (var11.field915) {
                                            var74 = var13;
                                            var75 = var11.field967 + var13;
                                            var76 = var11.field877 + var14;
                                            var77 = var14;
                                        } else {
                                            var76 = var14;
                                            var74 = var13;
                                            var77 = var11.field877 + var14;
                                            var75 = var11.field967 + var13;
                                        }
                                        if (var11.field933 == 1) {
                                            class282.field4228.method149(var74, var76, var75, var77, var11.field972, 0);
                                        } else {
                                            class282.field4228.method159(var74, var76, var75, var77, var11.field972, var11.field933, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!nea", name = "toString", descriptor = "()Ljava/lang/String;", line = 733)
    public final String toString() {
        field9370++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIB)B", line = 747)
    public static final byte method3672(int arg0, int arg1, byte arg2) {
        if (arg2 != -11) {
            return -10;
        }
        field9374++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(CI)Z", line = 766)
    public static final boolean method3673(char arg0, int arg1) {
        field9379++;
        if (arg1 <= 25) {
            return true;
        } else {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I", line = 783)
    public final int method3674(byte arg0) {
        if (arg0 <= 11) {
            method3672(-75, -3, (byte) 73);
        }
        field9375++;
        return this.field9373;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(II)V", line = 798)
    public class664(int arg0, int arg1) {
        this.field9372 = arg1;
        this.field9373 = arg0;
    }
}
