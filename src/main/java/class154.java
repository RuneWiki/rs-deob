import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class154 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2320 = "scroll:";

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2328 = "Loaded sprites";

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Z")
    public static boolean field2327 = true;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Lad;")
    public static class128 field2330 = new class128();

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
    public static int[] field2331 = new int[100];

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
    public static boolean field2333 = true;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Luc;")
    public static class190 field2332;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Llb;")
    public static class211 field2322;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Llb;")
    public static class211 field2325;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
    public static int[] field2326;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([[F[[BI[[[B[[I[[F[[B[[FB[[B[[B[[I)[Ljn;", line = 6)
    public static final class123[] method1127(float[][] arg0, byte[][] arg1, int arg2, byte[][][] arg3, int[][] arg4, float[][] arg5, byte[][] arg6, float[][] arg7, byte arg8, byte[][] arg9, byte[][] arg10, int[][] arg11) {
        class29 var12 = new class29(128);
        field2329++;
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg10[var13][var14] & 0xFF;
                int var16 = arg1[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class319 var17 = class116.method904((byte) 12, var16 - 1);
                    if (var17.field4977 == -1) {
                        continue;
                    }
                    class123 var18 = class257.method1785(var17, var12, -111);
                    byte var19 = arg9[var13][var14];
                    int[] var20 = class138.field2155[var19];
                    var18.field1932 += var20.length / 2;
                    var18.field1936++;
                    if (var17.field4969 && var15 != 0) {
                        var18.field1932 += class114.field1790[var19];
                    }
                }
                if ((arg10[var13][var14] & 0xFF) != 0 || var16 != 0 && arg9[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int[] var25 = new int[8];
                    int var26 = arg1[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg1[var13][var14 - 1] & 0xFF;
                    int var29 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var30 = arg1[var13 + 1][var14] & 0xFF;
                    int var31 = arg1[var13 - 1][var14] & 0xFF;
                    int var32 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    if (var29 == 0 || var16 == var29) {
                        boolean var43 = false;
                    } else {
                        class319 var35 = class116.method904((byte) -90, var29 - 1);
                        if (var35.field4969 && var35.field4977 != -1) {
                            byte var36 = arg6[var13 - 1][var14 + 1];
                            byte var37 = arg9[var13 - 1][var14 + 1];
                            int var38 = class246.field3700[var37 * 4 + (var36 + 3 & 0x3)];
                            int var39 = class246.field3700[(var36 + 2 & 0x3) + var37 * 4];
                            if (class273.field4130[var38][1] && class273.field4130[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var22 == var41) {
                                        var25[var22++] = var29;
                                        break;
                                    }
                                    if (var25[var41] == var29) {
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
                        class319 var44 = class116.method904((byte) -108, var32 - 1);
                        if (var44.field4969 && var44.field4977 != -1) {
                            byte var45 = arg6[var13 - 1][var14 - 1];
                            byte var46 = arg9[var13 - 1][var14 - 1];
                            int var47 = class246.field3700[var46 * 4 + (var45 + 3 & 0x3)];
                            int var48 = class246.field3700[(var45 & 0x3) + var46 * 4];
                            if (class273.field4130[var48][1] && class273.field4130[var47][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var25[var22++] = var32;
                                        break;
                                    }
                                    if (var25[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class319 var53 = class116.method904((byte) -102, var34 - 1);
                        if (var53.field4969 && var53.field4977 != -1) {
                            byte var54 = arg9[var13 + 1][var14 - 1];
                            byte var55 = arg6[var13 + 1][var14 - 1];
                            int var56 = class246.field3700[(var55 + 1 & 0x3) + var54 * 4];
                            int var57 = class246.field3700[(var55 & 0x3) + var54 * 4];
                            if (class273.field4130[var56][1] && class273.field4130[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var22 == var59) {
                                        var25[var22++] = var34;
                                        break;
                                    }
                                    if (var25[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var70 = false;
                    } else {
                        class319 var62 = class116.method904((byte) 105, var33 - 1);
                        if (var62.field4969 && var62.field4977 != -1) {
                            byte var63 = arg6[var13 + 1][var14 + 1];
                            byte var64 = arg9[var13 + 1][var14 + 1];
                            int var65 = class246.field3700[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class246.field3700[(var63 + 1 & 0x3) + var64 * 4];
                            if (class273.field4130[var65][1] && class273.field4130[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var22 == var68) {
                                        var25[var22++] = var33;
                                        break;
                                    }
                                    if (var25[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class319 var71 = class116.method904((byte) -73, var26 - 1);
                        if (var71.field4969 && var71.field4977 != -1) {
                            var21 = class246.field3700[(arg6[var13][var14 + 1] + 2 & 0x3) + arg9[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var22 == var72) {
                                    var25[var22++] = var26;
                                    break;
                                }
                                if (var25[var72] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var16 != var31) {
                        class319 var73 = class116.method904((byte) 27, var31 - 1);
                        if (var73.field4969 && var73.field4977 != -1) {
                            var23 = class246.field3700[arg9[var13 - 1][var14] * 4 + (arg6[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var25[var22++] = var31;
                                    break;
                                }
                                if (var25[var74] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class319 var75 = class116.method904((byte) 77, var28 - 1);
                        if (var75.field4969 && var75.field4977 != -1) {
                            var24 = class246.field3700[arg9[var13][var14 - 1] * 4 + (arg6[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var22 == var76) {
                                    var25[var22++] = var28;
                                    break;
                                }
                                if (var25[var76] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class319 var77 = class116.method904((byte) 16, var30 - 1);
                        if (var77.field4969 && var77.field4977 != -1) {
                            var27 = class246.field3700[(arg6[var13 + 1][var14] + 1 & 0x3) + arg9[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var25[var22++] = var30;
                                    break;
                                }
                                if (var25[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var25[var79];
                        boolean[] var81 = class273.field4130[var31 == var80 ? var23 : 0];
                        boolean[] var82 = class273.field4130[var26 == var80 ? var21 : 0];
                        boolean[] var83 = class273.field4130[var28 == var80 ? var24 : 0];
                        boolean[] var84 = class273.field4130[var30 == var80 ? var27 : 0];
                        class319 var85 = class116.method904((byte) -114, var80 - 1);
                        class123 var86 = class257.method1785(var85, var12, -115);
                        var86.field1932 += 5;
                        var86.field1932 += var82.length - 2;
                        var86.field1932 += var81.length - 2;
                        var86.field1932 += var83.length - 2;
                        var86.field1932 += var84.length - 2;
                        var86.field1936++;
                    }
                }
            }
        }
        for (class123 var87 = (class123) var12.method200(0); var87 != null; var87 = (class123) var12.method202((byte) -77)) {
            var87.method939();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg3[arg2][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg3[1][var88][var89] & 0x2) == 2 && arg2 > 0) {
                    var90 = arg2 - 1;
                } else {
                    var90 = arg2;
                }
                int var91 = arg10[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class319 var93 = class116.method904((byte) -117, var92 - 1);
                    if (var93.field4977 == -1) {
                        continue;
                    }
                    class123 var94 = class257.method1785(var93, var12, -120);
                    byte var95 = arg9[var88][var89];
                    byte var96 = arg6[var88][var89];
                    int var97 = class224.method1596(arg4[var88][var89], var93.field4977, true, var93.field4966);
                    int var98 = class224.method1596(arg4[var88 + 1][var89], var93.field4977, true, var93.field4966);
                    int var99 = class224.method1596(arg4[var88 + 1][var89 + 1], var93.field4977, true, var93.field4966);
                    int var100 = class224.method1596(arg4[var88][var89 + 1], var93.field4977, true, var93.field4966);
                    class110.method877(var95, var89, arg0, var98, var99, arg11, var96, var100, var90, var91 != 0 && var93.field4969, var97, arg5, arg7, var94, var88, -11108);
                }
                if ((arg10[var88][var89] & 0xFF) != 0 || var92 != 0 && arg9[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg1[var88 - 1][var89] & 0xFF;
                    int var108 = arg1[var88][var89 + 1] & 0xFF;
                    int var109 = arg1[var88][var89 - 1] & 0xFF;
                    int var110 = arg1[var88 + 1][var89] & 0xFF;
                    int var111 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class319 var115 = class116.method904((byte) 65, var111 - 1);
                        if (var115.field4969 && var115.field4977 != -1) {
                            byte var116 = arg6[var88 - 1][var89 + 1];
                            byte var117 = arg9[var88 - 1][var89 + 1];
                            int var118 = class246.field3700[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class246.field3700[var117 * 4 + (var116 + 2 & 0x3)];
                            if (class273.field4130[var118][1] && class273.field4130[var119][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var104 == var120) {
                                        var101[var104++] = var111;
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
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class319 var121 = class116.method904((byte) 16, var112 - 1);
                        if (var121.field4969 && var121.field4977 != -1) {
                            byte var122 = arg6[var88 - 1][var89 - 1];
                            byte var123 = arg9[var88 - 1][var89 - 1];
                            int var124 = class246.field3700[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class246.field3700[(var122 & 0x3) + var123 * 4];
                            if (class273.field4130[var125][1] && class273.field4130[var124][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var104 == var126) {
                                        var101[var104++] = var112;
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
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class319 var127 = class116.method904((byte) 25, var113 - 1);
                        if (var127.field4969 && var127.field4977 != -1) {
                            byte var128 = arg9[var88 + 1][var89 - 1];
                            byte var129 = arg6[var88 + 1][var89 - 1];
                            int var130 = class246.field3700[var128 * 4 + (var129 + 1 & 0x3)];
                            int var131 = class246.field3700[(var129 & 0x3) + var128 * 4];
                            if (class273.field4130[var130][1] && class273.field4130[var131][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var104 == var132) {
                                        var101[var104++] = var113;
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
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class319 var133 = class116.method904((byte) -74, var114 - 1);
                        if (var133.field4969 && var133.field4977 != -1) {
                            byte var134 = arg6[var88 + 1][var89 + 1];
                            byte var135 = arg9[var88 + 1][var89 + 1];
                            int var136 = class246.field3700[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class246.field3700[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class273.field4130[var136][1] && class273.field4130[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var104 == var138) {
                                        var101[var104++] = var114;
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
                    if (var108 != 0 && var92 != var108) {
                        class319 var139 = class116.method904((byte) 114, var108 - 1);
                        if (var139.field4969 && var139.field4977 != -1) {
                            var102 = class246.field3700[(arg6[var88][var89 + 1] + 2 & 0x3) + arg9[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var104 == var140) {
                                    var101[var104++] = var108;
                                    break;
                                }
                                if (var101[var140] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class319 var141 = class116.method904((byte) -125, var107 - 1);
                        if (var141.field4969 && var141.field4977 != -1) {
                            var106 = class246.field3700[arg9[var88 - 1][var89] * 4 + (arg6[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var104 == var142) {
                                    var101[var104++] = var107;
                                    break;
                                }
                                if (var101[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class319 var143 = class116.method904((byte) -73, var109 - 1);
                        if (var143.field4969 && var143.field4977 != -1) {
                            var103 = class246.field3700[(arg6[var88][var89 - 1] & 0x3) + arg9[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var104 == var144) {
                                    var101[var104++] = var109;
                                    break;
                                }
                                if (var101[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class319 var145 = class116.method904((byte) -103, var110 - 1);
                        if (var145.field4969 && var145.field4977 != -1) {
                            var105 = class246.field3700[arg9[var88 + 1][var89] * 4 + (arg6[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var104 == var146) {
                                    var101[var104++] = var110;
                                    break;
                                }
                                if (var101[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var104; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class273.field4130[var107 == var148 ? var106 : 0];
                        boolean[] var150 = class273.field4130[var108 == var148 ? var102 : 0];
                        boolean[] var151 = class273.field4130[var110 == var148 ? var105 : 0];
                        boolean[] var152 = class273.field4130[var109 == var148 ? var103 : 0];
                        class319 var153 = class116.method904((byte) -125, var148 - 1);
                        class123 var154 = class257.method1785(var153, var12, -125);
                        int var155 = class224.method1596(arg4[var88][var89], var153.field4977, true, var153.field4966) << 8 | 0xFF;
                        int var156 = class224.method1596(arg4[var88 + 1][var89], var153.field4977, true, var153.field4966) << 8 | 0xFF;
                        int var157 = class224.method1596(arg4[var88 + 1][var89 + 1], var153.field4977, true, var153.field4966) << 8 | 0xFF;
                        int var158 = class224.method1596(arg4[var88][var89 + 1], var153.field4977, true, var153.field4966) << 8 | 0xFF;
                        boolean var159 = var111 != var148 && var149[0] && var150[1];
                        boolean var160 = var112 != var148 && var152[0] && var149[1];
                        boolean var161 = var114 != var148 && var150[0] && var151[1];
                        byte var162 = 6;
                        boolean var163 = var113 != var148 && var151[0] && var152[1];
                        int var164 = var150.length + var162 - 2;
                        int var165 = var149.length + var164 - 2;
                        int var166 = var152.length + var165 - 2;
                        int var167 = var151.length + var166 - 2;
                        int[] var168 = new int[var167];
                        byte var169 = 0;
                        int var170 = class203.method1467(64, var154, -81, var157, arg5, 64, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, true, var89, arg0, var158);
                        int var171 = class203.method1467(0, var154, arg8 - 142, var157, arg5, 128, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var159, var89, arg0, var158);
                        int var172 = class203.method1467(128, var154, 55, var157, arg5, 128, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var161, var89, arg0, var158);
                        int var173 = class203.method1467(0, var154, -86, var157, arg5, 0, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var160, var89, arg0, var158);
                        int var174 = class203.method1467(128, var154, arg8 + 102, var157, arg5, 0, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var163, var89, arg0, var158);
                        int var180 = var169 + 1;
                        var168[var169] = var170;
                        var168[var180++] = var172;
                        if (var150.length > 2) {
                            var168[var180++] = class203.method1467(64, var154, 41, var157, arg5, 128, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var150[2], var89, arg0, var158);
                        }
                        var168[var180++] = var171;
                        if (var149.length > 2) {
                            var168[var180++] = class203.method1467(0, var154, arg8 - 100, var157, arg5, 64, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var149[2], var89, arg0, var158);
                        }
                        var168[var180++] = var173;
                        if (var152.length > 2) {
                            var168[var180++] = class203.method1467(64, var154, class203.method1462(arg8, -69), var157, arg5, 0, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var152[2], var89, arg0, var158);
                        }
                        var168[var180++] = var174;
                        if (var151.length > 2) {
                            var168[var180++] = class203.method1467(128, var154, class203.method1462(arg8, -121), var157, arg5, 64, 0, arg11, arg7, var88, var155, (int[][]) null, var156, 0.0F, var151[2], var89, arg0, var158);
                        }
                        var168[var180++] = var172;
                        var154.method944(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class123 var175 = (class123) var12.method200(arg8 - 24); var175 != null; var175 = (class123) var12.method202((byte) -127)) {
            if (var175.field1926 == 0) {
                var175.method1554((byte) -99);
            } else {
                var175.method942();
            }
        }
        int var176 = var12.method205(0);
        long[] var177 = new long[var176];
        class123[] var178 = new class123[var176];
        var12.method199(0, var178);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field3418;
        }
        if (arg8 == 24) {
            class289.method2043(var178, var177, arg8 ^ 0x18);
            return var178;
        } else {
            return (class123[]) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)[Lom;", line = 947)
    public static final class70[] method1128(byte arg0) {
        field2324++;
        int var1 = 25 % ((67 - arg0) / 37);
        class70[] var2 = new class70[class173.field2566];
        for (int var3 = 0; var3 < class173.field2566; var3++) {
            var2[var3] = new class70(class150.field2273, class98.field1453, class271.field4096[var3], class101.field1541[var3], class111.field1756[var3], class323.field5027[var3], class274.field4162[var3], class57.field843);
        }
        class265.method1835(10);
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 980)
    public static void method1129(boolean arg0) {
        field2328 = null;
        field2325 = null;
        field2330 = null;
        if (arg0) {
            return;
        }
        field2320 = null;
        field2332 = null;
        field2331 = null;
        field2322 = null;
        field2326 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[ILld;[I[I)V", line = 1000)
    public static final void method1130(int arg0, int[] arg1, class121 arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var6 != 0 && arg2.field4449.length > var9) {
                if ((var6 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg2.field4449[var9] = null;
                    } else {
                        class162 var10 = class173.method1259((byte) 119, var8);
                        int var11 = var10.field2402;
                        class47 var12 = arg2.field4449[var9];
                        if (var12 != null) {
                            if (var12.field720 == var8) {
                                if (var11 == 0) {
                                    var12 = arg2.field4449[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field719 = 0;
                                    var12.field724 = 0;
                                    var12.field726 = 1;
                                    var12.field730 = 0;
                                    var12.field725 = var7;
                                    class158.method1143(arg2.field4496, arg0 - 27827, arg2.field4507, var10, class235.field3602 == arg2, 0);
                                } else if (var11 == 2) {
                                    var12.field719 = 0;
                                }
                            } else if (var10.field2405 >= class173.method1259((byte) 119, var12.field720).field2405) {
                                var12 = arg2.field4449[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class47 var13 = arg2.field4449[var9] = new class47();
                            var13.field720 = var8;
                            var13.field730 = 0;
                            var13.field724 = 0;
                            var13.field719 = 0;
                            var13.field726 = 1;
                            var13.field725 = var7;
                            class158.method1143(arg2.field4496, 98, arg2.field4507, var10, class235.field3602 == arg2, 0);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
        if (arg0 == 27914) {
            field2321++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIILgd;JZ)V", line = 1096)
    public static final void method1131(int arg0, int arg1, int arg2, int arg3, class310 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class173 var8 = new class173();
        var8.field2560 = arg4;
        var8.field2565 = arg1 * 128 + 64;
        var8.field2555 = arg2 * 128 + 64;
        var8.field2564 = arg3;
        var8.field2568 = arg5;
        var8.field2562 = arg6;
        if (class250.field3746[arg0][arg1][arg2] == null) {
            class250.field3746[arg0][arg1][arg2] = new class99(arg0, arg1, arg2);
        }
        class250.field3746[arg0][arg1][arg2].field1472 = var8;
    }
}
