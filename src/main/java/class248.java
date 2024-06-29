import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class248 {

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "J")
    public long field4156 = 0L;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lwm;")
    public static class152 field4142 = class157.method1048(",Mcran)2titre charg-B", 106);

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lwm;")
    private static class152 field4160 = class157.method1048("Loading config )2 ", 112);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lwm;")
    public static class152 field4143 = field4160;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field4145;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lv;")
    public class73 field4144;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B[[B[[I[[I[[BI[[F[[F[[B[[F[[[B[[B)[Laj;", line = 5)
    public static final class1[] method1698(byte arg0, byte[][] arg1, int[][] arg2, int[][] arg3, byte[][] arg4, int arg5, float[][] arg6, float[][] arg7, byte[][] arg8, float[][] arg9, byte[][][] arg10, byte[][] arg11) {
        field4148++;
        class231 var12 = new class231(128);
        if (arg0 >= -122) {
            field4158 = 90;
        }
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg8[var13][var14] & 0xFF;
                int var16 = arg11[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class137 var17 = class314.method2194(4, var16 - 1);
                    if (var17.field2097 == -1) {
                        continue;
                    }
                    class1 var18 = class223.method1542(var17, var12, (byte) -48);
                    byte var19 = arg4[var13][var14];
                    int[] var20 = class94.field1348[var19];
                    var18.field12 += var20.length / 2;
                    var18.field6++;
                    if (var17.field2098 && var15 != 0) {
                        var18.field12 += class288.field4872[var19];
                    }
                }
                if ((arg8[var13][var14] & 0xFF) != 0 || var16 != 0 && arg4[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg11[var13][var14 + 1] & 0xFF;
                    int var28 = arg11[var13 - 1][var14] & 0xFF;
                    int var29 = arg11[var13][var14 - 1] & 0xFF;
                    int var30 = arg11[var13 + 1][var14] & 0xFF;
                    int var31 = arg11[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg11[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg11[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg11[var13 + 1][var14 - 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class137 var35 = class314.method2194(4, var31 - 1);
                        if (var35.field2098 && var35.field2097 != -1) {
                            byte var36 = arg1[var13 - 1][var14 + 1];
                            byte var37 = arg4[var13 - 1][var14 + 1];
                            int var38 = class321.field5592[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class321.field5592[(var36 + 2 & 0x3) + var37 * 4];
                            if (class37.field622[var38][1] && class37.field622[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var23 == var41) {
                                        var21[var23++] = var31;
                                        break;
                                    }
                                    if (var21[var41] == var31) {
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
                        class137 var44 = class314.method2194(4, var32 - 1);
                        if (var44.field2098 && var44.field2097 != -1) {
                            byte var45 = arg1[var13 - 1][var14 - 1];
                            byte var46 = arg4[var13 - 1][var14 - 1];
                            int var47 = class321.field5592[(var45 & 0x3) + var46 * 4];
                            int var48 = class321.field5592[(var45 + 3 & 0x3) + var46 * 4];
                            if (class37.field622[var47][1] && class37.field622[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var23 == var50) {
                                        var21[var23++] = var32;
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class137 var53 = class314.method2194(4, var34 - 1);
                        if (var53.field2098 && var53.field2097 != -1) {
                            byte var54 = arg1[var13 + 1][var14 - 1];
                            byte var55 = arg4[var13 + 1][var14 - 1];
                            int var56 = class321.field5592[var55 * 4 + (var54 & 0x3)];
                            int var57 = class321.field5592[(var54 + 1 & 0x3) + var55 * 4];
                            if (class37.field622[var57][1] && class37.field622[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var23 == var59) {
                                        var21[var23++] = var34;
                                        break;
                                    }
                                    if (var21[var59] == var34) {
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
                        class137 var62 = class314.method2194(4, var33 - 1);
                        if (var62.field2098 && var62.field2097 != -1) {
                            byte var63 = arg1[var13 + 1][var14 + 1];
                            byte var64 = arg4[var13 + 1][var14 + 1];
                            int var65 = class321.field5592[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class321.field5592[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class37.field622[var65][1] && class37.field622[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var23 == var68) {
                                        var21[var23++] = var33;
                                        break;
                                    }
                                    if (var21[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class137 var71 = class314.method2194(4, var27 - 1);
                        if (var71.field2098 && var71.field2097 != -1) {
                            var25 = class321.field5592[(arg1[var13][var14 + 1] + 2 & 0x3) + arg4[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var23 == var72) {
                                    var21[var23++] = var27;
                                    break;
                                }
                                if (var21[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class137 var73 = class314.method2194(4, var28 - 1);
                        if (var73.field2098 && var73.field2097 != -1) {
                            var22 = class321.field5592[arg4[var13 - 1][var14] * 4 + (arg1[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var23 == var74) {
                                    var21[var23++] = var28;
                                    break;
                                }
                                if (var21[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class137 var75 = class314.method2194(4, var29 - 1);
                        if (var75.field2098 && var75.field2097 != -1) {
                            var26 = class321.field5592[(arg1[var13][var14 - 1] & 0x3) + arg4[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var23 == var76) {
                                    var21[var23++] = var29;
                                    break;
                                }
                                if (var21[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class137 var77 = class314.method2194(4, var30 - 1);
                        if (var77.field2098 && var77.field2097 != -1) {
                            var24 = class321.field5592[(arg1[var13 + 1][var14] + 1 & 0x3) + arg4[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var23 == var78) {
                                    var21[var23++] = var30;
                                    break;
                                }
                                if (var21[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var23; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class37.field622[var27 == var80 ? var25 : 0];
                        boolean[] var82 = class37.field622[var29 == var80 ? var26 : 0];
                        boolean[] var83 = class37.field622[var28 == var80 ? var22 : 0];
                        boolean[] var84 = class37.field622[var30 == var80 ? var24 : 0];
                        class137 var85 = class314.method2194(4, var80 - 1);
                        class1 var86 = class223.method1542(var85, var12, (byte) -48);
                        var86.field12 += 5;
                        var86.field12 += var81.length - 2;
                        var86.field12 += var83.length - 2;
                        var86.field12 += var82.length - 2;
                        var86.field12 += var84.length - 2;
                        var86.field6++;
                    }
                }
            }
        }
        for (class1 var87 = (class1) var12.method1585(-1506054736); var87 != null; var87 = (class1) var12.method1581((byte) -52)) {
            var87.method2();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg11[var88][var89] & 0xFF;
                int var91;
                if ((arg10[arg5][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg5 > 0) {
                    var91 = arg5 - 1;
                } else {
                    var91 = arg5;
                }
                int var92 = arg8[var88][var89] & 0xFF;
                if (var90 != 0) {
                    class137 var93 = class314.method2194(4, var90 - 1);
                    if (var93.field2097 == -1) {
                        continue;
                    }
                    class1 var94 = class223.method1542(var93, var12, (byte) -48);
                    byte var95 = arg1[var88][var89];
                    byte var96 = arg4[var88][var89];
                    int var97 = class26.method216(var93.field2088, false, var93.field2097, arg2[var88][var89]);
                    int var98 = class26.method216(var93.field2088, false, var93.field2097, arg2[var88 + 1][var89]);
                    int var99 = class26.method216(var93.field2088, false, var93.field2097, arg2[var88 + 1][var89 + 1]);
                    int var100 = class26.method216(var93.field2088, false, var93.field2097, arg2[var88][var89 + 1]);
                    class232.method1598(var89, var96, arg3, (byte) -81, arg9, var98, arg6, var95, var88, var100, var94, var99, arg7, var97, var91, var92 != 0 && var93.field2098);
                }
                if ((arg8[var88][var89] & 0xFF) != 0 || var90 != 0 && arg4[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg11[var88][var89 + 1] & 0xFF;
                    int var108 = arg11[var88 - 1][var89] & 0xFF;
                    int var109 = arg11[var88][var89 - 1] & 0xFF;
                    int var110 = arg11[var88 + 1][var89] & 0xFF;
                    int var111 = arg11[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg11[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg11[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg11[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var90 == var111) {
                        var111 = 0;
                    } else {
                        class137 var115 = class314.method2194(4, var111 - 1);
                        if (var115.field2098 && var115.field2097 != -1) {
                            byte var116 = arg1[var88 - 1][var89 + 1];
                            byte var117 = arg4[var88 - 1][var89 + 1];
                            int var118 = class321.field5592[var117 * 4 + (var116 + 2 & 0x3)];
                            int var119 = class321.field5592[(var116 + 3 & 0x3) + var117 * 4];
                            if (class37.field622[var119][1] && class37.field622[var118][0]) {
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
                    if (var112 == 0 || var90 == var112) {
                        var112 = 0;
                    } else {
                        class137 var121 = class314.method2194(4, var112 - 1);
                        if (var121.field2098 && var121.field2097 != -1) {
                            byte var122 = arg1[var88 - 1][var89 - 1];
                            byte var123 = arg4[var88 - 1][var89 - 1];
                            int var124 = class321.field5592[var123 * 4 + (var122 & 0x3)];
                            int var125 = class321.field5592[(var122 + 3 & 0x3) + var123 * 4];
                            if (class37.field622[var124][1] && class37.field622[var125][0]) {
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
                    if (var113 == 0 || var90 == var113) {
                        var113 = 0;
                    } else {
                        class137 var127 = class314.method2194(4, var113 - 1);
                        if (var127.field2098 && var127.field2097 != -1) {
                            byte var128 = arg1[var88 + 1][var89 - 1];
                            byte var129 = arg4[var88 + 1][var89 - 1];
                            int var130 = class321.field5592[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class321.field5592[(var128 & 0x3) + var129 * 4];
                            if (class37.field622[var130][1] && class37.field622[var131][0]) {
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
                    if (var114 == 0 || var90 == var114) {
                        var114 = 0;
                    } else {
                        class137 var133 = class314.method2194(4, var114 - 1);
                        if (var133.field2098 && var133.field2097 != -1) {
                            byte var134 = arg1[var88 + 1][var89 + 1];
                            byte var135 = arg4[var88 + 1][var89 + 1];
                            int var136 = class321.field5592[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class321.field5592[(var134 + 1 & 0x3) + var135 * 4];
                            if (class37.field622[var136][1] && class37.field622[var137][0]) {
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
                    if (var107 != 0 && var90 != var107) {
                        class137 var139 = class314.method2194(4, var107 - 1);
                        if (var139.field2098 && var139.field2097 != -1) {
                            var104 = class321.field5592[(arg1[var88][var89 + 1] + 2 & 0x3) + arg4[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var103 == var140) {
                                    var101[var103++] = var107;
                                    break;
                                }
                                if (var101[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var90 != var108) {
                        class137 var141 = class314.method2194(4, var108 - 1);
                        if (var141.field2098 && var141.field2097 != -1) {
                            var105 = class321.field5592[(arg1[var88 - 1][var89] + 3 & 0x3) + arg4[var88 - 1][var89] * 4];
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
                    if (var109 != 0 && var90 != var109) {
                        class137 var143 = class314.method2194(4, var109 - 1);
                        if (var143.field2098 && var143.field2097 != -1) {
                            var102 = class321.field5592[(arg1[var88][var89 - 1] & 0x3) + arg4[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var103 == var144) {
                                    var101[var103++] = var109;
                                    break;
                                }
                                if (var101[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var90 != var110) {
                        class137 var145 = class314.method2194(4, var110 - 1);
                        if (var145.field2098 && var145.field2097 != -1) {
                            var106 = class321.field5592[(arg1[var88 + 1][var89] + 1 & 0x3) + arg4[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var103 == var146) {
                                    var101[var103++] = var110;
                                    break;
                                }
                                if (var101[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var103; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class37.field622[var107 == var148 ? var104 : 0];
                        boolean[] var150 = class37.field622[var109 == var148 ? var102 : 0];
                        boolean[] var151 = class37.field622[var110 == var148 ? var106 : 0];
                        boolean[] var152 = class37.field622[var108 == var148 ? var105 : 0];
                        class137 var153 = class314.method2194(4, var148 - 1);
                        class1 var154 = class223.method1542(var153, var12, (byte) -48);
                        int var155 = class26.method216(var153.field2088, false, var153.field2097, arg2[var88][var89]) << 8 | 0xFF;
                        int var156 = class26.method216(var153.field2088, false, var153.field2097, arg2[var88 + 1][var89]) << 8 | 0xFF;
                        byte var157 = 6;
                        int var158 = class26.method216(var153.field2088, false, var153.field2097, arg2[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class26.method216(var153.field2088, false, var153.field2097, arg2[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var160 = var111 != var148 && var152[0] && var149[1];
                        int var161 = var149.length + var157 - 2;
                        boolean var162 = var113 != var148 && var151[0] && var150[1];
                        boolean var163 = var112 != var148 && var150[0] && var152[1];
                        int var164 = var152.length + var161 - 2;
                        int var165 = var150.length + var164 - 2;
                        boolean var166 = var114 != var148 && var149[0] && var151[1];
                        int var167 = var151.length + var165 - 2;
                        int var168 = class167.method1104(var156, arg3, 0, true, (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 64, 64, 0.0F);
                        int[] var169 = new int[var167];
                        int var170 = class167.method1104(var156, arg3, 0, var160, (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 128, 0, 0.0F);
                        byte var171 = 0;
                        int var172 = class167.method1104(var156, arg3, 0, var166, (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 128, 128, 0.0F);
                        int var173 = class167.method1104(var156, arg3, 0, var163, (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 0, 0, 0.0F);
                        int var174 = class167.method1104(var156, arg3, 0, var162, (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 0, 128, 0.0F);
                        int var180 = var171 + 1;
                        var169[var171] = var168;
                        var169[var180++] = var172;
                        if (var149.length > 2) {
                            var169[var180++] = class167.method1104(var156, arg3, 0, var149[2], (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 128, 64, 0.0F);
                        }
                        var169[var180++] = var170;
                        if (var152.length > 2) {
                            var169[var180++] = class167.method1104(var156, arg3, 0, var152[2], (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 64, 0, 0.0F);
                        }
                        var169[var180++] = var173;
                        if (var150.length > 2) {
                            var169[var180++] = class167.method1104(var156, arg3, 0, var150[2], (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 0, 64, 0.0F);
                        }
                        var169[var180++] = var174;
                        if (var151.length > 2) {
                            var169[var180++] = class167.method1104(var156, arg3, 0, var151[2], (int[][]) null, var154, var88, (byte) 4, var159, arg9, arg7, var89, var158, arg6, var155, 64, 128, 0.0F);
                        }
                        var169[var180++] = var172;
                        var154.method7(var91, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        for (class1 var175 = (class1) var12.method1585(-1506054736); var175 != null; var175 = (class1) var12.method1581((byte) 104)) {
            if (var175.field1 == 0) {
                var175.method1880(-25368);
            } else {
                var175.method4();
            }
        }
        int var176 = var12.method1582(-18869);
        long[] var177 = new long[var176];
        class1[] var178 = new class1[var176];
        var12.method1583(var178, (byte) 88);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field4689;
        }
        class117.method769(127, var177, var178);
        return var178;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZII)V", line = 943)
    public static final void method1699(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4140++;
        if (class197.method1315(71, arg0)) {
            class50.method347(class215.field3501[arg0], arg4, arg2, arg1 ^ arg1, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ldd;II)V", line = 955)
    public static final void method1700(class249 arg0, int arg1, int arg2) {
        field4146++;
        if (class142.field2187 < arg0.field4267) {
            class156.method1039(arg0, arg1 ^ 0x29B0);
        } else if (arg0.field4212 >= class142.field2187) {
            class94.method619(arg0, -79);
        } else {
            class58.method385(arg0, 0);
        }
        if (arg0.field4162 < 128 || arg0.field4231 < 128 || arg0.field4162 >= 13184 || arg0.field4231 >= 13184) {
            arg0.field4212 = 0;
            arg0.field4182 = -1;
            arg0.field4240 = -1;
            arg0.field4267 = 0;
            arg0.field4162 = arg0.field4188[0] * 128 + arg0.method67(-4391) * 64;
            arg0.field4231 = arg0.field4245[0] * 128 + arg0.method67(arg1 - 15089) * 64;
            arg0.method1704(arg1 ^ 0xFFFFE593);
        }
        if (class85.field1176 == arg0 && (arg0.field4162 < 1536 || arg0.field4231 < 1536 || arg0.field4162 >= 11776 || arg0.field4231 >= 11776)) {
            arg0.field4212 = 0;
            arg0.field4240 = -1;
            arg0.field4267 = 0;
            arg0.field4182 = -1;
            arg0.field4162 = arg0.field4188[0] * 128 + arg0.method67(-4391) * 64;
            arg0.field4231 = arg0.field4245[0] * 128 + arg0.method67(-4391) * 64;
            arg0.method1704(-13223);
        }
        class243.method1665(arg0, 0);
        class199.method1331(arg0, -39);
        if (arg1 != 10698) {
            method1701(16);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 1022)
    public static void method1701(int arg0) {
        field4160 = null;
        field4143 = null;
        if (arg0 != -1) {
            method1699(-90, 28, false, -49, -67);
        }
        field4142 = null;
    }
}
