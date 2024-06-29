import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class222 {

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public int field3708 = -1;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lbd;")
    public static class162 field3701 = class17.method142(0, "<col=00ffff>");

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "[I")
    private static int[] field3711 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Lbd;")
    public static class162 field3716 = class17.method142(0, "headicons_prayer");

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Ljd;")
    public static class134 field3710;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "[I")
    public static int[] field3713;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "[Ldc;")
    public static class71[] field3709;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3703++;
        int var5 = 0;
        if (arg2 < 93) {
            field3711 = (int[]) null;
        }
        while (var5 < class258.field4293) {
            if (arg4 < class214.field3593[var5] + class111.field2015[var5] && arg3 + arg4 > class111.field2015[var5] && arg0 < (class230.field3834[var5] + class283.field4799[var5]) && class230.field3834[var5] < arg0 + arg1) {
                class73.field1159[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lib;Lb;BI)V", line = 38)
    public static final void method1609(class28 arg0, class94 arg1, byte arg2, int arg3) {
        field3704++;
        class186 var4 = new class186();
        int var5 = 110 % ((66 - arg2) / 51);
        var4.field3215 = arg1.method756(915905888);
        var4.field3207 = arg1.method747(false);
        var4.field3204 = new int[var4.field3215];
        var4.field3202 = new int[var4.field3215];
        var4.field3209 = new class166[var4.field3215];
        var4.field3201 = new byte[var4.field3215][][];
        var4.field3213 = new int[var4.field3215];
        var4.field3211 = new class166[var4.field3215];
        for (int var6 = 0; var6 < var4.field3215; var6++) {
            try {
                int var7 = arg1.method756(915905888);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = new String(arg1.method744((byte) 44).method1263(-101));
                    String var9 = new String(arg1.method744((byte) 84).method1263(-105));
                    int var10 = 0;
                    if (var7 == 1) {
                        var10 = arg1.method747(false);
                    }
                    var4.field3204[var6] = var7;
                    var4.field3213[var6] = var10;
                    var4.field3209[var6] = arg0.method226(var9, class49.method362(var8, 15605), (byte) -78);
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = new String(arg1.method744((byte) 67).method1263(-101));
                    String var12 = new String(arg1.method744((byte) 126).method1263(-94));
                    int var13 = arg1.method756(915905888);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = new String(arg1.method744((byte) 65).method1263(-104));
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg1.method747(false);
                            var16[var17] = new byte[var18];
                            arg1.method726(-31267, var16[var17], 0, var18);
                        }
                    }
                    var4.field3204[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class49.method362(var14[var20], 15605);
                    }
                    var4.field3211[var6] = arg0.method227(var19, -123, var12, class49.method362(var11, 15605));
                    var4.field3201[var6] = var16;
                }
            } catch (ClassNotFoundException var26) {
                var4.field3202[var6] = -1;
            } catch (SecurityException var27) {
                var4.field3202[var6] = -2;
            } catch (NullPointerException var28) {
                var4.field3202[var6] = -3;
            } catch (Exception var29) {
                var4.field3202[var6] = -4;
            } catch (Throwable var30) {
                var4.field3202[var6] = -5;
            }
        }
        class144.field2632.method167(false, var4);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[[B[[F[[I[[F[[B[[I[[B[[[B[[B[[FI)[Lba;", line = 149)
    public static final class26[] method1610(int arg0, byte[][] arg1, float[][] arg2, int[][] arg3, float[][] arg4, byte[][] arg5, int[][] arg6, byte[][] arg7, byte[][][] arg8, byte[][] arg9, float[][] arg10, int arg11) {
        field3715++;
        class235 var12 = new class235(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg9[var13][var14] & 0xFF;
                int var16 = arg5[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class266 var17 = class83.method644(arg11 ^ 0x23, var16 - 1);
                    if (var17.field4426 == -1) {
                        continue;
                    }
                    class26 var18 = class198.method1481(-1311374240, var12, var17);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class43.field710[var19];
                    var18.field419 += var20.length / 2;
                    var18.field432++;
                    if (var17.field4437 && var15 != 0) {
                        var18.field419 += field3711[var19];
                    }
                }
                if ((arg9[var13][var14] & 0xFF) != 0 || var16 != 0 && arg1[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg5[var13 - 1][var14] & 0xFF;
                    int var28 = arg5[var13][var14 + 1] & 0xFF;
                    int var29 = arg5[var13][var14 - 1] & 0xFF;
                    int var30 = arg5[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg5[var13 + 1][var14] & 0xFF;
                    int var32 = arg5[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg5[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg5[var13 + 1][var14 - 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class266 var35 = class83.method644(-128, var30 - 1);
                        if (var35.field4437 && var35.field4426 != -1) {
                            byte var36 = arg1[var13 - 1][var14 + 1];
                            byte var37 = arg7[var13 - 1][var14 + 1];
                            int var38 = class39.field607[(var37 + 2 & 0x3) + var36 * 4];
                            int var39 = class39.field607[var36 * 4 + (var37 + 3 & 0x3)];
                            if (class203.field3431[var39][1] && class203.field3431[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var41] == var30) {
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
                        class266 var44 = class83.method644(arg11 ^ 0x2, var32 - 1);
                        if (var44.field4437 && var44.field4426 != -1) {
                            byte var45 = arg7[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class39.field607[(var45 + 3 & 0x3) + var46 * 4];
                            int var48 = class39.field607[(var45 & 0x3) + var46 * 4];
                            if (class203.field3431[var48][1] && class203.field3431[var47][0]) {
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
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class266 var53 = class83.method644(-127, var34 - 1);
                        if (var53.field4437 && var53.field4426 != -1) {
                            byte var54 = arg1[var13 + 1][var14 - 1];
                            byte var55 = arg7[var13 + 1][var14 - 1];
                            int var56 = class39.field607[(var55 & 0x3) + var54 * 4];
                            int var57 = class39.field607[var54 * 4 + (var55 + 1 & 0x3)];
                            if (class203.field3431[var57][1] && class203.field3431[var56][0]) {
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
                        class266 var62 = class83.method644(15, var33 - 1);
                        if (var62.field4437 && var62.field4426 != -1) {
                            byte var63 = arg7[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class39.field607[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class39.field607[var64 * 4 + (var63 + 2 & 0x3)];
                            if (class203.field3431[var66][1] && class203.field3431[var65][0]) {
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
                    if (var28 != 0 && var16 != var28) {
                        class266 var71 = class83.method644(109, var28 - 1);
                        if (var71.field4437 && var71.field4426 != -1) {
                            var23 = class39.field607[arg1[var13][var14 + 1] * 4 + (arg7[var13][var14 + 1] + 2 & 0x3)];
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
                        class266 var73 = class83.method644(68, var27 - 1);
                        if (var73.field4437 && var73.field4426 != -1) {
                            var26 = class39.field607[(arg7[var13 - 1][var14] + 3 & 0x3) + arg1[var13 - 1][var14] * 4];
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
                        class266 var75 = class83.method644(arg11 - 119, var29 - 1);
                        if (var75.field4437 && var75.field4426 != -1) {
                            var24 = class39.field607[(arg7[var13][var14 - 1] & 0x3) + arg1[var13][var14 - 1] * 4];
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
                    if (var31 != 0 && var16 != var31) {
                        class266 var77 = class83.method644(-125, var31 - 1);
                        if (var77.field4437 && var77.field4426 != -1) {
                            var25 = class39.field607[arg1[var13 + 1][var14] * 4 + (arg7[var13 + 1][var14] + 1 & 0x3)];
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
                        boolean[] var81 = class203.field3431[var27 == var80 ? var26 : 0];
                        boolean[] var82 = class203.field3431[var29 == var80 ? var24 : 0];
                        boolean[] var83 = class203.field3431[var28 == var80 ? var23 : 0];
                        boolean[] var84 = class203.field3431[var31 == var80 ? var25 : 0];
                        class266 var85 = class83.method644(-126, var80 - 1);
                        class26 var86 = class198.method1481(-1311374240, var12, var85);
                        var86.field419 += 5;
                        var86.field419 += var83.length - 2;
                        var86.field419 += var81.length - 2;
                        var86.field419 += var82.length - 2;
                        var86.field419 += var84.length - 2;
                        var86.field432++;
                    }
                }
            }
        }
        for (class26 var87 = (class26) var12.method1666((byte) -105); var87 != null; var87 = (class26) var12.method1673((byte) -125)) {
            var87.method208();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg8[arg0][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg8[1][var88][var89] & 0x2) == 2 && arg0 > 0) {
                    var90 = arg0 - 1;
                } else {
                    var90 = arg0;
                }
                int var91 = arg9[var88][var89] & 0xFF;
                int var92 = arg5[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class266 var93 = class83.method644(arg11 ^ 0xFFFFFF80, var92 - 1);
                    if (var93.field4426 == -1) {
                        continue;
                    }
                    class26 var94 = class198.method1481(-1311374240, var12, var93);
                    byte var95 = arg7[var88][var89];
                    byte var96 = arg1[var88][var89];
                    int var97 = class47.method350(var93.field4439, -109, arg6[var88][var89], var93.field4426);
                    int var98 = class47.method350(var93.field4439, -90, arg6[var88 + 1][var89], var93.field4426);
                    int var99 = class47.method350(var93.field4439, arg11 - 67, arg6[var88 - -1][var89 + 1], var93.field4426);
                    int var100 = class47.method350(var93.field4439, arg11 ^ 0xFFFFFFAE, arg6[var88][var89 + 1], var93.field4426);
                    class46.method337(var88, var96, var90, arg4, var89, var95, var94, var97, var91 != 0 && var93.field4437, arg3, var99, arg2, var98, arg10, var100, (byte) -76);
                }
                if ((arg9[var88][var89] & 0xFF) != 0 || var92 != 0 && arg1[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int[] var103 = new int[8];
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg5[var88 - 1][var89] & 0xFF;
                    int var108 = arg5[var88][var89 + 1] & 0xFF;
                    int var109 = arg5[var88 - 1][var89 + 1] & 0xFF;
                    int var110 = arg5[var88][var89 - 1] & 0xFF;
                    int var111 = arg5[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg5[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg5[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg5[var88 + 1][var89] & 0xFF;
                    if (var109 == 0 || var92 == var109) {
                        var109 = 0;
                    } else {
                        class266 var115 = class83.method644(-128, var109 - 1);
                        if (var115.field4437 && var115.field4426 != -1) {
                            byte var116 = arg1[var88 - 1][var89 + 1];
                            byte var117 = arg7[var88 - 1][var89 + 1];
                            int var118 = class39.field607[var116 * 4 + (var117 + 3 & 0x3)];
                            int var119 = class39.field607[(var117 + 2 & 0x3) + var116 * 4];
                            if (class203.field3431[var118][1] && class203.field3431[var119][0]) {
                                var109 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var103[var101++] = var109;
                                        break;
                                    }
                                    if (var103[var120] == var109) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var109 = 0;
                        }
                    }
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class266 var121 = class83.method644(arg11 ^ 0x42, var111 - 1);
                        if (var121.field4437 && var121.field4426 != -1) {
                            byte var122 = arg1[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class39.field607[(var123 + 3 & 0x3) + var122 * 4];
                            int var125 = class39.field607[(var123 & 0x3) + var122 * 4];
                            if (class203.field3431[var125][1] && class203.field3431[var124][0]) {
                                var111 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var103[var101++] = var111;
                                        break;
                                    }
                                    if (var103[var126] == var111) {
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
                        class266 var127 = class83.method644(arg11 ^ 0x45, var112 - 1);
                        if (var127.field4437 && var127.field4426 != -1) {
                            byte var128 = arg1[var88 + 1][var89 - 1];
                            byte var129 = arg7[var88 + 1][var89 - 1];
                            int var130 = class39.field607[var128 * 4 + (var129 + 1 & 0x3)];
                            int var131 = class39.field607[(var129 & 0x3) + var128 * 4];
                            if (class203.field3431[var130][1] && class203.field3431[var131][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var103[var101++] = var112;
                                        break;
                                    }
                                    if (var103[var132] == var112) {
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
                        class266 var133 = class83.method644(107, var113 - 1);
                        if (var133.field4437 && var133.field4426 != -1) {
                            byte var134 = arg7[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class39.field607[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class39.field607[(var134 + 1 & 0x3) + var135 * 4];
                            if (class203.field3431[var136][1] && class203.field3431[var137][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var103[var101++] = var113;
                                        break;
                                    }
                                    if (var103[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class266 var139 = class83.method644(50, var108 - 1);
                        if (var139.field4437 && var139.field4426 != -1) {
                            var102 = class39.field607[(arg7[var88][var89 + 1] + 2 & 0x3) + arg1[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var103[var101++] = var108;
                                    break;
                                }
                                if (var103[var140] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class266 var141 = class83.method644(-122, var107 - 1);
                        if (var141.field4437 && var141.field4426 != -1) {
                            var104 = class39.field607[arg1[var88 - 1][var89] * 4 + (arg7[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var103[var101++] = var107;
                                    break;
                                }
                                if (var103[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class266 var143 = class83.method644(arg11 ^ 0x5F, var110 - 1);
                        if (var143.field4437 && var143.field4426 != -1) {
                            var105 = class39.field607[(arg7[var88][var89 - 1] & 0x3) + arg1[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var103[var101++] = var110;
                                    break;
                                }
                                if (var103[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var114 != 0 && var92 != var114) {
                        class266 var145 = class83.method644(-128, var114 - 1);
                        if (var145.field4437 && var145.field4426 != -1) {
                            var106 = class39.field607[(arg7[var88 + 1][var89] + 1 & 0x3) + arg1[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var103[var101++] = var114;
                                    break;
                                }
                                if (var103[var146] == var114) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var103[var147];
                        boolean[] var149 = class203.field3431[var107 == var148 ? var104 : 0];
                        boolean[] var150 = class203.field3431[var114 == var148 ? var106 : 0];
                        boolean[] var151 = class203.field3431[var110 == var148 ? var105 : 0];
                        boolean[] var152 = class203.field3431[var108 == var148 ? var102 : 0];
                        class266 var153 = class83.method644(93, var148 - 1);
                        class26 var154 = class198.method1481(-1311374240, var12, var153);
                        int var155 = class47.method350(var153.field4439, arg11 ^ 0xFFFFFF8F, arg6[var88][var89], var153.field4426) << 8 | 0xFF;
                        int var156 = class47.method350(var153.field4439, -87, arg6[var88 + 1][var89], var153.field4426) << 8 | 0xFF;
                        int var157 = class47.method350(var153.field4439, -102, arg6[var88 + 1][var89 + 1], var153.field4426) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class47.method350(var153.field4439, -74, arg6[var88][var89 + 1], var153.field4426) << 8 | 0xFF;
                        boolean var160 = var109 != var148 && var149[0] && var152[1];
                        int var161 = var152.length + var158 - 2;
                        int var162 = var149.length + var161 - 2;
                        int var163 = var151.length + var162 - 2;
                        boolean var164 = var113 != var148 && var152[0] && var150[1];
                        boolean var165 = var111 != var148 && var151[0] && var149[1];
                        boolean var166 = var112 != var148 && var150[0] && var151[1];
                        int var167 = var150.length + var163 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class265.method1817(arg4, 0, arg2, var156, false, arg10, 64, 64, var155, var88, true, var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        int var170 = class265.method1817(arg4, 0, arg2, var156, false, arg10, 128, 0, var155, var88, var160, var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        int var171 = class265.method1817(arg4, 0, arg2, var156, false, arg10, 128, 128, var155, var88, var164, var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        byte var172 = 0;
                        int var173 = class265.method1817(arg4, 0, arg2, var156, false, arg10, 0, 0, var155, var88, var165, var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        int var174 = class265.method1817(arg4, 0, arg2, var156, false, arg10, 0, 128, var155, var88, var166, var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        int var180 = var172 + 1;
                        var168[var172] = var169;
                        var168[var180++] = var171;
                        if (var152.length > 2) {
                            var168[var180++] = class265.method1817(arg4, 0, arg2, var156, false, arg10, 128, 64, var155, var88, var152[2], var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        }
                        var168[var180++] = var170;
                        if (var149.length > 2) {
                            var168[var180++] = class265.method1817(arg4, 0, arg2, var156, false, arg10, 64, 0, var155, var88, var149[2], var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class265.method1817(arg4, 0, arg2, var156, false, arg10, 0, 64, var155, var88, var151[2], var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        }
                        var168[var180++] = var174;
                        if (var150.length > 2) {
                            var168[var180++] = class265.method1817(arg4, 0, arg2, var156, false, arg10, 64, 128, var155, var88, var150[2], var154, var159, var89, var157, (int[][]) null, 0.0F, arg3);
                        }
                        var168[var180++] = var171;
                        var154.method209(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class26 var175 = (class26) var12.method1666((byte) -74); var175 != null; var175 = (class26) var12.method1673((byte) -24)) {
            if (var175.field431 == 0) {
                var175.method1183(false);
            } else {
                var175.method210();
            }
        }
        int var176 = var12.method1669(false);
        class26[] var177 = new class26[var176];
        long[] var178 = new long[var176];
        var12.method1671(var177, 0);
        for (int var179 = arg11; var179 < var176; var179++) {
            var178[var179] = var177[var179].field2701;
        }
        class265.method1814(var178, var177, 0);
        return var177;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 1083)
    public static void method1611(byte arg0) {
        field3716 = null;
        field3713 = null;
        field3711 = null;
        int var1 = 12 % ((-arg0 - 41) / 32);
        field3709 = null;
        field3701 = null;
        field3710 = null;
    }
}
