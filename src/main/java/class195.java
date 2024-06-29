import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class195 extends class279 {

    @OriginalMember(owner = "client!af", name = "v", descriptor = "[I")
    private int[] field3107;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "[I")
    private int[] field3120;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Lnk;")
    private class326 field3124;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "Lnk;")
    private class326 field3113;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Lnk;")
    private class326 field3117;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "[Lnk;")
    private class326[] field3114;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field3118 = 0;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([[[B[[IB[[B[[I[[F[[F[[F[[BI[[B[[B)[Lel;", line = 9)
    public static final class247[] method1442(byte[][][] arg0, int[][] arg1, byte arg2, byte[][] arg3, int[][] arg4, float[][] arg5, float[][] arg6, float[][] arg7, byte[][] arg8, int arg9, byte[][] arg10, byte[][] arg11) {
        field3115++;
        class311 var12 = new class311(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg11[var13][var14] & 0xFF;
                int var16 = arg10[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class10 var17 = class238.method1703(29555, var16 - 1);
                    if (var17.field180 == -1) {
                        continue;
                    }
                    class247 var18 = class107.method732(var12, arg2 ^ 0x66ED, var17);
                    byte var19 = arg3[var13][var14];
                    int[] var20 = class171.field2822[var19];
                    var18.field3870 += var20.length / 2;
                    var18.field3898++;
                    if (var17.field185 && var15 != 0) {
                        var18.field3870 += class99.field1335[var19];
                    }
                }
                if ((arg11[var13][var14] & 0xFF) != 0 || var16 != 0 && arg3[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg10[var13][var14 + 1] & 0xFF;
                    int var28 = arg10[var13 - 1][var14] & 0xFF;
                    int var29 = arg10[var13 + 1][var14] & 0xFF;
                    int var30 = arg10[var13][var14 - 1] & 0xFF;
                    int var31 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class10 var35 = class238.method1703(29555, var31 - 1);
                        if (var35.field185 && var35.field180 != -1) {
                            byte var36 = arg3[var13 - 1][var14 + 1];
                            byte var37 = arg8[var13 - 1][var14 + 1];
                            int var38 = class81.field1113[(var37 + 2 & 0x3) + var36 * 4];
                            int var39 = class81.field1113[(var37 + 3 & 0x3) + var36 * 4];
                            if (class320.field5053[var39][1] && class320.field5053[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var23 == var41) {
                                        var21[var23++] = var31;
                                        break;
                                    }
                                    if (var21[var41] == var31) {
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
                        class10 var44 = class238.method1703(29555, var32 - 1);
                        if (var44.field185 && var44.field180 != -1) {
                            byte var45 = arg8[var13 - 1][var14 - 1];
                            byte var46 = arg3[var13 - 1][var14 - 1];
                            int var47 = class81.field1113[(var45 & 0x3) + var46 * 4];
                            int var48 = class81.field1113[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class320.field5053[var47][1] && class320.field5053[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var23 == var50) {
                                        var21[var23++] = var32;
                                        break;
                                    }
                                    if (var21[var50] == var32) {
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
                        class10 var53 = class238.method1703(29555, var33 - 1);
                        if (var53.field185 && var53.field180 != -1) {
                            byte var54 = arg8[var13 + 1][var14 - 1];
                            byte var55 = arg3[var13 + 1][var14 - 1];
                            int var56 = class81.field1113[(var54 & 0x3) + var55 * 4];
                            int var57 = class81.field1113[var55 * 4 + (var54 + 1 & 0x3)];
                            if (class320.field5053[var57][1] && class320.field5053[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var23 == var59) {
                                        var21[var23++] = var33;
                                        break;
                                    }
                                    if (var21[var59] == var33) {
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
                        class10 var62 = class238.method1703(arg2 + 29454, var34 + -1);
                        if (var62.field185 && var62.field180 != -1) {
                            byte var63 = arg8[var13 + 1][var14 + 1];
                            byte var64 = arg3[var13 + 1][var14 + 1];
                            int var65 = class81.field1113[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class81.field1113[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class320.field5053[var65][1] && class320.field5053[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var23 == var68) {
                                        var21[var23++] = var34;
                                        break;
                                    }
                                    if (var21[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class10 var71 = class238.method1703(29555, var27 - 1);
                        if (var71.field185 && var71.field180 != -1) {
                            var22 = class81.field1113[arg3[var13][var14 + 1] * 4 + (arg8[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var23 == var72) {
                                    var21[var23++] = var27;
                                    break;
                                }
                                if (var21[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class10 var73 = class238.method1703(29555, var28 - 1);
                        if (var73.field185 && var73.field180 != -1) {
                            var24 = class81.field1113[(arg8[var13 - 1][var14] + 3 & 0x3) + arg3[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var23 == var74) {
                                    var21[var23++] = var28;
                                    break;
                                }
                                if (var21[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class10 var75 = class238.method1703(29555, var30 - 1);
                        if (var75.field185 && var75.field180 != -1) {
                            var25 = class81.field1113[(arg8[var13][var14 - 1] & 0x3) + arg3[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var23 == var76) {
                                    var21[var23++] = var30;
                                    break;
                                }
                                if (var21[var76] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class10 var77 = class238.method1703(29555, var29 - 1);
                        if (var77.field185 && var77.field180 != -1) {
                            var26 = class81.field1113[(arg8[var13 + 1][var14] + 1 & 0x3) + arg3[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var23 == var78) {
                                    var21[var23++] = var29;
                                    break;
                                }
                                if (var21[var78] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var23; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class320.field5053[var29 == var80 ? var26 : 0];
                        boolean[] var82 = class320.field5053[var30 == var80 ? var25 : 0];
                        boolean[] var83 = class320.field5053[var27 == var80 ? var22 : 0];
                        boolean[] var84 = class320.field5053[var28 == var80 ? var24 : 0];
                        class10 var85 = class238.method1703(29555, var80 - 1);
                        class247 var86 = class107.method732(var12, 26248, var85);
                        var86.field3870 += 5;
                        var86.field3870 += var83.length - 2;
                        var86.field3870 += var84.length - 2;
                        var86.field3870 += var82.length - 2;
                        var86.field3870 += var81.length - 2;
                        var86.field3898++;
                    }
                }
            }
        }
        for (class247 var87 = (class247) var12.method2174(256); var87 != null; var87 = (class247) var12.method2164((byte) 118)) {
            var87.method1784();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg0[arg9][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg0[1][var88][var89] & 0x2) == 2 && arg9 > 0) {
                    var90 = arg9 - 1;
                } else {
                    var90 = arg9;
                }
                int var91 = arg11[var88][var89] & 0xFF;
                int var92 = arg10[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class10 var93 = class238.method1703(29555, var92 - 1);
                    if (var93.field180 == -1) {
                        continue;
                    }
                    class247 var94 = class107.method732(var12, arg2 + 26147, var93);
                    byte var95 = arg3[var88][var89];
                    byte var96 = arg8[var88][var89];
                    int var97 = class343.method2373(160, arg4[var88][var89], var93.field180, var93.field184);
                    int var98 = class343.method2373(160, arg4[var88 + 1][var89], var93.field180, var93.field184);
                    int var99 = class343.method2373(160, arg4[var88 + 1][var89 + 1], var93.field180, var93.field184);
                    int var100 = class343.method2373(160, arg4[var88][var89 + 1], var93.field180, var93.field184);
                    class287.method2025(arg5, arg1, var90, arg6, var97, var91 != 0 && var93.field185, (byte) 102, var100, var88, var96, arg7, var98, var94, var89, var95, var99);
                }
                if ((arg11[var88][var89] & 0xFF) != 0 || var92 != 0 && arg3[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg10[var88][var89 + 1] & 0xFF;
                    int var108 = arg10[var88 - 1][var89] & 0xFF;
                    int var109 = arg10[var88][var89 - 1] & 0xFF;
                    int var110 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg10[var88 + 1][var89] & 0xFF;
                    int var114 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class10 var115 = class238.method1703(arg2 + 29454, var110 + -1);
                        if (var115.field185 && var115.field180 != -1) {
                            byte var116 = arg8[var88 - 1][var89 + 1];
                            byte var117 = arg3[var88 - 1][var89 + 1];
                            int var118 = class81.field1113[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class81.field1113[(var116 + 3 & 0x3) + var117 * 4];
                            if (class320.field5053[var119][1] && class320.field5053[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var110;
                                        break;
                                    }
                                    if (var102[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class10 var121 = class238.method1703(29555, var111 - 1);
                        if (var121.field185 && var121.field180 != -1) {
                            byte var122 = arg8[var88 - 1][var89 - 1];
                            byte var123 = arg3[var88 - 1][var89 - 1];
                            int var124 = class81.field1113[var123 * 4 + (var122 + 3 & 0x3)];
                            int var125 = class81.field1113[var123 * 4 + (var122 & 0x3)];
                            if (class320.field5053[var125][1] && class320.field5053[var124][0]) {
                                var111 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var126] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class10 var127 = class238.method1703(29555, var112 - 1);
                        if (var127.field185 && var127.field180 != -1) {
                            byte var128 = arg8[var88 + 1][var89 - 1];
                            byte var129 = arg3[var88 + 1][var89 - 1];
                            int var130 = class81.field1113[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class81.field1113[var129 * 4 + (var128 & 0x3)];
                            if (class320.field5053[var130][1] && class320.field5053[var131][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var132] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class10 var133 = class238.method1703(29555, var114 - 1);
                        if (var133.field185 && var133.field180 != -1) {
                            byte var134 = arg8[var88 + 1][var89 + 1];
                            byte var135 = arg3[var88 + 1][var89 + 1];
                            int var136 = class81.field1113[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class81.field1113[var135 * 4 + (var134 + 2 & 0x3)];
                            if (class320.field5053[var137][1] && class320.field5053[var136][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class10 var139 = class238.method1703(29555, var107 - 1);
                        if (var139.field185 && var139.field180 != -1) {
                            var103 = class81.field1113[(arg8[var88][var89 + 1] + 2 & 0x3) + arg3[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class10 var141 = class238.method1703(29555, var108 - 1);
                        if (var141.field185 && var141.field180 != -1) {
                            var104 = class81.field1113[(arg8[var88 - 1][var89] + 3 & 0x3) + arg3[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class10 var143 = class238.method1703(arg2 + 29454, var109 + -1);
                        if (var143.field185 && var143.field180 != -1) {
                            var106 = class81.field1113[(arg8[var88][var89 - 1] & 0x3) + arg3[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var113 != 0 && var92 != var113) {
                        class10 var145 = class238.method1703(29555, var113 - 1);
                        if (var145.field185 && var145.field180 != -1) {
                            var105 = class81.field1113[(arg8[var88 + 1][var89] + 1 & 0x3) + arg3[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var113;
                                    break;
                                }
                                if (var102[var146] == var113) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class320.field5053[var107 == var148 ? var103 : 0];
                        boolean[] var150 = class320.field5053[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class320.field5053[var113 == var148 ? var105 : 0];
                        boolean[] var152 = class320.field5053[var109 == var148 ? var106 : 0];
                        class10 var153 = class238.method1703(arg2 ^ 0x7316, var148 - 1);
                        class247 var154 = class107.method732(var12, 26248, var153);
                        int var155 = class343.method2373(160, arg4[var88][var89], var153.field180, var153.field184) << 8 | 0xFF;
                        int var156 = class343.method2373(160, arg4[var88 + 1][var89], var153.field180, var153.field184) << 8 | 0xFF;
                        int var157 = class343.method2373(160, arg4[var88 + 1][var89 + 1], var153.field180, var153.field184) << 8 | 0xFF;
                        int var158 = class343.method2373(160, arg4[var88][var89 + 1], var153.field180, var153.field184) << 8 | 0xFF;
                        byte var159 = 6;
                        boolean var160 = var110 != var148 && var150[0] && var149[1];
                        int var161 = var149.length + var159 - 2;
                        boolean var162 = var111 != var148 && var152[0] && var150[1];
                        int var163 = var150.length + var161 - 2;
                        boolean var164 = var114 != var148 && var149[0] && var151[1];
                        boolean var165 = var112 != var148 && var151[0] && var152[1];
                        int var166 = var152.length + var163 - 2;
                        int var167 = var151.length + var166 - 2;
                        int[] var168 = new int[var167];
                        byte var169 = 0;
                        int var170 = class121.method875(var158, arg1, var155, true, 0, 64, 64, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -127);
                        int var171 = class121.method875(var158, arg1, var155, var160, 0, 0, 128, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -97);
                        int var172 = class121.method875(var158, arg1, var155, var164, 0, 128, 128, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -77);
                        int var173 = class121.method875(var158, arg1, var155, var162, 0, 0, 0, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -113);
                        int var174 = class121.method875(var158, arg1, var155, var165, 0, 128, 0, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -87);
                        int var180 = var169 + 1;
                        var168[var169] = var170;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class121.method875(var158, arg1, var155, var149[2], 0, 64, 128, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -122);
                        }
                        var168[var180++] = var171;
                        if (var150.length > 2) {
                            var168[var180++] = class121.method875(var158, arg1, var155, var150[2], 0, 0, 64, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -105);
                        }
                        var168[var180++] = var173;
                        if (var152.length > 2) {
                            var168[var180++] = class121.method875(var158, arg1, var155, var152[2], 0, 64, 0, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -85);
                        }
                        var168[var180++] = var174;
                        if (var151.length > 2) {
                            var168[var180++] = class121.method875(var158, arg1, var155, var151[2], 0, 128, 64, arg7, 0.0F, var88, var156, arg5, arg6, var154, (int[][]) null, var89, var157, (byte) -115);
                        }
                        var168[var180++] = var172;
                        var154.method1779(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class247 var175 = (class247) var12.method2174(256); var175 != null; var175 = (class247) var12.method2164((byte) 117)) {
            if (var175.field3897 == 0) {
                var175.method2028(arg2 ^ 0x3474);
            } else {
                var175.method1781();
            }
        }
        int var176 = var12.method2169(false);
        long[] var177 = new long[var176];
        class247[] var178 = new class247[var176];
        var12.method2157(arg2 - 101, var178);
        if (arg2 != 101) {
            return (class247[]) null;
        }
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field4430;
        }
        class43.method347(var177, var178, 9406);
        return var178;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(DIIZLug;ILsi;)Llg;", line = 943)
    public final class186 method1443(double arg0, int arg1, int arg2, boolean arg3, class253 arg4, int arg5, class252 arg6) {
        field3116++;
        class92.method668(true, arg0);
        class281.field4330 = arg6;
        class150.field2347 = arg4;
        class121.method874(arg5, arg2, true);
        class186 var9 = new class186(arg5, arg2);
        for (int var10 = 0; var10 < this.field3114.length; var10++) {
            this.field3114[var10].method2294(arg2, (byte) 81, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3113.field5121) {
                int[] var13 = this.field3113.method103(-71, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3113.method253(var12, (byte) -112);
                var14 = var17[2];
                var15 = var17[0];
                var16 = var17[1];
            }
            int[] var18;
            if (this.field3117.field5121) {
                var18 = this.field3117.method103(-97, var12);
            } else {
                var18 = this.field3117.method253(var12, (byte) -92)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class308.field4796[var21];
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class308.field4796[var20];
                int var25 = class308.field4796[var22];
                int var26;
                if (var23 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field3038[var11++] = (var24 << 8) + (var23 << 16) + (var26 << 24) + var25;
                if (arg3) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        if (arg1 > -19) {
            this.field3114 = (class326[]) null;
        }
        for (int var27 = 0; var27 < this.field3114.length; var27++) {
            this.field3114[var27].method350((byte) -64);
        }
        return var9;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZDLsi;Lug;II)Lun;", line = 1081)
    public final class190 method1444(int arg0, boolean arg1, double arg2, class252 arg3, class253 arg4, int arg5, int arg6) {
        field3119++;
        class92.method668(true, arg2);
        class281.field4330 = arg3;
        class150.field2347 = arg4;
        class121.method874(arg5, arg6, true);
        class190 var9 = new class190(arg5, arg6);
        for (int var10 = 0; var10 < this.field3114.length; var10++) {
            this.field3114[var10].method2294(arg6, (byte) 92, arg5);
        }
        int var11 = 0;
        for (int var12 = arg0; var12 < arg6; var12++) {
            if (arg1) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3113.field5121) {
                int[] var17 = this.field3113.method103(-62, var12);
                var15 = var17;
                var16 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field3113.method253(var12, (byte) 115);
                var14 = var13[2];
                var15 = var13[0];
                var16 = var13[1];
            }
            for (int var18 = 0; var18 != arg5; var18++) {
                int var19 = var15[var18] >> 4;
                int var20 = var16[var18] >> 4;
                int var21 = var14[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                int var22 = class308.field4796[var19];
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class308.field4796[var21];
                int var24 = class308.field4796[var20];
                var9.field3038[var11++] = (var22 << 16) + (var24 << 8) + var23;
                if (arg1) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field3114.length; var25++) {
            this.field3114[var25].method350((byte) -64);
        }
        return var9;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 1192)
    public static final boolean method1445(int arg0, String arg1) {
        field3112++;
        return arg0 == 10066 ? class72.method558(true, 10, -125, arg1) : true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZBILug;ILsi;)[F", line = 1205)
    public final float[] method1446(boolean arg0, byte arg1, int arg2, class253 arg3, int arg4, class252 arg5) {
        class150.field2347 = arg3;
        if (arg1 > -118) {
            method1445(-47, (String) null);
        }
        float[] var7 = new float[arg2 * arg4 * 4];
        field3110++;
        class281.field4330 = arg5;
        class121.method874(arg2, arg4, true);
        for (int var8 = 0; var8 < this.field3114.length; var8++) {
            this.field3114[var8].method2294(arg4, (byte) 90, arg2);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field3113.field5121) {
                int[] var15 = this.field3113.method103(-61, var10);
                var13 = var15;
                var14 = var15;
                var12 = var15;
            } else {
                int[][] var11 = this.field3113.method253(var10, (byte) -4);
                var12 = var11[1];
                var13 = var11[0];
                var14 = var11[2];
            }
            int[] var16;
            if (this.field3117.field5121) {
                var16 = this.field3117.method103(-78, var10);
            } else {
                var16 = this.field3117.method253(var10, (byte) 118)[0];
            }
            int[] var17;
            if (this.field3124.field5121) {
                var17 = this.field3124.method103(-35, var10);
            } else {
                var17 = this.field3124.method253(var10, (byte) 119)[0];
            }
            for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg0) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field3114.length; var21++) {
            this.field3114[var21].method350((byte) -64);
        }
        return var7;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lug;ZLsi;ZDIII)[I", line = 1328)
    public final int[] method1447(class253 arg0, boolean arg1, class252 arg2, boolean arg3, double arg4, int arg5, int arg6, int arg7) {
        int[] var10 = new int[arg6 * arg7];
        field3106++;
        class92.method668(true, arg4);
        class281.field4330 = arg2;
        class150.field2347 = arg0;
        class121.method874(arg7, arg6, true);
        for (int var11 = 0; var11 < this.field3114.length; var11++) {
            this.field3114[var11].method2294(arg6, (byte) 115, arg7);
        }
        if (arg5 != 1) {
            return (int[]) null;
        }
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var13 = -1;
            var14 = arg7 - 1;
        } else {
            var12 = 1;
            var13 = arg7;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3113.field5121) {
                int[] var21 = this.field3113.method103(-34, var16);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field3113.method253(var16, (byte) -38);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var20[var22] >> 4;
                int var25 = class308.field4796[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = var19[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class308.field4796[var24];
                int var28 = class308.field4796[var26];
                var10[var15++] = (var25 << 16) + (var28 << 8) + var27;
                if (arg1) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3114.length; var29++) {
            this.field3114[var29].method350((byte) -64);
        }
        return var10;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III[B)I", line = 1460)
    public static final int method1448(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        field3123++;
        int var5 = arg1;
        if (arg0 <= 53) {
            return -48;
        }
        while (var5 < arg2) {
            var4 = var4 >>> 8 ^ class214.field3377[(var4 ^ arg3[var5]) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 1484)
    public static final void method1449(int arg0) {
        class81.method592(-83);
        field3122++;
        class94.method673(16156);
        class153.method1112(arg0 - 27862);
        class320.method2244(21844);
        class68.method536(5004);
        class116.method821(true);
        class311.method2167(-1);
        class256.method1852(false);
        class315.method2193(16711680);
        class245.method1755((byte) 118);
        class10.method126(false);
        class121.method868((byte) -51);
        class91.method661(101);
        class184.method1356(false);
        class79.method588((byte) -119);
        class68.method535(128);
        class116.method823((byte) -35);
        class205.method1513(arg0);
        class58.method468(-1000000);
        class273.method1921(arg0 + 11);
        class84.field1148.method1355(false);
        class339.field5284.method1355(false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 1519)
    public static final void method1450(String arg0, boolean arg1) {
        field3109++;
        if (class235.field3666 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class83.method608(arg0, (byte) -82);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class235.field3666.length && class235.field3666[var2].field4430 != var3) {
            var2++;
        }
        if (var2 < class235.field3666.length && class235.field3666[var2] != null && arg1) {
            class183.field2965.method1947((byte) 87, 149);
            class130.field1924++;
            class183.field2965.method53((byte) -110, class235.field3666[var2].field4430);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILsi;Lug;)Z", line = 1559)
    public final boolean method1451(int arg0, class252 arg1, class253 arg2) {
        field3108++;
        if (arg0 > -22) {
            this.field3124 = (class326) null;
        }
        if (class256.field4039 > 0) {
            for (int var4 = 0; var4 < this.field3107.length; var4++) {
                if (!arg2.method1823(class256.field4039, this.field3107[var4], (byte) 90)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3107.length; var5++) {
                if (!arg2.method1837(106, this.field3107[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3120.length; var6++) {
            if (!arg1.method1805(this.field3120[var6], (byte) 12)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V", line = 1619)
    public static final void method1452(int arg0, int arg1, int arg2) {
        field3111++;
        class221 var3 = class46.method359(-125, arg1);
        int var4 = var3.field3507;
        int var5 = var3.field3498;
        int var6 = -44 / ((43 - arg2) / 60);
        int var7 = var3.field3499;
        int var8 = class33.field484[var7 - var5];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var5;
        class15.method143(var4, 120, class256.field4046[var4] & ~var9 | arg0 << var5 & var9);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLsi;IIDLug;I)[I", line = 1646)
    public final int[] method1453(boolean arg0, class252 arg1, int arg2, int arg3, double arg4, class253 arg5, int arg6) {
        int[] var9 = new int[arg6 * 4 * arg3];
        class92.method668(true, arg4);
        class150.field2347 = arg5;
        class281.field4330 = arg1;
        class121.method874(arg6, arg3, true);
        field3121++;
        for (int var10 = 0; var10 < this.field3114.length; var10++) {
            this.field3114[var10].method2294(arg3, (byte) 90, arg6);
        }
        int var11 = arg2;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg0) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3113.field5121) {
                int[] var17 = this.field3113.method103(arg2 ^ 0xFFFFFFBD, var12);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field3113.method253(var12, (byte) 120);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field3117.field5121) {
                var18 = this.field3117.method103(-33, var12);
            } else {
                var18 = this.field3117.method253(var12, (byte) 115)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class308.field4796[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class308.field4796[var21];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class308.field4796[var24];
                int var26;
                if (var23 == 0 && var22 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var22 << 8) + (var26 << 24) + (var23 << 16) + var25;
                if (arg0) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3114.length; var27++) {
            this.field3114[var27].method350((byte) -64);
        }
        return var9;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 1781)
    public class195() {
        this.field3107 = new int[0];
        this.field3120 = new int[0];
        this.field3124 = new class284(0);
        this.field3124.field5116 = 1;
        this.field3113 = new class284();
        this.field3113.field5116 = 1;
        this.field3117 = new class284();
        this.field3114 = new class326[] { this.field3113, this.field3117, this.field3124 };
        this.field3117.field5116 = 1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lvl;)V", line = 1796)
    public class195(class6 arg0) {
        int var2 = arg0.method58(-288140008);
        this.field3114 = new class326[var2];
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class326 var7 = class21.method208(false, arg0);
            if (var7.method825((byte) 119) >= 0) {
                var4++;
            }
            if (var7.method351(-32489) >= 0) {
                var5++;
            }
            int var8 = var7.field5106.length;
            var3[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var3[var6][var9] = arg0.method58(-288140008);
            }
            this.field3114[var6] = var7;
        }
        this.field3120 = new int[var5];
        int var10 = 0;
        this.field3107 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class326 var13 = this.field3114[var12];
            int var14 = var13.field5106.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field5106[var15] = this.field3114[var3[var12][var15]];
            }
            int var16 = var13.method825((byte) 70);
            int var17 = var13.method351(-32489);
            if (var16 > 0) {
                this.field3107[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3120[var10++] = var17;
            }
            var3[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field3113 = this.field3114[arg0.method58(-288140008)];
        this.field3117 = this.field3114[arg0.method58(-288140008)];
        this.field3124 = this.field3114[arg0.method58(-288140008)];
    }
}
