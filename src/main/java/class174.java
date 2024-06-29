import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class174 extends class165 {

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Log;")
    public static class157 field2878 = null;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field2883 = 127;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    public static boolean field2880 = false;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[Z")
    public static boolean[] field2884 = new boolean[100];

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "[I")
    public static int[] field2891 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "J")
    public static long field2887 = 0L;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "[Lbb;")
    public static class40[] field2890;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I", line = 5)
    public static final int method1308(int arg0) {
        field2885++;
        return arg0 == 1 ? class184.field3061 : -44;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 25)
    public class174() {
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 33)
    public static final void method1309(int arg0) {
        class258.field4132.method707(0);
        if (arg0 <= 21) {
            field2890 = (class40[]) null;
        }
        class29.field400.method707(0);
        field2886++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(JB)V", line = 51)
    public static final void method1310(long arg0, byte arg1) {
        field2888++;
        if (arg1 != 95 || arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class61.field875; var3++) {
            if (class105.field1550[var3] == arg0) {
                class61.field875--;
                class192.field3136++;
                for (int var4 = var3; var4 < class61.field875; var4++) {
                    class61.field858[var4] = class61.field858[var4 + 1];
                    class58.field824[var4] = class58.field824[var4 + 1];
                    class121.field1838[var4] = class121.field1838[var4 + 1];
                    class105.field1550[var4] = class105.field1550[var4 + 1];
                    class301.field4731[var4] = class301.field4731[var4 + 1];
                    class191.field3130[var4] = class191.field3130[var4 + 1];
                }
                class133.field2092 = class186.field3074;
                class194.field3175.method2375(129, 0);
                class194.field3175.method255(false, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V", line = 96)
    public class174(int arg0) {
        this.field2881 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)I", line = 105)
    public static final int method1311(int arg0, byte arg1) {
        field2882++;
        class27 var2 = class117.method809(arg0, -91);
        int var3 = var2.field370;
        int var4 = var2.field375;
        int var5 = var2.field380;
        int var6 = -128 % ((-arg1 - 24) / 61);
        int var7 = class131.field2075[var5 - var4];
        return var7 & class70.field991[var3] >> var4;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V", line = 125)
    public static void method1312(int arg0) {
        field2884 = null;
        if (arg0 != 1) {
            field2887 = -109L;
        }
        field2891 = null;
        field2878 = null;
        field2890 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[[FI[[[B[[B[[I[[B[[B[[I[[F[[F[[B)[Lrc;", line = 140)
    public static final class206[] method1313(int arg0, float[][] arg1, int arg2, byte[][][] arg3, byte[][] arg4, int[][] arg5, byte[][] arg6, byte[][] arg7, int[][] arg8, float[][] arg9, float[][] arg10, byte[][] arg11) {
        field2879++;
        class69 var12 = new class69(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg4[var13][var14] & 0xFF;
                int var16 = arg11[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class278 var17 = class271.method1925((byte) 15, var16 - 1);
                    if (var17.field4471 == -1) {
                        continue;
                    }
                    class206 var18 = class49.method315(var12, var17, 469531296);
                    byte var19 = arg7[var13][var14];
                    int[] var20 = class17.field233[var19];
                    var18.field3391 += var20.length / 2;
                    var18.field3390++;
                    if (var17.field4489 && var15 != 0) {
                        var18.field3391 += class121.field1895[var19];
                    }
                }
                if ((arg4[var13][var14] & 0xFF) != 0 || var16 != 0 && arg7[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = new int[8];
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg11[var13][var14 + 1] & 0xFF;
                    int var28 = arg11[var13 - 1][var14] & 0xFF;
                    int var29 = arg11[var13][var14 - 1] & 0xFF;
                    int var30 = arg11[var13 + 1][var14] & 0xFF;
                    int var31 = arg11[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg11[var13 + 1][var14 + 1] & 0xFF;
                    int var33 = arg11[var13 - 1][var14 - 1] & 0xFF;
                    int var34 = arg11[var13 + 1][var14 - 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class278 var35 = class271.method1925((byte) 15, var31 - 1);
                        if (var35.field4489 && var35.field4471 != -1) {
                            byte var36 = arg6[var13 - 1][var14 + 1];
                            byte var37 = arg7[var13 - 1][var14 + 1];
                            int var38 = class271.field4371[var37 * 4 + (var36 + 2 & 0x3)];
                            int var39 = class271.field4371[(var36 + 3 & 0x3) + var37 * 4];
                            if (class286.field4590[var39][1] && class286.field4590[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var24[var21++] = var31;
                                        break;
                                    }
                                    if (var24[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var52 = false;
                    } else {
                        class278 var44 = class271.method1925((byte) 15, var33 - 1);
                        if (var44.field4489 && var44.field4471 != -1) {
                            byte var45 = arg7[var13 - 1][var14 - 1];
                            byte var46 = arg6[var13 - 1][var14 - 1];
                            int var47 = class271.field4371[(var46 & 0x3) + var45 * 4];
                            int var48 = class271.field4371[var45 * 4 + (var46 + 3 & 0x3)];
                            if (class286.field4590[var47][1] && class286.field4590[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var24[var21++] = var33;
                                        break;
                                    }
                                    if (var24[var50] == var33) {
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
                        class278 var53 = class271.method1925((byte) 15, var34 - 1);
                        if (var53.field4489 && var53.field4471 != -1) {
                            byte var54 = arg6[var13 + 1][var14 - 1];
                            byte var55 = arg7[var13 + 1][var14 - 1];
                            int var56 = class271.field4371[(var54 & 0x3) + var55 * 4];
                            int var57 = class271.field4371[(var54 + 1 & 0x3) + var55 * 4];
                            if (class286.field4590[var57][1] && class286.field4590[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var24[var21++] = var34;
                                        break;
                                    }
                                    if (var24[var59] == var34) {
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
                        class278 var62 = class271.method1925((byte) 15, var32 - 1);
                        if (var62.field4489 && var62.field4471 != -1) {
                            byte var63 = arg7[var13 + 1][var14 + 1];
                            byte var64 = arg6[var13 + 1][var14 + 1];
                            int var65 = class271.field4371[(var64 + 2 & 0x3) + var63 * 4];
                            int var66 = class271.field4371[var63 * 4 + (var64 + 1 & 0x3)];
                            if (class286.field4590[var65][1] && class286.field4590[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var24[var21++] = var32;
                                        break;
                                    }
                                    if (var24[var68] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class278 var71 = class271.method1925((byte) 15, var27 - 1);
                        if (var71.field4489 && var71.field4471 != -1) {
                            var22 = class271.field4371[(arg6[var13][var14 + 1] + 2 & 0x3) + arg7[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var24[var21++] = var27;
                                    break;
                                }
                                if (var24[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class278 var73 = class271.method1925((byte) 15, var28 - 1);
                        if (var73.field4489 && var73.field4471 != -1) {
                            var23 = class271.field4371[arg7[var13 - 1][var14] * 4 + (arg6[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var24[var21++] = var28;
                                    break;
                                }
                                if (var24[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class278 var75 = class271.method1925((byte) 15, var29 - 1);
                        if (var75.field4489 && var75.field4471 != -1) {
                            var25 = class271.field4371[(arg6[var13][var14 - 1] & 0x3) + arg7[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var24[var21++] = var29;
                                    break;
                                }
                                if (var24[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class278 var77 = class271.method1925((byte) 15, var30 - 1);
                        if (var77.field4489 && var77.field4471 != -1) {
                            var26 = class271.field4371[arg7[var13 + 1][var14] * 4 + (arg6[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var24[var21++] = var30;
                                    break;
                                }
                                if (var24[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var24[var79];
                        boolean[] var81 = class286.field4590[var27 == var80 ? var22 : 0];
                        boolean[] var82 = class286.field4590[var28 == var80 ? var23 : 0];
                        boolean[] var83 = class286.field4590[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class286.field4590[var30 == var80 ? var26 : 0];
                        class278 var85 = class271.method1925((byte) 15, var80 - 1);
                        class206 var86 = class49.method315(var12, var85, 469531296);
                        var86.field3391 += 5;
                        var86.field3391 += var81.length - 2;
                        var86.field3391 += var82.length - 2;
                        var86.field3391 += var83.length - 2;
                        var86.field3391 += var84.length - 2;
                        var86.field3390++;
                    }
                }
            }
        }
        for (class206 var87 = (class206) var12.method458((byte) -16); var87 != null; var87 = (class206) var12.method455((byte) 63)) {
            var87.method1496();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg3[arg0][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg3[1][var88][var89] & 0x2) == 2 && arg0 > 0) {
                    var90 = arg0 - 1;
                } else {
                    var90 = arg0;
                }
                int var91 = arg4[var88][var89] & 0xFF;
                int var92 = arg11[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class278 var93 = class271.method1925((byte) 15, var92 - 1);
                    if (var93.field4471 == -1) {
                        continue;
                    }
                    class206 var94 = class49.method315(var12, var93, 469531296);
                    byte var95 = arg7[var88][var89];
                    byte var96 = arg6[var88][var89];
                    int var97 = class45.method290(var93.field4490, var93.field4471, true, arg5[var88][var89]);
                    int var98 = class45.method290(var93.field4490, var93.field4471, true, arg5[var88 + 1][var89]);
                    int var99 = class45.method290(var93.field4490, var93.field4471, true, arg5[var88 + 1][var89 + 1]);
                    int var100 = class45.method290(var93.field4490, var93.field4471, true, arg5[var88][var89 + 1]);
                    class309.method2186(arg10, arg9, var89, var91 != 0 && var93.field4489, var94, var88, var99, var98, var95, arg8, (byte) -68, var96, var97, var90, var100, arg1);
                }
                if ((arg4[var88][var89] & 0xFF) != 0 || var92 != 0 && arg7[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg11[var88][var89 + 1] & 0xFF;
                    int var108 = arg11[var88 - 1][var89] & 0xFF;
                    int var109 = arg11[var88 + 1][var89] & 0xFF;
                    int var110 = arg11[var88][var89 - 1] & 0xFF;
                    int var111 = arg11[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg11[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg11[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg11[var88 + 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class278 var115 = class271.method1925((byte) 15, var111 - 1);
                        if (var115.field4489 && var115.field4471 != -1) {
                            byte var116 = arg7[var88 - 1][var89 + 1];
                            byte var117 = arg6[var88 - 1][var89 + 1];
                            int var118 = class271.field4371[var116 * 4 + (var117 + 2 & 0x3)];
                            int var119 = class271.field4371[(var117 + 3 & 0x3) + var116 * 4];
                            if (class286.field4590[var119][1] && class286.field4590[var118][0]) {
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
                        class278 var121 = class271.method1925((byte) 15, var112 - 1);
                        if (var121.field4489 && var121.field4471 != -1) {
                            byte var122 = arg6[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class271.field4371[var123 * 4 + (var122 & 0x3)];
                            int var125 = class271.field4371[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class286.field4590[var124][1] && class286.field4590[var125][0]) {
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
                        class278 var127 = class271.method1925((byte) 15, var114 - 1);
                        if (var127.field4489 && var127.field4471 != -1) {
                            byte var128 = arg6[var88 + 1][var89 - 1];
                            byte var129 = arg7[var88 + 1][var89 - 1];
                            int var130 = class271.field4371[var129 * 4 + (var128 & 0x3)];
                            int var131 = class271.field4371[var129 * 4 + (var128 + 1 & 0x3)];
                            if (class286.field4590[var131][1] && class286.field4590[var130][0]) {
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
                        class278 var133 = class271.method1925((byte) 15, var113 - 1);
                        if (var133.field4489 && var133.field4471 != -1) {
                            byte var134 = arg6[var88 + 1][var89 + 1];
                            byte var135 = arg7[var88 + 1][var89 + 1];
                            int var136 = class271.field4371[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class271.field4371[(var134 + 1 & 0x3) + var135 * 4];
                            if (class286.field4590[var136][1] && class286.field4590[var137][0]) {
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
                        class278 var139 = class271.method1925((byte) 15, var107 - 1);
                        if (var139.field4489 && var139.field4471 != -1) {
                            var105 = class271.field4371[(arg6[var88][var89 + 1] + 2 & 0x3) + arg7[var88][var89 + 1] * 4];
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
                        class278 var141 = class271.method1925((byte) 15, var108 - 1);
                        if (var141.field4489 && var141.field4471 != -1) {
                            var103 = class271.field4371[(arg6[var88 - 1][var89] + 3 & 0x3) + arg7[var88 - 1][var89] * 4];
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
                    if (var110 != 0 && var92 != var110) {
                        class278 var143 = class271.method1925((byte) 15, var110 - 1);
                        if (var143.field4489 && var143.field4471 != -1) {
                            var104 = class271.field4371[arg7[var88][var89 - 1] * 4 + (arg6[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class278 var145 = class271.method1925((byte) 15, var109 - 1);
                        if (var145.field4489 && var145.field4471 != -1) {
                            var106 = class271.field4371[(arg6[var88 + 1][var89] + 1 & 0x3) + arg7[var88 + 1][var89] * 4];
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
                        boolean[] var149 = class286.field4590[var108 == var148 ? var103 : 0];
                        boolean[] var150 = class286.field4590[var110 == var148 ? var104 : 0];
                        boolean[] var151 = class286.field4590[var109 == var148 ? var106 : 0];
                        boolean[] var152 = class286.field4590[var107 == var148 ? var105 : 0];
                        class278 var153 = class271.method1925((byte) 15, var148 - 1);
                        class206 var154 = class49.method315(var12, var153, 469531296);
                        int var155 = class45.method290(var153.field4490, var153.field4471, true, arg5[var88][var89]) << 8 | 0xFF;
                        int var156 = class45.method290(var153.field4490, var153.field4471, true, arg5[var88 + 1][var89]) << 8 | 0xFF;
                        int var157 = class45.method290(var153.field4490, var153.field4471, true, arg5[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var158 = class45.method290(var153.field4490, var153.field4471, true, arg5[var88][var89 + 1]) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var152.length + var159 - 2;
                        int var161 = var149.length + var160 - 2;
                        int var162 = var150.length + var161 - 2;
                        int var163 = var151.length + var162 - 2;
                        boolean var164 = var111 != var148 && var149[0] && var152[1];
                        boolean var165 = var113 != var148 && var152[0] && var151[1];
                        int[] var166 = new int[var163];
                        byte var167 = 0;
                        boolean var168 = var112 != var148 && var150[0] && var149[1];
                        boolean var169 = var114 != var148 && var151[0] && var150[1];
                        int var170 = class193.method1430(0, arg10, true, var158, var156, 64, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 64, var154);
                        int var171 = class193.method1430(0, arg10, var164, var158, var156, 128, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 0, var154);
                        int var172 = class193.method1430(0, arg10, var165, var158, var156, 128, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 128, var154);
                        int var173 = class193.method1430(0, arg10, var168, var158, var156, 0, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 0, var154);
                        int var174 = class193.method1430(0, arg10, var169, var158, var156, 0, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 128, var154);
                        int var180 = var167 + 1;
                        var166[var167] = var170;
                        var166[var180++] = var172;
                        if (var152.length > 2) {
                            var166[var180++] = class193.method1430(0, arg10, var152[2], var158, var156, 128, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 64, var154);
                        }
                        var166[var180++] = var171;
                        if (var149.length > 2) {
                            var166[var180++] = class193.method1430(0, arg10, var149[2], var158, var156, 64, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 0, var154);
                        }
                        var166[var180++] = var173;
                        if (var150.length > 2) {
                            var166[var180++] = class193.method1430(0, arg10, var150[2], var158, var156, 0, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 64, var154);
                        }
                        var166[var180++] = var174;
                        if (var151.length > 2) {
                            var166[var180++] = class193.method1430(0, arg10, var151[2], var158, var156, 64, arg1, true, var88, 0.0F, arg9, var155, arg8, (int[][]) null, var157, var89, 128, var154);
                        }
                        var166[var180++] = var172;
                        var154.method1497(var90, var88, var89, var166, (int[]) null, true);
                    }
                }
            }
        }
        for (class206 var175 = (class206) var12.method458((byte) -16); var175 != null; var175 = (class206) var12.method455((byte) 86)) {
            if (var175.field3384 == 0) {
                var175.method1212((byte) 74);
            } else {
                var175.method1500();
            }
        }
        int var176 = var12.method460(25595);
        class206[] var177 = new class206[var176];
        long[] var178 = new long[var176];
        var12.method457(false, var177);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field2744;
        }
        class83.method566(var178, 21571, var177);
        if (arg2 != -24935) {
            method1313(-28, (float[][]) ((float[][]) null), -48, (byte[][][]) ((byte[][][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null));
        }
        return var177;
    }
}
