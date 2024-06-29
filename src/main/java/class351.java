import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class351 extends class301 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[I")
    public static int[] field5599 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Len;")
    public static class49 field5596 = new class49();

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public int field5605;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public int field5609;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Lek;")
    public static class206 field5606;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Ljava/lang/String;")
    public String field5610;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "[I")
    public int[] field5612;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "[I")
    public int[] field5613;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "[Ll;")
    public class328[] field5608;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field5601;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLek;Lek;)V", line = 5)
    public static final void method2498(byte arg0, class206 arg1, class206 arg2) {
        class76.field1370 = arg1;
        if (arg0 >= -30) {
            field5606 = (class206) null;
        }
        class132.field2273 = arg2;
        field5595++;
        class76.field1370.method1417(true, 36);
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 20)
    public static void method2499(int arg0) {
        field5596 = null;
        if (arg0 <= -94) {
            field5606 = null;
            field5599 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([[I[[B[[F[[FI[[B[[I[[B[[B[[[BI[[F)[Lwl;", line = 38)
    public static final class102[] method2500(int[][] arg0, byte[][] arg1, float[][] arg2, float[][] arg3, int arg4, byte[][] arg5, int[][] arg6, byte[][] arg7, byte[][] arg8, byte[][][] arg9, int arg10, float[][] arg11) {
        class328 var12 = new class328(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg8[var13][var14] & 0xFF;
                int var16 = arg1[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class352 var17 = class131.method929(var16 - 1, 8);
                    if (var17.field5634 == -1) {
                        continue;
                    }
                    class102 var18 = class233.method1623(126, var12, var17);
                    byte var19 = arg7[var13][var14];
                    int[] var20 = class356.field5674[var19];
                    var18.field1879 += var20.length / 2;
                    var18.field1854++;
                    if (var17.field5635 && var15 != 0) {
                        var18.field1879 += class253.field4160[var19];
                    }
                }
                if ((arg8[var13][var14] & 0xFF) != 0 || var16 != 0 && arg7[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg1[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg1[var13][var14 - 1] & 0xFF;
                    int var29 = arg1[var13 - 1][var14] & 0xFF;
                    int var30 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg1[var13 + 1][var14] & 0xFF;
                    int var32 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    if (var34 == 0 || var16 == var34) {
                        boolean var43 = false;
                    } else {
                        class352 var35 = class131.method929(var34 - 1, arg4 + 9);
                        if (var35.field5635 && var35.field5634 != -1) {
                            byte var36 = arg7[var13 - 1][var14 + 1];
                            byte var37 = arg5[var13 - 1][var14 + 1];
                            int var38 = class325.field5248[(var37 + 3 & 0x3) + var36 * 4];
                            int var39 = class325.field5248[(var37 + 2 & 0x3) + var36 * 4];
                            if (class282.field4607[var38][1] && class282.field4607[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var41] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var30 == 0 || var16 == var30) {
                        boolean var52 = false;
                    } else {
                        class352 var44 = class131.method929(var30 - 1, arg4 + 9);
                        if (var44.field5635 && var44.field5634 != -1) {
                            byte var45 = arg7[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class325.field5248[(var46 & 0x3) + var45 * 4];
                            int var48 = class325.field5248[(var46 + 3 & 0x3) + var45 * 4];
                            if (class282.field4607[var47][1] && class282.field4607[var48][0]) {
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
                    if (var33 == 0 || var16 == var33) {
                        boolean var61 = false;
                    } else {
                        class352 var53 = class131.method929(var33 - 1, 8);
                        if (var53.field5635 && var53.field5634 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg7[var13 + 1][var14 - 1];
                            int var56 = class325.field5248[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class325.field5248[(var54 & 0x3) + var55 * 4];
                            if (class282.field4607[var56][1] && class282.field4607[var57][0]) {
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
                    if (var32 == 0 || var16 == var32) {
                        boolean var70 = false;
                    } else {
                        class352 var62 = class131.method929(var32 - 1, 8);
                        if (var62.field5635 && var62.field5634 != -1) {
                            byte var63 = arg5[var13 + 1][var14 + 1];
                            byte var64 = arg7[var13 + 1][var14 + 1];
                            int var65 = class325.field5248[var64 * 4 + (var63 + 2 & 0x3)];
                            int var66 = class325.field5248[(var63 + 1 & 0x3) + var64 * 4];
                            if (class282.field4607[var65][1] && class282.field4607[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var68] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class352 var71 = class131.method929(var26 - 1, 8);
                        if (var71.field5635 && var71.field5634 != -1) {
                            var25 = class325.field5248[(arg5[var13][var14 + 1] + 2 & 0x3) + arg7[var13][var14 + 1] * 4];
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
                    if (var29 != 0 && var16 != var29) {
                        class352 var73 = class131.method929(var29 - 1, 8);
                        if (var73.field5635 && var73.field5634 != -1) {
                            var23 = class325.field5248[(arg5[var13 - 1][var14] + 3 & 0x3) + arg7[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var74] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class352 var75 = class131.method929(var28 - 1, arg4 + 9);
                        if (var75.field5635 && var75.field5634 != -1) {
                            var24 = class325.field5248[arg7[var13][var14 - 1] * 4 + (arg5[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var76] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var16 != var31) {
                        class352 var77 = class131.method929(var31 - 1, arg4 ^ 0xFFFFFFF7);
                        if (var77.field5635 && var77.field5634 != -1) {
                            var27 = class325.field5248[(arg5[var13 + 1][var14] + 1 & 0x3) + arg7[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class282.field4607[var26 == var80 ? var25 : 0];
                        boolean[] var82 = class282.field4607[var29 == var80 ? var23 : 0];
                        boolean[] var83 = class282.field4607[var31 == var80 ? var27 : 0];
                        boolean[] var84 = class282.field4607[var28 == var80 ? var24 : 0];
                        class352 var85 = class131.method929(var80 - 1, 8);
                        class102 var86 = class233.method1623(-116, var12, var85);
                        var86.field1879 += 5;
                        var86.field1879 += var81.length - 2;
                        var86.field1879 += var82.length - 2;
                        var86.field1879 += var84.length - 2;
                        var86.field1879 += var83.length - 2;
                        var86.field1854++;
                    }
                }
            }
        }
        for (class102 var87 = (class102) var12.method2345((byte) -110); var87 != null; var87 = (class102) var12.method2336(arg4 - 69)) {
            var87.method769();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg9[arg10][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg9[1][var88][var89] & 0x2) == 2 && arg10 > 0) {
                    var90 = arg10 - 1;
                } else {
                    var90 = arg10;
                }
                int var91 = arg8[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class352 var93 = class131.method929(var92 - 1, arg4 + 9);
                    if (var93.field5634 == -1) {
                        continue;
                    }
                    class102 var94 = class233.method1623(108, var12, var93);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg7[var88][var89];
                    int var97 = class260.method1827(-114, var93.field5633, arg0[var88][var89], var93.field5634);
                    int var98 = class260.method1827(-94, var93.field5633, arg0[var88 + 1][var89], var93.field5634);
                    int var99 = class260.method1827(arg4 - 124, var93.field5633, arg0[var88 + 1][var89 + 1], var93.field5634);
                    int var100 = class260.method1827(-74, var93.field5633, arg0[var88][var89 + 1], var93.field5634);
                    class101.method762(arg3, var94, var91 != 0 && var93.field5635, var89, arg6, var88, var95, (byte) 81, var100, var99, arg11, arg2, var90, var96, var98, var97);
                }
                if ((arg8[var88][var89] & 0xFF) != 0 || var92 != 0 && arg7[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg1[var88][var89 + 1] & 0xFF;
                    int var107 = 0;
                    int var108 = arg1[var88][var89 - 1] & 0xFF;
                    int var109 = arg1[var88 + 1][var89] & 0xFF;
                    int var110 = arg1[var88 - 1][var89] & 0xFF;
                    int var111 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    int var114 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class352 var115 = class131.method929(var111 - 1, 8);
                        if (var115.field5635 && var115.field5634 != -1) {
                            byte var116 = arg5[var88 - 1][var89 + 1];
                            byte var117 = arg7[var88 - 1][var89 + 1];
                            int var118 = class325.field5248[var117 * 4 + (var116 + 2 & 0x3)];
                            int var119 = class325.field5248[(var116 + 3 & 0x3) + var117 * 4];
                            if (class282.field4607[var119][1] && class282.field4607[var118][0]) {
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
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class352 var121 = class131.method929(var113 - 1, arg4 + 9);
                        if (var121.field5635 && var121.field5634 != -1) {
                            byte var122 = arg5[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class325.field5248[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class325.field5248[var123 * 4 + (var122 & 0x3)];
                            if (class282.field4607[var125][1] && class282.field4607[var124][0]) {
                                var113 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var126] == var113) {
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
                        class352 var127 = class131.method929(var112 - 1, 8);
                        if (var127.field5635 && var127.field5634 != -1) {
                            byte var128 = arg5[var88 + 1][var89 - 1];
                            byte var129 = arg7[var88 + 1][var89 - 1];
                            int var130 = class325.field5248[(var128 & 0x3) + var129 * 4];
                            int var131 = class325.field5248[(var128 + 1 & 0x3) + var129 * 4];
                            if (class282.field4607[var131][1] && class282.field4607[var130][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var132] == var112) {
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
                        class352 var133 = class131.method929(var114 - 1, arg4 ^ 0xFFFFFFF7);
                        if (var133.field5635 && var133.field5634 != -1) {
                            byte var134 = arg5[var88 + 1][var89 + 1];
                            byte var135 = arg7[var88 + 1][var89 + 1];
                            int var136 = class325.field5248[var135 * 4 + (var134 + 2 & 0x3)];
                            int var137 = class325.field5248[(var134 + 1 & 0x3) + var135 * 4];
                            if (class282.field4607[var136][1] && class282.field4607[var137][0]) {
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
                        class352 var139 = class131.method929(var106 - 1, 8);
                        if (var139.field5635 && var139.field5634 != -1) {
                            var103 = class325.field5248[(arg5[var88][var89 + 1] + 2 & 0x3) + arg7[var88][var89 + 1] * 4];
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
                    if (var110 != 0 && var92 != var110) {
                        class352 var141 = class131.method929(var110 - 1, 8);
                        if (var141.field5635 && var141.field5634 != -1) {
                            var107 = class325.field5248[arg7[var88 - 1][var89] * 4 + (arg5[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var142] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class352 var143 = class131.method929(var108 - 1, 8);
                        if (var143.field5635 && var143.field5634 != -1) {
                            var105 = class325.field5248[arg7[var88][var89 - 1] * 4 + (arg5[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class352 var145 = class131.method929(var109 - 1, arg4 + 9);
                        if (var145.field5635 && var145.field5634 != -1) {
                            var104 = class325.field5248[arg7[var88 + 1][var89] * 4 + (arg5[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class282.field4607[var106 == var148 ? var103 : 0];
                        boolean[] var150 = class282.field4607[var108 == var148 ? var105 : 0];
                        boolean[] var151 = class282.field4607[var110 == var148 ? var107 : 0];
                        boolean[] var152 = class282.field4607[var109 == var148 ? var104 : 0];
                        class352 var153 = class131.method929(var148 - 1, arg4 + 9);
                        class102 var154 = class233.method1623(84, var12, var153);
                        int var155 = class260.method1827(-122, var153.field5633, arg0[var88][var89], var153.field5634) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class260.method1827(-116, var153.field5633, arg0[var88 + 1][var89], var153.field5634) << 8 | 0xFF;
                        int var158 = class260.method1827(arg4 ^ 0x4C, var153.field5633, arg0[var88 + 1][var89 + 1], var153.field5634) << 8 | 0xFF;
                        int var159 = class260.method1827(-85, var153.field5633, arg0[var88][var89 + 1], var153.field5634) << 8 | 0xFF;
                        int var160 = var149.length + var156 - 2;
                        int var161 = var151.length + var160 - 2;
                        int var162 = var150.length + var161 - 2;
                        boolean var163 = var114 != var148 && var149[0] && var152[1];
                        int var164 = var152.length + var162 - 2;
                        int[] var165 = new int[var164];
                        byte var166 = 0;
                        boolean var167 = var112 != var148 && var152[0] && var150[1];
                        boolean var168 = var113 != var148 && var150[0] && var151[1];
                        boolean var169 = var111 != var148 && var151[0] && var149[1];
                        int var170 = class205.method1397((int[][]) null, arg2, true, 0.0F, var155, 64, arg11, var88, (byte) 47, var158, arg6, var157, 0, var89, 64, var154, var159, arg3);
                        int var171 = class205.method1397((int[][]) null, arg2, var169, 0.0F, var155, 128, arg11, var88, (byte) 95, var158, arg6, var157, 0, var89, 0, var154, var159, arg3);
                        int var172 = class205.method1397((int[][]) null, arg2, var163, 0.0F, var155, 128, arg11, var88, (byte) 123, var158, arg6, var157, 0, var89, 128, var154, var159, arg3);
                        int var173 = class205.method1397((int[][]) null, arg2, var168, 0.0F, var155, 0, arg11, var88, (byte) 18, var158, arg6, var157, 0, var89, 0, var154, var159, arg3);
                        int var174 = class205.method1397((int[][]) null, arg2, var167, 0.0F, var155, 0, arg11, var88, (byte) 37, var158, arg6, var157, 0, var89, 128, var154, var159, arg3);
                        int var180 = var166 + 1;
                        var165[var166] = var170;
                        var165[var180++] = var172;
                        if (var149.length > 2) {
                            var165[var180++] = class205.method1397((int[][]) null, arg2, var149[2], 0.0F, var155, 128, arg11, var88, (byte) 108, var158, arg6, var157, 0, var89, 64, var154, var159, arg3);
                        }
                        var165[var180++] = var171;
                        if (var151.length > 2) {
                            var165[var180++] = class205.method1397((int[][]) null, arg2, var151[2], 0.0F, var155, 64, arg11, var88, (byte) 43, var158, arg6, var157, 0, var89, 0, var154, var159, arg3);
                        }
                        var165[var180++] = var173;
                        if (var150.length > 2) {
                            var165[var180++] = class205.method1397((int[][]) null, arg2, var150[2], 0.0F, var155, 0, arg11, var88, (byte) 18, var158, arg6, var157, 0, var89, 64, var154, var159, arg3);
                        }
                        var165[var180++] = var174;
                        if (var152.length > 2) {
                            var165[var180++] = class205.method1397((int[][]) null, arg2, var152[2], 0.0F, var155, 64, arg11, var88, (byte) 70, var158, arg6, var157, 0, var89, 128, var154, var159, arg3);
                        }
                        var165[var180++] = var172;
                        var154.method771(var90, var88, var89, var165, (int[]) null, true);
                    }
                }
            }
        }
        field5607++;
        for (class102 var175 = (class102) var12.method2345((byte) -122); var175 != null; var175 = (class102) var12.method2336(-65)) {
            if (var175.field1856 == 0) {
                var175.method535(-2801);
            } else {
                var175.method770();
            }
        }
        int var176 = var12.method2340(-17734);
        class102[] var177 = new class102[var176];
        long[] var178 = new long[var176];
        var12.method2334(var177, true);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field1291;
        }
        class96.method736(var178, arg4, var177);
        return var177;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V", line = 972)
    public static final void method2501(int arg0, int arg1) {
        class332.field5303 = arg0;
        class105.field1914 = -1;
        if (arg1 != 24840) {
            field5606 = (class206) null;
        }
        class170.field2809 = -1;
        field5604++;
        class146.method999(475249384);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V", line = 990)
    public static final void method2502(byte arg0) {
        field5614++;
        byte var1 = 0;
        byte var2 = 8;
        class238.method1658(9325, class248.field4071);
        int var3 = (class16.field462 >> 10) + (class21.field543 >> 3);
        byte var4 = 8;
        byte var5 = 18;
        int var6 = (class272.field4426 >> 3) + (class223.field3693 >> 10);
        class46.field920 = new byte[var5][];
        class271.field4415 = new int[var5];
        class21.field540 = new byte[var5][];
        class148.field2516 = new byte[var5][];
        if (arg0 >= -99) {
            return;
        }
        class176.field2919 = new int[var5];
        class341.field5405 = new byte[var5][];
        class20.field533 = new int[var5][4];
        class133.field2277 = new int[var5];
        class132.field2272 = new byte[var5][];
        class127.field2221 = new int[var5];
        class194.field3267 = new int[var5];
        class190.field3227 = new int[var5];
        int var7 = 0;
        for (int var8 = (var6 - 6) / 8; var8 <= (var6 + 6) / 8; var8++) {
            for (int var9 = (var3 - 6) / 8; var9 <= ((var3 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class127.field2221[var7] = var10;
                class271.field4415[var7] = class162.field2727.method1402(-93, "m" + var8 + "_" + var9);
                class194.field3267[var7] = class162.field2727.method1402(-110, "l" + var8 + "_" + var9);
                class176.field2919[var7] = class162.field2727.method1402(-93, "n" + var8 + "_" + var9);
                class190.field3227[var7] = class162.field2727.method1402(-78, "um" + var8 + "_" + var9);
                class133.field2277[var7] = class162.field2727.method1402(-105, "ul" + var8 + "_" + var9);
                if (class176.field2919[var7] == -1) {
                    class271.field4415[var7] = -1;
                    class194.field3267[var7] = -1;
                    class190.field3227[var7] = -1;
                    class133.field2277[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class176.field2919.length; var11++) {
            class176.field2919[var11] = -1;
            class271.field4415[var11] = -1;
            class194.field3267[var11] = -1;
            class190.field3227[var11] = -1;
            class133.field2277[var11] = -1;
        }
        class1.method3(var6, var3, false, var1, 128, var2, var4, true);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)I", line = 1077)
    public static final int method2503(int arg0, int arg1) {
        if (arg1 > -106) {
            field5599 = (int[]) null;
        }
        field5598++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIBI)V", line = 1099)
    public static final void method2504(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class244.field4048 == 1) {
            class352.field5622[class323.field5227 / 100].method568(class133.field2289 - 8, class53.field1061 + -8);
        }
        field5600++;
        if (class244.field4048 == 2) {
            class352.field5622[class323.field5227 / 100 + 4].method568(class133.field2289 - 8, class53.field1061 - 8);
        }
        if (arg3 < -11) {
            class295.method2117(true);
        }
    }
}
