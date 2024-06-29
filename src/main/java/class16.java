import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class16 extends RuntimeException {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field203;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Ljava/lang/String;")
    public String field210;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[J")
    public static long[] field213 = new long[200];

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([[I[[[B[[I[[BZ[[FI[[B[[F[[B[[B[[F)[Lkj;", line = 6)
    public static final class32[] method101(int[][] arg0, byte[][][] arg1, int[][] arg2, byte[][] arg3, boolean arg4, float[][] arg5, int arg6, byte[][] arg7, float[][] arg8, byte[][] arg9, byte[][] arg10, float[][] arg11) {
        class94 var12 = new class94(128);
        field207++;
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg10[var13][var14] & 0xFF;
                int var16 = arg3[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class34 var17 = class289.method2008(var16 - 1, 4);
                    if (var17.field500 == -1) {
                        continue;
                    }
                    class32 var18 = class187.method1384(true, var17, var12);
                    byte var19 = arg7[var13][var14];
                    int[] var20 = class94.field1450[var19];
                    var18.field448 += var20.length / 2;
                    var18.field452++;
                    if (var17.field496 && var15 != 0) {
                        var18.field448 += class50.field774[var19];
                    }
                }
                if ((arg10[var13][var14] & 0xFF) != 0 || var16 != 0 && arg7[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg3[var13][var14 + 1] & 0xFF;
                    int var28 = arg3[var13 - 1][var14] & 0xFF;
                    int var29 = arg3[var13][var14 - 1] & 0xFF;
                    int var30 = arg3[var13 + 1][var14] & 0xFF;
                    int var31 = arg3[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg3[var13 - 1][var14 + 1] & 0xFF;
                    int var33 = arg3[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg3[var13 + 1][var14 + 1] & 0xFF;
                    if (var32 == 0 || var16 == var32) {
                        boolean var43 = false;
                    } else {
                        class34 var35 = class289.method2008(var32 - 1, 4);
                        if (var35.field496 && var35.field500 != -1) {
                            byte var36 = arg9[var13 - 1][var14 + 1];
                            byte var37 = arg7[var13 - 1][var14 + 1];
                            int var38 = class199.field3304[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class199.field3304[(var36 + 2 & 0x3) + var37 * 4];
                            if (class274.field4717[var38][1] && class274.field4717[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var41] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var52 = false;
                    } else {
                        class34 var44 = class289.method2008(var31 - 1, 4);
                        if (var44.field496 && var44.field500 != -1) {
                            byte var45 = arg9[var13 - 1][var14 - 1];
                            byte var46 = arg7[var13 - 1][var14 - 1];
                            int var47 = class199.field3304[(var45 & 0x3) + var46 * 4];
                            int var48 = class199.field3304[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class274.field4717[var47][1] && class274.field4717[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var50] == var31) {
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
                        class34 var53 = class289.method2008(var33 - 1, 4);
                        if (var53.field496 && var53.field500 != -1) {
                            byte var54 = arg9[var13 + 1][var14 - 1];
                            byte var55 = arg7[var13 + 1][var14 - 1];
                            int var56 = class199.field3304[var55 * 4 + (var54 + 1 & 0x3)];
                            int var57 = class199.field3304[(var54 & 0x3) + var55 * 4];
                            if (class274.field4717[var56][1] && class274.field4717[var57][0]) {
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
                        class34 var62 = class289.method2008(var34 - 1, 4);
                        if (var62.field496 && var62.field500 != -1) {
                            byte var63 = arg9[var13 + 1][var14 + 1];
                            byte var64 = arg7[var13 + 1][var14 + 1];
                            int var65 = class199.field3304[var64 * 4 + (var63 + 2 & 0x3)];
                            int var66 = class199.field3304[(var63 + 1 & 0x3) + var64 * 4];
                            if (class274.field4717[var65][1] && class274.field4717[var66][0]) {
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
                        class34 var71 = class289.method2008(var27 - 1, 4);
                        if (var71.field496 && var71.field500 != -1) {
                            var23 = class199.field3304[(arg9[var13][var14 + 1] + 2 & 0x3) + arg7[var13][var14 + 1] * 4];
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
                        class34 var73 = class289.method2008(var28 - 1, 4);
                        if (var73.field496 && var73.field500 != -1) {
                            var25 = class199.field3304[(arg9[var13 - 1][var14] + 3 & 0x3) + arg7[var13 - 1][var14] * 4];
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
                        class34 var75 = class289.method2008(var29 - 1, 4);
                        if (var75.field496 && var75.field500 != -1) {
                            var24 = class199.field3304[(arg9[var13][var14 - 1] & 0x3) + arg7[var13][var14 - 1] * 4];
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
                    if (var30 != 0 && var16 != var30) {
                        class34 var77 = class289.method2008(var30 - 1, 4);
                        if (var77.field496 && var77.field500 != -1) {
                            var26 = class199.field3304[(arg9[var13 + 1][var14] + 1 & 0x3) + arg7[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class274.field4717[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class274.field4717[var29 == var80 ? var24 : 0];
                        boolean[] var83 = class274.field4717[var28 == var80 ? var25 : 0];
                        boolean[] var84 = class274.field4717[var30 == var80 ? var26 : 0];
                        class34 var85 = class289.method2008(var80 - 1, 4);
                        class32 var86 = class187.method1384(true, var85, var12);
                        var86.field448 += 5;
                        var86.field448 += var81.length - 2;
                        var86.field448 += var83.length - 2;
                        var86.field448 += var82.length - 2;
                        var86.field448 += var84.length - 2;
                        var86.field452++;
                    }
                }
            }
        }
        for (class32 var87 = (class32) var12.method692(64); var87 != null; var87 = (class32) var12.method693((byte) 106)) {
            var87.method210();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg1[arg6][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg1[1][var88][var89] & 0x2) == 2 && arg6 > 0) {
                    var90 = arg6 - 1;
                } else {
                    var90 = arg6;
                }
                int var91 = arg10[var88][var89] & 0xFF;
                int var92 = arg3[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class34 var93 = class289.method2008(var92 - 1, 4);
                    if (var93.field500 == -1) {
                        continue;
                    }
                    class32 var94 = class187.method1384(true, var93, var12);
                    byte var95 = arg7[var88][var89];
                    byte var96 = arg9[var88][var89];
                    int var97 = class269.method1879((byte) -64, arg0[var88][var89], var93.field508, var93.field500);
                    int var98 = class269.method1879((byte) -82, arg0[var88 + 1][var89], var93.field508, var93.field500);
                    int var99 = class269.method1879((byte) -22, arg0[var88 + 1][var89 + 1], var93.field508, var93.field500);
                    int var100 = class269.method1879((byte) -19, arg0[var88][var89 + 1], var93.field508, var93.field500);
                    class46.method326((byte) -35, var97, var90, var91 != 0 && var93.field496, var96, var95, arg5, arg11, var94, var98, var100, var99, arg8, var89, arg2, var88);
                }
                if ((arg10[var88][var89] & 0xFF) != 0 || var92 != 0 && arg7[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg3[var88][var89 + 1] & 0xFF;
                    int var108 = arg3[var88][var89 - 1] & 0xFF;
                    int var109 = arg3[var88 + 1][var89] & 0xFF;
                    int var110 = arg3[var88 - 1][var89] & 0xFF;
                    int var111 = arg3[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg3[var88 + 1][var89 + 1] & 0xFF;
                    int var113 = arg3[var88 - 1][var89 + 1] & 0xFF;
                    int var114 = arg3[var88 + 1][var89 - 1] & 0xFF;
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class34 var115 = class289.method2008(var113 - 1, 4);
                        if (var115.field496 && var115.field500 != -1) {
                            byte var116 = arg9[var88 - 1][var89 + 1];
                            byte var117 = arg7[var88 - 1][var89 + 1];
                            int var118 = class199.field3304[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class199.field3304[(var116 + 3 & 0x3) + var117 * 4];
                            if (class274.field4717[var119][1] && class274.field4717[var118][0]) {
                                var113 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var120] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class34 var121 = class289.method2008(var111 - 1, 4);
                        if (var121.field496 && var121.field500 != -1) {
                            byte var122 = arg9[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class199.field3304[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class199.field3304[var123 * 4 + (var122 & 0x3)];
                            if (class274.field4717[var125][1] && class274.field4717[var124][0]) {
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
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class34 var127 = class289.method2008(var114 - 1, 4);
                        if (var127.field496 && var127.field500 != -1) {
                            byte var128 = arg9[var88 + 1][var89 - 1];
                            byte var129 = arg7[var88 + 1][var89 - 1];
                            int var130 = class199.field3304[(var128 & 0x3) + var129 * 4];
                            int var131 = class199.field3304[(var128 + 1 & 0x3) + var129 * 4];
                            if (class274.field4717[var131][1] && class274.field4717[var130][0]) {
                                var114 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var132] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class34 var133 = class289.method2008(var112 - 1, 4);
                        if (var133.field496 && var133.field500 != -1) {
                            byte var134 = arg9[var88 + 1][var89 + 1];
                            byte var135 = arg7[var88 + 1][var89 + 1];
                            int var136 = class199.field3304[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class199.field3304[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class274.field4717[var136][1] && class274.field4717[var137][0]) {
                                var112 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var138] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class34 var139 = class289.method2008(var107 - 1, 4);
                        if (var139.field496 && var139.field500 != -1) {
                            var105 = class199.field3304[(arg9[var88][var89 + 1] + 2 & 0x3) + arg7[var88][var89 + 1] * 4];
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
                    if (var110 != 0 && var92 != var110) {
                        class34 var141 = class289.method2008(var110 - 1, 4);
                        if (var141.field496 && var141.field500 != -1) {
                            var103 = class199.field3304[(arg9[var88 - 1][var89] + 3 & 0x3) + arg7[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var142] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class34 var143 = class289.method2008(var108 - 1, 4);
                        if (var143.field496 && var143.field500 != -1) {
                            var104 = class199.field3304[(arg9[var88][var89 - 1] & 0x3) + arg7[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class34 var145 = class289.method2008(var109 - 1, 4);
                        if (var145.field496 && var145.field500 != -1) {
                            var106 = class199.field3304[(arg9[var88 + 1][var89] + 1 & 0x3) + arg7[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class274.field4717[var107 == var148 ? var105 : 0];
                        boolean[] var150 = class274.field4717[var110 == var148 ? var103 : 0];
                        boolean[] var151 = class274.field4717[var108 == var148 ? var104 : 0];
                        boolean[] var152 = class274.field4717[var109 == var148 ? var106 : 0];
                        class34 var153 = class289.method2008(var148 - 1, 4);
                        class32 var154 = class187.method1384(true, var153, var12);
                        int var155 = class269.method1879((byte) -52, arg0[var88][var89], var153.field508, var153.field500) << 8 | 0xFF;
                        int var156 = class269.method1879((byte) -36, arg0[var88 + 1][var89], var153.field508, var153.field500) << 8 | 0xFF;
                        int var157 = class269.method1879((byte) -44, arg0[var88 + 1][var89 + 1], var153.field508, var153.field500) << 8 | 0xFF;
                        int var158 = class269.method1879((byte) -62, arg0[var88][var89 + 1], var153.field508, var153.field500) << 8 | 0xFF;
                        byte var159 = 6;
                        boolean var160 = var113 != var148 && var150[0] && var149[1];
                        int var161 = var149.length + var159 - 2;
                        int var162 = var150.length + var161 - 2;
                        boolean var163 = var112 != var148 && var149[0] && var152[1];
                        int var164 = var151.length + var162 - 2;
                        int var165 = var152.length + var164 - 2;
                        int[] var166 = new int[var165];
                        byte var167 = 0;
                        boolean var168 = var114 != var148 && var152[0] && var151[1];
                        boolean var169 = var111 != var148 && var151[0] && var150[1];
                        int var170 = class314.method2162(var155, (int[][]) null, var89, arg2, var156, true, arg5, var157, 0.0F, 64, var88, 0, 64, var154, var158, (byte) -62, arg8, arg11);
                        int var171 = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var160, arg5, var157, 0.0F, 0, var88, 0, 128, var154, var158, (byte) -40, arg8, arg11);
                        int var172 = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var163, arg5, var157, 0.0F, 128, var88, 0, 128, var154, var158, (byte) -80, arg8, arg11);
                        int var173 = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var169, arg5, var157, 0.0F, 0, var88, 0, 0, var154, var158, (byte) 107, arg8, arg11);
                        int var174 = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var168, arg5, var157, 0.0F, 128, var88, 0, 0, var154, var158, (byte) -82, arg8, arg11);
                        int var180 = var167 + 1;
                        var166[var167] = var170;
                        var166[var180++] = var172;
                        if (var149.length > 2) {
                            var166[var180++] = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var149[2], arg5, var157, 0.0F, 64, var88, 0, 128, var154, var158, (byte) 111, arg8, arg11);
                        }
                        var166[var180++] = var171;
                        if (var150.length > 2) {
                            var166[var180++] = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var150[2], arg5, var157, 0.0F, 0, var88, 0, 64, var154, var158, (byte) 104, arg8, arg11);
                        }
                        var166[var180++] = var173;
                        if (var151.length > 2) {
                            var166[var180++] = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var151[2], arg5, var157, 0.0F, 64, var88, 0, 0, var154, var158, (byte) -112, arg8, arg11);
                        }
                        var166[var180++] = var174;
                        if (var152.length > 2) {
                            var166[var180++] = class314.method2162(var155, (int[][]) null, var89, arg2, var156, var152[2], arg5, var157, 0.0F, 128, var88, 0, 64, var154, var158, (byte) 122, arg8, arg11);
                        }
                        var166[var180++] = var172;
                        var154.method215(var90, var88, var89, var166, (int[]) null, true);
                    }
                }
            }
        }
        for (class32 var175 = (class32) var12.method692(64); var175 != null; var175 = (class32) var12.method693((byte) 106)) {
            if (var175.field439 == 0) {
                var175.method2000(-94);
            } else {
                var175.method211();
            }
        }
        int var176 = var12.method691(126);
        class32[] var177 = new class32[var176];
        if (!arg4) {
            method102((byte) -110);
        }
        long[] var178 = new long[var176];
        var12.method686(0, var177);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field4932;
        }
        class169.method1191(var177, 2, var178);
        return var177;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 950)
    public static void method102(byte arg0) {
        field213 = null;
        if (arg0 != -119) {
            method101((int[][]) ((int[][]) null), (byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), true, (float[][]) ((float[][]) null), 116, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null));
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I", line = 961)
    public static final int method103(int arg0) {
        if (arg0 != 20647) {
            method106(-55, -11);
        }
        field209++;
        return 6;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 972)
    public static final void method104(int arg0) {
        class291.field4977.method1484(false);
        field206++;
        if (arg0 != 255) {
            method101((int[][]) ((int[][]) null), (byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), true, (float[][]) ((float[][]) null), 25, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null));
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V", line = 989)
    public static final void method105(int arg0, boolean arg1) {
        field205++;
        if (arg0 == -1 || !class314.field5317[arg0]) {
            return;
        }
        class219.field3560.method2032(1, arg0);
        if (class239.field3986[arg0] == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < class239.field3986[arg0].length; var3++) {
            if (class239.field3986[arg0][var3] != null) {
                if (class239.field3986[arg0][var3].field4468 == 2) {
                    var2 = false;
                } else {
                    class239.field3986[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class239.field3986[arg0] = null;
        }
        class314.field5317[arg0] = false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z", line = 1040)
    public static final boolean method106(int arg0, int arg1) {
        field212++;
        if (arg1 > -60) {
            field213 = (long[]) null;
        }
        return (arg0 & 0x2E3C78) >> 21 != 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ls;B)V", line = 1051)
    public static final void method107(class170 arg0, byte arg1) {
        if (class290.field4970 != null) {
            try {
                class290.field4970.method22((byte) -52, 0L);
                class290.field4970.method15(arg0.field2787, 916062416, arg0.field2758, 24);
            } catch (Exception var4) {
            }
        }
        field211++;
        arg0.field2787 += 24;
        int var3 = 25 % ((-arg1 - 5) / 48);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 1071)
    public class16(Throwable arg0, String arg1) {
        this.field203 = arg0;
        this.field210 = arg1;
    }
}
