import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class345 {

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lqm;")
    public class259 field5476 = new class259();

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
    public static volatile boolean field5475 = false;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field5482 = -1;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lnk;")
    public static class16 field5469;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lnk;")
    public static class16 field5473;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lqm;")
    private class259 field5480;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[[[Lgj;")
    public static class257[][][] field5472;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lqm;", line = 14)
    public final class259 method2392(byte arg0) {
        if (arg0 != -22) {
            return (class259) null;
        }
        class259 var2 = this.field5480;
        field5474++;
        if (this.field5476 == var2) {
            this.field5480 = null;
            return null;
        } else {
            this.field5480 = var2.field4098;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 44)
    public final void method2393(int arg0) {
        while (true) {
            class259 var2 = this.field5476.field4098;
            if (this.field5476 == var2) {
                int var3 = -121 / ((arg0 - 30) / 60);
                this.field5480 = null;
                field5481++;
                return;
            }
            var2.method1829((byte) -74);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[[B[[FB[[I[[F[[F[[II[[B[[B[[B[[B)[Lwb;", line = 64)
    public static final class175[] method2394(byte[][][] arg0, float[][] arg1, byte arg2, int[][] arg3, float[][] arg4, float[][] arg5, int[][] arg6, int arg7, byte[][] arg8, byte[][] arg9, byte[][] arg10, byte[][] arg11) {
        field5471++;
        class117 var12 = new class117(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg11[var13][var14] & 0xFF;
                int var16 = arg10[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class146 var17 = class348.method2412(true, var16 - 1);
                    if (var17.field2328 == -1) {
                        continue;
                    }
                    class175 var18 = class346.method2401(var12, var17, arg2 ^ 0x3F);
                    byte var19 = arg8[var13][var14];
                    int[] var20 = class279.field4400[var19];
                    var18.field2661 += var20.length / 2;
                    var18.field2649++;
                    if (var17.field2311 && var15 != 0) {
                        var18.field2661 += class230.field3482[var19];
                    }
                }
                if ((arg11[var13][var14] & 0xFF) != 0 || var16 != 0 && arg8[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg10[var13 - 1][var14] & 0xFF;
                    int var28 = arg10[var13][var14 + 1] & 0xFF;
                    int var29 = arg10[var13][var14 - 1] & 0xFF;
                    int var30 = arg10[var13 + 1][var14] & 0xFF;
                    int var31 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class146 var35 = class348.method2412(true, var31 - 1);
                        if (var35.field2311 && var35.field2328 != -1) {
                            byte var36 = arg8[var13 - 1][var14 + 1];
                            byte var37 = arg9[var13 - 1][var14 + 1];
                            int var38 = class35.field406[var36 * 4 + (var37 + 3 & 0x3)];
                            int var39 = class35.field406[(var37 + 2 & 0x3) + var36 * 4];
                            if (class207.field3140[var38][1] && class207.field3140[var39][0]) {
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
                        class146 var44 = class348.method2412(true, var32 - 1);
                        if (var44.field2311 && var44.field2328 != -1) {
                            byte var45 = arg9[var13 - 1][var14 - 1];
                            byte var46 = arg8[var13 - 1][var14 - 1];
                            int var47 = class35.field406[var46 * 4 + (var45 & 0x3)];
                            int var48 = class35.field406[(var45 + 3 & 0x3) + var46 * 4];
                            if (class207.field3140[var47][1] && class207.field3140[var48][0]) {
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
                        class146 var53 = class348.method2412(true, var33 - 1);
                        if (var53.field2311 && var53.field2328 != -1) {
                            byte var54 = arg9[var13 + 1][var14 - 1];
                            byte var55 = arg8[var13 + 1][var14 - 1];
                            int var56 = class35.field406[var55 * 4 + (var54 & 0x3)];
                            int var57 = class35.field406[(var54 + 1 & 0x3) + var55 * 4];
                            if (class207.field3140[var57][1] && class207.field3140[var56][0]) {
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
                        class146 var62 = class348.method2412(true, var34 - 1);
                        if (var62.field2311 && var62.field2328 != -1) {
                            byte var63 = arg9[var13 + 1][var14 + 1];
                            byte var64 = arg8[var13 + 1][var14 + 1];
                            int var65 = class35.field406[var64 * 4 + (var63 + 2 & 0x3)];
                            int var66 = class35.field406[(var63 + 1 & 0x3) + var64 * 4];
                            if (class207.field3140[var65][1] && class207.field3140[var66][0]) {
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
                        class146 var71 = class348.method2412(true, var28 - 1);
                        if (var71.field2311 && var71.field2328 != -1) {
                            var22 = class35.field406[(arg9[var13][var14 + 1] + 2 & 0x3) + arg8[var13][var14 + 1] * 4];
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
                    if (var27 != 0 && var16 != var27) {
                        class146 var73 = class348.method2412(true, var27 - 1);
                        if (var73.field2311 && var73.field2328 != -1) {
                            var24 = class35.field406[(arg9[var13 - 1][var14] + 3 & 0x3) + arg8[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var23[var21++] = var27;
                                    break;
                                }
                                if (var23[var74] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class146 var75 = class348.method2412(true, var29 - 1);
                        if (var75.field2311 && var75.field2328 != -1) {
                            var25 = class35.field406[(arg9[var13][var14 - 1] & 0x3) + arg8[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var23[var21++] = var29;
                                    break;
                                }
                                if (var23[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class146 var77 = class348.method2412(true, var30 - 1);
                        if (var77.field2311 && var77.field2328 != -1) {
                            var26 = class35.field406[(arg9[var13 + 1][var14] + 1 & 0x3) + arg8[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class207.field3140[var28 == var80 ? var22 : 0];
                        boolean[] var82 = class207.field3140[var27 == var80 ? var24 : 0];
                        boolean[] var83 = class207.field3140[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class207.field3140[var30 == var80 ? var26 : 0];
                        class146 var85 = class348.method2412(true, var80 - 1);
                        class175 var86 = class346.method2401(var12, var85, 0);
                        var86.field2661 += 5;
                        var86.field2661 += var81.length - 2;
                        var86.field2661 += var82.length - 2;
                        var86.field2661 += var83.length - 2;
                        var86.field2661 += var84.length - 2;
                        var86.field2649++;
                    }
                }
            }
        }
        for (class175 var87 = (class175) var12.method761(arg2 ^ 0x4D); var87 != null; var87 = (class175) var12.method757(arg2 ^ 0xFFFFFFC0)) {
            var87.method1218();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg11[var88][var89] & 0xFF;
                int var91;
                if ((arg0[arg7][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg0[1][var88][var89] & 0x2) == 2 && arg7 > 0) {
                    var91 = arg7 - 1;
                } else {
                    var91 = arg7;
                }
                int var92 = arg10[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class146 var93 = class348.method2412(true, var92 - 1);
                    if (var93.field2328 == -1) {
                        continue;
                    }
                    class175 var94 = class346.method2401(var12, var93, 0);
                    byte var95 = arg8[var88][var89];
                    byte var96 = arg9[var88][var89];
                    int var97 = class348.method2411(var93.field2323, var93.field2328, arg6[var88][var89], -2108503000);
                    int var98 = class348.method2411(var93.field2323, var93.field2328, arg6[var88 + 1][var89], -2108503000);
                    int var99 = class348.method2411(var93.field2323, var93.field2328, arg6[var88 + 1][var89 + 1], -2108503000);
                    int var100 = class348.method2411(var93.field2323, var93.field2328, arg6[var88][var89 + 1], -2108503000);
                    class295.method2099(arg3, var94, var96, arg4, arg5, var88, var89, var100, var90 != 0 && var93.field2311, arg1, 0, var91, var97, var95, var99, var98);
                }
                if ((arg11[var88][var89] & 0xFF) != 0 || var92 != 0 && arg8[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg10[var88][var89 + 1] & 0xFF;
                    int var108 = arg10[var88 - 1][var89] & 0xFF;
                    int var109 = arg10[var88][var89 - 1] & 0xFF;
                    int var110 = arg10[var88 + 1][var89] & 0xFF;
                    int var111 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class146 var115 = class348.method2412(true, var111 - 1);
                        if (var115.field2311 && var115.field2328 != -1) {
                            byte var116 = arg9[var88 - 1][var89 + 1];
                            byte var117 = arg8[var88 - 1][var89 + 1];
                            int var118 = class35.field406[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class35.field406[var117 * 4 + (var116 + 2 & 0x3)];
                            if (class207.field3140[var118][1] && class207.field3140[var119][0]) {
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
                        class146 var121 = class348.method2412(true, var112 - 1);
                        if (var121.field2311 && var121.field2328 != -1) {
                            byte var122 = arg9[var88 - 1][var89 - 1];
                            byte var123 = arg8[var88 - 1][var89 - 1];
                            int var124 = class35.field406[(var122 & 0x3) + var123 * 4];
                            int var125 = class35.field406[(var122 + 3 & 0x3) + var123 * 4];
                            if (class207.field3140[var124][1] && class207.field3140[var125][0]) {
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
                        class146 var127 = class348.method2412(true, var114 - 1);
                        if (var127.field2311 && var127.field2328 != -1) {
                            byte var128 = arg8[var88 + 1][var89 - 1];
                            byte var129 = arg9[var88 + 1][var89 - 1];
                            int var130 = class35.field406[(var129 & 0x3) + var128 * 4];
                            int var131 = class35.field406[(var129 + 1 & 0x3) + var128 * 4];
                            if (class207.field3140[var131][1] && class207.field3140[var130][0]) {
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
                        class146 var133 = class348.method2412(true, var113 - 1);
                        if (var133.field2311 && var133.field2328 != -1) {
                            byte var134 = arg9[var88 + 1][var89 + 1];
                            byte var135 = arg8[var88 + 1][var89 + 1];
                            int var136 = class35.field406[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class35.field406[(var134 + 2 & 0x3) + var135 * 4];
                            if (class207.field3140[var137][1] && class207.field3140[var136][0]) {
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
                        class146 var139 = class348.method2412(true, var107 - 1);
                        if (var139.field2311 && var139.field2328 != -1) {
                            var103 = class35.field406[(arg9[var88][var89 + 1] + 2 & 0x3) + arg8[var88][var89 + 1] * 4];
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
                        class146 var141 = class348.method2412(true, var108 - 1);
                        if (var141.field2311 && var141.field2328 != -1) {
                            var104 = class35.field406[arg8[var88 - 1][var89] * 4 + (arg9[var88 - 1][var89] + 3 & 0x3)];
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
                        class146 var143 = class348.method2412(true, var109 - 1);
                        if (var143.field2311 && var143.field2328 != -1) {
                            var105 = class35.field406[arg8[var88][var89 - 1] * 4 + (arg9[var88][var89 - 1] & 0x3)];
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
                        class146 var145 = class348.method2412(true, var110 - 1);
                        if (var145.field2311 && var145.field2328 != -1) {
                            var106 = class35.field406[arg8[var88 + 1][var89] * 4 + (arg9[var88 + 1][var89] + 1 & 0x3)];
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
                        boolean[] var149 = class207.field3140[var107 == var148 ? var103 : 0];
                        boolean[] var150 = class207.field3140[var110 == var148 ? var106 : 0];
                        boolean[] var151 = class207.field3140[var108 == var148 ? var104 : 0];
                        boolean[] var152 = class207.field3140[var109 == var148 ? var105 : 0];
                        class146 var153 = class348.method2412(true, var148 - 1);
                        class175 var154 = class346.method2401(var12, var153, 0);
                        int var155 = class348.method2411(var153.field2323, var153.field2328, arg6[var88][var89], -2108503000) << 8 | 0xFF;
                        int var156 = class348.method2411(var153.field2323, var153.field2328, arg6[var88 + 1][var89], -2108503000) << 8 | 0xFF;
                        int var157 = class348.method2411(var153.field2323, var153.field2328, arg6[var88 + 1][var89 + 1], arg2 - 2108503063) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class348.method2411(var153.field2323, var153.field2328, arg6[var88][var89 + 1], arg2 - 2108503063) << 8 | 0xFF;
                        int var160 = var149.length + var158 - 2;
                        boolean var161 = var113 != var148 && var149[0] && var150[1];
                        boolean var162 = var111 != var148 && var151[0] && var149[1];
                        int var163 = var151.length + var160 - 2;
                        int var164 = var152.length + var163 - 2;
                        boolean var165 = var112 != var148 && var152[0] && var151[1];
                        int var166 = var150.length + var164 - 2;
                        boolean var167 = var114 != var148 && var150[0] && var152[1];
                        int[] var168 = new int[var166];
                        int var169 = class247.method1755(arg5, 0, var155, arg1, 64, arg3, (byte) 81, var156, var157, arg4, 0.0F, var88, var154, true, 64, (int[][]) null, var159, var89);
                        byte var170 = 0;
                        int var171 = class247.method1755(arg5, 0, var155, arg1, 0, arg3, (byte) 74, var156, var157, arg4, 0.0F, var88, var154, var162, 128, (int[][]) null, var159, var89);
                        int var172 = class247.method1755(arg5, 0, var155, arg1, 128, arg3, (byte) 113, var156, var157, arg4, 0.0F, var88, var154, var161, 128, (int[][]) null, var159, var89);
                        int var173 = class247.method1755(arg5, 0, var155, arg1, 0, arg3, (byte) 79, var156, var157, arg4, 0.0F, var88, var154, var165, 0, (int[][]) null, var159, var89);
                        int var174 = class247.method1755(arg5, 0, var155, arg1, 128, arg3, (byte) 80, var156, var157, arg4, 0.0F, var88, var154, var167, 0, (int[][]) null, var159, var89);
                        int var180 = var170 + 1;
                        var168[var170] = var169;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class247.method1755(arg5, 0, var155, arg1, 64, arg3, (byte) 87, var156, var157, arg4, 0.0F, var88, var154, var149[2], 128, (int[][]) null, var159, var89);
                        }
                        var168[var180++] = var171;
                        if (var151.length > 2) {
                            var168[var180++] = class247.method1755(arg5, 0, var155, arg1, 0, arg3, (byte) 77, var156, var157, arg4, 0.0F, var88, var154, var151[2], 64, (int[][]) null, var159, var89);
                        }
                        var168[var180++] = var173;
                        if (var152.length > 2) {
                            var168[var180++] = class247.method1755(arg5, 0, var155, arg1, 64, arg3, (byte) 110, var156, var157, arg4, 0.0F, var88, var154, var152[2], 0, (int[][]) null, var159, var89);
                        }
                        var168[var180++] = var174;
                        if (var150.length > 2) {
                            var168[var180++] = class247.method1755(arg5, 0, var155, arg1, 128, arg3, (byte) 98, var156, var157, arg4, 0.0F, var88, var154, var150[2], 64, (int[][]) null, var159, var89);
                        }
                        var168[var180++] = var172;
                        var154.method1221(var91, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class175 var175 = (class175) var12.method761(102); var175 != null; var175 = (class175) var12.method757(-1)) {
            if (var175.field2655 == 0) {
                var175.method1290(103);
            } else {
                var175.method1216();
            }
        }
        int var176 = var12.method756(1);
        if (arg2 != 63) {
            method2398((byte) 73);
        }
        long[] var177 = new long[var176];
        class175[] var178 = new class175[var176];
        var12.method767(var178, (byte) -10);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field2834;
        }
        class222.method1553(0, var178, var177);
        return var178;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILqm;)V", line = 1001)
    public final void method2395(int arg0, class259 arg1) {
        if (arg1.field4089 != null) {
            arg1.method1829((byte) -74);
        }
        arg1.field4098 = this.field5476;
        field5478++;
        if (arg0 == 16218) {
            arg1.field4089 = this.field5476.field4089;
            arg1.field4089.field4098 = arg1;
            arg1.field4098.field4089 = arg1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 1081)
    public class345() {
        this.field5476.field4098 = this.field5476;
        this.field5476.field4089 = this.field5476;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Lqm;", line = 1023)
    public final class259 method2396(int arg0) {
        field5483++;
        class259 var2 = this.field5476.field4098;
        if (this.field5476 == var2) {
            return null;
        } else if (arg0 == 1542) {
            var2.method1829((byte) -74);
            return var2;
        } else {
            return (class259) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lqm;", line = 1045)
    public final class259 method2397(byte arg0) {
        class259 var2 = this.field5476.field4098;
        int var3 = -108 / ((arg0 + 57) / 52);
        field5477++;
        if (this.field5476 == var2) {
            this.field5480 = null;
            return null;
        } else {
            this.field5480 = var2.field4098;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V", line = 1066)
    public static void method2398(byte arg0) {
        field5472 = (class257[][][]) null;
        field5473 = null;
        field5469 = null;
        if (arg0 != 2) {
            field5472 = (class257[][][]) ((class257[][][]) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I", line = 1096)
    public final int method2399(int arg0) {
        field5470++;
        int var2 = 0;
        for (class259 var3 = this.field5476.field4098; var3 != this.field5476; var3 = var3.field4098) {
            var2++;
        }
        if (arg0 != -2) {
            this.method2395(62, (class259) null);
        }
        return var2;
    }
}
