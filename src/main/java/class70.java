import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class70 extends class317 {

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "[I")
    public static int[] field950 = new int[14];

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "Z")
    public static boolean field953 = true;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[[I")
    public static int[][] field956 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method53(int arg0, int arg1) {
        int[][] var3 = this.field4840.method1625(arg1, -13241);
        int var4 = -4 / ((-arg0 - 31) / 37);
        field952++;
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 46, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            int[] var11 = var5[2];
            for (int var12 = 0; var12 < class326.field4933; var12++) {
                var8[var12] = 4096 - var6[var12];
                var10[var12] = 4096 - var7[var12];
                var9[var12] = 4096 - var11[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([[B[[B[[I[[[BI[[BI[[F[[F[[B[[F[[I)[Ltk;", line = 56)
    public static final class268[] method512(byte[][] arg0, byte[][] arg1, int[][] arg2, byte[][][] arg3, int arg4, byte[][] arg5, int arg6, float[][] arg7, float[][] arg8, byte[][] arg9, float[][] arg10, int[][] arg11) {
        field951++;
        class17 var12 = new class17(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg1[var13][var14] & 0xFF;
                int var16 = arg5[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class273 var17 = class189.method1328(var15 - 1, 4);
                    if (var17.field4095 == -1) {
                        continue;
                    }
                    class268 var18 = class255.method1742(-1633550088, var17, var12);
                    byte var19 = arg9[var13][var14];
                    int[] var20 = class119.field1604[var19];
                    var18.field3976 += var20.length / 2;
                    var18.field3952++;
                    if (var17.field4094 && var16 != 0) {
                        var18.field3976 += class317.field4851[var19];
                    }
                }
                if ((arg5[var13][var14] & 0xFF) != 0 || var15 != 0 && arg9[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg1[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg1[var13 - 1][var14] & 0xFF;
                    int var29 = arg1[var13][var14 - 1] & 0xFF;
                    int var30 = arg1[var13 + 1][var14] & 0xFF;
                    int var31 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var15 == var31) {
                        boolean var43 = false;
                    } else {
                        class273 var35 = class189.method1328(var31 - 1, 4);
                        if (var35.field4094 && var35.field4095 != -1) {
                            byte var36 = arg9[var13 - 1][var14 + 1];
                            byte var37 = arg0[var13 - 1][var14 + 1];
                            int var38 = class333.field5008[var36 * 4 + (var37 + 2 & 0x3)];
                            int var39 = class333.field5008[(var37 + 3 & 0x3) + var36 * 4];
                            if (class96.field1300[var39][1] && class96.field1300[var38][0]) {
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
                    if (var32 == 0 || var15 == var32) {
                        boolean var52 = false;
                    } else {
                        class273 var44 = class189.method1328(var32 - 1, 4);
                        if (var44.field4094 && var44.field4095 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg9[var13 - 1][var14 - 1];
                            int var47 = class333.field5008[(var45 + 3 & 0x3) + var46 * 4];
                            int var48 = class333.field5008[(var45 & 0x3) + var46 * 4];
                            if (class96.field1300[var48][1] && class96.field1300[var47][0]) {
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
                    if (var33 == 0 || var15 == var33) {
                        boolean var61 = false;
                    } else {
                        class273 var53 = class189.method1328(var33 - 1, 4);
                        if (var53.field4094 && var53.field4095 != -1) {
                            byte var54 = arg0[var13 + 1][var14 - 1];
                            byte var55 = arg9[var13 + 1][var14 - 1];
                            int var56 = class333.field5008[(var54 & 0x3) + var55 * 4];
                            int var57 = class333.field5008[(var54 + 1 & 0x3) + var55 * 4];
                            if (class96.field1300[var57][1] && class96.field1300[var56][0]) {
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
                    if (var34 == 0 || var15 == var34) {
                        boolean var70 = false;
                    } else {
                        class273 var62 = class189.method1328(var34 - 1, 4);
                        if (var62.field4094 && var62.field4095 != -1) {
                            byte var63 = arg0[var13 + 1][var14 + 1];
                            byte var64 = arg9[var13 + 1][var14 + 1];
                            int var65 = class333.field5008[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class333.field5008[(var63 + 1 & 0x3) + var64 * 4];
                            if (class96.field1300[var65][1] && class96.field1300[var66][0]) {
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
                    if (var26 != 0 && var15 != var26) {
                        class273 var71 = class189.method1328(var26 - 1, 4);
                        if (var71.field4094 && var71.field4095 != -1) {
                            var25 = class333.field5008[arg9[var13][var14 + 1] * 4 + (arg0[var13][var14 + 1] + 2 & 0x3)];
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
                    if (var28 != 0 && var15 != var28) {
                        class273 var73 = class189.method1328(var28 - 1, 4);
                        if (var73.field4094 && var73.field4095 != -1) {
                            var22 = class333.field5008[(arg0[var13 - 1][var14] + 3 & 0x3) + arg9[var13 - 1][var14] * 4];
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
                        class273 var75 = class189.method1328(var29 - 1, 4);
                        if (var75.field4094 && var75.field4095 != -1) {
                            var24 = class333.field5008[(arg0[var13][var14 - 1] & 0x3) + arg9[var13][var14 - 1] * 4];
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
                    if (var30 != 0 && var15 != var30) {
                        class273 var77 = class189.method1328(var30 - 1, 4);
                        if (var77.field4094 && var77.field4095 != -1) {
                            var27 = class333.field5008[(arg0[var13 + 1][var14] + 1 & 0x3) + arg9[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class96.field1300[var26 == var80 ? var25 : 0];
                        boolean[] var82 = class96.field1300[var30 == var80 ? var27 : 0];
                        boolean[] var83 = class96.field1300[var29 == var80 ? var24 : 0];
                        boolean[] var84 = class96.field1300[var28 == var80 ? var22 : 0];
                        class273 var85 = class189.method1328(var80 - 1, 4);
                        class268 var86 = class255.method1742(-1633550088, var85, var12);
                        var86.field3976 += 5;
                        var86.field3976 += var81.length - 2;
                        var86.field3976 += var84.length - 2;
                        var86.field3976 += var83.length - 2;
                        var86.field3976 += var82.length - 2;
                        var86.field3952++;
                    }
                }
            }
        }
        for (class268 var87 = (class268) var12.method110(0); var87 != null; var87 = (class268) var12.method115(0)) {
            var87.method1849();
        }
        if (arg4 >= -122) {
            method512((byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][][]) ((byte[][][]) null), -40, (byte[][]) ((byte[][]) null), -44, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null));
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg3[arg6][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg3[1][var88][var89] & 0x2) == 2 && arg6 > 0) {
                    var90 = arg6 - 1;
                } else {
                    var90 = arg6;
                }
                int var91 = arg5[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class273 var93 = class189.method1328(var92 - 1, 4);
                    if (var93.field4095 == -1) {
                        continue;
                    }
                    class268 var94 = class255.method1742(-1633550088, var93, var12);
                    byte var95 = arg9[var88][var89];
                    byte var96 = arg0[var88][var89];
                    int var97 = class85.method658(var93.field4097, true, var93.field4095, arg2[var88][var89]);
                    int var98 = class85.method658(var93.field4097, true, var93.field4095, arg2[var88 + 1][var89]);
                    int var99 = class85.method658(var93.field4097, true, var93.field4095, arg2[var88 + 1][var89 + 1]);
                    int var100 = class85.method658(var93.field4097, true, var93.field4095, arg2[var88][var89 + 1]);
                    class254.method1740(var96, var91 != 0 && var93.field4094, var95, var97, arg7, arg8, var89, var98, true, var88, arg10, var90, var99, arg11, var94, var100);
                }
                if ((arg5[var88][var89] & 0xFF) != 0 || var92 != 0 && arg9[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg1[var88 - 1][var89] & 0xFF;
                    int var107 = arg1[var88 + 1][var89] & 0xFF;
                    int var108 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var109 = arg1[var88][var89 - 1] & 0xFF;
                    int var110 = arg1[var88][var89 + 1] & 0xFF;
                    int var111 = 0;
                    int var112 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    int var113 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var114 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class273 var115 = class189.method1328(var113 - 1, 4);
                        if (var115.field4094 && var115.field4095 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg9[var88 - 1][var89 + 1];
                            int var118 = class333.field5008[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class333.field5008[var117 * 4 + (var116 + 3 & 0x3)];
                            if (class96.field1300[var119][1] && class96.field1300[var118][0]) {
                                var113 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var102 == var120) {
                                        var101[var102++] = var113;
                                        break;
                                    }
                                    if (var101[var120] == var113) {
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
                        class273 var121 = class189.method1328(var114 - 1, 4);
                        if (var121.field4094 && var121.field4095 != -1) {
                            byte var122 = arg9[var88 - 1][var89 - 1];
                            byte var123 = arg0[var88 - 1][var89 - 1];
                            int var124 = class333.field5008[var122 * 4 + (var123 + 3 & 0x3)];
                            int var125 = class333.field5008[(var123 & 0x3) + var122 * 4];
                            if (class96.field1300[var125][1] && class96.field1300[var124][0]) {
                                var114 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var102 == var126) {
                                        var101[var102++] = var114;
                                        break;
                                    }
                                    if (var101[var126] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var108 == 0 || var92 == var108) {
                        var108 = 0;
                    } else {
                        class273 var127 = class189.method1328(var108 - 1, 4);
                        if (var127.field4094 && var127.field4095 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg9[var88 + 1][var89 - 1];
                            int var130 = class333.field5008[(var128 & 0x3) + var129 * 4];
                            int var131 = class333.field5008[var129 * 4 + (var128 + 1 & 0x3)];
                            if (class96.field1300[var131][1] && class96.field1300[var130][0]) {
                                var108 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var102 == var132) {
                                        var101[var102++] = var108;
                                        break;
                                    }
                                    if (var101[var132] == var108) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var108 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class273 var133 = class189.method1328(var112 - 1, 4);
                        if (var133.field4094 && var133.field4095 != -1) {
                            byte var134 = arg9[var88 + 1][var89 + 1];
                            byte var135 = arg0[var88 + 1][var89 + 1];
                            int var136 = class333.field5008[(var135 + 2 & 0x3) + var134 * 4];
                            int var137 = class333.field5008[(var135 + 1 & 0x3) + var134 * 4];
                            if (class96.field1300[var136][1] && class96.field1300[var137][0]) {
                                var112 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var102 == var138) {
                                        var101[var102++] = var112;
                                        break;
                                    }
                                    if (var101[var138] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class273 var139 = class189.method1328(var110 - 1, 4);
                        if (var139.field4094 && var139.field4095 != -1) {
                            var103 = class333.field5008[(arg0[var88][var89 + 1] + 2 & 0x3) + arg9[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var102 == var140) {
                                    var101[var102++] = var110;
                                    break;
                                }
                                if (var101[var140] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var106 != 0 && var92 != var106) {
                        class273 var141 = class189.method1328(var106 - 1, 4);
                        if (var141.field4094 && var141.field4095 != -1) {
                            var104 = class333.field5008[arg9[var88 - 1][var89] * 4 + (arg0[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var102 == var142) {
                                    var101[var102++] = var106;
                                    break;
                                }
                                if (var101[var142] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class273 var143 = class189.method1328(var109 - 1, 4);
                        if (var143.field4094 && var143.field4095 != -1) {
                            var111 = class333.field5008[(arg0[var88][var89 - 1] & 0x3) + arg9[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var102 == var144) {
                                    var101[var102++] = var109;
                                    break;
                                }
                                if (var101[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class273 var145 = class189.method1328(var107 - 1, 4);
                        if (var145.field4094 && var145.field4095 != -1) {
                            var105 = class333.field5008[(arg0[var88 + 1][var89] + 1 & 0x3) + arg9[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var102 == var146) {
                                    var101[var102++] = var107;
                                    break;
                                }
                                if (var101[var146] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var102; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class96.field1300[var106 == var148 ? var104 : 0];
                        boolean[] var150 = class96.field1300[var110 == var148 ? var103 : 0];
                        boolean[] var151 = class96.field1300[var109 == var148 ? var111 : 0];
                        boolean[] var152 = class96.field1300[var107 == var148 ? var105 : 0];
                        class273 var153 = class189.method1328(var148 - 1, 4);
                        class268 var154 = class255.method1742(-1633550088, var153, var12);
                        int var155 = class85.method658(var153.field4097, true, var153.field4095, arg2[var88][var89]) << 8 | 0xFF;
                        int var156 = class85.method658(var153.field4097, true, var153.field4095, arg2[var88 + 1][var89]) << 8 | 0xFF;
                        int var157 = class85.method658(var153.field4097, true, var153.field4095, arg2[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var158 = class85.method658(var153.field4097, true, var153.field4095, arg2[var88][var89 + 1]) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var150.length + var159 - 2;
                        int var161 = var149.length + var160 - 2;
                        int var162 = var151.length + var161 - 2;
                        int var163 = var152.length + var162 - 2;
                        int[] var164 = new int[var163];
                        byte var165 = 0;
                        boolean var166 = var113 != var148 && var149[0] && var150[1];
                        boolean var167 = var114 != var148 && var151[0] && var149[1];
                        boolean var168 = var112 != var148 && var150[0] && var152[1];
                        boolean var169 = var108 != var148 && var152[0] && var151[1];
                        int var170 = class52.method356(var89, true, arg11, arg10, (byte) -89, (int[][]) null, 0, var88, 64, var154, var158, 64, var157, arg7, var155, 0.0F, var156, arg8);
                        int var171 = class52.method356(var89, var166, arg11, arg10, (byte) -128, (int[][]) null, 0, var88, 0, var154, var158, 128, var157, arg7, var155, 0.0F, var156, arg8);
                        int var172 = class52.method356(var89, var168, arg11, arg10, (byte) -77, (int[][]) null, 0, var88, 128, var154, var158, 128, var157, arg7, var155, 0.0F, var156, arg8);
                        int var173 = class52.method356(var89, var167, arg11, arg10, (byte) -98, (int[][]) null, 0, var88, 0, var154, var158, 0, var157, arg7, var155, 0.0F, var156, arg8);
                        int var174 = class52.method356(var89, var169, arg11, arg10, (byte) -63, (int[][]) null, 0, var88, 128, var154, var158, 0, var157, arg7, var155, 0.0F, var156, arg8);
                        int var180 = var165 + 1;
                        var164[var165] = var170;
                        var164[var180++] = var172;
                        if (var150.length > 2) {
                            var164[var180++] = class52.method356(var89, var150[2], arg11, arg10, (byte) -69, (int[][]) null, 0, var88, 64, var154, var158, 128, var157, arg7, var155, 0.0F, var156, arg8);
                        }
                        var164[var180++] = var171;
                        if (var149.length > 2) {
                            var164[var180++] = class52.method356(var89, var149[2], arg11, arg10, (byte) -128, (int[][]) null, 0, var88, 0, var154, var158, 64, var157, arg7, var155, 0.0F, var156, arg8);
                        }
                        var164[var180++] = var173;
                        if (var151.length > 2) {
                            var164[var180++] = class52.method356(var89, var151[2], arg11, arg10, (byte) -68, (int[][]) null, 0, var88, 64, var154, var158, 0, var157, arg7, var155, 0.0F, var156, arg8);
                        }
                        var164[var180++] = var174;
                        if (var152.length > 2) {
                            var164[var180++] = class52.method356(var89, var152[2], arg11, arg10, (byte) -68, (int[][]) null, 0, var88, 128, var154, var158, 64, var157, arg7, var155, 0.0F, var156, arg8);
                        }
                        var164[var180++] = var172;
                        var154.method1847(var90, var88, var89, var164, (int[]) null, true);
                    }
                }
            }
        }
        for (class268 var175 = (class268) var12.method110(0); var175 != null; var175 = (class268) var12.method115(0)) {
            if (var175.field3955 == 0) {
                var175.method1274((byte) -26);
            } else {
                var175.method1844();
            }
        }
        int var176 = var12.method114(31);
        long[] var177 = new long[var176];
        class268[] var178 = new class268[var176];
        var12.method117(var178, (byte) 115);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field2522;
        }
        class148.method1077(var178, false, var177);
        return var178;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[I", line = 996)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            this.method53(-84, -123);
        }
        field954++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -76);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 1028)
    public class70() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V", line = 1032)
    public static void method513(byte arg0) {
        field956 = (int[][]) null;
        field950 = null;
        int var1 = 112 % ((arg0 - 20) / 63);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)V", line = 1045)
    public static final void method514(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class313.field4724; var3++) {
            for (int var4 = 0; var4 < class245.field3524; var4++) {
                for (int var5 = 0; var5 < class99.field1356; var5++) {
                    class202 var6 = class142.field1940[var3][var4][var5];
                    if (var6 != null) {
                        class7 var7 = var6.field2873;
                        if (var7 != null && var7.field57.method943()) {
                            class170.method1202(var7.field57, var3, var4, var5, 1, 1);
                            if (var7.field55 != null && var7.field55.method943()) {
                                class170.method1202(var7.field55, var3, var4, var5, 1, 1);
                                var7.field57.method941(var7.field55, 0, 0, 0, false);
                                var7.field55 = var7.field55.method939(arg0, arg1, arg2);
                            }
                            var7.field57 = var7.field57.method939(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2875; var8++) {
                            class280 var9 = var6.field2896[var8];
                            if (var9 != null && var9.field4199.method943()) {
                                class170.method1202(var9.field4199, var3, var4, var5, var9.field4205 + 1 - var9.field4204, var9.field4198 - var9.field4200 + 1);
                                var9.field4199 = var9.field4199.method939(arg0, arg1, arg2);
                            }
                        }
                        class306 var10 = var6.field2869;
                        if (var10 != null && var10.field4586.method943()) {
                            class51.method351(var10.field4586, var3, var4, var5);
                            var10.field4586 = var10.field4586.method939(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lcg;II)V", line = 1120)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field955++;
        int var4 = -53 % ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
    }
}
