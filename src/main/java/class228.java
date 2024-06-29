import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class228 extends class320 {

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field3831 = -1;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lcg;")
    public static class49 field3825;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "[[S")
    public static short[][] field3830;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V", line = 20)
    public static final void method1653(int arg0, boolean arg1) {
        if (arg1) {
            method1653(-15, true);
        }
        class354.field5601.method469(-11815, arg0);
        field3827++;
        class293.field4695.method469(-11815, arg0);
        class64.field1009.method469(-11815, arg0);
        class286.field4562.method469(-11815, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 38)
    public static void method1654(int arg0) {
        field3825 = null;
        field3830 = (short[][]) null;
        if (arg0 >= -63) {
            field3831 = -14;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([[B[[II[[F[[I[[B[[B[[F[[[B[[F[[BI)[Lbl;", line = 50)
    public static final class337[] method1655(byte[][] arg0, int[][] arg1, int arg2, float[][] arg3, int[][] arg4, byte[][] arg5, byte[][] arg6, float[][] arg7, byte[][][] arg8, float[][] arg9, byte[][] arg10, int arg11) {
        field3828++;
        class79 var12 = new class79(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg6[var13][var14] & 0xFF;
                int var16 = arg10[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class354 var17 = class300.method2076(var16 - 1, -69);
                    if (var17.field5588 == -1) {
                        continue;
                    }
                    class337 var18 = class292.method1997(var17, var12, -1548176480);
                    byte var19 = arg0[var13][var14];
                    int[] var20 = class214.field3592[var19];
                    var18.field5383 += var20.length / 2;
                    var18.field5373++;
                    if (var17.field5600 && var15 != 0) {
                        var18.field5383 += class127.field2199[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var16 != 0 && arg0[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg10[var13][var14 + 1] & 0xFF;
                    int var27 = arg10[var13][var14 - 1] & 0xFF;
                    int var28 = 0;
                    int var29 = arg10[var13 - 1][var14] & 0xFF;
                    int var30 = arg10[var13 + 1][var14] & 0xFF;
                    int var31 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class354 var35 = class300.method2076(var31 - 1, -94);
                        if (var35.field5600 && var35.field5588 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg0[var13 - 1][var14 + 1];
                            int var38 = class253.field4063[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class253.field4063[(var36 + 3 & 0x3) + var37 * 4];
                            if (class238.field3899[var39][1] && class238.field3899[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class354 var44 = class300.method2076(var32 - 1, -51);
                        if (var44.field5600 && var44.field5588 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class253.field4063[(var46 & 0x3) + var45 * 4];
                            int var48 = class253.field4063[(var46 + 3 & 0x3) + var45 * 4];
                            if (class238.field3899[var47][1] && class238.field3899[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var61 = false;
                    } else {
                        class354 var53 = class300.method2076(var33 - 1, -20);
                        if (var53.field5600 && var53.field5588 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg0[var13 + 1][var14 - 1];
                            int var56 = class253.field4063[var55 * 4 + (var54 & 0x3)];
                            int var57 = class253.field4063[(var54 + 1 & 0x3) + var55 * 4];
                            if (class238.field3899[var57][1] && class238.field3899[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var59] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var70 = false;
                    } else {
                        class354 var62 = class300.method2076(var34 - 1, arg11 + 31671);
                        if (var62.field5600 && var62.field5588 != -1) {
                            byte var63 = arg5[var13 + 1][var14 + 1];
                            byte var64 = arg0[var13 + 1][var14 + 1];
                            int var65 = class253.field4063[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class253.field4063[(var63 + 2 & 0x3) + var64 * 4];
                            if (class238.field3899[var66][1] && class238.field3899[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class354 var71 = class300.method2076(var26 - 1, -81);
                        if (var71.field5600 && var71.field5588 != -1) {
                            var25 = class253.field4063[(arg5[var13][var14 + 1] + 2 & 0x3) + arg0[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var26;
                                    break;
                                }
                                if (var22[var72] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class354 var73 = class300.method2076(var29 - 1, -70);
                        if (var73.field5600 && var73.field5588 != -1) {
                            var23 = class253.field4063[(arg5[var13 - 1][var14] + 3 & 0x3) + arg0[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var74] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class354 var75 = class300.method2076(var27 - 1, -44);
                        if (var75.field5600 && var75.field5588 != -1) {
                            var24 = class253.field4063[arg0[var13][var14 - 1] * 4 + (arg5[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var76] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class354 var77 = class300.method2076(var30 - 1, -93);
                        if (var77.field5600 && var77.field5588 != -1) {
                            var28 = class253.field4063[arg0[var13 + 1][var14] * 4 + (arg5[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var30;
                                    break;
                                }
                                if (var22[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class238.field3899[var26 == var80 ? var25 : 0];
                        boolean[] var82 = class238.field3899[var29 == var80 ? var23 : 0];
                        boolean[] var83 = class238.field3899[var30 == var80 ? var28 : 0];
                        boolean[] var84 = class238.field3899[var27 == var80 ? var24 : 0];
                        class354 var85 = class300.method2076(var80 - 1, -58);
                        class337 var86 = class292.method1997(var85, var12, arg11 ^ 0x5C473041);
                        var86.field5383 += 5;
                        var86.field5383 += var81.length - 2;
                        var86.field5383 += var82.length - 2;
                        var86.field5383 += var84.length - 2;
                        var86.field5383 += var83.length - 2;
                        var86.field5373++;
                    }
                }
            }
        }
        for (class337 var87 = (class337) var12.method736(2); var87 != null; var87 = (class337) var12.method727((byte) -110)) {
            var87.method2380();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg8[arg2][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg8[1][var88][var89] & 0x2) == 2 && arg2 > 0) {
                    var90 = arg2 - 1;
                } else {
                    var90 = arg2;
                }
                int var91 = arg6[var88][var89] & 0xFF;
                int var92 = arg10[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class354 var93 = class300.method2076(var92 - 1, -55);
                    if (var93.field5588 == -1) {
                        continue;
                    }
                    class337 var94 = class292.method1997(var93, var12, -1548176480);
                    byte var95 = arg0[var88][var89];
                    byte var96 = arg5[var88][var89];
                    int var97 = class265.method1827(var93.field5588, true, arg1[var88][var89], var93.field5593);
                    int var98 = class265.method1827(var93.field5588, true, arg1[var88 + 1][var89], var93.field5593);
                    int var99 = class265.method1827(var93.field5588, true, arg1[var88 + 1][var89 + 1], var93.field5593);
                    int var100 = class265.method1827(var93.field5588, true, arg1[var88][var89 + 1], var93.field5593);
                    class153.method1229(arg4, var99, var97, var95, 255, var90, arg7, arg3, var91 != 0 && var93.field5600, var89, var94, var100, var96, var88, arg9, var98);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var92 != 0 && arg0[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int[] var105 = new int[8];
                    int var106 = 0;
                    int var107 = arg10[var88][var89 + 1] & 0xFF;
                    int var108 = arg10[var88 - 1][var89] & 0xFF;
                    int var109 = arg10[var88 + 1][var89] & 0xFF;
                    int var110 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg10[var88][var89 - 1] & 0xFF;
                    int var112 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class354 var115 = class300.method2076(var110 - 1, arg11 ^ 0x7C23);
                        if (var115.field5600 && var115.field5588 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg5[var88 - 1][var89 + 1];
                            int var118 = class253.field4063[var116 * 4 + (var117 + 2 & 0x3)];
                            int var119 = class253.field4063[(var117 + 3 & 0x3) + var116 * 4];
                            if (class238.field3899[var119][1] && class238.field3899[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var103 == var120) {
                                        var105[var103++] = var110;
                                        break;
                                    }
                                    if (var105[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class354 var121 = class300.method2076(var112 - 1, -37);
                        if (var121.field5600 && var121.field5588 != -1) {
                            byte var122 = arg0[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class253.field4063[(var123 & 0x3) + var122 * 4];
                            int var125 = class253.field4063[var122 * 4 + (var123 + 3 & 0x3)];
                            if (class238.field3899[var124][1] && class238.field3899[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var103 == var126) {
                                        var105[var103++] = var112;
                                        break;
                                    }
                                    if (var105[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class354 var127 = class300.method2076(var113 - 1, -29);
                        if (var127.field5600 && var127.field5588 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class253.field4063[(var129 & 0x3) + var128 * 4];
                            int var131 = class253.field4063[(var129 + 1 & 0x3) + var128 * 4];
                            if (class238.field3899[var131][1] && class238.field3899[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var103 == var132) {
                                        var105[var103++] = var113;
                                        break;
                                    }
                                    if (var105[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class354 var133 = class300.method2076(var114 - 1, -89);
                        if (var133.field5600 && var133.field5588 != -1) {
                            byte var134 = arg5[var88 + 1][var89 + 1];
                            byte var135 = arg0[var88 + 1][var89 + 1];
                            int var136 = class253.field4063[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class253.field4063[(var134 + 1 & 0x3) + var135 * 4];
                            if (class238.field3899[var136][1] && class238.field3899[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var103 == var138) {
                                        var105[var103++] = var114;
                                        break;
                                    }
                                    if (var105[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class354 var139 = class300.method2076(var107 - 1, -51);
                        if (var139.field5600 && var139.field5588 != -1) {
                            var101 = class253.field4063[(arg5[var88][var89 + 1] + 2 & 0x3) + arg0[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var103 == var140) {
                                    var105[var103++] = var107;
                                    break;
                                }
                                if (var105[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class354 var141 = class300.method2076(var108 - 1, arg11 + 31747);
                        if (var141.field5600 && var141.field5588 != -1) {
                            var102 = class253.field4063[arg0[var88 - 1][var89] * 4 + (arg5[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var103 == var142) {
                                    var105[var103++] = var108;
                                    break;
                                }
                                if (var105[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class354 var143 = class300.method2076(var111 - 1, -49);
                        if (var143.field5600 && var143.field5588 != -1) {
                            var104 = class253.field4063[(arg5[var88][var89 - 1] & 0x3) + arg0[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var103 == var144) {
                                    var105[var103++] = var111;
                                    break;
                                }
                                if (var105[var144] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class354 var145 = class300.method2076(var109 - 1, arg11 ^ 0x7C07);
                        if (var145.field5600 && var145.field5588 != -1) {
                            var106 = class253.field4063[(arg5[var88 + 1][var89] + 1 & 0x3) + arg0[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var103 == var146) {
                                    var105[var103++] = var109;
                                    break;
                                }
                                if (var105[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var103; var147++) {
                        int var148 = var105[var147];
                        boolean[] var149 = class238.field3899[var107 == var148 ? var101 : 0];
                        boolean[] var150 = class238.field3899[var111 == var148 ? var104 : 0];
                        boolean[] var151 = class238.field3899[var108 == var148 ? var102 : 0];
                        boolean[] var152 = class238.field3899[var109 == var148 ? var106 : 0];
                        class354 var153 = class300.method2076(var148 - 1, -126);
                        class337 var154 = class292.method1997(var153, var12, arg11 - 1548144705);
                        int var155 = class265.method1827(var153.field5588, true, arg1[var88][var89], var153.field5593) << 8 | 0xFF;
                        int var156 = class265.method1827(var153.field5588, true, arg1[var88 + 1][var89], var153.field5593) << 8 | 0xFF;
                        int var157 = class265.method1827(var153.field5588, true, arg1[var88 + 1][var89 + 1], var153.field5593) << 8 | 0xFF;
                        int var158 = class265.method1827(var153.field5588, true, arg1[var88][var89 + 1], var153.field5593) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var149.length + var159 - 2;
                        boolean var161 = var110 != var148 && var151[0] && var149[1];
                        int var162 = var151.length + var160 - 2;
                        int var163 = var150.length + var162 - 2;
                        boolean var164 = var114 != var148 && var149[0] && var152[1];
                        int var165 = var152.length + var163 - 2;
                        int[] var166 = new int[var165];
                        byte var167 = 0;
                        boolean var168 = var112 != var148 && var150[0] && var151[1];
                        boolean var169 = var113 != var148 && var152[0] && var150[1];
                        int var170 = class79.method737(arg7, var157, arg9, var155, 64, true, -116, var156, var89, (int[][]) null, 64, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        int var171 = class79.method737(arg7, var157, arg9, var155, 0, var161, arg11 + 31663, var156, var89, (int[][]) null, 128, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        int var172 = class79.method737(arg7, var157, arg9, var155, 128, var164, -104, var156, var89, (int[][]) null, 128, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        int var173 = class79.method737(arg7, var157, arg9, var155, 0, var168, -71, var156, var89, (int[][]) null, 0, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        int var174 = class79.method737(arg7, var157, arg9, var155, 128, var169, -56, var156, var89, (int[][]) null, 0, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        int var180 = var167 + 1;
                        var166[var167] = var170;
                        var166[var180++] = var172;
                        if (var149.length > 2) {
                            var166[var180++] = class79.method737(arg7, var157, arg9, var155, 64, var149[2], -58, var156, var89, (int[][]) null, 128, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        }
                        var166[var180++] = var171;
                        if (var151.length > 2) {
                            var166[var180++] = class79.method737(arg7, var157, arg9, var155, 0, var151[2], -103, var156, var89, (int[][]) null, 64, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        }
                        var166[var180++] = var173;
                        if (var150.length > 2) {
                            var166[var180++] = class79.method737(arg7, var157, arg9, var155, 64, var150[2], -77, var156, var89, (int[][]) null, 0, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        }
                        var166[var180++] = var174;
                        if (var152.length > 2) {
                            var166[var180++] = class79.method737(arg7, var157, arg9, var155, 128, var152[2], -123, var156, var89, (int[][]) null, 64, arg3, var158, var88, 0, arg4, var154, 0.0F);
                        }
                        var166[var180++] = var172;
                        var154.method2381(var90, var88, var89, var166, (int[]) null, true);
                    }
                }
            }
        }
        for (class337 var175 = (class337) var12.method736(2); var175 != null; var175 = (class337) var12.method727((byte) -110)) {
            if (var175.field5390 == 0) {
                var175.method2195(-1);
            } else {
                var175.method2378();
            }
        }
        int var176 = var12.method723(5500);
        class337[] var177 = new class337[var176];
        long[] var178 = new long[var176];
        var12.method731(arg11 + 31845, var177);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field5062;
        }
        if (arg11 == -31775) {
            class197.method1490(arg11 + 31849, var178, var177);
            return var177;
        } else {
            return (class337[]) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 994)
    public static final void method1656(int arg0, int arg1) {
        field3832++;
        class30 var2 = class99.method857((byte) -107, arg0, 8);
        var2.method276(0);
        if (arg1 != 17017) {
            field3831 = 125;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 1008)
    public static final void method1657(int arg0) {
        class341.field5443.method26(arg0, 7);
        class218.field3641++;
        class341.field5443.method2359(-805606200, class227.field3818);
        field3826++;
    }
}
