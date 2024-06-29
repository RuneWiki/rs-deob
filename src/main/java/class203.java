import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class203 extends class59 {

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "Lok;")
    public static class41 field3268 = class137.method956("hint_mapedge", 45);

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "Ldb;")
    public static class69 field3259 = new class69();

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "Lok;")
    public static class41 field3282 = class137.method956("Lade Titelbild )2 ", 45);

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "[I")
    public static int[] field3280 = new int[2000];

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "Lok;")
    public static class41 field3284 = class137.method956(")1", 45);

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "[Lok;")
    public static class41[] field3286 = new class41[500];

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "Lig;")
    public class145 field3258;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "Lpi;")
    public class207 field3276;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "Lo;")
    public class215 field3266;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "Lgi;")
    public class291 field3257;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "Lea;")
    public static class67 field3281;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "[I")
    public static int[] field3278;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "[I")
    public static int[] field3279;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILlb;)V", line = 19)
    public static final void method1437(int arg0, class112 arg1) {
        field3254++;
        int var2 = arg1.method756(123);
        class310.field5224 = new class156[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class310.field5224[var3] = new class156();
            class310.field5224[var3].field2463 = arg1.method756(99);
            class310.field5224[var3].field2470 = arg1.method790((byte) 99);
        }
        class140.field2161 = arg1.method756(89);
        class134.field2004 = arg1.method756(125);
        class310.field5218 = arg1.method756(112);
        class160.field2537 = new class79[class134.field2004 + 1 - class140.field2161];
        for (int var4 = 0; var4 < class310.field5218; var4++) {
            int var5 = arg1.method756(92);
            class79 var6 = class160.field2537[var5] = new class79();
            var6.field3120 = arg1.method792(2);
            var6.field3114 = arg1.method779(-27100);
            var6.field1168 = var5 + class140.field2161;
            var6.field1160 = arg1.method790((byte) 109);
            var6.field1162 = arg1.method790((byte) -117);
        }
        class27.field400 = arg1.method779(-27100);
        if (arg0 == 4) {
            class92.field1343 = true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class269.method1908(arg3 ^ 0x35832012, class239.field3829[arg0], arg2, arg1 + arg4, -arg4 + arg1);
        int var5 = 0;
        if (arg3 != 897785857) {
            field3260 = -91;
        }
        field3267++;
        int var6 = -1;
        int var7 = arg4;
        int var8 = -arg4;
        while (var5 < var7) {
            var6 += 2;
            var8 += var6;
            var5++;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int var9 = arg1 + var5;
                int[] var10 = class239.field3829[arg0 + var7];
                int[] var11 = class239.field3829[arg0 - var7];
                int var12 = arg1 - var5;
                class269.method1908(19, var10, arg2, var9, var12);
                class269.method1908(19, var11, arg2, var9, var12);
            }
            int var13 = arg1 + var7;
            int[] var14 = class239.field3829[arg0 + var5];
            int[] var15 = class239.field3829[arg0 - var5];
            int var16 = arg1 - var7;
            class269.method1908(19, var14, arg2, var13, var16);
            class269.method1908(19, var15, arg2, var13, var16);
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V", line = 122)
    public final void method1439(byte arg0) {
        if (arg0 != 49) {
            method1437(-22, (class112) null);
        }
        this.field3257 = null;
        this.field3258 = null;
        this.field3266 = null;
        this.field3276 = null;
        field3274++;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 137)
    public static void method1440(int arg0) {
        field3282 = null;
        field3284 = null;
        field3279 = null;
        field3280 = null;
        field3268 = null;
        field3278 = null;
        field3281 = null;
        if (arg0 != 1) {
            field3280 = (int[]) null;
        }
        field3259 = null;
        field3286 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([[B[[B[[F[[[B[[I[[F[[II[[FI[[B[[B)[Ldg;", line = 176)
    public static final class6[] method1441(byte[][] arg0, byte[][] arg1, float[][] arg2, byte[][][] arg3, int[][] arg4, float[][] arg5, int[][] arg6, int arg7, float[][] arg8, int arg9, byte[][] arg10, byte[][] arg11) {
        class86 var12 = new class86(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg0[var13][var14] & 0xFF;
                int var16 = arg1[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class117 var17 = class301.method2075(arg9 ^ 0xFFFFBFAA, var15 - 1);
                    if (var17.field1710 == -1) {
                        continue;
                    }
                    class6 var18 = class236.method1697(var12, var17, (byte) 16);
                    byte var19 = arg11[var13][var14];
                    int[] var20 = class301.field4884[var19];
                    var18.field93 += var20.length / 2;
                    var18.field87++;
                    if (var17.field1708 && var16 != 0) {
                        var18.field93 += class62.field905[var19];
                    }
                }
                if ((arg1[var13][var14] & 0xFF) != 0 || var15 != 0 && arg11[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg0[var13][var14 + 1] & 0xFF;
                    int var28 = arg0[var13 - 1][var14] & 0xFF;
                    int var29 = arg0[var13][var14 - 1] & 0xFF;
                    int var30 = arg0[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg0[var13 + 1][var14] & 0xFF;
                    int var32 = arg0[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg0[var13 - 1][var14 + 1] & 0xFF;
                    int var34 = arg0[var13 + 1][var14 + 1] & 0xFF;
                    if (var33 == 0 || var15 == var33) {
                        boolean var43 = false;
                    } else {
                        class117 var35 = class301.method2075(1000, var33 - 1);
                        if (var35.field1708 && var35.field1710 != -1) {
                            byte var36 = arg10[var13 - 1][var14 + 1];
                            byte var37 = arg11[var13 - 1][var14 + 1];
                            int var38 = class131.field1963[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class131.field1963[(var36 + 3 & 0x3) + var37 * 4];
                            if (class146.field2222[var39][1] && class146.field2222[var38][0]) {
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
                    if (var30 == 0 || var15 == var30) {
                        boolean var52 = false;
                    } else {
                        class117 var44 = class301.method2075(arg9 ^ 0xFFFFBFAA, var30 - 1);
                        if (var44.field1708 && var44.field1710 != -1) {
                            byte var45 = arg11[var13 - 1][var14 - 1];
                            byte var46 = arg10[var13 - 1][var14 - 1];
                            int var47 = class131.field1963[(var46 & 0x3) + var45 * 4];
                            int var48 = class131.field1963[(var46 + 3 & 0x3) + var45 * 4];
                            if (class146.field2222[var47][1] && class146.field2222[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var23[var21++] = var30;
                                        break;
                                    }
                                    if (var23[var50] == var30) {
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
                        class117 var53 = class301.method2075(1000, var32 - 1);
                        if (var53.field1708 && var53.field1710 != -1) {
                            byte var54 = arg10[var13 + 1][var14 - 1];
                            byte var55 = arg11[var13 + 1][var14 - 1];
                            int var56 = class131.field1963[(var54 & 0x3) + var55 * 4];
                            int var57 = class131.field1963[(var54 + 1 & 0x3) + var55 * 4];
                            if (class146.field2222[var57][1] && class146.field2222[var56][0]) {
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
                        class117 var62 = class301.method2075(1000, var34 - 1);
                        if (var62.field1708 && var62.field1710 != -1) {
                            byte var63 = arg10[var13 + 1][var14 + 1];
                            byte var64 = arg11[var13 + 1][var14 + 1];
                            int var65 = class131.field1963[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class131.field1963[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class146.field2222[var65][1] && class146.field2222[var66][0]) {
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
                    if (var27 != 0 && var15 != var27) {
                        class117 var71 = class301.method2075(1000, var27 - 1);
                        if (var71.field1708 && var71.field1710 != -1) {
                            var22 = class131.field1963[(arg10[var13][var14 + 1] + 2 & 0x3) + arg11[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var23[var21++] = var27;
                                    break;
                                }
                                if (var23[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var15 != var28) {
                        class117 var73 = class301.method2075(1000, var28 - 1);
                        if (var73.field1708 && var73.field1710 != -1) {
                            var25 = class131.field1963[(arg10[var13 - 1][var14] + 3 & 0x3) + arg11[var13 - 1][var14] * 4];
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
                    if (var29 != 0 && var15 != var29) {
                        class117 var75 = class301.method2075(arg9 + 18342, var29 - 1);
                        if (var75.field1708 && var75.field1710 != -1) {
                            var24 = class131.field1963[arg11[var13][var14 - 1] * 4 + (arg10[var13][var14 - 1] & 0x3)];
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
                    if (var31 != 0 && var15 != var31) {
                        class117 var77 = class301.method2075(1000, var31 - 1);
                        if (var77.field1708 && var77.field1710 != -1) {
                            var26 = class131.field1963[(arg10[var13 + 1][var14] + 1 & 0x3) + arg11[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var23[var21++] = var31;
                                    break;
                                }
                                if (var23[var78] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var23[var79];
                        boolean[] var81 = class146.field2222[var27 == var80 ? var22 : 0];
                        boolean[] var82 = class146.field2222[var28 == var80 ? var25 : 0];
                        boolean[] var83 = class146.field2222[var31 == var80 ? var26 : 0];
                        boolean[] var84 = class146.field2222[var29 == var80 ? var24 : 0];
                        class117 var85 = class301.method2075(1000, var80 - 1);
                        class6 var86 = class236.method1697(var12, var85, (byte) 16);
                        var86.field93 += 5;
                        var86.field93 += var81.length - 2;
                        var86.field93 += var82.length - 2;
                        var86.field93 += var84.length - 2;
                        var86.field93 += var83.length - 2;
                        var86.field87++;
                    }
                }
            }
        }
        field3272++;
        for (class6 var87 = (class6) var12.method609(arg9 ^ 0x43EB); var87 != null; var87 = (class6) var12.method616(-122)) {
            var87.method21();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg0[var88][var89] & 0xFF;
                int var91;
                if ((arg3[arg7][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg3[1][var88][var89] & 0x2) == 2 && arg7 > 0) {
                    var91 = arg7 - 1;
                } else {
                    var91 = arg7;
                }
                int var92 = arg1[var88][var89] & 0xFF;
                if (var90 != 0) {
                    class117 var93 = class301.method2075(arg9 + 18342, var90 - 1);
                    if (var93.field1710 == -1) {
                        continue;
                    }
                    class6 var94 = class236.method1697(var12, var93, (byte) 16);
                    byte var95 = arg10[var88][var89];
                    byte var96 = arg11[var88][var89];
                    int var97 = class221.method1586(var93.field1700, arg6[var88][var89], var93.field1710, arg9 + 17418);
                    int var98 = class221.method1586(var93.field1700, arg6[var88 + 1][var89], var93.field1710, 116);
                    int var99 = class221.method1586(var93.field1700, arg6[var88 + 1][var89 + 1], var93.field1710, 64);
                    int var100 = class221.method1586(var93.field1700, arg6[var88][var89 + 1], var93.field1710, arg9 ^ 0xFFFFBC1A);
                    class214.method1516(arg4, var89, arg2, arg8, var91, var94, arg5, var99, var95, var96, var97, var98, (byte) 15, var92 != 0 && var93.field1708, var100, var88);
                }
                if ((arg1[var88][var89] & 0xFF) != 0 || var90 != 0 && arg11[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg0[var88][var89 + 1] & 0xFF;
                    int var108 = arg0[var88 - 1][var89] & 0xFF;
                    int var109 = arg0[var88][var89 - 1] & 0xFF;
                    int var110 = arg0[var88 + 1][var89] & 0xFF;
                    int var111 = arg0[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg0[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg0[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg0[var88 + 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var90 == var111) {
                        var111 = 0;
                    } else {
                        class117 var115 = class301.method2075(arg9 ^ 0xFFFFBFAA, var111 - 1);
                        if (var115.field1708 && var115.field1710 != -1) {
                            byte var116 = arg10[var88 - 1][var89 + 1];
                            byte var117 = arg11[var88 - 1][var89 + 1];
                            int var118 = class131.field1963[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class131.field1963[(var116 + 3 & 0x3) + var117 * 4];
                            if (class146.field2222[var119][1] && class146.field2222[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var104 == var120) {
                                        var101[var104++] = var111;
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
                        class117 var121 = class301.method2075(1000, var112 - 1);
                        if (var121.field1708 && var121.field1710 != -1) {
                            byte var122 = arg11[var88 - 1][var89 - 1];
                            byte var123 = arg10[var88 - 1][var89 - 1];
                            int var124 = class131.field1963[(var123 & 0x3) + var122 * 4];
                            int var125 = class131.field1963[(var123 + 3 & 0x3) + var122 * 4];
                            if (class146.field2222[var124][1] && class146.field2222[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var104 == var126) {
                                        var101[var104++] = var112;
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
                    if (var114 == 0 || var90 == var114) {
                        var114 = 0;
                    } else {
                        class117 var127 = class301.method2075(1000, var114 - 1);
                        if (var127.field1708 && var127.field1710 != -1) {
                            byte var128 = arg10[var88 + 1][var89 - 1];
                            byte var129 = arg11[var88 + 1][var89 - 1];
                            int var130 = class131.field1963[var129 * 4 + (var128 + 1 & 0x3)];
                            int var131 = class131.field1963[(var128 & 0x3) + var129 * 4];
                            if (class146.field2222[var130][1] && class146.field2222[var131][0]) {
                                var114 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var104 == var132) {
                                        var101[var104++] = var114;
                                        break;
                                    }
                                    if (var101[var132] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var113 == 0 || var90 == var113) {
                        var113 = 0;
                    } else {
                        class117 var133 = class301.method2075(1000, var113 - 1);
                        if (var133.field1708 && var133.field1710 != -1) {
                            byte var134 = arg10[var88 + 1][var89 + 1];
                            byte var135 = arg11[var88 + 1][var89 + 1];
                            int var136 = class131.field1963[var135 * 4 + (var134 + 1 & 0x3)];
                            int var137 = class131.field1963[(var134 + 2 & 0x3) + var135 * 4];
                            if (class146.field2222[var137][1] && class146.field2222[var136][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var104 == var138) {
                                        var101[var104++] = var113;
                                        break;
                                    }
                                    if (var101[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var107 != 0 && var90 != var107) {
                        class117 var139 = class301.method2075(1000, var107 - 1);
                        if (var139.field1708 && var139.field1710 != -1) {
                            var105 = class131.field1963[(arg10[var88][var89 + 1] + 2 & 0x3) + arg11[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var104 == var140) {
                                    var101[var104++] = var107;
                                    break;
                                }
                                if (var101[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var90 != var108) {
                        class117 var141 = class301.method2075(1000, var108 - 1);
                        if (var141.field1708 && var141.field1710 != -1) {
                            var102 = class131.field1963[arg11[var88 - 1][var89] * 4 + (arg10[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var104 == var142) {
                                    var101[var104++] = var108;
                                    break;
                                }
                                if (var101[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var90 != var109) {
                        class117 var143 = class301.method2075(arg9 + 18342, var109 + -1);
                        if (var143.field1708 && var143.field1710 != -1) {
                            var103 = class131.field1963[arg11[var88][var89 - 1] * 4 + (arg10[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var104 == var144) {
                                    var101[var104++] = var109;
                                    break;
                                }
                                if (var101[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var90 != var110) {
                        class117 var145 = class301.method2075(1000, var110 - 1);
                        if (var145.field1708 && var145.field1710 != -1) {
                            var106 = class131.field1963[(arg10[var88 + 1][var89] + 1 & 0x3) + arg11[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var104 == var146) {
                                    var101[var104++] = var110;
                                    break;
                                }
                                if (var101[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var104; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class146.field2222[var108 == var148 ? var102 : 0];
                        boolean[] var150 = class146.field2222[var107 == var148 ? var105 : 0];
                        boolean[] var151 = class146.field2222[var109 == var148 ? var103 : 0];
                        boolean[] var152 = class146.field2222[var110 == var148 ? var106 : 0];
                        class117 var153 = class301.method2075(1000, var148 - 1);
                        class6 var154 = class236.method1697(var12, var153, (byte) 16);
                        int var155 = class221.method1586(var153.field1700, arg6[var88][var89], var153.field1710, arg9 + 17457) << 8 | 0xFF;
                        int var156 = class221.method1586(var153.field1700, arg6[var88 + 1][var89], var153.field1710, arg9 + 17458) << 8 | 0xFF;
                        byte var157 = 6;
                        int var158 = class221.method1586(var153.field1700, arg6[var88 + 1][var89 + 1], var153.field1710, 80) << 8 | 0xFF;
                        int var159 = class221.method1586(var153.field1700, arg6[var88][var89 + 1], var153.field1710, 122) << 8 | 0xFF;
                        boolean var160 = var111 != var148 && var149[0] && var150[1];
                        int var161 = var150.length + var157 - 2;
                        int var162 = var149.length + var161 - 2;
                        int var163 = var151.length + var162 - 2;
                        boolean var164 = var114 != var148 && var152[0] && var151[1];
                        boolean var165 = var113 != var148 && var150[0] && var152[1];
                        boolean var166 = var112 != var148 && var151[0] && var149[1];
                        int var167 = var152.length + var163 - 2;
                        int var168 = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) -97, 0, var89, true, arg8, 0.0F, arg4, var159, var158, var154, 64, 64);
                        int[] var169 = new int[var167];
                        int var170 = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) 22, 0, var89, var160, arg8, 0.0F, arg4, var159, var158, var154, 0, 128);
                        int var171 = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) 101, 0, var89, var165, arg8, 0.0F, arg4, var159, var158, var154, 128, 128);
                        byte var172 = 0;
                        int var173 = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) -94, 0, var89, var166, arg8, 0.0F, arg4, var159, var158, var154, 0, 0);
                        int var174 = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) -80, 0, var89, var164, arg8, 0.0F, arg4, var159, var158, var154, 128, 0);
                        int var180 = var172 + 1;
                        var169[var172] = var168;
                        var169[var180++] = var171;
                        if (var150.length > 2) {
                            var169[var180++] = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) 42, 0, var89, var150[2], arg8, 0.0F, arg4, var159, var158, var154, 64, 128);
                        }
                        var169[var180++] = var170;
                        if (var149.length > 2) {
                            var169[var180++] = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) 105, 0, var89, var149[2], arg8, 0.0F, arg4, var159, var158, var154, 0, 64);
                        }
                        var169[var180++] = var173;
                        if (var151.length > 2) {
                            var169[var180++] = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) 1, 0, var89, var151[2], arg8, 0.0F, arg4, var159, var158, var154, 64, 0);
                        }
                        var169[var180++] = var174;
                        if (var152.length > 2) {
                            var169[var180++] = class149.method1035(var88, arg2, (int[][]) null, arg5, var155, var156, (byte) -122, 0, var89, var152[2], arg8, 0.0F, arg4, var159, var158, var154, 128, 64);
                        }
                        var169[var180++] = var171;
                        var154.method25(var91, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        for (class6 var175 = (class6) var12.method609(-51); var175 != null; var175 = (class6) var12.method616(125)) {
            if (var175.field81 == 0) {
                var175.method418(arg9 ^ 0xFFFFA779);
            } else {
                var175.method26();
            }
        }
        int var176 = var12.method614(arg9 + 17321);
        class6[] var177 = new class6[var176];
        if (arg9 != -17342) {
            method1442((int[]) null, 123, 99, -5, 117, 25);
        }
        var12.method612(arg9 ^ 0xFFFFBCC2, var177);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field844;
        }
        class130.method919(var177, 1, var178);
        return var177;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([IIIIII)V", line = 1108)
    public static final void method1442(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class308 var6 = class205.field3312[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class289 var7 = var6.field5199;
        if (var7 != null) {
            int var8 = var7.field4693;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class170 var10 = var6.field5212;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2721;
        int var12 = var10.field2713;
        int var13 = var10.field2703;
        int var14 = var10.field2715;
        int[] var15 = class156.field2468[var11];
        int[] var16 = class298.field4834[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
