import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class367 extends class101 {

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "I")
    public int field5334 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
    public int field5337 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gha", name = "t", descriptor = "I")
    public int field5339 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "I")
    public int field5338 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gha", name = "x", descriptor = "I")
    public int field5343 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gha", name = "u", descriptor = "I")
    public int field5340 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gha", name = "y", descriptor = "I")
    public int field5344 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gha", name = "w", descriptor = "I")
    public int field5342 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gha", name = "v", descriptor = "Ldm;")
    public class57 field5341;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZIIIIIIII[Lor;)V")
    public static final void method2292(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class668[] arg10) {
        class379.field5542.method456(arg3, arg2, arg5, arg0);
        field5333++;
        for (int var11 = 0; var11 < arg10.length; var11++) {
            class668 var12 = arg10[var11];
            if (var12 != null && (var12.field9336 == arg6 || arg6 == -1412584499 && class437.field6161 == var12)) {
                int var13 = var12.field9242 + arg8;
                int var14 = var12.field9257 + arg7;
                int var15 = var12.field9282 + var13 + 1;
                int var16 = var12.field9297 + var14 + 1;
                int var17;
                if (arg9 == -1) {
                    class296.field4291[class131.field1940].setBounds(var12.field9242 + arg8, var12.field9257 + arg7, var12.field9282, var12.field9297);
                    var17 = class131.field1940++;
                } else {
                    var17 = arg9;
                }
                var12.field9342 = class100.field1401;
                var12.field9351 = var17;
                if (!client.method2008(var12)) {
                    if (var12.field9271 != 0) {
                        class665.method3685(var12, (byte) 9);
                    }
                    int var18 = var12.field9242 + arg8;
                    int var19 = var12.field9257 + arg7;
                    int var20 = 0;
                    int var21 = 0;
                    if (class130.field1934) {
                        var20 = class550.method3117(99);
                        var21 = class621.method3410(-2);
                    }
                    int var22 = var12.field9395;
                    if (class688.field9683 && (client.method2022(var12).field1521 != 0 || var12.field9353 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class437.field6161 == var12) {
                        if (arg6 != -1412584499 && (class4.field45 == var12.field9233 || class453.field6298 == var12.field9233)) {
                            class569.field7578 = arg8;
                            class723.field10062 = arg10;
                            class45.field681 = arg7;
                            continue;
                        }
                        if (class376.field5470 && class662.field9134) {
                            int var23 = var20 + class304.field4371.method778(arg4 ^ 0x7800);
                            int var24 = class304.field4371.method777((byte) -116) + var21;
                            int var25 = var23 - class94.field1338;
                            int var26 = var24 - class662.field9145;
                            if (class473.field6523 > var25) {
                                var25 = class473.field6523;
                            }
                            if (class473.field6523 + class613.field8311.field9282 < var12.field9282 + var25) {
                                var25 = class473.field6523 + class613.field8311.field9282 - var12.field9282;
                            }
                            if (class691.field9689 > var26) {
                                var26 = class691.field9689;
                            }
                            var18 = var25;
                            if (var12.field9297 + var26 > class691.field9689 + class613.field8311.field9297) {
                                var26 = class691.field9689 + class613.field8311.field9297 - var12.field9297;
                            }
                            var19 = var26;
                        }
                        if (class453.field6298 == var12.field9233) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field9353 == 2) {
                        var29 = arg2;
                        var32 = arg5;
                        var31 = arg0;
                        var30 = arg3;
                    } else {
                        int var27 = var12.field9282 + var18;
                        int var28 = var12.field9297 + var19;
                        var29 = var19 <= arg2 ? arg2 : var19;
                        if (var12.field9353 == 9) {
                            var28++;
                            var27++;
                        }
                        var30 = var18 > arg3 ? var18 : arg3;
                        var31 = var28 >= arg0 ? arg0 : var28;
                        var32 = arg5 <= var27 ? arg5 : var27;
                    }
                    if (var32 > var30 && var29 < var31) {
                        if (var12.field9271 != 0) {
                            if (class630.field8816 == var12.field9271 || class279.field4116 == var12.field9271) {
                                class289.method1837(var18, var19, 55, var12);
                                if (!class130.field1934) {
                                    class526.method3037((byte) 44, var18, class279.field4116 == var12.field9271, var19, var12.field9282, var12.field9297);
                                    class379.field5542.method456(arg3, arg2, arg5, arg0);
                                }
                                class627.field8773[var17] = true;
                                continue;
                            }
                            if (class172.field2302 == var12.field9271) {
                                if (var12.method3697(0, class379.field5542) != null) {
                                    class230.method1508((byte) -89);
                                    class670.method3728(class379.field5542, var18, var12, var19, 10);
                                    class756.field10500[var17] = true;
                                    class379.field5542.method456(arg3, arg2, arg5, arg0);
                                    if (class130.field1934) {
                                        if (arg1) {
                                            class716.method4001(var15, (byte) -102, var16, var14, var13);
                                        } else {
                                            class602.method3349(false, var13, var15, var16, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class130.field1936 == var12.field9271) {
                                class514.method2987(var12, (byte) -33, class379.field5542, var19, var18);
                                continue;
                            }
                            if (class376.field5463 == var12.field9271) {
                                class187.method1300(var18, class379.field5542, false, var12.field9290 % 64, var12, var19);
                                continue;
                            }
                            if (class277.field4110 == var12.field9271) {
                                if (var12.method3697(arg4 ^ 0x7800, class379.field5542) != null) {
                                    class621.method3409(var18, false, var12, var19);
                                    class756.field10500[var17] = true;
                                    class379.field5542.method456(arg3, arg2, arg5, arg0);
                                    if (class130.field1934) {
                                        if (arg1) {
                                            class716.method4001(var15, (byte) -102, var16, var14, var13);
                                        } else {
                                            class602.method3349(false, var13, var15, var16, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class307.field4445 == var12.field9271) {
                                class735.method4075(class691.field9695, (byte) 127, var18, var12.field9297, class379.field5542, var12.field9282, var19);
                                class627.field8773[var17] = true;
                                class379.field5542.method456(arg3, arg2, arg5, arg0);
                                continue;
                            }
                            if (class52.field756 == var12.field9271) {
                                class526.method3034(121, var19, class379.field5542, var18, var12.field9282, var12.field9297);
                                class627.field8773[var17] = true;
                                class379.field5542.method456(arg3, arg2, arg5, arg0);
                                continue;
                            }
                            if (class49.field733 == var12.field9271) {
                                if (!class605.field8216 && !class260.field3871) {
                                    continue;
                                }
                                int var33 = var12.field9282 + var18;
                                if (class130.field1934) {
                                    if (arg1) {
                                        class716.method4001(var15, (byte) -102, var16, var14, var13);
                                    } else {
                                        class602.method3349(false, var13, var15, var16, var14);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class605.field8216) {
                                    int var35 = -256;
                                    if (class549.field7446 < 20) {
                                        var35 = -65536;
                                    }
                                    class105.field1452.method569(var35, "Fps:" + class549.field7446, -1, var33, var34, -1);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class733.field10172) {
                                            class166.method1197(false);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class780.method4307((byte) 96, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4);
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class105.field1452.method569(var38, "Mem:" + var37 + "k", -1, var33, var34, -1);
                                    var34 += 15;
                                    class105.field1452.method569(-256, "In:" + class376.field5465 + "B/s Out:" + class172.field2298 + "B/s", -1, var33, var34, -1);
                                    var34 += 15;
                                    int var40 = class379.field5542.method567() / 1024;
                                    class105.field1452.method569(var40 > 65536 ? -65536 : -256, "Offheap:" + var40 + "k", -1, var33, var34, -1);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class391.field5761[var44] != null) {
                                            var41 += class391.field5761[var44].method1968(arg4 - 25235);
                                            var42 += class391.field5761[var44].method1962((byte) 113);
                                            var43 += class391.field5761[var44].method1964(arg4 ^ 0x7800);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class463.method2743(true, (long) var46, 0, 2, -1262897456) + "% (" + var45 + "%)";
                                    class541.field7353.method569(-256, var47, -1, var33, var34, arg4 - 30721);
                                    var34 += 12;
                                }
                                if (class491.field6814 > 0) {
                                    class541.field7353.method569(-256, "Particles: " + class489.field6780 + " / " + class491.field6814, -1, var33, var34, arg4 ^ 0xFFFF87FF);
                                }
                                var34 += 12;
                                if (class260.field3871) {
                                    class541.field7353.method569(-256, "Polys: " + class379.field5542.method490() + " Models: " + class379.field5542.method453(), -1, var33, var34, -1);
                                    var34 += 12;
                                    class541.field7353.method569(-256, "Ls: " + class608.field8273 + " La: " + class487.field6739 + " NPC: " + class619.field8341 + " Pl: " + class227.field3106, -1, var33, var34, arg4 ^ 0xFFFF87FF);
                                    class769.method4256(91);
                                    var34 += 12;
                                }
                                class627.field8773[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field9353 == 0) {
                            if (class520.field7120 == var12.field9271 && class379.field5542.method461()) {
                                class379.field5542.method516(var18, var19, var12.field9282, var12.field9297);
                            }
                            method2292(var31, arg1, var29, var30, 30720, var32, var12.field9221, var19 - var12.field9247, -var12.field9374 + var18, var17, arg10);
                            if (var12.field9289 != null) {
                                method2292(var31, arg1, var29, var30, 30720, var32, var12.field9221, var19 - var12.field9247, var18 - var12.field9374, var17, var12.field9289);
                            }
                            class237 var48 = (class237) class609.field8283.method3953((long) var12.field9221, arg4 ^ 0x780E);
                            if (var48 != null) {
                                class704.method3942(var31, var30, var32, arg4 ^ 0x7800, var17, var48.field3202, var18, var29, var19);
                            }
                            if (class520.field7120 == var12.field9271 && class379.field5542.method461()) {
                                class379.field5542.method568();
                            }
                            class379.field5542.method456(arg3, arg2, arg5, arg0);
                        }
                        if (class555.field7488[var17] || class322.field4710 > 1) {
                            if (var12.field9353 == 3) {
                                if (var22 == 0) {
                                    if (var12.field9330) {
                                        class379.field5542.method563(var18, var19, var12.field9282, var12.field9297, var12.field9290, 0);
                                    } else {
                                        class379.field5542.method538(var18, var19, var12.field9282, var12.field9297, var12.field9290, 0);
                                    }
                                } else if (var12.field9330) {
                                    class379.field5542.method563(var18, var19, var12.field9282, var12.field9297, var12.field9290 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                } else {
                                    class379.field5542.method538(var18, var19, var12.field9282, var12.field9297, 255 - (var22 & 0xFF) << 24 | var12.field9290 & 0xFFFFFF, 1);
                                }
                                if (class130.field1934) {
                                    if (arg1) {
                                        class716.method4001(var15, (byte) -102, var16, var14, var13);
                                    } else {
                                        class602.method3349(false, var13, var15, var16, var14);
                                    }
                                }
                            } else if (var12.field9353 == 4) {
                                class66 var49 = var12.method3705(arg4 ^ 0xFFFF87A5, class379.field5542);
                                if (var49 != null) {
                                    int var50 = var12.field9290;
                                    String var51 = var12.field9339;
                                    if (var12.field9283 != -1) {
                                        class322 var52 = class770.field10602.method2467(120, var12.field9283);
                                        var51 = var52.field4668;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field4658 == 1 || var12.field9343 != 1) && var12.field9343 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class403.method2513(var12.field9343, true);
                                        }
                                    }
                                    if (var12.field9241 != -1) {
                                        var51 = class605.method3355(var12.field9241, 85);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class189.field2524 == var12) {
                                        var51 = class474.field6570.method2780(arg4 ^ 0x7878, class38.field589);
                                        var50 = var12.field9290;
                                    }
                                    if (class104.field1438) {
                                        class379.field5542.method556(var18, var19, var12.field9282 + var18, var12.field9297 + var19);
                                    }
                                    var49.method582(var19, var12.field9352, var12.field9288, var12.field9321, var12.field9282, var18, var12.field9254 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field9263, var51, null, var50 | 255 - (var22 & 0xFF) << 24, class416.field5975, 0, 0, 0, null, var12.field9297);
                                    if (class104.field1438) {
                                        class379.field5542.method456(arg3, arg2, arg5, arg0);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class104.field1438) {
                                            class255 var53 = class279.method1806(var12.field9302, true, class379.field5542);
                                            int var54 = var53.method1701((byte) -121, var51, var12.field9282, class416.field5975);
                                            int var55 = var53.method1704(true, var12.field9282, var51, class416.field5975, var12.field9321);
                                            if (class130.field1934) {
                                                if (arg1) {
                                                    class716.method4001(var18 + var54, (byte) -102, var19 + var55, var19, var18);
                                                } else {
                                                    class602.method3349(false, var18, var18 + var54, var19 - -var55, var19);
                                                }
                                            }
                                        } else if (class130.field1934) {
                                            if (arg1) {
                                                class716.method4001(var15, (byte) -102, var16, var14, var13);
                                            } else {
                                                class602.method3349(false, var13, var15, var16, var14);
                                            }
                                        }
                                    }
                                } else if (class213.field2812) {
                                    class763.method4242(var12, true);
                                }
                            } else if (var12.field9353 == 5) {
                                if (var12.field9327 < 0) {
                                    class147 var56;
                                    if (var12.field9283 != -1) {
                                        class691 var57 = var12.field9275 ? class551.field7456.field1050 : null;
                                        var56 = class770.field10602.method2474(var12.field9268, var12.field9234, (byte) 16, var57, var12.field9231 | 0xFF000000, var12.field9343, class379.field5542, var12.field9283);
                                    } else if (var12.field9241 == -1) {
                                        var56 = var12.method3710((byte) -112, class379.field5542);
                                    } else {
                                        var56 = method2293(var12.field9241, 31214, class379.field5542);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method1096();
                                        int var59 = var56.method1106();
                                        int var60 = (var12.field9290 == 0 ? 16777215 : var12.field9290 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                        if (var12.field9281) {
                                            class379.field5542.method556(var18, var19, var12.field9282 + var18, var12.field9297 + var19);
                                            if (var12.field9260 != 0) {
                                                int var61 = (var12.field9282 + var58 - 1) / var58;
                                                int var62 = (var12.field9297 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field9290 == 0) {
                                                            var56.method1109((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field9260);
                                                        } else {
                                                            var56.method1097((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field9260, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field9290 == 0 && var22 == 0) {
                                                var56.method1111(var18, var19, var12.field9282, var12.field9297);
                                            } else {
                                                var56.method1095(var18, var19, var12.field9282, var12.field9297, 0, var60, 1);
                                            }
                                            class379.field5542.method456(arg3, arg2, arg5, arg0);
                                        } else if (var12.field9290 == 0 && var22 == 0) {
                                            if (var12.field9260 != 0) {
                                                var56.method1109((float) var12.field9282 / 2.0F + (float) var18, (float) var12.field9297 / 2.0F + (float) var19, var12.field9282 * 4096 / var58, var12.field9260);
                                            } else if (var12.field9282 == var58 && var12.field9297 == var59) {
                                                var56.method1102(var18, var19);
                                            } else {
                                                var56.method1101(var18, var19, var12.field9282, var12.field9297);
                                            }
                                        } else if (var12.field9260 != 0) {
                                            var56.method1097((float) var12.field9282 / 2.0F + (float) var18, (float) var12.field9297 / 2.0F + (float) var19, var12.field9282 * 4096 / var58, var12.field9260, 0, var60, 1);
                                        } else if (var12.field9282 == var58 && var12.field9297 == var59) {
                                            var56.method1086(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method1104(var18, var19, var12.field9282, var12.field9297, 0, var60, 1);
                                        }
                                    } else if (class213.field2812) {
                                        class763.method4242(var12, true);
                                    }
                                } else {
                                    var12.method3713(class457.field6339, class563.field7548, -65536).method3948(-105, var12.field9278 << 3, class379.field5542, 0, var18, var12.field9253 << 3, var12.field9282, var19, var12.field9297, 0);
                                }
                                if (class130.field1934) {
                                    if (arg1) {
                                        class716.method4001(var15, (byte) -102, var16, var14, var13);
                                    } else {
                                        class602.method3349(false, var13, var15, var16, var14);
                                    }
                                }
                            } else if (var12.field9353 == 6) {
                                class442.method2662((byte) 35);
                                Object var65 = null;
                                class500 var66 = null;
                                int var67 = 0;
                                if (var12.field9283 != -1) {
                                    class322 var68 = class770.field10602.method2467(120, var12.field9283);
                                    if (var68 != null) {
                                        class322 var69 = var68.method2047(var12.field9343, (byte) 31);
                                        class489 var70 = var12.field9218 == -1 ? null : class6.field65.method1034(var12.field9218, arg4 ^ 0x7800);
                                        class691 var71 = var12.field9275 ? class551.field7456.field1050 : null;
                                        var66 = var69.method2049(2048, var12.field9315, arg4 ^ 0x7805, var70, var12.field9323, var12.field9264, class379.field5542, var71, 1);
                                        if (var66 == null) {
                                            class763.method4242(var12, true);
                                        } else {
                                            var67 = -var66.method335() >> 1;
                                        }
                                    }
                                } else if (var12.field9230 == 5) {
                                    int var76 = var12.field9348;
                                    if (var76 >= 0 && var76 < 2048) {
                                        class73 var77 = class599.field8149[var76];
                                        class489 var78 = var12.field9218 == -1 ? null : class6.field65.method1034(var12.field9218, arg4 - 30720);
                                        if (var77 != null && (class363.field5292 == var76 || class497.method2874((byte) -128, var77.field1020) == var12.field9273)) {
                                            var66 = var77.field1050.method3833(class6.field65, class719.field10024, class382.field5602, var12.field9264, class381.field5566, class364.field5309, class770.field10602, var12.field9315, -1, 0, (byte) 56, null, 2048, var78, 0, null, class379.field5542, 0, true, var12.field9323, null);
                                        }
                                    }
                                } else if (var12.field9230 == 8 || var12.field9230 == 9) {
                                    class166 var73 = class389.method2461((byte) 24, var12.field9348, false);
                                    class489 var74 = var12.field9218 == -1 ? null : class6.field65.method1034(var12.field9218, arg4 - 30720);
                                    if (var73 != null) {
                                        class691 var75 = var12.field9275 ? class551.field7456.field1050 : null;
                                        var66 = var73.method1195(2048, var12.field9323, true, var12.field9273, var12.field9315, var74, var12.field9230 == 9, var75, class379.field5542, var12.field9264);
                                    }
                                } else if (var12.field9218 == -1) {
                                    var66 = var12.method3715(class6.field65, class379.field5542, (byte) 42, class364.field5309, 0, null, class551.field7456.field1050, class719.field10024, (class407) var65, class770.field10602, -1, 2048, class382.field5602, class381.field5566, -1);
                                    if (var66 == null && class213.field2812) {
                                        class763.method4242(var12, true);
                                    }
                                } else {
                                    class489 var72 = class6.field65.method1034(var12.field9218, 0);
                                    var66 = var12.method3715(class6.field65, class379.field5542, (byte) 72, class364.field5309, var12.field9323, var72, class551.field7456.field1050, class719.field10024, (class407) var65, class770.field10602, var12.field9264, 2048, class382.field5602, class381.field5566, var12.field9315);
                                    if (var66 == null && class213.field2812) {
                                        class763.method4242(var12, true);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field9301 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field9282 << 9) / var12.field9301;
                                    }
                                    int var80;
                                    if (var12.field9358 > 0) {
                                        var80 = (var12.field9297 << 9) / var12.field9358;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var18 + (var12.field9282 / 2);
                                    int var82 = var19 + (var12.field9297 / 2);
                                    if (!var12.field9365) {
                                        var81 += var12.field9259 * var79 >> 9;
                                        var82 += var12.field9303 * var80 >> 9;
                                    }
                                    class334.field4865.method967();
                                    class379.field5542.method526(class334.field4865);
                                    class379.field5542.method540(var81, var82, var79, var80);
                                    class379.field5542.method483();
                                    if (var12.field9335) {
                                        class379.field5542.method474(false);
                                    }
                                    if (var12.field9365) {
                                        class176.field2342.method972(var12.field9300);
                                        class176.field2342.method969(var12.field9299);
                                        class176.field2342.method968(var12.field9246);
                                        class176.field2342.method970(var12.field9259, var12.field9303, var12.field9385);
                                    } else {
                                        int var83 = (var12.field9324 << 2) * class749.field10324[var12.field9300 << 3] >> 14;
                                        int var84 = (var12.field9324 << 2) * class749.field10316[var12.field9300 << 3] >> 14;
                                        class176.field2342.method976(-var12.field9246 << 3);
                                        class176.field2342.method969(var12.field9299 << 3);
                                        class176.field2342.method970(var12.field9356 << 2, (var12.field9217 << 2) + var67 + var83, var84 - -(var12.field9217 << 2));
                                        class176.field2342.method978(var12.field9300 << 3);
                                    }
                                    var12.method3709(class379.field5542, var66, (byte) 90, class176.field2342, class100.field1401);
                                    if (class104.field1438) {
                                        class379.field5542.method556(var18, var19, var18 + var12.field9282, var19 - -var12.field9297);
                                    }
                                    if (var12.field9365) {
                                        if (var12.field9243) {
                                            var66.method300(class176.field2342, null, var12.field9324, 1);
                                        } else {
                                            var66.method292(class176.field2342, null, 1);
                                            if (var12.field9251 != null) {
                                                class379.field5542.method524(var12.field9251.method3675());
                                            }
                                        }
                                    } else if (var12.field9243) {
                                        var66.method300(class176.field2342, null, var12.field9324 << 2, 1);
                                    } else {
                                        var66.method292(class176.field2342, null, 1);
                                        if (var12.field9251 != null) {
                                            class379.field5542.method524(var12.field9251.method3675());
                                        }
                                    }
                                    if (class104.field1438) {
                                        class379.field5542.method456(arg3, arg2, arg5, arg0);
                                    }
                                    if (var12.field9335) {
                                        class379.field5542.method474(true);
                                    }
                                }
                                if (class130.field1934) {
                                    if (arg1) {
                                        class716.method4001(var15, (byte) -102, var16, var14, var13);
                                    } else {
                                        class602.method3349(false, var13, var15, var16, var14);
                                    }
                                }
                            } else if (var12.field9353 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field9284) {
                                    var88 = var18;
                                    var86 = var12.field9297 + var19;
                                    var87 = var19;
                                    var85 = var12.field9282 + var18;
                                } else {
                                    var85 = var12.field9282 + var18;
                                    var86 = var19;
                                    var87 = var12.field9297 + var19;
                                    var88 = var18;
                                }
                                if (var12.field9347 == 1) {
                                    class379.field5542.method559(var88, var86, var85, var87, var12.field9290, 0);
                                } else {
                                    class379.field5542.method564(var88, var86, var85, var87, var12.field9290, var12.field9347, 0);
                                }
                                if (class130.field1934) {
                                    if (arg1) {
                                        class716.method4001(var15, (byte) -102, var16, var14, var13);
                                    } else {
                                        class602.method3349(false, var13, var15, var16, var14);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != 30720) {
            method2292(121, false, 93, 32, 41, 103, 22, -4, -6, -91, null);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IILha;)Lvr;")
    private static final class147 method2293(int arg0, int arg1, class65 arg2) {
        if (arg1 != 31214) {
            method2293(15, 6, null);
        }
        field5336++;
        class150 var3 = (class150) class507.field7007.method3953((long) arg0, arg1 ^ 0x79E0);
        if (var3 != null) {
            class687 var4 = var3.field2082.method2721(38);
            var3.field2085 = true;
            if (var4 != null) {
                return var4.method3816(96, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBI)Z")
    public final boolean method2294(int arg0, byte arg1, int arg2) {
        int var4 = 98 / ((arg1 - 48) / 50);
        field5335++;
        if (arg2 >= this.field5340 && arg2 <= this.field5334 && this.field5342 <= arg0 && this.field5337 >= arg0) {
            return true;
        } else {
            return this.field5344 <= arg2 && arg2 <= this.field5338 && this.field5339 <= arg0 && this.field5343 >= arg0;
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Ldm;)V")
    public class367(class57 arg0) {
        this.field5341 = arg0;
    }
}
