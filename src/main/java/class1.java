import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
    public static boolean field7 = false;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lbe;")
    public static class283 field11 = class153.method941(-53, "T");

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field2;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[[I")
    public static int[][] field10;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[[[I")
    public static int[][][] field12;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILja;)V", line = 4)
    public static final void method1(int arg0, class60 arg1) {
        field5++;
        if (arg0 != 0) {
            return;
        }
        for (class183 var2 = (class183) class259.field4397.method1812((byte) -92); var2 != null; var2 = (class183) class259.field4397.method1813((byte) 44)) {
            if (var2.field3153 == arg1) {
                if (var2.field3155 != null) {
                    class301.field5089.method1275(var2.field3155);
                    var2.field3155 = null;
                }
                var2.method557((byte) -89);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)I", line = 44)
    public static final int method2(int arg0, int arg1, int arg2) {
        field6++;
        if (arg0 != -1) {
            method8((class251) null, (byte) -88, 6, (class229) null);
        }
        class74 var3 = (class74) class170.field2860.method1612((long) arg1, 108);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field1290.length > arg2) {
            return var3.field1290[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 66)
    public static void method3(int arg0) {
        field2 = null;
        field10 = (int[][]) null;
        if (arg0 != 1) {
            method2(25, 98, 60);
        }
        field11 = null;
        field12 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(DB)V", line = 80)
    public static final void method4(double arg0, byte arg1) {
        if (class14.field152 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class287.field4885[var3] = var4 > 255 ? 255 : var4;
            }
            class14.field152 = arg0;
        }
        field3++;
        if (arg1 <= 92) {
            field2 = (Frame) null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[[B[[F[[F[[[B[[B[[B[[II[[B[[I[[F)[Lsf;", line = 109)
    public static final class100[] method5(byte arg0, byte[][] arg1, float[][] arg2, float[][] arg3, byte[][][] arg4, byte[][] arg5, byte[][] arg6, int[][] arg7, int arg8, byte[][] arg9, int[][] arg10, float[][] arg11) {
        field4++;
        class239 var12 = new class239(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg6[var13][var14] & 0xFF;
                int var16 = arg1[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class145 var17 = class174.method1135(var16 - 1, 86);
                    if (var17.field2405 == -1) {
                        continue;
                    }
                    class100 var18 = class124.method781(var17, var12, -113);
                    byte var19 = arg5[var13][var14];
                    int[] var20 = class255.field4304[var19];
                    var18.field1695 += var20.length / 2;
                    var18.field1717++;
                    if (var17.field2401 && var15 != 0) {
                        var18.field1695 += class48.field666[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var16 != 0 && arg5[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg1[var13 - 1][var14] & 0xFF;
                    int var28 = arg1[var13][var14 + 1] & 0xFF;
                    int var29 = arg1[var13][var14 - 1] & 0xFF;
                    int var30 = arg1[var13 + 1][var14] & 0xFF;
                    int var31 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class145 var35 = class174.method1135(var31 - 1, 42);
                        if (var35.field2401 && var35.field2405 != -1) {
                            byte var36 = arg9[var13 - 1][var14 + 1];
                            byte var37 = arg5[var13 - 1][var14 + 1];
                            int var38 = class160.field2643[var37 * 4 + (var36 + 2 & 0x3)];
                            int var39 = class160.field2643[(var36 + 3 & 0x3) + var37 * 4];
                            if (class76.field1319[var39][1] && class76.field1319[var38][0]) {
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
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class145 var44 = class174.method1135(var32 - 1, 87);
                        if (var44.field2401 && var44.field2405 != -1) {
                            byte var45 = arg9[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class160.field2643[(var45 & 0x3) + var46 * 4];
                            int var48 = class160.field2643[(var45 + 3 & 0x3) + var46 * 4];
                            if (class76.field1319[var47][1] && class76.field1319[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var50] == var32) {
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
                        class145 var53 = class174.method1135(var33 - 1, 115);
                        if (var53.field2401 && var53.field2405 != -1) {
                            byte var54 = arg9[var13 + 1][var14 - 1];
                            byte var55 = arg5[var13 + 1][var14 - 1];
                            int var56 = class160.field2643[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class160.field2643[var55 * 4 + (var54 & 0x3)];
                            if (class76.field1319[var56][1] && class76.field1319[var57][0]) {
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
                        class145 var62 = class174.method1135(var34 - 1, 89);
                        if (var62.field2401 && var62.field2405 != -1) {
                            byte var63 = arg9[var13 + 1][var14 + 1];
                            byte var64 = arg5[var13 + 1][var14 + 1];
                            int var65 = class160.field2643[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class160.field2643[(var63 + 1 & 0x3) + var64 * 4];
                            if (class76.field1319[var65][1] && class76.field1319[var66][0]) {
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
                        class145 var71 = class174.method1135(var28 - 1, 53);
                        if (var71.field2401 && var71.field2405 != -1) {
                            var23 = class160.field2643[(arg9[var13][var14 + 1] + 2 & 0x3) + arg5[var13][var14 + 1] * 4];
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
                        class145 var73 = class174.method1135(var27 - 1, 51);
                        if (var73.field2401 && var73.field2405 != -1) {
                            var24 = class160.field2643[(arg9[var13 - 1][var14] + 3 & 0x3) + arg5[var13 - 1][var14] * 4];
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
                        class145 var75 = class174.method1135(var29 - 1, 103);
                        if (var75.field2401 && var75.field2405 != -1) {
                            var26 = class160.field2643[(arg9[var13][var14 - 1] & 0x3) + arg5[var13][var14 - 1] * 4];
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
                        class145 var77 = class174.method1135(var30 - 1, 61);
                        if (var77.field2401 && var77.field2405 != -1) {
                            var25 = class160.field2643[(arg9[var13 + 1][var14] + 1 & 0x3) + arg5[var13 + 1][var14] * 4];
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
                        boolean[] var81 = class76.field1319[var28 == var80 ? var23 : 0];
                        boolean[] var82 = class76.field1319[var29 == var80 ? var26 : 0];
                        boolean[] var83 = class76.field1319[var30 == var80 ? var25 : 0];
                        boolean[] var84 = class76.field1319[var27 == var80 ? var24 : 0];
                        class145 var85 = class174.method1135(var80 - 1, 71);
                        class100 var86 = class124.method781(var85, var12, -81);
                        var86.field1695 += 5;
                        var86.field1695 += var81.length - 2;
                        var86.field1695 += var84.length - 2;
                        var86.field1695 += var82.length - 2;
                        var86.field1695 += var83.length - 2;
                        var86.field1717++;
                    }
                }
            }
        }
        for (class100 var87 = (class100) var12.method1607(0); var87 != null; var87 = (class100) var12.method1604((byte) 127)) {
            var87.method667();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg4[arg8][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg4[1][var88][var89] & 0x2) == 2 && arg8 > 0) {
                    var90 = arg8 - 1;
                } else {
                    var90 = arg8;
                }
                int var91 = arg6[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class145 var93 = class174.method1135(var92 - 1, 89);
                    if (var93.field2405 == -1) {
                        continue;
                    }
                    class100 var94 = class124.method781(var93, var12, -107);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg9[var88][var89];
                    int var97 = class229.method1529(var93.field2397, (byte) -51, var93.field2405, arg7[var88][var89]);
                    int var98 = class229.method1529(var93.field2397, (byte) -97, var93.field2405, arg7[var88 + 1][var89]);
                    int var99 = class229.method1529(var93.field2397, (byte) -99, var93.field2405, arg7[var88 + 1][var89 + 1]);
                    int var100 = class229.method1529(var93.field2397, (byte) -57, var93.field2405, arg7[var88][var89 + 1]);
                    class90.method580(arg11, var94, var97, arg3, arg2, var96, var91 != 0 && var93.field2401, var95, var90, var89, false, arg10, var88, var99, var100, var98);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var92 != 0 && arg5[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg1[var88][var89 + 1] & 0xFF;
                    int var108 = arg1[var88 - 1][var89] & 0xFF;
                    int var109 = arg1[var88 + 1][var89] & 0xFF;
                    int var110 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var112 = arg1[var88][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class145 var115 = class174.method1135(var110 - 1, 90);
                        if (var115.field2401 && var115.field2405 != -1) {
                            byte var116 = arg9[var88 - 1][var89 + 1];
                            byte var117 = arg5[var88 - 1][var89 + 1];
                            int var118 = class160.field2643[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class160.field2643[var117 * 4 + (var116 + 3 & 0x3)];
                            if (class76.field1319[var119][1] && class76.field1319[var118][0]) {
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
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class145 var121 = class174.method1135(var114 - 1, 110);
                        if (var121.field2401 && var121.field2405 != -1) {
                            byte var122 = arg9[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class160.field2643[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class160.field2643[(var122 & 0x3) + var123 * 4];
                            if (class76.field1319[var125][1] && class76.field1319[var124][0]) {
                                var114 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var126] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class145 var127 = class174.method1135(var111 - 1, 81);
                        if (var127.field2401 && var127.field2405 != -1) {
                            byte var128 = arg9[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class160.field2643[(var128 & 0x3) + var129 * 4];
                            int var131 = class160.field2643[(var128 + 1 & 0x3) + var129 * 4];
                            if (class76.field1319[var131][1] && class76.field1319[var130][0]) {
                                var111 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var132] == var111) {
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
                        class145 var133 = class174.method1135(var113 - 1, 85);
                        if (var133.field2401 && var133.field2405 != -1) {
                            byte var134 = arg9[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class160.field2643[var135 * 4 + (var134 + 1 & 0x3)];
                            int var137 = class160.field2643[(var134 + 2 & 0x3) + var135 * 4];
                            if (class76.field1319[var137][1] && class76.field1319[var136][0]) {
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
                        class145 var139 = class174.method1135(var107 - 1, 109);
                        if (var139.field2401 && var139.field2405 != -1) {
                            var104 = class160.field2643[(arg9[var88][var89 + 1] + 2 & 0x3) + arg5[var88][var89 + 1] * 4];
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
                        class145 var141 = class174.method1135(var108 - 1, 120);
                        if (var141.field2401 && var141.field2405 != -1) {
                            var103 = class160.field2643[(arg9[var88 - 1][var89] + 3 & 0x3) + arg5[var88 - 1][var89] * 4];
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
                    if (var112 != 0 && var92 != var112) {
                        class145 var143 = class174.method1135(var112 - 1, 117);
                        if (var143.field2401 && var143.field2405 != -1) {
                            var105 = class160.field2643[(arg9[var88][var89 - 1] & 0x3) + arg5[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var112;
                                    break;
                                }
                                if (var102[var144] == var112) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class145 var145 = class174.method1135(var109 - 1, 86);
                        if (var145.field2401 && var145.field2405 != -1) {
                            var106 = class160.field2643[(arg9[var88 + 1][var89] + 1 & 0x3) + arg5[var88 + 1][var89] * 4];
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
                        boolean[] var149 = class76.field1319[var107 == var148 ? var104 : 0];
                        boolean[] var150 = class76.field1319[var108 == var148 ? var103 : 0];
                        boolean[] var151 = class76.field1319[var112 == var148 ? var105 : 0];
                        boolean[] var152 = class76.field1319[var109 == var148 ? var106 : 0];
                        class145 var153 = class174.method1135(var148 - 1, 87);
                        class100 var154 = class124.method781(var153, var12, -80);
                        int var155 = class229.method1529(var153.field2397, (byte) -71, var153.field2405, arg7[var88][var89]) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class229.method1529(var153.field2397, (byte) -101, var153.field2405, arg7[var88 + 1][var89]) << 8 | 0xFF;
                        int var158 = class229.method1529(var153.field2397, (byte) -117, var153.field2405, arg7[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class229.method1529(var153.field2397, (byte) -82, var153.field2405, arg7[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var160 = var113 != var148 && var149[0] && var152[1];
                        int var161 = var149.length + var156 - 2;
                        boolean var162 = var110 != var148 && var150[0] && var149[1];
                        boolean var163 = var114 != var148 && var151[0] && var150[1];
                        int var164 = var150.length + var161 - 2;
                        int var165 = var151.length + var164 - 2;
                        boolean var166 = var111 != var148 && var152[0] && var151[1];
                        int var167 = var152.length + var165 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class164.method997((int[][]) null, arg10, 64, var157, arg3, var154, 0.0F, var89, true, 0, arg11, arg2, 64, 210, var155, var159, var88, var158);
                        byte var170 = 0;
                        int var171 = class164.method997((int[][]) null, arg10, 128, var157, arg3, var154, 0.0F, var89, var162, 0, arg11, arg2, 0, 210, var155, var159, var88, var158);
                        int var172 = class164.method997((int[][]) null, arg10, 128, var157, arg3, var154, 0.0F, var89, var160, 0, arg11, arg2, 128, 210, var155, var159, var88, var158);
                        int var173 = class164.method997((int[][]) null, arg10, 0, var157, arg3, var154, 0.0F, var89, var163, 0, arg11, arg2, 0, 210, var155, var159, var88, var158);
                        int var174 = class164.method997((int[][]) null, arg10, 0, var157, arg3, var154, 0.0F, var89, var166, 0, arg11, arg2, 128, 210, var155, var159, var88, var158);
                        int var181 = var170 + 1;
                        var168[var170] = var169;
                        var168[var181++] = var172;
                        if (var149.length > 2) {
                            var168[var181++] = class164.method997((int[][]) null, arg10, 128, var157, arg3, var154, 0.0F, var89, var149[2], 0, arg11, arg2, 64, 210, var155, var159, var88, var158);
                        }
                        var168[var181++] = var171;
                        if (var150.length > 2) {
                            var168[var181++] = class164.method997((int[][]) null, arg10, 64, var157, arg3, var154, 0.0F, var89, var150[2], 0, arg11, arg2, 0, 210, var155, var159, var88, var158);
                        }
                        var168[var181++] = var173;
                        if (var151.length > 2) {
                            var168[var181++] = class164.method997((int[][]) null, arg10, 0, var157, arg3, var154, 0.0F, var89, var151[2], 0, arg11, arg2, 64, 210, var155, var159, var88, var158);
                        }
                        var168[var181++] = var174;
                        if (var152.length > 2) {
                            var168[var181++] = class164.method997((int[][]) null, arg10, 64, var157, arg3, var154, 0.0F, var89, var152[2], 0, arg11, arg2, 128, 210, var155, var159, var88, var158);
                        }
                        var168[var181++] = var172;
                        var154.method666(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class100 var175 = (class100) var12.method1607(0); var175 != null; var175 = (class100) var12.method1604((byte) 127)) {
            if (var175.field1702 == 0) {
                var175.method557((byte) -89);
            } else {
                var175.method665();
            }
        }
        int var176 = var12.method1608((byte) -126);
        long[] var177 = new long[var176];
        class100[] var178 = new class100[var176];
        var12.method1613(-1, var178);
        int var179 = -37 % ((65 - arg0) / 35);
        for (int var180 = 0; var180 < var176; var180++) {
            var177[var180] = var178[var180].field1445;
        }
        class177.method1167(var177, (byte) -20, var178);
        return var178;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)Lia;", line = 1048)
    public static final class197 method6(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class197 var4 = var3.field2632;
            var3.field2632 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 1083)
    public static final void method7(int arg0, int arg1) {
        if (arg0 <= 96) {
            field10 = (int[][]) ((int[][]) null);
        }
        field8++;
        class72 var2 = class25.method174(arg1, (byte) -105, 11);
        var2.method479(123);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lui;BILfe;)V", line = 1102)
    public static final void method8(class251 arg0, byte arg1, int arg2, class229 arg3) {
        field9++;
        class243 var4 = new class243();
        var4.field4096 = arg3.method1535((byte) 109);
        var4.field4102 = arg3.method1528(true);
        var4.field4109 = new int[var4.field4096];
        var4.field4095 = new class310[var4.field4096];
        var4.field4105 = new class310[var4.field4096];
        if (arg1 != 36) {
            field11 = (class283) null;
        }
        var4.field4108 = new byte[var4.field4096][][];
        var4.field4094 = new int[var4.field4096];
        var4.field4106 = new int[var4.field4096];
        for (int var5 = 0; var5 < var4.field4096; var5++) {
            try {
                int var6 = arg3.method1535((byte) 98);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method1549(true).method1933((byte) 121));
                    String var18 = new String(arg3.method1549(true).method1933((byte) -1));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method1528(true);
                    }
                    var4.field4094[var5] = var6;
                    var4.field4109[var5] = var19;
                    var4.field4095[var5] = arg0.method1693(9, var18, class127.method795(var17, class281.method1877(arg1, 36)));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method1549(true).method1933((byte) -74));
                    String var8 = new String(arg3.method1549(true).method1933((byte) 123));
                    int var9 = arg3.method1535((byte) 90);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method1549(true).method1933((byte) 121));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method1528(true);
                            var12[var13] = new byte[var14];
                            arg3.method1505((byte) 69, 0, var12[var13], var14);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field4094[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class127.method795(var10[var16], 0);
                    }
                    var4.field4105[var5] = arg0.method1700(-115, var8, class127.method795(var7, 0), var15);
                    var4.field4108[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4106[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4106[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4106[var5] = -3;
            } catch (Exception var28) {
                var4.field4106[var5] = -4;
            } catch (Throwable var29) {
                var4.field4106[var5] = -5;
            }
        }
        class113.field1898.method1809(var4, (byte) -124);
    }
}
