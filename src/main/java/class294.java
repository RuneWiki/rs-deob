import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class294 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Loh;")
    public static class258 field5048 = class153.method1046(")4", 120);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    public static int[] field5052 = new int[1000];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lmi;")
    public static class12 field5050 = new class12();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field5055 = -1;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    public static int[] field5057 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lrk;")
    public class123 field5054;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lvi;")
    public class129 field5049;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[Z")
    public static boolean[] field5056;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 17)
    public static void method2059(int arg0) {
        field5052 = null;
        field5050 = null;
        field5056 = null;
        field5048 = null;
        if (arg0 != 3) {
            method2061(false);
        }
        field5057 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([[B[[BI[[F[[FB[[I[[B[[B[[I[[F[[[B)[Lgd;", line = 35)
    public static final class157[] method2060(byte[][] arg0, byte[][] arg1, int arg2, float[][] arg3, float[][] arg4, byte arg5, int[][] arg6, byte[][] arg7, byte[][] arg8, int[][] arg9, float[][] arg10, byte[][][] arg11) {
        field5051++;
        class144 var12 = new class144(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg1[var13][var14] & 0xFF;
                int var16 = arg8[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class71 var17 = class128.method922(var15 - 1, arg5 ^ 0xFFFF84A6);
                    if (var17.field1235 == -1) {
                        continue;
                    }
                    class157 var18 = class114.method831(false, var17, var12);
                    byte var19 = arg7[var13][var14];
                    int[] var20 = class171.field3047[var19];
                    var18.field2693 += var20.length / 2;
                    var18.field2702++;
                    if (var17.field1236 && var16 != 0) {
                        var18.field2693 += class176.field3170[var19];
                    }
                }
                if ((arg8[var13][var14] & 0xFF) != 0 || var15 != 0 && arg7[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg1[var13 - 1][var14] & 0xFF;
                    int var27 = arg1[var13][var14 + 1] & 0xFF;
                    int var28 = 0;
                    int var29 = arg1[var13 + 1][var14] & 0xFF;
                    int var30 = arg1[var13][var14 - 1] & 0xFF;
                    int var31 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var15 == var31) {
                        boolean var43 = false;
                    } else {
                        class71 var35 = class128.method922(var31 - 1, 31532);
                        if (var35.field1236 && var35.field1235 != -1) {
                            byte var36 = arg7[var13 - 1][var14 + 1];
                            byte var37 = arg0[var13 - 1][var14 + 1];
                            int var38 = class58.field916[(var37 + 3 & 0x3) + var36 * 4];
                            int var39 = class58.field916[var36 * 4 + (var37 + 2 & 0x3)];
                            if (class217.field3751[var38][1] && class217.field3751[var39][0]) {
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
                    if (var32 == 0 || var15 == var32) {
                        boolean var52 = false;
                    } else {
                        class71 var44 = class128.method922(var32 - 1, 31532);
                        if (var44.field1236 && var44.field1235 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg7[var13 - 1][var14 - 1];
                            int var47 = class58.field916[var46 * 4 + (var45 + 3 & 0x3)];
                            int var48 = class58.field916[(var45 & 0x3) + var46 * 4];
                            if (class217.field3751[var48][1] && class217.field3751[var47][0]) {
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
                    if (var33 == 0 || var15 == var33) {
                        boolean var61 = false;
                    } else {
                        class71 var53 = class128.method922(var33 - 1, arg5 ^ 0xFFFF84A6);
                        if (var53.field1236 && var53.field1235 != -1) {
                            byte var54 = arg0[var13 + 1][var14 - 1];
                            byte var55 = arg7[var13 + 1][var14 - 1];
                            int var56 = class58.field916[var55 * 4 + (var54 & 0x3)];
                            int var57 = class58.field916[(var54 + 1 & 0x3) + var55 * 4];
                            if (class217.field3751[var57][1] && class217.field3751[var56][0]) {
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
                        class71 var62 = class128.method922(var34 - 1, 31532);
                        if (var62.field1236 && var62.field1235 != -1) {
                            byte var63 = arg7[var13 + 1][var14 + 1];
                            byte var64 = arg0[var13 + 1][var14 + 1];
                            int var65 = class58.field916[(var64 + 1 & 0x3) + var63 * 4];
                            int var66 = class58.field916[(var64 + 2 & 0x3) + var63 * 4];
                            if (class217.field3751[var66][1] && class217.field3751[var65][0]) {
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
                    if (var27 != 0 && var15 != var27) {
                        class71 var71 = class128.method922(var27 - 1, arg5 + 31650);
                        if (var71.field1236 && var71.field1235 != -1) {
                            var24 = class58.field916[(arg0[var13][var14 + 1] + 2 & 0x3) + arg7[var13][var14 + 1] * 4];
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
                    if (var26 != 0 && var15 != var26) {
                        class71 var73 = class128.method922(var26 - 1, 31532);
                        if (var73.field1236 && var73.field1235 != -1) {
                            var25 = class58.field916[(arg0[var13 - 1][var14] + 3 & 0x3) + arg7[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var26;
                                    break;
                                }
                                if (var22[var74] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var15 != var30) {
                        class71 var75 = class128.method922(var30 - 1, 31532);
                        if (var75.field1236 && var75.field1235 != -1) {
                            var28 = class58.field916[(arg0[var13][var14 - 1] & 0x3) + arg7[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var30;
                                    break;
                                }
                                if (var22[var76] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var15 != var29) {
                        class71 var77 = class128.method922(var29 - 1, 31532);
                        if (var77.field1236 && var77.field1235 != -1) {
                            var23 = class58.field916[(arg0[var13 + 1][var14] + 1 & 0x3) + arg7[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class217.field3751[var27 == var80 ? var24 : 0];
                        boolean[] var82 = class217.field3751[var29 == var80 ? var23 : 0];
                        boolean[] var83 = class217.field3751[var30 == var80 ? var28 : 0];
                        boolean[] var84 = class217.field3751[var26 == var80 ? var25 : 0];
                        class71 var85 = class128.method922(var80 - 1, 31532);
                        class157 var86 = class114.method831(false, var85, var12);
                        var86.field2693 += 5;
                        var86.field2693 += var81.length - 2;
                        var86.field2693 += var84.length - 2;
                        var86.field2693 += var83.length - 2;
                        var86.field2693 += var82.length - 2;
                        var86.field2702++;
                    }
                }
            }
        }
        for (class157 var87 = (class157) var12.method985(123); var87 != null; var87 = (class157) var12.method983(-1)) {
            var87.method1073();
        }
        int var88 = 1;
        if (arg5 != -118) {
            field5050 = (class12) null;
        }
        while (var88 <= 102) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg11[arg2][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg11[1][var88][var89] & 0x2) == 2 && arg2 > 0) {
                    var90 = arg2 - 1;
                } else {
                    var90 = arg2;
                }
                int var91 = arg1[var88][var89] & 0xFF;
                int var92 = arg8[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class71 var93 = class128.method922(var91 - 1, arg5 + 31650);
                    if (var93.field1235 == -1) {
                        continue;
                    }
                    class157 var94 = class114.method831(false, var93, var12);
                    byte var95 = arg0[var88][var89];
                    byte var96 = arg7[var88][var89];
                    int var97 = class232.method1549(var93.field1259, -68, arg9[var88][var89], var93.field1235);
                    int var98 = class232.method1549(var93.field1259, -52, arg9[var88 + 1][var89], var93.field1235);
                    int var99 = class232.method1549(var93.field1259, -100, arg9[var88 + 1][var89 + 1], var93.field1235);
                    int var100 = class232.method1549(var93.field1259, arg5 ^ 0x38, arg9[var88][var89 + 1], var93.field1235);
                    class82.method598(var94, var100, var97, arg3, var89, arg4, 113, var90, var88, arg10, var99, var98, arg6, var92 != 0 && var93.field1236, var96, var95);
                }
                if ((arg8[var88][var89] & 0xFF) != 0 || var91 != 0 && arg7[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int[] var103 = new int[8];
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg1[var88][var89 + 1] & 0xFF;
                    int var108 = arg1[var88 - 1][var89] & 0xFF;
                    int var109 = arg1[var88 + 1][var89] & 0xFF;
                    int var110 = arg1[var88][var89 - 1] & 0xFF;
                    int var111 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class71 var115 = class128.method922(var111 - 1, 31532);
                        if (var115.field1236 && var115.field1235 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg7[var88 - 1][var89 + 1];
                            int var118 = class58.field916[var117 * 4 + (var116 + 2 & 0x3)];
                            int var119 = class58.field916[(var116 + 3 & 0x3) + var117 * 4];
                            if (class217.field3751[var119][1] && class217.field3751[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var103[var101++] = var111;
                                        break;
                                    }
                                    if (var103[var120] == var111) {
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
                        class71 var121 = class128.method922(var112 - 1, 31532);
                        if (var121.field1236 && var121.field1235 != -1) {
                            byte var122 = arg0[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class58.field916[(var122 & 0x3) + var123 * 4];
                            int var125 = class58.field916[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class217.field3751[var124][1] && class217.field3751[var125][0]) {
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
                        class71 var127 = class128.method922(var113 - 1, 31532);
                        if (var127.field1236 && var127.field1235 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg7[var88 + 1][var89 - 1];
                            int var130 = class58.field916[var129 * 4 + (var128 + 1 & 0x3)];
                            int var131 = class58.field916[(var128 & 0x3) + var129 * 4];
                            if (class217.field3751[var130][1] && class217.field3751[var131][0]) {
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
                        class71 var133 = class128.method922(var114 - 1, 31532);
                        if (var133.field1236 && var133.field1235 != -1) {
                            byte var134 = arg0[var88 + 1][var89 + 1];
                            byte var135 = arg7[var88 + 1][var89 + 1];
                            int var136 = class58.field916[var135 * 4 + (var134 + 1 & 0x3)];
                            int var137 = class58.field916[(var134 + 2 & 0x3) + var135 * 4];
                            if (class217.field3751[var137][1] && class217.field3751[var136][0]) {
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
                    if (var107 != 0 && var91 != var107) {
                        class71 var139 = class128.method922(var107 - 1, arg5 + 31650);
                        if (var139.field1236 && var139.field1235 != -1) {
                            var102 = class58.field916[arg7[var88][var89 + 1] * 4 + (arg0[var88][var89 + 1] + 2 & 0x3)];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var103[var101++] = var107;
                                    break;
                                }
                                if (var103[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class71 var141 = class128.method922(var108 - 1, 31532);
                        if (var141.field1236 && var141.field1235 != -1) {
                            var104 = class58.field916[(arg0[var88 - 1][var89] + 3 & 0x3) + arg7[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var103[var101++] = var108;
                                    break;
                                }
                                if (var103[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class71 var143 = class128.method922(var110 - 1, arg5 ^ 0xFFFF84A6);
                        if (var143.field1236 && var143.field1235 != -1) {
                            var105 = class58.field916[arg7[var88][var89 - 1] * 4 + (arg0[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var103[var101++] = var110;
                                    break;
                                }
                                if (var103[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class71 var145 = class128.method922(var109 - 1, 31532);
                        if (var145.field1236 && var145.field1235 != -1) {
                            var106 = class58.field916[(arg0[var88 + 1][var89] + 1 & 0x3) + arg7[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var103[var101++] = var109;
                                    break;
                                }
                                if (var103[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var103[var147];
                        boolean[] var149 = class217.field3751[var107 == var148 ? var102 : 0];
                        boolean[] var150 = class217.field3751[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class217.field3751[var110 == var148 ? var105 : 0];
                        boolean[] var152 = class217.field3751[var109 == var148 ? var106 : 0];
                        class71 var153 = class128.method922(var148 - 1, 31532);
                        class157 var154 = class114.method831(false, var153, var12);
                        int var155 = class232.method1549(var153.field1259, -64, arg9[var88][var89], var153.field1235) << 8 | 0xFF;
                        int var156 = class232.method1549(var153.field1259, arg5 + 18, arg9[var88 - -1][var89], var153.field1235) << 8 | 0xFF;
                        int var157 = class232.method1549(var153.field1259, -62, arg9[var88 + 1][var89 + 1], var153.field1235) << 8 | 0xFF;
                        int var158 = class232.method1549(var153.field1259, arg5 ^ 0x1C, arg9[var88][var89 + 1], var153.field1235) << 8 | 0xFF;
                        boolean var159 = var114 != var148 && var149[0] && var152[1];
                        boolean var160 = var113 != var148 && var152[0] && var151[1];
                        boolean var161 = var111 != var148 && var150[0] && var149[1];
                        boolean var162 = var112 != var148 && var151[0] && var150[1];
                        byte var163 = 6;
                        int var164 = var149.length + var163 - 2;
                        int var165 = var150.length + var164 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var152.length + var166 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class147.method1016(true, var155, var156, var88, 0, arg6, 64, arg4, arg3, 2, var157, (int[][]) null, 64, var89, var154, var158, 0.0F, arg10);
                        int var170 = class147.method1016(var161, var155, var156, var88, 0, arg6, 0, arg4, arg3, 2, var157, (int[][]) null, 128, var89, var154, var158, 0.0F, arg10);
                        byte var171 = 0;
                        int var172 = class147.method1016(var159, var155, var156, var88, 0, arg6, 128, arg4, arg3, 2, var157, (int[][]) null, 128, var89, var154, var158, 0.0F, arg10);
                        int var173 = class147.method1016(var162, var155, var156, var88, 0, arg6, 0, arg4, arg3, 2, var157, (int[][]) null, 0, var89, var154, var158, 0.0F, arg10);
                        int var174 = class147.method1016(var160, var155, var156, var88, 0, arg6, 128, arg4, arg3, 2, var157, (int[][]) null, 0, var89, var154, var158, 0.0F, arg10);
                        int var180 = var171 + 1;
                        var168[var171] = var169;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class147.method1016(var149[2], var155, var156, var88, 0, arg6, 64, arg4, arg3, 2, var157, (int[][]) null, 128, var89, var154, var158, 0.0F, arg10);
                        }
                        var168[var180++] = var170;
                        if (var150.length > 2) {
                            var168[var180++] = class147.method1016(var150[2], var155, var156, var88, 0, arg6, 0, arg4, arg3, 2, var157, (int[][]) null, 64, var89, var154, var158, 0.0F, arg10);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class147.method1016(var151[2], var155, var156, var88, 0, arg6, 64, arg4, arg3, 2, var157, (int[][]) null, 0, var89, var154, var158, 0.0F, arg10);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class147.method1016(var152[2], var155, var156, var88, 0, arg6, 128, arg4, arg3, class139.method962(arg5, -120), var157, (int[][]) null, 64, var89, var154, var158, 0.0F, arg10);
                        }
                        var168[var180++] = var172;
                        var154.method1068(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
            var88++;
        }
        for (class157 var175 = (class157) var12.method985(116); var175 != null; var175 = (class157) var12.method983(-1)) {
            if (var175.field2701 == 0) {
                var175.method1054((byte) 116);
            } else {
                var175.method1070();
            }
        }
        int var176 = var12.method988((byte) 33);
        class157[] var177 = new class157[var176];
        long[] var178 = new long[var176];
        var12.method989(var177, -55);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field2642;
        }
        class250.method1698(var178, var177, true);
        return var177;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V", line = 970)
    public static final void method2061(boolean arg0) {
        field5053++;
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class208.field3577[var1] = false;
        }
        class205.field3554 = -1;
        class109.field1926 = 1;
        class57.field897 = -1;
    }
}
