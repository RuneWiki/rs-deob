import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lpl;")
    public static class186 field16 = new class186(64);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lpl;")
    public static class186 field19 = new class186(50);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[J")
    public static long[] field20 = new long[200];

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 26)
    public static void method6(int arg0) {
        field20 = null;
        if (arg0 == 5) {
            field19 = null;
            field16 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 41)
    public static final void method7(int arg0) {
        field15++;
        int var1 = 0;
        int[] var2 = new int[class288.field4835];
        int var3 = 14 % ((24 - arg0) / 33);
        for (int var4 = 0; var4 < class288.field4835; var4++) {
            class277 var5 = class165.method1243(-47, var4);
            if (var5.field4689 >= 0 || var5.field4658 >= 0) {
                var2[var1++] = var4;
            }
        }
        class298.field4978 = new int[var1];
        for (int var6 = 0; var6 < var1; var6++) {
            class298.field4978[var6] = var2[var6];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([[F[[B[[BZ[[[BI[[F[[B[[F[[I[[I[[B)[Lwe;", line = 74)
    public static final class47[] method8(float[][] arg0, byte[][] arg1, byte[][] arg2, boolean arg3, byte[][][] arg4, int arg5, float[][] arg6, byte[][] arg7, float[][] arg8, int[][] arg9, int[][] arg10, byte[][] arg11) {
        field17++;
        class199 var12 = new class199(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg1[var13][var14] & 0xFF;
                int var16 = arg11[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class50 var17 = class285.method1986(2402, var16 - 1);
                    if (var17.field973 == -1) {
                        continue;
                    }
                    class47 var18 = class123.method929(var12, var17, -31339);
                    byte var19 = arg2[var13][var14];
                    int[] var20 = class244.field4037[var19];
                    var18.field902 += var20.length / 2;
                    var18.field925++;
                    if (var17.field972 && var15 != 0) {
                        var18.field902 += class122.field2111[var19];
                    }
                }
                if ((arg1[var13][var14] & 0xFF) != 0 || var16 != 0 && arg2[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg11[var13][var14 - 1] & 0xFF;
                    int var28 = arg11[var13][var14 + 1] & 0xFF;
                    int var29 = arg11[var13 - 1][var14] & 0xFF;
                    int var30 = arg11[var13 + 1][var14] & 0xFF;
                    int var31 = arg11[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg11[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg11[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg11[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class50 var35 = class285.method1986(2402, var31 - 1);
                        if (var35.field972 && var35.field973 != -1) {
                            byte var36 = arg7[var13 - 1][var14 + 1];
                            byte var37 = arg2[var13 - 1][var14 + 1];
                            int var38 = class11.field174[var37 * 4 + (var36 + 2 & 0x3)];
                            int var39 = class11.field174[(var36 + 3 & 0x3) + var37 * 4];
                            if (class258.field4307[var39][1] && class258.field4307[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var23[var21++] = var31;
                                        break;
                                    }
                                    if (var23[var41] == var31) {
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
                        class50 var44 = class285.method1986(2402, var32 - 1);
                        if (var44.field972 && var44.field973 != -1) {
                            byte var45 = arg7[var13 - 1][var14 - 1];
                            byte var46 = arg2[var13 - 1][var14 - 1];
                            int var47 = class11.field174[(var45 & 0x3) + var46 * 4];
                            int var48 = class11.field174[(var45 + 3 & 0x3) + var46 * 4];
                            if (class258.field4307[var47][1] && class258.field4307[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var23[var21++] = var32;
                                        break;
                                    }
                                    if (var23[var50] == var32) {
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
                        class50 var53 = class285.method1986(2402, var33 - 1);
                        if (var53.field972 && var53.field973 != -1) {
                            byte var54 = arg7[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class11.field174[(var54 & 0x3) + var55 * 4];
                            int var57 = class11.field174[(var54 + 1 & 0x3) + var55 * 4];
                            if (class258.field4307[var57][1] && class258.field4307[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var23[var21++] = var33;
                                        break;
                                    }
                                    if (var23[var59] == var33) {
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
                        class50 var62 = class285.method1986(2402, var34 - 1);
                        if (var62.field972 && var62.field973 != -1) {
                            byte var63 = arg7[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class11.field174[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class11.field174[(var63 + 1 & 0x3) + var64 * 4];
                            if (class258.field4307[var65][1] && class258.field4307[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var23[var21++] = var34;
                                        break;
                                    }
                                    if (var23[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class50 var71 = class285.method1986(2402, var28 - 1);
                        if (var71.field972 && var71.field973 != -1) {
                            var22 = class11.field174[(arg7[var13][var14 + 1] + 2 & 0x3) + arg2[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var23[var21++] = var28;
                                    break;
                                }
                                if (var23[var72] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class50 var73 = class285.method1986(2402, var29 - 1);
                        if (var73.field972 && var73.field973 != -1) {
                            var24 = class11.field174[(arg7[var13 - 1][var14] + 3 & 0x3) + arg2[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var23[var21++] = var29;
                                    break;
                                }
                                if (var23[var74] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class50 var75 = class285.method1986(2402, var27 - 1);
                        if (var75.field972 && var75.field973 != -1) {
                            var25 = class11.field174[arg2[var13][var14 - 1] * 4 + (arg7[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var23[var21++] = var27;
                                    break;
                                }
                                if (var23[var76] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class50 var77 = class285.method1986(2402, var30 - 1);
                        if (var77.field972 && var77.field973 != -1) {
                            var26 = class11.field174[arg2[var13 + 1][var14] * 4 + (arg7[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var23[var21++] = var30;
                                    break;
                                }
                                if (var23[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var23[var79];
                        boolean[] var81 = class258.field4307[var28 == var80 ? var22 : 0];
                        boolean[] var82 = class258.field4307[var29 == var80 ? var24 : 0];
                        boolean[] var83 = class258.field4307[var27 == var80 ? var25 : 0];
                        boolean[] var84 = class258.field4307[var30 == var80 ? var26 : 0];
                        class50 var85 = class285.method1986(2402, var80 - 1);
                        class47 var86 = class123.method929(var12, var85, -31339);
                        var86.field902 += 5;
                        var86.field902 += var81.length - 2;
                        var86.field902 += var82.length - 2;
                        var86.field902 += var83.length - 2;
                        var86.field902 += var84.length - 2;
                        var86.field925++;
                    }
                }
            }
        }
        for (class47 var87 = (class47) var12.method1400(-1); var87 != null; var87 = (class47) var12.method1403(113)) {
            var87.method426();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg1[var88][var89] & 0xFF;
                int var91 = arg11[var88][var89] & 0xFF;
                int var92;
                if ((arg4[arg5][var88][var89] & 0x8) != 0) {
                    var92 = 0;
                } else if ((arg4[1][var88][var89] & 0x2) == 2 && arg5 > 0) {
                    var92 = arg5 - 1;
                } else {
                    var92 = arg5;
                }
                if (var91 != 0) {
                    class50 var93 = class285.method1986(2402, var91 - 1);
                    if (var93.field973 == -1) {
                        continue;
                    }
                    class47 var94 = class123.method929(var12, var93, -31339);
                    byte var95 = arg2[var88][var89];
                    byte var96 = arg7[var88][var89];
                    int var97 = class31.method284(93, var93.field954, arg9[var88][var89], var93.field973);
                    int var98 = class31.method284(117, var93.field954, arg9[var88 + 1][var89], var93.field973);
                    int var99 = class31.method284(86, var93.field954, arg9[var88 + 1][var89 + 1], var93.field973);
                    int var100 = class31.method284(95, var93.field954, arg9[var88][var89 + 1], var93.field973);
                    class102.method772(var96, var94, var89, arg6, var95, var88, var98, arg8, var97, arg0, var99, var92, var90 != 0 && var93.field972, (byte) -56, var100, arg10);
                }
                if ((arg1[var88][var89] & 0xFF) != 0 || var91 != 0 && arg2[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int[] var103 = new int[8];
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg11[var88][var89 + 1] & 0xFF;
                    int var107 = arg11[var88 - 1][var89] & 0xFF;
                    int var108 = 0;
                    int var109 = arg11[var88][var89 - 1] & 0xFF;
                    int var110 = arg11[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg11[var88 + 1][var89] & 0xFF;
                    int var112 = arg11[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg11[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg11[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var91 == var110) {
                        var110 = 0;
                    } else {
                        class50 var115 = class285.method1986(2402, var110 - 1);
                        if (var115.field972 && var115.field973 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg7[var88 - 1][var89 + 1];
                            int var118 = class11.field174[var116 * 4 + (var117 + 2 & 0x3)];
                            int var119 = class11.field174[var116 * 4 + (var117 + 3 & 0x3)];
                            if (class258.field4307[var119][1] && class258.field4307[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var103[var101++] = var110;
                                        break;
                                    }
                                    if (var103[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class50 var121 = class285.method1986(2402, var112 - 1);
                        if (var121.field972 && var121.field973 != -1) {
                            byte var122 = arg2[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class11.field174[(var123 & 0x3) + var122 * 4];
                            int var125 = class11.field174[(var123 + 3 & 0x3) + var122 * 4];
                            if (class258.field4307[var124][1] && class258.field4307[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var103[var101++] = var112;
                                        break;
                                    }
                                    if (var103[var126] == var112) {
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
                        class50 var127 = class285.method1986(2402, var113 - 1);
                        if (var127.field972 && var127.field973 != -1) {
                            byte var128 = arg7[var88 + 1][var89 - 1];
                            byte var129 = arg2[var88 + 1][var89 - 1];
                            int var130 = class11.field174[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class11.field174[(var128 & 0x3) + var129 * 4];
                            if (class258.field4307[var130][1] && class258.field4307[var131][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var103[var101++] = var113;
                                        break;
                                    }
                                    if (var103[var132] == var113) {
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
                        class50 var133 = class285.method1986(2402, var114 - 1);
                        if (var133.field972 && var133.field973 != -1) {
                            byte var134 = arg2[var88 + 1][var89 + 1];
                            byte var135 = arg7[var88 + 1][var89 + 1];
                            int var136 = class11.field174[(var135 + 2 & 0x3) + var134 * 4];
                            int var137 = class11.field174[var134 * 4 + (var135 + 1 & 0x3)];
                            if (class258.field4307[var136][1] && class258.field4307[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var103[var101++] = var114;
                                        break;
                                    }
                                    if (var103[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var106 != 0 && var91 != var106) {
                        class50 var139 = class285.method1986(2402, var106 - 1);
                        if (var139.field972 && var139.field973 != -1) {
                            var102 = class11.field174[(arg7[var88][var89 + 1] + 2 & 0x3) + arg2[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var103[var101++] = var106;
                                    break;
                                }
                                if (var103[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class50 var141 = class285.method1986(2402, var107 - 1);
                        if (var141.field972 && var141.field973 != -1) {
                            var104 = class11.field174[(arg7[var88 - 1][var89] + 3 & 0x3) + arg2[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var103[var101++] = var107;
                                    break;
                                }
                                if (var103[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class50 var143 = class285.method1986(2402, var109 - 1);
                        if (var143.field972 && var143.field973 != -1) {
                            var105 = class11.field174[(arg7[var88][var89 - 1] & 0x3) + arg2[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var103[var101++] = var109;
                                    break;
                                }
                                if (var103[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var91 != var111) {
                        class50 var145 = class285.method1986(2402, var111 - 1);
                        if (var145.field972 && var145.field973 != -1) {
                            var108 = class11.field174[arg2[var88 + 1][var89] * 4 + (arg7[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var103[var101++] = var111;
                                    break;
                                }
                                if (var103[var146] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var103[var147];
                        boolean[] var149 = class258.field4307[var106 == var148 ? var102 : 0];
                        boolean[] var150 = class258.field4307[var107 == var148 ? var104 : 0];
                        boolean[] var151 = class258.field4307[var109 == var148 ? var105 : 0];
                        boolean[] var152 = class258.field4307[var111 == var148 ? var108 : 0];
                        class50 var153 = class285.method1986(2402, var148 - 1);
                        class47 var154 = class123.method929(var12, var153, -31339);
                        int var155 = class31.method284(109, var153.field954, arg9[var88][var89], var153.field973) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class31.method284(103, var153.field954, arg9[var88 + 1][var89], var153.field973) << 8 | 0xFF;
                        int var158 = class31.method284(126, var153.field954, arg9[var88 + 1][var89 + 1], var153.field973) << 8 | 0xFF;
                        int var159 = class31.method284(105, var153.field954, arg9[var88][var89 + 1], var153.field973) << 8 | 0xFF;
                        boolean var160 = var113 != var148 && var152[0] && var151[1];
                        boolean var161 = var114 != var148 && var149[0] && var152[1];
                        boolean var162 = var112 != var148 && var151[0] && var150[1];
                        int var163 = var149.length + var156 - 2;
                        boolean var164 = var110 != var148 && var150[0] && var149[1];
                        int var165 = var150.length + var163 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var152.length + var166 - 2;
                        int var168 = class9.method53(var155, 0, !arg3, var88, (int[][]) null, true, var154, var157, 64, arg0, var159, arg10, 64, var89, var158, arg6, arg8, 0.0F);
                        int var169 = class9.method53(var155, 0, !arg3, var88, (int[][]) null, var164, var154, var157, 128, arg0, var159, arg10, 0, var89, var158, arg6, arg8, 0.0F);
                        int[] var170 = new int[var167];
                        int var171 = class9.method53(var155, 0, false, var88, (int[][]) null, var161, var154, var157, 128, arg0, var159, arg10, 128, var89, var158, arg6, arg8, 0.0F);
                        byte var172 = 0;
                        int var173 = class9.method53(var155, 0, false, var88, (int[][]) null, var162, var154, var157, 0, arg0, var159, arg10, 0, var89, var158, arg6, arg8, 0.0F);
                        int var174 = class9.method53(var155, 0, !arg3, var88, (int[][]) null, var160, var154, var157, 0, arg0, var159, arg10, 128, var89, var158, arg6, arg8, 0.0F);
                        int var180 = var172 + 1;
                        var170[var172] = var168;
                        var170[var180++] = var171;
                        if (var149.length > 2) {
                            var170[var180++] = class9.method53(var155, 0, false, var88, (int[][]) null, var149[2], var154, var157, 128, arg0, var159, arg10, 64, var89, var158, arg6, arg8, 0.0F);
                        }
                        var170[var180++] = var169;
                        if (var150.length > 2) {
                            var170[var180++] = class9.method53(var155, 0, !arg3, var88, (int[][]) null, var150[2], var154, var157, 64, arg0, var159, arg10, 0, var89, var158, arg6, arg8, 0.0F);
                        }
                        var170[var180++] = var173;
                        if (var151.length > 2) {
                            var170[var180++] = class9.method53(var155, 0, false, var88, (int[][]) null, var151[2], var154, var157, 0, arg0, var159, arg10, 64, var89, var158, arg6, arg8, 0.0F);
                        }
                        var170[var180++] = var174;
                        if (var152.length > 2) {
                            var170[var180++] = class9.method53(var155, 0, !arg3, var88, (int[][]) null, var152[2], var154, var157, 64, arg0, var159, arg10, 128, var89, var158, arg6, arg8, 0.0F);
                        }
                        var170[var180++] = var171;
                        var154.method423(var92, var88, var89, var170, (int[]) null, true);
                    }
                }
            }
        }
        for (class47 var175 = (class47) var12.method1400(-1); var175 != null; var175 = (class47) var12.method1403(-126)) {
            if (var175.field903 == 0) {
                var175.method2095(0);
            } else {
                var175.method424();
            }
        }
        int var176 = var12.method1397((byte) 86);
        class47[] var177 = new class47[var176];
        var12.method1406(128, var177);
        long[] var178 = new long[var176];
        if (!arg3) {
            field22 = 64;
        }
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field5149;
        }
        class209.method1478(false, var177, var178);
        return var177;
    }
}
