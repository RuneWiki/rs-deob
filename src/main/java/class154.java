import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class154 {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lwa;")
    public static class75 field2645 = class66.method560(":chalreq:", false);

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lwa;")
    public static class75 field2644 = class66.method560("null", false);

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lgb;")
    public static class158 field2640 = new class158(5);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[[[I")
    public static int[][][] field2641;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 10)
    public static void method1174(byte arg0) {
        field2645 = null;
        field2641 = (int[][][]) null;
        field2640 = null;
        if (arg0 == -109) {
            field2644 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 26)
    public static final void method1175(int arg0, int arg1) {
        if (arg0 == -1 && !class283.field4886) {
            class59.method471(arg1);
        } else if (arg0 != -1 && (class163.field2780 != arg0 || !class269.method1929(-85)) && class164.field2783 != 0 && !class283.field4886) {
            class221.method1624(0, arg0, (byte) 115, false, class302.field5172, class164.field2783, 2);
        }
        if (arg1 != 1) {
            field2644 = (class75) null;
        }
        field2642++;
        class163.field2780 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z[Lpk;Z)V", line = 64)
    public static final void method1176(boolean arg0, class104[] arg1, boolean arg2) {
        field2643++;
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class204.field3459[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class204.field3459[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method825(-9873, var5, var4);
                            }
                        }
                    }
                }
            }
            class45.field730 += (int) (Math.random() * 5.0D) - 2;
            class163.field2766 += (int) (Math.random() * 5.0D) - 2;
            if (class163.field2766 < -8) {
                class163.field2766 = -8;
            }
            if (class45.field730 < -16) {
                class45.field730 = -16;
            }
            if (class163.field2766 > 8) {
                class163.field2766 = 8;
            }
            if (class45.field730 > 16) {
                class45.field730 = 16;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        if (!arg0) {
            method1174((byte) 94);
        }
        int var8 = class163.field2766 >> 2 << 10;
        int var9 = class45.field730 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class164.field2786[var12];
            if (class116.field1970) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15][var14] >> 1) + (var13[var15 - 1][var14] >> 2) + (var13[var15][var14 + -1] >> 2) + (var13[var15][var14 - -1] >> 3) + (var13[var15 + 1][var14] >> 3);
                        var11[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class239.field4036[0];
                int var19 = (int) class239.field4036[1];
                int var20 = (int) class239.field4036[2];
                int var21 = (int) Math.sqrt((double) (var20 * var20 + var18 * var18 + var19 * var19));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        int var25 = class53.field879[var12][var24 + 1][var23] - class53.field879[var12][var24 - 1][var23];
                        byte var26 = 96;
                        int var27 = class53.field879[var12][var24][var23 + 1] - class53.field879[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var27 * var27 + (var25 * var25 + 65536)));
                        int var29 = (var25 << 8) / var28;
                        int var30 = (var27 << 8) / var28;
                        int var31 = -65536 / var28;
                        int var32 = (var18 * var29 + var19 * var31 + (var20 * var30)) / var22 + var26;
                        int var33 = (var13[var24][var23 + 1] >> 3) + (var13[var24][var23] >> 1) + (var13[var24 + 1][var23] >> 3) + (var13[var24][var23 + -1] >> 2) + (var13[var24 - 1][var23] >> 2);
                        var11[var24][var23] = var32 - ((int) ((float) var33 * 1.7F));
                    }
                }
            }
            for (int var34 = 0; var34 < 104; var34++) {
                class164.field2788[var34] = 0;
                class116.field1968[var34] = 0;
                class238.field4006[var34] = 0;
                class112.field1905[var34] = 0;
                class206.field3489[var34] = 0;
            }
            for (int var35 = -5; var35 < 104; var35++) {
                for (int var36 = 0; var36 < 104; var36++) {
                    int var37 = var35 + 5;
                    int var10002;
                    if (var37 < 104) {
                        int var38 = class242.field4102[var12][var37][var36] & 0xFF;
                        if (var38 > 0) {
                            class215 var39 = class266.method1891((byte) -96, var38 - 1);
                            class164.field2788[var36] += var39.field3679;
                            class116.field1968[var36] += var39.field3670;
                            class238.field4006[var36] += var39.field3667;
                            class112.field1905[var36] += var39.field3680;
                            var10002 = class206.field3489[var36]++;
                        }
                    }
                    int var40 = var35 - 5;
                    if (var40 >= 0) {
                        int var41 = class242.field4102[var12][var40][var36] & 0xFF;
                        if (var41 > 0) {
                            class215 var42 = class266.method1891((byte) -96, var41 - 1);
                            class164.field2788[var36] -= var42.field3679;
                            class116.field1968[var36] -= var42.field3670;
                            class238.field4006[var36] -= var42.field3667;
                            class112.field1905[var36] -= var42.field3680;
                            var10002 = class206.field3489[var36]--;
                        }
                    }
                }
                if (var35 >= 0) {
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    for (int var48 = -5; var48 < 104; var48++) {
                        int var49 = var48 + 5;
                        if (var49 < 104) {
                            var43 += class164.field2788[var49];
                            var47 += class206.field3489[var49];
                            var45 += class116.field1968[var49];
                            var44 += class238.field4006[var49];
                            var46 += class112.field1905[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0) {
                            var47 -= class206.field3489[var50];
                            var43 -= class164.field2788[var50];
                            var46 -= class112.field1905[var50];
                            var45 -= class116.field1968[var50];
                            var44 -= class238.field4006[var50];
                        }
                        if (var48 >= 0 && var47 > 0) {
                            var10[var35][var48] = class145.method1112(var44 / var47, 24001, var45 / var47, var43 * 256 / var46);
                        }
                    }
                }
            }
            for (int var51 = 1; var51 < 103; var51++) {
                label731: for (int var52 = 1; var52 < 103; var52++) {
                    if (arg2 || class300.method2067(-12461) || (class204.field3459[0][var51][var52] & 0x2) != 0 || (class204.field3459[var12][var51][var52] & 0x10) == 0 && class152.method1166(var51, var12, var52, -1) == class76.field1319) {
                        if (class151.field2586 > var12) {
                            class151.field2586 = var12;
                        }
                        int var53 = class242.field4102[var12][var51][var52] & 0xFF;
                        int var54 = class261.field4365[var12][var51][var52] & 0xFF;
                        if (var53 > 0 || var54 > 0) {
                            int var55 = class53.field879[var12][var51][var52];
                            int var56 = class53.field879[var12][var51 + 1][var52];
                            int var57 = class53.field879[var12][var51 + 1][var52 + 1];
                            int var58 = class53.field879[var12][var51][var52 + 1];
                            if (var12 > 0) {
                                boolean var59 = true;
                                if (var53 == 0 && class52.field860[var12][var51][var52] != 0) {
                                    var59 = false;
                                }
                                if (var54 > 0 && !class282.method1999(-3, var54 - 1).field1454) {
                                    var59 = false;
                                }
                                if (var59 && var55 == var56 && var55 == var57 && var55 == var58) {
                                    class51.field847[var12][var51][var52] = class102.method799(class51.field847[var12][var51][var52], 4);
                                }
                            }
                            int var60;
                            int var63;
                            if (var53 > 0) {
                                var60 = var10[var51][var52];
                                int var61 = (var60 & 0x7F) + var9;
                                if (var61 < 0) {
                                    var61 = 0;
                                } else if (var61 > 127) {
                                    var61 = 127;
                                }
                                int var62 = (var8 + var60 & 0xFC00) + (var60 & 0x380) + var61;
                                var63 = class21.field290[class189.method1427(-65537, 96, var62)];
                            } else {
                                var60 = -1;
                                var63 = 0;
                            }
                            int var64 = var11[var51 + 1][var52];
                            int var65 = var11[var51 + 1][var52 + 1];
                            int var66 = var11[var51][var52 + 1];
                            int var67 = var11[var51][var52];
                            if (var54 == 0) {
                                class211.method1560(var12, var51, var52, 0, 0, -1, var55, var56, var57, var58, class189.method1427(-65537, var67, var60), class189.method1427(-65537, var64, var60), class189.method1427(-65537, var65, var60), class189.method1427(-65537, var66, var60), 0, 0, 0, 0, var63, 0);
                                if (var12 > 0 && var60 != -1 && class266.method1891((byte) -96, var53 - 1).field3669) {
                                    class18.method118(0, 0, true, false, var51, var52, var55 - class53.field879[0][var51][var52], -class53.field879[0][var51 + 1][var52] + var56, var57 - class53.field879[0][var51 + 1][var52 + 1], -class53.field879[0][var51][var52 - -1] + var58);
                                }
                                if (!arg2 && class259.field4342 != null && var12 == 0) {
                                    for (int var83 = var51 - 1; var83 <= (var51 + 1); var83++) {
                                        for (int var84 = var52 - 1; var84 <= (var52 + 1); var84++) {
                                            if ((var51 != var83 || var52 != var84) && var83 >= 0 && var83 < 104 && var84 >= 0 && var84 < 104) {
                                                int var85 = class261.field4365[var12][var83][var84] & 0xFF;
                                                if (var85 != 0) {
                                                    class87 var86 = class282.method1999(-3, var85 - 1);
                                                    if (var86.field1428 != -1 && class21.field279.method1057(var86.field1428, (byte) -83) == 4) {
                                                        class259.field4342[var51][var52] = (var86.field1447 << 24) + var86.field1445;
                                                        continue label731;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var68 = class52.field860[var12][var51][var52] + 1;
                                byte var69 = class66.field1147[var12][var51][var52];
                                class87 var70 = class282.method1999(-3, var54 - 1);
                                if (!arg2 && class259.field4342 != null && var12 == 0) {
                                    if (var70.field1428 != -1 && class21.field279.method1057(var70.field1428, (byte) -96) == 4) {
                                        class259.field4342[var51][var52] = (var70.field1447 << 24) + var70.field1445;
                                    } else {
                                        label698: for (int var71 = var51 - 1; var71 <= (var51 + 1); var71++) {
                                            for (int var72 = var52 - 1; var72 <= var52 + 1; var72++) {
                                                if ((var51 != var71 || var52 != var72) && var71 >= 0 && var71 < 104 && var72 >= 0 && var72 < 104) {
                                                    int var73 = class261.field4365[var12][var71][var72] & 0xFF;
                                                    if (var73 != 0) {
                                                        class87 var74 = class282.method1999(-3, var73 - 1);
                                                        if (var74.field1428 != -1 && class21.field279.method1057(var74.field1428, (byte) -50) == 4) {
                                                            class259.field4342[var51][var52] = (var74.field1447 << 24) + var74.field1445;
                                                            break label698;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var75 = var70.field1428;
                                if (var75 >= 0 && !class21.field279.method1069(var75, (byte) 76)) {
                                    var75 = -1;
                                }
                                int var76;
                                int var77;
                                if (var75 >= 0) {
                                    var76 = class21.field290[class245.method1773(class21.field279.method1078(var75, (byte) 99), 2, 96)];
                                    var77 = -1;
                                } else if (var70.field1436 == -1) {
                                    var76 = 0;
                                    var77 = -2;
                                } else {
                                    var77 = var70.field1436;
                                    int var78 = (var77 & 0x7F) + var9;
                                    if (var78 < 0) {
                                        var78 = 0;
                                    } else if (var78 > 127) {
                                        var78 = 127;
                                    }
                                    int var79 = (var8 + var77 & 0xFC00) - (-(var77 & 0x380) - var78);
                                    var76 = class21.field290[class245.method1773(var79, 2, 96)];
                                }
                                if (var70.field1442 >= 0) {
                                    int var80 = var70.field1442;
                                    int var81 = (var80 & 0x7F) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var8 + var80 & 0xFC00) - (-(var80 & 0x380) - var81);
                                    var76 = class21.field290[class245.method1773(var82, 2, 96)];
                                }
                                class211.method1560(var12, var51, var52, var68, var69, var75, var55, var56, var57, var58, class189.method1427(-65537, var67, var60), class189.method1427(-65537, var64, var60), class189.method1427(-65537, var65, var60), class189.method1427(-65537, var66, var60), class245.method1773(var77, 2, var67), class245.method1773(var77, 2, var64), class245.method1773(var77, 2, var65), class245.method1773(var77, 2, var66), var63, var76);
                                if (var12 > 0) {
                                    class18.method118(var68, var69, var77 == -2 || !var70.field1439, var60 == -1 || !class266.method1891((byte) -96, var53 - 1).field3669, var51, var52, var55 - class53.field879[0][var51][var52], -class53.field879[0][var51 + 1][var52] + var56, var57 - class53.field879[0][var51 + 1][var52 + 1], -class53.field879[0][var51][var52 + 1] + var58);
                                }
                            }
                        }
                    }
                }
            }
            float[][] var87 = new float[105][105];
            int[][] var88 = class53.field879[var12];
            float[][] var89 = new float[105][105];
            float[][] var90 = new float[105][105];
            for (int var91 = 1; var91 <= 103; var91++) {
                for (int var92 = 1; var92 <= 103; var92++) {
                    int var93 = var88[var92][var91 + 1] - var88[var92][var91 - 1];
                    int var94 = var88[var92 + 1][var91] - var88[var92 - 1][var91];
                    float var95 = (float) Math.sqrt((double) (var93 * var93 + var94 * var94 + 65536));
                    var87[var92][var91] = (float) var94 / var95;
                    var89[var92][var91] = -256.0F / var95;
                    var90[var92][var91] = (float) var93 / var95;
                }
            }
            if (arg2) {
                class38[] var96 = class69.method586(class60.field1058[0], class66.field1147[var12], 23775, class204.field3459, var90, var89, class259.field4342, var87, class242.field4102[var12], class52.field860[var12], class261.field4365[var12], var10, class53.field879[var12], var12, var11);
                class136.method1046(var12, var96);
            } else {
                class38[] var97 = class69.method586((int[][]) null, class66.field1147[var12], 23775, class204.field3459, var90, var89, (int[][]) null, var87, class242.field4102[var12], class52.field860[var12], class261.field4365[var12], var10, class53.field879[var12], var12, var11);
                class38[] var98 = class185.method1401(class204.field3459, class242.field4102[var12], class66.field1147[var12], class53.field879[var12], class52.field860[var12], var87, var89, false, var11, var12, class261.field4365[var12], var90);
                class38[] var99 = new class38[var97.length + var98.length];
                for (int var100 = 0; var100 < var97.length; var100++) {
                    var99[var100] = var97[var100];
                }
                for (int var101 = 0; var101 < var98.length; var101++) {
                    var99[var97.length + var101] = var98[var101];
                }
                class136.method1046(var12, var99);
                class310.method2108(class261.field4365[var12], var89, -1, var90, class209.field3580, class209.field3579, var87, class53.field879[var12], var12, class52.field860[var12], class242.field4102[var12], class66.field1147[var12]);
            }
            class242.field4102[var12] = (byte[][]) null;
            class261.field4365[var12] = (byte[][]) null;
            class52.field860[var12] = (byte[][]) null;
            class66.field1147[var12] = (byte[][]) null;
            class164.field2786[var12] = (byte[][]) null;
        }
        class255.method1823(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var102 = 0; var102 < 104; var102++) {
            for (int var103 = 0; var103 < 104; var103++) {
                if ((class204.field3459[1][var102][var103] & 0x2) == 2) {
                    class51.method378(var102, var103);
                }
            }
        }
        for (int var104 = 0; var104 < 4; var104++) {
            for (int var105 = 0; var105 <= 104; var105++) {
                for (int var106 = 0; var106 <= 104; var106++) {
                    if ((class51.field847[var104][var106][var105] & 0x1) != 0) {
                        int var107 = var105;
                        int var108;
                        for (var108 = var105; var108 > 0 && (class51.field847[var104][var106][var108 - 1] & 0x1) != 0; var108--) {
                        }
                        while (var107 < 104 && (class51.field847[var104][var106][var107 + 1] & 0x1) != 0) {
                            var107++;
                        }
                        int var109 = var104;
                        int var110;
                        label432: for (var110 = var104; var110 > 0; var110--) {
                            for (int var111 = var108; var111 <= var107; var111++) {
                                if ((class51.field847[var110 - 1][var106][var111] & 0x1) == 0) {
                                    break label432;
                                }
                            }
                        }
                        label421: while (var109 < 3) {
                            for (int var112 = var108; var112 <= var107; var112++) {
                                if ((class51.field847[var109 + 1][var106][var112] & 0x1) == 0) {
                                    break label421;
                                }
                            }
                            var109++;
                        }
                        int var113 = (var107 + 1 - var108) * (var109 + 1 - var110);
                        if (var113 >= 8) {
                            short var114 = 240;
                            int var115 = class53.field879[var109][var106][var108] - var114;
                            int var116 = class53.field879[var110][var106][var108];
                            class250.method1800(1, var106 * 128, var106 * 128, var108 * 128, var107 * 128 + 128, var115, var116);
                            for (int var117 = var110; var117 <= var109; var117++) {
                                for (int var118 = var108; var118 <= var107; var118++) {
                                    class51.field847[var117][var106][var118] = class235.method1710(class51.field847[var117][var106][var118], -2);
                                }
                            }
                        }
                    }
                    if ((class51.field847[var104][var106][var105] & 0x2) != 0) {
                        int var119;
                        for (var119 = var106; var119 > 0 && (class51.field847[var104][var119 - 1][var105] & 0x2) != 0; var119--) {
                        }
                        int var120 = var104;
                        int var121 = var106;
                        int var122 = var104;
                        while (var121 < 104 && (class51.field847[var104][var121 + 1][var105] & 0x2) != 0) {
                            var121++;
                        }
                        label486: while (var120 > 0) {
                            for (int var123 = var119; var123 <= var121; var123++) {
                                if ((class51.field847[var120 - 1][var123][var105] & 0x2) == 0) {
                                    break label486;
                                }
                            }
                            var120--;
                        }
                        label475: while (var122 < 3) {
                            for (int var124 = var119; var124 <= var121; var124++) {
                                if ((class51.field847[var122 + 1][var124][var105] & 0x2) == 0) {
                                    break label475;
                                }
                            }
                            var122++;
                        }
                        int var125 = (var122 + 1 - var120) * (var121 + 1 - var119);
                        if (var125 >= 8) {
                            short var126 = 240;
                            int var127 = class53.field879[var122][var119][var105] - var126;
                            int var128 = class53.field879[var120][var119][var105];
                            class250.method1800(2, var119 * 128, var121 * 128 + 128, var105 * 128, var105 * 128, var127, var128);
                            for (int var129 = var120; var129 <= var122; var129++) {
                                for (int var130 = var119; var130 <= var121; var130++) {
                                    class51.field847[var129][var130][var105] = class235.method1710(class51.field847[var129][var130][var105], -3);
                                }
                            }
                        }
                    }
                    if ((class51.field847[var104][var106][var105] & 0x4) != 0) {
                        int var131 = var106;
                        int var132 = var106;
                        int var133 = var105;
                        int var134 = var105;
                        while (var133 > 0 && (class51.field847[var104][var106][var133 - 1] & 0x4) != 0) {
                            var133--;
                        }
                        while (var134 < 104 && (class51.field847[var104][var106][var134 + 1] & 0x4) != 0) {
                            var134++;
                        }
                        label540: while (var131 > 0) {
                            for (int var135 = var133; var135 <= var134; var135++) {
                                if ((class51.field847[var104][var131 - 1][var135] & 0x4) == 0) {
                                    break label540;
                                }
                            }
                            var131--;
                        }
                        label529: while (var132 < 104) {
                            for (int var136 = var133; var136 <= var134; var136++) {
                                if ((class51.field847[var104][var132 + 1][var136] & 0x4) == 0) {
                                    break label529;
                                }
                            }
                            var132++;
                        }
                        if ((var132 + 1 - var131) * (var134 + 1 - var133) >= 4) {
                            int var137 = class53.field879[var104][var131][var133];
                            class250.method1800(4, var131 * 128, var132 * 128 + 128, var133 * 128, var134 * 128 + 128, var137, var137);
                            for (int var138 = var131; var138 <= var132; var138++) {
                                for (int var139 = var133; var139 <= var134; var139++) {
                                    class51.field847[var104][var138][var139] = class235.method1710(class51.field847[var104][var138][var139], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
