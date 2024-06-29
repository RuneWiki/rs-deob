import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class275 extends class224 {

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    private int field4634 = -1;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "[Z")
    public static boolean[] field4626 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "S")
    public static short field4622 = 256;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "[J")
    public static long[] field4632 = new long[32];

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "Luf;")
    private static class168 field4636 = class148.method1019(-1720, "Loaded interfaces");

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "Luf;")
    public static class168 field4624 = field4636;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "Lwa;")
    public static class284 field4637;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "[I")
    public int[] field4628;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZLj;)V", line = 6)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field4629++;
        if (!arg1 && arg0 == 0) {
            this.field4634 = arg2.method1069(72);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 19)
    public class275() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IB)I", line = 26)
    public static final int method1897(int arg0, byte arg1) {
        if (arg1 < 81) {
            method1902(-19, -49);
        }
        field4621++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[[I", line = 37)
    public int[][] method17(int arg0, byte arg1) {
        field4631++;
        if (arg1 != -77) {
            this.field4623 = -53;
        }
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756 && this.method1899(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (class115.field1791 == this.field4633 ? arg0 : this.field4633 * arg0 / class115.field1791) * this.field4623;
            int[] var7 = var3[1];
            if (class187.field2961 == this.field4623) {
                for (int var8 = 0; var8 < class187.field2961; var8++) {
                    int var9 = this.field4628[var6++];
                    var5[var8] = class159.method1119(var9 << 4, 4080);
                    var7[var8] = class159.method1119(4080, var9 >> 4);
                    var4[var8] = class159.method1119(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class187.field2961; var10++) {
                    int var11 = this.field4623 * var10 / class187.field2961;
                    int var12 = this.field4628[var6 + var11];
                    var5[var10] = class159.method1119(255, var12) << 4;
                    var7[var10] = class159.method1119(4080, var12 >> 4);
                    var4[var10] = class159.method1119(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 106)
    public final void method1273(int arg0) {
        field4625++;
        super.method1273(arg0 ^ 0x0);
        this.field4628 = null;
        if (arg0 != -17545) {
            method1898(86, (class75) null);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILcj;)V", line = 122)
    public static final void method1898(int arg0, class75 arg1) {
        field4620++;
        class286 var2 = null;
        try {
            class112 var3 = arg1.method436(-27632, "runescape");
            while (var3.field1746 == 0) {
                class300.method2054(10, 1L);
            }
            if (var3.field1746 == 1) {
                var2 = (class286) var3.field1742;
                class153 var4 = class155.method1101(true);
                var2.method1978(0, var4.field2359, var4.field2367, true);
            }
            if (arg0 >= -95) {
                method1901((byte[][]) ((byte[][]) null), 115, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), -4, (byte[][][]) ((byte[][][]) null));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1977(114);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(Z)Z", line = 160)
    public final boolean method1899(boolean arg0) {
        if (!arg0) {
            this.method1899(true);
        }
        field4627++;
        if (this.field4628 != null) {
            return true;
        } else if (this.field4634 >= 0) {
            class49 var2 = class43.method235(class72.field961, -124, this.field4634);
            var2.method274();
            this.field4628 = var2.field598;
            this.field4633 = var2.field4808;
            this.field4623 = var2.field4801;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V", line = 186)
    public static void method1900(int arg0) {
        field4637 = null;
        field4626 = null;
        field4636 = null;
        field4624 = null;
        if (arg0 != 255) {
            field4632 = (long[]) null;
        }
        field4632 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([[BI[[B[[F[[I[[B[[F[[F[[I[[BI[[[B)[Lvk;", line = 201)
    public static final class192[] method1901(byte[][] arg0, int arg1, byte[][] arg2, float[][] arg3, int[][] arg4, byte[][] arg5, float[][] arg6, float[][] arg7, int[][] arg8, byte[][] arg9, int arg10, byte[][][] arg11) {
        class80 var12 = new class80(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg0[var13][var14] & 0xFF;
                int var16 = arg9[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class203 var17 = class76.method449(1446, var16 - 1);
                    if (var17.field3341 == -1) {
                        continue;
                    }
                    class192 var18 = class252.method1725(var17, var12, 409);
                    byte var19 = arg2[var13][var14];
                    int[] var20 = class145.field2253[var19];
                    var18.field3107 += var20.length / 2;
                    var18.field3122++;
                    if (var17.field3332 && var15 != 0) {
                        var18.field3107 += class244.field4162[var19];
                    }
                }
                if ((arg0[var13][var14] & 0xFF) != 0 || var16 != 0 && arg2[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg9[var13][var14 + 1] & 0xFF;
                    int var28 = arg9[var13][var14 - 1] & 0xFF;
                    int var29 = arg9[var13 + 1][var14] & 0xFF;
                    int var30 = arg9[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg9[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg9[var13 - 1][var14] & 0xFF;
                    int var33 = arg9[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg9[var13 + 1][var14 - 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class203 var35 = class76.method449(1446, var31 - 1);
                        if (var35.field3332 && var35.field3341 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg2[var13 - 1][var14 + 1];
                            int var38 = class254.field4343[var37 * 4 + (var36 + 3 & 0x3)];
                            int var39 = class254.field4343[var37 * 4 + (var36 + 2 & 0x3)];
                            if (class62.field816[var38][1] && class62.field816[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var41] == var31) {
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
                        class203 var44 = class76.method449(1446, var30 - 1);
                        if (var44.field3332 && var44.field3341 != -1) {
                            byte var45 = arg5[var13 - 1][var14 - 1];
                            byte var46 = arg2[var13 - 1][var14 - 1];
                            int var47 = class254.field4343[var46 * 4 + (var45 + 3 & 0x3)];
                            int var48 = class254.field4343[(var45 & 0x3) + var46 * 4];
                            if (class62.field816[var48][1] && class62.field816[var47][0]) {
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class203 var53 = class76.method449(1446, var34 - 1);
                        if (var53.field3332 && var53.field3341 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class254.field4343[(var54 & 0x3) + var55 * 4];
                            int var57 = class254.field4343[(var54 + 1 & 0x3) + var55 * 4];
                            if (class62.field816[var57][1] && class62.field816[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var59] == var34) {
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
                        class203 var62 = class76.method449(1446, var33 - 1);
                        if (var62.field3332 && var62.field3341 != -1) {
                            byte var63 = arg5[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class254.field4343[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class254.field4343[(var63 + 1 & 0x3) + var64 * 4];
                            if (class62.field816[var65][1] && class62.field816[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class203 var71 = class76.method449(1446, var27 - 1);
                        if (var71.field3332 && var71.field3341 != -1) {
                            var23 = class254.field4343[(arg5[var13][var14 + 1] + 2 & 0x3) + arg2[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var32 != 0 && var16 != var32) {
                        class203 var73 = class76.method449(1446, var32 - 1);
                        if (var73.field3332 && var73.field3341 != -1) {
                            var26 = class254.field4343[arg2[var13 - 1][var14] * 4 + (arg5[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var32;
                                    break;
                                }
                                if (var22[var74] == var32) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class203 var75 = class76.method449(1446, var28 - 1);
                        if (var75.field3332 && var75.field3341 != -1) {
                            var24 = class254.field4343[(arg5[var13][var14 - 1] & 0x3) + arg2[var13][var14 - 1] * 4];
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
                    if (var29 != 0 && var16 != var29) {
                        class203 var77 = class76.method449(1446, var29 - 1);
                        if (var77.field3332 && var77.field3341 != -1) {
                            var25 = class254.field4343[(arg5[var13 + 1][var14] + 1 & 0x3) + arg2[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var78] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class62.field816[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class62.field816[var32 == var80 ? var26 : 0];
                        boolean[] var83 = class62.field816[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class62.field816[var28 == var80 ? var24 : 0];
                        class203 var85 = class76.method449(1446, var80 - 1);
                        class192 var86 = class252.method1725(var85, var12, 409);
                        var86.field3107 += 5;
                        var86.field3107 += var81.length - 2;
                        var86.field3107 += var82.length - 2;
                        var86.field3107 += var84.length - 2;
                        var86.field3107 += var83.length - 2;
                        var86.field3122++;
                    }
                }
            }
        }
        for (class192 var87 = (class192) var12.method499((byte) -99); var87 != null; var87 = (class192) var12.method488(1)) {
            var87.method1354();
        }
        field4638++;
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg9[var88][var89] & 0xFF;
                int var91;
                if ((arg11[arg10][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg11[1][var88][var89] & 0x2) == 2 && arg10 > 0) {
                    var91 = arg10 - 1;
                } else {
                    var91 = arg10;
                }
                int var92 = arg0[var88][var89] & 0xFF;
                if (var90 != 0) {
                    class203 var93 = class76.method449(1446, var90 - 1);
                    if (var93.field3341 == -1) {
                        continue;
                    }
                    class192 var94 = class252.method1725(var93, var12, 409);
                    byte var95 = arg2[var88][var89];
                    byte var96 = arg5[var88][var89];
                    int var97 = class99.method742(var93.field3341, arg4[var88][var89], (byte) 115, var93.field3327);
                    int var98 = class99.method742(var93.field3341, arg4[var88 + 1][var89], (byte) 113, var93.field3327);
                    int var99 = class99.method742(var93.field3341, arg4[var88 + 1][var89 + 1], (byte) -108, var93.field3327);
                    int var100 = class99.method742(var93.field3341, arg4[var88][var89 + 1], (byte) 109, var93.field3327);
                    class178.method1277(var94, arg7, var97, var100, arg3, (byte) 36, var99, var88, var89, var91, var95, var96, arg8, var92 != 0 && var93.field3332, arg6, var98);
                }
                if ((arg0[var88][var89] & 0xFF) != 0 || var90 != 0 && arg2[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg9[var88][var89 + 1] & 0xFF;
                    int var107 = 0;
                    int var108 = arg9[var88 - 1][var89] & 0xFF;
                    int var109 = arg9[var88][var89 - 1] & 0xFF;
                    int var110 = arg9[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg9[var88 + 1][var89] & 0xFF;
                    int var112 = arg9[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg9[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg9[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var90 == var110) {
                        var110 = 0;
                    } else {
                        class203 var115 = class76.method449(1446, var110 - 1);
                        if (var115.field3332 && var115.field3341 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg5[var88 - 1][var89 + 1];
                            int var118 = class254.field4343[(var117 + 2 & 0x3) + var116 * 4];
                            int var119 = class254.field4343[(var117 + 3 & 0x3) + var116 * 4];
                            if (class62.field816[var119][1] && class62.field816[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var102 == var120) {
                                        var101[var102++] = var110;
                                        break;
                                    }
                                    if (var101[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var90 == var112) {
                        var112 = 0;
                    } else {
                        class203 var121 = class76.method449(1446, var112 - 1);
                        if (var121.field3332 && var121.field3341 != -1) {
                            byte var122 = arg5[var88 - 1][var89 - 1];
                            byte var123 = arg2[var88 - 1][var89 - 1];
                            int var124 = class254.field4343[(var122 & 0x3) + var123 * 4];
                            int var125 = class254.field4343[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class62.field816[var124][1] && class62.field816[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var102 == var126) {
                                        var101[var102++] = var112;
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
                        class203 var127 = class76.method449(1446, var113 - 1);
                        if (var127.field3332 && var127.field3341 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class254.field4343[(var129 + 1 & 0x3) + var128 * 4];
                            int var131 = class254.field4343[(var129 & 0x3) + var128 * 4];
                            if (class62.field816[var130][1] && class62.field816[var131][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var102 == var132) {
                                        var101[var102++] = var113;
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
                        class203 var133 = class76.method449(1446, var114 - 1);
                        if (var133.field3332 && var133.field3341 != -1) {
                            byte var134 = arg2[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class254.field4343[(var135 + 1 & 0x3) + var134 * 4];
                            int var137 = class254.field4343[(var135 + 2 & 0x3) + var134 * 4];
                            if (class62.field816[var137][1] && class62.field816[var136][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var102 == var138) {
                                        var101[var102++] = var114;
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
                    if (var106 != 0 && var90 != var106) {
                        class203 var139 = class76.method449(1446, var106 - 1);
                        if (var139.field3332 && var139.field3341 != -1) {
                            var104 = class254.field4343[(arg5[var88][var89 + 1] + 2 & 0x3) + arg2[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var102 == var140) {
                                    var101[var102++] = var106;
                                    break;
                                }
                                if (var101[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var90 != var108) {
                        class203 var141 = class76.method449(1446, var108 - 1);
                        if (var141.field3332 && var141.field3341 != -1) {
                            var103 = class254.field4343[(arg5[var88 - 1][var89] + 3 & 0x3) + arg2[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var102 == var142) {
                                    var101[var102++] = var108;
                                    break;
                                }
                                if (var101[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var90 != var109) {
                        class203 var143 = class76.method449(1446, var109 - 1);
                        if (var143.field3332 && var143.field3341 != -1) {
                            var105 = class254.field4343[(arg5[var88][var89 - 1] & 0x3) + arg2[var88][var89 - 1] * 4];
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
                    if (var111 != 0 && var90 != var111) {
                        class203 var145 = class76.method449(1446, var111 - 1);
                        if (var145.field3332 && var145.field3341 != -1) {
                            var107 = class254.field4343[(arg5[var88 + 1][var89] + 1 & 0x3) + arg2[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var102 == var146) {
                                    var101[var102++] = var111;
                                    break;
                                }
                                if (var101[var146] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var102; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class62.field816[var106 == var148 ? var104 : 0];
                        boolean[] var150 = class62.field816[var108 == var148 ? var103 : 0];
                        boolean[] var151 = class62.field816[var109 == var148 ? var105 : 0];
                        boolean[] var152 = class62.field816[var111 == var148 ? var107 : 0];
                        class203 var153 = class76.method449(1446, var148 - 1);
                        class192 var154 = class252.method1725(var153, var12, 409);
                        int var155 = class99.method742(var153.field3341, arg4[var88][var89], (byte) 125, var153.field3327) << 8 | 0xFF;
                        int var156 = class99.method742(var153.field3341, arg4[var88 + 1][var89], (byte) -35, var153.field3327) << 8 | 0xFF;
                        int var157 = class99.method742(var153.field3341, arg4[var88 + 1][var89 + 1], (byte) -125, var153.field3327) << 8 | 0xFF;
                        int var158 = class99.method742(var153.field3341, arg4[var88][var89 + 1], (byte) 121, var153.field3327) << 8 | 0xFF;
                        byte var159 = 6;
                        boolean var160 = var110 != var148 && var150[0] && var149[1];
                        int var161 = var149.length + var159 - 2;
                        boolean var162 = var112 != var148 && var151[0] && var150[1];
                        int var163 = var150.length + var161 - 2;
                        boolean var164 = var114 != var148 && var149[0] && var152[1];
                        int var165 = var151.length + var163 - 2;
                        boolean var166 = var113 != var148 && var152[0] && var151[1];
                        int var167 = var152.length + var165 - 2;
                        int var168 = class271.method1876(-1, var158, 64, var88, arg8, 64, var89, 0.0F, true, (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        int[] var169 = new int[var167];
                        byte var170 = 0;
                        int var171 = class271.method1876(-1, var158, 128, var88, arg8, 0, var89, 0.0F, var160, (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        int var172 = class271.method1876(-1, var158, 128, var88, arg8, 128, var89, 0.0F, var164, (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        int var173 = class271.method1876(-1, var158, 0, var88, arg8, 0, var89, 0.0F, var162, (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        int var174 = class271.method1876(-1, var158, 0, var88, arg8, 128, var89, 0.0F, var166, (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        int var180 = var170 + 1;
                        var169[var170] = var168;
                        var169[var180++] = var172;
                        if (var149.length > 2) {
                            var169[var180++] = class271.method1876(-1, var158, 128, var88, arg8, 64, var89, 0.0F, var149[2], (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        }
                        var169[var180++] = var171;
                        if (var150.length > 2) {
                            var169[var180++] = class271.method1876(-1, var158, 64, var88, arg8, 0, var89, 0.0F, var150[2], (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        }
                        var169[var180++] = var173;
                        if (var151.length > 2) {
                            var169[var180++] = class271.method1876(-1, var158, 0, var88, arg8, 64, var89, 0.0F, var151[2], (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        }
                        var169[var180++] = var174;
                        if (var152.length > 2) {
                            var169[var180++] = class271.method1876(-1, var158, 64, var88, arg8, 128, var89, 0.0F, var152[2], (int[][]) null, arg6, arg3, arg7, var156, 0, var154, var155, var157);
                        }
                        var169[var180++] = var172;
                        var154.method1358(var91, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        if (arg1 >= -31) {
            field4626 = (boolean[]) null;
        }
        for (class192 var175 = (class192) var12.method499((byte) -99); var175 != null; var175 = (class192) var12.method488(1)) {
            if (var175.field3118 == 0) {
                var175.method124((byte) 25);
            } else {
                var175.method1353();
            }
        }
        int var176 = var12.method498(23563);
        long[] var177 = new long[var176];
        class192[] var178 = new class192[var176];
        var12.method501(0, var178);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field292;
        }
        class15.method66(4, var177, var178);
        return var178;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)I", line = 1157)
    public final int method1536(int arg0) {
        if (arg0 != -15899) {
            this.method1536(-89);
        }
        field4630++;
        return this.field4634;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V", line = 1171)
    public static final void method1902(int arg0, int arg1) {
        class127 var2 = class92.field1424[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class127 var4 = class92.field1424[var3][arg0][arg1] = class92.field1424[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1980--;
                for (int var5 = 0; var5 < var4.field1970; var5++) {
                    class91 var6 = var4.field1971[var5];
                    if ((var6.field1407 >> 29 & 0x3L) == 2L && var6.field1410 == arg0 && var6.field1412 == arg1) {
                        var6.field1396--;
                    }
                }
            }
        }
        if (class92.field1424[0][arg0][arg1] == null) {
            class92.field1424[0][arg0][arg1] = new class127(0, arg0, arg1);
        }
        class92.field1424[0][arg0][arg1].field1982 = var2;
        class92.field1424[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILfc;II)Lfc;", line = 1208)
    public static final class152 method1903(int arg0, int arg1, int arg2, int arg3, class152 arg4, int arg5, int arg6) {
        field4635++;
        long var7 = (long) arg5;
        class152 var9 = (class152) class53.field656.method1424(var7, (byte) 126);
        if (var9 == null) {
            class208 var10 = class208.method1462(class143.field2209, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1446(64, 768, -50, -10, -50);
            class53.field656.method1430(var9, var7, 13487);
        }
        int var11 = arg4.method687();
        int var12 = arg4.method659();
        int var13 = arg4.method690();
        int var14 = arg4.method708();
        class152 var15 = var9.method671(true, true);
        if (~arg1 != arg3) {
            var15.method684(arg1);
        }
        class93 var16 = (class93) var15;
        if (class62.method349(arg3 ^ 0xFFFFFF7F, class79.field1127, arg2 + var13, arg0 + var11) != arg6 || arg6 != class62.method349(128, class79.field1127, arg2 + var14, arg0 - -var12)) {
            for (int var17 = 0; var17 < var16.field1456; var17++) {
                var16.field1429[var17] += class62.method349(128, class79.field1127, var16.field1426[var17] + arg2, var16.field1439[var17] + arg0) - arg6;
            }
            var16.field1449.field2499 = false;
            var16.field1453.field2038 = false;
        }
        return var15;
    }
}
