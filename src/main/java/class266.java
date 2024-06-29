import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class266 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[Loj;")
    public static class283[] field4112;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([[B[[F[[B[[F[[BI[[FB[[I[[[B[[I[[B)[Lml;", line = 7)
    public static final class16[] method1767(byte[][] arg0, float[][] arg1, byte[][] arg2, float[][] arg3, byte[][] arg4, int arg5, float[][] arg6, byte arg7, int[][] arg8, byte[][][] arg9, int[][] arg10, byte[][] arg11) {
        field4111++;
        class39 var12 = new class39(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg4[var13][var14] & 0xFF;
                int var16 = arg2[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class101 var17 = class194.method1241(var16 - 1, false);
                    if (var17.field1765 == -1) {
                        continue;
                    }
                    class16 var18 = class202.method1338(-26586, var12, var17);
                    byte var19 = arg11[var13][var14];
                    int[] var20 = class81.field1577[var19];
                    var18.field293 += var20.length / 2;
                    var18.field284++;
                    if (var17.field1774 && var15 != 0) {
                        var18.field293 += class342.field5318[var19];
                    }
                }
                if ((arg4[var13][var14] & 0xFF) != 0 || var16 != 0 && arg11[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg2[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg2[var13 - 1][var14] & 0xFF;
                    int var29 = arg2[var13 + 1][var14] & 0xFF;
                    int var30 = arg2[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg2[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg2[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg2[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg2[var13][var14 - 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class101 var35 = class194.method1241(var30 - 1, false);
                        if (var35.field1774 && var35.field1765 != -1) {
                            byte var36 = arg0[var13 - 1][var14 + 1];
                            byte var37 = arg11[var13 - 1][var14 + 1];
                            int var38 = class199.field3180[var37 * 4 + (var36 + 3 & 0x3)];
                            int var39 = class199.field3180[(var36 + 2 & 0x3) + var37 * 4];
                            if (class48.field998[var38][1] && class48.field998[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var23[var21++] = var30;
                                        break;
                                    }
                                    if (var23[var41] == var30) {
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
                        class101 var44 = class194.method1241(var31 - 1, false);
                        if (var44.field1774 && var44.field1765 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg11[var13 - 1][var14 - 1];
                            int var47 = class199.field3180[(var45 & 0x3) + var46 * 4];
                            int var48 = class199.field3180[(var45 + 3 & 0x3) + var46 * 4];
                            if (class48.field998[var47][1] && class48.field998[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var23[var21++] = var31;
                                        break;
                                    }
                                    if (var23[var50] == var31) {
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
                        class101 var53 = class194.method1241(var32 - 1, false);
                        if (var53.field1774 && var53.field1765 != -1) {
                            byte var54 = arg0[var13 + 1][var14 - 1];
                            byte var55 = arg11[var13 + 1][var14 - 1];
                            int var56 = class199.field3180[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class199.field3180[var55 * 4 + (var54 & 0x3)];
                            if (class48.field998[var56][1] && class48.field998[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var23[var21++] = var32;
                                        break;
                                    }
                                    if (var23[var59] == var32) {
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
                        class101 var62 = class194.method1241(var33 - 1, false);
                        if (var62.field1774 && var62.field1765 != -1) {
                            byte var63 = arg0[var13 + 1][var14 + 1];
                            byte var64 = arg11[var13 + 1][var14 + 1];
                            int var65 = class199.field3180[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class199.field3180[(var63 + 2 & 0x3) + var64 * 4];
                            if (class48.field998[var66][1] && class48.field998[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var23[var21++] = var33;
                                        break;
                                    }
                                    if (var23[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class101 var71 = class194.method1241(var26 - 1, false);
                        if (var71.field1774 && var71.field1765 != -1) {
                            var22 = class199.field3180[arg11[var13][var14 + 1] * 4 + (arg0[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var23[var21++] = var26;
                                    break;
                                }
                                if (var23[var72] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class101 var73 = class194.method1241(var28 - 1, false);
                        if (var73.field1774 && var73.field1765 != -1) {
                            var24 = class199.field3180[(arg0[var13 - 1][var14] + 3 & 0x3) + arg11[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var23[var21++] = var28;
                                    break;
                                }
                                if (var23[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var34 != 0 && var16 != var34) {
                        class101 var75 = class194.method1241(var34 - 1, false);
                        if (var75.field1774 && var75.field1765 != -1) {
                            var27 = class199.field3180[arg11[var13][var14 - 1] * 4 + (arg0[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var23[var21++] = var34;
                                    break;
                                }
                                if (var23[var76] == var34) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class101 var77 = class194.method1241(var29 - 1, false);
                        if (var77.field1774 && var77.field1765 != -1) {
                            var25 = class199.field3180[arg11[var13 + 1][var14] * 4 + (arg0[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var23[var21++] = var29;
                                    break;
                                }
                                if (var23[var78] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var23[var79];
                        boolean[] var81 = class48.field998[var26 == var80 ? var22 : 0];
                        boolean[] var82 = class48.field998[var28 == var80 ? var24 : 0];
                        boolean[] var83 = class48.field998[var34 == var80 ? var27 : 0];
                        boolean[] var84 = class48.field998[var29 == var80 ? var25 : 0];
                        class101 var85 = class194.method1241(var80 - 1, false);
                        class16 var86 = class202.method1338(-26586, var12, var85);
                        var86.field293 += 5;
                        var86.field293 += var81.length - 2;
                        var86.field293 += var82.length - 2;
                        var86.field293 += var83.length - 2;
                        var86.field293 += var84.length - 2;
                        var86.field284++;
                    }
                }
            }
        }
        for (class16 var87 = (class16) var12.method306(0); var87 != null; var87 = (class16) var12.method300(1)) {
            var87.method114();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg9[arg5][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg9[1][var88][var89] & 0x2) == 2 && arg5 > 0) {
                    var90 = arg5 - 1;
                } else {
                    var90 = arg5;
                }
                int var91 = arg4[var88][var89] & 0xFF;
                int var92 = arg2[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class101 var93 = class194.method1241(var92 - 1, false);
                    if (var93.field1765 == -1) {
                        continue;
                    }
                    class16 var94 = class202.method1338(-26586, var12, var93);
                    byte var95 = arg11[var88][var89];
                    byte var96 = arg0[var88][var89];
                    int var97 = class174.method1095(var93.field1765, arg10[var88][var89], 14327, var93.field1762);
                    int var98 = class174.method1095(var93.field1765, arg10[var88 + 1][var89], 14327, var93.field1762);
                    int var99 = class174.method1095(var93.field1765, arg10[var88 + 1][var89 + 1], 14327, var93.field1762);
                    int var100 = class174.method1095(var93.field1765, arg10[var88][var89 + 1], 14327, var93.field1762);
                    class56.method434(var90, arg8, var96, var89, arg1, var88, arg3, var94, var97, arg6, var99, var98, var91 != 0 && var93.field1774, (byte) 88, var100, var95);
                }
                if ((arg4[var88][var89] & 0xFF) != 0 || var92 != 0 && arg11[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg2[var88][var89 + 1] & 0xFF;
                    int var107 = 0;
                    int var108 = arg2[var88 - 1][var89] & 0xFF;
                    int var109 = arg2[var88][var89 - 1] & 0xFF;
                    int var110 = arg2[var88 + 1][var89] & 0xFF;
                    int var111 = arg2[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg2[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg2[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg2[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class101 var115 = class194.method1241(var111 - 1, false);
                        if (var115.field1774 && var115.field1765 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg11[var88 - 1][var89 + 1];
                            int var118 = class199.field3180[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class199.field3180[var117 * 4 + (var116 + 2 & 0x3)];
                            if (class48.field998[var118][1] && class48.field998[var119][0]) {
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
                        class101 var121 = class194.method1241(var112 - 1, false);
                        if (var121.field1774 && var121.field1765 != -1) {
                            byte var122 = arg11[var88 - 1][var89 - 1];
                            byte var123 = arg0[var88 - 1][var89 - 1];
                            int var124 = class199.field3180[(var123 + 3 & 0x3) + var122 * 4];
                            int var125 = class199.field3180[(var123 & 0x3) + var122 * 4];
                            if (class48.field998[var125][1] && class48.field998[var124][0]) {
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
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class101 var127 = class194.method1241(var113 - 1, false);
                        if (var127.field1774 && var127.field1765 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg11[var88 + 1][var89 - 1];
                            int var130 = class199.field3180[(var128 & 0x3) + var129 * 4];
                            int var131 = class199.field3180[var129 * 4 + (var128 + 1 & 0x3)];
                            if (class48.field998[var131][1] && class48.field998[var130][0]) {
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
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class101 var133 = class194.method1241(var114 - 1, false);
                        if (var133.field1774 && var133.field1765 != -1) {
                            byte var134 = arg0[var88 + 1][var89 + 1];
                            byte var135 = arg11[var88 + 1][var89 + 1];
                            int var136 = class199.field3180[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class199.field3180[var135 * 4 + (var134 + 2 & 0x3)];
                            if (class48.field998[var137][1] && class48.field998[var136][0]) {
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
                    if (var106 != 0 && var92 != var106) {
                        class101 var139 = class194.method1241(var106 - 1, false);
                        if (var139.field1774 && var139.field1765 != -1) {
                            var103 = class199.field3180[(arg0[var88][var89 + 1] + 2 & 0x3) + arg11[var88][var89 + 1] * 4];
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
                    if (var108 != 0 && var92 != var108) {
                        class101 var141 = class194.method1241(var108 - 1, false);
                        if (var141.field1774 && var141.field1765 != -1) {
                            var104 = class199.field3180[(arg0[var88 - 1][var89] + 3 & 0x3) + arg11[var88 - 1][var89] * 4];
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
                        class101 var143 = class194.method1241(var109 - 1, false);
                        if (var143.field1774 && var143.field1765 != -1) {
                            var105 = class199.field3180[(arg0[var88][var89 - 1] & 0x3) + arg11[var88][var89 - 1] * 4];
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
                        class101 var145 = class194.method1241(var110 - 1, false);
                        if (var145.field1774 && var145.field1765 != -1) {
                            var107 = class199.field3180[(arg0[var88 + 1][var89] + 1 & 0x3) + arg11[var88 + 1][var89] * 4];
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
                        boolean[] var149 = class48.field998[var106 == var148 ? var103 : 0];
                        boolean[] var150 = class48.field998[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class48.field998[var110 == var148 ? var107 : 0];
                        boolean[] var152 = class48.field998[var109 == var148 ? var105 : 0];
                        class101 var153 = class194.method1241(var148 - 1, false);
                        byte var154 = 6;
                        class16 var155 = class202.method1338(-26586, var12, var153);
                        int var156 = class174.method1095(var153.field1765, arg10[var88][var89], 14327, var153.field1762) << 8 | 0xFF;
                        int var157 = class174.method1095(var153.field1765, arg10[var88 + 1][var89], 14327, var153.field1762) << 8 | 0xFF;
                        int var158 = class174.method1095(var153.field1765, arg10[var88 + 1][var89 + 1], 14327, var153.field1762) << 8 | 0xFF;
                        int var159 = class174.method1095(var153.field1765, arg10[var88][var89 + 1], 14327, var153.field1762) << 8 | 0xFF;
                        boolean var160 = var114 != var148 && var149[0] && var151[1];
                        boolean var161 = var111 != var148 && var150[0] && var149[1];
                        int var162 = var149.length + var154 - 2;
                        int var163 = var150.length + var162 - 2;
                        int var164 = var152.length + var163 - 2;
                        boolean var165 = var113 != var148 && var151[0] && var152[1];
                        boolean var166 = var112 != var148 && var152[0] && var150[1];
                        int var167 = var151.length + var164 - 2;
                        int[] var168 = new int[var167];
                        byte var169 = 0;
                        int var170 = class225.method1491(var88, var157, arg3, 64, var159, var89, arg1, 64, 0.0F, 256, true, arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        int var171 = class225.method1491(var88, var157, arg3, 128, var159, var89, arg1, 0, 0.0F, 256, var161, arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        int var172 = class225.method1491(var88, var157, arg3, 128, var159, var89, arg1, 128, 0.0F, 256, var160, arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        int var173 = class225.method1491(var88, var157, arg3, 0, var159, var89, arg1, 0, 0.0F, 256, var166, arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        int var174 = class225.method1491(var88, var157, arg3, 0, var159, var89, arg1, 128, 0.0F, 256, var165, arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        int var181 = var169 + 1;
                        var168[var169] = var170;
                        var168[var181++] = var172;
                        if (var149.length > 2) {
                            var168[var181++] = class225.method1491(var88, var157, arg3, 128, var159, var89, arg1, 64, 0.0F, 256, var149[2], arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        }
                        var168[var181++] = var171;
                        if (var150.length > 2) {
                            var168[var181++] = class225.method1491(var88, var157, arg3, 64, var159, var89, arg1, 0, 0.0F, 256, var150[2], arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        }
                        var168[var181++] = var173;
                        if (var152.length > 2) {
                            var168[var181++] = class225.method1491(var88, var157, arg3, 0, var159, var89, arg1, 64, 0.0F, 256, var152[2], arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        }
                        var168[var181++] = var174;
                        if (var151.length > 2) {
                            var168[var181++] = class225.method1491(var88, var157, arg3, 64, var159, var89, arg1, 128, 0.0F, 256, var151[2], arg8, var158, var156, arg6, (int[][]) null, var155, 0);
                        }
                        var168[var181++] = var172;
                        var155.method116(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class16 var175 = (class16) var12.method306(0); var175 != null; var175 = (class16) var12.method300(1)) {
            if (var175.field287 == 0) {
                var175.method278((byte) -105);
            } else {
                var175.method120();
            }
        }
        int var176 = var12.method304(-109);
        class16[] var177 = new class16[var176];
        int var178 = -13 / ((arg7 + 70) / 53);
        var12.method301((byte) 42, var177);
        long[] var179 = new long[var176];
        for (int var180 = 0; var180 < var176; var180++) {
            var179[var180] = var177[var180].field702;
        }
        class200.method1280(var177, 2, var179);
        return var177;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 945)
    public static final int method1768(int arg0, int arg1) {
        int var2 = 23 % ((arg1 - 13) / 49);
        field4109++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 956)
    public static void method1769(boolean arg0) {
        if (!arg0) {
            method1767((byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), 34, (float[][]) ((float[][]) null), (byte) 97, (int[][]) ((int[][]) null), (byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null));
        }
        field4112 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lbm;I)V", line = 968)
    public static final void method1770(class307 arg0, int arg1) {
        class158.field2588 = arg0;
        if (arg1 != 0) {
            field4113 = 16;
        }
        field4114++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lte;Ljava/awt/Frame;Z)V", line = 980)
    public static final void method1771(class124 arg0, Frame arg1, boolean arg2) {
        field4110++;
        while (true) {
            class107 var3 = arg0.method809(2, arg1);
            while (var3.field1852 == 0) {
                class127.method843(-29, 10L);
            }
            if (var3.field1852 == 1) {
                if (!arg2) {
                    return;
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class127.method843(-101, 100L);
        }
    }
}
