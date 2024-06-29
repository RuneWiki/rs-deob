import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class254 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lol;")
    public static class235 field4419 = null;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[J")
    public static long[] field4423 = new long[200];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1792(int arg0) {
        field4423 = null;
        field4419 = null;
        if (arg0 != 4) {
            field4419 = (class235) null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLsf;)Lvk;", line = 19)
    public static final class173 method1793(byte arg0, class108 arg1) {
        field4422++;
        for (class173 var2 = (class173) class128.field2182.method13(0); var2 != null; var2 = (class173) class128.field2182.method15((byte) 47)) {
            if (var2.field3170.method779(arg1, 117)) {
                return var2;
            }
        }
        if (arg0 < 59) {
            method1795(-109);
        }
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z[Loj;Z)V", line = 42)
    public static final void method1794(boolean arg0, class328[] arg1, boolean arg2) {
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        field4420++;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class166.field2980[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class166.field2980[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method2241((byte) -89, var5, var6);
                            }
                        }
                    }
                }
            }
            class78.field1187 += (int) (Math.random() * 5.0D) - 2;
            class144.field2537 += (int) (Math.random() * 5.0D) - 2;
            if (class144.field2537 < -8) {
                class144.field2537 = -8;
            }
            if (class144.field2537 > 8) {
                class144.field2537 = 8;
            }
            if (class78.field1187 < -16) {
                class78.field1187 = -16;
            }
            if (class78.field1187 > 16) {
                class78.field1187 = 16;
            }
        }
        int var8 = class144.field2537 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class78.field1187 >> 1;
        int[][] var11 = new int[104][104];
        if (!arg0) {
            return;
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class182.field3357[var12];
            if (!class231.field4051) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        int var18 = class278.field4883[var12][var17 + 1][var16] - class278.field4883[var12][var17 - 1][var16];
                        byte var19 = 74;
                        int var20 = class278.field4883[var12][var17][var16 + 1] - class278.field4883[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20 + 65536));
                        int var22 = (var18 << 8) / var21;
                        int var23 = -65536 / var21;
                        int var24 = (var20 << 8) / var21;
                        int var25 = (var22 * -50 + var23 * -10 + var24 * -50) / var15 + var19;
                        int var26 = (var13[var17][var16 + 1] >> 3) + ((var13[var17 + 1][var16] >> 3) + (var13[var17 - 1][var16] >> 2) + (var13[var17][var16 + -1] >> 2) + (var13[var17][var16] >> 1));
                        var11[var17][var16] = var25 - var26;
                    }
                }
            } else if (class26.field397) {
                for (int var27 = 1; var27 < 103; var27++) {
                    for (int var28 = 1; var28 < 103; var28++) {
                        byte var29 = 74;
                        int var30 = (var13[var28][var27 + 1] >> 3) + (var13[var28 + 1][var27] >> 3) + ((var13[var28 + -1][var27] >> 2) - (-(var13[var28][var27 + -1] >> 2) - (var13[var28][var27] >> 1)));
                        var11[var28][var27] = var29 - var30;
                    }
                }
            } else {
                int var31 = (int) class217.field3862[1];
                int var32 = (int) class217.field3862[2];
                int var33 = (int) class217.field3862[0];
                int var34 = (int) Math.sqrt((double) (var32 * var32 + var31 * var31 + var33 * var33));
                int var35 = var34 * 1024 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 96;
                        int var39 = class278.field4883[var12][var37][var36 + 1] - class278.field4883[var12][var37][var36 - 1];
                        int var40 = class278.field4883[var12][var37 + 1][var36] - class278.field4883[var12][var37 - 1][var36];
                        int var41 = (int) Math.sqrt((double) (var39 * var39 + var40 * var40 + 65536));
                        int var42 = -65536 / var41;
                        int var43 = (var40 << 8) / var41;
                        int var44 = (var39 << 8) / var41;
                        int var45 = (var13[var37][var36 - 1] >> 2) + (var13[var37][var36] >> 1) + (var13[var37][var36 - -1] >> 3) + (var13[var37 - 1][var36] >> 2) + (var13[var37 + 1][var36] >> 3);
                        int var46 = (var32 * var44 + var31 * var42 + var33 * var43) / var35 + var38;
                        var11[var37][var36] = var46 - ((int) ((float) var45 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class195.field3528[var47] = 0;
                class93.field1481[var47] = 0;
                class90.field1417[var47] = 0;
                class24.field365[var47] = 0;
                class34.field459[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class216.field3840[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class306 var52 = class131.method903(-95, var51 - 1);
                            class195.field3528[var49] += var52.field5334;
                            class93.field1481[var49] += var52.field5331;
                            class90.field1417[var49] += var52.field5330;
                            class24.field365[var49] += var52.field5322;
                            var10002 = class34.field459[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class216.field3840[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class306 var55 = class131.method903(89, var54 - 1);
                            class195.field3528[var49] -= var55.field5334;
                            class93.field1481[var49] -= var55.field5331;
                            class90.field1417[var49] -= var55.field5330;
                            class24.field365[var49] -= var55.field5322;
                            var10002 = class34.field459[var49]--;
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
                            var59 += class34.field459[var62];
                            var60 += class24.field365[var62];
                            var57 += class90.field1417[var62];
                            var58 += class93.field1481[var62];
                            var56 += class195.field3528[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var60 -= class24.field365[var63];
                            var56 -= class195.field3528[var63];
                            var57 -= class90.field1417[var63];
                            var59 -= class34.field459[var63];
                            var58 -= class93.field1481[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var9[var48][var61] = class197.method1400(var56 * 256 / var60, var58 / var59, var57 / var59, 2);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label763: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class251.method1774(903) || (class166.field2980[0][var64][var65] & 0x2) != 0 || (class166.field2980[var12][var64][var65] & 0x10) == 0 && class237.method1638(var64, var12, 89, var65) == class90.field1416) {
                        if (class315.field5430 > var12) {
                            class315.field5430 = var12;
                        }
                        int var66 = class327.field5586[var12][var64][var65] & 0xFF;
                        int var67 = class216.field3840[var12][var64][var65] & 0xFF;
                        if (var67 > 0 || var66 > 0) {
                            int var68 = class278.field4883[var12][var64][var65];
                            int var69 = class278.field4883[var12][var64 + 1][var65 + 1];
                            int var70 = class278.field4883[var12][var64 + 1][var65];
                            int var71 = class278.field4883[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var67 == 0 && class95.field1516[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var66 > 0 && !class290.method2071((byte) -16, var66 - 1).field83) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var68 == var69 && var68 == var71) {
                                    class149.field2719[var12][var64][var65] = class242.method1674(class149.field2719[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var67 <= 0) {
                                var73 = 0;
                                var74 = -1;
                            } else {
                                var74 = var9[var64][var65];
                                int var75 = (var74 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var8 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var73 = class263.field4657[class157.method1097(96, true, var76)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var66 == 0) {
                                class172.method1221(var12, var64, var65, 0, 0, -1, var68, var70, var69, var71, class157.method1097(var77, true, var74), class157.method1097(var78, true, var74), class157.method1097(var79, arg0, var74), class157.method1097(var80, true, var74), 0, 0, 0, 0, var73, 0);
                                if (class231.field4051 && var12 > 0 && var74 != -1 && class131.method903(-24, var67 - 1).field5329) {
                                    class238.method1656(0, 0, true, false, var64, var65, var68 - class278.field4883[0][var64][var65], -class278.field4883[0][var64 + 1][var65] + var70, var69 - class278.field4883[0][var64 + 1][var65 + 1], var71 - class278.field4883[0][var64][var65 + 1]);
                                }
                                if (class231.field4051 && !arg2 && class182.field3355 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= var64 + 1; var81++) {
                                        for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class327.field5586[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class7 var84 = class290.method2071((byte) -16, var83 - 1);
                                                    if (var84.field77 != -1 && class263.field4661.method569((byte) -96, var84.field77) == 4) {
                                                        class182.field3355[var64][var65] = (var84.field80 << 24) + var84.field79;
                                                        continue label763;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var85 = class265.field4670[var12][var64][var65];
                                int var86 = class95.field1516[var12][var64][var65] + 1;
                                class7 var87 = class290.method2071((byte) -16, var66 - 1);
                                if (class231.field4051 && !arg2 && class182.field3355 != null && var12 == 0) {
                                    if (var87.field77 != -1 && class263.field4661.method569((byte) -96, var87.field77) == 4) {
                                        class182.field3355[var64][var65] = (var87.field80 << 24) + var87.field79;
                                    } else {
                                        label744: for (int var88 = var64 - 1; var88 <= var64 + 1; var88++) {
                                            for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class327.field5586[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class7 var91 = class290.method2071((byte) -16, var90 - 1);
                                                        if (var91.field77 != -1 && class263.field4661.method569((byte) -96, var91.field77) == 4) {
                                                            class182.field3355[var64][var65] = (var91.field80 << 24) + var91.field79;
                                                            break label744;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field77;
                                if (var92 >= 0 && !class263.field4661.method567(var92, 20)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var94 = class263.field4657[class19.method128(96, 128, class263.field4661.method564(65535, var92))];
                                } else if (var87.field89 == -1) {
                                    var93 = -2;
                                    var94 = 0;
                                } else {
                                    var93 = var87.field89;
                                    int var95 = (var93 & 0x7F) + var10;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var8 + var93 & 0xFC00) + (var93 & 0x380) + var95;
                                    var94 = class263.field4657[class19.method128(96, 128, var96)];
                                }
                                if (var87.field82 >= 0) {
                                    int var97 = var87.field82;
                                    int var98 = (var97 & 0x7F) + var10;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var8 + var97 & 0xFC00) + (var97 & 0x380) + var98;
                                    var94 = class263.field4657[class19.method128(96, 128, var99)];
                                }
                                class172.method1221(var12, var64, var65, var86, var85, var92, var68, var70, var69, var71, class157.method1097(var77, arg0, var74), class157.method1097(var78, true, var74), class157.method1097(var79, arg0, var74), class157.method1097(var80, true, var74), class19.method128(var77, 128, var93), class19.method128(var78, 128, var93), class19.method128(var79, 128, var93), class19.method128(var80, 128, var93), var73, var94);
                                if (class231.field4051 && var12 > 0) {
                                    class238.method1656(var86, var85, var93 == -2 || !var87.field81, var74 == -1 || !class131.method903(122, var67 - 1).field5329, var64, var65, var68 - class278.field4883[0][var64][var65], -class278.field4883[0][var64 - -1][var65] + var70, var69 - class278.field4883[0][var64 + 1][var65 + 1], var71 - class278.field4883[0][var64][var65 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class231.field4051) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class278.field4883[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg2) {
                            class133[] var114 = class47.method332(8942, var11, var12, var100, class278.field4883[var12], var101, class265.field4670[var12], var9, class95.field1516[var12], class216.field3840[var12], class182.field3355, class166.field2980, var102, class327.field5586[var12], class104.field1809[0]);
                            class29.method207(var12, var114);
                            break;
                        }
                        class133[] var109 = class47.method332(8942, var11, var12, var100, class278.field4883[var12], var101, class265.field4670[var12], var9, class95.field1516[var12], class216.field3840[var12], (int[][]) null, class166.field2980, var102, class327.field5586[var12], (int[][]) null);
                        class133[] var110 = class310.method2161(var100, 26702, var11, class265.field4670[var12], class216.field3840[var12], class95.field1516[var12], var101, class278.field4883[var12], class327.field5586[var12], var12, var102, class166.field2980);
                        class133[] var111 = new class133[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var109.length + var113] = var110[var113];
                        }
                        class29.method207(var12, var111);
                        class234.method1630(class267.field4689, class267.field4701, var102, class265.field4670[var12], var12, class278.field4883[var12], var100, var101, 109, class327.field5586[var12], class95.field1516[var12], class216.field3840[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        int var107 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + (var106 * var106) + 65536));
                        var100[var105][var104] = (float) var107 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var106 / var108;
                    }
                    var104++;
                }
            }
            class216.field3840[var12] = (byte[][]) null;
            class327.field5586[var12] = (byte[][]) null;
            class95.field1516[var12] = (byte[][]) null;
            class265.field4670[var12] = (byte[][]) null;
            class182.field3357[var12] = (byte[][]) null;
        }
        class194.method1382(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class166.field2980[1][var115][var116] & 0x2) == 2) {
                    class200.method1412(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class149.field2719[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 < 104 && (class149.field2719[var117][var119][var120 + 1] & 0x1) != 0; var120++) {
                        }
                        int var121;
                        for (var121 = var118; var121 > 0 && (class149.field2719[var117][var119][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var117;
                        int var123;
                        label446: for (var123 = var117; var123 > 0; var123--) {
                            for (int var124 = var121; var124 <= var120; var124++) {
                                if ((class149.field2719[var123 - 1][var119][var124] & 0x1) == 0) {
                                    break label446;
                                }
                            }
                        }
                        label435: while (var122 < 3) {
                            for (int var125 = var121; var125 <= var120; var125++) {
                                if ((class149.field2719[var122 + 1][var119][var125] & 0x1) == 0) {
                                    break label435;
                                }
                            }
                            var122++;
                        }
                        int var126 = (var122 + 1 - var123) * (var120 + 1 - var121);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class278.field4883[var122][var119][var121] - var127;
                            int var129 = class278.field4883[var123][var119][var121];
                            class168.method1172(1, var119 * 128, var119 * 128, var121 * 128, var120 * 128 + 128, var128, var129);
                            for (int var130 = var123; var130 <= var122; var130++) {
                                for (int var131 = var121; var131 <= var120; var131++) {
                                    class149.field2719[var130][var119][var131] = class162.method1118(class149.field2719[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class149.field2719[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var119;
                        while (var132 > 0 && (class149.field2719[var117][var132 - 1][var118] & 0x2) != 0) {
                            var132--;
                        }
                        while (var133 < 104 && (class149.field2719[var117][var133 + 1][var118] & 0x2) != 0) {
                            var133++;
                        }
                        int var134 = var117;
                        int var135 = var117;
                        label501: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var133; var136++) {
                                if ((class149.field2719[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label501;
                                }
                            }
                            var134--;
                        }
                        label490: while (var135 < 3) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class149.field2719[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label490;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var135 + 1 - var134) * (var133 + 1 - var132);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class278.field4883[var135][var132][var118] - var139;
                            int var141 = class278.field4883[var134][var132][var118];
                            class168.method1172(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class149.field2719[var142][var143][var118] = class162.method1118(class149.field2719[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class149.field2719[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146 = var118;
                        int var147 = var118;
                        while (var146 > 0 && (class149.field2719[var117][var119][var146 - 1] & 0x4) != 0) {
                            var146--;
                        }
                        while (var147 < 104 && (class149.field2719[var117][var119][var147 + 1] & 0x4) != 0) {
                            var147++;
                        }
                        label555: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class149.field2719[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label555;
                                }
                            }
                            var144--;
                        }
                        label544: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class149.field2719[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label544;
                                }
                            }
                            var145++;
                        }
                        if ((var145 - (var144 - 1)) * (var147 + 1 - var146) >= 4) {
                            int var150 = class278.field4883[var117][var144][var146];
                            class168.method1172(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class149.field2719[var117][var151][var152] = class162.method1118(class149.field2719[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 1017)
    public static final void method1795(int arg0) {
        if (class203.field3658 == 10 && class231.field4051) {
            class312.method2177(28, (byte) -123);
        }
        if (class203.field3658 == 30) {
            class312.method2177(25, (byte) -107);
        }
        field4421++;
        if (arg0 != 10473) {
            field4423 = (long[]) null;
        }
    }
}
