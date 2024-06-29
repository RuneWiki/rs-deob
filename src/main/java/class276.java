import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class276 extends class187 {

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Leg;")
    public static class188 field4262 = new class188(64);

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "F")
    public static float field4253;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "F")
    public static float field4265;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "Ltf;")
    public class109 field4266;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Lla;")
    public class165 field4254;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lmh;")
    public class331 field4251;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Lb;")
    public class73 field4245;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "[I")
    public static int[] field4257;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([[F[[B[[BII[[I[[B[[F[[F[[I[[B[[[B)[Lqa;", line = 5)
    public static final class217[] method1809(float[][] arg0, byte[][] arg1, byte[][] arg2, int arg3, int arg4, int[][] arg5, byte[][] arg6, float[][] arg7, float[][] arg8, int[][] arg9, byte[][] arg10, byte[][][] arg11) {
        class227 var12 = new class227(128);
        field4252++;
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg1[var13][var14] & 0xFF;
                int var16 = arg6[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class319 var17 = class29.method223((byte) -28, var15 - 1);
                    if (var17.field5005 == -1) {
                        continue;
                    }
                    class217 var18 = class233.method1593(var12, var17, 101);
                    byte var19 = arg2[var13][var14];
                    int[] var20 = class46.field653[var19];
                    var18.field3419 += var20.length / 2;
                    var18.field3427++;
                    if (var17.field5000 && var16 != 0) {
                        var18.field3419 += class228.field3662[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var15 != 0 && arg2[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg1[var13][var14 - 1] & 0xFF;
                    int var28 = arg1[var13][var14 + 1] & 0xFF;
                    int var29 = arg1[var13 - 1][var14] & 0xFF;
                    int var30 = arg1[var13 + 1][var14] & 0xFF;
                    int var31 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    if (var33 == 0 || var15 == var33) {
                        boolean var43 = false;
                    } else {
                        class319 var35 = class29.method223((byte) -28, var33 - 1);
                        if (var35.field5000 && var35.field5005 != -1) {
                            byte var36 = arg2[var13 - 1][var14 + 1];
                            byte var37 = arg10[var13 - 1][var14 + 1];
                            int var38 = class286.field4387[(var37 + 2 & 0x3) + var36 * 4];
                            int var39 = class286.field4387[(var37 + 3 & 0x3) + var36 * 4];
                            if (class169.field2577[var39][1] && class169.field2577[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var23[var21++] = var33;
                                        break;
                                    }
                                    if (var23[var41] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var31 == 0 || var15 == var31) {
                        boolean var52 = false;
                    } else {
                        class319 var44 = class29.method223((byte) -28, var31 - 1);
                        if (var44.field5000 && var44.field5005 != -1) {
                            byte var45 = arg10[var13 - 1][var14 - 1];
                            byte var46 = arg2[var13 - 1][var14 - 1];
                            int var47 = class286.field4387[(var45 + 3 & 0x3) + var46 * 4];
                            int var48 = class286.field4387[(var45 & 0x3) + var46 * 4];
                            if (class169.field2577[var48][1] && class169.field2577[var47][0]) {
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
                    if (var32 == 0 || var15 == var32) {
                        boolean var61 = false;
                    } else {
                        class319 var53 = class29.method223((byte) -28, var32 - 1);
                        if (var53.field5000 && var53.field5005 != -1) {
                            byte var54 = arg10[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class286.field4387[(var54 & 0x3) + var55 * 4];
                            int var57 = class286.field4387[(var54 + 1 & 0x3) + var55 * 4];
                            if (class169.field2577[var57][1] && class169.field2577[var56][0]) {
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
                    if (var34 == 0 || var15 == var34) {
                        boolean var70 = false;
                    } else {
                        class319 var62 = class29.method223((byte) -28, var34 - 1);
                        if (var62.field5000 && var62.field5005 != -1) {
                            byte var63 = arg10[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class286.field4387[var64 * 4 + (var63 + 1 & 0x3)];
                            int var66 = class286.field4387[(var63 + 2 & 0x3) + var64 * 4];
                            if (class169.field2577[var66][1] && class169.field2577[var65][0]) {
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
                    if (var28 != 0 && var15 != var28) {
                        class319 var71 = class29.method223((byte) -28, var28 - 1);
                        if (var71.field5000 && var71.field5005 != -1) {
                            var22 = class286.field4387[(arg10[var13][var14 + 1] + 2 & 0x3) + arg2[var13][var14 + 1] * 4];
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
                    if (var29 != 0 && var15 != var29) {
                        class319 var73 = class29.method223((byte) -28, var29 - 1);
                        if (var73.field5000 && var73.field5005 != -1) {
                            var25 = class286.field4387[(arg10[var13 - 1][var14] + 3 & 0x3) + arg2[var13 - 1][var14] * 4];
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
                    if (var27 != 0 && var15 != var27) {
                        class319 var75 = class29.method223((byte) -28, var27 - 1);
                        if (var75.field5000 && var75.field5005 != -1) {
                            var24 = class286.field4387[(arg10[var13][var14 - 1] & 0x3) + arg2[var13][var14 - 1] * 4];
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
                    if (var30 != 0 && var15 != var30) {
                        class319 var77 = class29.method223((byte) -28, var30 - 1);
                        if (var77.field5000 && var77.field5005 != -1) {
                            var26 = class286.field4387[(arg10[var13 + 1][var14] + 1 & 0x3) + arg2[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class169.field2577[var29 == var80 ? var25 : 0];
                        boolean[] var82 = class169.field2577[var28 == var80 ? var22 : 0];
                        boolean[] var83 = class169.field2577[var27 == var80 ? var24 : 0];
                        boolean[] var84 = class169.field2577[var30 == var80 ? var26 : 0];
                        class319 var85 = class29.method223((byte) -28, var80 - 1);
                        class217 var86 = class233.method1593(var12, var85, 85);
                        var86.field3419 += 5;
                        var86.field3419 += var82.length - 2;
                        var86.field3419 += var81.length - 2;
                        var86.field3419 += var83.length - 2;
                        var86.field3419 += var84.length - 2;
                        var86.field3427++;
                    }
                }
            }
        }
        class217 var87 = (class217) var12.method1549((byte) -101);
        if (arg4 != 8) {
            field4262 = (class188) null;
        }
        while (var87 != null) {
            var87.method1453();
            var87 = (class217) var12.method1546(arg4 ^ 0xFFFFFFF7);
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg6[var88][var89] & 0xFF;
                int var91;
                if ((arg11[arg3][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg11[1][var88][var89] & 0x2) == 2 && arg3 > 0) {
                    var91 = arg3 - 1;
                } else {
                    var91 = arg3;
                }
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class319 var93 = class29.method223((byte) -28, var92 - 1);
                    if (var93.field5005 == -1) {
                        continue;
                    }
                    class217 var94 = class233.method1593(var12, var93, 85);
                    byte var95 = arg2[var88][var89];
                    byte var96 = arg10[var88][var89];
                    int var97 = class104.method706((byte) -36, var93.field4994, arg9[var88][var89], var93.field5005);
                    int var98 = class104.method706((byte) 127, var93.field4994, arg9[var88 + 1][var89], var93.field5005);
                    int var99 = class104.method706((byte) 127, var93.field4994, arg9[var88 + 1][var89 + 1], var93.field5005);
                    int var100 = class104.method706((byte) 126, var93.field4994, arg9[var88][var89 + 1], var93.field5005);
                    class196.method1326(var91, arg5, var90 != 0 && var93.field5000, arg7, var89, (byte) -105, var98, var97, var94, var96, arg0, var100, var99, var95, var88, arg8);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var92 != 0 && arg2[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg1[var88][var89 + 1] & 0xFF;
                    int var107 = arg1[var88][var89 - 1] & 0xFF;
                    int var108 = arg1[var88 - 1][var89] & 0xFF;
                    int var109 = 0;
                    int var110 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg1[var88 + 1][var89] & 0xFF;
                    int var112 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class319 var115 = class29.method223((byte) -28, var110 - 1);
                        if (var115.field5000 && var115.field5005 != -1) {
                            byte var116 = arg10[var88 - 1][var89 + 1];
                            byte var117 = arg2[var88 - 1][var89 + 1];
                            int var118 = class286.field4387[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class286.field4387[(var116 + 3 & 0x3) + var117 * 4];
                            if (class169.field2577[var119][1] && class169.field2577[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var110;
                                        break;
                                    }
                                    if (var102[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class319 var121 = class29.method223((byte) -28, var112 - 1);
                        if (var121.field5000 && var121.field5005 != -1) {
                            byte var122 = arg10[var88 - 1][var89 - 1];
                            byte var123 = arg2[var88 - 1][var89 - 1];
                            int var124 = class286.field4387[(var122 & 0x3) + var123 * 4];
                            int var125 = class286.field4387[(var122 + 3 & 0x3) + var123 * 4];
                            if (class169.field2577[var124][1] && class169.field2577[var125][0]) {
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
                        class319 var127 = class29.method223((byte) -28, var113 - 1);
                        if (var127.field5000 && var127.field5005 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg10[var88 + 1][var89 - 1];
                            int var130 = class286.field4387[(var129 & 0x3) + var128 * 4];
                            int var131 = class286.field4387[(var129 + 1 & 0x3) + var128 * 4];
                            if (class169.field2577[var131][1] && class169.field2577[var130][0]) {
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
                        class319 var133 = class29.method223((byte) -28, var114 - 1);
                        if (var133.field5000 && var133.field5005 != -1) {
                            byte var134 = arg10[var88 + 1][var89 + 1];
                            byte var135 = arg2[var88 + 1][var89 + 1];
                            int var136 = class286.field4387[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class286.field4387[(var134 + 1 & 0x3) + var135 * 4];
                            if (class169.field2577[var136][1] && class169.field2577[var137][0]) {
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
                        class319 var139 = class29.method223((byte) -28, var106 - 1);
                        if (var139.field5000 && var139.field5005 != -1) {
                            var103 = class286.field4387[arg2[var88][var89 + 1] * 4 + (arg10[var88][var89 + 1] + 2 & 0x3)];
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
                        class319 var141 = class29.method223((byte) -28, var108 - 1);
                        if (var141.field5000 && var141.field5005 != -1) {
                            var109 = class286.field4387[(arg10[var88 - 1][var89] + 3 & 0x3) + arg2[var88 - 1][var89] * 4];
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
                    if (var107 != 0 && var92 != var107) {
                        class319 var143 = class29.method223((byte) -28, var107 - 1);
                        if (var143.field5000 && var143.field5005 != -1) {
                            var104 = class286.field4387[(arg10[var88][var89 - 1] & 0x3) + arg2[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var144] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class319 var145 = class29.method223((byte) -28, var111 - 1);
                        if (var145.field5000 && var145.field5005 != -1) {
                            var105 = class286.field4387[(arg10[var88 + 1][var89] + 1 & 0x3) + arg2[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var111;
                                    break;
                                }
                                if (var102[var146] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class169.field2577[var106 == var148 ? var103 : 0];
                        boolean[] var150 = class169.field2577[var111 == var148 ? var105 : 0];
                        boolean[] var151 = class169.field2577[var107 == var148 ? var104 : 0];
                        boolean[] var152 = class169.field2577[var108 == var148 ? var109 : 0];
                        byte var153 = 6;
                        class319 var154 = class29.method223((byte) -28, var148 - 1);
                        class217 var155 = class233.method1593(var12, var154, 50);
                        int var156 = class104.method706((byte) -23, var154.field4994, arg9[var88][var89], var154.field5005) << 8 | 0xFF;
                        int var157 = class104.method706((byte) -42, var154.field4994, arg9[var88 + 1][var89], var154.field5005) << 8 | 0xFF;
                        int var158 = class104.method706((byte) -57, var154.field4994, arg9[var88 + 1][var89 + 1], var154.field5005) << 8 | 0xFF;
                        int var159 = class104.method706((byte) 126, var154.field4994, arg9[var88][var89 + 1], var154.field5005) << 8 | 0xFF;
                        int var160 = var149.length + var153 - 2;
                        boolean var161 = var112 != var148 && var151[0] && var152[1];
                        boolean var162 = var114 != var148 && var149[0] && var150[1];
                        int var163 = var152.length + var160 - 2;
                        boolean var164 = var113 != var148 && var150[0] && var151[1];
                        boolean var165 = var110 != var148 && var152[0] && var149[1];
                        int var166 = var151.length + var163 - 2;
                        int var167 = var150.length + var166 - 2;
                        int var168 = class188.method1299(var158, var89, var88, true, arg0, 0.0F, var159, arg7, 64, var157, arg5, arg4 + 76, var156, var155, 0, arg8, (int[][]) null, 64);
                        int[] var169 = new int[var167];
                        int var170 = class188.method1299(var158, var89, var88, var165, arg0, 0.0F, var159, arg7, 128, var157, arg5, 115, var156, var155, 0, arg8, (int[][]) null, 0);
                        byte var171 = 0;
                        int var172 = class188.method1299(var158, var89, var88, var162, arg0, 0.0F, var159, arg7, 128, var157, arg5, 48, var156, var155, 0, arg8, (int[][]) null, 128);
                        int var173 = class188.method1299(var158, var89, var88, var161, arg0, 0.0F, var159, arg7, 0, var157, arg5, 122, var156, var155, 0, arg8, (int[][]) null, 0);
                        int var174 = class188.method1299(var158, var89, var88, var164, arg0, 0.0F, var159, arg7, 0, var157, arg5, 27, var156, var155, 0, arg8, (int[][]) null, 128);
                        int var180 = var171 + 1;
                        var169[var171] = var168;
                        var169[var180++] = var172;
                        if (var149.length > 2) {
                            var169[var180++] = class188.method1299(var158, var89, var88, var149[2], arg0, 0.0F, var159, arg7, 128, var157, arg5, arg4 + 113, var156, var155, 0, arg8, (int[][]) null, 64);
                        }
                        var169[var180++] = var170;
                        if (var152.length > 2) {
                            var169[var180++] = class188.method1299(var158, var89, var88, var152[2], arg0, 0.0F, var159, arg7, 64, var157, arg5, class146.method1012(arg4, 16), var156, var155, 0, arg8, (int[][]) null, 0);
                        }
                        var169[var180++] = var173;
                        if (var151.length > 2) {
                            var169[var180++] = class188.method1299(var158, var89, var88, var151[2], arg0, 0.0F, var159, arg7, 0, var157, arg5, 80, var156, var155, 0, arg8, (int[][]) null, 64);
                        }
                        var169[var180++] = var174;
                        if (var150.length > 2) {
                            var169[var180++] = class188.method1299(var158, var89, var88, var150[2], arg0, 0.0F, var159, arg7, 64, var157, arg5, 90, var156, var155, 0, arg8, (int[][]) null, 128);
                        }
                        var169[var180++] = var172;
                        var155.method1448(var91, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        for (class217 var175 = (class217) var12.method1549((byte) -114); var175 != null; var175 = (class217) var12.method1546(-1)) {
            if (var175.field3418 == 0) {
                var175.method1284(0);
            } else {
                var175.method1449();
            }
        }
        int var176 = var12.method1559(-29512);
        long[] var177 = new long[var176];
        class217[] var178 = new class217[var176];
        var12.method1560(var178, -14);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field2852;
        }
        class105.method715(var178, var177, false);
        return var178;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I", line = 952)
    public static int method1810(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 962)
    public final void method1811(int arg0) {
        this.field4254 = null;
        this.field4251 = null;
        if (arg0 != 0) {
            this.field4249 = 82;
        }
        this.field4245 = null;
        field4269++;
        this.field4266 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)Ljh;", line = 979)
    public static final class207 method1812(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field4257 = (int[]) null;
        }
        field4243++;
        class207 var3 = class78.method547(arg1, 98);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3253 == null || var3.field3253.length <= arg2) {
            return null;
        } else {
            return var3.field3253[arg2];
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)Z", line = 1003)
    public static final boolean method1813(int arg0, int arg1, int arg2) {
        field4248++;
        if (!class260.field4036) {
            return false;
        }
        int var3 = arg1 >> 16;
        if (arg2 != 0) {
            method1813(2, 43, 24);
        }
        int var4 = arg1 & 0xFFFF;
        if (class219.field3487[var3] == null || class219.field3487[var3][var4] == null) {
            return false;
        }
        class207 var5 = class219.field3487[var3][var4];
        if (arg0 == -1 && var5.field3273 == 0) {
            for (int var6 = 0; var6 < class168.field2565; var6++) {
                if (class194.field2925[var6] == 1 || class194.field2925[var6] == 1001 || class194.field2925[var6] == 40 || class194.field2925[var6] == 7 || class194.field2925[var6] == 10) {
                    for (class207 var7 = class78.method547(class76.field1135[var6], 127); var7 != null; var7 = class80.method551(arg2, var7)) {
                        if (var5.field3250 == var7.field3250) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class168.field2565; var8++) {
                if (class167.field2560[var8] == arg0 && class76.field1135[var8] == var5.field3250 && (class194.field2925[var8] == 1 || class194.field2925[var8] == 1001 || class194.field2925[var8] == 40 || class194.field2925[var8] == 7 || class194.field2925[var8] == 10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 1072)
    public static void method1814(byte arg0) {
        int var1 = -86 % ((1 - arg0) / 42);
        field4257 = null;
        field4262 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V", line = 1081)
    public static final void method1815(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class90.field1375[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class152 var5 = var4.field2650;
        if (var5 != null) {
            var5.field2404 = var5.field2404 * arg3 / 16;
            var5.field2389 = var5.field2389 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLwf;)Z", line = 1099)
    public static final boolean method1816(byte arg0, class306 arg1) {
        if (arg0 >= -22) {
            method1813(-61, -27, -41);
        }
        field4260++;
        return arg1.method2093(-99, class196.field2935);
    }
}
