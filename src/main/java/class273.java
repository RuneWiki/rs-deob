import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class273 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    public static int[] field4566 = new int[4096];

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[Z")
    public static boolean[] field4570;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lna;")
    public static class26 field4569;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lna;")
    public static class26 field4574;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfi;I)V", line = 8)
    public static final void method1935(class260 arg0, int arg1) {
        if (arg1 < 2) {
            method1935((class260) null, -115);
        }
        field4565++;
        class245.field4024 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([[F[[F[[II[[F[[B[[II[[B[[B[[B[[[B)[Lhg;", line = 20)
    public static final class172[] method1936(float[][] arg0, float[][] arg1, int[][] arg2, int arg3, float[][] arg4, byte[][] arg5, int[][] arg6, int arg7, byte[][] arg8, byte[][] arg9, byte[][] arg10, byte[][][] arg11) {
        field4567++;
        class259 var12 = new class259(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg9[var13][var14] & 0xFF;
                int var16 = arg10[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class89 var17 = class144.method960((byte) -81, var16 - 1);
                    if (var17.field1483 == -1) {
                        continue;
                    }
                    class172 var18 = class249.method1706(var12, false, var17);
                    byte var19 = arg8[var13][var14];
                    int[] var20 = class287.field4804[var19];
                    var18.field2677 += var20.length / 2;
                    var18.field2679++;
                    if (var17.field1467 && var15 != 0) {
                        var18.field2677 += class8.field100[var19];
                    }
                }
                if ((arg9[var13][var14] & 0xFF) != 0 || var16 != 0 && arg8[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = arg10[var13][var14 + 1] & 0xFF;
                    int var26 = arg10[var13][var14 - 1] & 0xFF;
                    int var27 = arg10[var13 - 1][var14] & 0xFF;
                    int[] var28 = new int[8];
                    int var29 = 0;
                    int var30 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg10[var13 + 1][var14] & 0xFF;
                    int var32 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var34 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class89 var35 = class144.method960((byte) 106, var30 - 1);
                        if (var35.field1467 && var35.field1483 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg8[var13 - 1][var14 + 1];
                            int var38 = class36.field589[var37 * 4 + (var36 + 2 & 0x3)];
                            int var39 = class36.field589[(var36 + 3 & 0x3) + var37 * 4];
                            if (class261.field4276[var39][1] && class261.field4276[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var28[var21++] = var30;
                                        break;
                                    }
                                    if (var28[var41] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var52 = false;
                    } else {
                        class89 var44 = class144.method960((byte) 114, var33 - 1);
                        if (var44.field1467 && var44.field1483 != -1) {
                            byte var45 = arg5[var13 - 1][var14 - 1];
                            byte var46 = arg8[var13 - 1][var14 - 1];
                            int var47 = class36.field589[var46 * 4 + (var45 & 0x3)];
                            int var48 = class36.field589[(var45 + 3 & 0x3) + var46 * 4];
                            if (class261.field4276[var47][1] && class261.field4276[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var28[var21++] = var33;
                                        break;
                                    }
                                    if (var28[var50] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var61 = false;
                    } else {
                        class89 var53 = class144.method960((byte) 107, var32 - 1);
                        if (var53.field1467 && var53.field1483 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg8[var13 + 1][var14 - 1];
                            int var56 = class36.field589[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class36.field589[var55 * 4 + (var54 & 0x3)];
                            if (class261.field4276[var56][1] && class261.field4276[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var28[var21++] = var32;
                                        break;
                                    }
                                    if (var28[var59] == var32) {
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
                        class89 var62 = class144.method960((byte) 105, var34 - 1);
                        if (var62.field1467 && var62.field1483 != -1) {
                            byte var63 = arg5[var13 + 1][var14 + 1];
                            byte var64 = arg8[var13 + 1][var14 + 1];
                            int var65 = class36.field589[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class36.field589[(var63 + 2 & 0x3) + var64 * 4];
                            if (class261.field4276[var66][1] && class261.field4276[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var28[var21++] = var34;
                                        break;
                                    }
                                    if (var28[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var25 != 0 && var16 != var25) {
                        class89 var71 = class144.method960((byte) -29, var25 - 1);
                        if (var71.field1467 && var71.field1483 != -1) {
                            var22 = class36.field589[(arg5[var13][var14 + 1] + 2 & 0x3) + arg8[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var28[var21++] = var25;
                                    break;
                                }
                                if (var28[var72] == var25) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class89 var73 = class144.method960((byte) -32, var27 - 1);
                        if (var73.field1467 && var73.field1483 != -1) {
                            var24 = class36.field589[(arg5[var13 - 1][var14] + 3 & 0x3) + arg8[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var28[var21++] = var27;
                                    break;
                                }
                                if (var28[var74] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class89 var75 = class144.method960((byte) 112, var26 - 1);
                        if (var75.field1467 && var75.field1483 != -1) {
                            var23 = class36.field589[(arg5[var13][var14 - 1] & 0x3) + arg8[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var28[var21++] = var26;
                                    break;
                                }
                                if (var28[var76] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var16 != var31) {
                        class89 var77 = class144.method960((byte) -41, var31 - 1);
                        if (var77.field1467 && var77.field1483 != -1) {
                            var29 = class36.field589[(arg5[var13 + 1][var14] + 1 & 0x3) + arg8[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var28[var21++] = var31;
                                    break;
                                }
                                if (var28[var78] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var28[var79];
                        boolean[] var81 = class261.field4276[var27 == var80 ? var24 : 0];
                        boolean[] var82 = class261.field4276[var26 == var80 ? var23 : 0];
                        boolean[] var83 = class261.field4276[var25 == var80 ? var22 : 0];
                        boolean[] var84 = class261.field4276[var31 == var80 ? var29 : 0];
                        class89 var85 = class144.method960((byte) 113, var80 - 1);
                        class172 var86 = class249.method1706(var12, false, var85);
                        var86.field2677 += 5;
                        var86.field2677 += var83.length - 2;
                        var86.field2677 += var81.length - 2;
                        var86.field2677 += var82.length - 2;
                        var86.field2677 += var84.length - 2;
                        var86.field2679++;
                    }
                }
            }
        }
        for (class172 var87 = (class172) var12.method1823(arg7 + 36); var87 != null; var87 = (class172) var12.method1825(arg7 ^ 0xFFFFFF8B)) {
            var87.method1179();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg9[var88][var89] & 0xFF;
                int var91 = arg10[var88][var89] & 0xFF;
                int var92;
                if ((arg11[arg3][var88][var89] & 0x8) != 0) {
                    var92 = 0;
                } else if ((arg11[1][var88][var89] & 0x2) == 2 && arg3 > 0) {
                    var92 = arg3 - 1;
                } else {
                    var92 = arg3;
                }
                if (var91 != 0) {
                    class89 var93 = class144.method960((byte) -25, var91 - 1);
                    if (var93.field1483 == -1) {
                        continue;
                    }
                    class172 var94 = class249.method1706(var12, false, var93);
                    byte var95 = arg8[var88][var89];
                    byte var96 = arg5[var88][var89];
                    int var97 = class84.method655(var93.field1473, var93.field1483, (byte) -111, arg6[var88][var89]);
                    int var98 = class84.method655(var93.field1473, var93.field1483, (byte) 65, arg6[var88 + 1][var89]);
                    int var99 = class84.method655(var93.field1473, var93.field1483, (byte) 68, arg6[var88 + 1][var89 + 1]);
                    int var100 = class84.method655(var93.field1473, var93.field1483, (byte) -84, arg6[var88][var89 + 1]);
                    class167.method1131(var97, arg2, arg1, var88, arg0, var98, var96, var92, var99, (byte) 88, var90 != 0 && var93.field1467, var95, var89, arg4, var100, var94);
                }
                if ((arg9[var88][var89] & 0xFF) != 0 || var91 != 0 && arg8[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg10[var88][var89 + 1] & 0xFF;
                    int var107 = 0;
                    int var108 = arg10[var88 - 1][var89] & 0xFF;
                    int var109 = arg10[var88 + 1][var89] & 0xFF;
                    int var110 = arg10[var88][var89 - 1] & 0xFF;
                    int var111 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class89 var115 = class144.method960((byte) -88, var111 - 1);
                        if (var115.field1467 && var115.field1483 != -1) {
                            byte var116 = arg5[var88 - 1][var89 + 1];
                            byte var117 = arg8[var88 - 1][var89 + 1];
                            int var118 = class36.field589[var117 * 4 + (var116 + 2 & 0x3)];
                            int var119 = class36.field589[var117 * 4 + (var116 + 3 & 0x3)];
                            if (class261.field4276[var119][1] && class261.field4276[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var103 == var120) {
                                        var101[var103++] = var111;
                                        break;
                                    }
                                    if (var101[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class89 var121 = class144.method960((byte) -87, var112 - 1);
                        if (var121.field1467 && var121.field1483 != -1) {
                            byte var122 = arg5[var88 - 1][var89 - 1];
                            byte var123 = arg8[var88 - 1][var89 - 1];
                            int var124 = class36.field589[(var122 & 0x3) + var123 * 4];
                            int var125 = class36.field589[(var122 + 3 & 0x3) + var123 * 4];
                            if (class261.field4276[var124][1] && class261.field4276[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var103 == var126) {
                                        var101[var103++] = var112;
                                        break;
                                    }
                                    if (var101[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class89 var127 = class144.method960((byte) -123, var113 - 1);
                        if (var127.field1467 && var127.field1483 != -1) {
                            byte var128 = arg5[var88 + 1][var89 - 1];
                            byte var129 = arg8[var88 + 1][var89 - 1];
                            int var130 = class36.field589[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class36.field589[(var128 & 0x3) + var129 * 4];
                            if (class261.field4276[var130][1] && class261.field4276[var131][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var103 == var132) {
                                        var101[var103++] = var113;
                                        break;
                                    }
                                    if (var101[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var114 == 0 || var91 == var114) {
                        var114 = 0;
                    } else {
                        class89 var133 = class144.method960((byte) 119, var114 - 1);
                        if (var133.field1467 && var133.field1483 != -1) {
                            byte var134 = arg8[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class36.field589[(var135 + 2 & 0x3) + var134 * 4];
                            int var137 = class36.field589[(var135 + 1 & 0x3) + var134 * 4];
                            if (class261.field4276[var136][1] && class261.field4276[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var103 == var138) {
                                        var101[var103++] = var114;
                                        break;
                                    }
                                    if (var101[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var106 != 0 && var91 != var106) {
                        class89 var139 = class144.method960((byte) 113, var106 - 1);
                        if (var139.field1467 && var139.field1483 != -1) {
                            var102 = class36.field589[(arg5[var88][var89 + 1] + 2 & 0x3) + arg8[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var103 == var140) {
                                    var101[var103++] = var106;
                                    break;
                                }
                                if (var101[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class89 var141 = class144.method960((byte) -103, var108 - 1);
                        if (var141.field1467 && var141.field1483 != -1) {
                            var104 = class36.field589[(arg5[var88 - 1][var89] + 3 & 0x3) + arg8[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var103 == var142) {
                                    var101[var103++] = var108;
                                    break;
                                }
                                if (var101[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class89 var143 = class144.method960((byte) 126, var110 - 1);
                        if (var143.field1467 && var143.field1483 != -1) {
                            var105 = class36.field589[(arg5[var88][var89 - 1] & 0x3) + arg8[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var103 == var144) {
                                    var101[var103++] = var110;
                                    break;
                                }
                                if (var101[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class89 var145 = class144.method960((byte) 116, var109 - 1);
                        if (var145.field1467 && var145.field1483 != -1) {
                            var107 = class36.field589[arg8[var88 + 1][var89] * 4 + (arg5[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var103 == var146) {
                                    var101[var103++] = var109;
                                    break;
                                }
                                if (var101[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var103; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class261.field4276[var106 == var148 ? var102 : 0];
                        boolean[] var150 = class261.field4276[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class261.field4276[var110 == var148 ? var105 : 0];
                        boolean[] var152 = class261.field4276[var109 == var148 ? var107 : 0];
                        class89 var153 = class144.method960((byte) 121, var148 - 1);
                        class172 var154 = class249.method1706(var12, false, var153);
                        int var155 = class84.method655(var153.field1473, var153.field1483, (byte) -76, arg6[var88][var89]) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class84.method655(var153.field1473, var153.field1483, (byte) -85, arg6[var88 + 1][var89]) << 8 | 0xFF;
                        int var158 = class84.method655(var153.field1473, var153.field1483, (byte) 123, arg6[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class84.method655(var153.field1473, var153.field1483, (byte) 106, arg6[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var160 = var112 != var148 && var151[0] && var150[1];
                        boolean var161 = var114 != var148 && var149[0] && var152[1];
                        boolean var162 = var111 != var148 && var150[0] && var149[1];
                        int var163 = var149.length + var156 - 2;
                        boolean var164 = var113 != var148 && var152[0] && var151[1];
                        int var165 = var150.length + var163 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var152.length + var166 - 2;
                        int var168 = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -127, 0, true, var154, arg1, var89, 64, arg0, 64);
                        int[] var169 = new int[var167];
                        byte var170 = 0;
                        int var171 = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -112, 0, var162, var154, arg1, var89, 0, arg0, 128);
                        int var172 = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -119, 0, var161, var154, arg1, var89, 128, arg0, 128);
                        int var173 = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -127, 0, var160, var154, arg1, var89, 0, arg0, 0);
                        int var174 = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -114, 0, var164, var154, arg1, var89, 128, arg0, 0);
                        int var180 = var170 + 1;
                        var169[var170] = var168;
                        var169[var180++] = var172;
                        if (var149.length > 2) {
                            var169[var180++] = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -117, 0, var149[2], var154, arg1, var89, 64, arg0, 128);
                        }
                        var169[var180++] = var171;
                        if (var150.length > 2) {
                            var169[var180++] = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -128, 0, var150[2], var154, arg1, var89, 0, arg0, 64);
                        }
                        var169[var180++] = var173;
                        if (var151.length > 2) {
                            var169[var180++] = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -112, 0, var151[2], var154, arg1, var89, 64, arg0, 0);
                        }
                        var169[var180++] = var174;
                        if (var152.length > 2) {
                            var169[var180++] = class17.method116(var159, 0.0F, var155, var157, (int[][]) null, arg2, var88, arg4, var158, (byte) -127, 0, var152[2], var154, arg1, var89, 128, arg0, 64);
                        }
                        var169[var180++] = var172;
                        var154.method1184(var92, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        for (class172 var175 = (class172) var12.method1823(62); var175 != null; var175 = (class172) var12.method1825(-80)) {
            if (var175.field2678 == 0) {
                var175.method1006(-1024);
            } else {
                var175.method1182();
            }
        }
        int var176 = var12.method1828(97);
        class172[] var177 = new class172[var176];
        long[] var178 = new long[var176];
        var12.method1829(var177, arg7 + 83);
        for (int var179 = arg7; var179 < var176; var179++) {
            var178[var179] = var177[var179].field2293;
        }
        class163.method1111(var178, var177, arg7 - 27);
        return var177;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 964)
    public static void method1937(byte arg0) {
        field4570 = null;
        field4569 = null;
        if (arg0 != -124) {
            field4574 = (class26) null;
        }
        field4574 = null;
        field4566 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4566[var0] = class51.method373((byte) 83, var0);
        }
        field4570 = new boolean[8];
        field4569 = class69.method505("scape main", (byte) -122);
        field4573 = 0;
        field4574 = class69.method505("<col=ffffff> )4 ", (byte) -119);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V", line = 1012)
    public static final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4568++;
        if (class255.field4184) {
            class326.method2279(arg0, arg4, arg0 + arg2, arg1 + arg4);
            class326.method2278(arg0, arg4, arg2, arg1, 0);
        } else {
            class34.method287(arg0, arg4, arg0 + arg2, arg1 + arg4);
            class34.method286(arg0, arg4, arg2, arg1, 0);
        }
        if (class109.field1725 < 100) {
            return;
        }
        if (class260.field4254 == null || class260.field4254.field2320 != arg2 || class260.field4254.field2308 != arg1) {
            class256 var5 = new class256(arg2, arg1);
            class34.method282(var5.field4199, arg2, arg1);
            class96.method721(arg2, 0, 0, class38.field623, 0, 0, class317.field5436, arg1, 0);
            if (class255.field4184) {
                class260.field4254 = new class130(var5);
            } else {
                class260.field4254 = var5;
            }
            if (class255.field4184) {
                class34.field571 = null;
            } else {
                class134.field2040.method1172(0);
            }
        }
        class260.field4254.method879(arg0, arg4);
        if (arg3 != 19481) {
            method1936((float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 126, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), -1, (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (byte[][][]) ((byte[][][]) null));
        }
        int var6 = class177.field2786 * arg1 / class317.field5436 + arg4;
        int var7 = class192.field2998 * arg1 / class317.field5436;
        int var8 = class177.field2782 * arg2 / class38.field623 + arg0;
        int var9 = class302.field5210 * arg2 / class38.field623;
        int var10 = 16711680;
        if (class170.field2670 == 1) {
            var10 = 16777215;
        }
        if (class255.field4184) {
            class326.method2274(var8, var6, var9, var7, var10, 128);
            class326.method2271(var8, var6, var9, var7, var10);
        } else {
            class34.method275(var8, var6, var9, var7, var10, 128);
            class34.method274(var8, var6, var9, var7, var10);
        }
        if (class148.field2316 <= 0) {
            return;
        }
        int var11;
        if (class173.field2716 > 10) {
            var11 = (20 - class173.field2716) * 25;
        } else {
            var11 = class173.field2716 * 25;
        }
        for (class323 var12 = (class323) class124.field1925.method264(arg3 - 19579); var12 != null; var12 = (class323) class124.field1925.method263(4)) {
            if (class321.field5512 == var12.field5549) {
                int var13 = arg4 + (var12.field5558 * arg1 / class317.field5436);
                int var14 = var12.field5548 * arg2 / class38.field623 + arg0;
                if (class255.field4184) {
                    class326.method2274(var14 - 2, var13 + -2, 4, 4, 16776960, var11);
                } else {
                    class34.method275(var14 - 2, var13 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }
}
