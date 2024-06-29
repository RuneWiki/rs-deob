import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class314 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Ltl;")
    public static class59 field5312 = class85.method639("Bitte entfernen Sie ", 9588);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
    public static int[] field5313 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "[Z")
    public static boolean[] field5317;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Ldl;ZB)V", line = 6)
    public static final void method2161(class30[] arg0, boolean arg1, byte arg2) {
        field5323++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class308.field5219[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class308.field5219[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method189(var6, var5, 2097152);
                            }
                        }
                    }
                }
            }
            class169.field2725 += (int) (Math.random() * 5.0D) - 2;
            if (class169.field2725 < -8) {
                class169.field2725 = -8;
            }
            if (class169.field2725 > 8) {
                class169.field2725 = 8;
            }
            class33.field472 += (int) (Math.random() * 5.0D) - 2;
            if (class33.field472 < -16) {
                class33.field472 = -16;
            }
            if (class33.field472 > 16) {
                class33.field472 = 16;
            }
        }
        if (arg2 >= -68) {
            method2165(true);
        }
        int var8 = class169.field2725 >> 2 << 10;
        int var9 = class33.field472 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class249.field4145[var12];
            if (!class55.field815) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class97.field1558[var12][var37][var36 + 1] - class97.field1558[var12][var37][var36 - 1];
                        int var40 = class97.field1558[var12][var37 + 1][var36] - class97.field1558[var12][var37 - 1][var36];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + (var39 * var39) + 65536));
                        int var42 = -65536 / var41;
                        int var43 = (var39 << 8) / var41;
                        int var44 = (var40 << 8) / var41;
                        int var45 = (var42 * -10 + var44 * -50 + (var43 * -50)) / var35 + var38;
                        int var46 = (var13[var37][var36 + 1] >> 3) + (var13[var37][var36 - 1] >> 2) + (var13[var37 - -1][var36] >> 3) + ((var13[var37 + -1][var36] >> 2) - -(var13[var37][var36] >> 1));
                        var11[var37][var36] = var45 - var46;
                    }
                }
            } else if (class308.field5243) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15][var14] >> 1) + (var13[var15 - 1][var14] >> 2) + (var13[var15][var14 + 1] >> 3) + (var13[var15][var14 + -1] >> 2) + (var13[var15 - -1][var14] >> 3);
                        var11[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class141.field2357[0];
                int var19 = (int) class141.field2357[1];
                int var20 = (int) class141.field2357[2];
                int var21 = (int) Math.sqrt((double) (var20 * var20 + var18 * var18 + var19 * var19));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        int var25 = class97.field1558[var12][var24 + 1][var23] - class97.field1558[var12][var24 - 1][var23];
                        byte var26 = 96;
                        int var27 = class97.field1558[var12][var24][var23 + 1] - class97.field1558[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var25 * var25 + (var27 * var27) + 65536));
                        int var29 = (var25 << 8) / var28;
                        int var30 = (var27 << 8) / var28;
                        int var31 = (var13[var24 + 1][var23] >> 3) + ((var13[var24 - 1][var23] >> 2) - (-(var13[var24][var23 - 1] >> 2) - ((var13[var24][var23 + 1] >> 3) + (var13[var24][var23] >> 1))));
                        int var32 = -65536 / var28;
                        int var33 = (var18 * var29 + var19 * var32 + var20 * var30) / var22 + var26;
                        var11[var24][var23] = var33 - (int) ((float) var31 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class138.field2274[var47] = 0;
                class12.field155[var47] = 0;
                class280.field4819[var47] = 0;
                class38.field578[var47] = 0;
                class195.field3230[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class123.field2027[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class317 var52 = class37.method245(var51 - 1, -21177);
                            class138.field2274[var49] += var52.field5341;
                            class12.field155[var49] += var52.field5349;
                            class280.field4819[var49] += var52.field5352;
                            class38.field578[var49] += var52.field5353;
                            var10002 = class195.field3230[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class123.field2027[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class317 var55 = class37.method245(var54 - 1, -21177);
                            class138.field2274[var49] -= var55.field5341;
                            class12.field155[var49] -= var55.field5349;
                            class280.field4819[var49] -= var55.field5352;
                            class38.field578[var49] -= var55.field5353;
                            var10002 = class195.field3230[var49]--;
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
                            var59 += class38.field578[var62];
                            var56 += class12.field155[var62];
                            var60 += class195.field3230[var62];
                            var57 += class280.field4819[var62];
                            var58 += class138.field2274[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var56 -= class12.field155[var63];
                            var58 -= class138.field2274[var63];
                            var57 -= class280.field4819[var63];
                            var59 -= class38.field578[var63];
                            var60 -= class195.field3230[var63];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var10[var48][var61] = class154.method1099(var56 / var60, (byte) 126, var57 / var60, var58 * 256 / var59);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label770: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class125.method922((byte) 114) || (class308.field5219[0][var64][var65] & 0x2) != 0 || (class308.field5219[var12][var64][var65] & 0x10) == 0 && class311.method2149(var64, 73, var12, var65) == class291.field4986) {
                        if (var12 < class198.field3270) {
                            class198.field3270 = var12;
                        }
                        int var66 = class123.field2027[var12][var64][var65] & 0xFF;
                        int var67 = class94.field1467[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class97.field1558[var12][var64][var65];
                            int var69 = class97.field1558[var12][var64 + 1][var65];
                            int var70 = class97.field1558[var12][var64 + 1][var65 + 1];
                            int var71 = class97.field1558[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class230.field3780[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class289.method2008(var67 - 1, 4).field506) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var68 == var70 && var68 == var71) {
                                    class1.field3[var12][var64][var65] = class239.method1677(class1.field3[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = 0;
                                var74 = -1;
                            } else {
                                var74 = var10[var64][var65];
                                int var75 = (var74 & 0x7F) + var9;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var74 + var8 & 0xFC00) + (var74 & 0x380) + var75;
                                var73 = class298.field5102[class105.method792((byte) -128, var76, 96)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class114.method827(var12, var64, var65, 0, 0, -1, var68, var69, var70, var71, class105.method792((byte) -128, var74, var77), class105.method792((byte) -128, var74, var78), class105.method792((byte) -128, var74, var79), class105.method792((byte) -128, var74, var80), 0, 0, 0, 0, var73, 0);
                                if (class55.field815 && var12 > 0 && var74 != -1 && class37.method245(var66 - 1, -21177).field5340) {
                                    class158.method1131(0, 0, true, false, var64, var65, var68 - class97.field1558[0][var64][var65], -class97.field1558[0][var64 + 1][var65] + var69, var70 - class97.field1558[0][var64 + 1][var65 + 1], -class97.field1558[0][var64][var65 + 1] + var71);
                                }
                                if (class55.field815 && !arg1 && class172.field2833 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class94.field1467[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class34 var84 = class289.method2008(var83 - 1, 4);
                                                    if (var84.field508 != -1 && class298.field5107.method373(var84.field508, (byte) -128) == 4) {
                                                        class172.field2833[var64][var65] = (var84.field504 << 24) + var84.field492;
                                                        continue label770;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var85 = class78.field1250[var12][var64][var65];
                                int var86 = class230.field3780[var12][var64][var65] + 1;
                                class34 var87 = class289.method2008(var67 - 1, 4);
                                if (class55.field815 && !arg1 && class172.field2833 != null && var12 == 0) {
                                    if (var87.field508 != -1 && class298.field5107.method373(var87.field508, (byte) -128) == 4) {
                                        class172.field2833[var64][var65] = (var87.field504 << 24) + var87.field492;
                                    } else {
                                        label751: for (int var88 = var64 - 1; var88 <= (var64 + 1); var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class94.field1467[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class34 var91 = class289.method2008(var90 - 1, 4);
                                                        if (var91.field508 != -1 && class298.field5107.method373(var91.field508, (byte) -128) == 4) {
                                                            class172.field2833[var64][var65] = (var91.field504 << 24) + var91.field492;
                                                            break label751;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field508;
                                if (var92 >= 0 && !class298.field5107.method379(var92, (byte) 126)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var94 = class298.field5102[class13.method92(92, class298.field5107.method374(var92, -2), 96)];
                                } else if (var87.field500 == -1) {
                                    var94 = 0;
                                    var93 = -2;
                                } else {
                                    var93 = var87.field500;
                                    int var95 = (var93 & 0x7F) + var9;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var93 + var8 & 0xFC00) + var95 + (var93 & 0x380);
                                    var94 = class298.field5102[class13.method92(111, var96, 96)];
                                }
                                if (var87.field494 >= 0) {
                                    int var97 = var87.field494;
                                    int var98 = (var97 & 0x7F) + var9;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var97 & 0x380) + ((var8 + var97 & 0xFC00) + var98);
                                    var94 = class298.field5102[class13.method92(35, var99, 96)];
                                }
                                class114.method827(var12, var64, var65, var86, var85, var92, var68, var69, var70, var71, class105.method792((byte) -128, var74, var77), class105.method792((byte) -128, var74, var78), class105.method792((byte) -128, var74, var79), class105.method792((byte) -128, var74, var80), class13.method92(63, var93, var77), class13.method92(56, var93, var78), class13.method92(105, var93, var79), class13.method92(50, var93, var80), var73, var94);
                                if (class55.field815 && var12 > 0) {
                                    class158.method1131(var86, var85, var93 == -2 || !var87.field495, var74 == -1 || !class37.method245(var66 - 1, -21177).field5340, var64, var65, var68 - class97.field1558[0][var64][var65], -class97.field1558[0][var64 + 1][var65] + var69, var70 - class97.field1558[0][var64 + 1][var65 + 1], -class97.field1558[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class55.field815) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class97.field1558[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class32[] var109 = class254.method1775(var12, var11, class172.field2833, class308.field5219, class78.field1250[var12], class97.field1558[var12], class94.field1467[var12], class230.field3780[var12], class123.field2027[var12], (byte) 98, var10, var101, class239.field3993[0], var100, var102);
                            class197.method1424(var12, var109);
                            break;
                        }
                        class32[] var110 = class254.method1775(var12, var11, (int[][]) null, class308.field5219, class78.field1250[var12], class97.field1558[var12], class94.field1467[var12], class230.field3780[var12], class123.field2027[var12], (byte) 98, var10, var101, (int[][]) null, var100, var102);
                        class32[] var111 = class16.method101(var11, class308.field5219, class97.field1558[var12], class94.field1467[var12], true, var101, var12, class230.field3780[var12], var100, class78.field1250[var12], class123.field2027[var12], var102);
                        class32[] var112 = new class32[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class197.method1424(var12, var112);
                        class116.method869(class123.field2027[var12], class230.field3780[var12], var12, class78.field1250[var12], 1, class135.field2229, class97.field1558[var12], var102, var101, class94.field1467[var12], class135.field2230, var100);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        int var107 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                        var100[var105][var104] = (float) var107 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var106 / var108;
                    }
                    var104++;
                }
            }
            class123.field2027[var12] = (byte[][]) null;
            class94.field1467[var12] = (byte[][]) null;
            class230.field3780[var12] = (byte[][]) null;
            class78.field1250[var12] = (byte[][]) null;
            class249.field4145[var12] = (byte[][]) null;
        }
        class64.method524(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class308.field5219[1][var115][var116] & 0x2) == 2) {
                    class30.method194(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class1.field3[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class1.field3[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121;
                        for (var121 = var118; var121 < 104 && (class1.field3[var117][var119][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        int var122 = var117;
                        int var123 = var117;
                        label452: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class1.field3[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label452;
                                }
                            }
                            var122--;
                        }
                        label441: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class1.field3[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label441;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var121 - (var120 - 1)) * (var123 + 1 - var122);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class97.field1558[var122][var119][var120];
                            int var129 = class97.field1558[var123][var119][var120] - var127;
                            class45.method318(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var129, var128);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class1.field3[var130][var119][var131] = class93.method680(class1.field3[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class1.field3[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var119;
                        int var134 = var117;
                        while (var133 > 0 && (class1.field3[var117][var133 - 1][var118] & 0x2) != 0) {
                            var133--;
                        }
                        int var135 = var117;
                        while (var132 < 104 && (class1.field3[var117][var132 + 1][var118] & 0x2) != 0) {
                            var132++;
                        }
                        label507: while (var135 > 0) {
                            for (int var136 = var133; var136 <= var132; var136++) {
                                if ((class1.field3[var135 - 1][var136][var118] & 0x2) == 0) {
                                    break label507;
                                }
                            }
                            var135--;
                        }
                        label496: while (var134 < 3) {
                            for (int var137 = var133; var137 <= var132; var137++) {
                                if ((class1.field3[var134 + 1][var137][var118] & 0x2) == 0) {
                                    break label496;
                                }
                            }
                            var134++;
                        }
                        int var138 = (var132 + 1 - var133) * (var134 + 1 - var135);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class97.field1558[var134][var133][var118] - var139;
                            int var141 = class97.field1558[var135][var133][var118];
                            class45.method318(2, var133 * 128, var132 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var135; var142 <= var134; var142++) {
                                for (int var143 = var133; var143 <= var132; var143++) {
                                    class1.field3[var142][var143][var118] = class93.method680(class1.field3[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class1.field3[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146;
                        for (var146 = var118; var146 > 0 && (class1.field3[var117][var119][var146 - 1] & 0x4) != 0; var146--) {
                        }
                        int var147;
                        for (var147 = var118; var147 < 104 && (class1.field3[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label561: while (var145 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class1.field3[var117][var145 - 1][var148] & 0x4) == 0) {
                                    break label561;
                                }
                            }
                            var145--;
                        }
                        label550: while (var144 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class1.field3[var117][var144 + 1][var149] & 0x4) == 0) {
                                    break label550;
                                }
                            }
                            var144++;
                        }
                        if (((var147 + 1 - var146) * (var144 + 1 - var145)) >= 4) {
                            int var150 = class97.field1558[var117][var145][var146];
                            class45.method318(4, var145 * 128, var144 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var145; var151 <= var144; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class1.field3[var117][var151][var152] = class93.method680(class1.field3[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[[II[[IIZ[[FIFIIIILkj;IB[[F[[F)I", line = 973)
    public static final int method2162(int arg0, int[][] arg1, int arg2, int[][] arg3, int arg4, boolean arg5, float[][] arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12, class32 arg13, int arg14, byte arg15, float[][] arg16, float[][] arg17) {
        int var18 = 12 / ((arg15 - 46) / 58);
        if (arg11 == 1) {
            int var20 = arg9;
            arg9 = arg12;
            arg12 = 128 - var20;
        } else if (arg11 == 2) {
            arg12 = 128 - arg12;
            arg9 = 128 - arg9;
        } else if (arg11 == 3) {
            int var19 = arg9;
            arg9 = 128 - arg12;
            arg12 = var19;
        }
        field5322++;
        float var21;
        float var22;
        float var23;
        int var24;
        if (arg9 == 0 && arg12 == 0) {
            var21 = arg16[arg10][arg2];
            var22 = arg6[arg10][arg2];
            var23 = arg17[arg10][arg2];
            var24 = arg0;
        } else if (arg9 == 128 && arg12 == 0) {
            var24 = arg4;
            var21 = arg16[arg10 + 1][arg2];
            var22 = arg6[arg10 + 1][arg2];
            var23 = arg17[arg10 + 1][arg2];
        } else if (arg9 == 128 && arg12 == 128) {
            var22 = arg6[arg10 + 1][arg2 + 1];
            var21 = arg16[arg10 + 1][arg2 + 1];
            var23 = arg17[arg10 + 1][arg2 + 1];
            var24 = arg7;
        } else if (arg9 == 0 && arg12 == 128) {
            var23 = arg17[arg10][arg2 + 1];
            var24 = arg14;
            var21 = arg16[arg10][arg2 + 1];
            var22 = arg6[arg10][arg2 + 1];
        } else {
            float var25 = arg16[arg10][arg2];
            float var26 = arg17[arg10][arg2];
            float var27 = arg6[arg10][arg2];
            float var28 = arg6[arg10][arg2 + 1];
            float var29 = (float) arg12 / 128.0F;
            float var30 = (float) arg9 / 128.0F;
            float var31 = arg16[arg10][arg2 + 1];
            float var32 = (arg17[arg10 + 1][arg2] - var26) * var30 + var26;
            float var33 = (arg6[arg10 + 1][arg2 + 1] - var28) * var30 + var28;
            float var34 = (arg6[arg10 + 1][arg2] - var27) * var30 + var27;
            float var35 = arg17[arg10][arg2 + 1];
            float var36 = (arg16[arg10 + 1][arg2 + 1] - var31) * var30 + var31;
            float var37 = (arg16[arg10 + 1][arg2] - var25) * var30 + var25;
            float var38 = (arg17[arg10 + 1][arg2 + 1] - var35) * var30 + var35;
            var23 = (var38 - var32) * var29 + var32;
            var22 = (var33 - var34) * var29 + var34;
            var21 = (var36 - var37) * var29 + var37;
            int var39 = class127.method931(arg0, arg4, (byte) 28, arg9);
            int var40 = class127.method931(arg14, arg7, (byte) 28, arg9);
            var24 = class127.method931(var39, var40, (byte) 28, arg12);
        }
        int var41 = (arg2 << 7) + arg12;
        int var42 = (arg10 << 7) + arg9;
        int var43 = class207.method1460(arg3, arg10, 765189601, arg9, arg12, arg2);
        return arg13.method214(var42, var43, var41, var21, var22, var23, arg5 ? var24 & 0xFFFFFF00 : var24, arg1 == null ? 0.0F : (float) (var43 - class207.method1460(arg1, arg10, 765189601, arg9, arg12, arg2)) / arg8);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 1082)
    public static void method2163(byte arg0) {
        field5312 = null;
        field5313 = null;
        field5317 = null;
        if (arg0 < 54) {
            field5315 = 6;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBJLtl;I)V", line = 1098)
    public static final void method2164(int arg0, int arg1, int arg2, byte arg3, long arg4, class59 arg5, int arg6) {
        if (arg3 > -31) {
            method2161((class30[]) null, false, (byte) 36);
        }
        field5319++;
        class170 var8 = new class170(128);
        var8.method1219(10, true);
        var8.method1237(true, (int) (Math.random() * 99999.0D));
        var8.method1237(true, 519);
        var8.method1206(arg4, false);
        var8.method1213(-1, (int) (Math.random() * 9.9999999E7D));
        var8.method1236((byte) 48, arg5);
        var8.method1213(-1, (int) (Math.random() * 9.9999999E7D));
        var8.method1237(true, class124.field2055);
        var8.method1219(arg6, true);
        var8.method1219(arg0, true);
        var8.method1213(-1, (int) (Math.random() * 9.9999999E7D));
        var8.method1237(true, arg2);
        var8.method1237(true, arg1);
        var8.method1213(-1, (int) (Math.random() * 9.9999999E7D));
        var8.method1216(class185.field3105, class221.field3579, 62);
        class234.field3888.field2787 = 0;
        class234.field3888.method1219(7, true);
        class234.field3888.method1219(var8.field2787, true);
        class234.field3888.method1203(0, (byte) -52, var8.field2787, var8.field2758);
        class165.field2678 = 0;
        class90.field1405 = -3;
        class238.field3977 = 1;
        class265.field4576 = 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Lhi;", line = 1132)
    public static final class189 method2165(boolean arg0) {
        if (!arg0) {
            return (class189) null;
        }
        field5324++;
        class189 var1;
        if (class55.field815) {
            var1 = new class302(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], class53.field794[0], class284.field4879);
        } else {
            var1 = new class5(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], class53.field794[0], class284.field4879);
        }
        class133.method974((byte) 125);
        return var1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 1171)
    public static final void method2166(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class255.field4242; var1++) {
            int var2 = class301.field5143[var1];
            class23 var3 = class23.field311[var2];
            int var4 = class18.field236.method1221(96);
            if ((var4 & 0x8) != 0) {
                var3.field1772 = class18.field236.method1234(-128);
                if (var3.field1772 == 65535) {
                    var3.field1772 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1749 = class18.field236.method1254(-34);
                int var5 = class18.field236.method1209((byte) 56);
                var3.field1760 = 0;
                var3.field1730 = var5 >> 16;
                var3.field1744 = (var5 & 0xFFFF) + class30.field420;
                var3.field1792 = 0;
                if (var3.field1749 == 65535) {
                    var3.field1749 = -1;
                }
                if (class30.field420 < var3.field1744) {
                    var3.field1792 = -1;
                }
                if (var3.field1749 != -1 && class30.field420 == var3.field1744) {
                    int var6 = class221.method1533(var3.field1749, (byte) -44).field5250;
                    if (var6 != -1) {
                        class129 var7 = class265.method1834((byte) -39, var6);
                        if (var7 != null && var7.field2118 != null) {
                            class29.method182(arg0 + 1048576, false, var3.field1774, var7, 0, var3.field1769);
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                int var8 = class18.field236.method1234(-128);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class18.field236.method1246(-8);
                class28.method180(false, var8, var3, var9);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field314.method889(5)) {
                    class300.method2098(var3, (byte) 46);
                }
                var3.field314 = class37.method249(class18.field236.method1254(124), (byte) 75);
                var3.method793(var3.field314.field1948, (byte) 99);
                var3.field1776 = var3.field314.field1940;
                var3.field1763 = var3.field314.field1955;
                var3.field1751 = var3.field314.field1986;
                var3.field1778 = var3.field314.field1946;
                var3.field1745 = var3.field314.field1960;
                var3.field1771 = var3.field314.field1972;
                var3.field1725 = var3.field314.field1988;
                var3.field1720 = var3.field314.field1987;
                if (var3.field314.method889(5)) {
                    class85.method640((class102) null, 127, 0, var3.field1729[0], var3, class247.field4119, (class180) null, var3.field1773[0]);
                }
            }
            if ((var4 & 0x4) != 0) {
                int var10 = class18.field236.method1246(-8);
                int var11 = class18.field236.method1246(-8);
                var3.method796(var11, false, class30.field420, var10);
                var3.field1727 = class30.field420 + 300;
                var3.field1735 = class18.field236.method1246(-8);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1762 = class18.field236.method1250(false);
                var3.field1784 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1742 = class18.field236.method1234(-128);
                var3.field1743 = class18.field236.method1234(-128);
            }
            if ((var4 & 0x20) != 0) {
                int var12 = class18.field236.method1223((byte) -113);
                int var13 = class18.field236.method1248(118);
                var3.method796(var13, false, class30.field420, var12);
            }
        }
        field5320++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public abstract void method1637(int arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1629(int arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)I")
    public abstract int method1627(int arg0, byte arg1);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)Lcj;")
    public abstract class132 method1636(byte arg0);
}
