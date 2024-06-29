import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class116 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "S")
    public static short field1860 = 32767;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lok;")
    public static class146 field1858 = class235.method1724(-12908, "null");

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lok;")
    public static class146 field1866 = class235.method1724(-12908, "::wm0");

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "J")
    public static long field1862;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Loh;")
    public static class15 field1865;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I", line = 17)
    public static final int method782(byte arg0, int arg1) {
        field1869++;
        if (arg0 <= 14) {
            method785(75, false, -93, true, 113, false, -99, -57);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BZ[Lqf;)V", line = 42)
    public static final void method783(byte arg0, boolean arg1, class144[] arg2) {
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        field1871++;
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class46.field775[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class46.field775[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1064(var6, var5, -25873);
                            }
                        }
                    }
                }
            }
            class106.field1701 += (int) (Math.random() * 5.0D) - 2;
            class75.field1220 += (int) (Math.random() * 5.0D) - 2;
            if (class75.field1220 < -8) {
                class75.field1220 = -8;
            }
            if (class106.field1701 < -16) {
                class106.field1701 = -16;
            }
            if (class106.field1701 > 16) {
                class106.field1701 = 16;
            }
            if (class75.field1220 > 8) {
                class75.field1220 = 8;
            }
        }
        if (arg0 != -31) {
            field1866 = (class146) null;
        }
        int var8 = class75.field1220 >> 2 << 10;
        int var9 = class106.field1701 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class164.field2777[var12];
            if (!class271.field4640) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class174.field2914[var12][var17 + 1][var16] - class174.field2914[var12][var17 - 1][var16];
                        int var20 = class174.field2914[var12][var17][var16 + 1] - class174.field2914[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var20 * var20 + var19 * var19 + 65536));
                        int var22 = -65536 / var21;
                        int var23 = (var19 << 8) / var21;
                        int var24 = (var13[var17][var16] >> 1) + (var13[var17 + 1][var16] >> 3) + (var13[var17][var16 + 1] >> 3) + (var13[var17][var16 + -1] >> 2) + (var13[var17 + -1][var16] >> 2);
                        int var25 = (var20 << 8) / var21;
                        int var26 = (var22 * -10 + var23 * -50 + var25 * -50) / var15 + var18;
                        var11[var17][var16] = var26 - var24;
                    }
                }
            } else if (class102.field1641) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44][var43] >> 1) + (var13[var44][var43 + 1] >> 3) + (var13[var44 + 1][var43] >> 3) + (var13[var44 + -1][var43] >> 2) + (var13[var44][var43 - 1] >> 2);
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class231.field3866[2];
                int var28 = (int) class231.field3866[1];
                int var29 = (int) class231.field3866[0];
                int var30 = (int) Math.sqrt((double) (var27 * var27 + var28 * var28 + var29 * var29));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        int var34 = class174.field2914[var12][var33 + 1][var32] - class174.field2914[var12][var33 - 1][var32];
                        int var35 = class174.field2914[var12][var33][var32 + 1] - class174.field2914[var12][var33][var32 - 1];
                        byte var36 = 96;
                        int var37 = (int) Math.sqrt((double) (var34 * var34 - (-var35 * var35 - 65536)));
                        int var38 = (var35 << 8) / var37;
                        int var39 = -65536 / var37;
                        int var40 = (var13[var33][var32 - 1] >> 2) + (var13[var33 - 1][var32] >> 2) + (var13[var33 - -1][var32] >> 3) + (var13[var33][var32 + 1] >> 3) + (var13[var33][var32] >> 1);
                        int var41 = (var34 << 8) / var37;
                        int var42 = (var27 * var38 + (var29 * var41 + (var28 * var39))) / var31 + var36;
                        var11[var33][var32] = var42 - ((int) ((float) var40 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class245.field4054[var47] = 0;
                class25.field447[var47] = 0;
                class84.field1339[var47] = 0;
                class297.field5056[var47] = 0;
                class106.field1711[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class118.field1914[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class274 var52 = class249.method1823(true, var51 - 1);
                            class245.field4054[var49] += var52.field4714;
                            class25.field447[var49] += var52.field4718;
                            class84.field1339[var49] += var52.field4715;
                            class297.field5056[var49] += var52.field4716;
                            var10002 = class106.field1711[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class118.field1914[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class274 var55 = class249.method1823(true, var54 - 1);
                            class245.field4054[var49] -= var55.field4714;
                            class25.field447[var49] -= var55.field4718;
                            class84.field1339[var49] -= var55.field4715;
                            class297.field5056[var49] -= var55.field4716;
                            var10002 = class106.field1711[var49]--;
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
                            var60 += class106.field1711[var63];
                            var59 += class297.field5056[var63];
                            var56 += class25.field447[var63];
                            var58 += class84.field1339[var63];
                            var57 += class245.field4054[var63];
                        }
                        if (var62 >= 0) {
                            var58 -= class84.field1339[var62];
                            var59 -= class297.field5056[var62];
                            var56 -= class25.field447[var62];
                            var57 -= class245.field4054[var62];
                            var60 -= class106.field1711[var62];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var10[var48][var61] = class187.method1458(var57 * 256 / var59, var56 / var60, -193, var58 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label759: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class322.method2236(-7750) || (class46.field775[0][var64][var65] & 0x2) != 0 || (class46.field775[var12][var64][var65] & 0x10) == 0 && class79.method567(var64, var65, 2, var12) == class201.field3358) {
                        if (var12 < class251.field4207) {
                            class251.field4207 = var12;
                        }
                        int var66 = class118.field1914[var12][var64][var65] & 0xFF;
                        int var67 = class55.field988[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class174.field2914[var12][var64 + 1][var65];
                            int var69 = class174.field2914[var12][var64][var65 + 1];
                            int var70 = class174.field2914[var12][var64][var65];
                            int var71 = class174.field2914[var12][var64 + 1][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class292.field4973[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class126.method865(-30465, var67 - 1).field193) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var70 == var71 && var69 == var70) {
                                    class199.field3332[var12][var64][var65] = class138.method1013(class199.field3332[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var10[var64][var65];
                                int var75 = (var73 & 0x7F) + var9;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var8 + var73 & 0xFC00) - (-(var73 & 0x380) - var75);
                                var74 = class109.field1746[class138.method1018(var76, -125, 96)];
                            }
                            int var77 = var11[var64 + 1][var65];
                            int var78 = var11[var64][var65];
                            int var79 = var11[var64][var65 + 1];
                            int var80 = var11[var64 + 1][var65 + 1];
                            if (var67 == 0) {
                                class91.method623(var12, var64, var65, 0, 0, -1, var70, var68, var71, var69, class138.method1018(var73, -127, var78), class138.method1018(var73, arg0 - 97, var77), class138.method1018(var73, -125, var80), class138.method1018(var73, -126, var79), 0, 0, 0, 0, var74, 0);
                                if (class271.field4640 && var12 > 0 && var73 != -1 && class249.method1823(true, var66 - 1).field4711) {
                                    class48.method399(0, 0, true, false, var64, var65, var70 - class174.field2914[0][var64][var65], var68 - class174.field2914[0][var64 - -1][var65], var71 - class174.field2914[0][var64 + 1][var65 + 1], var69 - class174.field2914[0][var64][var65 + 1]);
                                }
                                if (class271.field4640 && !arg1 && class160.field2707 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class55.field988[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class9 var84 = class126.method865(-30465, var83 - 1);
                                                    if (var84.field198 != -1 && class109.field1747.method822(var84.field198, (byte) 43) == 4) {
                                                        class160.field2707[var64][var65] = (var84.field190 << 24) + var84.field178;
                                                        continue label759;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var85 = class20.field389[var12][var64][var65];
                                int var86 = class292.field4973[var12][var64][var65] + 1;
                                class9 var87 = class126.method865(arg0 ^ 0x771E, var67 - 1);
                                if (class271.field4640 && !arg1 && class160.field2707 != null && var12 == 0) {
                                    if (var87.field198 != -1 && class109.field1747.method822(var87.field198, (byte) 95) == 4) {
                                        class160.field2707[var64][var65] = (var87.field190 << 24) + var87.field178;
                                    } else {
                                        label740: for (int var88 = var64 - 1; var88 <= var64 + 1; var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class55.field988[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class9 var91 = class126.method865(-30465, var90 - 1);
                                                        if (var91.field198 != -1 && class109.field1747.method822(var91.field198, (byte) 125) == 4) {
                                                            class160.field2707[var64][var65] = (var91.field190 << 24) + var91.field178;
                                                            break label740;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field198;
                                if (var92 >= 0 && !class109.field1747.method825(true, var92)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var96;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var96 = class109.field1746[class294.method2096(class109.field1747.method833(false, var92), 54, 96)];
                                } else if (var87.field180 == -1) {
                                    var96 = 0;
                                    var93 = -2;
                                } else {
                                    var93 = var87.field180;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 & 0x380) + ((var8 + var93 & 0xFC00) + var94);
                                    var96 = class109.field1746[class294.method2096(var95, -121, 96)];
                                }
                                if (var87.field183 >= 0) {
                                    int var97 = var87.field183;
                                    int var98 = (var97 & 0x7F) + var9;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var97 & 0x380) + (var8 + var97 & 0xFC00) + var98;
                                    var96 = class109.field1746[class294.method2096(var99, -112, 96)];
                                }
                                class91.method623(var12, var64, var65, var86, var85, var92, var70, var68, var71, var69, class138.method1018(var73, arg0 ^ 0x60, var78), class138.method1018(var73, arg0 ^ 0x62, var77), class138.method1018(var73, arg0 ^ 0x63, var80), class138.method1018(var73, -127, var79), class294.method2096(var93, arg0 - 76, var78), class294.method2096(var93, 51, var77), class294.method2096(var93, 94, var80), class294.method2096(var93, arg0 - 73, var79), var74, var96);
                                if (class271.field4640 && var12 > 0) {
                                    class48.method399(var86, var85, var93 == -2 || !var87.field199, var73 == -1 || !class249.method1823(true, var66 - 1).field4711, var64, var65, var70 - class174.field2914[0][var64][var65], -class174.field2914[0][var64 + 1][var65] + var68, var71 - class174.field2914[0][var64 + 1][var65 + 1], -class174.field2914[0][var64][var65 - -1] + var69);
                                }
                            }
                        }
                    }
                }
            }
            if (class271.field4640) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class174.field2914[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class286[] var109 = method789(class174.field2914[var12], class160.field2707, class20.field389[var12], var101, var12, class300.field5082[0], var100, class292.field4973[var12], class118.field1914[var12], class55.field988[var12], class46.field775, var10, var11, var102, arg0 + 7854);
                            class156.method1218(var12, var109);
                            break;
                        }
                        class286[] var110 = method789(class174.field2914[var12], (int[][]) null, class20.field389[var12], var101, var12, (int[][]) null, var100, class292.field4973[var12], class118.field1914[var12], class55.field988[var12], class46.field775, var10, var11, var102, 7823);
                        class286[] var111 = class273.method1997(class174.field2914[var12], class46.field775, class55.field988[var12], class20.field389[var12], var100, var102, var101, var12, class292.field4973[var12], -61, var11, class118.field1914[var12]);
                        class286[] var112 = new class286[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class156.method1218(var12, var112);
                        class27.method176(var12, class118.field1914[var12], var100, var101, class53.field968, (byte) -126, class55.field988[var12], class53.field956, class174.field2914[var12], class20.field389[var12], var102, class292.field4973[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        int var107 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class118.field1914[var12] = (byte[][]) null;
            class55.field988[var12] = (byte[][]) null;
            class292.field4973[var12] = (byte[][]) null;
            class20.field389[var12] = (byte[][]) null;
            class164.field2777[var12] = (byte[][]) null;
        }
        class159.method1249(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class46.field775[1][var115][var116] & 0x2) == 2) {
                    class142.method1047(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class199.field3332[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var118;
                        int var121 = var117;
                        int var122 = var118;
                        while (var120 < 104 && (class199.field3332[var117][var119][var120 + 1] & 0x1) != 0) {
                            var120++;
                        }
                        int var123 = var117;
                        while (var122 > 0 && (class199.field3332[var117][var119][var122 - 1] & 0x1) != 0) {
                            var122--;
                        }
                        label444: while (var121 > 0) {
                            for (int var124 = var122; var124 <= var120; var124++) {
                                if ((class199.field3332[var121 - 1][var119][var124] & 0x1) == 0) {
                                    break label444;
                                }
                            }
                            var121--;
                        }
                        label433: while (var123 < 3) {
                            for (int var125 = var122; var125 <= var120; var125++) {
                                if ((class199.field3332[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label433;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var123 + 1 - var121) * (var120 + 1 - var122);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class174.field2914[var121][var119][var122];
                            int var129 = class174.field2914[var123][var119][var122] - var127;
                            class47.method378(1, var119 * 128, var119 * 128, var122 * 128, var120 * 128 + 128, var129, var128);
                            for (int var130 = var121; var130 <= var123; var130++) {
                                for (int var131 = var122; var131 <= var120; var131++) {
                                    class199.field3332[var130][var119][var131] = class82.method582(class199.field3332[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class199.field3332[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var117;
                        int var133 = var117;
                        int var134 = var119;
                        int var135;
                        for (var135 = var119; var135 < 104 && (class199.field3332[var117][var135 + 1][var118] & 0x2) != 0; var135++) {
                        }
                        while (var134 > 0 && (class199.field3332[var117][var134 - 1][var118] & 0x2) != 0) {
                            var134--;
                        }
                        label498: while (var133 > 0) {
                            for (int var136 = var134; var136 <= var135; var136++) {
                                if ((class199.field3332[var133 - 1][var136][var118] & 0x2) == 0) {
                                    break label498;
                                }
                            }
                            var133--;
                        }
                        label487: while (var132 < 3) {
                            for (int var137 = var134; var137 <= var135; var137++) {
                                if ((class199.field3332[var132 + 1][var137][var118] & 0x2) == 0) {
                                    break label487;
                                }
                            }
                            var132++;
                        }
                        int var138 = (var132 + 1 - var133) * (var135 + 1 - var134);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class174.field2914[var132][var134][var118] - var139;
                            int var141 = class174.field2914[var133][var134][var118];
                            class47.method378(2, var134 * 128, var135 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var133; var142 <= var132; var142++) {
                                for (int var143 = var134; var143 <= var135; var143++) {
                                    class199.field3332[var142][var143][var118] = class82.method582(class199.field3332[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class199.field3332[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146 = var118;
                        int var147;
                        for (var147 = var118; var147 < 104 && (class199.field3332[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        while (var146 > 0 && (class199.field3332[var117][var119][var146 - 1] & 0x4) != 0) {
                            var146--;
                        }
                        label551: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class199.field3332[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label551;
                                }
                            }
                            var144--;
                        }
                        label540: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class199.field3332[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label540;
                                }
                            }
                            var145++;
                        }
                        if ((var145 + 1 - var144) * (var147 + 1 - var146) >= 4) {
                            int var150 = class174.field2914[var117][var144][var146];
                            class47.method378(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class199.field3332[var117][var151][var152] = class82.method582(class199.field3332[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)I", line = 1017)
    public static final int method784(int arg0, int arg1, byte arg2) {
        field1868++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg2 != -1) {
            method784(-89, 7, (byte) 104);
        }
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIZIZII)Lje;", line = 1041)
    public static final class70 method785(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1861++;
        class248 var8 = class84.method589(false, arg6);
        if (arg7 > 1 && var8.field4096 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4156[var10] <= arg7 && var8.field4156[var10] != 0) {
                    var9 = var8.field4096[var10];
                }
            }
            if (var9 != -1) {
                var8 = class84.method589(false, var9);
            }
        }
        class220 var11 = var8.method1809(103);
        if (var11 == null) {
            return null;
        }
        class307 var12 = null;
        if (var8.field4145 != -1) {
            var12 = (class307) method785(0, true, 65, false, 1, true, var8.field4168, 10);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4115 != -1) {
            var12 = (class307) method785(arg0, false, 75, false, arg4, true, var8.field4162, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = 4 % ((arg2 - 6) / 35);
        int var14 = class181.field3034;
        int[] var15 = class181.field3040;
        int var16 = class181.field3037;
        int[] var17 = new int[4];
        class181.method1421(var17);
        class307 var18 = new class307(36, 32);
        class181.method1430(var18.field5243, 36, 32);
        class109.method734();
        class109.method724(16, 16);
        int var19 = var8.field4100;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class109.field1761 = false;
        int var20 = class109.field1750[var8.field4147] * var19 >> 16;
        int var21 = class109.field1757[var8.field4147] * var19 >> 16;
        var11.method1380(0, var8.field4139, var8.field4142, var8.field4147, var8.field4097, (var20 + var8.field4131) - (var11.method325() / 2), var8.field4131 + var21, -1L);
        if (arg4 >= 1) {
            var18.method2173(1);
            if (arg4 >= 2) {
                var18.method2173(16777215);
            }
            class181.method1430(var18.field5243, 36, 32);
        }
        if (arg0 != 0) {
            var18.method2158(arg0);
        }
        if (var8.field4145 != -1) {
            var12.method47(0, 0);
        } else if (var8.field4115 != -1) {
            class181.method1430(var12.field5243, 36, 32);
            var18.method47(0, 0);
            var18 = var12;
        }
        if (arg3 && (var8.field4118 == 1 || arg7 != 1) && arg7 != -1) {
            class168.field2840.method210(class218.method1613(arg7, 1000), 0, 9, 16776960, 1);
        }
        class181.method1430(var15, var14, var16);
        class181.method1419(var17);
        class109.method734();
        class109.field1761 = true;
        return class271.field4640 && !arg5 ? new class8(var18) : var18;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lr;Z)Lr;", line = 1175)
    public static final class264 method786(class264 arg0, boolean arg1) {
        field1859++;
        if (arg0.field4497 != -1) {
            return class98.method680(arg0.field4497, false);
        }
        int var2 = arg0.field4461 >>> 16;
        class88 var3 = new class88(class135.field2266);
        class142 var4 = (class142) var3.method609((byte) -126);
        if (!arg1) {
            return (class264) null;
        }
        while (var4 != null) {
            if (var4.field2370 == var2) {
                return class98.method680((int) var4.field2883, false);
            }
            var4 = (class142) var3.method612((byte) 126);
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 1206)
    public static void method787(int arg0) {
        if (arg0 == -1) {
            field1858 = null;
            field1865 = null;
            field1866 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)I", line = 1219)
    public static final int method788(byte arg0) {
        int var1 = -115 % ((27 - arg0) / 53);
        field1870++;
        return 2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([[I[[I[[B[[FI[[I[[F[[B[[B[[B[[[B[[I[[I[[FI)[Lhi;", line = 1249)
    private static final class286[] method789(int[][] arg0, int[][] arg1, byte[][] arg2, float[][] arg3, int arg4, int[][] arg5, float[][] arg6, byte[][] arg7, byte[][] arg8, byte[][] arg9, byte[][][] arg10, int[][] arg11, int[][] arg12, float[][] arg13, int arg14) {
        field1867++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg8[var16][var17];
                if (var18 == 0) {
                    var18 = arg8[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg8[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg8[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class274 var19 = class249.method1823(true, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field4717 + 1 << 16) + var19.field4724;
                }
            }
        }
        class118 var20 = new class118(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg8[var21][var22] != 0) {
                    int[] var23;
                    if (arg9[var21][var22] == 0) {
                        var23 = class18.field361[0];
                    } else {
                        var23 = class213.field3517[arg7[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg1 != null) {
                        var24 = arg1[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21 + 1][var22];
                    int var26 = var15[var21][var22];
                    int var27 = var15[var21][var22 + 1];
                    int var28 = var15[var21 + 1][var22 + 1];
                    long var29 = (long) var24 | (long) var26 << 32;
                    long var31 = (long) var24 | (long) var25 << 32;
                    long var33 = (long) var24 | (long) var28 << 32;
                    int var35 = var23.length / 2;
                    long var36 = (long) var27 << 32 | (long) var24;
                    class286 var38 = (class286) var20.method810((byte) -92, var29);
                    if (var38 == null) {
                        var38 = new class286((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg5 != null, var24);
                        var20.method805(var38, var29, 67);
                    }
                    var38.field4861 += var35;
                    var38.field4875++;
                    if (var29 != var31) {
                        class286 var39 = (class286) var20.method810((byte) -117, var31);
                        if (var39 == null) {
                            var39 = new class286((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg5 != null, var24);
                            var20.method805(var39, var31, 82);
                        }
                        var39.field4861 += var35;
                        var39.field4875++;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class286 var40 = (class286) var20.method810((byte) -100, var33);
                        if (var40 == null) {
                            var40 = new class286((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg5 != null, var24);
                            var20.method805(var40, var33, 103);
                        }
                        var40.field4875++;
                        var40.field4861 += var35;
                    }
                    if (var29 != var36 && var31 != var36 && var33 != var36) {
                        class286 var41 = (class286) var20.method810((byte) -116, var36);
                        if (var41 == null) {
                            var41 = new class286((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg5 != null, var24);
                            var20.method805(var41, var36, arg14 - 7698);
                        }
                        var41.field4875++;
                        var41.field4861 += var35;
                    }
                }
            }
        }
        if (arg14 != 7823) {
            method790(25, (byte) 39, -83);
        }
        for (class286 var42 = (class286) var20.method807(-99); var42 != null; var42 = (class286) var20.method806(arg14 - 7717)) {
            var42.method2055();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg8[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg10[arg4][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg10[1][var43][var44] & 0x2) == 2 && arg4 > 0) {
                        var46 = arg4 - 1;
                    } else {
                        var46 = arg4;
                    }
                    int var47 = 0;
                    int var48 = 128;
                    if (arg1 != null) {
                        var48 = arg1[var43][var44] >>> 24 << 3;
                        var47 = arg1[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var49 = null;
                    byte var50;
                    int[] var51;
                    if (arg9[var43][var44] == 0) {
                        var51 = class18.field361[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg8[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var54 = 0;
                        byte var55 = 0;
                        byte var56 = 0;
                        int var57 = var54 + (arg8[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        int var58 = var55 + (arg8[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg8[var43][var44 - 1] == var45) {
                            var57++;
                            var53++;
                        } else {
                            var57--;
                            var53--;
                        }
                        int var59 = var56 + (arg8[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg8[var43 + 1][var44] == var45) {
                            var57++;
                            var59++;
                        } else {
                            var57--;
                            var59--;
                        }
                        if (arg8[var43][var44 + 1] == var45) {
                            var59++;
                            var58++;
                        } else {
                            var58--;
                            var59--;
                        }
                        if (arg8[var43 - 1][var44] == var45) {
                            var58++;
                            var53++;
                        } else {
                            var53--;
                            var58--;
                        }
                        int var60 = var57 - var58;
                        int var61 = var53 - var59;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        var50 = (byte) (var60 <= var61 ? 0 : 1);
                        arg2[var43][var44] = var50;
                    } else {
                        var50 = arg2[var43][var44];
                        var49 = class239.field3992[arg7[var43][var44]];
                        var51 = class213.field3517[arg7[var43][var44]];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43 + 1][var44];
                    int var63 = var15[var43 + 1][var44 + 1];
                    int var64 = var15[var43][var44];
                    int var65 = var15[var43][var44 + 1];
                    long var66 = (long) var64 << 32 | (long) var47;
                    long var68 = (long) var65 << 32 | (long) var47;
                    long var70 = (long) var47 | (long) var63 << 32;
                    long var72 = (long) var62 << 32 | (long) var47;
                    int var74 = arg11[var43][var44];
                    int var75 = arg11[var43 + 1][var44 + 1];
                    int var76 = arg11[var43][var44 + 1];
                    int var77 = arg12[var43][var44];
                    int var78 = arg11[var43 + 1][var44];
                    int var79 = arg12[var43 + 1][var44];
                    int var80 = arg12[var43][var44 + 1];
                    int var81 = arg12[var43 + 1][var44 + 1];
                    int var82 = (var64 >> 16) - 1;
                    int var83 = (var63 >> 16) - 1;
                    int var84 = (var62 >> 16) - 1;
                    int var85 = (var65 >> 16) - 1;
                    class286 var86 = (class286) var20.method810((byte) -94, var66);
                    class97.method670(var65 >= var64, var48, arg6, arg13, class151.method1199(var82, var76, var80, -120), var44, (byte) -128, var51, var62 >= var64, var86, arg5, class151.method1199(var82, var74, var77, -128), arg0, arg3, class151.method1199(var82, var78, var79, -89), var46, var43, class151.method1199(var82, var75, var81, -109), var63 >= var64, var49, var50, var64 >= var64);
                    if (var66 != var72) {
                        class286 var87 = (class286) var20.method810((byte) -115, var72);
                        class97.method670(var65 >= var62, var48, arg6, arg13, class151.method1199(var84, var76, var80, -123), var44, (byte) -128, var51, var62 >= var62, var87, arg5, class151.method1199(var84, var74, var77, -87), arg0, arg3, class151.method1199(var84, var78, var79, -120), var46, var43, class151.method1199(var84, var75, var81, -78), var62 <= var63, var49, var50, var62 <= var64);
                    }
                    if (var66 != var70 && var70 != var72) {
                        class286 var88 = (class286) var20.method810((byte) -95, var70);
                        class97.method670(var65 >= var63, var48, arg6, arg13, class151.method1199(var83, var76, var80, -114), var44, (byte) -128, var51, var63 <= var62, var88, arg5, class151.method1199(var83, var74, var77, arg14 - 7909), arg0, arg3, class151.method1199(var83, var78, var79, -103), var46, var43, class151.method1199(var83, var75, var81, -83), var63 <= var63, var49, var50, var64 >= var63);
                    }
                    if (var66 != var68 && var68 != var72 && var68 != var70) {
                        class286 var89 = (class286) var20.method810((byte) -106, var68);
                        class97.method670(var65 >= var65, var48, arg6, arg13, class151.method1199(var85, var76, var80, -76), var44, (byte) -128, var51, var62 >= var65, var89, arg5, class151.method1199(var85, var74, var77, -100), arg0, arg3, class151.method1199(var85, var78, var79, -121), var46, var43, class151.method1199(var85, var75, var81, -81), var65 <= var63, var49, var50, var65 <= var64);
                    }
                }
            }
        }
        for (class286 var90 = (class286) var20.method807(arg14 ^ 0xFFFFE135); var90 != null; var90 = (class286) var20.method806(57)) {
            if (var90.field4869 == 0) {
                var90.method1325(arg14 - 10758);
            } else {
                var90.method2059();
            }
        }
        int var91 = var20.method802(0);
        class286[] var92 = new class286[var91];
        var20.method809(var92, arg14 - 27999);
        long[] var93 = new long[var91];
        for (int var94 = 0; var94 < var91; var94++) {
            var93[var94] = var92[var94].field2883;
        }
        class226.method1668(var93, arg14 - 7823, var92);
        return var92;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V", line = 1646)
    public static final void method790(int arg0, byte arg1, int arg2) {
        field1863++;
        class192.field3176 = class95.field1529[arg0][arg2].field2934;
        class94.field1513 = class95.field1529[arg0][arg2].field2925;
        class119.field1932 = class95.field1529[arg0][arg2].field2927;
        if (arg1 < 97) {
            field1865 = (class15) null;
        }
        class231.method1692((float) class192.field3176, (float) class94.field1513, (float) class119.field1932);
    }
}
