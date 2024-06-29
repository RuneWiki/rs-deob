import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class84 {

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Z")
    public boolean field1362 = true;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lve;")
    private static class255 field1357 = class87.method607(111, "Cancel");

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lve;")
    public static class255 field1354 = class87.method607(51, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lve;")
    public static class255 field1349 = field1357;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
    public static int[] field1356 = new int[32768];

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lve;")
    public static class255 field1359 = class87.method607(64, ":clanreq:");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 10)
    public static final void method586(int arg0) {
        field1350++;
        if (arg0 <= 82) {
            method589(77, -111, -34);
        }
        if ((class59.field905 < class97.field1683)) {
            class59.field905 = (float) ((double) class59.field905 / 30.0D + (double) class59.field905);
            if (class97.field1683 < class59.field905) {
                class59.field905 = class97.field1683;
            }
            class301.method2099(113);
        } else if (class59.field905 > class97.field1683) {
            class59.field905 = (float) ((double) class59.field905 - (double) class59.field905 / 30.0D);
            if (class97.field1683 > class59.field905) {
                class59.field905 = class97.field1683;
            }
            class301.method2099(124);
        }
        if (class59.field897 == -1 || class314.field5334 == -1) {
            return;
        }
        int var1 = class59.field897 - class85.field1369;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class85.field1369 += var1;
        int var2 = class314.field5334 - class149.field2520;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class149.field2520 -= -var2;
        if (var1 == 0 && var2 == 0) {
            class59.field897 = -1;
            class314.field5334 = -1;
        }
        class301.method2099(116);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([[I[[[BI[[F[[II[[B[[F[[B[[B[[F[[B)[Ldi;", line = 81)
    public static final class142[] method587(int[][] arg0, byte[][][] arg1, int arg2, float[][] arg3, int[][] arg4, int arg5, byte[][] arg6, float[][] arg7, byte[][] arg8, byte[][] arg9, float[][] arg10, byte[][] arg11) {
        field1355++;
        class47 var12 = new class47(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg11[var13][var14] & 0xFF;
                int var16 = arg6[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class289 var17 = class167.method1216(var16 - 1, (byte) 123);
                    if (var17.field4969 == -1) {
                        continue;
                    }
                    class142 var18 = class181.method1274(var12, arg2 - 186798927, var17);
                    byte var19 = arg9[var13][var14];
                    int[] var20 = class112.field1900[var19];
                    var18.field2362 += var20.length / 2;
                    var18.field2359++;
                    if (var17.field4981 && var15 != 0) {
                        var18.field2362 += class49.field742[var19];
                    }
                }
                if ((arg11[var13][var14] & 0xFF) != 0 || var16 != 0 && arg9[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = arg6[var13][var14 + 1] & 0xFF;
                    int var26 = 0;
                    int var27 = 0;
                    int var28 = arg6[var13 + 1][var14] & 0xFF;
                    int var29 = arg6[var13][var14 - 1] & 0xFF;
                    int var30 = arg6[var13 - 1][var14] & 0xFF;
                    int var31 = arg6[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg6[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg6[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg6[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class289 var35 = class167.method1216(var31 - 1, (byte) 126);
                        if (var35.field4981 && var35.field4969 != -1) {
                            byte var36 = arg8[var13 - 1][var14 + 1];
                            byte var37 = arg9[var13 - 1][var14 + 1];
                            int var38 = class266.field4514[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class266.field4514[var37 * 4 + (var36 + 2 & 0x3)];
                            if (class137.field2284[var38][1] && class137.field2284[var39][0]) {
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
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class289 var44 = class167.method1216(var32 - 1, (byte) 121);
                        if (var44.field4981 && var44.field4969 != -1) {
                            byte var45 = arg8[var13 - 1][var14 - 1];
                            byte var46 = arg9[var13 - 1][var14 - 1];
                            int var47 = class266.field4514[(var45 & 0x3) + var46 * 4];
                            int var48 = class266.field4514[(var45 + 3 & 0x3) + var46 * 4];
                            if (class137.field2284[var47][1] && class137.field2284[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var21[var22++] = var32;
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
                        class289 var53 = class167.method1216(var33 - 1, (byte) -101);
                        if (var53.field4981 && var53.field4969 != -1) {
                            byte var54 = arg8[var13 + 1][var14 - 1];
                            byte var55 = arg9[var13 + 1][var14 - 1];
                            int var56 = class266.field4514[var55 * 4 + (var54 & 0x3)];
                            int var57 = class266.field4514[(var54 + 1 & 0x3) + var55 * 4];
                            if (class137.field2284[var57][1] && class137.field2284[var56][0]) {
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var70 = false;
                    } else {
                        class289 var62 = class167.method1216(var34 - 1, (byte) 118);
                        if (var62.field4981 && var62.field4969 != -1) {
                            byte var63 = arg8[var13 + 1][var14 + 1];
                            byte var64 = arg9[var13 + 1][var14 + 1];
                            int var65 = class266.field4514[var64 * 4 + (var63 + 1 & 0x3)];
                            int var66 = class266.field4514[(var63 + 2 & 0x3) + var64 * 4];
                            if (class137.field2284[var66][1] && class137.field2284[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var22 == var68) {
                                        var21[var22++] = var34;
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
                    if (var25 != 0 && var16 != var25) {
                        class289 var71 = class167.method1216(var25 - 1, (byte) 121);
                        if (var71.field4981 && var71.field4969 != -1) {
                            var23 = class266.field4514[(arg8[var13][var14 + 1] + 2 & 0x3) + arg9[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var22 == var72) {
                                    var21[var22++] = var25;
                                    break;
                                }
                                if (var21[var72] == var25) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class289 var73 = class167.method1216(var30 - 1, (byte) -85);
                        if (var73.field4981 && var73.field4969 != -1) {
                            var27 = class266.field4514[(arg8[var13 - 1][var14] + 3 & 0x3) + arg9[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var21[var22++] = var30;
                                    break;
                                }
                                if (var21[var74] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class289 var75 = class167.method1216(var29 - 1, (byte) 44);
                        if (var75.field4981 && var75.field4969 != -1) {
                            var24 = class266.field4514[arg9[var13][var14 - 1] * 4 + (arg8[var13][var14 - 1] & 0x3)];
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
                    if (var28 != 0 && var16 != var28) {
                        class289 var77 = class167.method1216(var28 - 1, (byte) 24);
                        if (var77.field4981 && var77.field4969 != -1) {
                            var26 = class266.field4514[(arg8[var13 + 1][var14] + 1 & 0x3) + arg9[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var21[var22++] = var28;
                                    break;
                                }
                                if (var21[var78] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class137.field2284[var25 == var80 ? var23 : 0];
                        boolean[] var82 = class137.field2284[var30 == var80 ? var27 : 0];
                        boolean[] var83 = class137.field2284[var29 == var80 ? var24 : 0];
                        boolean[] var84 = class137.field2284[var28 == var80 ? var26 : 0];
                        class289 var85 = class167.method1216(var80 - 1, (byte) 122);
                        class142 var86 = class181.method1274(var12, arg2 - 186798927, var85);
                        var86.field2362 += 5;
                        var86.field2362 += var81.length - 2;
                        var86.field2362 += var82.length - 2;
                        var86.field2362 += var83.length - 2;
                        var86.field2362 += var84.length - 2;
                        var86.field2359++;
                    }
                }
            }
        }
        for (class142 var87 = (class142) var12.method288((byte) -42); var87 != null; var87 = (class142) var12.method289(arg2 ^ 0xFFFFFF80)) {
            var87.method1054();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg1[arg5][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg1[1][var88][var89] & 0x2) == 2 && arg5 > 0) {
                    var90 = arg5 - 1;
                } else {
                    var90 = arg5;
                }
                int var91 = arg6[var88][var89] & 0xFF;
                int var92 = arg11[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class289 var93 = class167.method1216(var91 - 1, (byte) 38);
                    if (var93.field4969 == -1) {
                        continue;
                    }
                    class142 var94 = class181.method1274(var12, -186798928, var93);
                    byte var95 = arg9[var88][var89];
                    byte var96 = arg8[var88][var89];
                    int var97 = class262.method1826(var93.field4963, arg0[var88][var89], var93.field4969, -25165);
                    int var98 = class262.method1826(var93.field4963, arg0[var88 + 1][var89], var93.field4969, -25165);
                    int var99 = class262.method1826(var93.field4963, arg0[var88 + 1][var89 + 1], var93.field4969, -25165);
                    int var100 = class262.method1826(var93.field4963, arg0[var88][var89 + 1], var93.field4969, -25165);
                    class114.method866(arg3, var96, var89, arg10, arg4, var90, var97, arg7, var99, var92 != 0 && var93.field4981, var94, var98, var100, var88, var95, (byte) 127);
                }
                if ((arg11[var88][var89] & 0xFF) != 0 || var91 != 0 && arg9[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int var103 = 0;
                    int[] var104 = new int[8];
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg6[var88][var89 + 1] & 0xFF;
                    int var108 = arg6[var88 - 1][var89 + 1] & 0xFF;
                    int var109 = arg6[var88 + 1][var89] & 0xFF;
                    int var110 = arg6[var88][var89 - 1] & 0xFF;
                    int var111 = arg6[var88 - 1][var89] & 0xFF;
                    int var112 = arg6[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg6[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg6[var88 + 1][var89 + 1] & 0xFF;
                    if (var108 == 0 || var91 == var108) {
                        var108 = 0;
                    } else {
                        class289 var115 = class167.method1216(var108 - 1, (byte) -98);
                        if (var115.field4981 && var115.field4969 != -1) {
                            byte var116 = arg8[var88 - 1][var89 + 1];
                            byte var117 = arg9[var88 - 1][var89 + 1];
                            int var118 = class266.field4514[var117 * 4 + (var116 + 2 & 0x3)];
                            int var119 = class266.field4514[var117 * 4 + (var116 + 3 & 0x3)];
                            if (class137.field2284[var119][1] && class137.field2284[var118][0]) {
                                var108 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var104[var101++] = var108;
                                        break;
                                    }
                                    if (var104[var120] == var108) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var108 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class289 var121 = class167.method1216(var112 - 1, (byte) 120);
                        if (var121.field4981 && var121.field4969 != -1) {
                            byte var122 = arg8[var88 - 1][var89 - 1];
                            byte var123 = arg9[var88 - 1][var89 - 1];
                            int var124 = class266.field4514[(var122 & 0x3) + var123 * 4];
                            int var125 = class266.field4514[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class137.field2284[var124][1] && class137.field2284[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var104[var101++] = var112;
                                        break;
                                    }
                                    if (var104[var126] == var112) {
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
                        class289 var127 = class167.method1216(var113 - 1, (byte) -102);
                        if (var127.field4981 && var127.field4969 != -1) {
                            byte var128 = arg9[var88 + 1][var89 - 1];
                            byte var129 = arg8[var88 + 1][var89 - 1];
                            int var130 = class266.field4514[var128 * 4 + (var129 & 0x3)];
                            int var131 = class266.field4514[var128 * 4 + (var129 + 1 & 0x3)];
                            if (class137.field2284[var131][1] && class137.field2284[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var104[var101++] = var113;
                                        break;
                                    }
                                    if (var104[var132] == var113) {
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
                        class289 var133 = class167.method1216(var114 - 1, (byte) 127);
                        if (var133.field4981 && var133.field4969 != -1) {
                            byte var134 = arg8[var88 + 1][var89 + 1];
                            byte var135 = arg9[var88 + 1][var89 + 1];
                            int var136 = class266.field4514[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class266.field4514[(var134 + 1 & 0x3) + var135 * 4];
                            if (class137.field2284[var136][1] && class137.field2284[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var104[var101++] = var114;
                                        break;
                                    }
                                    if (var104[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class289 var139 = class167.method1216(var107 - 1, (byte) 37);
                        if (var139.field4981 && var139.field4969 != -1) {
                            var103 = class266.field4514[(arg8[var88][var89 + 1] + 2 & 0x3) + arg9[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var104[var101++] = var107;
                                    break;
                                }
                                if (var104[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var91 != var111) {
                        class289 var141 = class167.method1216(var111 - 1, (byte) 119);
                        if (var141.field4981 && var141.field4969 != -1) {
                            var102 = class266.field4514[(arg8[var88 - 1][var89] + 3 & 0x3) + arg9[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var104[var101++] = var111;
                                    break;
                                }
                                if (var104[var142] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class289 var143 = class167.method1216(var110 - 1, (byte) 121);
                        if (var143.field4981 && var143.field4969 != -1) {
                            var105 = class266.field4514[(arg8[var88][var89 - 1] & 0x3) + arg9[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var104[var101++] = var110;
                                    break;
                                }
                                if (var104[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class289 var145 = class167.method1216(var109 - 1, (byte) -33);
                        if (var145.field4981 && var145.field4969 != -1) {
                            var106 = class266.field4514[(arg8[var88 + 1][var89] + 1 & 0x3) + arg9[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var104[var101++] = var109;
                                    break;
                                }
                                if (var104[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var104[var147];
                        boolean[] var149 = class137.field2284[var111 == var148 ? var102 : 0];
                        boolean[] var150 = class137.field2284[var107 == var148 ? var103 : 0];
                        boolean[] var151 = class137.field2284[var109 == var148 ? var106 : 0];
                        boolean[] var152 = class137.field2284[var110 == var148 ? var105 : 0];
                        class289 var153 = class167.method1216(var148 - 1, (byte) 32);
                        class142 var154 = class181.method1274(var12, -186798928, var153);
                        byte var155 = 6;
                        int var156 = class262.method1826(var153.field4963, arg0[var88][var89], var153.field4969, arg2 ^ 0x624C) << 8 | 0xFF;
                        int var157 = class262.method1826(var153.field4963, arg0[var88 + 1][var89], var153.field4969, arg2 ^ 0x624C) << 8 | 0xFF;
                        int var158 = class262.method1826(var153.field4963, arg0[var88 + 1][var89 + 1], var153.field4969, -25165) << 8 | 0xFF;
                        int var159 = class262.method1826(var153.field4963, arg0[var88][var89 + 1], var153.field4969, -25165) << 8 | 0xFF;
                        int var160 = var150.length + var155 - 2;
                        boolean var161 = var108 != var148 && var149[0] && var150[1];
                        int var162 = var149.length + var160 - 2;
                        boolean var163 = var114 != var148 && var150[0] && var151[1];
                        boolean var164 = var112 != var148 && var152[0] && var149[1];
                        int var165 = var152.length + var162 - 2;
                        int var166 = var151.length + var165 - 2;
                        boolean var167 = var113 != var148 && var151[0] && var152[1];
                        int[] var168 = new int[var166];
                        int var169 = class275.method1929(1, true, arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 64, var88, 64);
                        byte var170 = 0;
                        int var171 = class275.method1929(1, var161, arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 128, var88, 0);
                        int var172 = class275.method1929(1, var163, arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 128, var88, 128);
                        int var173 = class275.method1929(1, var164, arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 0, var88, 0);
                        int var174 = class275.method1929(1, var167, arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 0, var88, 128);
                        int var180 = var170 + 1;
                        var168[var170] = var169;
                        var168[var180++] = var172;
                        if (var150.length > 2) {
                            var168[var180++] = class275.method1929(1, var150[2], arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 128, var88, 64);
                        }
                        var168[var180++] = var171;
                        if (var149.length > 2) {
                            var168[var180++] = class275.method1929(1, var149[2], arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 64, var88, 0);
                        }
                        var168[var180++] = var173;
                        if (var152.length > 2) {
                            var168[var180++] = class275.method1929(1, var152[2], arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 0, var88, 64);
                        }
                        var168[var180++] = var174;
                        if (var151.length > 2) {
                            var168[var180++] = class275.method1929(class127.method943(arg2, -2), var151[2], arg7, var156, 0, (int[][]) null, arg4, var89, var159, arg10, var154, arg3, var158, 0.0F, var157, 64, var88, 128);
                        }
                        var168[var180++] = var172;
                        var154.method1056(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class142 var175 = (class142) var12.method288((byte) -42); var175 != null; var175 = (class142) var12.method289(54)) {
            if (var175.field2373 == 0) {
                var175.method1502((byte) -82);
            } else {
                var175.method1055();
            }
        }
        int var176 = var12.method286((byte) -53);
        long[] var177 = new long[var176];
        if (arg2 != -1) {
            method586(-27);
        }
        class142[] var178 = new class142[var176];
        var12.method283(var178, false);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field3568;
        }
        class34.method191(var177, 28777, var178);
        return var178;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 1017)
    public static void method588(int arg0) {
        field1359 = null;
        field1349 = null;
        if (arg0 == 1) {
            field1354 = null;
            field1357 = null;
            field1356 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V", line = 1037)
    public static final void method589(int arg0, int arg1, int arg2) {
        if (class184.field2963 != 0 && arg0 != -1) {
            class197.method1420(class285.field4895, class184.field2963, false, arg0, (byte) 50, 0);
            class148.field2505 = true;
        }
        field1351++;
        if (arg1 != 1) {
            field1356 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZIII)V", line = 1054)
    public static final void method590(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1345++;
        if (arg4) {
            field1356 = (int[]) null;
        }
        if (class225.method1570((byte) -96, arg0)) {
            client.method1669(class297.field5087[arg0], -1, arg5, arg6, arg3, arg7, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V", line = 1070)
    public static final void method591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1346++;
        if (arg3 >= class261.field4427 && arg3 <= class11.field156) {
            int var5 = class198.method1425(class30.field473, false, arg1, class125.field2082);
            int var6 = class198.method1425(class30.field473, false, arg4, class125.field2082);
            class238.method1647(arg0, var6, arg3, (byte) -27, var5);
        }
        if (arg2 != -1) {
            field1349 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIZ)V", line = 1101)
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1347 = arg2;
        this.field1362 = arg6;
        this.field1348 = arg4;
        this.field1352 = arg0;
        this.field1361 = arg1;
        this.field1360 = arg3;
        this.field1358 = arg5;
    }
}
