import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class490 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Z")
    public boolean field6808 = true;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public int field6820 = 0;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public int field6810 = -1;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public int field6812 = 128;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public int field6823 = 8;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public int field6809 = 16;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Z")
    public boolean field6822 = true;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public int field6827 = 1190717;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Z")
    public boolean field6828 = false;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public int field6819 = -1;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public int field6830 = 127;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public int field6831 = -1;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "[I")
    public static int[] field6824 = new int[1];

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    public static int field6832 = 0;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public int field6815;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "Luk;")
    public class170 field6816;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "[[[Lht;")
    public static class409[][][] field6821;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIIII[Lcr;)V")
    public static final void method2825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class403[] arg9) {
        field6811++;
        class370.field4984.method572(arg0, arg6, arg2, arg1);
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class403 var11 = arg9[var10];
            if (var11 != null && (var11.field5517 == arg4 || arg4 == -1412584499 && class484.field6735 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class108.field1564[class210.field2871].setBounds(var11.field5438 + arg5, var11.field5537 - -arg7, var11.field5450, var11.field5404);
                    var12 = class210.field2871++;
                } else {
                    var12 = arg8;
                }
                var11.field5501 = var12;
                var11.field5435 = class31.field516;
                if (!client.method1274(var11)) {
                    if (var11.field5468 != 0) {
                        class225.method1412(var11, 123);
                    }
                    int var13 = var11.field5438 + arg5;
                    int var14 = var11.field5537 + arg7;
                    int var15 = var11.field5401;
                    if (class299.field3964 && (client.method1255(var11).field4714 != 0 || var11.field5480 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class484.field6735 == var11) {
                        if (arg4 != -1412584499 && (class379.field5186 == var11.field5523 || class74.field1121 == var11.field5523)) {
                            class54.field859 = arg9;
                            class155.field2266 = arg7;
                            class195.field2712 = arg5;
                            continue;
                        }
                        if (class270.field3544 && class129.field1883) {
                            int var16 = class267.field3526.method1302(-4362);
                            int var17 = class267.field3526.method1297(true);
                            int var18 = var16 - class37.field583;
                            int var19 = var17 - class18.field311;
                            if (class426.field5823 > var18) {
                                var18 = class426.field5823;
                            }
                            if (var18 + var11.field5450 > class426.field5823 + class393.field5317.field5450) {
                                var18 = class393.field5317.field5450 + class426.field5823 - var11.field5450;
                            }
                            if (var19 < class236.field3173) {
                                var19 = class236.field3173;
                            }
                            var13 = var18;
                            if (var11.field5404 + var19 > class236.field3173 + class393.field5317.field5404) {
                                var19 = class393.field5317.field5404 + class236.field3173 - var11.field5404;
                            }
                            var14 = var19;
                        }
                        if (class74.field1121 == var11.field5523) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field5480 == 2) {
                        var24 = arg2;
                        var23 = arg6;
                        var22 = arg0;
                        var25 = arg1;
                    } else {
                        int var20 = var13 + var11.field5450;
                        int var21 = var11.field5404 + var14;
                        var22 = arg0 < var13 ? var13 : arg0;
                        if (var11.field5480 == 9) {
                            var20++;
                            var21++;
                        }
                        var23 = arg6 < var14 ? var14 : arg6;
                        var24 = arg2 <= var20 ? arg2 : var20;
                        var25 = var21 >= arg1 ? arg1 : var21;
                    }
                    if (var24 > var22 && var25 > var23) {
                        if (var11.field5468 != 0) {
                            if (class430.field5890 == var11.field5468 || class228.field3083 == var11.field5468) {
                                class60.method420(var11.field5450, var13, var14, arg3 - 4521, var11.field5404, class228.field3083 == var11.field5468);
                                class204.field2824[var12] = true;
                                class370.field4984.method572(arg0, arg6, arg2, arg1);
                                continue;
                            }
                            if (class299.field3962 == var11.field5468) {
                                if (var11.method2345(-1, class370.field4984) != null) {
                                    class88.method641((byte) 121);
                                    class471.method2677((byte) -124, var11, var14, var13, class370.field4984);
                                    class153.field2231[var12] = true;
                                    class370.field4984.method572(arg0, arg6, arg2, arg1);
                                }
                                continue;
                            }
                            if (class385.field5246 == var11.field5468) {
                                if (var11.method2345(-1, class370.field4984) != null) {
                                    class202.method1291(var13, 113, var11, var14);
                                    class153.field2231[var12] = true;
                                    class370.field4984.method572(arg0, arg6, arg2, arg1);
                                }
                                continue;
                            }
                            if (class405.field5578 == var11.field5468) {
                                class177.method1182(class370.field4984, var14, 0, var11.field5404, var11.field5450, var13, class66.field1022);
                                class204.field2824[var12] = true;
                                class370.field4984.method572(arg0, arg6, arg2, arg1);
                                continue;
                            }
                            if (class23.field408 == var11.field5468) {
                                class335.method1920(var11.field5404, var13, class370.field4984, var14, var11.field5450, (byte) 122);
                                class204.field2824[var12] = true;
                                class370.field4984.method572(arg0, arg6, arg2, arg1);
                                continue;
                            }
                            if (class277.field3628 == var11.field5468) {
                                if (!class290.field3801 && !class140.field2039) {
                                    continue;
                                }
                                int var26 = var11.field5450 + var13;
                                int var27 = var14 + 15;
                                if (class290.field3801) {
                                    class302.field3995.method2820("Fps:" + class374.field5064, 0, -1, var27, var26, -256);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class302.field3995.method2820("Mem:" + var29 + "k", 0, -1, var27, var26, var30);
                                    var27 += 15;
                                    class302.field3995.method2820("In:" + class405.field5577 + "B/s Out:" + class227.field3062 + "B/s", arg3 ^ 0x1133, -1, var27, var26, -256);
                                    var27 += 15;
                                    int var31 = class370.field4984.method518() / 1024;
                                    class302.field3995.method2820("Offheap:" + var31 + "k", 0, -1, var27, var26, var31 <= 65536 ? -256 : -65536);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class28.field477[var35].method2490(true);
                                        var33 += class28.field477[var35].method2498((byte) -83);
                                        var34 += class28.field477[var35].method2500(true);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class485.method2791(2, 0, 46, (long) var37, true) + "% (" + var36 + "%)";
                                    class30.field508.method2820(var38, arg3 - 4403, -1, var27, var26, -256);
                                    var27 += 12;
                                }
                                if (class232.field3128 > 0) {
                                    class30.field508.method2820("Particles: " + class132.field1913 + " / " + class232.field3128, 0, -1, var27, var26, -256);
                                }
                                var27 += 12;
                                if (class140.field2039) {
                                    class30.field508.method2820("Polys: " + class370.field4984.method619() + " Models: " + class370.field4984.method523(), arg3 - 4403, -1, var27, var26, -256);
                                    var27 += 12;
                                    class30.field508.method2820("Ls: " + class514.field7587 + " La: " + class115.field1635 + " NPC: " + class445.field6098 + " Pl: " + class203.field2816, arg3 - 4403, -1, var27, var26, -256);
                                    class471.method2678(65);
                                    var27 += 12;
                                }
                                class204.field2824[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field5480 == 0) {
                            if (class433.field5937 == var11.field5468 && class370.field4984.method581()) {
                                class370.field4984.method602(var13, var14, var11.field5450, var11.field5404);
                            }
                            method2825(var22, var25, var24, arg3, var11.field5431, var13 - var11.field5520, var23, var14 - var11.field5442, var12, arg9);
                            if (var11.field5420 != null) {
                                method2825(var22, var25, var24, 4403, var11.field5431, var13 - var11.field5520, var23, var14 - var11.field5442, var12, var11.field5420);
                            }
                            class301 var39 = (class301) class27.field457.method182((long) var11.field5431, (byte) 94);
                            if (var39 != null) {
                                class292.method1716(var23, var12, var22, arg3 ^ 0xFFFFEEE6, var25, var39.field3982, var13, var14, var24);
                            }
                            if (class433.field5937 == var11.field5468 && class370.field4984.method581()) {
                                class370.field4984.method579();
                                class228.field3080 = true;
                            }
                            class370.field4984.method572(arg0, arg6, arg2, arg1);
                        }
                        if (class110.field1586[var12] || class67.field1030 > 1) {
                            if (var11.field5480 == 3) {
                                if (var15 == 0) {
                                    if (var11.field5493) {
                                        class370.field4984.method585(var13, var14, var11.field5450, var11.field5404, var11.field5436, 0);
                                    } else {
                                        class370.field4984.method614(var13, var14, var11.field5450, var11.field5404, var11.field5436, 0);
                                    }
                                } else if (var11.field5493) {
                                    class370.field4984.method585(var13, var14, var11.field5450, var11.field5404, var11.field5436 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class370.field4984.method614(var13, var14, var11.field5450, var11.field5404, 255 - (var15 & 0xFF) << 24 | var11.field5436 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field5480 == 4) {
                                class489 var40 = var11.method2351(class370.field4984, false);
                                if (var40 != null) {
                                    int var41 = var11.field5436;
                                    String var42 = var11.field5479;
                                    if (var11.field5530 != -1) {
                                        class482 var43 = class127.field1852.method2390(72, var11.field5530);
                                        var42 = var43.field6697;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field6706 == 1 || var11.field5541 != 1) && var11.field5541 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class72.method469(var11.field5541, 0);
                                        }
                                    }
                                    if (class71.field1072 == var11) {
                                        var42 = class421.field5772.method1764(class489.field6789, false);
                                        var41 = var11.field5436;
                                    }
                                    if (class4.field113) {
                                        class370.field4984.method590(var13, var14, var11.field5450 + var13, var11.field5404 + var14);
                                    }
                                    var40.method2807(var11.field5552 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field5406, var14, var11.field5414, var11.field5534, var11.field5450, 0, 255 - (var15 & 0xFF) << 24 | var41, 0, var13, null, var42, class514.field7590, var11.field5404, null, 0, var11.field5465);
                                    if (class4.field113) {
                                        class370.field4984.method572(arg0, arg6, arg2, arg1);
                                    }
                                } else if (class128.field1862) {
                                    class412.method2378(var11, (byte) -113);
                                }
                            } else if (var11.field5480 == 5) {
                                if (var11.field5518 < 0) {
                                    class529 var44;
                                    if (var11.field5530 == -1) {
                                        var44 = var11.method2342(class370.field4984, (byte) 115);
                                    } else {
                                        class480 var45 = var11.field5461 ? class385.field5232.field7627 : null;
                                        var44 = class127.field1852.method2392(class370.field4984, var11.field5541, var11.field5489 | 0xFF000000, (byte) 118, var11.field5499, var11.field5416, var11.field5530, var45);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method151();
                                        int var47 = var44.method149();
                                        int var48 = (var11.field5436 == 0 ? 16777215 : var11.field5436 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field5408) {
                                            class370.field4984.method590(var13, var14, var11.field5450 + var13, var11.field5404 + var14);
                                            if (var11.field5529 != 0) {
                                                int var49 = (-(-var46 - var11.field5450) - 1) / var46;
                                                int var50 = (var47 + var11.field5404 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field5436 == 0) {
                                                            var44.method3113((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field5529);
                                                        } else {
                                                            var44.method3110((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field5529, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field5436 == 0 && var15 == 0) {
                                                var44.method3115(var13, var14, var11.field5450, var11.field5404);
                                            } else {
                                                var44.method159(var13, var14, var11.field5450, var11.field5404, 0, var48, 1);
                                            }
                                            class370.field4984.method572(arg0, arg6, arg2, arg1);
                                        } else if (var11.field5436 == 0 && var15 == 0) {
                                            if (var11.field5529 != 0) {
                                                var44.method3113((float) var11.field5450 / 2.0F + (float) var13, (float) var11.field5404 / 2.0F + (float) var14, var11.field5450 * 4096 / var46, var11.field5529);
                                            } else if (var11.field5450 == var46 && var11.field5404 == var47) {
                                                var44.method3109(var13, var14);
                                            } else {
                                                var44.method3114(var13, var14, var11.field5450, var11.field5404);
                                            }
                                        } else if (var11.field5529 != 0) {
                                            var44.method3110((float) var11.field5450 / 2.0F + (float) var13, (float) var11.field5404 / 2.0F + (float) var14, var11.field5450 * 4096 / var46, var11.field5529, 0, var48, 1);
                                        } else if (var11.field5450 == var46 && var11.field5404 == var47) {
                                            var44.method158(var13, var14, 0, var48, 1);
                                        } else {
                                            var44.method155(var13, var14, var11.field5450, var11.field5404, 0, var48, 1);
                                        }
                                    } else if (class128.field1862) {
                                        class412.method2378(var11, (byte) -126);
                                    }
                                } else {
                                    var11.method2343(true, class520.field7700, class389.field5280).method774(var11.field5450, class370.field4984, 0, arg3 ^ 0x114A, var13, var14, var11.field5498 << 3, 0, var11.field5458 << 3, var11.field5404);
                                }
                            } else if (var11.field5480 == 6) {
                                class252.method1520(-118);
                                class121 var53 = null;
                                int var54 = 0;
                                if (var11.field5530 != -1) {
                                    class482 var62 = class127.field1852.method2390(52, var11.field5530);
                                    if (var62 != null) {
                                        class482 var63 = var62.method2767(var11.field5541, -122);
                                        class5 var64 = var11.field5415 == -1 ? null : class423.field5791.method1601(var11.field5415, (byte) -124);
                                        class480 var65 = var11.field5461 ? class385.field5232.field7627 : null;
                                        var53 = var63.method2784(var64, var11.field5484, var65, 1, var11.field5477, class370.field4984, (byte) -124, 2048, var11.field5543);
                                        if (var53 == null) {
                                            class412.method2378(var11, (byte) -125);
                                        } else {
                                            var54 = -var53.method861() >> 1;
                                        }
                                    }
                                } else if (var11.field5516 == 5) {
                                    int var55 = var11.field5510;
                                    if (var55 >= 0 && var55 < 2048) {
                                        class515 var56 = class499.field6901[var55];
                                        class5 var57 = var11.field5415 == -1 ? null : class423.field5791.method1601(var11.field5415, (byte) -115);
                                        if (var56 != null && (class391.field5305 == var55 || class177.method1184(0, var56.field7638) == var11.field5419)) {
                                            var53 = var56.field7627.method2757(class301.field3980, var11.field5543, var57, 0, -1, null, 0, class127.field1852, class206.field2849, true, 2048, null, var11.field5484, class291.field3825, class370.field4984, class423.field5791, class204.field2828, var11.field5477, -1);
                                        }
                                    }
                                } else if (var11.field5516 == 8 || var11.field5516 == 9) {
                                    class32 var59 = class222.method1397(false, var11.field5510, false);
                                    class5 var60 = var11.field5415 == -1 ? null : class423.field5791.method1601(var11.field5415, (byte) -128);
                                    if (var59 != null) {
                                        class480 var61 = var11.field5461 ? class385.field5232.field7627 : null;
                                        var53 = var59.method254(-105, var11.field5516 == 9, var11.field5484, 2048, var11.field5419, var61, var11.field5543, var60, var11.field5477, class370.field4984);
                                    }
                                } else if (var11.field5415 == -1) {
                                    var53 = var11.method2341(2048, -1, class291.field3825, 0, class385.field5232.field7627, -1, class127.field1852, class370.field4984, null, class206.field2849, class423.field5791, -1, class301.field3980, class204.field2828);
                                    if (var53 == null && class128.field1862) {
                                        class412.method2378(var11, (byte) -114);
                                    }
                                } else {
                                    class5 var58 = class423.field5791.method1601(var11.field5415, (byte) -114);
                                    var53 = var11.method2341(2048, arg3 - 4404, class291.field3825, var11.field5477, class385.field5232.field7627, var11.field5543, class127.field1852, class370.field4984, var58, class206.field2849, class423.field5791, var11.field5484, class301.field3980, class204.field2828);
                                    if (var53 == null && class128.field1862) {
                                        class412.method2378(var11, (byte) -125);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field5496 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field5450 << 9) / var11.field5496;
                                    }
                                    int var67;
                                    if (var11.field5561 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field5404 << 9) / var11.field5561;
                                    }
                                    int var68 = var11.field5450 / 2 + (var13 + (var11.field5524 * var66 >> 9));
                                    int var69 = var11.field5404 / 2 + var14 + (var11.field5421 * var67 >> 9);
                                    class130.field1895.method964();
                                    class370.field4984.method603(class130.field1895);
                                    class370.field4984.method573(var68, var69, var66, var67);
                                    class370.field4984.method568((float) (var11.field5423 << 0), var11.field5508 ? (float) (var11.field5507 << 0) : (float) (var11.field5507 << 0) * 1.5F);
                                    if (arg4 == -1412584499 || class228.field3080) {
                                        class370.field4984.method539();
                                        class370.field4984.method600();
                                        class370.field4984.method572(arg0, arg6, arg2, arg1);
                                        class228.field3080 = false;
                                    }
                                    if (var11.field5513) {
                                        class370.field4984.method525(false);
                                    }
                                    int var70 = (var11.field5434 << 0) * class305.field4019[var11.field5556 << 3] >> 15;
                                    int var71 = (var11.field5434 << 0) * class305.field4022[var11.field5556 << 3] >> 15;
                                    class141.field2045.method969(-var11.field5457 << 3);
                                    class141.field2045.method961(var11.field5546 << 3);
                                    class141.field2045.method970(var11.field5405 << 0, (var11.field5527 << 0) + var54 + var70, (var11.field5527 << 0) + var71);
                                    class141.field2045.method966(var11.field5556 << 3);
                                    if (class4.field113) {
                                        class370.field4984.method590(var13, var14, var11.field5450 + var13, var14 - -var11.field5404);
                                    }
                                    if (var11.field5508) {
                                        var53.method857(class141.field2045, null, var11.field5434 << 0, 1);
                                    } else {
                                        var53.method853(class141.field2045, null, 1);
                                    }
                                    if (class4.field113) {
                                        class370.field4984.method572(arg0, arg6, arg2, arg1);
                                    }
                                    if (var11.field5513) {
                                        class370.field4984.method525(true);
                                    }
                                    class370.field4984.method568(0.0F, 0.0F);
                                }
                            } else if (var11.field5480 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field5494) {
                                    var72 = var13 + var11.field5450;
                                    var73 = var13;
                                    var74 = var11.field5404 + var14;
                                    var75 = var14;
                                } else {
                                    var72 = var11.field5450 + var13;
                                    var73 = var13;
                                    var74 = var14;
                                    var75 = var11.field5404 + var14;
                                }
                                if (var11.field5548 == 1) {
                                    class370.field4984.method563(var73, var74, var72, var75, var11.field5436, 0);
                                } else {
                                    class370.field4984.method580(var73, var74, var72, var75, var11.field5436, var11.field5548, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != 4403) {
            method2830((byte) -2);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static final void method2826(int arg0) {
        field6814++;
        for (class322 var1 = (class322) class157.field2287.method1672((byte) -98); var1 != null; var1 = (class322) class157.field2287.method1668(-1)) {
            if (var1.field4217 > 0) {
                var1.field4217--;
            }
            if (var1.field4217 != 0) {
                if (var1.field4226 > 0) {
                    var1.field4226--;
                }
                if (var1.field4226 == 0 && var1.field4224 >= 1 && var1.field4228 >= 1 && var1.field4224 <= (class12.field251 - 2) && var1.field4228 <= class289.field3782 - 2 && (var1.field4223 < 0 || class372.method2152(var1.field4218, (byte) -105, var1.field4223))) {
                    class37.method290((byte) -100, var1.field4228, var1.field4222, var1.field4218, var1.field4223, var1.field4215, var1.field4227, -1, var1.field4224);
                    var1.field4226 = -1;
                    if (var1.field4223 == var1.field4213 && var1.field4213 == -1) {
                        var1.method300(false);
                    } else if (var1.field4223 == var1.field4213 && var1.field4227 == var1.field4214 && var1.field4219 == var1.field4218) {
                        var1.method300(false);
                    }
                }
            } else if (var1.field4213 < 0 || class372.method2152(var1.field4219, (byte) -105, var1.field4213)) {
                class37.method290((byte) -100, var1.field4228, var1.field4222, var1.field4219, var1.field4213, var1.field4215, var1.field4214, -1, var1.field4224);
                var1.method300(false);
            }
        }
        if (arg0 < 40) {
            field6821 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method2827(byte arg0) {
        field6824 = null;
        if (arg0 != -67) {
            method2827((byte) -46);
        }
        field6821 = null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public final void method2828(int arg0) {
        if (arg0 != 1) {
            return;
        }
        if (this.field6831 == -1) {
            this.field6831 = this.field6810;
        }
        this.field6823 = this.field6823 << 8 | this.field6815;
        field6817++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lmd;B)V")
    public final void method2829(class379 arg0, byte arg1) {
        field6829++;
        if (arg1 != 45) {
            field6824 = null;
        }
        while (true) {
            int var3 = arg0.method2238(arg1 ^ 0xD2);
            if (var3 == 0) {
                return;
            }
            this.method2831(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method2830(byte arg0) {
        field6818++;
        String var1 = "www";
        if (class281.field3698 == class22.field389) {
            var1 = "www-wtrc";
        } else if (class281.field3698 == class152.field2203) {
            var1 = "www-wtqa";
        } else if (class339.field4426 == class281.field3698) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class88.field1341 != null) {
            var2 = "/p=" + class88.field1341;
        }
        if (arg0 < 69) {
            method2825(-102, -32, 67, 106, -48, -77, -49, 2, -115, null);
        }
        return "http://" + var1 + "." + class155.field2265.field3144 + ".com/l=" + class489.field6789 + "/a=" + class213.field2891 + var2 + "/";
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILmd;)V")
    private final void method2831(boolean arg0, int arg1, class379 arg2) {
        field6825++;
        if (arg1 == 1) {
            this.field6820 = class294.method1720((byte) -101, arg2.method2249((byte) 58));
        } else if (arg1 == 2) {
            this.field6810 = arg2.method2238(255);
        } else if (arg1 == 3) {
            this.field6810 = arg2.method2212((byte) 83);
            if (this.field6810 == 65535) {
                this.field6810 = -1;
            }
        } else if (arg1 == 5) {
            this.field6822 = false;
        } else if (arg1 == 7) {
            this.field6819 = class294.method1720((byte) -101, arg2.method2249((byte) 115));
        } else if (arg1 == 8) {
            this.field6816.field2489 = this.field6815;
        } else if (arg1 == 9) {
            this.field6812 = arg2.method2212((byte) 83) << 0;
        } else if (arg1 == 10) {
            this.field6808 = false;
        } else if (arg1 == 11) {
            this.field6823 = arg2.method2238(255);
        } else if (arg1 == 12) {
            this.field6828 = true;
        } else if (arg1 == 13) {
            this.field6827 = arg2.method2249((byte) 126);
        } else if (arg1 == 14) {
            this.field6809 = arg2.method2238(255);
        } else if (arg1 == 15) {
            this.field6831 = arg2.method2212((byte) 83);
            if (this.field6831 == 65535) {
                this.field6831 = -1;
            }
        } else if (arg1 == 16) {
            this.field6830 = arg2.method2238(255);
        }
        if (!arg0) {
            this.field6822 = true;
        }
    }
}
