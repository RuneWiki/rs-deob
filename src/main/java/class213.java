import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class213 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ldh;")
    public static class179 field2998 = new class179(64);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field2999 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BZ[Lhm;[[[I)V", line = 5)
    public static final void method1456(byte arg0, boolean arg1, class22[] arg2, int[][][] arg3) {
        field2997++;
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class264.field4163[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class264.field4163[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method140(var6, 63, var5);
                            }
                        }
                    }
                }
            }
            class326.field4996 += (int) (Math.random() * 5.0D) - 2;
            class48.field596 += (int) (Math.random() * 5.0D) - 2;
            if (class326.field4996 < -16) {
                class326.field4996 = -16;
            }
            if (class48.field596 < -8) {
                class48.field596 = -8;
            }
            if (class48.field596 > 8) {
                class48.field596 = 8;
            }
            if (class326.field4996 > 16) {
                class326.field4996 = 16;
            }
        }
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class48.field596 >> 2 << 10;
        int var10 = class326.field4996 >> 1;
        int var11 = 24 % ((38 - arg0) / 51);
        int[][] var12 = new int[104][104];
        int[][] var13 = new int[104][104];
        for (int var14 = 0; var14 < var8; var14++) {
            byte[][] var15 = class292.field4586[var14];
            if (!class250.field3787) {
                int var36 = (int) Math.sqrt(5100.0D);
                int var37 = var36 * 768 >> 8;
                for (int var38 = 1; var38 < 103; var38++) {
                    for (int var39 = 1; var39 < 103; var39++) {
                        byte var40 = 74;
                        int var41 = class167.field2324[var14][var39 + 1][var38] - class167.field2324[var14][var39 - 1][var38];
                        int var42 = class167.field2324[var14][var39][var38 + 1] - class167.field2324[var14][var39][var38 - 1];
                        int var43 = (int) Math.sqrt((double) (var41 * var41 + (var42 * var42) + 65536));
                        int var44 = (var42 << 8) / var43;
                        int var45 = -65536 / var43;
                        int var46 = (var41 << 8) / var43;
                        int var47 = (var44 * -50 + var46 * -50 + (var45 * -10)) / var37 + var40;
                        int var48 = (var15[var39][var38 - 1] >> 2) + (var15[var39][var38 + 1] >> 3) + (var15[var39][var38] >> 1) + ((var15[var39 + -1][var38] >> 2) - -(var15[var39 - -1][var38] >> 3));
                        var12[var39][var38] = var47 - var48;
                    }
                }
            } else if (class162.field2241) {
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = (var15[var17 + 1][var16] >> 3) + (var15[var17][var16] >> 1) + (var15[var17 + -1][var16] >> 2) + (var15[var17][var16 + -1] >> 2) + (var15[var17][var16 + 1] >> 3);
                        var12[var17][var16] = var18 - var19;
                    }
                }
            } else {
                int var20 = (int) class64.field834[0];
                int var21 = (int) class64.field834[1];
                int var22 = (int) class64.field834[2];
                int var23 = (int) Math.sqrt((double) (var21 * var21 + var20 * var20 + var22 * var22));
                int var24 = var23 * 1024 >> 8;
                for (int var25 = 1; var25 < 103; var25++) {
                    for (int var26 = 1; var26 < 103; var26++) {
                        int var27 = class167.field2324[var14][var26 + 1][var25] - class167.field2324[var14][var26 - 1][var25];
                        byte var28 = 96;
                        int var29 = class167.field2324[var14][var26][var25 + 1] - class167.field2324[var14][var26][var25 - 1];
                        int var30 = (int) Math.sqrt((double) (var29 * var29 + (var27 * var27 + 65536)));
                        int var31 = (var27 << 8) / var30;
                        int var32 = -65536 / var30;
                        int var33 = (var15[var26][var25] >> 1) + ((var15[var26][var25 - 1] >> 2) + (var15[var26 - 1][var25] >> 2) - (-(var15[var26][var25 - -1] >> 3) + -(var15[var26 + 1][var25] >> 3)));
                        int var34 = (var29 << 8) / var30;
                        int var35 = (var21 * var32 + var20 * var31 + var22 * var34) / var24 + var28;
                        var12[var26][var25] = var35 - ((int) ((float) var33 * 1.7F));
                    }
                }
            }
            for (int var49 = 0; var49 < 104; var49++) {
                class149.field2075[var49] = 0;
                class138.field1934[var49] = 0;
                class283.field4448[var49] = 0;
                class113.field1610[var49] = 0;
                class59.field711[var49] = 0;
            }
            for (int var50 = -5; var50 < 104; var50++) {
                for (int var51 = 0; var51 < 104; var51++) {
                    int var52 = var50 + 5;
                    int var10002;
                    if (var52 < 104) {
                        int var53 = class67.field884[var14][var52][var51] & 0xFF;
                        if (var53 > 0) {
                            class226 var54 = class270.method1962(-126, var53 - 1);
                            class149.field2075[var51] += var54.field3228;
                            class138.field1934[var51] += var54.field3224;
                            class283.field4448[var51] += var54.field3220;
                            class113.field1610[var51] += var54.field3231;
                            var10002 = class59.field711[var51]++;
                        }
                    }
                    int var55 = var50 - 5;
                    if (var55 >= 0) {
                        int var56 = class67.field884[var14][var55][var51] & 0xFF;
                        if (var56 > 0) {
                            class226 var57 = class270.method1962(-128, var56 - 1);
                            class149.field2075[var51] -= var57.field3228;
                            class138.field1934[var51] -= var57.field3224;
                            class283.field4448[var51] -= var57.field3220;
                            class113.field1610[var51] -= var57.field3231;
                            var10002 = class59.field711[var51]--;
                        }
                    }
                }
                if (var50 >= 0) {
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    int var62 = 0;
                    for (int var63 = -5; var63 < 104; var63++) {
                        int var64 = var63 - 5;
                        int var65 = var63 + 5;
                        if (var65 < 104) {
                            var62 += class138.field1934[var65];
                            var59 += class283.field4448[var65];
                            var60 += class113.field1610[var65];
                            var58 += class149.field2075[var65];
                            var61 += class59.field711[var65];
                        }
                        if (var64 >= 0) {
                            var62 -= class138.field1934[var64];
                            var60 -= class113.field1610[var64];
                            var61 -= class59.field711[var64];
                            var58 -= class149.field2075[var64];
                            var59 -= class283.field4448[var64];
                        }
                        if (var63 >= 0 && var61 > 0) {
                            var13[var50][var63] = class214.method1464(109, var62 / var61, var58 * 256 / var60, var59 / var61);
                        }
                    }
                }
            }
            for (int var66 = 1; var66 < 103; var66++) {
                label766: for (int var67 = 1; var67 < 103; var67++) {
                    if (arg1 || class339.method2348((byte) 69) || (class264.field4163[0][var66][var67] & 0x2) != 0 || (class264.field4163[var14][var66][var67] & 0x10) == 0 && class183.method1273(var66, -128, var14, var67) == class244.field3669) {
                        if (var14 < class311.field4822) {
                            class311.field4822 = var14;
                        }
                        int var68 = class67.field884[var14][var66][var67] & 0xFF;
                        int var69 = class239.field3573[var14][var66][var67] & 0xFF;
                        if (var68 > 0 || var69 > 0) {
                            int var70 = class167.field2324[var14][var66 + 1][var67];
                            int var71 = class167.field2324[var14][var66][var67];
                            int var72 = class167.field2324[var14][var66 + 1][var67 + 1];
                            int var73 = class167.field2324[var14][var66][var67 + 1];
                            if (var14 > 0) {
                                boolean var74 = true;
                                if (var68 == 0 && class85.field1082[var14][var66][var67] != 0) {
                                    var74 = false;
                                }
                                if (var69 > 0 && !class272.method1971(var69 - 1, (byte) 96).field4681) {
                                    var74 = false;
                                }
                                if (var74 && var70 == var71 && var71 == var72 && var71 == var73) {
                                    class21.field268[var14][var66][var67] = class48.method283(class21.field268[var14][var66][var67], 4);
                                }
                            }
                            int var75;
                            int var78;
                            if (var68 > 0) {
                                var75 = var13[var66][var67];
                                int var76 = (var75 & 0x7F) + var10;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var75 + var9 & 0xFC00) + (var75 & 0x380) + var76;
                                var78 = class215.field3023[class10.method56(96, var77, false)];
                            } else {
                                var78 = 0;
                                var75 = -1;
                            }
                            int var79 = var12[var66][var67];
                            int var80 = var12[var66 + 1][var67];
                            int var81 = var12[var66 + 1][var67 + 1];
                            int var82 = var12[var66][var67 + 1];
                            if (var69 == 0) {
                                class150.method1006(var14, var66, var67, 0, 0, -1, var71, var70, var72, var73, class10.method56(var79, var75, false), class10.method56(var80, var75, false), class10.method56(var81, var75, false), class10.method56(var82, var75, false), 0, 0, 0, 0, var78, 0);
                                if (class250.field3787 && var14 > 0 && var75 != -1 && class270.method1962(-75, var68 - 1).field3219) {
                                    class178.method1234(0, 0, true, false, var66, var67, var71 - class167.field2324[0][var66][var67], -class167.field2324[0][var66 + 1][var67] + var70, var72 - class167.field2324[0][var66 + 1][var67 + 1], -class167.field2324[0][var66][var67 - -1] + var73);
                                }
                                if (class250.field3787 && !arg1 && class312.field4826 != null && var14 == 0) {
                                    for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                        for (int var84 = var67 - 1; var84 <= var67 + 1; var84++) {
                                            if ((var66 != var83 || var67 != var84) && var83 >= 0 && var83 < 104 && var84 >= 0 && var84 < 104) {
                                                int var85 = class239.field3573[var14][var83][var84] & 0xFF;
                                                if (var85 != 0) {
                                                    class300 var86 = class272.method1971(var85 - 1, (byte) 96);
                                                    if (var86.field4673 != -1 && class120.method819(class215.field3020.method391(false, var86.field4673), 107)) {
                                                        class312.field4826[var66][var67] = (var86.field4685 << 24) + var86.field4679;
                                                        continue label766;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var87 = class21.field270[var14][var66][var67];
                                int var88 = class85.field1082[var14][var66][var67] + 1;
                                class300 var89 = class272.method1971(var69 - 1, (byte) 96);
                                if (class250.field3787 && !arg1 && class312.field4826 != null && var14 == 0) {
                                    if (var89.field4673 != -1 && class120.method819(class215.field3020.method391(false, var89.field4673), 95)) {
                                        class312.field4826[var66][var67] = (var89.field4685 << 24) + var89.field4679;
                                    } else {
                                        label747: for (int var90 = var66 - 1; var90 <= (var66 + 1); var90++) {
                                            for (int var91 = var67 - 1; var91 <= var67 + 1; var91++) {
                                                if ((var66 != var90 || var67 != var91) && var90 >= 0 && var90 < 104 && var91 >= 0 && var91 < 104) {
                                                    int var92 = class239.field3573[var14][var90][var91] & 0xFF;
                                                    if (var92 != 0) {
                                                        class300 var93 = class272.method1971(var92 - 1, (byte) 96);
                                                        if (var93.field4673 != -1 && class120.method819(class215.field3020.method391(false, var93.field4673), 120)) {
                                                            class312.field4826[var66][var67] = (var93.field4685 << 24) + var93.field4679;
                                                            break label747;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var94 = var89.field4673;
                                if (var94 >= 0 && !class215.field3020.method392((byte) 17, var94)) {
                                    var94 = -1;
                                }
                                int var95;
                                int var96;
                                if (var94 >= 0) {
                                    var95 = class215.field3023[class305.method2138(30503, class215.field3020.method375(var94, 4964), 96)];
                                    var96 = -1;
                                } else if (var89.field4676 == -1) {
                                    var95 = 0;
                                    var96 = -2;
                                } else {
                                    var96 = var89.field4676;
                                    int var97 = (var96 & 0x7F) + var10;
                                    if (var97 < 0) {
                                        var97 = 0;
                                    } else if (var97 > 127) {
                                        var97 = 127;
                                    }
                                    int var98 = (var96 & 0x380) + (var9 + var96 & 0xFC00) + var97;
                                    var95 = class215.field3023[class305.method2138(30503, var98, 96)];
                                }
                                if (var89.field4670 >= 0) {
                                    int var99 = var89.field4670;
                                    int var100 = (var99 & 0x7F) + var10;
                                    if (var100 < 0) {
                                        var100 = 0;
                                    } else if (var100 > 127) {
                                        var100 = 127;
                                    }
                                    int var101 = (var9 + var99 & 0xFC00) + (var99 & 0x380) + var100;
                                    var95 = class215.field3023[class305.method2138(30503, var101, 96)];
                                }
                                class150.method1006(var14, var66, var67, var88, var87, var94, var71, var70, var72, var73, class10.method56(var79, var75, false), class10.method56(var80, var75, false), class10.method56(var81, var75, false), class10.method56(var82, var75, false), class305.method2138(30503, var96, var79), class305.method2138(30503, var96, var80), class305.method2138(30503, var96, var81), class305.method2138(30503, var96, var82), var78, var95);
                                if (class250.field3787 && var14 > 0) {
                                    class178.method1234(var88, var87, var96 == -2 || !var89.field4684, var75 == -1 || !class270.method1962(-94, var68 - 1).field3219, var66, var67, var71 - class167.field2324[0][var66][var67], var70 - class167.field2324[0][var66 + 1][var67], var72 - class167.field2324[0][var66 + 1][var67 + 1], -class167.field2324[0][var66][var67 + 1] + var73);
                                }
                            }
                        }
                    }
                }
            }
            if (class250.field3787) {
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class167.field2324[var14];
                float[][] var105 = new float[105][105];
                int var106 = 1;
                while (true) {
                    if (var106 > 103) {
                        if (arg1) {
                            class245[] var111 = class305.method2134(var13, var102, class85.field1082[var14], class167.field2324[var14], var12, var105, class239.field3573[var14], class21.field270[var14], class67.field884[var14], class312.field4826, class74.field957[0], -1441, arg3, var14, var103, class264.field4163);
                            class67.method419(var14, var111);
                            break;
                        }
                        class245[] var112 = class305.method2134(var13, var102, class85.field1082[var14], class167.field2324[var14], var12, var105, class239.field3573[var14], class21.field270[var14], class67.field884[var14], (int[][]) null, (int[][]) null, -1441, arg3, var14, var103, class264.field4163);
                        class245[] var113 = class22.method138(var12, class167.field2324[var14], class21.field270[var14], var103, class67.field884[var14], class85.field1082[var14], var102, class239.field3573[var14], var14, class264.field4163, var105, (byte) -64);
                        class245[] var114 = new class245[var112.length + var113.length];
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var114[var115] = var112[var115];
                        }
                        for (int var116 = 0; var116 < var113.length; var116++) {
                            var114[var112.length + var116] = var113[var116];
                        }
                        class67.method419(var14, var114);
                        class204.method1392(class21.field270[var14], class193.field2775, class85.field1082[var14], class239.field3573[var14], class193.field2767, class67.field884[var14], class167.field2324[var14], -1, var14, var103, var105, var102);
                        break;
                    }
                    for (int var107 = 1; var107 <= 103; var107++) {
                        int var108 = var104[var107 + 1][var106] - var104[var107 - 1][var106];
                        int var109 = var104[var107][var106 + 1] - var104[var107][var106 - 1];
                        float var110 = (float) Math.sqrt((double) (var109 * var109 + (var108 * var108 + 65536)));
                        var102[var107][var106] = (float) var108 / var110;
                        var103[var107][var106] = -256.0F / var110;
                        var105[var107][var106] = (float) var109 / var110;
                    }
                    var106++;
                }
            }
            class67.field884[var14] = (byte[][]) null;
            class239.field3573[var14] = (byte[][]) null;
            class85.field1082[var14] = (byte[][]) null;
            class21.field270[var14] = (byte[][]) null;
            class292.field4586[var14] = (byte[][]) null;
        }
        class325.method2256(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var117 = 0; var117 < 104; var117++) {
            for (int var118 = 0; var118 < 104; var118++) {
                if ((class264.field4163[1][var117][var118] & 0x2) == 2) {
                    class345.method2383(var117, var118);
                }
            }
        }
        for (int var119 = 0; var119 < 4; var119++) {
            for (int var120 = 0; var120 <= 104; var120++) {
                for (int var121 = 0; var121 <= 104; var121++) {
                    if ((class21.field268[var119][var121][var120] & 0x1) != 0) {
                        int var122;
                        for (var122 = var120; var122 > 0 && (class21.field268[var119][var121][var122 - 1] & 0x1) != 0; var122--) {
                        }
                        int var123;
                        for (var123 = var120; var123 < 104 && (class21.field268[var119][var121][var123 + 1] & 0x1) != 0; var123++) {
                        }
                        int var124 = var119;
                        int var125 = var119;
                        label448: while (var124 > 0) {
                            for (int var126 = var122; var126 <= var123; var126++) {
                                if ((class21.field268[var124 - 1][var121][var126] & 0x1) == 0) {
                                    break label448;
                                }
                            }
                            var124--;
                        }
                        label437: while (var125 < 3) {
                            for (int var127 = var122; var127 <= var123; var127++) {
                                if ((class21.field268[var125 + 1][var121][var127] & 0x1) == 0) {
                                    break label437;
                                }
                            }
                            var125++;
                        }
                        int var128 = (var123 + 1 - var122) * (var125 + 1 - var124);
                        if (var128 >= 8) {
                            short var129 = 240;
                            int var130 = class167.field2324[var125][var121][var122] - var129;
                            int var131 = class167.field2324[var124][var121][var122];
                            class296.method2094(1, var121 * 128, var121 * 128, var122 * 128, var123 * 128 + 128, var130, var131);
                            for (int var132 = var124; var132 <= var125; var132++) {
                                for (int var133 = var122; var133 <= var123; var133++) {
                                    class21.field268[var132][var121][var133] = class229.method1613(class21.field268[var132][var121][var133], -2);
                                }
                            }
                        }
                    }
                    if ((class21.field268[var119][var121][var120] & 0x2) != 0) {
                        int var134;
                        for (var134 = var121; var134 > 0 && (class21.field268[var119][var134 - 1][var120] & 0x2) != 0; var134--) {
                        }
                        int var135 = var119;
                        int var136 = var119;
                        int var137;
                        for (var137 = var121; var137 < 104 && (class21.field268[var119][var137 + 1][var120] & 0x2) != 0; var137++) {
                        }
                        label503: while (var135 > 0) {
                            for (int var138 = var134; var138 <= var137; var138++) {
                                if ((class21.field268[var135 - 1][var138][var120] & 0x2) == 0) {
                                    break label503;
                                }
                            }
                            var135--;
                        }
                        label492: while (var136 < 3) {
                            for (int var139 = var134; var139 <= var137; var139++) {
                                if ((class21.field268[var136 + 1][var139][var120] & 0x2) == 0) {
                                    break label492;
                                }
                            }
                            var136++;
                        }
                        int var140 = (var137 + 1 - var134) * (var136 + 1 - var135);
                        if (var140 >= 8) {
                            short var141 = 240;
                            int var142 = class167.field2324[var136][var134][var120] - var141;
                            int var143 = class167.field2324[var135][var134][var120];
                            class296.method2094(2, var134 * 128, var137 * 128 + 128, var120 * 128, var120 * 128, var142, var143);
                            for (int var144 = var135; var144 <= var136; var144++) {
                                for (int var145 = var134; var145 <= var137; var145++) {
                                    class21.field268[var144][var145][var120] = class229.method1613(class21.field268[var144][var145][var120], -3);
                                }
                            }
                        }
                    }
                    if ((class21.field268[var119][var121][var120] & 0x4) != 0) {
                        int var146 = var121;
                        int var147 = var121;
                        int var148;
                        for (var148 = var120; var148 > 0 && (class21.field268[var119][var121][var148 - 1] & 0x4) != 0; var148--) {
                        }
                        int var149;
                        for (var149 = var120; var149 < 104 && (class21.field268[var119][var121][var149 + 1] & 0x4) != 0; var149++) {
                        }
                        label557: while (var147 > 0) {
                            for (int var150 = var148; var150 <= var149; var150++) {
                                if ((class21.field268[var119][var147 - 1][var150] & 0x4) == 0) {
                                    break label557;
                                }
                            }
                            var147--;
                        }
                        label546: while (var146 < 104) {
                            for (int var151 = var148; var151 <= var149; var151++) {
                                if ((class21.field268[var119][var146 + 1][var151] & 0x4) == 0) {
                                    break label546;
                                }
                            }
                            var146++;
                        }
                        if ((var149 + 1 - var148) * (var146 + 1 - var147) >= 4) {
                            int var152 = class167.field2324[var119][var147][var148];
                            class296.method2094(4, var147 * 128, var146 * 128 + 128, var148 * 128, var149 * 128 + 128, var152, var152);
                            for (int var153 = var147; var153 <= var146; var153++) {
                                for (int var154 = var148; var154 <= var149; var154++) {
                                    class21.field268[var119][var153][var154] = class229.method1613(class21.field268[var119][var153][var154], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 971)
    public static void method1457(int arg0) {
        if (arg0 < -30) {
            field2998 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 981)
    public static final void method1458(int arg0) {
        if (class136.field1880 != -1) {
            class235.method1666(-1, class136.field1880, -1, 4);
            class136.field1880 = -1;
        }
        if (arg0 == 2) {
            field2996++;
        }
    }
}
