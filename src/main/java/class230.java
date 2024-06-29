import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class230 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[Lfh;")
    public static class266[] field3598 = new class266[6];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([[F[[FI[[I[[F[[B[[B[[B[[I[[B[[[BB)[Lmi;", line = 6)
    public static final class125[] method1728(float[][] arg0, float[][] arg1, int arg2, int[][] arg3, float[][] arg4, byte[][] arg5, byte[][] arg6, byte[][] arg7, int[][] arg8, byte[][] arg9, byte[][][] arg10, byte arg11) {
        class37 var12 = new class37(128);
        int var13 = 1;
        int var14 = -94 / ((63 - arg11) / 54);
        while (var13 <= 102) {
            for (int var15 = 1; var15 <= 102; var15++) {
                int var16 = arg5[var13][var15] & 0xFF;
                int var17 = arg7[var13][var15] & 0xFF;
                if (var17 != 0) {
                    class192 var18 = class91.method810(var17 - 1, (byte) -100);
                    if (var18.field3019 == -1) {
                        continue;
                    }
                    class125 var19 = class209.method1550(var18, 1166671216, var12);
                    byte var20 = arg6[var13][var15];
                    int[] var21 = class263.field4091[var20];
                    var19.field2080 += var21.length / 2;
                    var19.field2091++;
                    if (var18.field3020 && var16 != 0) {
                        var19.field2080 += class309.field4769[var20];
                    }
                }
                if ((arg5[var13][var15] & 0xFF) != 0 || var17 != 0 && arg6[var13][var15] == 0) {
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg7[var13][var15 + 1] & 0xFF;
                    int var28 = 0;
                    int var29 = arg7[var13 - 1][var15] & 0xFF;
                    int var30 = arg7[var13][var15 - 1] & 0xFF;
                    int var31 = arg7[var13 - 1][var15 + 1] & 0xFF;
                    int var32 = arg7[var13 + 1][var15] & 0xFF;
                    int var33 = arg7[var13 + 1][var15 - 1] & 0xFF;
                    int var34 = arg7[var13 - 1][var15 - 1] & 0xFF;
                    int var35 = arg7[var13 + 1][var15 + 1] & 0xFF;
                    if (var31 == 0 || var17 == var31) {
                        boolean var44 = false;
                    } else {
                        class192 var36 = class91.method810(var31 - 1, (byte) 102);
                        if (var36.field3020 && var36.field3019 != -1) {
                            byte var37 = arg9[var13 - 1][var15 + 1];
                            byte var38 = arg6[var13 - 1][var15 + 1];
                            int var39 = class150.field2459[(var37 + 3 & 0x3) + var38 * 4];
                            int var40 = class150.field2459[var38 * 4 + (var37 + 2 & 0x3)];
                            if (class120.field1858[var39][1] && class120.field1858[var40][0]) {
                                boolean var41 = false;
                            } else {
                                for (int var42 = 0; var42 < 8; var42++) {
                                    if (var24 == var42) {
                                        var22[var24++] = var31;
                                        break;
                                    }
                                    if (var22[var42] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var43 = false;
                        }
                    }
                    if (var34 == 0 || var17 == var34) {
                        boolean var53 = false;
                    } else {
                        class192 var45 = class91.method810(var34 - 1, (byte) -115);
                        if (var45.field3020 && var45.field3019 != -1) {
                            byte var46 = arg9[var13 - 1][var15 - 1];
                            byte var47 = arg6[var13 - 1][var15 - 1];
                            int var48 = class150.field2459[var47 * 4 + (var46 + 3 & 0x3)];
                            int var49 = class150.field2459[(var46 & 0x3) + var47 * 4];
                            if (class120.field1858[var49][1] && class120.field1858[var48][0]) {
                                boolean var50 = false;
                            } else {
                                for (int var51 = 0; var51 < 8; var51++) {
                                    if (var24 == var51) {
                                        var22[var24++] = var34;
                                        break;
                                    }
                                    if (var22[var51] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var52 = false;
                        }
                    }
                    if (var33 == 0 || var17 == var33) {
                        boolean var62 = false;
                    } else {
                        class192 var54 = class91.method810(var33 - 1, (byte) 107);
                        if (var54.field3020 && var54.field3019 != -1) {
                            byte var55 = arg9[var13 + 1][var15 - 1];
                            byte var56 = arg6[var13 + 1][var15 - 1];
                            int var57 = class150.field2459[(var55 & 0x3) + var56 * 4];
                            int var58 = class150.field2459[(var55 + 1 & 0x3) + var56 * 4];
                            if (class120.field1858[var58][1] && class120.field1858[var57][0]) {
                                boolean var59 = false;
                            } else {
                                for (int var60 = 0; var60 < 8; var60++) {
                                    if (var24 == var60) {
                                        var22[var24++] = var33;
                                        break;
                                    }
                                    if (var22[var60] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var61 = false;
                        }
                    }
                    if (var35 == 0 || var17 == var35) {
                        boolean var71 = false;
                    } else {
                        class192 var63 = class91.method810(var35 - 1, (byte) -70);
                        if (var63.field3020 && var63.field3019 != -1) {
                            byte var64 = arg6[var13 + 1][var15 + 1];
                            byte var65 = arg9[var13 + 1][var15 + 1];
                            int var66 = class150.field2459[(var65 + 1 & 0x3) + var64 * 4];
                            int var67 = class150.field2459[var64 * 4 + (var65 + 2 & 0x3)];
                            if (class120.field1858[var67][1] && class120.field1858[var66][0]) {
                                boolean var68 = false;
                            } else {
                                for (int var69 = 0; var69 < 8; var69++) {
                                    if (var24 == var69) {
                                        var22[var24++] = var35;
                                        break;
                                    }
                                    if (var22[var69] == var35) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var70 = false;
                        }
                    }
                    if (var27 != 0 && var17 != var27) {
                        class192 var72 = class91.method810(var27 - 1, (byte) -124);
                        if (var72.field3020 && var72.field3019 != -1) {
                            var28 = class150.field2459[arg6[var13][var15 + 1] * 4 + (arg9[var13][var15 + 1] + 2 & 0x3)];
                            for (int var73 = 0; var73 < 8; var73++) {
                                if (var24 == var73) {
                                    var22[var24++] = var27;
                                    break;
                                }
                                if (var22[var73] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var17 != var29) {
                        class192 var74 = class91.method810(var29 - 1, (byte) -84);
                        if (var74.field3020 && var74.field3019 != -1) {
                            var23 = class150.field2459[(arg9[var13 - 1][var15] + 3 & 0x3) + arg6[var13 - 1][var15] * 4];
                            for (int var75 = 0; var75 < 8; var75++) {
                                if (var24 == var75) {
                                    var22[var24++] = var29;
                                    break;
                                }
                                if (var22[var75] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var17 != var30) {
                        class192 var76 = class91.method810(var30 - 1, (byte) -106);
                        if (var76.field3020 && var76.field3019 != -1) {
                            var25 = class150.field2459[arg6[var13][var15 - 1] * 4 + (arg9[var13][var15 - 1] & 0x3)];
                            for (int var77 = 0; var77 < 8; var77++) {
                                if (var24 == var77) {
                                    var22[var24++] = var30;
                                    break;
                                }
                                if (var22[var77] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var32 != 0 && var17 != var32) {
                        class192 var78 = class91.method810(var32 - 1, (byte) -119);
                        if (var78.field3020 && var78.field3019 != -1) {
                            var26 = class150.field2459[(arg9[var13 + 1][var15] + 1 & 0x3) + arg6[var13 + 1][var15] * 4];
                            for (int var79 = 0; var79 < 8; var79++) {
                                if (var24 == var79) {
                                    var22[var24++] = var32;
                                    break;
                                }
                                if (var22[var79] == var32) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var80 = 0; var80 < var24; var80++) {
                        int var81 = var22[var80];
                        boolean[] var82 = class120.field1858[var29 == var81 ? var23 : 0];
                        boolean[] var83 = class120.field1858[var27 == var81 ? var28 : 0];
                        boolean[] var84 = class120.field1858[var32 == var81 ? var26 : 0];
                        boolean[] var85 = class120.field1858[var30 == var81 ? var25 : 0];
                        class192 var86 = class91.method810(var81 - 1, (byte) 96);
                        class125 var87 = class209.method1550(var86, 1166671216, var12);
                        var87.field2080 += 5;
                        var87.field2080 += var83.length - 2;
                        var87.field2080 += var82.length - 2;
                        var87.field2080 += var85.length - 2;
                        var87.field2080 += var84.length - 2;
                        var87.field2091++;
                    }
                }
            }
            var13++;
        }
        for (class125 var88 = (class125) var12.method371(-19139); var88 != null; var88 = (class125) var12.method378((byte) -108)) {
            var88.method1082();
        }
        field3600++;
        for (int var89 = 1; var89 <= 102; var89++) {
            for (int var90 = 1; var90 <= 102; var90++) {
                int var91;
                if ((arg10[arg2][var89][var90] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg10[1][var89][var90] & 0x2) == 2 && arg2 > 0) {
                    var91 = arg2 - 1;
                } else {
                    var91 = arg2;
                }
                int var92 = arg5[var89][var90] & 0xFF;
                int var93 = arg7[var89][var90] & 0xFF;
                if (var93 != 0) {
                    class192 var94 = class91.method810(var93 - 1, (byte) 123);
                    if (var94.field3019 == -1) {
                        continue;
                    }
                    class125 var95 = class209.method1550(var94, 1166671216, var12);
                    byte var96 = arg9[var89][var90];
                    byte var97 = arg6[var89][var90];
                    int var98 = class42.method433(arg8[var89][var90], -117, var94.field3024, var94.field3019);
                    int var99 = class42.method433(arg8[var89 + 1][var90], 54, var94.field3024, var94.field3019);
                    int var100 = class42.method433(arg8[var89 + 1][var90 + 1], 105, var94.field3024, var94.field3019);
                    int var101 = class42.method433(arg8[var89][var90 + 1], 22, var94.field3024, var94.field3019);
                    class36.method365(arg1, var99, arg4, arg3, arg0, var98, var101, var92 != 0 && var94.field3020, var90, (byte) 38, var97, var95, var91, var89, var96, var100);
                }
                if ((arg5[var89][var90] & 0xFF) != 0 || var93 != 0 && arg6[var89][var90] == 0) {
                    int var102 = 0;
                    int var103 = 0;
                    int[] var104 = new int[8];
                    int var105 = 0;
                    int var106 = arg7[var89][var90 + 1] & 0xFF;
                    int var107 = arg7[var89 - 1][var90] & 0xFF;
                    int var108 = 0;
                    int var109 = arg7[var89][var90 - 1] & 0xFF;
                    int var110 = arg7[var89 + 1][var90] & 0xFF;
                    int var111 = arg7[var89 - 1][var90 + 1] & 0xFF;
                    int var112 = arg7[var89 + 1][var90 - 1] & 0xFF;
                    int var113 = 0;
                    int var114 = arg7[var89 + 1][var90 + 1] & 0xFF;
                    int var115 = arg7[var89 - 1][var90 - 1] & 0xFF;
                    if (var111 == 0 || var93 == var111) {
                        var111 = 0;
                    } else {
                        class192 var116 = class91.method810(var111 - 1, (byte) -26);
                        if (var116.field3020 && var116.field3019 != -1) {
                            byte var117 = arg9[var89 - 1][var90 + 1];
                            byte var118 = arg6[var89 - 1][var90 + 1];
                            int var119 = class150.field2459[(var117 + 2 & 0x3) + var118 * 4];
                            int var120 = class150.field2459[var118 * 4 + (var117 + 3 & 0x3)];
                            if (class120.field1858[var120][1] && class120.field1858[var119][0]) {
                                var111 = 0;
                            } else {
                                for (int var121 = 0; var121 < 8; var121++) {
                                    if (var102 == var121) {
                                        var104[var102++] = var111;
                                        break;
                                    }
                                    if (var104[var121] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var115 == 0 || var93 == var115) {
                        var115 = 0;
                    } else {
                        class192 var122 = class91.method810(var115 - 1, (byte) -34);
                        if (var122.field3020 && var122.field3019 != -1) {
                            byte var123 = arg9[var89 - 1][var90 - 1];
                            byte var124 = arg6[var89 - 1][var90 - 1];
                            int var125 = class150.field2459[(var123 & 0x3) + var124 * 4];
                            int var126 = class150.field2459[(var123 + 3 & 0x3) + var124 * 4];
                            if (class120.field1858[var125][1] && class120.field1858[var126][0]) {
                                var115 = 0;
                            } else {
                                for (int var127 = 0; var127 < 8; var127++) {
                                    if (var102 == var127) {
                                        var104[var102++] = var115;
                                        break;
                                    }
                                    if (var104[var127] == var115) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var115 = 0;
                        }
                    }
                    if (var112 == 0 || var93 == var112) {
                        var112 = 0;
                    } else {
                        class192 var128 = class91.method810(var112 - 1, (byte) 125);
                        if (var128.field3020 && var128.field3019 != -1) {
                            byte var129 = arg9[var89 + 1][var90 - 1];
                            byte var130 = arg6[var89 + 1][var90 - 1];
                            int var131 = class150.field2459[(var129 & 0x3) + var130 * 4];
                            int var132 = class150.field2459[var130 * 4 + (var129 + 1 & 0x3)];
                            if (class120.field1858[var132][1] && class120.field1858[var131][0]) {
                                var112 = 0;
                            } else {
                                for (int var133 = 0; var133 < 8; var133++) {
                                    if (var102 == var133) {
                                        var104[var102++] = var112;
                                        break;
                                    }
                                    if (var104[var133] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var93 == var114) {
                        var114 = 0;
                    } else {
                        class192 var134 = class91.method810(var114 - 1, (byte) -108);
                        if (var134.field3020 && var134.field3019 != -1) {
                            byte var135 = arg9[var89 + 1][var90 + 1];
                            byte var136 = arg6[var89 + 1][var90 + 1];
                            int var137 = class150.field2459[(var135 + 2 & 0x3) + var136 * 4];
                            int var138 = class150.field2459[(var135 + 1 & 0x3) + var136 * 4];
                            if (class120.field1858[var137][1] && class120.field1858[var138][0]) {
                                var114 = 0;
                            } else {
                                for (int var139 = 0; var139 < 8; var139++) {
                                    if (var102 == var139) {
                                        var104[var102++] = var114;
                                        break;
                                    }
                                    if (var104[var139] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var106 != 0 && var93 != var106) {
                        class192 var140 = class91.method810(var106 - 1, (byte) -44);
                        if (var140.field3020 && var140.field3019 != -1) {
                            var113 = class150.field2459[(arg9[var89][var90 + 1] + 2 & 0x3) + arg6[var89][var90 + 1] * 4];
                            for (int var141 = 0; var141 < 8; var141++) {
                                if (var102 == var141) {
                                    var104[var102++] = var106;
                                    break;
                                }
                                if (var104[var141] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var93 != var107) {
                        class192 var142 = class91.method810(var107 - 1, (byte) 103);
                        if (var142.field3020 && var142.field3019 != -1) {
                            var103 = class150.field2459[(arg9[var89 - 1][var90] + 3 & 0x3) + arg6[var89 - 1][var90] * 4];
                            for (int var143 = 0; var143 < 8; var143++) {
                                if (var102 == var143) {
                                    var104[var102++] = var107;
                                    break;
                                }
                                if (var104[var143] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var93 != var109) {
                        class192 var144 = class91.method810(var109 - 1, (byte) 104);
                        if (var144.field3020 && var144.field3019 != -1) {
                            var105 = class150.field2459[(arg9[var89][var90 - 1] & 0x3) + arg6[var89][var90 - 1] * 4];
                            for (int var145 = 0; var145 < 8; var145++) {
                                if (var102 == var145) {
                                    var104[var102++] = var109;
                                    break;
                                }
                                if (var104[var145] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var93 != var110) {
                        class192 var146 = class91.method810(var110 - 1, (byte) 80);
                        if (var146.field3020 && var146.field3019 != -1) {
                            var108 = class150.field2459[(arg9[var89 + 1][var90] + 1 & 0x3) + arg6[var89 + 1][var90] * 4];
                            for (int var147 = 0; var147 < 8; var147++) {
                                if (var102 == var147) {
                                    var104[var102++] = var110;
                                    break;
                                }
                                if (var104[var147] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var148 = 0; var148 < var102; var148++) {
                        int var149 = var104[var148];
                        boolean[] var150 = class120.field1858[var106 == var149 ? var113 : 0];
                        boolean[] var151 = class120.field1858[var107 == var149 ? var103 : 0];
                        boolean[] var152 = class120.field1858[var110 == var149 ? var108 : 0];
                        boolean[] var153 = class120.field1858[var109 == var149 ? var105 : 0];
                        class192 var154 = class91.method810(var149 - 1, (byte) -36);
                        class125 var155 = class209.method1550(var154, 1166671216, var12);
                        int var156 = class42.method433(arg8[var89][var90], -121, var154.field3024, var154.field3019) << 8 | 0xFF;
                        int var157 = class42.method433(arg8[var89 + 1][var90], 95, var154.field3024, var154.field3019) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class42.method433(arg8[var89 + 1][var90 + 1], -110, var154.field3024, var154.field3019) << 8 | 0xFF;
                        int var160 = class42.method433(arg8[var89][var90 + 1], 34, var154.field3024, var154.field3019) << 8 | 0xFF;
                        boolean var161 = var114 != var149 && var150[0] && var152[1];
                        boolean var162 = var115 != var149 && var153[0] && var151[1];
                        boolean var163 = var112 != var149 && var152[0] && var153[1];
                        int var164 = var150.length + var158 - 2;
                        int var165 = var151.length + var164 - 2;
                        boolean var166 = var111 != var149 && var151[0] && var150[1];
                        int var167 = var153.length + var165 - 2;
                        int var168 = var152.length + var167 - 2;
                        int var169 = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, true, var89, -11347, 64, var157, var90, 64, arg1, var159, var155, 0.0F, var156);
                        int var170 = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var166, var89, -11347, 128, var157, var90, 0, arg1, var159, var155, 0.0F, var156);
                        int[] var171 = new int[var168];
                        int var172 = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var161, var89, -11347, 128, var157, var90, 128, arg1, var159, var155, 0.0F, var156);
                        int var173 = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var162, var89, -11347, 0, var157, var90, 0, arg1, var159, var155, 0.0F, var156);
                        int var174 = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var163, var89, -11347, 0, var157, var90, 128, arg1, var159, var155, 0.0F, var156);
                        byte var175 = 0;
                        int var181 = var175 + 1;
                        var171[var175] = var169;
                        var171[var181++] = var172;
                        if (var150.length > 2) {
                            var171[var181++] = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var150[2], var89, -11347, 128, var157, var90, 64, arg1, var159, var155, 0.0F, var156);
                        }
                        var171[var181++] = var170;
                        if (var151.length > 2) {
                            var171[var181++] = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var151[2], var89, -11347, 64, var157, var90, 0, arg1, var159, var155, 0.0F, var156);
                        }
                        var171[var181++] = var173;
                        if (var153.length > 2) {
                            var171[var181++] = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var153[2], var89, -11347, 0, var157, var90, 64, arg1, var159, var155, 0.0F, var156);
                        }
                        var171[var181++] = var174;
                        if (var152.length > 2) {
                            var171[var181++] = class146.method1216(0, (int[][]) null, var160, arg3, arg4, arg0, var152[2], var89, -11347, 64, var157, var90, 128, arg1, var159, var155, 0.0F, var156);
                        }
                        var171[var181++] = var172;
                        var155.method1085(var91, var89, var90, var171, (int[]) null, true);
                    }
                }
            }
        }
        for (class125 var176 = (class125) var12.method371(-19139); var176 != null; var176 = (class125) var12.method378((byte) -126)) {
            if (var176.field2074 == 0) {
                var176.method1357(947647010);
            } else {
                var176.method1083();
            }
        }
        int var177 = var12.method380((byte) -102);
        class125[] var178 = new class125[var177];
        long[] var179 = new long[var177];
        var12.method379(var178, -6454);
        for (int var180 = 0; var180 < var177; var180++) {
            var179[var180] = var178[var180].field2734;
        }
        class181.method1410(true, var178, var179);
        return var178;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 945)
    public static void method1729(int arg0) {
        field3598 = null;
        int var1 = 18 / ((36 - arg0) / 41);
    }
}
