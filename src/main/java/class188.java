import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class188 extends class325 {

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "[I")
    public static int[] field2962 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "[I")
    public static int[] field2958 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Ljava/lang/String;")
    public String field2950;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 5)
    public static void method1387(int arg0) {
        field2958 = null;
        if (arg0 > -114) {
            method1387(-51);
        }
        field2962 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([[B[[B[[FI[[I[[B[[F[[FI[[[B[[I[[B)[Lfn;", line = 19)
    public static final class58[] method1388(byte[][] arg0, byte[][] arg1, float[][] arg2, int arg3, int[][] arg4, byte[][] arg5, float[][] arg6, float[][] arg7, int arg8, byte[][][] arg9, int[][] arg10, byte[][] arg11) {
        field2953++;
        class250 var12 = new class250(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg11[var13][var14] & 0xFF;
                int var16 = arg0[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class299 var17 = class106.method792(var16 - 1, 0);
                    if (var17.field4611 == -1) {
                        continue;
                    }
                    class58 var18 = class69.method493(var12, -96, var17);
                    byte var19 = arg5[var13][var14];
                    int[] var20 = class258.field3981[var19];
                    var18.field773 += var20.length / 2;
                    var18.field761++;
                    if (var17.field4603 && var15 != 0) {
                        var18.field773 += class13.field163[var19];
                    }
                }
                if ((arg11[var13][var14] & 0xFF) != 0 || var16 != 0 && arg5[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg0[var13][var14 + 1] & 0xFF;
                    int var28 = arg0[var13 - 1][var14 + 1] & 0xFF;
                    int var29 = arg0[var13][var14 - 1] & 0xFF;
                    int var30 = arg0[var13 + 1][var14] & 0xFF;
                    int var31 = arg0[var13 - 1][var14] & 0xFF;
                    int var32 = arg0[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg0[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg0[var13 + 1][var14 + 1] & 0xFF;
                    if (var28 == 0 || var16 == var28) {
                        boolean var43 = false;
                    } else {
                        class299 var35 = class106.method792(var28 - 1, 0);
                        if (var35.field4603 && var35.field4611 != -1) {
                            byte var36 = arg1[var13 - 1][var14 + 1];
                            byte var37 = arg5[var13 - 1][var14 + 1];
                            int var38 = class90.field1293[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class90.field1293[(var36 + 2 & 0x3) + var37 * 4];
                            if (class27.field296[var38][1] && class27.field296[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var24 == var41) {
                                        var21[var24++] = var28;
                                        break;
                                    }
                                    if (var21[var41] == var28) {
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
                        class299 var44 = class106.method792(var32 - 1, 0);
                        if (var44.field4603 && var44.field4611 != -1) {
                            byte var45 = arg5[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class90.field1293[(var46 & 0x3) + var45 * 4];
                            int var48 = class90.field1293[var45 * 4 + (var46 + 3 & 0x3)];
                            if (class27.field296[var47][1] && class27.field296[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var24 == var50) {
                                        var21[var24++] = var32;
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
                        class299 var53 = class106.method792(var33 - 1, 0);
                        if (var53.field4603 && var53.field4611 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class90.field1293[var54 * 4 + (var55 & 0x3)];
                            int var57 = class90.field1293[(var55 + 1 & 0x3) + var54 * 4];
                            if (class27.field296[var57][1] && class27.field296[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var24 == var59) {
                                        var21[var24++] = var33;
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
                        class299 var62 = class106.method792(var34 - 1, 0);
                        if (var62.field4603 && var62.field4611 != -1) {
                            byte var63 = arg1[var13 + 1][var14 + 1];
                            byte var64 = arg5[var13 + 1][var14 + 1];
                            int var65 = class90.field1293[var64 * 4 + (var63 + 2 & 0x3)];
                            int var66 = class90.field1293[(var63 + 1 & 0x3) + var64 * 4];
                            if (class27.field296[var65][1] && class27.field296[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var24 == var68) {
                                        var21[var24++] = var34;
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
                        class299 var71 = class106.method792(var27 - 1, 0);
                        if (var71.field4603 && var71.field4611 != -1) {
                            var22 = class90.field1293[(arg1[var13][var14 + 1] + 2 & 0x3) + arg5[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var24 == var72) {
                                    var21[var24++] = var27;
                                    break;
                                }
                                if (var21[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var16 != var31) {
                        class299 var73 = class106.method792(var31 - 1, 0);
                        if (var73.field4603 && var73.field4611 != -1) {
                            var23 = class90.field1293[arg5[var13 - 1][var14] * 4 + (arg1[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var24 == var74) {
                                    var21[var24++] = var31;
                                    break;
                                }
                                if (var21[var74] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class299 var75 = class106.method792(var29 - 1, 0);
                        if (var75.field4603 && var75.field4611 != -1) {
                            var25 = class90.field1293[(arg1[var13][var14 - 1] & 0x3) + arg5[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var24 == var76) {
                                    var21[var24++] = var29;
                                    break;
                                }
                                if (var21[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class299 var77 = class106.method792(var30 - 1, 0);
                        if (var77.field4603 && var77.field4611 != -1) {
                            var26 = class90.field1293[arg5[var13 + 1][var14] * 4 + (arg1[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var24 == var78) {
                                    var21[var24++] = var30;
                                    break;
                                }
                                if (var21[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var24; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class27.field296[var31 == var80 ? var23 : 0];
                        boolean[] var82 = class27.field296[var27 == var80 ? var22 : 0];
                        boolean[] var83 = class27.field296[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class27.field296[var30 == var80 ? var26 : 0];
                        class299 var85 = class106.method792(var80 - 1, 0);
                        class58 var86 = class69.method493(var12, 89, var85);
                        var86.field773 += 5;
                        var86.field773 += var82.length - 2;
                        var86.field773 += var81.length - 2;
                        var86.field773 += var83.length - 2;
                        var86.field773 += var84.length - 2;
                        var86.field761++;
                    }
                }
            }
        }
        for (class58 var87 = (class58) var12.method1706(0); var87 != null; var87 = (class58) var12.method1705((byte) 91)) {
            var87.method408();
        }
        int var88 = 1;
        int var89 = -95 % ((-arg3 - 50) / 46);
        while (var88 <= 102) {
            for (int var90 = 1; var90 <= 102; var90++) {
                int var91;
                if ((arg9[arg8][var88][var90] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg9[1][var88][var90] & 0x2) == 2 && arg8 > 0) {
                    var91 = arg8 - 1;
                } else {
                    var91 = arg8;
                }
                int var92 = arg0[var88][var90] & 0xFF;
                int var93 = arg11[var88][var90] & 0xFF;
                if (var92 != 0) {
                    class299 var94 = class106.method792(var92 - 1, 0);
                    if (var94.field4611 == -1) {
                        continue;
                    }
                    class58 var95 = class69.method493(var12, -98, var94);
                    byte var96 = arg5[var88][var90];
                    byte var97 = arg1[var88][var90];
                    int var98 = class333.method2330(var94.field4611, (byte) 69, arg10[var88][var90], var94.field4593);
                    int var99 = class333.method2330(var94.field4611, (byte) 69, arg10[var88 + 1][var90], var94.field4593);
                    int var100 = class333.method2330(var94.field4611, (byte) 69, arg10[var88 + 1][var90 + 1], var94.field4593);
                    int var101 = class333.method2330(var94.field4611, (byte) 69, arg10[var88][var90 + 1], var94.field4593);
                    class210.method1506(var95, arg6, var99, var91, arg2, var98, var96, var97, var88, var93 != 0 && var94.field4603, arg7, var101, arg4, -17395, var90, var100);
                }
                if ((arg11[var88][var90] & 0xFF) != 0 || var92 != 0 && arg5[var88][var90] == 0) {
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg0[var88][var90 + 1] & 0xFF;
                    int var108 = 0;
                    int var109 = arg0[var88][var90 - 1] & 0xFF;
                    int var110 = arg0[var88 - 1][var90] & 0xFF;
                    int var111 = arg0[var88 + 1][var90] & 0xFF;
                    int var112 = arg0[var88 - 1][var90 - 1] & 0xFF;
                    int var113 = arg0[var88 - 1][var90 + 1] & 0xFF;
                    int var114 = arg0[var88 + 1][var90 - 1] & 0xFF;
                    int var115 = arg0[var88 + 1][var90 + 1] & 0xFF;
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class299 var116 = class106.method792(var113 - 1, 0);
                        if (var116.field4603 && var116.field4611 != -1) {
                            byte var117 = arg1[var88 - 1][var90 + 1];
                            byte var118 = arg5[var88 - 1][var90 + 1];
                            int var119 = class90.field1293[(var117 + 3 & 0x3) + var118 * 4];
                            int var120 = class90.field1293[(var117 + 2 & 0x3) + var118 * 4];
                            if (class27.field296[var119][1] && class27.field296[var120][0]) {
                                var113 = 0;
                            } else {
                                for (int var121 = 0; var121 < 8; var121++) {
                                    if (var103 == var121) {
                                        var102[var103++] = var113;
                                        break;
                                    }
                                    if (var102[var121] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class299 var122 = class106.method792(var112 - 1, 0);
                        if (var122.field4603 && var122.field4611 != -1) {
                            byte var123 = arg1[var88 - 1][var90 - 1];
                            byte var124 = arg5[var88 - 1][var90 - 1];
                            int var125 = class90.field1293[(var123 & 0x3) + var124 * 4];
                            int var126 = class90.field1293[var124 * 4 + (var123 + 3 & 0x3)];
                            if (class27.field296[var125][1] && class27.field296[var126][0]) {
                                var112 = 0;
                            } else {
                                for (int var127 = 0; var127 < 8; var127++) {
                                    if (var103 == var127) {
                                        var102[var103++] = var112;
                                        break;
                                    }
                                    if (var102[var127] == var112) {
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
                        class299 var128 = class106.method792(var114 - 1, 0);
                        if (var128.field4603 && var128.field4611 != -1) {
                            byte var129 = arg1[var88 + 1][var90 - 1];
                            byte var130 = arg5[var88 + 1][var90 - 1];
                            int var131 = class90.field1293[(var129 & 0x3) + var130 * 4];
                            int var132 = class90.field1293[(var129 + 1 & 0x3) + var130 * 4];
                            if (class27.field296[var132][1] && class27.field296[var131][0]) {
                                var114 = 0;
                            } else {
                                for (int var133 = 0; var133 < 8; var133++) {
                                    if (var103 == var133) {
                                        var102[var103++] = var114;
                                        break;
                                    }
                                    if (var102[var133] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var115 == 0 || var92 == var115) {
                        var115 = 0;
                    } else {
                        class299 var134 = class106.method792(var115 - 1, 0);
                        if (var134.field4603 && var134.field4611 != -1) {
                            byte var135 = arg1[var88 + 1][var90 + 1];
                            byte var136 = arg5[var88 + 1][var90 + 1];
                            int var137 = class90.field1293[(var135 + 1 & 0x3) + var136 * 4];
                            int var138 = class90.field1293[(var135 + 2 & 0x3) + var136 * 4];
                            if (class27.field296[var138][1] && class27.field296[var137][0]) {
                                var115 = 0;
                            } else {
                                for (int var139 = 0; var139 < 8; var139++) {
                                    if (var103 == var139) {
                                        var102[var103++] = var115;
                                        break;
                                    }
                                    if (var102[var139] == var115) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var115 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class299 var140 = class106.method792(var107 - 1, 0);
                        if (var140.field4603 && var140.field4611 != -1) {
                            var106 = class90.field1293[(arg1[var88][var90 + 1] + 2 & 0x3) + arg5[var88][var90 + 1] * 4];
                            for (int var141 = 0; var141 < 8; var141++) {
                                if (var103 == var141) {
                                    var102[var103++] = var107;
                                    break;
                                }
                                if (var102[var141] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class299 var142 = class106.method792(var110 - 1, 0);
                        if (var142.field4603 && var142.field4611 != -1) {
                            var105 = class90.field1293[(arg1[var88 - 1][var90] + 3 & 0x3) + arg5[var88 - 1][var90] * 4];
                            for (int var143 = 0; var143 < 8; var143++) {
                                if (var103 == var143) {
                                    var102[var103++] = var110;
                                    break;
                                }
                                if (var102[var143] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class299 var144 = class106.method792(var109 - 1, 0);
                        if (var144.field4603 && var144.field4611 != -1) {
                            var104 = class90.field1293[(arg1[var88][var90 - 1] & 0x3) + arg5[var88][var90 - 1] * 4];
                            for (int var145 = 0; var145 < 8; var145++) {
                                if (var103 == var145) {
                                    var102[var103++] = var109;
                                    break;
                                }
                                if (var102[var145] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class299 var146 = class106.method792(var111 - 1, 0);
                        if (var146.field4603 && var146.field4611 != -1) {
                            var108 = class90.field1293[(arg1[var88 + 1][var90] + 1 & 0x3) + arg5[var88 + 1][var90] * 4];
                            for (int var147 = 0; var147 < 8; var147++) {
                                if (var103 == var147) {
                                    var102[var103++] = var111;
                                    break;
                                }
                                if (var102[var147] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var148 = 0; var148 < var103; var148++) {
                        int var149 = var102[var148];
                        boolean[] var150 = class27.field296[var107 == var149 ? var106 : 0];
                        boolean[] var151 = class27.field296[var110 == var149 ? var105 : 0];
                        boolean[] var152 = class27.field296[var111 == var149 ? var108 : 0];
                        boolean[] var153 = class27.field296[var109 == var149 ? var104 : 0];
                        class299 var154 = class106.method792(var149 - 1, 0);
                        class58 var155 = class69.method493(var12, -105, var154);
                        int var156 = class333.method2330(var154.field4611, (byte) 69, arg10[var88][var90], var154.field4593) << 8 | 0xFF;
                        int var157 = class333.method2330(var154.field4611, (byte) 69, arg10[var88 + 1][var90], var154.field4593) << 8 | 0xFF;
                        int var158 = class333.method2330(var154.field4611, (byte) 69, arg10[var88 + 1][var90 + 1], var154.field4593) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = class333.method2330(var154.field4611, (byte) 69, arg10[var88][var90 + 1], var154.field4593) << 8 | 0xFF;
                        int var161 = var150.length + var159 - 2;
                        int var162 = var151.length + var161 - 2;
                        int var163 = var153.length + var162 - 2;
                        int var164 = var152.length + var163 - 2;
                        int[] var165 = new int[var164];
                        byte var166 = 0;
                        boolean var167 = var113 != var149 && var151[0] && var150[1];
                        boolean var168 = var115 != var149 && var150[0] && var152[1];
                        boolean var169 = var114 != var149 && var152[0] && var153[1];
                        boolean var170 = var112 != var149 && var153[0] && var151[1];
                        int var171 = class142.method1088(var156, arg7, 0.0F, 64, var155, arg6, var90, true, var157, var158, var88, (int[][]) null, 0, 1628, 64, arg2, var160, arg4);
                        int var172 = class142.method1088(var156, arg7, 0.0F, 0, var155, arg6, var90, var167, var157, var158, var88, (int[][]) null, 0, 1628, 128, arg2, var160, arg4);
                        int var173 = class142.method1088(var156, arg7, 0.0F, 128, var155, arg6, var90, var168, var157, var158, var88, (int[][]) null, 0, 1628, 128, arg2, var160, arg4);
                        int var174 = class142.method1088(var156, arg7, 0.0F, 0, var155, arg6, var90, var170, var157, var158, var88, (int[][]) null, 0, 1628, 0, arg2, var160, arg4);
                        int var175 = class142.method1088(var156, arg7, 0.0F, 128, var155, arg6, var90, var169, var157, var158, var88, (int[][]) null, 0, 1628, 0, arg2, var160, arg4);
                        int var181 = var166 + 1;
                        var165[var166] = var171;
                        var165[var181++] = var173;
                        if (var150.length > 2) {
                            var165[var181++] = class142.method1088(var156, arg7, 0.0F, 64, var155, arg6, var90, var150[2], var157, var158, var88, (int[][]) null, 0, 1628, 128, arg2, var160, arg4);
                        }
                        var165[var181++] = var172;
                        if (var151.length > 2) {
                            var165[var181++] = class142.method1088(var156, arg7, 0.0F, 0, var155, arg6, var90, var151[2], var157, var158, var88, (int[][]) null, 0, 1628, 64, arg2, var160, arg4);
                        }
                        var165[var181++] = var174;
                        if (var153.length > 2) {
                            var165[var181++] = class142.method1088(var156, arg7, 0.0F, 64, var155, arg6, var90, var153[2], var157, var158, var88, (int[][]) null, 0, 1628, 0, arg2, var160, arg4);
                        }
                        var165[var181++] = var175;
                        if (var152.length > 2) {
                            var165[var181++] = class142.method1088(var156, arg7, 0.0F, 128, var155, arg6, var90, var152[2], var157, var158, var88, (int[][]) null, 0, 1628, 64, arg2, var160, arg4);
                        }
                        var165[var181++] = var173;
                        var155.method412(var91, var88, var90, var165, (int[]) null, true);
                    }
                }
            }
            var88++;
        }
        for (class58 var176 = (class58) var12.method1706(0); var176 != null; var176 = (class58) var12.method1705((byte) 114)) {
            if (var176.field756 == 0) {
                var176.method39(10717);
            } else {
                var176.method409();
            }
        }
        int var177 = var12.method1710(true);
        class58[] var178 = new class58[var177];
        long[] var179 = new long[var177];
        var12.method1711(var178, 0);
        for (int var180 = 0; var180 < var177; var180++) {
            var179[var180] = var178[var180].field69;
        }
        class48.method368(var179, 127, var178);
        return var178;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lwm;I)Ljava/lang/String;", line = 953)
    public static final String method1389(class254 arg0, int arg1) {
        field2956++;
        int var2 = -47 / ((-arg1 - 60) / 57);
        return class333.method2331(32767, arg0, -20165);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I", line = 969)
    public final int method1390(boolean arg0) {
        if (!arg0) {
            this.method1394(108);
        }
        field2951++;
        return (int) this.field69;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I", line = 980)
    public final int method1391(int arg0) {
        field2952++;
        return arg0 == -15255 ? (int) (this.field69 >>> 32 & 0xFFL) : -85;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V", line = 995)
    public final void method1392(byte arg0) {
        this.field5013 |= Long.MIN_VALUE;
        if (this.method1394(arg0 + 175) == 0L) {
            class328.field5058.method1810(this, false);
        }
        if (arg0 != -48) {
            method1387(-86);
        }
        field2960++;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V", line = 1009)
    public final void method1393(byte arg0) {
        this.field5013 = class105.method789((byte) 55) + 500L | Long.MIN_VALUE & this.field5013;
        field2961++;
        if (arg0 > -86) {
            this.method1393((byte) 40);
        }
        class170.field2743.method1810(this, false);
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)J", line = 1021)
    public final long method1394(int arg0) {
        field2949++;
        if (arg0 <= 122) {
            this.field2955 = -116;
        }
        return this.field5013 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V", line = 1035)
    public class188(int arg0, int arg1) {
        this.field69 = (long) arg1 | (long) arg0 << 32;
    }
}
