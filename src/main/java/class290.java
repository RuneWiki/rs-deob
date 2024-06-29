import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class290 extends class120 {

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    private int field4706 = 4;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    private int field4707 = 4;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Lda;")
    public static class212 field4703 = new class212();

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Lok;")
    public static class41 field4708 = class137.method956("<col=80ff00>", 45);

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[S")
    public static short[] field4713 = new short[256];

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "Lok;")
    public static class41 field4716 = class137.method956("T", 45);

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field4714;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Llb;II)V", line = 10)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field4712++;
        if (arg1 != -1) {
            method2018(53);
        }
        if (arg2 == 0) {
            this.field4707 = arg0.method792(arg1 + 3);
        } else if (arg2 == 1) {
            this.field4706 = arg0.method792(arg1 ^ 0xFFFFFFFD);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B[Lue;Z)V", line = 54)
    public static final void method2017(byte arg0, class223[] arg1, boolean arg2) {
        field4705++;
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class126.field1879[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class126.field1879[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method1612(arg0 + 42, var5, var4);
                            }
                        }
                    }
                }
            }
            class174.field2819 += (int) (Math.random() * 5.0D) - 2;
            class68.field1023 += (int) (Math.random() * 5.0D) - 2;
            if (class174.field2819 < -16) {
                class174.field2819 = -16;
            }
            if (class68.field1023 < -8) {
                class68.field1023 = -8;
            }
            if (class68.field1023 > 8) {
                class68.field1023 = 8;
            }
            if (class174.field2819 > 16) {
                class174.field2819 = 16;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class68.field1023 >> 2 << 10;
        int var9 = class174.field2819 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (arg0 != -43) {
            field4714 = (String) null;
        }
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class314.field5301[var12];
            if (!class166.field2625) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class278.field4548[var12][var37 + 1][var36] - class278.field4548[var12][var37 - 1][var36];
                        int var40 = class278.field4548[var12][var37][var36 + 1] - class278.field4548[var12][var37][var36 - 1];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + var39 * var39 + 65536));
                        int var42 = (var40 << 8) / var41;
                        int var43 = (var39 << 8) / var41;
                        int var44 = -65536 / var41;
                        int var45 = (var43 * -50 + (var44 * -10) + (var42 * -50)) / var35 + var38;
                        int var46 = (var13[var37][var36 - 1] >> 2) + (var13[var37][var36] >> 1) + (var13[var37][var36 + 1] >> 3) + (var13[var37 - -1][var36] >> 3) + (var13[var37 + -1][var36] >> 2);
                        var11[var37][var36] = var45 - var46;
                    }
                }
            } else if (class66.field1006) {
                for (int var30 = 1; var30 < 103; var30++) {
                    for (int var31 = 1; var31 < 103; var31++) {
                        int var32 = (var13[var31 - 1][var30] >> 2) + (var13[var31 + 1][var30] >> 3) - (-(var13[var31][var30 + 1] >> 3) + -(var13[var31][var30] >> 1) + -(var13[var31][var30 - 1] >> 2));
                        byte var33 = 74;
                        var11[var31][var30] = var33 - var32;
                    }
                }
            } else {
                int var14 = (int) class58.field832[0];
                int var15 = (int) class58.field832[2];
                int var16 = (int) class58.field832[1];
                int var17 = (int) Math.sqrt((double) (var14 * var14 + var16 * var16 + (var15 * var15)));
                int var18 = var17 * 1024 >> 8;
                for (int var19 = 1; var19 < 103; var19++) {
                    for (int var20 = 1; var20 < 103; var20++) {
                        int var21 = class278.field4548[var12][var20 + 1][var19] - class278.field4548[var12][var20 - 1][var19];
                        byte var22 = 96;
                        int var23 = class278.field4548[var12][var20][var19 + 1] - class278.field4548[var12][var20][var19 - 1];
                        int var24 = (int) Math.sqrt((double) (var21 * var21 + (var23 * var23) + 65536));
                        int var25 = -65536 / var24;
                        int var26 = (var21 << 8) / var24;
                        int var27 = (var23 << 8) / var24;
                        int var28 = (var13[var20][var19 + 1] >> 3) + (var13[var20 + 1][var19] >> 3) + (var13[var20 + -1][var19] >> 2) - (-(var13[var20][var19 + -1] >> 2) + -(var13[var20][var19] >> 1));
                        int var29 = (var15 * var27 + (var14 * var26 + (var16 * var25))) / var18 + var22;
                        var11[var20][var19] = var29 - (int) ((float) var28 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class59.field843[var47] = 0;
                class101.field1442[var47] = 0;
                class232.field3661[var47] = 0;
                class27.field404[var47] = 0;
                class151.field2347[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class277.field4542[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class266 var52 = class268.method1901(var51 - 1, (byte) -121);
                            class59.field843[var49] += var52.field4225;
                            class101.field1442[var49] += var52.field4217;
                            class232.field3661[var49] += var52.field4235;
                            class27.field404[var49] += var52.field4220;
                            var10002 = class151.field2347[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class277.field4542[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class266 var55 = class268.method1901(var54 - 1, (byte) -127);
                            class59.field843[var49] -= var55.field4225;
                            class101.field1442[var49] -= var55.field4217;
                            class232.field3661[var49] -= var55.field4235;
                            class27.field404[var49] -= var55.field4220;
                            var10002 = class151.field2347[var49]--;
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
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 < 104) {
                            var57 += class101.field1442[var63];
                            var60 += class151.field2347[var63];
                            var59 += class232.field3661[var63];
                            var58 += class27.field404[var63];
                            var56 += class59.field843[var63];
                        }
                        if (var62 >= 0) {
                            var58 -= class27.field404[var62];
                            var59 -= class232.field3661[var62];
                            var60 -= class151.field2347[var62];
                            var57 -= class101.field1442[var62];
                            var56 -= class59.field843[var62];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var10[var48][var61] = class109.method734(var57 / var60, (byte) -121, var59 / var60, var56 * 256 / var58);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label766: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class75.method553(arg0 + 24030) || (class126.field1879[0][var64][var65] & 0x2) != 0 || (class126.field1879[var12][var64][var65] & 0x10) == 0 && class251.method1776(var64, var12, true, var65) == class5.field58) {
                        if (class36.field539 > var12) {
                            class36.field539 = var12;
                        }
                        int var66 = class277.field4542[var12][var64][var65] & 0xFF;
                        int var67 = class224.field3586[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class278.field4548[var12][var64][var65];
                            int var69 = class278.field4548[var12][var64 + 1][var65 + 1];
                            int var70 = class278.field4548[var12][var64 + 1][var65];
                            int var71 = class278.field4548[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class69.field1043[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class301.method2075(1000, var67 - 1).field1703) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var68 == var69 && var68 == var71) {
                                    class57.field819[var12][var64][var65] = class255.method1813(class57.field819[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var66 > 0) {
                                var73 = var10[var64][var65];
                                int var74 = (var73 & 0x7F) + var9;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class31.field447[class204.method1443(96, var75, (byte) 67)];
                            } else {
                                var76 = 0;
                                var73 = -1;
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64][var65 + 1];
                            int var80 = var11[var64 + 1][var65 + 1];
                            if (var67 == 0) {
                                class246.method1761(var12, var64, var65, 0, 0, -1, var68, var70, var69, var71, class204.method1443(var77, var73, (byte) 108), class204.method1443(var78, var73, (byte) 53), class204.method1443(var80, var73, (byte) 76), class204.method1443(var79, var73, (byte) 74), 0, 0, 0, 0, var76, 0);
                                if (class166.field2625 && var12 > 0 && var73 != -1 && class268.method1901(var66 - 1, (byte) -128).field4226) {
                                    class263.method1863(0, 0, true, false, var64, var65, var68 - class278.field4548[0][var64][var65], -class278.field4548[0][var64 + 1][var65] + var70, var69 - class278.field4548[0][var64 + 1][var65 + 1], -class278.field4548[0][var64][var65 + 1] + var71);
                                }
                                if (class166.field2625 && !arg2 && class208.field3365 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= var64 + 1; var96++) {
                                        for (int var97 = var65 - 1; var97 <= var65 + 1; var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class224.field3586[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class117 var99 = class301.method2075(arg0 + 1043, var98 + -1);
                                                    if (var99.field1700 != -1 && class31.field461.method690(var99.field1700, (byte) -29) == 4) {
                                                        class208.field3365[var64][var65] = (var99.field1706 << 24) + var99.field1716;
                                                        continue label766;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var81 = class69.field1043[var12][var64][var65] + 1;
                                byte var82 = class276.field4521[var12][var64][var65];
                                class117 var83 = class301.method2075(1000, var67 - 1);
                                if (class166.field2625 && !arg2 && class208.field3365 != null && var12 == 0) {
                                    if (var83.field1700 != -1 && class31.field461.method690(var83.field1700, (byte) -29) == 4) {
                                        class208.field3365[var64][var65] = (var83.field1706 << 24) + var83.field1716;
                                    } else {
                                        label732: for (int var84 = var64 - 1; var84 <= var64 + 1; var84++) {
                                            for (int var85 = var65 - 1; var85 <= var65 + 1; var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class224.field3586[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class117 var87 = class301.method2075(1000, var86 - 1);
                                                        if (var87.field1700 != -1 && class31.field461.method690(var87.field1700, (byte) -29) == 4) {
                                                            class208.field3365[var64][var65] = (var87.field1706 << 24) + var87.field1716;
                                                            break label732;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field1700;
                                if (var88 >= 0 && !class31.field461.method687((byte) -106, var88)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var90;
                                if (var88 >= 0) {
                                    var89 = class31.field447[class259.method1827((byte) -112, class31.field461.method693(2, var88), 96)];
                                    var90 = -1;
                                } else if (var83.field1710 == -1) {
                                    var90 = -2;
                                    var89 = 0;
                                } else {
                                    var90 = var83.field1710;
                                    int var91 = (var90 & 0x7F) + var9;
                                    if (var91 < 0) {
                                        var91 = 0;
                                    } else if (var91 > 127) {
                                        var91 = 127;
                                    }
                                    int var92 = (var8 + var90 & 0xFC00) + (var90 & 0x380) + var91;
                                    var89 = class31.field447[class259.method1827((byte) -117, var92, 96)];
                                }
                                if (var83.field1713 >= 0) {
                                    int var93 = var83.field1713;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var8 + var93 & 0xFC00) + (var93 & 0x380) + var94;
                                    var89 = class31.field447[class259.method1827((byte) -106, var95, 96)];
                                }
                                class246.method1761(var12, var64, var65, var81, var82, var88, var68, var70, var69, var71, class204.method1443(var77, var73, (byte) 95), class204.method1443(var78, var73, (byte) 90), class204.method1443(var80, var73, (byte) 93), class204.method1443(var79, var73, (byte) 101), class259.method1827((byte) -121, var90, var77), class259.method1827((byte) -94, var90, var78), class259.method1827((byte) -108, var90, var80), class259.method1827((byte) -93, var90, var79), var76, var89);
                                if (class166.field2625 && var12 > 0) {
                                    class263.method1863(var81, var82, var90 == -2 || !var83.field1699, var73 == -1 || !class268.method1901(var66 - 1, (byte) -114).field4226, var64, var65, var68 - class278.field4548[0][var64][var65], var70 - class278.field4548[0][var64 + 1][var65], var69 - class278.field4548[0][var64 + 1][var65 + 1], var71 - class278.field4548[0][var64][var65 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class166.field2625) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class278.field4548[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg2) {
                            class6[] var114 = class262.method1846((byte) 120, class214.field3443[0], class69.field1043[var12], class208.field3365, var11, class276.field4521[var12], class277.field4542[var12], var10, class224.field3586[var12], var12, var100, class278.field4548[var12], var103, class126.field1879, var101);
                            class199.method1416(var12, var114);
                            break;
                        }
                        class6[] var109 = class262.method1846((byte) 120, (int[][]) null, class69.field1043[var12], (int[][]) null, var11, class276.field4521[var12], class277.field4542[var12], var10, class224.field3586[var12], var12, var100, class278.field4548[var12], var103, class126.field1879, var101);
                        class6[] var110 = class203.method1441(class224.field3586[var12], class277.field4542[var12], var100, class126.field1879, class278.field4548[var12], var101, var11, var12, var103, -17342, class276.field4521[var12], class69.field1043[var12]);
                        class6[] var111 = new class6[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var113 + var109.length] = var110[var113];
                        }
                        class199.method1416(var12, var111);
                        class310.method2149(var12, var101, class179.field2889, var103, class69.field1043[var12], var100, class276.field4521[var12], class224.field3586[var12], class179.field2896, class277.field4542[var12], class278.field4548[var12], -124);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        int var107 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + (var107 * var107) + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class277.field4542[var12] = (byte[][]) null;
            class224.field3586[var12] = (byte[][]) null;
            class69.field1043[var12] = (byte[][]) null;
            class276.field4521[var12] = (byte[][]) null;
            class314.field5301[var12] = (byte[][]) null;
        }
        class250.method1771(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class126.field1879[1][var115][var116] & 0x2) == 2) {
                    class63.method441(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class57.field819[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var118;
                        int var121 = var118;
                        while (var120 > 0 && (class57.field819[var117][var119][var120 - 1] & 0x1) != 0) {
                            var120--;
                        }
                        while (var121 < 104 && (class57.field819[var117][var119][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        int var122 = var117;
                        int var123 = var117;
                        label450: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class57.field819[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label450;
                                }
                            }
                            var122--;
                        }
                        label439: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class57.field819[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label439;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var121 + 1 - var120) * (var123 + 1 - var122);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class278.field4548[var123][var119][var120] - var127;
                            int var129 = class278.field4548[var122][var119][var120];
                            class225.method1617(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var128, var129);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class57.field819[var130][var119][var131] = class217.method1563(class57.field819[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class57.field819[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var119;
                        while (var132 > 0 && (class57.field819[var117][var132 - 1][var118] & 0x2) != 0) {
                            var132--;
                        }
                        while (var133 < 104 && (class57.field819[var117][var133 + 1][var118] & 0x2) != 0) {
                            var133++;
                        }
                        int var134 = var117;
                        int var135 = var117;
                        label504: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var133; var136++) {
                                if ((class57.field819[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label504;
                                }
                            }
                            var134--;
                        }
                        label493: while (var135 < 3) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class57.field819[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label493;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var133 - (var132 - 1)) * (var135 + 1 - var134);
                        if (var138 >= 8) {
                            int var139 = class278.field4548[var134][var132][var118];
                            short var140 = 240;
                            int var141 = class278.field4548[var135][var132][var118] - var140;
                            class225.method1617(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var141, var139);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class57.field819[var142][var143][var118] = class217.method1563(class57.field819[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class57.field819[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var118;
                        int var146 = var118;
                        int var147 = var119;
                        while (var146 < 104 && (class57.field819[var117][var119][var146 + 1] & 0x4) != 0) {
                            var146++;
                        }
                        while (var145 > 0 && (class57.field819[var117][var119][var145 - 1] & 0x4) != 0) {
                            var145--;
                        }
                        label558: while (var147 > 0) {
                            for (int var148 = var145; var148 <= var146; var148++) {
                                if ((class57.field819[var117][var147 - 1][var148] & 0x4) == 0) {
                                    break label558;
                                }
                            }
                            var147--;
                        }
                        label547: while (var144 < 104) {
                            for (int var149 = var145; var149 <= var146; var149++) {
                                if ((class57.field819[var117][var144 + 1][var149] & 0x4) == 0) {
                                    break label547;
                                }
                            }
                            var144++;
                        }
                        if ((var144 + 1 - var147) * (var146 + 1 - var145) >= 4) {
                            int var150 = class278.field4548[var117][var147][var145];
                            class225.method1617(4, var147 * 128, var144 * 128 + 128, var145 * 128, var146 * 128 + 128, var150, var150);
                            for (int var151 = var147; var151 <= var144; var151++) {
                                for (int var152 = var145; var152 <= var146; var152++) {
                                    class57.field819[var117][var151][var152] = class217.method1563(class57.field819[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IZ)[[I", line = 1032)
    public final int[][] method168(int arg0, boolean arg1) {
        field4710++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int var4 = class226.field3609 / this.field4706;
            int var5 = class307.field5160 / this.field4707;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method858(0, class226.field3609 * var6 / var4, 122);
            } else {
                var7 = this.method858(0, 0, 127);
            }
            int[] var8 = var3[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[1];
            int[] var12 = var7[0];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class307.field5160; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class307.field5160 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var8[var14] = var12[var16];
                var11[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 1094)
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I", line = 1106)
    public final int[] method14(int arg0, int arg1) {
        field4709++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = class307.field5160 / this.field4707;
            int var5 = class226.field3609 / this.field4706;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method854(0, 0, -24059);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method854(0, class226.field3609 * var7 / var5, -24059);
            }
            for (int var8 = 0; var8 < class307.field5160; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class307.field5160 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return arg1 == -14959 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 1191)
    public static void method2018(int arg0) {
        field4713 = null;
        if (arg0 != 1) {
            field4708 = (class41) null;
        }
        field4703 = null;
        field4714 = null;
        field4708 = null;
        field4716 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)V", line = 1205)
    public static final void method2019(boolean arg0, byte arg1) {
        if (arg1 > -83) {
            field4708 = (class41) null;
        }
        class198.field3178 = arg0;
        field4711++;
        class65.field995 = !class75.method553(23987);
    }
}
