import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class239 extends class129 {

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    private final int field4330;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private final int field4322;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    private final int field4319;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private final int field4329;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lcc;")
    private static class209 field4315 = class95.method669(114, "level: ");

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lcc;")
    public static class209 field4316 = field4315;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lcc;")
    private static class209 field4318 = class95.method669(84, "");

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lcc;")
    public static class209 field4325 = field4318;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Ljf;")
    public static class64 field4320;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIII)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4330 = arg2;
        this.field4322 = arg3;
        this.field4319 = arg1;
        this.field4329 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIZIII)V")
    public static final void method1655(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class44.field887 = arg1;
        class279.field4922 = arg6;
        if (arg0 >= -32) {
            field4325 = null;
        }
        class76.field1424 = arg5;
        ++field4332;
        class132.field2519 = arg2;
        class274.field4857 = arg4;
        if (arg3 && ~class279.field4922 <= -101) {
            class103.field1990 = class76.field1424 * 128 + 64;
            class60.field1213 = class274.field4857 * 128 + 64;
            class183.field3312 = class94.method661(class103.field1990, 19452, class99.field1937, class60.field1213) + -class44.field887;
        }
        class16.field334 = 2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method1656(byte arg0) {
        field4315 = null;
        field4320 = null;
        field4318 = null;
        field4325 = null;
        field4316 = null;
        if (arg0 <= 17) {
            field4320 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        ++field4331;
        int var4 = this.field4330 * arg1 >> 12;
        int var5 = this.field4329 * arg1 >> 12;
        int var6 = this.field4319 * arg2 >> 12;
        int var7 = this.field4322 * arg2 >> 12;
        if (arg0 > -106) {
            field4328 = 35;
        }
        class31.method254(var4, -125, var7, super.field2481, var5, var6);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI[Lga;)V")
    public static final void method1657(boolean arg0, int arg1, class170[] arg2) {
        ++field4326;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; ~var6 > -105; ++var6) {
                        if (~(class285.field5023[var4][var5][var6] & 1) == -2) {
                            int var7 = var4;
                            if ((class285.field5023[1][var5][var6] & 2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1173(var6, -124, var5);
                            }
                        }
                    }
                }
            }
            class271.field4807 += (int) (Math.random() * 5.0D) + -2;
            class213.field3852 += (int) (Math.random() * 5.0D) + -2;
            if (class271.field4807 < -16) {
                class271.field4807 = -16;
            }
            if (class213.field3852 < -8) {
                class213.field3852 = -8;
            }
            if (class213.field3852 > 8) {
                class213.field3852 = 8;
            }
            if (~class271.field4807 < -17) {
                class271.field4807 = 16;
            }
        }
        int var8 = class213.field3852 >> 2 << 10;
        int var9 = class271.field4807 >> 1;
        if (arg1 <= 83) {
            field4325 = null;
        }
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; ~var3 < ~var12; ++var12) {
            byte[][] var51 = class80.field1497[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; ++var54) {
                for (int var100 = 1; ~var100 > -104; ++var100) {
                    byte var101 = 74;
                    int var102 = class271.field4803[var12][var100 + 1][var54] - class271.field4803[var12][var100 + -1][var54];
                    int var103 = class271.field4803[var12][var100][var54 + 1] + -class271.field4803[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + (var102 * var102 - -65536)));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var51[var100][var54 + -1] >> 2) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54] >> 1) + (var51[var100 - -1][var54] >> 3) + (var51[var100 + -1][var54] >> 2);
                    int var107 = (var102 << 8) / var104;
                    int var108 = -65536 / var104;
                    int var109 = (var105 * -50 + var107 * -50 + var108 * -10) / var53 + var101;
                    var11[var100][var54] = -var106 + var109;
                }
            }
            for (int var55 = 0; var55 < 104; ++var55) {
                class249.field4483[var55] = 0;
                class234.field4219[var55] = 0;
                class79.field1464[var55] = 0;
                class159.field2900[var55] = 0;
                class158.field2889[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; ++var56) {
                for (int var85 = 0; var85 < 104; ++var85) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = 255 & class284.field5009[var12][var94][var85];
                        if (~var95 < -1) {
                            class44 var96 = class90.method642(-82, var95 - 1);
                            class249.field4483[var85] += var96.field889;
                            class234.field4219[var85] += var96.field874;
                            class79.field1464[var85] += var96.field875;
                            class159.field2900[var85] += var96.field886;
                            var10002 = class158.field2889[var85]++;
                        }
                    }
                    int var97 = var56 + -5;
                    if (var97 >= 0) {
                        int var98 = 255 & class284.field5009[var12][var97][var85];
                        if (~var98 < -1) {
                            class44 var99 = class90.method642(-80, var98 - 1);
                            class249.field4483[var85] -= var99.field889;
                            class234.field4219[var85] -= var99.field874;
                            class79.field1464[var85] -= var99.field875;
                            class159.field2900[var85] -= var99.field886;
                            var10002 = class158.field2889[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; ++var91) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var89 += class159.field2900[var92];
                            var88 += class79.field1464[var92];
                            var86 += class234.field4219[var92];
                            var90 += class158.field2889[var92];
                            var87 += class249.field4483[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var87 -= class249.field4483[var93];
                            var89 -= class159.field2900[var93];
                            var88 -= class79.field1464[var93];
                            var86 -= class234.field4219[var93];
                            var90 -= class158.field2889[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class67.method488(2, var88 / var90, var86 / var90, var87 * 256 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; ++var57) {
                for (int var58 = 1; ~var58 > -104; ++var58) {
                    if (arg0 || class186.method1273(56) || (class285.field5023[0][var57][var58] & 2) != 0 || (16 & class285.field5023[var12][var57][var58]) == 0 && ~class58.method449(var58, var12, var57, -4537) == ~class167.field3005) {
                        if (~var12 > ~class84.field1669) {
                            class84.field1669 = var12;
                        }
                        int var59 = 255 & class284.field5009[var12][var57][var58];
                        int var60 = 255 & class47.field914[var12][var57][var58];
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class271.field4803[var12][var57][var58];
                            int var62 = class271.field4803[var12][var57 + 1][var58];
                            int var63 = class271.field4803[var12][var57][var58 + 1];
                            int var64 = class271.field4803[var12][var57 - -1][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (~var59 == -1 && class14.field266[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class148.method1030(var60 + -1, 3).field2835) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var64 && ~var61 == ~var63) {
                                    class97.field1887[var12][var57][var58] = class6.method63(class97.field1887[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (~var59 >= -1) {
                                var66 = -1;
                                var67 = 0;
                            } else {
                                var66 = var10[var57][var58];
                                int var68 = (var66 & 127) + var9;
                                if (~var68 <= -1) {
                                    if (~var68 < -128) {
                                        var68 = 127;
                                    }
                                } else {
                                    var68 = 0;
                                }
                                int var69 = (64512 & var66 - -var8) + (var66 & 896) + var68;
                                var67 = class15.field288[class258.method1791(var69, 96, -22053)];
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57][var58 + 1];
                            int var73 = var11[var57 + 1][var58 + 1];
                            if (var60 != 0) {
                                int var74 = class14.field266[var12][var57][var58] - -1;
                                byte var75 = class44.field868[var12][var57][var58];
                                class155 var76 = class148.method1030(var60 + -1, 3);
                                int var77 = var76.field2834;
                                if (var77 >= 0 && !class15.field271.method1614(var77, (byte) 41)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class15.field288[class8.method79((byte) -116, class15.field271.method1620(var77, (byte) -69), 96)];
                                } else if (~var76.field2837 != 0) {
                                    var78 = var76.field2837;
                                    int var80 = (var78 & 127) + var9;
                                    if (~var80 > -1) {
                                        var80 = 0;
                                    } else if (~var80 < -128) {
                                        var80 = 127;
                                    }
                                    int var81 = (64512 & var78 - -var8) + (var78 & 896) + var80;
                                    var79 = class15.field288[class8.method79((byte) -120, var81, 96)];
                                } else {
                                    var79 = 0;
                                    var78 = -2;
                                }
                                if (~var76.field2849 <= -1) {
                                    int var82 = var76.field2849;
                                    int var83 = (127 & var82) + var9;
                                    if (var83 >= 0) {
                                        if (var83 > 127) {
                                            var83 = 127;
                                        }
                                    } else {
                                        var83 = 0;
                                    }
                                    int var84 = (var82 & 896) + ((64512 & var8 + var82) - -var83);
                                    var79 = class15.field288[class8.method79((byte) -125, var84, 96)];
                                }
                                class6.method61(var12, var57, var58, var74, var75, var77, var61, var62, var64, var63, class258.method1791(var66, var70, -22053), class258.method1791(var66, var71, -22053), class258.method1791(var66, var73, -22053), class258.method1791(var66, var72, -22053), class8.method79((byte) -124, var78, var70), class8.method79((byte) -126, var78, var71), class8.method79((byte) -113, var78, var73), class8.method79((byte) -113, var78, var72), var67, var79);
                            } else {
                                class6.method61(var12, var57, var58, 0, 0, -1, var61, var62, var64, var63, class258.method1791(var66, var70, -22053), class258.method1791(var66, var71, -22053), class258.method1791(var66, var73, -22053), class258.method1791(var66, var72, -22053), 0, 0, 0, 0, var67, 0);
                            }
                        }
                    }
                }
            }
            class284.field5009[var12] = null;
            class47.field914[var12] = null;
            class14.field266[var12] = null;
            class44.field868[var12] = null;
            class80.field1497[var12] = null;
        }
        class238.method1652(-50, -10, -50);
        if (!arg0) {
            for (int var13 = 0; ~var13 > -105; ++var13) {
                for (int var50 = 0; var50 < 104; ++var50) {
                    if ((2 & class285.field5023[1][var13][var50]) == 2) {
                        class231.method1612(var13, var50);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -5; ++var14) {
                for (int var15 = 0; ~var15 >= -105; ++var15) {
                    for (int var16 = 0; ~var16 >= -105; ++var16) {
                        if ((1 & class97.field1887[var14][var16][var15]) != 0) {
                            int var17;
                            for (var17 = var15; ~var17 < -1 && ~(class97.field1887[var14][var16][var17 + -1] & 1) != -1; --var17) {
                            }
                            int var18;
                            for (var18 = var15; ~var18 > -105 && ~(1 & class97.field1887[var14][var16][var18 + 1]) != -1; ++var18) {
                            }
                            int var19 = var14;
                            int var20;
                            label353: for (var20 = var14; var20 > 0; --var20) {
                                for (int var21 = var17; ~var18 <= ~var21; ++var21) {
                                    if (~(1 & class97.field1887[var20 + -1][var16][var21]) == -1) {
                                        break label353;
                                    }
                                }
                            }
                            label342: while (~var19 > -4) {
                                for (int var22 = var17; ~var22 >= ~var18; ++var22) {
                                    if (~(1 & class97.field1887[var19 + 1][var16][var22]) == -1) {
                                        break label342;
                                    }
                                }
                                ++var19;
                            }
                            int var23 = (var18 - var17 + 1) * (var19 + 1 + -var20);
                            if (var23 >= 8) {
                                int var24 = class271.field4803[var20][var16][var17];
                                short var25 = 240;
                                int var26 = class271.field4803[var19][var16][var17] + -var25;
                                class190.method1306(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var24);
                                for (int var27 = var20; ~var19 <= ~var27; ++var27) {
                                    for (int var28 = var17; ~var28 >= ~var18; ++var28) {
                                        class97.field1887[var27][var16][var28] = class27.method220(class97.field1887[var27][var16][var28], -2);
                                    }
                                }
                            }
                        }
                        if ((class97.field1887[var14][var16][var15] & 2) != 0) {
                            int var29;
                            for (var29 = var16; ~var29 < -1 && (2 & class97.field1887[var14][var29 + -1][var15]) != 0; --var29) {
                            }
                            int var30;
                            for (var30 = var16; ~var30 > -105 && ~(class97.field1887[var14][var30 + 1][var15] & 2) != -1; ++var30) {
                            }
                            int var31 = var14;
                            int var32;
                            label408: for (var32 = var14; var32 > 0; --var32) {
                                for (int var33 = var29; ~var30 <= ~var33; ++var33) {
                                    if (~(2 & class97.field1887[var32 + -1][var33][var15]) == -1) {
                                        break label408;
                                    }
                                }
                            }
                            label397: while (var31 < 3) {
                                for (int var34 = var29; ~var34 >= ~var30; ++var34) {
                                    if (~(2 & class97.field1887[var31 + 1][var34][var15]) == -1) {
                                        break label397;
                                    }
                                }
                                ++var31;
                            }
                            int var35 = (var30 - var29 + 1) * (-var32 + var31 + 1);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class271.field4803[var32][var29][var15];
                                int var38 = class271.field4803[var31][var29][var15] + -var36;
                                class190.method1306(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                                for (int var39 = var32; ~var31 <= ~var39; ++var39) {
                                    for (int var40 = var29; ~var30 <= ~var40; ++var40) {
                                        class97.field1887[var39][var40][var15] = class27.method220(class97.field1887[var39][var40][var15], -3);
                                    }
                                }
                            }
                        }
                        if ((class97.field1887[var14][var16][var15] & 4) != 0) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43;
                            for (var43 = var15; ~var43 < -1 && ~(class97.field1887[var14][var16][var43 + -1] & 4) != -1; --var43) {
                            }
                            int var44;
                            for (var44 = var15; var44 < 104 && ~(class97.field1887[var14][var16][var44 + 1] & 4) != -1; ++var44) {
                            }
                            label463: while (var41 > 0) {
                                for (int var45 = var43; var45 <= var44; ++var45) {
                                    if (~(4 & class97.field1887[var14][var41 + -1][var45]) == -1) {
                                        break label463;
                                    }
                                }
                                --var41;
                            }
                            label452: while (~var42 > -105) {
                                for (int var46 = var43; var46 <= var44; ++var46) {
                                    if ((class97.field1887[var14][var42 + 1][var46] & 4) == 0) {
                                        break label452;
                                    }
                                }
                                ++var42;
                            }
                            if (~((var44 - -1 + -var43) * (var42 + 1 + -var41)) <= -5) {
                                int var47 = class271.field4803[var14][var41][var43];
                                class190.method1306(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 - -128, var47, var47);
                                for (int var48 = var41; ~var42 <= ~var48; ++var48) {
                                    for (int var49 = var43; var44 >= var49; ++var49) {
                                        class97.field1887[var14][var48][var49] = class27.method220(class97.field1887[var14][var48][var49], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; ~var31 > -105; ++var31) {
                class277.field4883[var12][var31] = 0;
                class50.field997[var12][var31] = 99999999;
            }
        }
        ++field4327;
        class277.field4883[arg3][arg5] = 99;
        class50.field997[arg3][arg5] = 0;
        int var13 = arg3;
        int var14 = arg5;
        byte var15 = 0;
        int var16 = 0;
        class195.field3499[var15] = arg3;
        int var32 = var15 + 1;
        class265.field4756[var15] = arg5;
        int[][] var17 = class122.field2404[class99.field1937].field3103;
        boolean var18 = false;
        while (var32 != var16) {
            var13 = class195.field3499[var16];
            var14 = class265.field4756[var16];
            var16 = 4095 & var16 + 1;
            if (arg6 == var13 && arg7 == var14) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((~arg0 > -6 || ~arg0 == -11) && class122.field2404[class99.field1937].method1178(var14, arg6, arg0 + -1, var13, (byte) 83, arg11, arg7, 2)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class122.field2404[class99.field1937].method1174(arg7, var14, 2, arg11, arg6, (byte) 92, arg0 + -1, var13)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg4 != -1 && ~arg10 != -1 && class122.field2404[class99.field1937].method1175(arg4, var14, arg7, arg10, var13, arg9, arg6, (byte) 124, 2)) {
                var18 = true;
                break;
            }
            int var30 = class50.field997[var13][var14] + 1;
            if (~var13 < -1 && ~class277.field4883[var13 + -1][var14] == -1 && ~(var17[var13 + -1][var14] & 19661070) == -1 && (var17[var13 + -1][var14 + 1] & 19661112) == 0) {
                class195.field3499[var32] = var13 - 1;
                class265.field4756[var32] = var14;
                class277.field4883[var13 + -1][var14] = 2;
                class50.field997[var13 + -1][var14] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (var13 < 102 && class277.field4883[var13 + 1][var14] == 0 && (19661187 & var17[var13 - -2][var14]) == 0 && (var17[var13 + 2][var14 + 1] & 19661280) == 0) {
                class195.field3499[var32] = var13 + 1;
                class265.field4756[var32] = var14;
                var32 = var32 + 1 & 4095;
                class277.field4883[var13 + 1][var14] = 8;
                class50.field997[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class277.field4883[var13][var14 + -1] == 0 && (var17[var13][var14 + -1] & 19661070) == 0 && (var17[var13 + 1][var14 + -1] & 19661187) == 0) {
                class195.field3499[var32] = var13;
                class265.field4756[var32] = var14 + -1;
                var32 = var32 - -1 & 4095;
                class277.field4883[var13][var14 + -1] = 1;
                class50.field997[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && ~class277.field4883[var13][var14 + 1] == -1 && (19661112 & var17[var13][var14 + 2]) == 0 && ~(19661280 & var17[var13 + 1][var14 + 2]) == -1) {
                class195.field3499[var32] = var13;
                class265.field4756[var32] = var14 - -1;
                var32 = 4095 & var32 + 1;
                class277.field4883[var13][var14 + 1] = 4;
                class50.field997[var13][var14 - -1] = var30;
            }
            if (~var13 < -1 && ~var14 < -1 && class277.field4883[var13 - 1][var14 + -1] == 0 && ~(19661112 & var17[var13 + -1][var14]) == -1 && (19661070 & var17[var13 + -1][var14 + -1]) == 0 && (19661187 & var17[var13][var14 + -1]) == 0) {
                class195.field3499[var32] = var13 - 1;
                class265.field4756[var32] = var14 - 1;
                var32 = 4095 & var32 + 1;
                class277.field4883[var13 + -1][var14 - 1] = 3;
                class50.field997[var13 - 1][var14 + -1] = var30;
            }
            if (~var13 > -103 && var14 > 0 && class277.field4883[var13 + 1][var14 - 1] == 0 && ~(var17[var13 + 1][var14 + -1] & 19661070) == -1 && (var17[var13 - -2][var14 - 1] & 19661187) == 0 && (var17[var13 + 2][var14] & 19661280) == 0) {
                class195.field3499[var32] = var13 + 1;
                class265.field4756[var32] = var14 + -1;
                var32 = var32 + 1 & 4095;
                class277.field4883[var13 + 1][var14 - 1] = 9;
                class50.field997[var13 - -1][var14 + -1] = var30;
            }
            if (var13 > 0 && var14 < 102 && ~class277.field4883[var13 + -1][var14 + 1] == -1 && (var17[var13 + -1][var14 + 1] & 19661070) == 0 && (19661112 & var17[var13 - 1][var14 + 2]) == 0 && (19661280 & var17[var13][var14 + 2]) == 0) {
                class195.field3499[var32] = var13 + -1;
                class265.field4756[var32] = var14 + 1;
                class277.field4883[var13 + -1][var14 + 1] = 6;
                class50.field997[var13 + -1][var14 + 1] = var30;
                var32 = 4095 & var32 - -1;
            }
            if (~var13 > -103 && ~var14 > -103 && ~class277.field4883[var13 - -1][var14 - -1] == -1 && (var17[var13 + 1][var14 + 2] & 19661112) == 0 && ~(19661280 & var17[var13 + 2][var14 - -2]) == -1 && (var17[var13 + 2][var14 + 1] & 19661187) == 0) {
                class195.field3499[var32] = var13 - -1;
                class265.field4756[var32] = var14 + 1;
                class277.field4883[var13 + 1][var14 - -1] = 12;
                class50.field997[var13 - -1][var14 + 1] = var30;
                var32 = 4095 & var32 + 1;
            }
        }
        class48.field922 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg6; ~(arg6 + var21) <= ~var22; ++var22) {
                for (int var23 = -var21 + arg7; arg7 + var21 >= var23; ++var23) {
                    if (~var22 <= -1 && ~var23 <= -1 && ~var22 > -105 && ~var23 > -105 && ~class50.field997[var22][var23] > -101) {
                        int var24 = 0;
                        if (var22 >= arg6) {
                            if (var22 > arg4 + arg6 + -1) {
                                var24 = -arg6 + 1 + var22 + -arg4;
                            }
                        } else {
                            var24 = -var22 + arg6;
                        }
                        int var25 = 0;
                        if (arg7 > var23) {
                            var25 = -var23 + arg7;
                        } else if (~(arg7 + arg10 - 1) > ~var23) {
                            var25 = -arg7 + -arg10 + 1 + var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (~var19 < ~var26 || var19 == var26 && var20 > class50.field997[var22][var23]) {
                            var13 = var22;
                            var14 = var23;
                            var20 = class50.field997[var22][var23];
                            var19 = var26;
                        }
                    }
                }
            }
            if (~var19 == -1001) {
                return false;
            }
            if (~arg3 == ~var13 && ~arg5 == ~var14) {
                return false;
            }
            class48.field922 = 1;
        }
        byte var27 = 0;
        class195.field3499[var27] = var13;
        int var33 = var27 + 1;
        class265.field4756[var27] = var14;
        int var28;
        int var29 = var28 = class277.field4883[var13][var14];
        while (arg3 != var13 || ~arg5 != ~var14) {
            if (~var28 != ~var29) {
                class195.field3499[var33] = var13;
                class265.field4756[var33++] = var14;
                var28 = var29;
            }
            if (~(2 & var29) != -1) {
                ++var13;
            } else if (~(var29 & 8) != -1) {
                --var13;
            }
            if (~(var29 & 1) != -1) {
                ++var14;
            } else if ((var29 & 4) != 0) {
                --var14;
            }
            var29 = class277.field4883[var13][var14];
        }
        if (~var33 < arg2) {
            class124.method903(20948, arg1, var33);
            return true;
        } else if (~arg1 == -2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method96(int arg0, int arg1, int arg2) {
        int var4 = -85 % ((37 - arg2) / 32);
        ++field4317;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)Lcc;")
    public static final class209 method1659(boolean arg0, int arg1, int arg2) {
        if (arg1 != 10) {
            method1657(false, 48, (class170[]) null);
        }
        ++field4324;
        return class206.method1404(arg0, arg2, 39, 10);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        ++field4323;
        if (arg1 != 100) {
            method1656((byte) 93);
        }
    }
}
