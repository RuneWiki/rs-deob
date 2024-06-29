import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class276 {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lnm;")
    public static class221 field4548;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lnm;")
    public static class221 field4550;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lnm;")
    public static class221 field4551;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[[[I")
    public static int[][][] field4549;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 14)
    public static void method1968(int arg0) {
        field4550 = null;
        field4549 = (int[][][]) null;
        if (arg0 < 27) {
            method1968(117);
        }
        field4551 = null;
        field4548 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([[BZ[[I[[B[[F[[F[[F[[B[[[BI[[I[[B)[Ljb;", line = 28)
    public static final class226[] method1969(byte[][] arg0, boolean arg1, int[][] arg2, byte[][] arg3, float[][] arg4, float[][] arg5, float[][] arg6, byte[][] arg7, byte[][][] arg8, int arg9, int[][] arg10, byte[][] arg11) {
        class4 var12 = new class4(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg7[var13][var14] & 0xFF;
                int var16 = arg3[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class266 var17 = class52.method382(-127, var16 - 1);
                    if (var17.field4372 == -1) {
                        continue;
                    }
                    class226 var18 = class54.method391(var12, var17, (byte) 66);
                    byte var19 = arg0[var13][var14];
                    int[] var20 = class146.field2357[var19];
                    var18.field3537 += var20.length / 2;
                    var18.field3546++;
                    if (var17.field4379 && var15 != 0) {
                        var18.field3537 += class81.field1184[var19];
                    }
                }
                if ((arg7[var13][var14] & 0xFF) != 0 || var16 != 0 && arg0[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg3[var13][var14 + 1] & 0xFF;
                    int var28 = arg3[var13 - 1][var14] & 0xFF;
                    int var29 = arg3[var13 + 1][var14] & 0xFF;
                    int var30 = arg3[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg3[var13][var14 - 1] & 0xFF;
                    int var32 = arg3[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg3[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg3[var13 - 1][var14 - 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class266 var35 = class52.method382(-128, var30 - 1);
                        if (var35.field4379 && var35.field4372 != -1) {
                            byte var36 = arg0[var13 - 1][var14 + 1];
                            byte var37 = arg11[var13 - 1][var14 + 1];
                            int var38 = class196.field3002[(var37 + 3 & 0x3) + var36 * 4];
                            int var39 = class196.field3002[var36 * 4 + (var37 + 2 & 0x3)];
                            if (class249.field3963[var38][1] && class249.field3963[var39][0]) {
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var52 = false;
                    } else {
                        class266 var44 = class52.method382(-96, var34 - 1);
                        if (var44.field4379 && var44.field4372 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg11[var13 - 1][var14 - 1];
                            int var47 = class196.field3002[(var46 & 0x3) + var45 * 4];
                            int var48 = class196.field3002[(var46 + 3 & 0x3) + var45 * 4];
                            if (class249.field3963[var47][1] && class249.field3963[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var50] == var34) {
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
                        class266 var53 = class52.method382(-121, var32 - 1);
                        if (var53.field4379 && var53.field4372 != -1) {
                            byte var54 = arg0[var13 + 1][var14 - 1];
                            byte var55 = arg11[var13 + 1][var14 - 1];
                            int var56 = class196.field3002[(var55 + 1 & 0x3) + var54 * 4];
                            int var57 = class196.field3002[(var55 & 0x3) + var54 * 4];
                            if (class249.field3963[var56][1] && class249.field3963[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var59] == var32) {
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
                        class266 var62 = class52.method382(-115, var33 - 1);
                        if (var62.field4379 && var62.field4372 != -1) {
                            byte var63 = arg0[var13 + 1][var14 + 1];
                            byte var64 = arg11[var13 + 1][var14 + 1];
                            int var65 = class196.field3002[(var64 + 1 & 0x3) + var63 * 4];
                            int var66 = class196.field3002[(var64 + 2 & 0x3) + var63 * 4];
                            if (class249.field3963[var66][1] && class249.field3963[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class266 var71 = class52.method382(-98, var27 - 1);
                        if (var71.field4379 && var71.field4372 != -1) {
                            var24 = class196.field3002[arg0[var13][var14 + 1] * 4 + (arg11[var13][var14 + 1] + 2 & 0x3)];
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
                        class266 var73 = class52.method382(-127, var28 - 1);
                        if (var73.field4379 && var73.field4372 != -1) {
                            var23 = class196.field3002[arg0[var13 - 1][var14] * 4 + (arg11[var13 - 1][var14] + 3 & 0x3)];
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
                    if (var31 != 0 && var16 != var31) {
                        class266 var75 = class52.method382(-103, var31 - 1);
                        if (var75.field4379 && var75.field4372 != -1) {
                            var25 = class196.field3002[arg0[var13][var14 - 1] * 4 + (arg11[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var31;
                                    break;
                                }
                                if (var22[var76] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class266 var77 = class52.method382(-117, var29 - 1);
                        if (var77.field4379 && var77.field4372 != -1) {
                            var26 = class196.field3002[(arg11[var13 + 1][var14] + 1 & 0x3) + arg0[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var78] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class249.field3963[var27 == var80 ? var24 : 0];
                        boolean[] var82 = class249.field3963[var28 == var80 ? var23 : 0];
                        boolean[] var83 = class249.field3963[var31 == var80 ? var25 : 0];
                        boolean[] var84 = class249.field3963[var29 == var80 ? var26 : 0];
                        class266 var85 = class52.method382(-103, var80 - 1);
                        class226 var86 = class54.method391(var12, var85, (byte) -95);
                        var86.field3537 += 5;
                        var86.field3537 += var81.length - 2;
                        var86.field3537 += var82.length - 2;
                        var86.field3537 += var83.length - 2;
                        var86.field3537 += var84.length - 2;
                        var86.field3546++;
                    }
                }
            }
        }
        field4552++;
        for (class226 var87 = (class226) var12.method27(122); var87 != null; var87 = (class226) var12.method34(8)) {
            var87.method1532();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg8[arg9][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg8[1][var88][var89] & 0x2) == 2 && arg9 > 0) {
                    var90 = arg9 - 1;
                } else {
                    var90 = arg9;
                }
                int var91 = arg3[var88][var89] & 0xFF;
                int var92 = arg7[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class266 var93 = class52.method382(-114, var91 - 1);
                    if (var93.field4372 == -1) {
                        continue;
                    }
                    class226 var94 = class54.method391(var12, var93, (byte) -128);
                    byte var95 = arg0[var88][var89];
                    byte var96 = arg11[var88][var89];
                    int var97 = class179.method1254(var93.field4386, false, var93.field4372, arg10[var88][var89]);
                    int var98 = class179.method1254(var93.field4386, false, var93.field4372, arg10[var88 + 1][var89]);
                    int var99 = class179.method1254(var93.field4386, arg1, var93.field4372, arg10[var88 + 1][var89 + 1]);
                    int var100 = class179.method1254(var93.field4386, arg1, var93.field4372, arg10[var88][var89 + 1]);
                    class56.method420(arg5, var94, var98, var88, var90, arg2, 0, var97, var96, var99, var92 != 0 && var93.field4379, var100, arg4, var95, var89, arg6);
                }
                if ((arg7[var88][var89] & 0xFF) != 0 || var91 != 0 && arg0[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg3[var88][var89 + 1] & 0xFF;
                    int var107 = arg3[var88][var89 - 1] & 0xFF;
                    int var108 = arg3[var88 - 1][var89] & 0xFF;
                    int var109 = arg3[var88 - 1][var89 + 1] & 0xFF;
                    int var110 = arg3[var88 + 1][var89] & 0xFF;
                    int var111 = 0;
                    int var112 = arg3[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg3[var88 - 1][var89 - 1] & 0xFF;
                    int var114 = arg3[var88 + 1][var89 + 1] & 0xFF;
                    if (var109 == 0 || var91 == var109) {
                        var109 = 0;
                    } else {
                        class266 var115 = class52.method382(-95, var109 - 1);
                        if (var115.field4379 && var115.field4372 != -1) {
                            byte var116 = arg11[var88 - 1][var89 + 1];
                            byte var117 = arg0[var88 - 1][var89 + 1];
                            int var118 = class196.field3002[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class196.field3002[(var116 + 3 & 0x3) + var117 * 4];
                            if (class249.field3963[var119][1] && class249.field3963[var118][0]) {
                                var109 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var109;
                                        break;
                                    }
                                    if (var102[var120] == var109) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var109 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class266 var121 = class52.method382(-117, var113 - 1);
                        if (var121.field4379 && var121.field4372 != -1) {
                            byte var122 = arg11[var88 - 1][var89 - 1];
                            byte var123 = arg0[var88 - 1][var89 - 1];
                            int var124 = class196.field3002[var123 * 4 + (var122 & 0x3)];
                            int var125 = class196.field3002[(var122 + 3 & 0x3) + var123 * 4];
                            if (class249.field3963[var124][1] && class249.field3963[var125][0]) {
                                var113 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var126] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class266 var127 = class52.method382(-105, var112 - 1);
                        if (var127.field4379 && var127.field4372 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg11[var88 + 1][var89 - 1];
                            int var130 = class196.field3002[(var129 & 0x3) + var128 * 4];
                            int var131 = class196.field3002[var128 * 4 + (var129 + 1 & 0x3)];
                            if (class249.field3963[var131][1] && class249.field3963[var130][0]) {
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
                    if (var114 == 0 || var91 == var114) {
                        var114 = 0;
                    } else {
                        class266 var133 = class52.method382(-106, var114 - 1);
                        if (var133.field4379 && var133.field4372 != -1) {
                            byte var134 = arg11[var88 + 1][var89 + 1];
                            byte var135 = arg0[var88 + 1][var89 + 1];
                            int var136 = class196.field3002[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class196.field3002[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class249.field3963[var136][1] && class249.field3963[var137][0]) {
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
                    if (var106 != 0 && var91 != var106) {
                        class266 var139 = class52.method382(-121, var106 - 1);
                        if (var139.field4379 && var139.field4372 != -1) {
                            var111 = class196.field3002[(arg11[var88][var89 + 1] + 2 & 0x3) + arg0[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var106;
                                    break;
                                }
                                if (var102[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class266 var141 = class52.method382(-106, var108 - 1);
                        if (var141.field4379 && var141.field4372 != -1) {
                            var103 = class196.field3002[(arg11[var88 - 1][var89] + 3 & 0x3) + arg0[var88 - 1][var89] * 4];
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
                    if (var107 != 0 && var91 != var107) {
                        class266 var143 = class52.method382(-102, var107 - 1);
                        if (var143.field4379 && var143.field4372 != -1) {
                            var105 = class196.field3002[arg0[var88][var89 - 1] * 4 + (arg11[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var144] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class266 var145 = class52.method382(-93, var110 - 1);
                        if (var145.field4379 && var145.field4372 != -1) {
                            var104 = class196.field3002[arg0[var88 + 1][var89] * 4 + (arg11[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class249.field3963[var108 == var148 ? var103 : 0];
                        boolean[] var150 = class249.field3963[var110 == var148 ? var104 : 0];
                        boolean[] var151 = class249.field3963[var107 == var148 ? var105 : 0];
                        boolean[] var152 = class249.field3963[var106 == var148 ? var111 : 0];
                        class266 var153 = class52.method382(-92, var148 - 1);
                        class226 var154 = class54.method391(var12, var153, (byte) -97);
                        byte var155 = 6;
                        int var156 = class179.method1254(var153.field4386, arg1, var153.field4372, arg10[var88][var89]) << 8 | 0xFF;
                        int var157 = class179.method1254(var153.field4386, false, var153.field4372, arg10[var88 + 1][var89]) << 8 | 0xFF;
                        int var158 = class179.method1254(var153.field4386, false, var153.field4372, arg10[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class179.method1254(var153.field4386, false, var153.field4372, arg10[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var160 = var113 != var148 && var151[0] && var149[1];
                        boolean var161 = var114 != var148 && var152[0] && var150[1];
                        boolean var162 = var109 != var148 && var149[0] && var152[1];
                        boolean var163 = var112 != var148 && var150[0] && var151[1];
                        int var164 = var152.length + var155 - 2;
                        int var165 = var149.length + var164 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var150.length + var166 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class196.method1340(0, arg5, true, var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 64, 64, (int[][]) null);
                        byte var170 = 0;
                        int var171 = class196.method1340(0, arg5, var162, var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 0, 128, (int[][]) null);
                        int var172 = class196.method1340(0, arg5, var161, var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 128, 128, (int[][]) null);
                        int var173 = class196.method1340(0, arg5, var160, var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 0, 0, (int[][]) null);
                        int var174 = class196.method1340(0, arg5, var163, var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 128, 0, (int[][]) null);
                        int var180 = var170 + 1;
                        var168[var170] = var169;
                        var168[var180++] = var172;
                        if (var152.length > 2) {
                            var168[var180++] = class196.method1340(0, arg5, var152[2], var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 64, 128, (int[][]) null);
                        }
                        var168[var180++] = var171;
                        if (var149.length > 2) {
                            var168[var180++] = class196.method1340(0, arg5, var149[2], var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 0, 64, (int[][]) null);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class196.method1340(0, arg5, var151[2], var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 64, 0, (int[][]) null);
                        }
                        var168[var180++] = var174;
                        if (var150.length > 2) {
                            var168[var180++] = class196.method1340(0, arg5, var150[2], var154, arg6, var159, var88, -22095, arg4, var156, arg2, 0.0F, var89, var157, var158, 128, 64, (int[][]) null);
                        }
                        var168[var180++] = var172;
                        var154.method1531(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class226 var175 = (class226) var12.method27(122); var175 != null; var175 = (class226) var12.method34(8)) {
            if (var175.field3527 == 0) {
                var175.method1131(8);
            } else {
                var175.method1533();
            }
        }
        int var176 = var12.method28(!arg1);
        class226[] var177 = new class226[var176];
        var12.method30(-96, var177);
        long[] var178 = new long[var176];
        int var179 = 0;
        if (arg1) {
            field4550 = (class221) null;
        }
        while (var179 < var176) {
            var178[var179] = var177[var179].field2549;
            var179++;
        }
        class157.method1125(var178, var177, 98);
        return var177;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lsb;ZIIII)V", line = 958)
    public static final void method1970(class131 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4554++;
        if (class28.field424 >= 50 || arg0 == null || arg0.field1987 == null || arg5 >= arg0.field1987.length || arg0.field1987[arg5] == null) {
            return;
        }
        int var6 = arg0.field1987[arg5][0];
        int var7 = var6 >> 8;
        if (arg0.field1987[arg5].length > 1) {
            int var8 = (int) ((double) arg0.field1987[arg5].length * Math.random());
            if (var8 > 0) {
                var7 = arg0.field1987[arg5][var8];
            }
        }
        int var9 = (var6 & 0xFD) >> 5;
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg1) {
                class209.method1427(var7, -1, var9, 255, 0);
            }
        } else if (class58.field878 != 0) {
            int var11 = (arg4 - 64) / 128;
            class5.field71[class28.field424] = var7;
            int var12 = (arg2 - 64) / 128;
            class33.field513[class28.field424] = var9;
            class58.field877[class28.field424] = 0;
            class249.field3961[class28.field424] = null;
            class275.field4547[class28.field424] = 255;
            if (arg3 < 70) {
                field4550 = (class221) null;
            }
            class34.field515[class28.field424] = (var11 << 16) + (var12 << 8) + var10;
            class28.field424++;
        }
    }
}
