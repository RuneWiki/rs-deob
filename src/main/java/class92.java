import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class92 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lhi;")
    private static class82 field1646 = class95.method664((byte) -62, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lhi;")
    public static class82 field1644 = field1646;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lhi;")
    public static class82 field1649 = class95.method664((byte) -100, "gr-Un:");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[I")
    public static int[] field1650 = new int[128];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 22)
    public static void method649(byte arg0) {
        if (arg0 != 107) {
            method649((byte) 63);
        }
        field1649 = null;
        field1646 = null;
        field1644 = null;
        field1650 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([[I[[B[[F[[FI[[B[[B[[B[[FI[[[B[[I)[Luk;", line = 39)
    public static final class108[] method650(int[][] arg0, byte[][] arg1, float[][] arg2, float[][] arg3, int arg4, byte[][] arg5, byte[][] arg6, byte[][] arg7, float[][] arg8, int arg9, byte[][][] arg10, int[][] arg11) {
        field1642++;
        class79 var12 = new class79(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg5[var13][var14] & 0xFF;
                int var16 = arg7[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class305 var17 = class286.method1984(var16 - 1, arg4 ^ 0x1496);
                    if (var17.field5168 == -1) {
                        continue;
                    }
                    class108 var18 = class19.method132(var12, var17, true);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class193.field3283[var19];
                    var18.field1924 += var20.length / 2;
                    var18.field1910++;
                    if (var17.field5177 && var15 != 0) {
                        var18.field1924 += class231.field3979[var19];
                    }
                }
                if ((arg5[var13][var14] & 0xFF) != 0 || var16 != 0 && arg1[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg7[var13][var14 + 1] & 0xFF;
                    int var28 = arg7[var13 - 1][var14] & 0xFF;
                    int var29 = arg7[var13][var14 - 1] & 0xFF;
                    int var30 = arg7[var13 + 1][var14] & 0xFF;
                    int var31 = arg7[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg7[var13 + 1][var14 + 1] & 0xFF;
                    int var33 = arg7[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg7[var13 - 1][var14 - 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class305 var35 = class286.method1984(var31 - 1, 5269);
                        if (var35.field5177 && var35.field5168 != -1) {
                            byte var36 = arg6[var13 - 1][var14 + 1];
                            byte var37 = arg1[var13 - 1][var14 + 1];
                            int var38 = class37.field620[var37 * 4 + (var36 + 3 & 0x3)];
                            int var39 = class37.field620[(var36 + 2 & 0x3) + var37 * 4];
                            if (class153.field2595[var38][1] && class153.field2595[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var22 == var41) {
                                        var21[var22++] = var31;
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var52 = false;
                    } else {
                        class305 var44 = class286.method1984(var34 - 1, 5269);
                        if (var44.field5177 && var44.field5168 != -1) {
                            byte var45 = arg6[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class37.field620[var46 * 4 + (var45 & 0x3)];
                            int var48 = class37.field620[(var45 + 3 & 0x3) + var46 * 4];
                            if (class153.field2595[var47][1] && class153.field2595[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var21[var22++] = var34;
                                        break;
                                    }
                                    if (var21[var50] == var34) {
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
                        class305 var53 = class286.method1984(var33 - 1, arg4 + 5266);
                        if (var53.field5177 && var53.field5168 != -1) {
                            byte var54 = arg6[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class37.field620[var55 * 4 + (var54 + 1 & 0x3)];
                            int var57 = class37.field620[(var54 & 0x3) + var55 * 4];
                            if (class153.field2595[var56][1] && class153.field2595[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var22 == var59) {
                                        var21[var22++] = var33;
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
                    if (var32 == 0 || var16 == var32) {
                        boolean var70 = false;
                    } else {
                        class305 var62 = class286.method1984(var32 - 1, arg4 ^ 0x1496);
                        if (var62.field5177 && var62.field5168 != -1) {
                            byte var63 = arg6[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class37.field620[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class37.field620[(var63 + 2 & 0x3) + var64 * 4];
                            if (class153.field2595[var66][1] && class153.field2595[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var22 == var68) {
                                        var21[var22++] = var32;
                                        break;
                                    }
                                    if (var21[var68] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class305 var71 = class286.method1984(var27 - 1, arg4 ^ 0x1496);
                        if (var71.field5177 && var71.field5168 != -1) {
                            var23 = class37.field620[(arg6[var13][var14 + 1] + 2 & 0x3) + arg1[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var22 == var72) {
                                    var21[var22++] = var27;
                                    break;
                                }
                                if (var21[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class305 var73 = class286.method1984(var28 - 1, 5269);
                        if (var73.field5177 && var73.field5168 != -1) {
                            var24 = class37.field620[(arg6[var13 - 1][var14] + 3 & 0x3) + arg1[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var21[var22++] = var28;
                                    break;
                                }
                                if (var21[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class305 var75 = class286.method1984(var29 - 1, 5269);
                        if (var75.field5177 && var75.field5168 != -1) {
                            var25 = class37.field620[(arg6[var13][var14 - 1] & 0x3) + arg1[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var22 == var76) {
                                    var21[var22++] = var29;
                                    break;
                                }
                                if (var21[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class305 var77 = class286.method1984(var30 - 1, 5269);
                        if (var77.field5177 && var77.field5168 != -1) {
                            var26 = class37.field620[(arg6[var13 + 1][var14] + 1 & 0x3) + arg1[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var21[var22++] = var30;
                                    break;
                                }
                                if (var21[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class153.field2595[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class153.field2595[var29 == var80 ? var25 : 0];
                        boolean[] var83 = class153.field2595[var28 == var80 ? var24 : 0];
                        boolean[] var84 = class153.field2595[var30 == var80 ? var26 : 0];
                        class305 var85 = class286.method1984(var80 - 1, 5269);
                        class108 var86 = class19.method132(var12, var85, true);
                        var86.field1924 += 5;
                        var86.field1924 += var81.length - 2;
                        var86.field1924 += var83.length - 2;
                        var86.field1924 += var82.length - 2;
                        var86.field1924 += var84.length - 2;
                        var86.field1910++;
                    }
                }
            }
        }
        for (class108 var87 = (class108) var12.method502((byte) -104); var87 != null; var87 = (class108) var12.method494(true)) {
            var87.method737();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg10[arg9][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg9 > 0) {
                    var90 = arg9 - 1;
                } else {
                    var90 = arg9;
                }
                int var91 = arg5[var88][var89] & 0xFF;
                int var92 = arg7[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class305 var93 = class286.method1984(var92 - 1, 5269);
                    if (var93.field5168 == -1) {
                        continue;
                    }
                    class108 var94 = class19.method132(var12, var93, true);
                    byte var95 = arg1[var88][var89];
                    byte var96 = arg6[var88][var89];
                    int var97 = class29.method183(true, var93.field5173, var93.field5168, arg11[var88][var89]);
                    int var98 = class29.method183(true, var93.field5173, var93.field5168, arg11[var88 + 1][var89]);
                    int var99 = class29.method183(true, var93.field5173, var93.field5168, arg11[var88 + 1][var89 + 1]);
                    int var100 = class29.method183(true, var93.field5173, var93.field5168, arg11[var88][var89 + 1]);
                    class279.method1948(var90, arg8, arg2, var89, var97, var95, var91 != 0 && var93.field5177, arg0, arg3, var96, var94, var88, arg4 ^ 0x40A, var99, var100, var98);
                }
                if ((arg5[var88][var89] & 0xFF) != 0 || var92 != 0 && arg1[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg7[var88][var89 + 1] & 0xFF;
                    int var108 = arg7[var88 - 1][var89] & 0xFF;
                    int var109 = arg7[var88][var89 - 1] & 0xFF;
                    int var110 = arg7[var88 + 1][var89] & 0xFF;
                    int var111 = arg7[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg7[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg7[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg7[var88 + 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class305 var115 = class286.method1984(var111 - 1, arg4 + 5266);
                        if (var115.field5177 && var115.field5168 != -1) {
                            byte var116 = arg6[var88 - 1][var89 + 1];
                            byte var117 = arg1[var88 - 1][var89 + 1];
                            int var118 = class37.field620[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class37.field620[(var116 + 3 & 0x3) + var117 * 4];
                            if (class153.field2595[var119][1] && class153.field2595[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var120] == var111) {
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
                        class305 var121 = class286.method1984(var112 - 1, 5269);
                        if (var121.field5177 && var121.field5168 != -1) {
                            byte var122 = arg6[var88 - 1][var89 - 1];
                            byte var123 = arg1[var88 - 1][var89 - 1];
                            int var124 = class37.field620[(var122 & 0x3) + var123 * 4];
                            int var125 = class37.field620[(var122 + 3 & 0x3) + var123 * 4];
                            if (class153.field2595[var124][1] && class153.field2595[var125][0]) {
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
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class305 var127 = class286.method1984(var114 - 1, arg4 ^ 0x1496);
                        if (var127.field5177 && var127.field5168 != -1) {
                            byte var128 = arg1[var88 + 1][var89 - 1];
                            byte var129 = arg6[var88 + 1][var89 - 1];
                            int var130 = class37.field620[var128 * 4 + (var129 & 0x3)];
                            int var131 = class37.field620[(var129 + 1 & 0x3) + var128 * 4];
                            if (class153.field2595[var131][1] && class153.field2595[var130][0]) {
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
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class305 var133 = class286.method1984(var113 - 1, 5269);
                        if (var133.field5177 && var133.field5168 != -1) {
                            byte var134 = arg6[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class37.field620[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class37.field620[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class153.field2595[var136][1] && class153.field2595[var137][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class305 var139 = class286.method1984(var107 - 1, arg4 ^ 0x1496);
                        if (var139.field5177 && var139.field5168 != -1) {
                            var104 = class37.field620[arg1[var88][var89 + 1] * 4 + (arg6[var88][var89 + 1] + 2 & 0x3)];
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
                    if (var108 != 0 && var92 != var108) {
                        class305 var141 = class286.method1984(var108 - 1, 5269);
                        if (var141.field5177 && var141.field5168 != -1) {
                            var103 = class37.field620[arg1[var88 - 1][var89] * 4 + (arg6[var88 - 1][var89] + 3 & 0x3)];
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
                    if (var109 != 0 && var92 != var109) {
                        class305 var143 = class286.method1984(var109 - 1, 5269);
                        if (var143.field5177 && var143.field5168 != -1) {
                            var105 = class37.field620[(arg6[var88][var89 - 1] & 0x3) + arg1[var88][var89 - 1] * 4];
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
                    if (var110 != 0 && var92 != var110) {
                        class305 var145 = class286.method1984(var110 - 1, 5269);
                        if (var145.field5177 && var145.field5168 != -1) {
                            var106 = class37.field620[(arg6[var88 + 1][var89] + 1 & 0x3) + arg1[var88 + 1][var89] * 4];
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
                        boolean[] var149 = class153.field2595[var107 == var148 ? var104 : 0];
                        boolean[] var150 = class153.field2595[var109 == var148 ? var105 : 0];
                        boolean[] var151 = class153.field2595[var108 == var148 ? var103 : 0];
                        boolean[] var152 = class153.field2595[var110 == var148 ? var106 : 0];
                        class305 var153 = class286.method1984(var148 - 1, 5269);
                        class108 var154 = class19.method132(var12, var153, true);
                        int var155 = class29.method183(true, var153.field5173, var153.field5168, arg11[var88][var89]) << 8 | 0xFF;
                        int var156 = class29.method183(true, var153.field5173, var153.field5168, arg11[var88 + 1][var89]) << 8 | 0xFF;
                        byte var157 = 6;
                        int var158 = class29.method183(true, var153.field5173, var153.field5168, arg11[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class29.method183(true, var153.field5173, var153.field5168, arg11[var88][var89 + 1]) << 8 | 0xFF;
                        int var160 = var149.length + var157 - 2;
                        int var161 = var151.length + var160 - 2;
                        int var162 = var150.length + var161 - 2;
                        boolean var163 = var111 != var148 && var151[0] && var149[1];
                        int var164 = var152.length + var162 - 2;
                        boolean var165 = var114 != var148 && var152[0] && var150[1];
                        int[] var166 = new int[var164];
                        boolean var167 = var112 != var148 && var150[0] && var151[1];
                        boolean var168 = var113 != var148 && var149[0] && var152[1];
                        int var169 = class87.method610(var156, arg0, true, var158, 0.0F, 64, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 64, -122, 0, var154, var88);
                        int var170 = class87.method610(var156, arg0, var163, var158, 0.0F, 128, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 0, -123, 0, var154, var88);
                        int var171 = class87.method610(var156, arg0, var168, var158, 0.0F, 128, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 128, -128, 0, var154, var88);
                        int var172 = class87.method610(var156, arg0, var167, var158, 0.0F, 0, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 0, -126, 0, var154, var88);
                        byte var173 = 0;
                        int var174 = class87.method610(var156, arg0, var165, var158, 0.0F, 0, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 128, -116, 0, var154, var88);
                        int var180 = var173 + 1;
                        var166[var173] = var169;
                        var166[var180++] = var171;
                        if (var149.length > 2) {
                            var166[var180++] = class87.method610(var156, arg0, var149[2], var158, 0.0F, 128, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 64, -127, 0, var154, var88);
                        }
                        var166[var180++] = var170;
                        if (var151.length > 2) {
                            var166[var180++] = class87.method610(var156, arg0, var151[2], var158, 0.0F, 64, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 0, -126, 0, var154, var88);
                        }
                        var166[var180++] = var172;
                        if (var150.length > 2) {
                            var166[var180++] = class87.method610(var156, arg0, var150[2], var158, 0.0F, 0, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 64, -126, 0, var154, var88);
                        }
                        var166[var180++] = var174;
                        if (var152.length > 2) {
                            var166[var180++] = class87.method610(var156, arg0, var152[2], var158, 0.0F, 64, var159, arg3, var89, arg8, var155, (int[][]) null, arg2, 128, arg4 - 123, 0, var154, var88);
                        }
                        var166[var180++] = var171;
                        var154.method740(var90, var88, var89, var166, (int[]) null, true);
                    }
                }
            }
        }
        for (class108 var175 = (class108) var12.method502((byte) -104); var175 != null; var175 = (class108) var12.method494(true)) {
            if (var175.field1907 == 0) {
                var175.method961((byte) 113);
            } else {
                var175.method742();
            }
        }
        if (arg4 != 3) {
            method649((byte) 113);
        }
        int var176 = var12.method500(-5);
        class108[] var177 = new class108[var176];
        var12.method495(4, var177);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field2418;
        }
        class156.method1115(var178, var177, (byte) 127);
        return var177;
    }
}
