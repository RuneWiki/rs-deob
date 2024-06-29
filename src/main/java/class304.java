import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class304 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lql;")
    public static class87 field4739 = new class87();

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field4752 = 0;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field4753 = 0;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[[I")
    public static int[][] field4755 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "B")
    public byte field4742;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "B")
    public byte field4746;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "B")
    public byte field4749;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "B")
    public byte field4750;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Ljava/lang/Thread;")
    public static Thread field4754;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "S")
    public short field4744;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
    public boolean field4737;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
    public boolean field4740;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Z")
    public boolean field4745;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
    public boolean field4747;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
    public boolean field4748;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 13)
    public static final void method2073(int arg0, int arg1) {
        if (arg1 != -1) {
            field4752 = 67;
        }
        class251.field3968.method2175(arg0, -1401253017);
        field4741++;
        class291.field4522.method2175(arg0, -1401253017);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 27)
    public static void method2074(int arg0) {
        if (arg0 != -1308) {
            field4751 = 65;
        }
        field4754 = null;
        field4739 = null;
        field4755 = (int[][]) null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Llg;", line = 41)
    public static final class97 method2075(int arg0, int arg1) {
        class97 var2 = (class97) class229.field3646.method2179(false, (long) arg1);
        field4736++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 104) {
            field4753 = 45;
        }
        byte[] var3 = class37.field571.method980(30, arg1, 5);
        class97 var4 = new class97();
        if (var3 != null) {
            var4.method722(16777215, arg1, new class166(var3));
        }
        class229.field3646.method2173(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([[F[[F[[B[[BBI[[B[[F[[I[[I[[[B[[B)[Lfm;", line = 69)
    public static final class127[] method2076(float[][] arg0, float[][] arg1, byte[][] arg2, byte[][] arg3, byte arg4, int arg5, byte[][] arg6, float[][] arg7, int[][] arg8, int[][] arg9, byte[][][] arg10, byte[][] arg11) {
        field4743++;
        class170 var12 = new class170(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg6[var13][var14] & 0xFF;
                int var16 = arg2[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class257 var17 = class43.method371(var16 - 1, false);
                    if (var17.field4034 == -1) {
                        continue;
                    }
                    class127 var18 = class158.method1073(var17, false, var12);
                    byte var19 = arg3[var13][var14];
                    int[] var20 = class107.field1671[var19];
                    var18.field1995 += var20.length / 2;
                    var18.field1973++;
                    if (var17.field4032 && var15 != 0) {
                        var18.field1995 += class48.field783[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var16 != 0 && arg3[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg2[var13 - 1][var14] & 0xFF;
                    int var28 = arg2[var13][var14 + 1] & 0xFF;
                    int var29 = arg2[var13][var14 - 1] & 0xFF;
                    int var30 = arg2[var13 + 1][var14] & 0xFF;
                    int var31 = arg2[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg2[var13 - 1][var14 + 1] & 0xFF;
                    int var33 = arg2[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg2[var13 + 1][var14 + 1] & 0xFF;
                    if (var32 == 0 || var16 == var32) {
                        boolean var43 = false;
                    } else {
                        class257 var35 = class43.method371(var32 - 1, false);
                        if (var35.field4032 && var35.field4034 != -1) {
                            byte var36 = arg11[var13 - 1][var14 + 1];
                            byte var37 = arg3[var13 - 1][var14 + 1];
                            int var38 = class173.field2619[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class173.field2619[(var36 + 2 & 0x3) + var37 * 4];
                            if (class218.field3322[var38][1] && class218.field3322[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var41] == var32) {
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
                        class257 var44 = class43.method371(var31 - 1, false);
                        if (var44.field4032 && var44.field4034 != -1) {
                            byte var45 = arg3[var13 - 1][var14 - 1];
                            byte var46 = arg11[var13 - 1][var14 - 1];
                            int var47 = class173.field2619[(var46 & 0x3) + var45 * 4];
                            int var48 = class173.field2619[var45 * 4 + (var46 + 3 & 0x3)];
                            if (class218.field3322[var47][1] && class218.field3322[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var50] == var31) {
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
                        class257 var53 = class43.method371(var33 - 1, false);
                        if (var53.field4032 && var53.field4034 != -1) {
                            byte var54 = arg11[var13 + 1][var14 - 1];
                            byte var55 = arg3[var13 + 1][var14 - 1];
                            int var56 = class173.field2619[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class173.field2619[var55 * 4 + (var54 & 0x3)];
                            if (class218.field3322[var56][1] && class218.field3322[var57][0]) {
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var70 = false;
                    } else {
                        class257 var62 = class43.method371(var34 - 1, false);
                        if (var62.field4032 && var62.field4034 != -1) {
                            byte var63 = arg11[var13 + 1][var14 + 1];
                            byte var64 = arg3[var13 + 1][var14 + 1];
                            int var65 = class173.field2619[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class173.field2619[(var63 + 2 & 0x3) + var64 * 4];
                            if (class218.field3322[var66][1] && class218.field3322[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class257 var71 = class43.method371(var28 - 1, false);
                        if (var71.field4032 && var71.field4034 != -1) {
                            var24 = class173.field2619[arg3[var13][var14 + 1] * 4 + (arg11[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var72] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class257 var73 = class43.method371(var27 - 1, false);
                        if (var73.field4032 && var73.field4034 != -1) {
                            var23 = class173.field2619[arg3[var13 - 1][var14] * 4 + (arg11[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var74] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class257 var75 = class43.method371(var29 - 1, false);
                        if (var75.field4032 && var75.field4034 != -1) {
                            var25 = class173.field2619[arg3[var13][var14 - 1] * 4 + (arg11[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class257 var77 = class43.method371(var30 - 1, false);
                        if (var77.field4032 && var77.field4034 != -1) {
                            var26 = class173.field2619[(arg11[var13 + 1][var14] + 1 & 0x3) + arg3[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var30;
                                    break;
                                }
                                if (var22[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class218.field3322[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class218.field3322[var28 == var80 ? var24 : 0];
                        boolean[] var83 = class218.field3322[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class218.field3322[var30 == var80 ? var26 : 0];
                        class257 var85 = class43.method371(var80 - 1, false);
                        class127 var86 = class158.method1073(var85, false, var12);
                        var86.field1995 += 5;
                        var86.field1995 += var82.length - 2;
                        var86.field1995 += var81.length - 2;
                        var86.field1995 += var83.length - 2;
                        var86.field1995 += var84.length - 2;
                        var86.field1973++;
                    }
                }
            }
        }
        for (class127 var87 = (class127) var12.method1228(true); var87 != null; var87 = (class127) var12.method1223((byte) 13)) {
            var87.method924();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg6[var88][var89] & 0xFF;
                int var91 = arg2[var88][var89] & 0xFF;
                int var92;
                if ((arg10[arg5][var88][var89] & 0x8) != 0) {
                    var92 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg5 > 0) {
                    var92 = arg5 - 1;
                } else {
                    var92 = arg5;
                }
                if (var91 != 0) {
                    class257 var93 = class43.method371(var91 - 1, false);
                    if (var93.field4034 == -1) {
                        continue;
                    }
                    class127 var94 = class158.method1073(var93, false, var12);
                    byte var95 = arg3[var88][var89];
                    byte var96 = arg11[var88][var89];
                    int var97 = class106.method770((byte) -117, var93.field4022, arg8[var88][var89], var93.field4034);
                    int var98 = class106.method770((byte) -127, var93.field4022, arg8[var88 + 1][var89], var93.field4034);
                    int var99 = class106.method770((byte) -124, var93.field4022, arg8[var88 + 1][var89 + 1], var93.field4034);
                    int var100 = class106.method770((byte) -127, var93.field4022, arg8[var88][var89 + 1], var93.field4034);
                    class274.method1884(var89, arg9, var100, var92, arg0, var95, (byte) 69, var98, var96, var88, var94, var97, var90 != 0 && var93.field4032, var99, arg7, arg1);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var91 != 0 && arg3[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int var103 = 0;
                    int[] var104 = new int[8];
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg2[var88 - 1][var89] & 0xFF;
                    int var108 = arg2[var88 + 1][var89] & 0xFF;
                    int var109 = arg2[var88][var89 - 1] & 0xFF;
                    int var110 = arg2[var88][var89 + 1] & 0xFF;
                    int var111 = arg2[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg2[var88 + 1][var89 + 1] & 0xFF;
                    int var113 = arg2[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg2[var88 - 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class257 var115 = class43.method371(var111 - 1, false);
                        if (var115.field4032 && var115.field4034 != -1) {
                            byte var116 = arg11[var88 - 1][var89 + 1];
                            byte var117 = arg3[var88 - 1][var89 + 1];
                            int var118 = class173.field2619[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class173.field2619[(var116 + 3 & 0x3) + var117 * 4];
                            if (class218.field3322[var119][1] && class218.field3322[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var104[var101++] = var111;
                                        break;
                                    }
                                    if (var104[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var114 == 0 || var91 == var114) {
                        var114 = 0;
                    } else {
                        class257 var121 = class43.method371(var114 - 1, false);
                        if (var121.field4032 && var121.field4034 != -1) {
                            byte var122 = arg11[var88 - 1][var89 - 1];
                            byte var123 = arg3[var88 - 1][var89 - 1];
                            int var124 = class173.field2619[var123 * 4 + (var122 + 3 & 0x3)];
                            int var125 = class173.field2619[(var122 & 0x3) + var123 * 4];
                            if (class218.field3322[var125][1] && class218.field3322[var124][0]) {
                                var114 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var104[var101++] = var114;
                                        break;
                                    }
                                    if (var104[var126] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class257 var127 = class43.method371(var113 - 1, false);
                        if (var127.field4032 && var127.field4034 != -1) {
                            byte var128 = arg11[var88 + 1][var89 - 1];
                            byte var129 = arg3[var88 + 1][var89 - 1];
                            int var130 = class173.field2619[var129 * 4 + (var128 + 1 & 0x3)];
                            int var131 = class173.field2619[(var128 & 0x3) + var129 * 4];
                            if (class218.field3322[var130][1] && class218.field3322[var131][0]) {
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
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class257 var133 = class43.method371(var112 - 1, false);
                        if (var133.field4032 && var133.field4034 != -1) {
                            byte var134 = arg11[var88 + 1][var89 + 1];
                            byte var135 = arg3[var88 + 1][var89 + 1];
                            int var136 = class173.field2619[var135 * 4 + (var134 + 2 & 0x3)];
                            int var137 = class173.field2619[(var134 + 1 & 0x3) + var135 * 4];
                            if (class218.field3322[var136][1] && class218.field3322[var137][0]) {
                                var112 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var104[var101++] = var112;
                                        break;
                                    }
                                    if (var104[var138] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class257 var139 = class43.method371(var110 - 1, false);
                        if (var139.field4032 && var139.field4034 != -1) {
                            var103 = class173.field2619[(arg11[var88][var89 + 1] + 2 & 0x3) + arg3[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var104[var101++] = var110;
                                    break;
                                }
                                if (var104[var140] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class257 var141 = class43.method371(var107 - 1, false);
                        if (var141.field4032 && var141.field4034 != -1) {
                            var102 = class173.field2619[arg3[var88 - 1][var89] * 4 + (arg11[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var104[var101++] = var107;
                                    break;
                                }
                                if (var104[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class257 var143 = class43.method371(var109 - 1, false);
                        if (var143.field4032 && var143.field4034 != -1) {
                            var105 = class173.field2619[arg3[var88][var89 - 1] * 4 + (arg11[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var104[var101++] = var109;
                                    break;
                                }
                                if (var104[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class257 var145 = class43.method371(var108 - 1, false);
                        if (var145.field4032 && var145.field4034 != -1) {
                            var106 = class173.field2619[(arg11[var88 + 1][var89] + 1 & 0x3) + arg3[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var104[var101++] = var108;
                                    break;
                                }
                                if (var104[var146] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var104[var147];
                        boolean[] var149 = class218.field3322[var107 == var148 ? var102 : 0];
                        boolean[] var150 = class218.field3322[var110 == var148 ? var103 : 0];
                        boolean[] var151 = class218.field3322[var109 == var148 ? var105 : 0];
                        boolean[] var152 = class218.field3322[var108 == var148 ? var106 : 0];
                        class257 var153 = class43.method371(var148 - 1, false);
                        class127 var154 = class158.method1073(var153, false, var12);
                        int var155 = class106.method770((byte) -123, var153.field4022, arg8[var88][var89], var153.field4034) << 8 | 0xFF;
                        int var156 = class106.method770((byte) -119, var153.field4022, arg8[var88 + 1][var89], var153.field4034) << 8 | 0xFF;
                        int var157 = class106.method770((byte) -128, var153.field4022, arg8[var88 + 1][var89 + 1], var153.field4034) << 8 | 0xFF;
                        int var158 = class106.method770((byte) -113, var153.field4022, arg8[var88][var89 + 1], var153.field4034) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var150.length + var159 - 2;
                        boolean var161 = var112 != var148 && var150[0] && var152[1];
                        boolean var162 = var111 != var148 && var149[0] && var150[1];
                        boolean var163 = var114 != var148 && var151[0] && var149[1];
                        int var164 = var149.length + var160 - 2;
                        boolean var165 = var113 != var148 && var152[0] && var151[1];
                        int var166 = var151.length + var164 - 2;
                        int var167 = var152.length + var166 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class297.method2016(var157, arg7, 64, var89, var158, 0.0F, 64, arg0, true, (int[][]) null, var154, arg1, (byte) -62, 0, arg9, var155, var88, var156);
                        int var170 = class297.method2016(var157, arg7, 0, var89, var158, 0.0F, 128, arg0, var162, (int[][]) null, var154, arg1, (byte) -90, 0, arg9, var155, var88, var156);
                        int var171 = class297.method2016(var157, arg7, 128, var89, var158, 0.0F, 128, arg0, var161, (int[][]) null, var154, arg1, (byte) -106, 0, arg9, var155, var88, var156);
                        int var172 = class297.method2016(var157, arg7, 0, var89, var158, 0.0F, 0, arg0, var163, (int[][]) null, var154, arg1, (byte) -84, 0, arg9, var155, var88, var156);
                        byte var173 = 0;
                        int var174 = class297.method2016(var157, arg7, 128, var89, var158, 0.0F, 0, arg0, var165, (int[][]) null, var154, arg1, (byte) -105, 0, arg9, var155, var88, var156);
                        int var181 = var173 + 1;
                        var168[var173] = var169;
                        var168[var181++] = var171;
                        if (var150.length > 2) {
                            var168[var181++] = class297.method2016(var157, arg7, 64, var89, var158, 0.0F, 128, arg0, var150[2], (int[][]) null, var154, arg1, (byte) -76, 0, arg9, var155, var88, var156);
                        }
                        var168[var181++] = var170;
                        if (var149.length > 2) {
                            var168[var181++] = class297.method2016(var157, arg7, 0, var89, var158, 0.0F, 64, arg0, var149[2], (int[][]) null, var154, arg1, (byte) -78, 0, arg9, var155, var88, var156);
                        }
                        var168[var181++] = var172;
                        if (var151.length > 2) {
                            var168[var181++] = class297.method2016(var157, arg7, 64, var89, var158, 0.0F, 0, arg0, var151[2], (int[][]) null, var154, arg1, (byte) -106, 0, arg9, var155, var88, var156);
                        }
                        var168[var181++] = var174;
                        if (var152.length > 2) {
                            var168[var181++] = class297.method2016(var157, arg7, 128, var89, var158, 0.0F, 64, arg0, var152[2], (int[][]) null, var154, arg1, (byte) -67, 0, arg9, var155, var88, var156);
                        }
                        var168[var181++] = var171;
                        var154.method923(var92, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class127 var175 = (class127) var12.method1228(true); var175 != null; var175 = (class127) var12.method1223((byte) 13)) {
            if (var175.field1979 == 0) {
                var175.method403(1);
            } else {
                var175.method920();
            }
        }
        int var176 = var12.method1224(false);
        class127[] var177 = new class127[var176];
        long[] var178 = new long[var176];
        var12.method1221((byte) -87, var177);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field758;
        }
        class306.method2094(var177, var178, 1);
        int var180 = 71 / ((15 - arg4) / 45);
        return var177;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BIZ[Lvg;III)[I", line = 1016)
    public static final int[] method2077(int arg0, byte[] arg1, int arg2, boolean arg3, class303[] arg4, int arg5, int arg6, int arg7) {
        field4738++;
        if (!arg3) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg2 + var9 > 0 && (arg2 + var9) < 103 && (arg0 + var10) > 0 && (arg0 + var10) < 103) {
                            arg4[var8].field4732[arg2 + var9][arg0 + var10] = class270.method1860(arg4[var8].field4732[arg2 + var9][arg0 + var10], -2097153);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class166 var12 = new class166(arg1);
        int var13 = arg2 + arg5;
        int var14 = arg6 + arg0;
        if (arg7 != -22893) {
            method2075(-109, -71);
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class19.method148(var12, false, var13 + var16, var14 + var17, var17 + arg0, 0, var15, 0, arg2 + var16, arg3);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field2532 < var12.field2500.length) {
            int var20 = var12.method1178(arg7 ^ 0xFFFFA693);
            if (var20 == 128) {
                var18 = true;
                class137.field2160[0] = var12.method1151(-103);
                class137.field2160[1] = var12.method1166(52);
                class137.field2160[2] = var12.method1166(52);
                class137.field2160[3] = var12.method1166(52);
                class137.field2160[4] = var12.method1151(arg7 + 22807);
            } else {
                if (var20 != 129) {
                    var12.field2532--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method1143(59);
                    if (var22 == 0) {
                        int var23 = arg2;
                        if (arg2 < 0) {
                            var23 = 0;
                        } else if (arg2 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg2 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg0;
                        if (arg0 < 0) {
                            var25 = 0;
                        } else if (arg0 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg0 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var24 > var23) {
                            while (var26 > var25) {
                                class143.field2220[var21][var23][var25] = 0;
                                var25++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var12.method1143(arg7 ^ 0x5931);
                                for (int var34 = arg2 + var31; var34 < var31 + arg2 + 4; var34++) {
                                    for (int var35 = arg0 + var32; var35 < (arg0 + var32 + 4); var35++) {
                                        if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                            class143.field2220[var21][var34][var35] = var33;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var27 = arg0;
                        int var28 = arg2 + 64;
                        if (arg0 < 0) {
                            var27 = 0;
                        } else if (arg0 >= 104) {
                            var27 = 104;
                        }
                        int var29 = arg2;
                        if (arg2 < 0) {
                            var29 = 0;
                        } else if (arg2 >= 104) {
                            var29 = 104;
                        }
                        int var30 = arg0 + 64;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        while (var29 < var28) {
                            while (var30 > var27) {
                                class143.field2220[var21][var29][var27] = class143.field2220[var21 - 1][var29][var27];
                                var27++;
                            }
                            var29++;
                        }
                    }
                }
            }
        }
        if (class94.field1516 && !arg3) {
            class51 var36 = null;
            label291: while (true) {
                int var38;
                label284: do {
                    while (true) {
                        while (var12.field2532 < var12.field2500.length) {
                            int var37 = var12.method1178(0);
                            if (var37 == 0) {
                                var36 = new class51(var12);
                            } else {
                                if (var37 == 1) {
                                    var38 = var12.method1178(0);
                                    continue label284;
                                }
                                if (var37 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var36 == null) {
                                    var36 = new class51();
                                }
                                var36.method429((byte) 116, var12);
                            }
                        }
                        if (var36 == null) {
                            var36 = new class51();
                        }
                        for (int var44 = 0; var44 < 8; var44++) {
                            for (int var45 = 0; var45 < 8; var45++) {
                                int var46 = (arg2 >> 3) + var44;
                                int var47 = (arg0 >> 3) + var45;
                                if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                    class98.field1568[var46][var47] = var36;
                                }
                            }
                        }
                        break label291;
                    }
                } while (var38 <= 0);
                for (int var39 = 0; var39 < var38; var39++) {
                    class204 var40 = new class204(var12);
                    if (var40.field3060 == 31) {
                        class194 var41 = class11.method87(var12.method1151(-79), 75);
                        var40.method1450(var41.field2893, var41.field2896, var41.field2892, (byte) -88, var41.field2894);
                    }
                    var40.field3070 += arg0 << 7;
                    var40.field3061 += arg2 << 7;
                    int var42 = var40.field3070 >> 7;
                    int var43 = var40.field3061 >> 7;
                    if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                        var40.field3063 = (class92.field1468[1][var43][var42] & 0x2) != 0;
                        var40.field3051 = class218.field3321[var40.field3078][var43][var42] - var40.field3051;
                        class183.method1306(var40);
                    }
                }
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg0 >> 2) + var50;
                        int var52 = (arg2 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class143.field2220[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class137.field2160 : null;
    }
}
