import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class100 {

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
    private int[] field1651;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1644 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Z")
    public static boolean field1645 = false;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lja;")
    public static class64 field1650;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[[[B")
    public static byte[][][] field1647;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 9)
    public static void method719(boolean arg0) {
        field1650 = null;
        field1647 = (byte[][][]) null;
        if (!arg0) {
            field1647 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I", line = 21)
    public final int method720(int arg0, int arg1) {
        int var3 = (this.field1651.length >> 1) - 1;
        field1646++;
        int var4 = arg1 & var3;
        if (arg0 != 0) {
            field1645 = true;
        }
        while (true) {
            int var5 = this.field1651[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1651[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([[FB[[[BI[[I[[I[[B[[F[[B[[B[[B[[F)[Ldb;", line = 54)
    public static final class186[] method721(float[][] arg0, byte arg1, byte[][][] arg2, int arg3, int[][] arg4, int[][] arg5, byte[][] arg6, float[][] arg7, byte[][] arg8, byte[][] arg9, byte[][] arg10, float[][] arg11) {
        if (arg1 != -104) {
            return (class186[]) null;
        }
        field1648++;
        class110 var12 = new class110(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg8[var13][var14] & 0xFF;
                int var16 = arg6[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class323 var17 = class107.method819(var15 - 1, 16173);
                    if (var17.field5008 == -1) {
                        continue;
                    }
                    class186 var18 = class308.method2131(var12, var17, 4);
                    byte var19 = arg9[var13][var14];
                    int[] var20 = class307.field4823[var19];
                    var18.field2963 += var20.length / 2;
                    var18.field2960++;
                    if (var17.field5017 && var16 != 0) {
                        var18.field2963 += class6.field57[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var15 != 0 && arg9[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg8[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg8[var13 - 1][var14] & 0xFF;
                    int var29 = arg8[var13][var14 - 1] & 0xFF;
                    int var30 = arg8[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg8[var13 + 1][var14] & 0xFF;
                    int var32 = arg8[var13 - 1][var14 + 1] & 0xFF;
                    int var33 = arg8[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg8[var13 + 1][var14 + 1] & 0xFF;
                    if (var32 == 0 || var15 == var32) {
                        boolean var43 = false;
                    } else {
                        class323 var35 = class107.method819(var32 - 1, 16173);
                        if (var35.field5017 && var35.field5008 != -1) {
                            byte var36 = arg10[var13 - 1][var14 + 1];
                            byte var37 = arg9[var13 - 1][var14 + 1];
                            int var38 = class46.field787[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class46.field787[(var36 + 3 & 0x3) + var37 * 4];
                            if (class219.field3512[var39][1] && class219.field3512[var38][0]) {
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
                    if (var30 == 0 || var15 == var30) {
                        boolean var52 = false;
                    } else {
                        class323 var44 = class107.method819(var30 - 1, 16173);
                        if (var44.field5017 && var44.field5008 != -1) {
                            byte var45 = arg10[var13 - 1][var14 - 1];
                            byte var46 = arg9[var13 - 1][var14 - 1];
                            int var47 = class46.field787[(var45 & 0x3) + var46 * 4];
                            int var48 = class46.field787[(var45 + 3 & 0x3) + var46 * 4];
                            if (class219.field3512[var47][1] && class219.field3512[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var50] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var33 == 0 || var15 == var33) {
                        boolean var61 = false;
                    } else {
                        class323 var53 = class107.method819(var33 - 1, 16173);
                        if (var53.field5017 && var53.field5008 != -1) {
                            byte var54 = arg9[var13 + 1][var14 - 1];
                            byte var55 = arg10[var13 + 1][var14 - 1];
                            int var56 = class46.field787[var54 * 4 + (var55 + 1 & 0x3)];
                            int var57 = class46.field787[var54 * 4 + (var55 & 0x3)];
                            if (class219.field3512[var56][1] && class219.field3512[var57][0]) {
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
                    if (var34 == 0 || var15 == var34) {
                        boolean var70 = false;
                    } else {
                        class323 var62 = class107.method819(var34 - 1, 16173);
                        if (var62.field5017 && var62.field5008 != -1) {
                            byte var63 = arg9[var13 + 1][var14 + 1];
                            byte var64 = arg10[var13 + 1][var14 + 1];
                            int var65 = class46.field787[(var64 + 2 & 0x3) + var63 * 4];
                            int var66 = class46.field787[(var64 + 1 & 0x3) + var63 * 4];
                            if (class219.field3512[var65][1] && class219.field3512[var66][0]) {
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
                    if (var26 != 0 && var15 != var26) {
                        class323 var71 = class107.method819(var26 - 1, 16173);
                        if (var71.field5017 && var71.field5008 != -1) {
                            var23 = class46.field787[(arg10[var13][var14 + 1] + 2 & 0x3) + arg9[var13][var14 + 1] * 4];
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
                    if (var28 != 0 && var15 != var28) {
                        class323 var73 = class107.method819(var28 - 1, arg1 ^ 0xFFFFC0B5);
                        if (var73.field5017 && var73.field5008 != -1) {
                            var27 = class46.field787[(arg10[var13 - 1][var14] + 3 & 0x3) + arg9[var13 - 1][var14] * 4];
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
                    if (var29 != 0 && var15 != var29) {
                        class323 var75 = class107.method819(var29 - 1, 16173);
                        if (var75.field5017 && var75.field5008 != -1) {
                            var24 = class46.field787[(arg10[var13][var14 - 1] & 0x3) + arg9[var13][var14 - 1] * 4];
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
                    if (var31 != 0 && var15 != var31) {
                        class323 var77 = class107.method819(var31 - 1, 16173);
                        if (var77.field5017 && var77.field5008 != -1) {
                            var25 = class46.field787[arg9[var13 + 1][var14] * 4 + (arg10[var13 + 1][var14] + 1 & 0x3)];
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
                        boolean[] var81 = class219.field3512[var26 == var80 ? var23 : 0];
                        boolean[] var82 = class219.field3512[var28 == var80 ? var27 : 0];
                        boolean[] var83 = class219.field3512[var29 == var80 ? var24 : 0];
                        boolean[] var84 = class219.field3512[var31 == var80 ? var25 : 0];
                        class323 var85 = class107.method819(var80 - 1, 16173);
                        class186 var86 = class308.method2131(var12, var85, 4);
                        var86.field2963 += 5;
                        var86.field2963 += var81.length - 2;
                        var86.field2963 += var82.length - 2;
                        var86.field2963 += var83.length - 2;
                        var86.field2963 += var84.length - 2;
                        var86.field2960++;
                    }
                }
            }
        }
        for (class186 var87 = (class186) var12.method841(arg1 + 104); var87 != null; var87 = (class186) var12.method842((byte) -40)) {
            var87.method1398();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg8[var88][var89] & 0xFF;
                int var91 = arg6[var88][var89] & 0xFF;
                int var92;
                if ((arg2[arg3][var88][var89] & 0x8) != 0) {
                    var92 = 0;
                } else if ((arg2[1][var88][var89] & 0x2) == 2 && arg3 > 0) {
                    var92 = arg3 - 1;
                } else {
                    var92 = arg3;
                }
                if (var90 != 0) {
                    class323 var93 = class107.method819(var90 - 1, arg1 + 16277);
                    if (var93.field5008 == -1) {
                        continue;
                    }
                    class186 var94 = class308.method2131(var12, var93, 4);
                    byte var95 = arg9[var88][var89];
                    byte var96 = arg10[var88][var89];
                    int var97 = class86.method616(arg4[var88][var89], -110, var93.field5016, var93.field5008);
                    int var98 = class86.method616(arg4[var88 + 1][var89], arg1 - 16, var93.field5016, var93.field5008);
                    int var99 = class86.method616(arg4[var88 + 1][var89 + 1], -124, var93.field5016, var93.field5008);
                    int var100 = class86.method616(arg4[var88][var89 + 1], 58, var93.field5016, var93.field5008);
                    class86.method617(var89, var91 != 0 && var93.field5017, arg0, var98, arg5, var96, var100, arg7, (byte) 123, var92, var99, var97, var94, var95, var88, arg11);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var90 != 0 && arg9[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg8[var88][var89 + 1] & 0xFF;
                    int var107 = arg8[var88 - 1][var89 + 1] & 0xFF;
                    int var108 = arg8[var88 + 1][var89] & 0xFF;
                    int var109 = arg8[var88][var89 - 1] & 0xFF;
                    int var110 = 0;
                    int var111 = arg8[var88 - 1][var89] & 0xFF;
                    int var112 = arg8[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg8[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg8[var88 + 1][var89 + 1] & 0xFF;
                    if (var107 == 0 || var90 == var107) {
                        var107 = 0;
                    } else {
                        class323 var115 = class107.method819(var107 - 1, 16173);
                        if (var115.field5017 && var115.field5008 != -1) {
                            byte var116 = arg10[var88 - 1][var89 + 1];
                            byte var117 = arg9[var88 - 1][var89 + 1];
                            int var118 = class46.field787[var117 * 4 + (var116 + 3 & 0x3)];
                            int var119 = class46.field787[var117 * 4 + (var116 + 2 & 0x3)];
                            if (class219.field3512[var118][1] && class219.field3512[var119][0]) {
                                var107 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var107;
                                        break;
                                    }
                                    if (var102[var120] == var107) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var107 = 0;
                        }
                    }
                    if (var112 == 0 || var90 == var112) {
                        var112 = 0;
                    } else {
                        class323 var121 = class107.method819(var112 - 1, 16173);
                        if (var121.field5017 && var121.field5008 != -1) {
                            byte var122 = arg10[var88 - 1][var89 - 1];
                            byte var123 = arg9[var88 - 1][var89 - 1];
                            int var124 = class46.field787[(var122 & 0x3) + var123 * 4];
                            int var125 = class46.field787[(var122 + 3 & 0x3) + var123 * 4];
                            if (class219.field3512[var124][1] && class219.field3512[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var90 == var113) {
                        var113 = 0;
                    } else {
                        class323 var127 = class107.method819(var113 - 1, 16173);
                        if (var127.field5017 && var127.field5008 != -1) {
                            byte var128 = arg10[var88 + 1][var89 - 1];
                            byte var129 = arg9[var88 + 1][var89 - 1];
                            int var130 = class46.field787[var129 * 4 + (var128 & 0x3)];
                            int var131 = class46.field787[(var128 + 1 & 0x3) + var129 * 4];
                            if (class219.field3512[var131][1] && class219.field3512[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var114 == 0 || var90 == var114) {
                        var114 = 0;
                    } else {
                        class323 var133 = class107.method819(var114 - 1, 16173);
                        if (var133.field5017 && var133.field5008 != -1) {
                            byte var134 = arg9[var88 + 1][var89 + 1];
                            byte var135 = arg10[var88 + 1][var89 + 1];
                            int var136 = class46.field787[var134 * 4 + (var135 + 1 & 0x3)];
                            int var137 = class46.field787[(var135 + 2 & 0x3) + var134 * 4];
                            if (class219.field3512[var137][1] && class219.field3512[var136][0]) {
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
                    if (var106 != 0 && var90 != var106) {
                        class323 var139 = class107.method819(var106 - 1, 16173);
                        if (var139.field5017 && var139.field5008 != -1) {
                            var104 = class46.field787[(arg10[var88][var89 + 1] + 2 & 0x3) + arg9[var88][var89 + 1] * 4];
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
                    if (var111 != 0 && var90 != var111) {
                        class323 var141 = class107.method819(var111 - 1, arg1 ^ 0xFFFFC0B5);
                        if (var141.field5017 && var141.field5008 != -1) {
                            var103 = class46.field787[(arg10[var88 - 1][var89] + 3 & 0x3) + arg9[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var111;
                                    break;
                                }
                                if (var102[var142] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var90 != var109) {
                        class323 var143 = class107.method819(var109 - 1, arg1 + 16277);
                        if (var143.field5017 && var143.field5008 != -1) {
                            var105 = class46.field787[(arg10[var88][var89 - 1] & 0x3) + arg9[var88][var89 - 1] * 4];
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
                    if (var108 != 0 && var90 != var108) {
                        class323 var145 = class107.method819(var108 - 1, 16173);
                        if (var145.field5017 && var145.field5008 != -1) {
                            var110 = class46.field787[(arg10[var88 + 1][var89] + 1 & 0x3) + arg9[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var146] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class219.field3512[var106 == var148 ? var104 : 0];
                        boolean[] var150 = class219.field3512[var109 == var148 ? var105 : 0];
                        boolean[] var151 = class219.field3512[var111 == var148 ? var103 : 0];
                        boolean[] var152 = class219.field3512[var108 == var148 ? var110 : 0];
                        class323 var153 = class107.method819(var148 - 1, 16173);
                        class186 var154 = class308.method2131(var12, var153, arg1 ^ 0xFFFFFF9C);
                        int var155 = class86.method616(arg4[var88][var89], 28, var153.field5016, var153.field5008) << 8 | 0xFF;
                        int var156 = class86.method616(arg4[var88 + 1][var89], -127, var153.field5016, var153.field5008) << 8 | 0xFF;
                        int var157 = class86.method616(arg4[var88 + 1][var89 + 1], arg1 ^ 0x10, var153.field5016, var153.field5008) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class86.method616(arg4[var88][var89 + 1], 61, var153.field5016, var153.field5008) << 8 | 0xFF;
                        int var160 = var149.length + var158 - 2;
                        boolean var161 = var107 != var148 && var151[0] && var149[1];
                        boolean var162 = var112 != var148 && var150[0] && var151[1];
                        int var163 = var151.length + var160 - 2;
                        boolean var164 = var114 != var148 && var149[0] && var152[1];
                        int var165 = var150.length + var163 - 2;
                        int var166 = var152.length + var165 - 2;
                        int[] var167 = new int[var166];
                        boolean var168 = var113 != var148 && var152[0] && var150[1];
                        int var169 = class53.method392(arg7, var88, (byte) -8, var156, 64, arg5, var157, 0, 64, 0.0F, var155, arg0, var159, arg11, true, (int[][]) null, var89, var154);
                        byte var170 = 0;
                        int var171 = class53.method392(arg7, var88, (byte) -127, var156, 0, arg5, var157, 0, 128, 0.0F, var155, arg0, var159, arg11, var161, (int[][]) null, var89, var154);
                        int var172 = class53.method392(arg7, var88, (byte) 118, var156, 128, arg5, var157, 0, 128, 0.0F, var155, arg0, var159, arg11, var164, (int[][]) null, var89, var154);
                        int var173 = class53.method392(arg7, var88, (byte) -127, var156, 0, arg5, var157, 0, 0, 0.0F, var155, arg0, var159, arg11, var162, (int[][]) null, var89, var154);
                        int var174 = class53.method392(arg7, var88, (byte) 57, var156, 128, arg5, var157, 0, 0, 0.0F, var155, arg0, var159, arg11, var168, (int[][]) null, var89, var154);
                        int var180 = var170 + 1;
                        var167[var170] = var169;
                        var167[var180++] = var172;
                        if (var149.length > 2) {
                            var167[var180++] = class53.method392(arg7, var88, (byte) 104, var156, 64, arg5, var157, 0, 128, 0.0F, var155, arg0, var159, arg11, var149[2], (int[][]) null, var89, var154);
                        }
                        var167[var180++] = var171;
                        if (var151.length > 2) {
                            var167[var180++] = class53.method392(arg7, var88, (byte) 66, var156, 0, arg5, var157, 0, 64, 0.0F, var155, arg0, var159, arg11, var151[2], (int[][]) null, var89, var154);
                        }
                        var167[var180++] = var173;
                        if (var150.length > 2) {
                            var167[var180++] = class53.method392(arg7, var88, (byte) -126, var156, 64, arg5, var157, 0, 0, 0.0F, var155, arg0, var159, arg11, var150[2], (int[][]) null, var89, var154);
                        }
                        var167[var180++] = var174;
                        if (var152.length > 2) {
                            var167[var180++] = class53.method392(arg7, var88, (byte) -128, var156, 128, arg5, var157, 0, 64, 0.0F, var155, arg0, var159, arg11, var152[2], (int[][]) null, var89, var154);
                        }
                        var167[var180++] = var172;
                        var154.method1395(var92, var88, var89, var167, (int[]) null, true);
                    }
                }
            }
        }
        for (class186 var175 = (class186) var12.method841(0); var175 != null; var175 = (class186) var12.method842((byte) -40)) {
            if (var175.field2958 == 0) {
                var175.method1701(arg1 - 10);
            } else {
                var175.method1396();
            }
        }
        int var176 = var12.method844(5);
        class186[] var177 = new class186[var176];
        var12.method832(var177, arg1 ^ 0xFFFFFFE6);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field3734;
        }
        class323.method2207(var178, var177, (byte) -112);
        return var177;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILai;IILob;)V", line = 999)
    public static final void method722(int arg0, int arg1, int arg2, class126 arg3, int arg4, int arg5, class292 arg6) {
        field1643++;
        if (arg3 == null) {
            return;
        }
        int var7 = class248.field3833 + class204.field3234 & arg2;
        int var8 = arg4 * arg4 + arg5 * arg5;
        int var9 = Math.max(arg6.field4608 / 2, arg6.field4499 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class174.field2732[var7];
        int var11 = class174.field2731[var7];
        int var12 = var10 * 256 / (class123.field1970 + 256);
        int var13 = var11 * 256 / (class123.field1970 + 256);
        int var14 = arg4 * var13 + arg5 * var12 >> 16;
        int var15 = arg4 * var12 - (arg5 * var13) >> 16;
        if (class265.field4126) {
            ((class105) arg3).method813(arg6.field4608 / 2 + arg0 + var14 - (arg3.field2003 / 2), arg6.field4499 / 2 + arg1 - arg3.field2004 / 2 + -var15, (class105) arg6.method2056((byte) -59, false));
        } else {
            ((class7) arg3).method42(arg6.field4608 / 2 + arg0 + var14 - arg3.field2003 / 2, arg1 - (-(arg6.field4499 / 2) - -var15) + -(arg3.field2004 / 2), arg6.field4597, arg6.field4459);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V", line = 1035)
    public class100(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1651 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1651[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1651[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1651[var5 + var5] = arg0[var4];
            this.field1651[var5 + var5 + 1] = var4++;
        }
    }
}
