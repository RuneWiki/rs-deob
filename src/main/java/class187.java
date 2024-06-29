import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class187 {

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Z")
    public boolean field2794 = false;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "[Lgg;")
    public static class69[] field2788 = new class69[32768];

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2791 = "flash3:";

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "J")
    public long field2787;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lmd;")
    public class233 field2781;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "[[[B")
    public static byte[][][] field2783;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 6)
    public static void method1280(byte arg0) {
        if (arg0 == 73) {
            field2788 = null;
            field2783 = (byte[][][]) null;
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([[FZ[[B[[F[[F[[B[[I[[[B[[B[[II[[B)[Ljf;", line = 18)
    public static final class86[] method1281(float[][] arg0, boolean arg1, byte[][] arg2, float[][] arg3, float[][] arg4, byte[][] arg5, int[][] arg6, byte[][][] arg7, byte[][] arg8, int[][] arg9, int arg10, byte[][] arg11) {
        field2784++;
        class192 var12 = new class192(128);
        if (arg1) {
            field2785 = -11;
        }
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg5[var13][var14] & 0xFF;
                int var16 = arg8[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class88 var17 = class186.method1278(var16 - 1, true);
                    if (var17.field1309 == -1) {
                        continue;
                    }
                    class86 var18 = class198.method1361(var12, var17, (byte) 90);
                    byte var19 = arg2[var13][var14];
                    int[] var20 = class120.field1877[var19];
                    var18.field1260 += var20.length / 2;
                    var18.field1276++;
                    if (var17.field1305 && var15 != 0) {
                        var18.field1260 += class67.field887[var19];
                    }
                }
                if ((arg5[var13][var14] & 0xFF) != 0 || var16 != 0 && arg2[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg8[var13][var14 + 1] & 0xFF;
                    int var28 = arg8[var13 - 1][var14] & 0xFF;
                    int var29 = arg8[var13][var14 - 1] & 0xFF;
                    int var30 = arg8[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg8[var13 + 1][var14] & 0xFF;
                    int var32 = arg8[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg8[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg8[var13 + 1][var14 + 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class88 var35 = class186.method1278(var30 - 1, true);
                        if (var35.field1305 && var35.field1309 != -1) {
                            byte var36 = arg11[var13 - 1][var14 + 1];
                            byte var37 = arg2[var13 - 1][var14 + 1];
                            int var38 = class243.field3640[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class243.field3640[(var36 + 3 & 0x3) + var37 * 4];
                            if (class225.field3419[var39][1] && class225.field3419[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var41] == var30) {
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
                        class88 var44 = class186.method1278(var32 - 1, !arg1);
                        if (var44.field1305 && var44.field1309 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg11[var13 - 1][var14 - 1];
                            int var47 = class243.field3640[(var46 + 3 & 0x3) + var45 * 4];
                            int var48 = class243.field3640[var45 * 4 + (var46 & 0x3)];
                            if (class225.field3419[var48][1] && class225.field3419[var47][0]) {
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
                        class88 var53 = class186.method1278(var33 - 1, !arg1);
                        if (var53.field1305 && var53.field1309 != -1) {
                            byte var54 = arg11[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class243.field3640[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class243.field3640[(var54 & 0x3) + var55 * 4];
                            if (class225.field3419[var56][1] && class225.field3419[var57][0]) {
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
                        class88 var62 = class186.method1278(var34 - 1, !arg1);
                        if (var62.field1305 && var62.field1309 != -1) {
                            byte var63 = arg11[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class243.field3640[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class243.field3640[(var63 + 2 & 0x3) + var64 * 4];
                            if (class225.field3419[var66][1] && class225.field3419[var65][0]) {
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
                    if (var27 != 0 && var16 != var27) {
                        class88 var71 = class186.method1278(var27 - 1, true);
                        if (var71.field1305 && var71.field1309 != -1) {
                            var25 = class243.field3640[(arg11[var13][var14 + 1] + 2 & 0x3) + arg2[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class88 var73 = class186.method1278(var28 - 1, true);
                        if (var73.field1305 && var73.field1309 != -1) {
                            var23 = class243.field3640[(arg11[var13 - 1][var14] + 3 & 0x3) + arg2[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class88 var75 = class186.method1278(var29 - 1, true);
                        if (var75.field1305 && var75.field1309 != -1) {
                            var24 = class243.field3640[(arg11[var13][var14 - 1] & 0x3) + arg2[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var16 != var31) {
                        class88 var77 = class186.method1278(var31 - 1, true);
                        if (var77.field1305 && var77.field1309 != -1) {
                            var26 = class243.field3640[arg2[var13 + 1][var14] * 4 + (arg11[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var31;
                                    break;
                                }
                                if (var22[var78] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class225.field3419[var27 == var80 ? var25 : 0];
                        boolean[] var82 = class225.field3419[var28 == var80 ? var23 : 0];
                        boolean[] var83 = class225.field3419[var29 == var80 ? var24 : 0];
                        boolean[] var84 = class225.field3419[var31 == var80 ? var26 : 0];
                        class88 var85 = class186.method1278(var80 - 1, true);
                        class86 var86 = class198.method1361(var12, var85, (byte) 90);
                        var86.field1260 += 5;
                        var86.field1260 += var81.length - 2;
                        var86.field1260 += var82.length - 2;
                        var86.field1260 += var83.length - 2;
                        var86.field1260 += var84.length - 2;
                        var86.field1276++;
                    }
                }
            }
        }
        for (class86 var87 = (class86) var12.method1321((byte) -61); var87 != null; var87 = (class86) var12.method1330((byte) -103)) {
            var87.method600();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg7[arg10][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg7[1][var88][var89] & 0x2) == 2 && arg10 > 0) {
                    var90 = arg10 - 1;
                } else {
                    var90 = arg10;
                }
                int var91 = arg8[var88][var89] & 0xFF;
                int var92 = arg5[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class88 var93 = class186.method1278(var91 - 1, true);
                    if (var93.field1309 == -1) {
                        continue;
                    }
                    class86 var94 = class198.method1361(var12, var93, (byte) 90);
                    byte var95 = arg2[var88][var89];
                    byte var96 = arg11[var88][var89];
                    int var97 = class161.method1135(arg6[var88][var89], var93.field1300, 45, var93.field1309);
                    int var98 = class161.method1135(arg6[var88 + 1][var89], var93.field1300, -94, var93.field1309);
                    int var99 = class161.method1135(arg6[var88 + 1][var89 + 1], var93.field1300, -109, var93.field1309);
                    int var100 = class161.method1135(arg6[var88][var89 + 1], var93.field1300, -110, var93.field1309);
                    class9.method40(arg3, var88, var98, var90, arg0, arg4, var97, var100, 78, var99, var89, arg9, var96, var94, var92 != 0 && var93.field1305, var95);
                }
                if ((arg5[var88][var89] & 0xFF) != 0 || var91 != 0 && arg2[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int var103 = 0;
                    int[] var104 = new int[8];
                    int var105 = 0;
                    int var106 = arg8[var88][var89 - 1] & 0xFF;
                    int var107 = arg8[var88][var89 + 1] & 0xFF;
                    int var108 = arg8[var88 - 1][var89] & 0xFF;
                    int var109 = arg8[var88 + 1][var89] & 0xFF;
                    int var110 = 0;
                    int var111 = arg8[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg8[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg8[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg8[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class88 var115 = class186.method1278(var111 - 1, true);
                        if (var115.field1305 && var115.field1309 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg11[var88 - 1][var89 + 1];
                            int var118 = class243.field3640[(var117 + 2 & 0x3) + var116 * 4];
                            int var119 = class243.field3640[var116 * 4 + (var117 + 3 & 0x3)];
                            if (class225.field3419[var119][1] && class225.field3419[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var104[var101++] = var111;
                                        break;
                                    }
                                    if (var104[var120] == var111) {
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
                        class88 var121 = class186.method1278(var112 - 1, true);
                        if (var121.field1305 && var121.field1309 != -1) {
                            byte var122 = arg2[var88 - 1][var89 - 1];
                            byte var123 = arg11[var88 - 1][var89 - 1];
                            int var124 = class243.field3640[(var123 & 0x3) + var122 * 4];
                            int var125 = class243.field3640[(var123 + 3 & 0x3) + var122 * 4];
                            if (class225.field3419[var124][1] && class225.field3419[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var104[var101++] = var112;
                                        break;
                                    }
                                    if (var104[var126] == var112) {
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
                        class88 var127 = class186.method1278(var113 - 1, true);
                        if (var127.field1305 && var127.field1309 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg11[var88 + 1][var89 - 1];
                            int var130 = class243.field3640[(var129 & 0x3) + var128 * 4];
                            int var131 = class243.field3640[(var129 + 1 & 0x3) + var128 * 4];
                            if (class225.field3419[var131][1] && class225.field3419[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var104[var101++] = var113;
                                        break;
                                    }
                                    if (var104[var132] == var113) {
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
                        class88 var133 = class186.method1278(var114 - 1, true);
                        if (var133.field1305 && var133.field1309 != -1) {
                            byte var134 = arg11[var88 + 1][var89 + 1];
                            byte var135 = arg2[var88 + 1][var89 + 1];
                            int var136 = class243.field3640[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class243.field3640[(var134 + 1 & 0x3) + var135 * 4];
                            if (class225.field3419[var136][1] && class225.field3419[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var104[var101++] = var114;
                                        break;
                                    }
                                    if (var104[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class88 var139 = class186.method1278(var107 - 1, true);
                        if (var139.field1305 && var139.field1309 != -1) {
                            var102 = class243.field3640[(arg11[var88][var89 + 1] + 2 & 0x3) + arg2[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var104[var101++] = var107;
                                    break;
                                }
                                if (var104[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class88 var141 = class186.method1278(var108 - 1, true);
                        if (var141.field1305 && var141.field1309 != -1) {
                            var103 = class243.field3640[arg2[var88 - 1][var89] * 4 + (arg11[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var104[var101++] = var108;
                                    break;
                                }
                                if (var104[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var106 != 0 && var91 != var106) {
                        class88 var143 = class186.method1278(var106 - 1, true);
                        if (var143.field1305 && var143.field1309 != -1) {
                            var110 = class243.field3640[(arg11[var88][var89 - 1] & 0x3) + arg2[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var104[var101++] = var106;
                                    break;
                                }
                                if (var104[var144] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class88 var145 = class186.method1278(var109 - 1, true);
                        if (var145.field1305 && var145.field1309 != -1) {
                            var105 = class243.field3640[(arg11[var88 + 1][var89] + 1 & 0x3) + arg2[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var104[var101++] = var109;
                                    break;
                                }
                                if (var104[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var104[var147];
                        boolean[] var149 = class225.field3419[var107 == var148 ? var102 : 0];
                        boolean[] var150 = class225.field3419[var108 == var148 ? var103 : 0];
                        boolean[] var151 = class225.field3419[var106 == var148 ? var110 : 0];
                        boolean[] var152 = class225.field3419[var109 == var148 ? var105 : 0];
                        class88 var153 = class186.method1278(var148 - 1, true);
                        class86 var154 = class198.method1361(var12, var153, (byte) 90);
                        int var155 = class161.method1135(arg6[var88][var89], var153.field1300, -69, var153.field1309) << 8 | 0xFF;
                        int var156 = class161.method1135(arg6[var88 + 1][var89], var153.field1300, 51, var153.field1309) << 8 | 0xFF;
                        int var157 = class161.method1135(arg6[var88 + 1][var89 + 1], var153.field1300, 75, var153.field1309) << 8 | 0xFF;
                        int var158 = class161.method1135(arg6[var88][var89 + 1], var153.field1300, 90, var153.field1309) << 8 | 0xFF;
                        byte var159 = 6;
                        boolean var160 = var111 != var148 && var150[0] && var149[1];
                        int var161 = var149.length + var159 - 2;
                        boolean var162 = var112 != var148 && var151[0] && var150[1];
                        boolean var163 = var114 != var148 && var149[0] && var152[1];
                        int var164 = var150.length + var161 - 2;
                        boolean var165 = var113 != var148 && var152[0] && var151[1];
                        int var166 = var151.length + var164 - 2;
                        int var167 = var152.length + var166 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 64, false, var88, true, var89, var157, 64, var155, (int[][]) null, var158);
                        int var170 = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 0, false, var88, var160, var89, var157, 128, var155, (int[][]) null, var158);
                        byte var171 = 0;
                        int var172 = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 128, arg1, var88, var163, var89, var157, 128, var155, (int[][]) null, var158);
                        int var173 = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 0, false, var88, var162, var89, var157, 0, var155, (int[][]) null, var158);
                        int var174 = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 128, false, var88, var165, var89, var157, 0, var155, (int[][]) null, var158);
                        int var180 = var171 + 1;
                        var168[var171] = var169;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 64, false, var88, var149[2], var89, var157, 128, var155, (int[][]) null, var158);
                        }
                        var168[var180++] = var170;
                        if (var150.length > 2) {
                            var168[var180++] = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 0, false, var88, var150[2], var89, var157, 64, var155, (int[][]) null, var158);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 64, arg1, var88, var151[2], var89, var157, 0, var155, (int[][]) null, var158);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class37.method254(var154, 0.0F, arg0, arg3, arg4, 0, var156, arg9, 128, false, var88, var152[2], var89, var157, 64, var155, (int[][]) null, var158);
                        }
                        var168[var180++] = var172;
                        var154.method597(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class86 var175 = (class86) var12.method1321((byte) -122); var175 != null; var175 = (class86) var12.method1330((byte) -58)) {
            if (var175.field1268 == 0) {
                var175.method714(-49);
            } else {
                var175.method598();
            }
        }
        int var176 = var12.method1328(2);
        class86[] var177 = new class86[var176];
        var12.method1323((byte) 89, var177);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field1603;
        }
        class17.method112(var178, (byte) -106, var177);
        return var177;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 980)
    public static final void method1282(int arg0) {
        field2789++;
        class218 var1 = (class218) class164.field2468.method1109(-124);
        if (arg0 != 0) {
            return;
        }
        while (var1 != null) {
            if (var1.field3324 == -1) {
                var1.field3316 = 0;
                class317.method2170((byte) -30, var1);
            } else {
                var1.method714(-68);
            }
            var1 = (class218) class164.field2468.method1115((byte) 115);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Led;", line = 1007)
    public static final class311 method1283(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3374; var4++) {
            class311 var5 = var3.field3354[var4];
            if ((var5.field4720 >> 29 & 0x3L) == 2L && var5.field4724 == arg1 && var5.field4735 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
