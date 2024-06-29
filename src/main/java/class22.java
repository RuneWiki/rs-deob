import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class22 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lmh;")
    public static class62 field231 = class201.method1405(true, "details");

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lmh;")
    public static class62 field235 = class201.method1405(true, " loggt sich ein)3");

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "J")
    public static long field230;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lsg;")
    public static class191 field229;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lfa;")
    public static class235 field238;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILmi;)V", line = 20)
    public static final void method98(int arg0, class92 arg1) {
        if (arg0 > -93) {
            method101(-61, -100, 62, 70, 107, false);
        }
        field240++;
        int var2 = class123.field2035 >> 2 << 10;
        int var3 = class46.field692 >> 1;
        byte[][] var4 = new byte[class184.field2955][class248.field4219];
        while (arg1.field1476 < arg1.field1495.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method702(-1) == 1) {
                var7 = arg1.method702(-1);
                var6 = arg1.method702(-1);
                var5 = true;
            }
            int var8 = arg1.method702(-1);
            int var9 = arg1.method702(-1);
            int var10 = var8 * 64 - field239;
            int var11 = class248.field4219 + class164.field2666 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class184.field2955 > var10 + 63 && var11 < class248.field4219) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var7 * 8 <= var12 && (var7 * 8 + 8) > var12 && var14 >= var6 * 8 && (var6 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg1.method743((byte) 81);
                        }
                    }
                }
            } else if (var5) {
                arg1.field1476 += 64;
            } else {
                arg1.field1476 += 4096;
            }
        }
        int var15 = class184.field2955;
        int var16 = class248.field4219;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class5 var26 = class156.method1153(var25 - 1, true);
                        var20[var23] += var26.field48;
                        var17[var23] += var26.field63;
                        var19[var23] += var26.field49;
                        var18[var23] += var26.field61;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class5 var29 = class156.method1153(var28 - 1, true);
                        var20[var23] -= var29.field48;
                        var17[var23] -= var29.field63;
                        var19[var23] -= var29.field49;
                        var18[var23] -= var29.field61;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class177.field2841[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var37 < var16) {
                        var32 += var17[var37];
                        var31 += var20[var37];
                        var34 += var21[var37];
                        var35 += var19[var37];
                        var33 += var18[var37];
                    }
                    if (var38 >= 0) {
                        var35 -= var19[var38];
                        var33 -= var18[var38];
                        var34 -= var21[var38];
                        var31 -= var20[var38];
                        var32 -= var17[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class72.method516(var32 / var34, (byte) 40, var31 * 256 / var33, var35 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[(class234.method1648(var36, 63) << 6) + class234.method1648(var22, 63)] = class23.field246[class191.method1335(96, (byte) 80, var42)];
                        } else if (var39 != null) {
                            var39[(class234.method1648(var36, 63) << 6) + class234.method1648(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V", line = 251)
    public static final void method99(int arg0, int arg1) {
        field237++;
        if (class60.field876 == arg1) {
            class78.field1307.method562(arg0, arg1 ^ 0xFFFFFF6D);
        } else {
            class246.field4180 = arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([II)[I", line = 271)
    public static final int[] method100(int[] arg0, int arg1) {
        field233++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class231.method1637(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIZ)V", line = 291)
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var6 = 0;
        field232++;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 << 2;
        int var15 = var9 - ((var12 - 1) * var11);
        if (!arg5) {
            method101(-82, -12, 120, -54, -120, false);
        }
        int var16 = ((arg1 << 1) - 3) * var11;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = var8 << 2;
        if (class99.field1630 <= arg3 && arg3 <= class81.field1348) {
            int var19 = class4.method17(class176.field2819, -16168, class52.field755, arg2 + arg4);
            int var20 = class4.method17(class176.field2819, -16168, class52.field755, arg4 - arg2);
            class271.method1861(arg0, true, class282.field4817[arg3], var19, var20);
        }
        int var21 = (var6 + 1) * var14;
        int var22 = (arg1 - 1) * var18;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var21;
                    var13 += var17;
                    var21 += var14;
                    var6++;
                    var17 += var14;
                }
            }
            var7--;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var15 < 0) {
                var13 += var17;
                var15 += var21;
                var21 += var14;
                var17 += var14;
                var6++;
            }
            var15 += -var16;
            var13 += -var22;
            var22 -= var18;
            var16 -= var18;
            if (var24 >= class99.field1630 && class81.field1348 >= var23) {
                int var25 = class4.method17(class176.field2819, -16168, class52.field755, arg4 + var6);
                int var26 = class4.method17(class176.field2819, -16168, class52.field755, arg4 - var6);
                if (var23 >= class99.field1630) {
                    class271.method1861(arg0, true, class282.field4817[var23], var25, var26);
                }
                if (class81.field1348 >= var24) {
                    class271.method1861(arg0, true, class282.field4817[var24], var25, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[[F[[B[[F[[I[[B[[BB[[I[[F[[[B[[B)[Lmk;", line = 408)
    public static final class224[] method102(int arg0, float[][] arg1, byte[][] arg2, float[][] arg3, int[][] arg4, byte[][] arg5, byte[][] arg6, byte arg7, int[][] arg8, float[][] arg9, byte[][][] arg10, byte[][] arg11) {
        field234++;
        class49 var12 = new class49(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg6[var13][var14] & 0xFF;
                int var16 = arg2[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class35 var17 = class247.method1726(var16 - 1, (byte) 61);
                    if (var17.field466 == -1) {
                        continue;
                    }
                    class224 var18 = class161.method1173(var12, arg7 + 9, var17);
                    byte var19 = arg5[var13][var14];
                    int[] var20 = class194.field3270[var19];
                    var18.field3909 += var20.length / 2;
                    var18.field3898++;
                    if (var17.field454 && var15 != 0) {
                        var18.field3909 += class256.field4323[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var16 != 0 && arg5[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = arg2[var13][var14 + 1] & 0xFF;
                    int var26 = 0;
                    int var27 = 0;
                    int var28 = arg2[var13 - 1][var14] & 0xFF;
                    int var29 = arg2[var13][var14 - 1] & 0xFF;
                    int var30 = arg2[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg2[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg2[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg2[var13 + 1][var14] & 0xFF;
                    int var34 = arg2[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class35 var35 = class247.method1726(var31 - 1, (byte) -117);
                        if (var35.field454 && var35.field466 != -1) {
                            byte var36 = arg11[var13 - 1][var14 + 1];
                            byte var37 = arg5[var13 - 1][var14 + 1];
                            int var38 = class113.field1879[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class113.field1879[(var36 + 2 & 0x3) + var37 * 4];
                            if (class62.field909[var38][1] && class62.field909[var39][0]) {
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
                    if (var30 == 0 || var16 == var30) {
                        boolean var52 = false;
                    } else {
                        class35 var44 = class247.method1726(var30 - 1, (byte) 117);
                        if (var44.field454 && var44.field466 != -1) {
                            byte var45 = arg5[var13 - 1][var14 - 1];
                            byte var46 = arg11[var13 - 1][var14 - 1];
                            int var47 = class113.field1879[(var46 & 0x3) + var45 * 4];
                            int var48 = class113.field1879[(var46 + 3 & 0x3) + var45 * 4];
                            if (class62.field909[var47][1] && class62.field909[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var21[var22++] = var30;
                                        break;
                                    }
                                    if (var21[var50] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var61 = false;
                    } else {
                        class35 var53 = class247.method1726(var32 - 1, (byte) -110);
                        if (var53.field454 && var53.field466 != -1) {
                            byte var54 = arg11[var13 + 1][var14 - 1];
                            byte var55 = arg5[var13 + 1][var14 - 1];
                            int var56 = class113.field1879[(var54 + 1 & 0x3) + var55 * 4];
                            int var57 = class113.field1879[(var54 & 0x3) + var55 * 4];
                            if (class62.field909[var56][1] && class62.field909[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var22 == var59) {
                                        var21[var22++] = var32;
                                        break;
                                    }
                                    if (var21[var59] == var32) {
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
                        class35 var62 = class247.method1726(var34 - 1, (byte) 57);
                        if (var62.field454 && var62.field466 != -1) {
                            byte var63 = arg11[var13 + 1][var14 + 1];
                            byte var64 = arg5[var13 + 1][var14 + 1];
                            int var65 = class113.field1879[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class113.field1879[(var63 + 1 & 0x3) + var64 * 4];
                            if (class62.field909[var65][1] && class62.field909[var66][0]) {
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
                        class35 var71 = class247.method1726(var25 - 1, (byte) 104);
                        if (var71.field454 && var71.field466 != -1) {
                            var23 = class113.field1879[(arg11[var13][var14 + 1] + 2 & 0x3) + arg5[var13][var14 + 1] * 4];
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
                    if (var28 != 0 && var16 != var28) {
                        class35 var73 = class247.method1726(var28 - 1, (byte) 78);
                        if (var73.field454 && var73.field466 != -1) {
                            var27 = class113.field1879[(arg11[var13 - 1][var14] + 3 & 0x3) + arg5[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var21[var22++] = var28;
                                    break;
                                }
                                if (var21[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class35 var75 = class247.method1726(var29 - 1, (byte) 38);
                        if (var75.field454 && var75.field466 != -1) {
                            var24 = class113.field1879[arg5[var13][var14 - 1] * 4 + (arg11[var13][var14 - 1] & 0x3)];
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
                    if (var33 != 0 && var16 != var33) {
                        class35 var77 = class247.method1726(var33 - 1, (byte) -113);
                        if (var77.field454 && var77.field466 != -1) {
                            var26 = class113.field1879[(arg11[var13 + 1][var14] + 1 & 0x3) + arg5[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var21[var22++] = var33;
                                    break;
                                }
                                if (var21[var78] == var33) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class62.field909[var25 == var80 ? var23 : 0];
                        boolean[] var82 = class62.field909[var28 == var80 ? var27 : 0];
                        boolean[] var83 = class62.field909[var33 == var80 ? var26 : 0];
                        boolean[] var84 = class62.field909[var29 == var80 ? var24 : 0];
                        class35 var85 = class247.method1726(var80 - 1, (byte) 55);
                        class224 var86 = class161.method1173(var12, 0, var85);
                        var86.field3909 += 5;
                        var86.field3909 += var81.length - 2;
                        var86.field3909 += var82.length - 2;
                        var86.field3909 += var84.length - 2;
                        var86.field3909 += var83.length - 2;
                        var86.field3898++;
                    }
                }
            }
        }
        for (class224 var87 = (class224) var12.method317(-70); var87 != null; var87 = (class224) var12.method314(arg7 ^ 0x78)) {
            var87.method1590();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg6[var88][var89] & 0xFF;
                int var91;
                if ((arg10[arg0][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg0 > 0) {
                    var91 = arg0 - 1;
                } else {
                    var91 = arg0;
                }
                int var92 = arg2[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class35 var93 = class247.method1726(var92 - 1, (byte) 113);
                    if (var93.field466 == -1) {
                        continue;
                    }
                    class224 var94 = class161.method1173(var12, 0, var93);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg11[var88][var89];
                    int var97 = class64.method461(var93.field466, var93.field461, true, arg8[var88][var89]);
                    int var98 = class64.method461(var93.field466, var93.field461, true, arg8[var88 + 1][var89]);
                    int var99 = class64.method461(var93.field466, var93.field461, true, arg8[var88 + 1][var89 + 1]);
                    int var100 = class64.method461(var93.field466, var93.field461, true, arg8[var88][var89 + 1]);
                    class96.method762(var88, var98, arg4, var91, var99, var90 != 0 && var93.field454, var97, arg3, arg7 ^ 0xFFFFFFF2, var96, var95, var94, arg9, arg1, var100, var89);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var92 != 0 && arg5[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int[] var103 = new int[8];
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg2[var88][var89 + 1] & 0xFF;
                    int var108 = arg2[var88 - 1][var89] & 0xFF;
                    int var109 = arg2[var88 + 1][var89] & 0xFF;
                    int var110 = arg2[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg2[var88][var89 - 1] & 0xFF;
                    int var112 = arg2[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg2[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg2[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class35 var115 = class247.method1726(var110 - 1, (byte) 116);
                        if (var115.field454 && var115.field466 != -1) {
                            byte var116 = arg5[var88 - 1][var89 + 1];
                            byte var117 = arg11[var88 - 1][var89 + 1];
                            int var118 = class113.field1879[(var117 + 2 & 0x3) + var116 * 4];
                            int var119 = class113.field1879[(var117 + 3 & 0x3) + var116 * 4];
                            if (class62.field909[var119][1] && class62.field909[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var103[var101++] = var110;
                                        break;
                                    }
                                    if (var103[var120] == var110) {
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
                        class35 var121 = class247.method1726(var112 - 1, (byte) 59);
                        if (var121.field454 && var121.field466 != -1) {
                            byte var122 = arg11[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class113.field1879[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class113.field1879[(var122 & 0x3) + var123 * 4];
                            if (class62.field909[var125][1] && class62.field909[var124][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var103[var101++] = var112;
                                        break;
                                    }
                                    if (var103[var126] == var112) {
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
                        class35 var127 = class247.method1726(var113 - 1, (byte) -114);
                        if (var127.field454 && var127.field466 != -1) {
                            byte var128 = arg11[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class113.field1879[var129 * 4 + (var128 + 1 & 0x3)];
                            int var131 = class113.field1879[var129 * 4 + (var128 & 0x3)];
                            if (class62.field909[var130][1] && class62.field909[var131][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var103[var101++] = var113;
                                        break;
                                    }
                                    if (var103[var132] == var113) {
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
                        class35 var133 = class247.method1726(var114 - 1, (byte) 56);
                        if (var133.field454 && var133.field466 != -1) {
                            byte var134 = arg11[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class113.field1879[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class113.field1879[(var134 + 1 & 0x3) + var135 * 4];
                            if (class62.field909[var136][1] && class62.field909[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var103[var101++] = var114;
                                        break;
                                    }
                                    if (var103[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class35 var139 = class247.method1726(var107 - 1, (byte) 101);
                        if (var139.field454 && var139.field466 != -1) {
                            var102 = class113.field1879[(arg11[var88][var89 + 1] + 2 & 0x3) + arg5[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var103[var101++] = var107;
                                    break;
                                }
                                if (var103[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class35 var141 = class247.method1726(var108 - 1, (byte) 36);
                        if (var141.field454 && var141.field466 != -1) {
                            var104 = class113.field1879[arg5[var88 - 1][var89] * 4 + (arg11[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var103[var101++] = var108;
                                    break;
                                }
                                if (var103[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class35 var143 = class247.method1726(var111 - 1, (byte) 99);
                        if (var143.field454 && var143.field466 != -1) {
                            var105 = class113.field1879[arg5[var88][var89 - 1] * 4 + (arg11[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var103[var101++] = var111;
                                    break;
                                }
                                if (var103[var144] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class35 var145 = class247.method1726(var109 - 1, (byte) 92);
                        if (var145.field454 && var145.field466 != -1) {
                            var106 = class113.field1879[(arg11[var88 + 1][var89] + 1 & 0x3) + arg5[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var103[var101++] = var109;
                                    break;
                                }
                                if (var103[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var103[var147];
                        boolean[] var149 = class62.field909[var107 == var148 ? var102 : 0];
                        boolean[] var150 = class62.field909[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class62.field909[var111 == var148 ? var105 : 0];
                        boolean[] var152 = class62.field909[var109 == var148 ? var106 : 0];
                        class35 var153 = class247.method1726(var148 - 1, (byte) 66);
                        class224 var154 = class161.method1173(var12, 0, var153);
                        int var155 = class64.method461(var153.field466, var153.field461, true, arg8[var88][var89]) << 8 | 0xFF;
                        int var156 = class64.method461(var153.field466, var153.field461, true, arg8[var88 + 1][var89]) << 8 | 0xFF;
                        int var157 = class64.method461(var153.field466, var153.field461, true, arg8[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var158 = class64.method461(var153.field466, var153.field461, true, arg8[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var159 = var110 != var148 && var150[0] && var149[1];
                        byte var160 = 6;
                        boolean var161 = var114 != var148 && var149[0] && var152[1];
                        boolean var162 = var112 != var148 && var151[0] && var150[1];
                        int var163 = var149.length + var160 - 2;
                        int var164 = var150.length + var163 - 2;
                        int var165 = var151.length + var164 - 2;
                        boolean var166 = var113 != var148 && var152[0] && var151[1];
                        int var167 = var152.length + var165 - 2;
                        int[] var168 = new int[var167];
                        byte var169 = 0;
                        int var170 = class251.method1745(64, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) 110, 64, var157, var156, 0, true);
                        int var171 = class251.method1745(0, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) 103, 128, var157, var156, 0, var159);
                        int var172 = class251.method1745(128, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) 91, 128, var157, var156, 0, var161);
                        int var173 = class251.method1745(0, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) 125, 0, var157, var156, 0, var162);
                        int var174 = class251.method1745(128, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) -103, 0, var157, var156, 0, var166);
                        int var180 = var169 + 1;
                        var168[var169] = var170;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class251.method1745(64, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) -84, 128, var157, var156, 0, var149[2]);
                        }
                        var168[var180++] = var171;
                        if (var150.length > 2) {
                            var168[var180++] = class251.method1745(0, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) -50, 64, var157, var156, 0, var150[2]);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class251.method1745(64, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) 126, 0, var157, var156, 0, var151[2]);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class251.method1745(128, var89, arg4, var154, var88, var155, (int[][]) null, 0.0F, arg3, var158, arg9, arg1, (byte) -60, 64, var157, var156, 0, var152[2]);
                        }
                        var168[var180++] = var172;
                        var154.method1592(var91, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        if (arg7 != -9) {
            method102(6, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (byte) -88, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte[][][]) ((byte[][][]) null), (byte[][]) ((byte[][]) null));
        }
        for (class224 var175 = (class224) var12.method317(-23); var175 != null; var175 = (class224) var12.method314(-96)) {
            if (var175.field3886 == 0) {
                var175.method1444((byte) 89);
            } else {
                var175.method1589();
            }
        }
        int var176 = var12.method312(-78);
        class224[] var177 = new class224[var176];
        var12.method308((byte) -104, var177);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field3499;
        }
        class207.method1451(var177, var178, true);
        return var177;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 1336)
    public static void method103(byte arg0) {
        int var1 = -56 / ((arg0 - 3) / 38);
        field229 = null;
        field231 = null;
        field235 = null;
        field238 = null;
    }
}
