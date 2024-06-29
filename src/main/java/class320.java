import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class320 {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lce;")
    private static class126 field5483 = class206.method1445(-7923, "Loading fonts )2 ");

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field5481 = 0;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lce;")
    public static class126 field5485 = class206.method1445(-7923, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lce;")
    public static class126 field5488 = field5483;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[[[I")
    public static int[][][] field5486;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V", line = 6)
    public static final void method2228(int arg0, int arg1, int arg2) {
        if (class244.field4133 != arg1) {
            class29.field406 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class29.field406[var3] = (var3 << 12) / arg1;
            }
            class321.field5490 = arg1 - 1;
            class244.field4133 = arg1;
            class165.field2951 = arg1 == 64 ? 2048 : 4096;
        }
        field5480++;
        if (class143.field2599 != arg0) {
            if (class244.field4133 == arg0) {
                class122.field2038 = class29.field406;
            } else {
                class122.field2038 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class122.field2038[var4] = (var4 << 12) / arg0;
                }
            }
            class314.field5378 = arg0 - 1;
            class143.field2599 = arg0;
        }
        if (arg2 > -29) {
            method2229(-121, 117, -47);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)Lmb;", line = 64)
    public static final class107 method2229(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        return var3 == null ? null : var3.field49;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI[Lsh;)V", line = 73)
    public static final void method2230(boolean arg0, int arg1, class32[] arg2) {
        field5484++;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class301.field4992[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class301.field4992[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method158(var5, var6, 2097152);
                            }
                        }
                    }
                }
            }
            class200.field3409 += (int) (Math.random() * 5.0D) - 2;
            class172.field3045 += (int) (Math.random() * 5.0D) - 2;
            if (class200.field3409 < -16) {
                class200.field3409 = -16;
            }
            if (class172.field3045 < -8) {
                class172.field3045 = -8;
            }
            if (class172.field3045 > 8) {
                class172.field3045 = 8;
            }
            if (class200.field3409 > 16) {
                class200.field3409 = 16;
            }
        }
        if (arg1 <= 63) {
            method2229(-120, 48, -94);
        }
        int var8 = class172.field3045 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class200.field3409 >> 1;
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class122.field2036[var12];
            if (!class56.field846) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class264.field4396[var12][var17 + 1][var16] - class264.field4396[var12][var17 - 1][var16];
                        int var20 = class264.field4396[var12][var17][var16 + 1] - class264.field4396[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var19 * var19 + ((var20 * var20) + 65536)));
                        int var22 = (var19 << 8) / var21;
                        int var23 = (var20 << 8) / var21;
                        int var24 = -65536 / var21;
                        int var25 = (var22 * -50 + var23 * -50 + var24 * -10) / var15 + var18;
                        int var26 = (var13[var17][var16] >> 1) + ((var13[var17 - 1][var16] >> 2) + (var13[var17 + 1][var16] >> 3) - (-(var13[var17][var16 + -1] >> 2) - (var13[var17][var16 + 1] >> 3)));
                        var9[var17][var16] = var25 - var26;
                    }
                }
            } else if (class249.field4166) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        int var45 = (var13[var44][var43 - 1] >> 2) + (var13[var44 + 1][var43] >> 3) + (var13[var44 + -1][var43] >> 2) + ((var13[var44][var43 + 1] >> 3) - -(var13[var44][var43] >> 1));
                        byte var46 = 74;
                        var9[var44][var43] = var46 - var45;
                    }
                }
            } else {
                int var27 = (int) class235.field3959[0];
                int var28 = (int) class235.field3959[1];
                int var29 = (int) class235.field3959[2];
                int var30 = (int) Math.sqrt((double) (var28 * var28 + (var27 * var27 + (var29 * var29))));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        int var34 = class264.field4396[var12][var33 + 1][var32] - class264.field4396[var12][var33 - 1][var32];
                        int var35 = class264.field4396[var12][var33][var32 + 1] - class264.field4396[var12][var33][var32 - 1];
                        byte var36 = 96;
                        int var37 = (int) Math.sqrt((double) (var34 * var34 + (var35 * var35) + 65536));
                        int var38 = (var34 << 8) / var37;
                        int var39 = (var13[var33 + 1][var32] >> 3) + (var13[var33][var32 - 1] >> 2) + (var13[var33][var32] >> 1) + (var13[var33][var32 + 1] >> 3) + (var13[var33 - 1][var32] >> 2);
                        int var40 = -65536 / var37;
                        int var41 = (var35 << 8) / var37;
                        int var42 = (var29 * var41 + var27 * var38 + var28 * var40) / var31 + var36;
                        var9[var33][var32] = var42 - ((int) ((float) var39 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class218.field3659[var47] = 0;
                class294.field4906[var47] = 0;
                class4.field32[var47] = 0;
                class259.field4347[var47] = 0;
                class259.field4354[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class172.field3048[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class224 var52 = class9.method53(var51 - 1, 27993);
                            class218.field3659[var49] += var52.field3781;
                            class294.field4906[var49] += var52.field3778;
                            class4.field32[var49] += var52.field3775;
                            class259.field4347[var49] += var52.field3782;
                            var10002 = class259.field4354[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class172.field3048[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class224 var55 = class9.method53(var54 - 1, 27993);
                            class218.field3659[var49] -= var55.field3781;
                            class294.field4906[var49] -= var55.field3778;
                            class4.field32[var49] -= var55.field3775;
                            class259.field4347[var49] -= var55.field3782;
                            var10002 = class259.field4354[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var56 += class294.field4906[var62];
                            var60 += class259.field4354[var62];
                            var58 += class4.field32[var62];
                            var59 += class259.field4347[var62];
                            var57 += class218.field3659[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var57 -= class218.field3659[var63];
                            var56 -= class294.field4906[var63];
                            var58 -= class4.field32[var63];
                            var60 -= class259.field4354[var63];
                            var59 -= class259.field4347[var63];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var11[var48][var61] = class103.method704(30924, var58 / var60, var57 * 256 / var59, var56 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label770: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg0 || class22.method109(4096) || (class301.field4992[0][var64][var65] & 0x2) != 0 || (class301.field4992[var12][var64][var65] & 0x10) == 0 && class265.method1791(var65, 25460, var64, var12) == class297.field4944) {
                        if (var12 < class245.field4147) {
                            class245.field4147 = var12;
                        }
                        int var66 = class172.field3048[var12][var64][var65] & 0xFF;
                        int var67 = class65.field1103[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class264.field4396[var12][var64 + 1][var65];
                            int var69 = class264.field4396[var12][var64][var65];
                            int var70 = class264.field4396[var12][var64][var65 + 1];
                            int var71 = class264.field4396[var12][var64 + 1][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class122.field2042[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class111.method734(var67 - 1, false).field1460) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var71 && var69 == var70) {
                                    class119.field2003[var12][var64][var65] = class221.method1516(class119.field2003[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var66 > 0) {
                                var73 = var11[var64][var65];
                                int var74 = (var73 & 0x7F) + var10;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class236.field3979[class107.method711(96, var75, (byte) -4)];
                            } else {
                                var73 = -1;
                                var76 = 0;
                            }
                            int var77 = var9[var64][var65];
                            int var78 = var9[var64 + 1][var65];
                            int var79 = var9[var64][var65 + 1];
                            int var80 = var9[var64 + 1][var65 + 1];
                            if (var67 == 0) {
                                class17.method97(var12, var64, var65, 0, 0, -1, var69, var68, var71, var70, class107.method711(var77, var73, (byte) -4), class107.method711(var78, var73, (byte) -4), class107.method711(var80, var73, (byte) -4), class107.method711(var79, var73, (byte) -4), 0, 0, 0, 0, var76, 0);
                                if (class56.field846 && var12 > 0 && var73 != -1 && class9.method53(var66 - 1, 27993).field3774) {
                                    class66.method476(0, 0, true, false, var64, var65, var69 - class264.field4396[0][var64][var65], -class264.field4396[0][var64 + 1][var65] + var68, var71 - class264.field4396[0][var64 + 1][var65 + 1], -class264.field4396[0][var64][var65 + 1] + var70);
                                }
                                if (class56.field846 && !arg0 && class166.field2959 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class65.field1103[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class94 var84 = class111.method734(var83 - 1, false);
                                                    if (var84.field1476 != -1 && class236.field3987.method598(true, var84.field1476) == 4) {
                                                        class166.field2959[var64][var65] = (var84.field1465 << 24) + var84.field1479;
                                                        continue label770;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var85 = class122.field2042[var12][var64][var65] + 1;
                                byte var86 = class17.field238[var12][var64][var65];
                                class94 var87 = class111.method734(var67 - 1, false);
                                if (class56.field846 && !arg0 && class166.field2959 != null && var12 == 0) {
                                    if (var87.field1476 != -1 && class236.field3987.method598(true, var87.field1476) == 4) {
                                        class166.field2959[var64][var65] = (var87.field1465 << 24) + var87.field1479;
                                    } else {
                                        label751: for (int var88 = var64 - 1; var88 <= var64 + 1; var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class65.field1103[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class94 var91 = class111.method734(var90 - 1, false);
                                                        if (var91.field1476 != -1 && class236.field3987.method598(true, var91.field1476) == 4) {
                                                            class166.field2959[var64][var65] = (var91.field1465 << 24) + var91.field1479;
                                                            break label751;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field1476;
                                if (var92 >= 0 && !class236.field3987.method599(96, var92)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var93 = class236.field3979[class157.method1149(96, false, class236.field3987.method597(var92, (byte) -98))];
                                    var94 = -1;
                                } else if (var87.field1468 == -1) {
                                    var93 = 0;
                                    var94 = -2;
                                } else {
                                    var94 = var87.field1468;
                                    int var95 = (var94 & 0x7F) + var10;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var94 + var8 & 0xFC00) + (var94 & 0x380) + var95;
                                    var93 = class236.field3979[class157.method1149(96, false, var96)];
                                }
                                if (var87.field1464 >= 0) {
                                    int var97 = var87.field1464;
                                    int var98 = (var97 & 0x7F) + var10;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var97 + var8 & 0xFC00) + (var97 & 0x380) + var98;
                                    var93 = class236.field3979[class157.method1149(96, false, var99)];
                                }
                                class17.method97(var12, var64, var65, var85, var86, var92, var69, var68, var71, var70, class107.method711(var77, var73, (byte) -4), class107.method711(var78, var73, (byte) -4), class107.method711(var80, var73, (byte) -4), class107.method711(var79, var73, (byte) -4), class157.method1149(var77, false, var94), class157.method1149(var78, false, var94), class157.method1149(var80, false, var94), class157.method1149(var79, false, var94), var76, var93);
                                if (class56.field846 && var12 > 0) {
                                    class66.method476(var85, var86, var94 == -2 || !var87.field1477, var73 == -1 || !class9.method53(var66 - 1, 27993).field3774, var64, var65, var69 - class264.field4396[0][var64][var65], -class264.field4396[0][var64 - -1][var65] + var68, var71 - class264.field4396[0][var64 + 1][var65 + 1], -class264.field4396[0][var64][var65 + 1] + var70);
                                }
                            }
                        }
                    }
                }
            }
            if (class56.field846) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class264.field4396[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg0) {
                            class201[] var114 = class260.method1764(var9, var100, var11, var12, class166.field2959, (byte) -84, class122.field2042[var12], class264.field4396[var12], class65.field1103[var12], class17.field238[var12], field5486[0], var101, class301.field4992, class172.field3048[var12], var102);
                            class76.method551(var12, var114);
                            break;
                        }
                        class201[] var109 = class260.method1764(var9, var100, var11, var12, (int[][]) null, (byte) -87, class122.field2042[var12], class264.field4396[var12], class65.field1103[var12], class17.field238[var12], (int[][]) null, var101, class301.field4992, class172.field3048[var12], var102);
                        class201[] var110 = class117.method771(var9, class65.field1103[var12], class17.field238[var12], class122.field2042[var12], -20, class172.field3048[var12], var102, var12, class301.field4992, var101, var100, class264.field4396[var12]);
                        class201[] var111 = new class201[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var109.length + var113] = var110[var113];
                        }
                        class76.method551(var12, var111);
                        class195.method1389(class17.field238[var12], (byte) 34, class65.field1103[var12], class264.field4396[var12], var101, class256.field4301, var12, var102, class122.field2042[var12], class256.field4312, var100, class172.field3048[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        int var107 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var102[var105][var104] = -256.0F / var108;
                        var101[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class172.field3048[var12] = (byte[][]) null;
            class65.field1103[var12] = (byte[][]) null;
            class122.field2042[var12] = (byte[][]) null;
            class17.field238[var12] = (byte[][]) null;
            class122.field2036[var12] = (byte[][]) null;
        }
        class282.method1889(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class301.field4992[1][var115][var116] & 0x2) == 2) {
                    class291.method1931(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class119.field2003[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class119.field2003[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var118;
                        int var122 = var117;
                        int var123 = var117;
                        while (var121 < 104 && (class119.field2003[var117][var119][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        label453: while (var123 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class119.field2003[var123 - 1][var119][var124] & 0x1) == 0) {
                                    break label453;
                                }
                            }
                            var123--;
                        }
                        label442: while (var122 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class119.field2003[var122 + 1][var119][var125] & 0x1) == 0) {
                                    break label442;
                                }
                            }
                            var122++;
                        }
                        int var126 = (var121 + 1 - var120) * (var122 + 1 - var123);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class264.field4396[var122][var119][var120] - var127;
                            int var129 = class264.field4396[var123][var119][var120];
                            class128.method890(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var128, var129);
                            for (int var130 = var123; var130 <= var122; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class119.field2003[var130][var119][var131] = class47.method289(class119.field2003[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class119.field2003[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var117;
                        int var133;
                        for (var133 = var119; var133 < 104 && (class119.field2003[var117][var133 + 1][var118] & 0x2) != 0; var133++) {
                        }
                        int var134 = var119;
                        int var135 = var117;
                        while (var134 > 0 && (class119.field2003[var117][var134 - 1][var118] & 0x2) != 0) {
                            var134--;
                        }
                        label507: while (var132 > 0) {
                            for (int var136 = var134; var136 <= var133; var136++) {
                                if ((class119.field2003[var132 - 1][var136][var118] & 0x2) == 0) {
                                    break label507;
                                }
                            }
                            var132--;
                        }
                        label496: while (var135 < 3) {
                            for (int var137 = var134; var137 <= var133; var137++) {
                                if ((class119.field2003[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label496;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var133 + 1 - var134) * (var135 + 1 - var132);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class264.field4396[var135][var134][var118] - var139;
                            int var141 = class264.field4396[var132][var134][var118];
                            class128.method890(2, var134 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var132; var142 <= var135; var142++) {
                                for (int var143 = var134; var143 <= var133; var143++) {
                                    class119.field2003[var142][var143][var118] = class47.method289(class119.field2003[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class119.field2003[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var118;
                        int var146 = var118;
                        while (var145 < 104 && (class119.field2003[var117][var119][var145 + 1] & 0x4) != 0) {
                            var145++;
                        }
                        int var147 = var119;
                        while (var146 > 0 && (class119.field2003[var117][var119][var146 - 1] & 0x4) != 0) {
                            var146--;
                        }
                        label561: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var145; var148++) {
                                if ((class119.field2003[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label561;
                                }
                            }
                            var144--;
                        }
                        label550: while (var147 < 104) {
                            for (int var149 = var146; var149 <= var145; var149++) {
                                if ((class119.field2003[var117][var147 + 1][var149] & 0x4) == 0) {
                                    break label550;
                                }
                            }
                            var147++;
                        }
                        if (((var147 + 1 - var144) * (var145 + 1 - var146)) >= 4) {
                            int var150 = class264.field4396[var117][var144][var146];
                            class128.method890(4, var144 * 128, var147 * 128 + 128, var146 * 128, var145 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var147; var151++) {
                                for (int var152 = var146; var152 <= var145; var152++) {
                                    class119.field2003[var117][var151][var152] = class47.method289(class119.field2003[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 1048)
    public static void method2231(boolean arg0) {
        field5485 = null;
        field5488 = null;
        field5483 = null;
        if (arg0) {
            method2231(false);
        }
        field5486 = (int[][][]) null;
    }
}
