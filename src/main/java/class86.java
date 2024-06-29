import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class86 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    public int[] field1053;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    public int[] field1052;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "[[S")
    public static short[][] field1060 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lvq;")
    public static class24 field1054 = new class24(99, 8);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1069 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field1063;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[[B[[BZ[[BIILui;Lfp;[[II[[BLui;)V", line = 7)
    public static final void method579(int arg0, byte[][] arg1, byte[][] arg2, boolean arg3, byte[][] arg4, int arg5, int arg6, class378 arg7, class9 arg8, int[][] arg9, int arg10, byte[][] arg11, class378 arg12) {
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = 0; var14 < arg6; var14++) {
                if (class163.method1082((byte) 95) || class136.method907(var13, var14, arg10, false, class276.field4085)) {
                    byte var15 = arg11[var13][var14];
                    byte var16 = arg4[var13][var14];
                    int var17 = arg2[var13][var14] & 0xFF;
                    int var18 = arg1[var13][var14] & 0xFF;
                    class103 var19 = var17 == 0 ? null : class465.method2868(-71, var17 - 1);
                    class148 var20 = var18 == 0 ? null : class104.method700(arg5 - 21854, var18 + -1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var22 = var19 == null ? 0 : client.field3881[var15];
                        var21 = var20 == null ? 0 : class463.field6827[var15];
                    } else if (var19 != null) {
                        var22 = client.field3881[var15];
                    } else if (var20 != null) {
                        var21 = client.field3881[var15];
                    }
                    int var23 = var22 + var21;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 == null || var19.field1338 == -1 && var19.field1326 == -1 && var19.field1329 == -1) {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var30 = arg8.method109() ? var19.field1329 : var19.field1333;
                            if (!class403.field5834) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field1327;
                                if (var19.field1338 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field1338;
                                }
                                if (var19.field1326 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var29 = true;
                                    var26[var24] = var19.field1326;
                                }
                                var24++;
                            }
                            if (!arg3 && arg10 == 0) {
                                class62.method465(var13, var14, var19.field1339, var19.field1328 * 8);
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var33 = 0; var33 < var21; var33++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var34 = var20.field2004;
                            if (!class403.field5834) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field2014;
                                var25[var24] = arg9[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class373.field5456.length;
                        int[] var37 = arg3 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class373.field5456[var40];
                            int var49 = class244.field3617[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg3 && class149.field2022[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg7.method1427(var52, var53) - arg12.method1427(var52, var53);
                            }
                        }
                        int var41 = arg12.method1429(var13, var14);
                        int var42 = arg12.method1429(var13 + 1, var14);
                        int var43 = arg12.method1429(var13 + 1, var14 + 1);
                        int var44 = arg12.method1429(var13, var14 + 1);
                        if (arg10 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field1317) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class282.field4150[arg10][var13][var14] = (byte) class259.method1785(class282.field4150[arg10][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg3) {
                            var46 = class331.method2159(var13, var14);
                            var47 = class75.method530(var13, var14);
                        }
                        arg12.method1425(var13, var14, var38, var37, var39, class166.field2193[var15], class275.field4076[var15], class429.field6242[var15], var25, var26, var27, var28, var46, var47, false);
                        class202.method1391(arg10, var13, var14);
                    }
                }
            }
        }
        if (arg5 != -1) {
            method584((byte) 104, 82, 4, (class9) null);
        }
        field1057++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILkg;I)V", line = 288)
    public static final void method580(int arg0, int arg1, class223 arg2, int arg3) {
        field1051++;
        class195 var4 = arg2.method1534((byte) -111, class74.field942);
        if (var4 == null) {
            return;
        }
        class74.field942.method77(arg1, arg0, arg2.field3233 + arg1, arg0 - -arg2.field3352);
        if (arg3 != 14504) {
            method582((byte) 6, -38);
        }
        if (class164.field2169 < 3) {
            class100.field1245.method1916((float) arg2.field3233 / 2.0F + (float) arg1, (float) arg2.field3352 / 2.0F + (float) arg0, 4096, ((int) (-class1.field19) & 0x3FFF) << 2, var4, arg1, arg0);
        } else {
            class74.field942.method105(-16777216, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZILkg;)V", line = 314)
    public static final void method581(boolean arg0, int arg1, class223 arg2) {
        if (arg1 >= -98) {
            return;
        }
        field1059++;
        int var3 = arg2.field3218 == 0 ? arg2.field3233 : arg2.field3218;
        int var4 = arg2.field3318 == 0 ? arg2.field3352 : arg2.field3318;
        class139.method920(class444.field6470[arg2.field3223 >> 16], arg2.field3223, arg0, var3, (byte) 102, var4);
        if (arg2.field3340 != null) {
            class139.method920(arg2.field3340, arg2.field3223, arg0, var3, (byte) 102, var4);
        }
        class182 var5 = (class182) class252.field3703.method609((long) arg2.field3223, 67);
        if (var5 != null) {
            class289.method1934(var4, arg0, var5.field2564, -95, var3);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[[[B", line = 342)
    public static final byte[][][] method582(byte arg0, int arg1) {
        field1062++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var21 < var20.length) {
                    if ((var22 << 1) <= var127) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if ((var28 << 1) <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var34 << 1) <= var123) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var43 >> 1) <= var120) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= var46 << 1) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if ((var49 >> 1) <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var55 >> 1 <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var58 << 1 >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var4 / 2) >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var3 / 2) <= var110) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var4 / 2) <= var76) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= (var79 - (var4 / 2))) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var82 - (var4 / 2) >= var107) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var85 - (var4 / 2))) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= (var88 - (var4 / 2))) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var91 - (var4 / 2))) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - var4 / 2)) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        int var97 = var4 - 1;
        if (arg0 != -39) {
            field1063 = null;
        }
        while (var97 >= 0) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
                    var95[var96] = -1;
                }
                var96++;
            }
            var97--;
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= var100 - (var4 / 2)) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpk;)V", line = 1120)
    public static final void method583(class157 arg0) {
        if (class234.field3516 >= 65535) {
            return;
        }
        class120.field1613[class234.field3516] = arg0;
        class464.field6839[class234.field3516] = false;
        class234.field3516++;
        int var1 = arg0.field2100;
        if (arg0.field2107) {
            var1 = 0;
        }
        int var2 = arg0.field2100;
        if (arg0.field2105) {
            var2 = class204.field2870 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field4336 + class135.field1852 - arg0.field4332 >> class167.field2206;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field4336 + arg0.field4332 - class135.field1852 >> class167.field2206;
            if (var6 >= class380.field5590) {
                var6 = class380.field5590 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field2103[var4++];
                int var9 = (var8 >>> 8) + (arg0.field4337 + class135.field1852 - arg0.field4332 >> class167.field2206);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class329.field4899) {
                    var10 = class329.field4899 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    long var12 = class455.field6730[var3][var11][var7];
                    if ((var12 & 0xFFFFL) == 0L) {
                        class455.field6730[var3][var11][var7] = var12 | (long) class234.field3516;
                    } else if ((var12 & 0xFFFF0000L) == 0L) {
                        class455.field6730[var3][var11][var7] = var12 | (long) class234.field3516 << 16;
                    } else if ((var12 & 0xFFFF00000000L) == 0L) {
                        class455.field6730[var3][var11][var7] = var12 | (long) class234.field3516 << 32;
                    } else if ((var12 & 0xFFFF000000000000L) == 0L) {
                        class455.field6730[var3][var11][var7] = var12 | (long) class234.field3516 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIILfp;)V", line = 1210)
    public static final void method584(byte arg0, int arg1, int arg2, class9 arg3) {
        if (arg0 != 30) {
            field1064 = -18;
        }
        class388.field5677 = arg3;
        class271.field4017 = new class199[arg2][arg1];
        field1061++;
        if (class256.field3784 != null) {
            class332.field4933 = class58.method443(class256.field3784[1], class256.field3784[0], class256.field3784[5], class256.field3784[3], class256.field3784[2], class256.field3784[4], 0);
        }
        class437.field6371 = new class199();
        class264.method1818((byte) -113);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V", line = 1227)
    public class86(int arg0) {
        this.field1056 = arg0;
        this.field1053 = new int[this.field1056];
        this.field1052 = new int[this.field1056];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 1241)
    public static final void method585(int arg0) {
        field1068++;
        if (arg0 != 0) {
            field1060 = null;
        }
        class216.field3086.method2313(92);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 1252)
    public static void method586(boolean arg0) {
        field1063 = null;
        field1060 = null;
        field1054 = null;
        if (arg0) {
            method579(84, (byte[][]) null, (byte[][]) null, true, (byte[][]) null, 91, -29, (class378) null, (class9) null, (int[][]) null, -35, (byte[][]) null, (class378) null);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)V", line = 1264)
    public static final void method587(int arg0, int arg1, byte arg2) {
        field1055++;
        if (arg2 < 15) {
            field1065 = -80;
        }
        class125 var3 = class56.method428(arg0, 16, -3636);
        var3.method846(26848);
        var3.field1657 = arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 1278)
    public static final void method588(byte arg0) {
        class373.field5445.field1369 = 1;
        field1058++;
        class401.field5797.method1478(92);
        class215.field3044 = 0;
        class234.field3510 = 0;
        class450.field6576 = 0;
        class450.field6579 = 0;
        class296.field4320 = 0;
        client.field3875 = 0;
        class92.field1135 = 0;
        class141.field1917 = 0;
        class148.field1997 = 0;
        class70.field916 = 0;
        class436.field6370 = 0;
        class109.field1479 = 0;
        class450.field6588 = 0;
        class305.field4485 = 0;
        class236.field3518 = 0;
        class271.field4010 = 0;
        class251.field3684 = 0;
        class308.field4541 = 0;
        class305.field4501 = 0;
        class446.field6535 = 0;
        class210.field2957 = 0;
        class311.field4576 = 0;
        class141.field1918 = 0;
        class147.field1995 = 0;
        class38.field534 = 0;
        class26.field374 = 0;
        class135.field1851 = 0;
        class395.field5734 = 0;
        class44.field575 = 0;
        class347.field5107 = 0;
        class210.field2965 = 0;
        class399.field5772 = 0;
        class390.field5698 = 0;
        class281.field4137 = 0;
        class260.field3851 = 0;
        class446.field6495 = 0;
        class256.field3750 = 0;
        class56.field683 = 0;
        class323.field4772 = 0;
        class316.field4626 = 0;
        class429.field6232 = 0;
        class319.field4709 = 0;
        class257.field3802 = 0;
        class104.field1383 = 0;
        class130.field1728 = 0;
        class208.field2934 = 0;
        class358.field5201 = 0;
        class11.field141 = 0;
        class42.field562 = 0;
        class124.field1639 = 0;
        class113.field1548 = 0;
        class346.field5080 = 0;
        class282.field4141 = 0;
        class435.field6341 = 0;
        class11.field136 = 0;
        class316.field4622 = 0;
        class56.field681 = 0;
        class278.field4099 = 0;
        class103.field1318 = 0;
        class210.field2951 = 0;
        class127.field1677 = 0;
        class119.field1601 = 0;
        class450.field6603 = 0;
        class13.field216 = 0;
        class104.field1386 = 0;
        class267.field3957 = 0;
        class104.field1380 = 0;
        class339.field4996 = 0;
        class435.field6332 = 0;
        class286.field4181 = 0;
        class24.field333 = 0;
        class253.field3712 = 0;
        class256.field3761 = 0;
        class208.field2936 = 0;
        class150.field2029 = 0;
        class409.field5881 = 0;
        class7.field105 = 0;
        class466.field6858 = 0;
        class215.field3046 = 0;
        class58.field734 = 0;
        class365.field5272 = 0;
        class427.field6193 = 0;
        class1.field16 = 0;
        class259.field3830 = 0;
        class33.field455 = 0;
        class146.field1972 = 0;
        class178.field2457 = 0;
        class184.field2579 = 0;
        class295.field4287 = 0;
        class115.field1570 = 0;
        class17.field265 = 0;
        class456.field6735 = 0;
        class25.field351 = 0;
        class58.field767 = 0;
        class223.field3293 = 0;
        class129.field1711 = 0;
        class432.field6293 = 0;
        class77.field981 = 0;
        class427.field6139 = 0;
        class223.field3275 = 0;
        class363.field5254 = 0;
        class58.field770 = 0;
        class84.field1026 = 0;
        field1051 = 0;
        class104.field1351 = 0;
        class58.field721 = 0;
        class104.field1381 = 0;
        class354.field5160 = 0;
        class382.field5609 = 0;
        class450.field6627 = 0;
        class209.field2946 = 0;
        class260.field3841 = 0;
        class215.field3032 = 0;
        class304.field4446 = 0;
        class267.field3972 = 0;
        class104.field1368 = 0;
        class450.field6591 = 0;
        class256.field3775 = 0;
        class104.field1376 = 0;
        class228.field3418 = 0;
        class363.field5242 = 0;
        class419.field6074 = 0;
        class164.field2165 = 0;
        class165.field2179 = 0;
        class358.field5196 = 0;
        class47.field613 = 0;
        class115.field1571 = 0;
        class202.field2854 = 0;
        class359.field5217 = 0;
        class100.field1264 = 0;
        class267.field3961 = 0;
        class278.field4096 = 0;
        class228.field3426 = 0;
        class275.field4072 = 0;
        class42.field552 = 0;
        class265.field3919 = 0;
        class265.field3921 = 0;
        class184.field2583 = 0;
        class29.field411 = 0;
        class150.field2033 = 0;
        class373.field5449 = 0;
        class125.field1659 = 0;
        class178.field2521 = 0;
        class5.field71 = 0;
        class380.field5575 = 0;
        class435.field6336 = 0;
        class256.field3768 = 0;
        class320.field4722 = 0;
        class296.field4307 = 0;
        class459.field6795 = 0;
        class74.field944 = 0;
        class3.field39 = 0;
        class4.field57 = 0;
        class100.field1253 = 0;
        class256.field3773 = 0;
        class317.field4636 = 0;
        class57.field697 = 0;
        class163.field2156 = 0;
        class29.field409 = 0;
        class334.field4936 = 0;
        class1.field4 = 0;
        class453.field6677 = 0;
        class403.field5821 = 0;
        class354.field5162 = 0;
        class231.field3483 = 0;
        class82.field1014 = 0;
        class139.field1905 = 0;
        class336.field4949 = 0;
        class107.field1447 = 0;
        class63.field839 = 0;
        class186.field2607 = 0;
        class138.field1903 = 0;
        class58.field708 = 0;
        class257.field3811 = 0;
        class257.field3804 = 0;
        class60.field808 = 0;
        client.field3891 = 0;
        class60.field804 = 0;
        class58.field716 = 0;
        class67.field885 = 0;
        class274.field4056 = 0;
        class210.field2955 = 0;
        class125.field1665 = 0;
        class441.field6415 = 0;
        class149.field2019 = 0;
        class358.field5195 = 0;
        class450.field6599 = 0;
        class358.field5207 = 0;
        class15.field239 = 0;
        class256.field3793 = 0;
        class369.field5337 = 0;
        class365.field5283 = 0;
        class186.field2604 = 0;
        class202.field2845 = 0;
        class444.field6479 = 0;
        class377.field5521 = 0;
        class188.field2627 = 0;
        class180.field2555 = 0;
        class459.field6784 = 0;
        class35.field505 = 0;
        class58.field712 = 0;
        class443.field6461 = 0;
        class90.field1108 = 0;
        class454.field6692 = 0;
        class178.field2520 = 0;
        class215.field3064 = 0;
        class29.field414 = 0;
        class93.field1155 = 0;
        class305.field4464 = 0;
        class444.field6478 = 0;
        class337.field4969 = 0;
        class92.field1140 = 0;
        class100.field1284 = 0;
        class400.field5778 = 0;
        class423.field6116 = 0;
        class342.field5033 = 0;
        class446.field6496 = 0;
        class419.field6075 = 0;
        class231.field3469 = 0;
        class430.field6265 = 0;
        class259.field3825 = 0;
        class346.field5095 = 0;
        class4.field49 = 0;
        class266.field3942 = 0;
        class231.field3466 = 0;
        class450.field6630 = 0;
        class237.field3527 = 0;
        class400.field5782 = 0;
        class451.field6655 = 0;
        class390.field5694 = 0;
        class55.field678 = 0;
        class328.field4882 = 0;
        class157.field2101 = 0;
        class450.field6567 = 0;
        class377.field5504 = 0;
        class256.field3783 = 0;
        class332.field4924 = 0;
        class76.field970 = 0;
        class107.field1436 = 0;
        class367.field5311 = 0;
        class126.field1670 = 0;
        class458.field6754 = 0;
        class366.field5290 = 0;
        class26.field367 = 0;
        class443.field6456 = 0;
        class223.field3333 = 0;
        class256.field3790 = 0;
        class13.field220 = 0;
        class187.field2614 = 0;
        class5.field81 = 0;
        class104.field1367 = 0;
        class459.field6799 = 0;
        class250.field3681 = 0;
        class464.field6842 = 0;
        class195.field2746 = 0;
        class423.field6110 = 0;
        class25.field339 = 0;
        class213.field3004 = 0;
        class46.field594 = 0;
        class127.field1678 = 0;
        class377.field5508 = 0;
        class44.field584 = 0;
        class110.field1528 = 0;
        class304.field4460 = 0;
        class369.field5347 = 0;
        class24.field330 = 0;
        class256.field3797 = 0;
        class286.field4177 = 0;
        class427.field6146 = 0;
        class75.field954 = 0;
        class175.field2401 = 0;
        class127.field1679 = 0;
        class430.field6253 = 0;
        class349.field5126 = 0;
        class53.field660 = 0;
        class58.field711 = 0;
        class145.field1967 = 0;
        class215.field3065 = 0;
        class377.field5503 = 0;
        class142.field1931 = 0;
        class104.field1343 = 0;
        class213.field2998 = 0;
        class215.field3055 = 0;
        class443.field6444 = 0;
        class146.field1974 = 0;
        class395.field5738 = 0;
        class437.field6374 = 0;
        class239.field3553 = 0;
        class44.field585 = 0;
        class3.field35 = 0;
        class256.field3778 = 0;
        class196.field2762 = 0;
        class304.field4454 = 0;
        class105.field1395 = 0;
        client.field3892 = 0;
        class404.field5841 = 0;
        class141.field1926 = 0;
        class256.field3746 = 0;
        class301.field4373 = 0;
        class184.field2587 = 0;
        class35.field500 = 0;
        class46.field602 = 0;
        class385.field5629 = 0;
        class375.field5475 = 0;
        class239.field3549 = 0;
        class339.field5006 = 0;
        class320.field4724 = 0;
        class136.field1858 = 0;
        class278.field4095 = 0;
        class1.field5 = 0;
        class376.field5492 = 0;
        class320.field4716 = 0;
        class432.field6286 = 0;
        class107.field1443 = 0;
        class24.field329 = 0;
        class249.field3665 = 0;
        class150.field2027 = 0;
        class253.field3721 = 0;
        class85.field1046 = 0;
        class259.field3834 = 0;
        class136.field1860 = 0;
        class137.field1874 = 0;
        class458.field6775 = 0;
        class444.field6474 = 0;
        class332.field4921 = 0;
        class322.field4742 = 0;
        class96.field1197 = 0;
        class294.field4272 = 0;
        class228.field3417 = 0;
        class304.field4459 = 0;
        class296.field4321 = 0;
        class356.field5175 = 0;
        class294.field4280 = 0;
        class417.field6026 = 0;
        class305.field4481 = 0;
        class184.field2586 = 0;
        class369.field5329 = 0;
        class26.field364 = 0;
        class215.field3049 = 0;
        class222.field3199 = 0;
        class347.field5111 = 0;
        class84.field1029 = 0;
        class291.field4262 = 0;
        class145.field1964 = 0;
        class166.field2185 = 0;
        class35.field499 = 0;
        class210.field2952 = 0;
        class267.field3967 = 0;
        class289.field4232 = 0;
        class450.field6616 = 0;
        class395.field5748 = 0;
        class421.field6089 = 0;
        class336.field4955 = 0;
        class171.field2223 = 0;
        class267.field3977 = 0;
        class100.field1259 = 0;
        class26.field376 = 0;
        class256.field3779 = 0;
        class328.field4881 = 0;
        class451.field6653 = 0;
        class253.field3715 = 0;
        class450.field6582 = 0;
        class343.field5044 = 0;
        class99.field1229 = 0;
        class286.field4200 = 0;
        class256.field3772 = 0;
        class443.field6432 = 0;
        class266.field3939 = 0;
        class212.field2986 = 0;
        class318.field4673 = 0;
        class145.field1968 = 0;
        class4.field64 = 0;
        field1061 = 0;
        class110.field1497 = 0;
        class241.field3583 = 0;
        class187.field2616 = 0;
        class233.field3499 = 0;
        class419.field6070 = 0;
        class103.field1337 = 0;
        class214.field3026 = 0;
        class104.field1350 = 0;
        class4.field62 = 0;
        class337.field4977 = 0;
        class301.field4384 = 0;
        class408.field5875 = 0;
        class403.field5822 = 0;
        class459.field6794 = 0;
        class393.field5722 = 0;
        class5.field80 = 0;
        class142.field1930 = 0;
        class267.field3970 = 0;
        class92.field1141 = 0;
        class397.field5761 = 0;
        class105.field1394 = 0;
        class256.field3745 = 0;
        class431.field6277 = 0;
        class363.field5236 = 0;
        class25.field338 = 0;
        class299.field4345 = 0;
        class349.field5119 = 0;
        class305.field4465 = 0;
        class267.field3978 = 0;
        class256.field3744 = 0;
        class377.field5500 = 0;
        class395.field5749 = 0;
        class7.field91 = 0;
        class443.field6449 = 0;
        class305.field4473 = 0;
        class130.field1736 = 0;
        class163.field2158 = 0;
        class189.field2645 = 0;
        class363.field5237 = 0;
        class33.field460 = 0;
        class28.field405 = 0;
        class189.field2638 = 0;
        class31.field427 = 0;
        class446.field6490 = 0;
        class455.field6710 = 0;
        class143.field1948 = 0;
        class318.field4669 = 0;
        class283.field4155 = 0;
        class305.field4489 = 0;
        class210.field2958 = 0;
        class195.field2751 = 0;
        class320.field4720 = 0;
        class92.field1134 = 0;
        class316.field4627 = 0;
        class281.field4126 = 0;
        class25.field340 = 0;
        class26.field379 = 0;
        class52.field649 = 0;
        class256.field3789 = 0;
        class160.field2141 = 0;
        class5.field77 = 0;
        class100.field1266 = 0;
        class291.field4256 = 0;
        class430.field6256 = 0;
        class370.field5426 = 0;
        class104.field1378 = 0;
        class380.field5584 = 0;
        class286.field4184 = 0;
        class69.field914 = 0;
        class256.field3787 = 0;
        class305.field4503 = 0;
        class58.field742 = 0;
        class344.field5062 = 0;
        class267.field3964 = 0;
        class376.field5493 = 0;
        class452.field6669 = 0;
        class104.field1379 = 0;
        class370.field5425 = 0;
        class28.field398 = 0;
        class427.field6137 = 0;
        class136.field1855 = 0;
        class106.field1426 = 0;
        class153.field2069 = 0;
        class364.field5262 = 0;
        class286.field4175 = 0;
        class358.field5185 = 0;
        class286.field4176 = 0;
        field1057 = 0;
        class233.field3492 = 0;
        class344.field5060 = 0;
        class85.field1037 = 0;
        class403.field5817 = 0;
        class364.field5265 = 0;
        class365.field5275 = 0;
        class345.field5074 = 0;
        class157.field2106 = 0;
        class395.field5737 = 0;
        class267.field3962 = 0;
        class332.field4917 = 0;
        class463.field6833 = 0;
        class58.field715 = 0;
        class58.field735 = 0;
        class316.field4621 = 0;
        class143.field1942 = 0;
        class256.field3777 = 0;
        class18.field290 = 0;
        class380.field5586 = 0;
        class256.field3735 = 0;
        class403.field5824 = 0;
        class278.field4102 = 0;
        class247.field3631 = 0;
        class171.field2231 = 0;
        class257.field3806 = 0;
        class103.field1325 = 0;
        class111.field1532 = 0;
        class250.field3677 = 0;
        class455.field6713 = 0;
        class296.field4316 = 0;
        class28.field404 = 0;
        class450.field6571 = 0;
        class317.field4653 = 0;
        class72.field937 = 0;
        class157.field2110 = 0;
        class456.field6738 = 0;
        class165.field2178 = 0;
        class420.field6082 = 0;
        class93.field1151 = 0;
        class400.field5784 = 0;
        class18.field283 = 0;
        class305.field4496 = 0;
        class58.field774 = 0;
        class108.field1467 = 0;
        class390.field5686 = 0;
        class14.field226 = 0;
        class256.field3739 = 0;
        class100.field1279 = 0;
        class266.field3947 = 0;
        class400.field5783 = 0;
        class78.field983 = 0;
        class90.field1114 = 0;
        class387.field5651 = 0;
        class104.field1344 = 0;
        class51.field636 = 0;
        class131.field1793 = 0;
        class256.field3751 = 0;
        class104.field1385 = 0;
        class377.field5511 = 0;
        class388.field5674 = 0;
        class347.field5108 = 0;
        class295.field4289 = 0;
        class380.field5548 = 0;
        class184.field2590 = 0;
        class10.field131 = 0;
        class154.field2079 = 0;
        class15.field245 = 0;
        class230.field3446 = 0;
        class150.field2026 = 0;
        class9.field122 = 0;
        class450.field6612 = 0;
        class259.field3826 = 0;
        class4.field55 = 0;
        class313.field4593 = 0;
        class104.field1353 = 0;
        class388.field5680 = 0;
        class51.field634 = 0;
        class436.field6367 = 0;
        class143.field1950 = 0;
        class286.field4199 = 0;
        class363.field5249 = 0;
        class450.field6605 = 0;
        class411.field5915 = 0;
        class105.field1393 = 0;
        class432.field6292 = 0;
        class435.field6333 = 0;
        class440.field6400 = 0;
        class427.field6184 = 0;
        class223.field3283 = 0;
        class215.field3060 = 0;
        class296.field4315 = 0;
        class256.field3782 = 0;
        class141.field1919 = 0;
        class315.field4616 = 0;
        class131.field1786 = 0;
        class298.field4340 = 0;
        class403.field5809 = 0;
        class455.field6719 = 0;
        class336.field4948 = 0;
        class11.field145 = 0;
        class387.field5653 = 0;
        class56.field684 = 0;
        class228.field3419 = 0;
        class403.field5818 = 0;
        class236.field3519 = 0;
        class411.field5909 = 0;
        class113.field1547 = 0;
        class184.field2575 = 0;
        class456.field6740 = 0;
        class295.field4293 = 0;
        class403.field5820 = 0;
        class278.field4097 = 0;
        class131.field1792 = 0;
        class10.field133 = 0;
        class332.field4919 = 0;
        class133.field1817 = 0;
        client.field3894 = 0;
        class13.field218 = 0;
        class427.field6187 = 0;
        class230.field3455 = 0;
        class202.field2853 = 0;
        class88.field1080 = 0;
        class423.field6107 = 0;
        class283.field4156 = 0;
        class370.field5373 = 0;
        class372.field5438 = 0;
        class346.field5088 = 0;
        class57.field698 = 0;
        class283.field4153 = 0;
        class178.field2508 = 0;
        class291.field4260 = 0;
        class175.field2412 = 0;
        class443.field6431 = 0;
        class259.field3824 = 0;
        class353.field5141 = 0;
        class377.field5523 = 0;
        class381.field5593 = 0;
        class75.field955 = 0;
        class58.field740 = 0;
        class369.field5322 = 0;
        class403.field5826 = 0;
        class36.field515 = 0;
        class450.field6595 = 0;
        class3.field36 = 0;
        class354.field5159 = 0;
        class458.field6757 = 0;
        class25.field337 = 0;
        class267.field3975 = 0;
        class104.field1362 = 0;
        class252.field3698 = 0;
        class454.field6686 = 0;
        class377.field5522 = 0;
        class354.field5155 = 0;
        class270.field4007 = 0;
        class367.field5306 = 0;
        class215.field3054 = 0;
        class104.field1360 = 0;
        class291.field4255 = 0;
        class327.field4814 = 0;
        class364.field5264 = 0;
        class247.field3639 = 0;
        class209.field2945 = 0;
        class215.field3050 = 0;
        class358.field5205 = 0;
        class37.field523 = 0;
        class443.field6445 = 0;
        class305.field4495 = 0;
        class440.field6394 = 0;
        class369.field5321 = 0;
        class358.field5199 = 0;
        class67.field883 = 0;
        class210.field2964 = 0;
        class427.field6149 = 0;
        class276.field4079 = 0;
        class418.field6056 = 0;
        class363.field5252 = 0;
        class358.field5212 = 0;
        class363.field5245 = 0;
        class57.field696 = 0;
        class450.field6589 = 0;
        class11.field142 = 0;
        class318.field4662 = 0;
        class437.field6378 = 0;
        class375.field5479 = 0;
        class208.field2938 = 0;
        class452.field6670 = 0;
        class178.field2523 = 0;
        class256.field3763 = 0;
        class249.field3664 = 0;
        class199.field2804 = 0;
        class177.field2447 = 0;
        class25.field348 = 0;
        class25.field350 = 0;
        class234.field3505 = 0;
        class369.field5319 = 0;
        class26.field361 = 0;
        class145.field1961 = 0;
        class167.field2201 = 0;
        class430.field6243 = 0;
        class178.field2506 = 0;
        class458.field6770 = 0;
        class451.field6660 = 0;
        class76.field967 = 0;
        class228.field3414 = 0;
        class283.field4161 = 0;
        class7.field99 = 0;
        class26.field378 = 0;
        class454.field6680 = 0;
        class72.field934 = 0;
        class214.field3024 = 0;
        class135.field1849 = 0;
        class152.field2059 = 0;
        class411.field5916 = 0;
        class184.field2578 = 0;
        class186.field2605 = 0;
        client.field3893 = 0;
        class386.field5646 = 0;
        class209.field2947 = 0;
        class151.field2047 = 0;
        class104.field1347 = 0;
        class256.field3756 = 0;
        class3.field34 = 0;
        class446.field6531 = 0;
        class377.field5501 = 0;
        class136.field1861 = 0;
        class265.field3931 = 0;
        class69.field907 = 0;
        class373.field5447 = 0;
        class257.field3810 = 0;
        class202.field2848 = 0;
        class137.field1876 = 0;
        class271.field4011 = 0;
        class364.field5266 = 0;
        class433.field6308 = 0;
        class150.field2031 = 0;
        class248.field3655 = 0;
        class259.field3828 = 0;
        class450.field6610 = 0;
        class346.field5085 = 0;
        class401.field5791 = 0;
        class257.field3801 = 0;
        class196.field2778 = 0;
        class214.field3012 = 0;
        class450.field6626 = 0;
        class231.field3458 = 0;
        class377.field5499 = 0;
        class288.field4225 = 0;
        class386.field5641 = 0;
        class247.field3640 = 0;
        class440.field6396 = 0;
        class317.field4647 = 0;
        class298.field4334 = 0;
        client.field3878 = 0;
        class248.field3656 = 0;
        class59.field795 = 0;
        class422.field6105 = 0;
        class310.field4566 = 0;
        class17.field264 = 0;
        class175.field2417 = 0;
        class127.field1682 = 0;
        class187.field2617 = 0;
        class208.field2937 = 0;
        class79.field991 = 0;
        class107.field1455 = 0;
        class4.field60 = 0;
        class32.field440 = 0;
        class450.field6577 = 0;
        class320.field4723 = 0;
        class264.field3905 = 0;
        class178.field2484 = 0;
        class188.field2632 = 0;
        class327.field4841 = 0;
        class420.field6080 = 0;
        class385.field5633 = 0;
        class373.field5453 = 0;
        class100.field1293 = 0;
        class294.field4268 = 0;
        class171.field2230 = 0;
        class395.field5750 = 0;
        class199.field2806 = 0;
        class301.field4377 = 0;
        class62.field819 = 0;
        class85.field1033 = 0;
        class275.field4067 = 0;
        class402.field5803 = 0;
        class29.field410 = 0;
        class262.field3872 = 0;
        class397.field5763 = 0;
        class332.field4931 = 0;
        class433.field6311 = 0;
        class105.field1407 = 0;
        class310.field4561 = 0;
        class63.field836 = 0;
        class365.field5269 = 0;
        class455.field6709 = 0;
        class192.field2688 = 0;
        class393.field5723 = 0;
        class395.field5736 = 0;
        class100.field1280 = 0;
        class250.field3676 = 0;
        class150.field2036 = 0;
        class62.field818 = 0;
        class251.field3697 = 0;
        class110.field1521 = 0;
        class256.field3774 = 0;
        class260.field3848 = 0;
        class347.field5105 = 0;
        class256.field3755 = 0;
        class141.field1924 = 0;
        class223.field3263 = 0;
        class256.field3766 = 0;
        class377.field5525 = 0;
        class385.field5626 = 0;
        class126.field1669 = 0;
        class308.field4548 = 0;
        class446.field6494 = 0;
        class435.field6342 = 0;
        class130.field1727 = 0;
        class225.field3368 = 0;
        class214.field3011 = 0;
        class113.field1544 = 0;
        class215.field3040 = 0;
        class5.field82 = 0;
        class227.field3401 = 0;
        class5.field72 = 0;
        class267.field3956 = 0;
        class301.field4394 = 0;
        class260.field3856 = 0;
        class278.field4100 = 0;
        class356.field5172 = 0;
        class380.field5546 = 0;
        class148.field2010 = 0;
        class186.field2603 = 0;
        class289.field4231 = 0;
        class52.field650 = 0;
        class440.field6399 = 0;
        class295.field4288 = 0;
        class395.field5742 = 0;
        class119.field1597 = 0;
        class388.field5668 = 0;
        class75.field956 = 0;
        class9.field121 = 0;
        class231.field3475 = 0;
        class9.field125 = 0;
        class451.field6657 = 0;
        class289.field4238 = 0;
        class29.field415 = 0;
        class113.field1545 = 0;
        class206.field2881 = 0;
        class41.field547 = 0;
        class33.field450 = 0;
        class70.field917 = 0;
        class63.field831 = 0;
        class90.field1099 = 0;
        class104.field1352 = 0;
        class83.field1017 = 0;
        class454.field6688 = 0;
        class51.field637 = 0;
        class322.field4734 = 0;
        class104.field1388 = 0;
        class107.field1448 = 0;
        class11.field139 = 0;
        class267.field3974 = 0;
        class13.field219 = 0;
        class13.field212 = 0;
        class108.field1464 = 0;
        class403.field5808 = 0;
        class154.field2075 = 0;
        class2.field28 = 0;
        class295.field4300 = 0;
        class455.field6727 = 0;
        class100.field1277 = 0;
        class35.field498 = 0;
        class5.field79 = 0;
        class327.field4821 = 0;
        class353.field5149 = 0;
        class184.field2582 = 0;
        class256.field3736 = 0;
        class236.field3517 = 0;
        class260.field3846 = 0;
        class286.field4194 = 0;
        class435.field6340 = 0;
        class238.field3535 = 0;
        class458.field6758 = 0;
        class100.field1286 = 0;
        class108.field1474 = 0;
        class388.field5679 = 0;
        class319.field4685 = 0;
        class171.field2226 = 0;
        class231.field3472 = 0;
        class458.field6765 = 0;
        class143.field1945 = 0;
        class353.field5145 = 0;
        class289.field4236 = 0;
        class354.field5158 = 0;
        class286.field4208 = 0;
        class286.field4190 = 0;
        class397.field5764 = 0;
        class42.field563 = 0;
        class450.field6572 = 0;
        class178.field2490 = 0;
        class304.field4441 = 0;
        class301.field4374 = 0;
        class26.field359 = 0;
        class44.field579 = 0;
        class215.field3034 = 0;
        class301.field4371 = 0;
        class466.field6861 = 0;
        class180.field2545 = 0;
        class237.field3526 = 0;
        class416.field6017 = 0;
        class443.field6464 = 0;
        class196.field2768 = 0;
        class440.field6386 = 0;
        class251.field3690 = 0;
        class286.field4206 = 0;
        class145.field1962 = 0;
        class250.field3678 = 0;
        class1.field9 = 0;
        class450.field6586 = 0;
        class443.field6433 = 0;
        class111.field1542 = 0;
        class91.field1129 = 0;
        class370.field5410 = 0;
        class317.field4640 = 0;
        class115.field1568 = 0;
        class227.field3396 = 0;
        class446.field6517 = 0;
        class435.field6350 = 0;
        class390.field5691 = 0;
        class305.field4479 = 0;
        class192.field2674 = 0;
        class76.field974 = 0;
        class286.field4188 = 0;
        class344.field5067 = 0;
        class243.field3608 = 0;
        class316.field4630 = 0;
        class125.field1666 = 0;
        class315.field4615 = 0;
        class256.field3749 = 0;
        class62.field817 = 0;
        class443.field6454 = 0;
        class308.field4543 = 0;
        class46.field591 = 0;
        class90.field1101 = 0;
        class304.field4442 = 0;
        class51.field632 = 0;
        class455.field6717 = 0;
        class152.field2055 = 0;
        class260.field3849 = 0;
        class388.field5669 = 0;
        class215.field3058 = 0;
        class77.field978 = 0;
        class93.field1160 = 0;
        class107.field1446 = 0;
        class432.field6285 = 0;
        class51.field640 = 0;
        class270.field3997 = 0;
        class311.field4573 = 0;
        class429.field6233 = 0;
        class141.field1927 = 0;
        class305.field4490 = 0;
        class466.field6856 = 0;
        class440.field6393 = 0;
        class450.field6590 = 0;
        class175.field2397 = 0;
        class370.field5363 = 0;
        class243.field3600 = 0;
        class222.field3197 = 0;
        class252.field3701 = 0;
        class5.field70 = 0;
        class349.field5117 = 0;
        class134.field1836 = 0;
        class71.field926 = 0;
        class46.field606 = 0;
        class166.field2187 = 0;
        class455.field6711 = 0;
        class63.field835 = 0;
        class26.field375 = 0;
        class450.field6587 = 0;
        client.field3874 = 0;
        class295.field4295 = 0;
        class167.field2205 = 0;
        class365.field5286 = 0;
        class90.field1104 = 0;
        class366.field5292 = 0;
        client.field3886 = 0;
        class310.field4562 = 0;
        class159.field2126 = 0;
        class115.field1557 = 0;
        class365.field5270 = 0;
        class103.field1336 = 0;
        class370.field5398 = 0;
        class100.field1275 = 0;
        class217.field3090 = 0;
        class395.field5743 = 0;
        class152.field2057 = 0;
        class393.field5726 = 0;
        class310.field4564 = 0;
        class175.field2404 = 0;
        class111.field1538 = 0;
        class455.field6726 = 0;
        class115.field1566 = 0;
        class249.field3669 = 0;
        class454.field6681 = 0;
        class1.field6 = 0;
        class4.field47 = 0;
        class435.field6337 = 0;
        class440.field6401 = 0;
        class92.field1138 = 0;
        class380.field5551 = 0;
        class427.field6155 = 0;
        class367.field5308 = 0;
        class372.field5435 = 0;
        class430.field6268 = 0;
        class256.field3767 = 0;
        class58.field738 = 0;
        class91.field1121 = 0;
        class317.field4654 = 0;
        class150.field2035 = 0;
        class256.field3734 = 0;
        class166.field2190 = 0;
        class25.field346 = 0;
        class227.field3409 = 0;
        class2.field22 = 0;
        class262.field3870 = 0;
        class70.field921 = 0;
        class110.field1485 = 0;
        class349.field5125 = 0;
        class450.field6623 = 0;
        class395.field5740 = 0;
        class127.field1680 = 0;
        class381.field5599 = 0;
        class286.field4189 = 0;
        class212.field2980 = 0;
        class238.field3534 = 0;
        class51.field631 = 0;
        class47.field611 = 0;
        class136.field1864 = 0;
        class435.field6334 = 0;
        class256.field3788 = 0;
        class241.field3574 = 0;
        class358.field5203 = 0;
        class307.field4531 = 0;
        class450.field6597 = 0;
        class105.field1392 = 0;
        class302.field4423 = 0;
        class427.field6206 = 0;
        class377.field5513 = 0;
        class450.field6601 = 0;
        class175.field2405 = 0;
        class395.field5746 = 0;
        class189.field2635 = 0;
        class450.field6573 = 0;
        class44.field583 = 0;
        class91.field1130 = 0;
        class99.field1224 = 0;
        class4.field56 = 0;
        class118.field1590 = 0;
        class239.field3548 = 0;
        class404.field5839 = 0;
        class435.field6346 = 0;
        class327.field4858 = 0;
        class104.field1382 = 0;
        class393.field5715 = 0;
        class110.field1496 = 0;
        class108.field1469 = 0;
        class37.field519 = 0;
        class373.field5444 = 0;
        class327.field4835 = 0;
        class421.field6090 = 0;
        class88.field1086 = 0;
        class242.field3589 = 0;
        class440.field6408 = 0;
        class377.field5498 = 0;
        class212.field2981 = 0;
        class395.field5741 = 0;
        class175.field2410 = 0;
        class105.field1401 = 0;
        class401.field5793 = 0;
        class265.field3918 = 0;
        class160.field2142 = 0;
        class104.field1359 = 0;
        class22.field305 = 0;
        class15.field237 = 0;
        class451.field6658 = 0;
        class175.field2413 = 0;
        class288.field4214 = 0;
        class227.field3399 = 0;
        class129.field1699 = 0;
        class332.field4923 = 0;
        class437.field6382 = 0;
        class239.field3538 = 0;
        class26.field363 = 0;
        class450.field6585 = 0;
        class208.field2931 = 0;
        class397.field5767 = 0;
        class384.field5622 = 0;
        class5.field83 = 0;
        class465.field6844 = 0;
        class196.field2757 = 0;
        class226.field3378 = 0;
        class83.field1015 = 0;
        class104.field1370 = 0;
        class15.field248 = 0;
        class270.field4002 = 0;
        class259.field3832 = 0;
        class264.field3904 = 0;
        class60.field805 = 0;
        class377.field5510 = 0;
        class325.field4779 = 0;
        field1058 = 0;
        class385.field5624 = 0;
        class304.field4450 = 0;
        class380.field5573 = 0;
        class196.field2781 = 0;
        class184.field2584 = 0;
        field1055 = 0;
        class175.field2407 = 0;
        class383.field5613 = 0;
        class371.field5430 = 0;
        class356.field5177 = 0;
        class34.field477 = 0;
        class210.field2960 = 0;
        class35.field507 = 0;
        class110.field1499 = 0;
        class104.field1372 = 0;
        class85.field1034 = 0;
        class171.field2229 = 0;
        class455.field6718 = 0;
        class286.field4196 = 0;
        class85.field1045 = 0;
        class264.field3900 = 0;
        class13.field211 = 0;
        class377.field5518 = 0;
        class234.field3507 = 0;
        class455.field6708 = 0;
        class387.field5657 = 0;
        class256.field3742 = 0;
        class63.field830 = 0;
        class319.field4687 = 0;
        class105.field1397 = 0;
        class256.field3786 = 0;
        class385.field5625 = 0;
        class450.field6624 = 0;
        class272.field4021 = 0;
        class215.field3056 = 0;
        class84.field1024 = 0;
        class303.field4437 = 0;
        class275.field4064 = 0;
        class84.field1028 = 0;
        class308.field4549 = 0;
        class85.field1032 = 0;
        class267.field3969 = 0;
        class346.field5092 = 0;
        class257.field3808 = 0;
        class55.field670 = 0;
        class143.field1941 = 0;
        class466.field6854 = 0;
        class458.field6769 = 0;
        class450.field6594 = 0;
        class465.field6849 = 0;
        class240.field3569 = 0;
        class346.field5087 = 0;
        class226.field3384 = 0;
        class249.field3667 = 0;
        client.field3887 = 0;
        class310.field4569 = 0;
        client.field3890 = 0;
        class400.field5780 = 0;
        class346.field5100 = 0;
        class180.field2552 = 0;
        class44.field578 = 0;
        client.field3882 = 0;
        class332.field4916 = 0;
        class365.field5271 = 0;
        class46.field605 = 0;
        class234.field3512 = 0;
        class308.field4547 = 0;
        class85.field1047 = 0;
        class129.field1706 = 0;
        class166.field2189 = 0;
        class124.field1634 = 0;
        class157.field2102 = 0;
        class243.field3606 = 0;
        class124.field1638 = 0;
        class227.field3407 = 0;
        class459.field6800 = 0;
        class358.field5204 = 0;
        class216.field3083 = 0;
        class110.field1491 = 0;
        class1.field13 = 0;
        class363.field5238 = 0;
        class129.field1693 = 0;
        class103.field1322 = 0;
        class342.field5038 = 0;
        class215.field3059 = 0;
        class296.field4309 = 0;
        class365.field5280 = 0;
        class260.field3842 = 0;
        class327.field4836 = 0;
        class296.field4319 = 0;
        class164.field2167 = 0;
        class100.field1291 = 0;
        class212.field2994 = 0;
        class1.field7 = 0;
        class435.field6353 = 0;
        class275.field4070 = 0;
        class223.field3336 = 0;
        class430.field6267 = 0;
        class330.field4901 = 0;
        class384.field5621 = 0;
        class103.field1315 = 0;
        class281.field4132 = 0;
        class155.field2090 = 0;
        class256.field3757 = 0;
        class346.field5090 = 0;
        class346.field5081 = 0;
        class373.field5446 = 0;
        class450.field6604 = 0;
        class26.field381 = 0;
        class359.field5219 = 0;
        class134.field1837 = 0;
        class381.field5598 = 0;
        class108.field1466 = 0;
        class118.field1593 = 0;
        class435.field6338 = 0;
        class100.field1290 = 0;
        class180.field2546 = 0;
        class178.field2531 = 0;
        class160.field2145 = 0;
        class349.field5114 = 0;
        class286.field4193 = 0;
        class110.field1513 = 0;
        class458.field6773 = 0;
        class26.field377 = 0;
        class380.field5563 = 0;
        class165.field2177 = 0;
        class106.field1429 = 0;
        class304.field4452 = 0;
        class276.field4082 = 0;
        class7.field103 = 0;
        class55.field672 = 0;
        class35.field503 = 0;
        class9.field115 = 0;
        class90.field1102 = 0;
        class223.field3303 = 0;
        class107.field1460 = 0;
        class184.field2592 = 0;
        class248.field3651 = 0;
        class85.field1048 = 0;
        class339.field4982 = 0;
        class141.field1916 = 0;
        class29.field413 = 0;
        class327.field4876 = 0;
        class67.field884 = 0;
        class318.field4671 = 0;
        class345.field5072 = 0;
        class256.field3770 = 0;
        class392.field5705 = 0;
        class364.field5261 = 0;
        class332.field4925 = 0;
        class403.field5823 = 0;
        class230.field3452 = 0;
        class327.field4833 = 0;
        class369.field5323 = 0;
        class411.field5905 = 0;
        class75.field952 = 0;
        class366.field5295 = 0;
        class9.field126 = 0;
        class13.field213 = 0;
        class223.field3258 = 0;
        class100.field1254 = 0;
        class184.field2593 = 0;
        class231.field3481 = 0;
        class262.field3869 = 0;
        field1059 = 0;
        class275.field4065 = 0;
        class357.field5181 = 0;
        class227.field3402 = 0;
        class18.field285 = 0;
        class409.field5879 = 0;
        class305.field4470 = 0;
        class346.field5082 = 0;
        class395.field5739 = 0;
        class450.field6620 = 0;
        class317.field4661 = 0;
        class175.field2393 = 0;
        class215.field3053 = 0;
        class99.field1227 = 0;
        class85.field1043 = 0;
        class44.field577 = 0;
        class458.field6759 = 0;
        class387.field5656 = 0;
        class2.field23 = 0;
        class82.field1010 = 0;
        class213.field2999 = 0;
        class281.field4122 = 0;
        class184.field2594 = 0;
        class13.field217 = 0;
        class367.field5304 = 0;
        class60.field802 = 0;
        class458.field6755 = 0;
        class63.field834 = 0;
        class103.field1316 = 0;
        class31.field424 = 0;
        class455.field6723 = 0;
        class247.field3642 = 0;
        class440.field6391 = 0;
        class153.field2066 = 0;
        class455.field6716 = 0;
        class104.field1345 = 0;
        field1062 = 0;
        class51.field639 = 0;
        class437.field6376 = 0;
        class465.field6848 = 0;
        class450.field6606 = 0;
        class104.field1373 = 0;
        class93.field1152 = 0;
        class295.field4292 = 0;
        class90.field1103 = 0;
        class372.field5442 = 0;
        class317.field4657 = 0;
        class316.field4623 = 0;
        class67.field886 = 0;
        class214.field3020 = 0;
        class332.field4915 = 0;
        class11.field135 = 0;
        class339.field4990 = 0;
        class346.field5094 = 0;
        class349.field5113 = 0;
        class408.field5868 = 0;
        class450.field6596 = 0;
        class440.field6395 = 0;
        class196.field2772 = 0;
        class58.field731 = 0;
        class91.field1122 = 0;
        class432.field6287 = 0;
        class93.field1162 = 0;
        class267.field3965 = 0;
        class10.field130 = 0;
        class9.field112 = 0;
        class260.field3850 = 0;
        class295.field4304 = 0;
        class31.field428 = 0;
        class41.field546 = 0;
        class4.field51 = 0;
        class125.field1660 = 0;
        class286.field4202 = 0;
        class369.field5324 = 0;
        class208.field2929 = 0;
        class100.field1292 = 0;
        class225.field3369 = 0;
        class163.field2160 = 0;
        class256.field3791 = 0;
        class148.field2012 = 0;
        class15.field252 = 0;
        class423.field6118 = 0;
        class22.field307 = 0;
        class302.field4415 = 0;
        class15.field242 = 0;
        class301.field4390 = 0;
        class147.field1994 = 0;
        class129.field1698 = 0;
        class178.field2464 = 0;
        class440.field6385 = 0;
        class90.field1097 = 0;
        class11.field140 = 0;
        class164.field2168 = 0;
        class187.field2611 = 0;
        class303.field4430 = 0;
        class32.field437 = 0;
        class100.field1247 = 0;
        class378.field5535 = 0;
        class108.field1472 = 0;
        class443.field6450 = 0;
        class420.field6079 = 0;
        class228.field3423 = 0;
        class372.field5434 = 0;
        class458.field6767 = 0;
        class4.field54 = 0;
        class137.field1879 = 0;
        class169.field2209 = 0;
        class291.field4257 = 0;
        class124.field1640 = 0;
        class85.field1050 = 0;
        class58.field775 = 0;
        class107.field1452 = 0;
        class42.field557 = 0;
        class363.field5240 = 0;
        class382.field5606 = 0;
        class260.field3839 = 0;
        class260.field3838 = 0;
        class93.field1153 = 0;
        class83.field1020 = 0;
        class85.field1039 = 0;
        class329.field4894 = 0;
        class228.field3416 = 0;
        class393.field5730 = 0;
        class153.field2063 = 0;
        class215.field3043 = 0;
        class403.field5810 = 0;
        class317.field4645 = 0;
        class390.field5697 = 0;
        class281.field4131 = 0;
        class247.field3638 = 0;
        class393.field5728 = 0;
        class432.field6295 = 0;
        class18.field282 = 0;
        class443.field6442 = 0;
        class215.field3033 = 0;
        class119.field1598 = 0;
        class192.field2678 = 0;
        class388.field5676 = 0;
        class175.field2406 = 0;
        class215.field3045 = 0;
        class344.field5054 = 0;
        class84.field1027 = 0;
        class388.field5666 = 0;
        class250.field3674 = 0;
        class390.field5700 = 0;
        class377.field5502 = 0;
        class329.field4893 = 0;
        class83.field1018 = 0;
        class196.field2773 = 0;
        class401.field5792 = 0;
        class239.field3540 = 0;
        class170.field2218 = 0;
        class267.field3973 = 0;
        class304.field4449 = 0;
        class3.field30 = 0;
        class57.field690 = 0;
        class256.field3769 = 0;
        class264.field3909 = 0;
        class11.field137 = 0;
        class302.field4418 = 0;
        class99.field1236 = 0;
        class231.field3468 = 0;
        class281.field4140 = 0;
        class329.field4896 = 0;
        class109.field1476 = 0;
        class435.field6347 = 0;
        class319.field4697 = 0;
        class365.field5273 = 0;
        class108.field1471 = 0;
        class256.field3795 = 0;
        class380.field5579 = 0;
        class454.field6693 = 0;
        class51.field642 = 0;
        class435.field6349 = 0;
        class302.field4412 = 0;
        class313.field4595 = 0;
        class53.field663 = 0;
        class51.field633 = 0;
        class7.field104 = 0;
        class139.field1904 = 0;
        class92.field1143 = 0;
        class38.field536 = 0;
        class422.field6103 = 0;
        class223.field3280 = 0;
        class166.field2183 = 0;
        class377.field5526 = 0;
        class46.field601 = 0;
        class256.field3760 = 0;
        class129.field1695 = 0;
        class228.field3427 = 0;
        class275.field4075 = 0;
        class363.field5251 = 0;
        class215.field3051 = 0;
        class376.field5494 = 0;
        class75.field951 = 0;
        class317.field4658 = 0;
        class59.field797 = 0;
        class182.field2560 = 0;
        class215.field3042 = 0;
        class196.field2767 = 0;
        class408.field5872 = 0;
        class37.field524 = 0;
        class308.field4542 = 0;
        class165.field2182 = 0;
        class248.field3658 = 0;
        class216.field3075 = 0;
        class110.field1518 = 0;
        class366.field5289 = 0;
        class125.field1663 = 0;
        class363.field5244 = 0;
        class9.field113 = 0;
        class395.field5751 = 0;
        class317.field4660 = 0;
        class228.field3421 = 0;
        class106.field1425 = 0;
        class256.field3741 = 0;
        class385.field5627 = 0;
        class256.field3758 = 0;
        class192.field2690 = 0;
        class359.field5220 = 0;
        class450.field6625 = 0;
        class256.field3796 = 0;
        class256.field3799 = 0;
        class192.field2677 = 0;
        class430.field6244 = 0;
        class38.field537 = 0;
        class206.field2888 = 0;
        class67.field882 = 0;
        class115.field1565 = 0;
        class250.field3683 = 0;
        class33.field454 = 0;
        class274.field4058 = 0;
        class454.field6687 = 0;
        class342.field5031 = 0;
        class231.field3460 = 0;
        class74.field947 = 0;
        class423.field6108 = 0;
        class279.field4112 = 0;
        class7.field93 = 0;
        class160.field2136 = 0;
        class214.field3028 = 0;
        class358.field5194 = 0;
        class104.field1357 = 0;
        class274.field4061 = 0;
        class458.field6763 = 0;
        class430.field6275 = 0;
        class430.field6270 = 0;
        class244.field3615 = 0;
        class3.field41 = 0;
        class331.field4909 = 0;
        class125.field1656 = 0;
        class1.field14 = 0;
        class427.field6159 = 0;
        class332.field4912 = 0;
        class9.field119 = 0;
        class130.field1730 = 0;
        class105.field1390 = 0;
        class409.field5882 = 0;
        class427.field6153 = 0;
        class455.field6728 = 0;
        class231.field3476 = 0;
        class195.field2754 = 0;
        class380.field5547 = 0;
        class446.field6518 = 0;
        class62.field816 = 0;
        class104.field1374 = 0;
        class465.field6845 = 0;
        class223.field3306 = 0;
        client.field3877 = 0;
        class377.field5519 = 0;
        class90.field1113 = 0;
        class41.field550 = 0;
        class175.field2411 = 0;
        class57.field702 = 0;
        class225.field3372 = 0;
        class403.field5819 = 0;
        class92.field1142 = 0;
        class404.field5837 = 0;
        class178.field2492 = 0;
        class456.field6746 = 0;
        class1.field15 = 0;
        class131.field1794 = 0;
        class25.field357 = 0;
        class330.field4904 = 0;
        class149.field2020 = 0;
        class427.field6166 = 0;
        class305.field4472 = 0;
        class239.field3558 = 0;
        class459.field6783 = 0;
        class377.field5512 = 0;
        class3.field32 = 0;
        class26.field370 = 0;
        class214.field3015 = 0;
        class256.field3794 = 0;
        class302.field4411 = 0;
        class369.field5325 = 0;
        class408.field5873 = 0;
        class5.field74 = 0;
        class148.field2001 = 0;
        class100.field1278 = 0;
        class223.field3310 = 0;
        class231.field3480 = 0;
        class318.field4664 = 0;
        class403.field5816 = 0;
        class450.field6617 = 0;
        class36.field514 = 0;
        class212.field2987 = 0;
        class435.field6345 = 0;
        class388.field5662 = 0;
        class85.field1041 = 0;
        class88.field1087 = 0;
        class358.field5209 = 0;
        class427.field6195 = 0;
        class248.field3653 = 0;
        class459.field6782 = 0;
        class189.field2634 = 0;
        class38.field535 = 0;
        class103.field1320 = 0;
        class286.field4205 = 0;
        class326.field4798 = 0;
        class269.field3993 = 0;
        class85.field1042 = 0;
        class150.field2044 = 0;
        class386.field5647 = 0;
        class225.field3371 = 0;
        class110.field1526 = 0;
        class231.field3474 = 0;
        class188.field2626 = 0;
        class1.field8 = 0;
        class329.field4895 = 0;
        class228.field3428 = 0;
        class25.field344 = 0;
        class411.field5913 = 0;
        class357.field5179 = 0;
        class380.field5549 = 0;
        class322.field4735 = 0;
        class466.field6862 = 0;
        class404.field5838 = 0;
        class223.field3209 = 0;
        class104.field1342 = 0;
        class274.field4057 = 0;
        class395.field5745 = 0;
        class256.field3776 = 0;
        class455.field6724 = 0;
        class427.field6140 = 0;
        class234.field3509 = 0;
        class228.field3420 = 0;
        class216.field3077 = 0;
        class85.field1035 = 0;
        class256.field3771 = 0;
        class134.field1841 = 0;
        class222.field3198 = 0;
        class215.field3039 = 0;
        class301.field4381 = 0;
        class234.field3503 = 0;
        class212.field2985 = 0;
        class225.field3374 = 0;
        class25.field358 = 0;
        class111.field1541 = 0;
        class260.field3840 = 0;
        class230.field3439 = 0;
        class326.field4796 = 0;
        class256.field3733 = 0;
        class240.field3563 = 0;
        class105.field1404 = 0;
        class96.field1187 = 0;
        class202.field2847 = 0;
        class344.field5057 = 0;
        class104.field1358 = 0;
        class308.field4540 = 0;
        class99.field1233 = 0;
        class380.field5558 = 0;
        class213.field2997 = 0;
        class143.field1939 = 0;
        class301.field4393 = 0;
        class26.field368 = 0;
        class337.field4973 = 0;
        class239.field3551 = 0;
        class85.field1038 = 0;
        class327.field4844 = 0;
        class294.field4266 = 0;
        class388.field5671 = 0;
        class143.field1944 = 0;
        class157.field2108 = 0;
        class177.field2449 = 0;
        class88.field1083 = 0;
        class124.field1637 = 0;
        class88.field1081 = 0;
        class104.field1389 = 0;
        class26.field365 = 0;
        class371.field5429 = 0;
        class451.field6654 = 0;
        class120.field1609 = 0;
        class376.field5482 = 0;
        class334.field4935 = 0;
        class256.field3798 = 0;
        class332.field4914 = 0;
        class446.field6524 = 0;
        class274.field4059 = 0;
        class400.field5785 = 0;
        class130.field1735 = 0;
        class119.field1599 = 0;
        class137.field1877 = 0;
        class178.field2522 = 0;
        class51.field643 = 0;
        class206.field2885 = 0;
        class215.field3031 = 0;
        class134.field1840 = 0;
        class380.field5557 = 0;
        class260.field3844 = 0;
        class67.field888 = 0;
        class131.field1787 = 0;
        class155.field2089 = 0;
        class1.field18 = 0;
        class107.field1454 = 0;
        class227.field3398 = 0;
        class450.field6622 = 0;
        class326.field4799 = 0;
        class358.field5197 = 0;
        class418.field6036 = 0;
        class129.field1691 = 0;
        class212.field2979 = 0;
        class130.field1731 = 0;
        class256.field3743 = 0;
        class257.field3809 = 0;
        class294.field4271 = 0;
        class110.field1507 = 0;
        class208.field2935 = 0;
        class60.field801 = 0;
        class108.field1462 = 0;
        class150.field2037 = 0;
        class427.field6188 = 0;
        class380.field5576 = 0;
        class430.field6257 = 0;
        class278.field4107 = 0;
        class3.field31 = 0;
        class275.field4069 = 0;
        class231.field3479 = 0;
        class240.field3566 = 0;
        class237.field3530 = 0;
        class70.field915 = 0;
        class380.field5571 = 0;
        class146.field1971 = 0;
        class330.field4903 = 0;
        class443.field6458 = 0;
        class458.field6772 = 0;
        client.field3888 = 0;
        class376.field5481 = 0;
        class9.field116 = 0;
        class265.field3916 = 0;
        class192.field2692 = 0;
        class239.field3546 = 0;
        class157.field2104 = 0;
        class301.field4379 = 0;
        class178.field2524 = 0;
        class427.field6200 = 0;
        class456.field6743 = 0;
        class32.field441 = 0;
        class119.field1602 = 0;
        int var1 = -41 % ((15 - arg0) / 61);
        class132.field1806 = 0;
        class256.field3740 = 0;
        class303.field4428 = 0;
        class53.field664 = 0;
        class42.field554 = 0;
        class199.field2803 = 0;
        class295.field4284 = 0;
        class188.field2630 = 0;
        class57.field692 = 0;
        class248.field3660 = 0;
        class250.field3672 = 0;
        class256.field3752 = 0;
        class346.field5093 = 0;
        class430.field6272 = 0;
        class411.field5917 = 0;
        class342.field5036 = 0;
        class18.field281 = 0;
        class339.field4984 = 0;
        class4.field50 = 0;
        class328.field4879 = 0;
        class404.field5836 = 0;
        class286.field4178 = 0;
        class373.field5451 = 0;
        class378.field5536 = 0;
        class286.field4174 = 0;
        class358.field5206 = 0;
        class259.field3835 = 0;
        class326.field4785 = 0;
        class153.field2061 = 0;
        class316.field4624 = 0;
        class1.field11 = 0;
        class206.field2887 = 0;
        class363.field5246 = 0;
        class210.field2949 = 0;
        class215.field3052 = 0;
        class215.field3061 = 0;
        class28.field390 = 0;
        class286.field4185 = 0;
        class296.field4308 = 0;
        class18.field286 = 0;
        class210.field2959 = 0;
        class62.field814 = 0;
        class276.field4084 = 0;
        class450.field6613 = 0;
        class365.field5282 = 0;
        class403.field5815 = 0;
        class186.field2602 = 0;
        class419.field6069 = 0;
        class189.field2639 = 0;
        class171.field2232 = 0;
        class231.field3470 = 0;
        class327.field4830 = 0;
        class165.field2181 = 0;
        class91.field1125 = 0;
        class91.field1132 = 0;
        class377.field5515 = 0;
        class110.field1529 = 0;
        class431.field6276 = 0;
        class147.field1992 = 0;
        class322.field4737 = 0;
        class447.field6541 = 0;
        class381.field5595 = 0;
        class26.field366 = 0;
        class295.field4291 = 0;
        class67.field887 = 0;
        class71.field927 = 0;
        class256.field3781 = 0;
        class317.field4649 = 0;
        class298.field4341 = 0;
        class129.field1697 = 0;
        class90.field1098 = 0;
        class93.field1154 = 0;
        class304.field4447 = 0;
        class322.field4744 = 0;
        class435.field6348 = 0;
        class289.field4230 = 0;
        class35.field501 = 0;
        class18.field289 = 0;
        class332.field4922 = 0;
        class208.field2941 = 0;
        class129.field1700 = 0;
        class133.field1813 = 0;
        class243.field3604 = 0;
        class327.field4861 = 0;
        class248.field3654 = 0;
        class251.field3692 = 0;
        class409.field5880 = 0;
        class354.field5156 = 0;
        class311.field4575 = 0;
        class303.field4438 = 0;
        class403.field5811 = 0;
        class354.field5163 = 0;
        class2.field26 = 0;
        class56.field686 = 0;
        class455.field6721 = 0;
        class393.field5721 = 0;
        class202.field2850 = 0;
        class108.field1473 = 0;
        class427.field6148 = 0;
        class437.field6372 = 0;
        class430.field6260 = 0;
        class456.field6742 = 0;
        class46.field592 = 0;
        class243.field3601 = 0;
        class189.field2641 = 0;
        class90.field1105 = 0;
        class15.field243 = 0;
        class124.field1635 = 0;
        class411.field5910 = 0;
        class195.field2744 = 0;
        class363.field5243 = 0;
        class260.field3845 = 0;
        class196.field2782 = 0;
        class25.field347 = 0;
        class260.field3857 = 0;
        class184.field2576 = 0;
        class104.field1356 = 0;
        class446.field6509 = 0;
        class85.field1036 = 0;
        class91.field1120 = 0;
        class430.field6271 = 0;
        class11.field150 = 0;
        class358.field5193 = 0;
        class169.field2210 = 0;
        class440.field6398 = 0;
        class317.field4650 = 0;
        class145.field1965 = 0;
        class228.field3430 = 0;
        class99.field1220 = 0;
        class283.field4165 = 0;
        class349.field5112 = 0;
        class370.field5407 = 0;
        class44.field574 = 0;
        class215.field3036 = 0;
        class175.field2416 = 0;
        class358.field5202 = 0;
        class164.field2170 = 0;
        class88.field1090 = 0;
        client.field3884 = 0;
        class150.field2025 = 0;
        class104.field1384 = 0;
        class305.field4499 = 0;
        class294.field4267 = 0;
        class365.field5279 = 0;
        class464.field6838 = 0;
        class196.field2756 = 0;
        class136.field1871 = 0;
        class18.field291 = 0;
        class256.field3753 = 0;
        class427.field6135 = 0;
        class148.field2003 = 0;
        class304.field4451 = 0;
        class380.field5589 = 0;
        class251.field3691 = 0;
        class256.field3765 = 0;
        class132.field1800 = 0;
        class34.field476 = 0;
        class332.field4920 = 0;
        class327.field4838 = 0;
        class301.field4385 = 0;
        class377.field5517 = 0;
        class403.field5813 = 0;
        client.field3876 = 0;
        class57.field704 = 0;
        class450.field6592 = 0;
        class84.field1025 = 0;
        class4.field63 = 0;
        class4.field48 = 0;
        class339.field4993 = 0;
        class371.field5433 = 0;
        class440.field6389 = 0;
        class84.field1031 = 0;
        class316.field4633 = 0;
        class214.field3013 = 0;
        class365.field5281 = 0;
        class316.field4629 = 0;
        class307.field4533 = 0;
        class195.field2748 = 0;
        class423.field6113 = 0;
        class295.field4285 = 0;
        class204.field2868 = 0;
        class130.field1723 = 0;
        class200.field2822 = 0;
        class148.field2008 = 0;
        class25.field342 = 0;
        class152.field2054 = 0;
        class166.field2186 = 0;
        class320.field4726 = 0;
        class342.field5032 = 0;
        class363.field5250 = 0;
        class7.field102 = 0;
        class459.field6780 = 0;
        class88.field1089 = 0;
        class283.field4163 = 0;
        class138.field1895 = 0;
        class455.field6715 = 0;
        class133.field1832 = 0;
        class256.field3748 = 0;
        class1.field1 = 0;
        class380.field5544 = 0;
        class365.field5276 = 0;
        class421.field6088 = 0;
        class215.field3035 = 0;
        class256.field3754 = 0;
        class304.field4443 = 0;
        class317.field4642 = 0;
        class104.field1355 = 0;
        class253.field3718 = 0;
        class256.field3737 = 0;
        class430.field6252 = 0;
        class282.field4142 = 0;
        class375.field5471 = 0;
        class377.field5507 = 0;
        class26.field362 = 0;
        class227.field3393 = 0;
        class53.field662 = 0;
        class245.field3622 = 0;
        class346.field5084 = 0;
        class107.field1450 = 0;
        class105.field1399 = 0;
        class213.field3003 = 0;
        class160.field2139 = 0;
        class353.field5143 = 0;
        class184.field2585 = 0;
        class419.field6071 = 0;
        class411.field5918 = 0;
        class58.field728 = 0;
        class228.field3425 = 0;
        class25.field356 = 0;
        class215.field3048 = 0;
        class346.field5099 = 0;
        class200.field2824 = 0;
        class187.field2618 = 0;
        class452.field6666 = 0;
        class416.field6015 = 0;
        class430.field6249 = 0;
        class231.field3463 = 0;
        class210.field2954 = 0;
        class326.field4805 = 0;
        class377.field5530 = 0;
        class169.field2211 = 0;
        class339.field4997 = 0;
        class308.field4545 = 0;
        class446.field6491 = 0;
        class380.field5570 = 0;
        class104.field1375 = 0;
        class253.field3711 = 0;
        class346.field5086 = 0;
        class458.field6768 = 0;
        class192.field2689 = 0;
        class103.field1321 = 0;
        class257.field3805 = 0;
        class42.field553 = 0;
        class380.field5574 = 0;
        class231.field3467 = 0;
        class223.field3320 = 0;
        class358.field5200 = 0;
        class390.field5690 = 0;
        class265.field3935 = 0;
        class370.field5354 = 0;
        class124.field1641 = 0;
        client.field3889 = 0;
        class175.field2414 = 0;
        class279.field4115 = 0;
        class372.field5443 = 0;
        class446.field6536 = 0;
        class344.field5056 = 0;
        client.field3885 = 0;
        class323.field4765 = 0;
        class104.field1363 = 0;
        class25.field345 = 0;
        class143.field1946 = 0;
        class454.field6698 = 0;
        class132.field1804 = 0;
        class430.field6264 = 0;
        class286.field4201 = 0;
        class387.field5652 = 0;
        class111.field1535 = 0;
        class397.field5765 = 0;
        class295.field4297 = 0;
        class452.field6667 = 0;
        class441.field6416 = 0;
        class339.field4989 = 0;
        class227.field3403 = 0;
        class393.field5712 = 0;
        class13.field210 = 0;
        class256.field3759 = 0;
        class184.field2577 = 0;
        class76.field971 = 0;
        class404.field5840 = 0;
        class295.field4296 = 0;
        class358.field5186 = 0;
        class1.field10 = 0;
        class239.field3545 = 0;
        class175.field2396 = 0;
        class310.field4563 = 0;
        class237.field3531 = 0;
        class104.field1348 = 0;
        class283.field4159 = 0;
        class34.field483 = 0;
        class459.field6789 = 0;
        class227.field3394 = 0;
        class52.field646 = 0;
        class337.field4975 = 0;
        class26.field371 = 0;
        class270.field4009 = 0;
        class46.field595 = 0;
        class458.field6753 = 0;
        class105.field1406 = 0;
        class105.field1396 = 0;
        class267.field3971 = 0;
        class4.field65 = 0;
        class96.field1193 = 0;
        class304.field4455 = 0;
        class143.field1938 = 0;
        class346.field5089 = 0;
        class380.field5577 = 0;
        class119.field1595 = 0;
        class289.field4229 = 0;
        class256.field3738 = 0;
        class11.field152 = 0;
        class110.field1512 = 0;
        class92.field1148 = 0;
        class91.field1123 = 0;
        class270.field4003 = 0;
        class303.field4435 = 0;
        class266.field3940 = 0;
        class191.field2668 = 0;
        class175.field2402 = 0;
        class322.field4732 = 0;
        class206.field2884 = 0;
        class432.field6288 = 0;
        class327.field4865 = 0;
        class60.field807 = 0;
        class454.field6690 = 0;
        class103.field1330 = 0;
        class404.field5846 = 0;
        class319.field4705 = 0;
        class85.field1040 = 0;
        class283.field4152 = 0;
        class52.field654 = 0;
        class33.field453 = 0;
        class233.field3500 = 0;
        class386.field5643 = 0;
        class56.field687 = 0;
        class295.field4298 = 0;
        class430.field6269 = 0;
        class380.field5555 = 0;
        class266.field3954 = 0;
        class358.field5208 = 0;
        class175.field2418 = 0;
        class403.field5814 = 0;
        class309.field4557 = 0;
        class105.field1405 = 0;
        class11.field138 = 0;
        class450.field6570 = 0;
        class139.field1909 = 0;
        class4.field52 = 0;
        class55.field680 = 0;
        class256.field3780 = 0;
        class175.field2409 = 0;
        class450.field6568 = 0;
        class289.field4237 = 0;
        class105.field1408 = 0;
        class175.field2403 = 0;
        class458.field6771 = 0;
        class104.field1354 = 0;
        class388.field5670 = 0;
        class133.field1815 = 0;
        class239.field3539 = 0;
        class435.field6343 = 0;
        class210.field2953 = 0;
        class69.field905 = 0;
        class74.field945 = 0;
        class342.field5037 = 0;
        field1068 = 0;
        class215.field3063 = 0;
        class301.field4375 = 0;
        class388.field5664 = 0;
        client.field3879 = 0;
        class62.field823 = 0;
        class253.field3714 = 0;
        class215.field3038 = 0;
        class317.field4644 = 0;
        class260.field3852 = 0;
        class2.field24 = 0;
        class402.field5801 = 0;
        class322.field4752 = 0;
        class5.field78 = 0;
        class317.field4637 = 0;
        class381.field5591 = 0;
        class430.field6254 = 0;
        class126.field1674 = 0;
        class59.field798 = 0;
        class15.field236 = 0;
        class456.field6745 = 0;
        class260.field3843 = 0;
        class363.field5241 = 0;
        class301.field4389 = 0;
        class260.field3853 = 0;
        class249.field3661 = 0;
        class344.field5055 = 0;
        class175.field2398 = 0;
        class107.field1457 = 0;
        class265.field3936 = 0;
        class342.field5035 = 0;
        class256.field3792 = 0;
        class456.field6737 = 0;
        class411.field5904 = 0;
        class196.field2777 = 0;
        class17.field258 = 0;
        class336.field4953 = 0;
        class105.field1409 = 0;
        client.field3873 = 0;
        class447.field6543 = 0;
        class270.field3999 = 0;
        class459.field6791 = 0;
        class264.field3903 = 0;
        class9.field114 = 0;
        class178.field2505 = 0;
        class105.field1403 = 0;
        class381.field5592 = 0;
        class104.field1364 = 0;
        class33.field452 = 0;
        class150.field2024 = 0;
        class230.field3440 = 0;
        class15.field244 = 0;
        class104.field1346 = 0;
        class18.field292 = 0;
        class252.field3704 = 0;
        class215.field3057 = 0;
        class427.field6180 = 0;
        class225.field3367 = 0;
        class244.field3611 = 0;
        class77.field980 = 0;
        class215.field3041 = 0;
        class138.field1899 = 0;
        class91.field1133 = 0;
        class372.field5436 = 0;
        class9.field118 = 0;
        class4.field59 = 0;
        class450.field6614 = 0;
        class252.field3700 = 0;
        class303.field4427 = 0;
        class1.field2 = 0;
        class157.field2096 = 0;
        class137.field1873 = 0;
        class345.field5070 = 0;
        class353.field5146 = 0;
        class9.field117 = 0;
        class90.field1100 = 0;
        class233.field3501 = 0;
        class346.field5083 = 0;
        class390.field5696 = 0;
        class195.field2747 = 0;
        class377.field5516 = 0;
        class184.field2588 = 0;
        class322.field4748 = 0;
        class139.field1906 = 0;
        class233.field3488 = 0;
        class240.field3564 = 0;
        class259.field3827 = 0;
        class225.field3373 = 0;
        class199.field2799 = 0;
        class184.field2581 = 0;
        class51.field638 = 0;
        class178.field2456 = 0;
        class278.field4094 = 0;
        class118.field1589 = 0;
        class166.field2184 = 0;
        class32.field439 = 0;
        class129.field1722 = true;
        class336.field4964 = true;
        class357.method2273(false);
        class159.field2132.field3762 = 0;
        class243.field3603 = 0;
        class30.field421 = null;
        class53.field661 = null;
        class22.field306.field3762 = 0;
        class184.field2595 = 0;
        class251.field3687 = null;
        class444.field6471 = null;
        class15.field246 = 0;
        for (int var2 = 0; var2 < class331.field4910.length; var2++) {
            class331.field4910[var2] = null;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class455.field6732[var3] = null;
        }
        class402.field5806 = (int) (Math.random() * 100.0D) - 50;
        class303.field4429 = (int) (Math.random() * 120.0D) - 60;
        class9.field124 = 0;
        class146.field1977 = (int) (Math.random() * 80.0D) - 40;
        class119.field1596 = (int) (Math.random() * 110.0D) - 55;
        class147.field1993 = false;
        class1.field19 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
        class32.field447 = 0;
        class30.field422 = (int) (Math.random() * 30.0D) - 20;
        class286.method1924(65536);
        for (int var4 = 0; var4 < 2048; var4++) {
            class455.field6731[var4] = null;
        }
        class14.field231 = 0;
        for (int var5 = 0; var5 < 32768; var5++) {
            class364.field5260[var5] = null;
        }
        class26.field383.method2477(-14221);
        class189.field2650.method2477(-14221);
        class134.field1839.method2021(-16777216);
        class200.field2828.method600(-81);
        class276.field4087 = new class395();
        class395.field5753 = 0;
        class373.field5450 = 0;
        class256.method1711((byte) 120);
        class397.method2491(-68);
        class308.field4554 = 0;
        class385.field5638 = 0;
        class296.field4322 = 0;
        class93.field1159 = 0;
        class32.field444 = 0;
        field1064 = 0;
        class417.field6030 = 0;
        class2.field27 = 0;
        class15.field238 = 0;
        class359.field5225 = 0;
        for (int var6 = 0; var6 < class447.field6540.length; var6++) {
            if (!class36.field512[var6]) {
                class447.field6540[var6] = -1;
            }
        }
        if (class318.field4672 != -1) {
            class464.method2866((byte) -128, class318.field4672);
        }
        for (class182 var7 = (class182) class252.field3703.method608((byte) 121); var7 != null; var7 = (class182) class252.field3703.method604(-80)) {
            if (!var7.method1822(-97)) {
                var7 = (class182) class252.field3703.method608((byte) 120);
                if (var7 == null) {
                    break;
                }
            }
            class240.method1615(false, true, (byte) 100, var7);
        }
        class318.field4672 = -1;
        class252.field3703 = new class90(8);
        class200.method1384(0);
        class378.field5539 = null;
        for (int var8 = 0; var8 < 8; var8++) {
            class141.field1928[var8] = null;
            class418.field6063[var8] = false;
            class466.field6859[var8] = -1;
        }
        class129.method863(2);
        class353.field5142 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class344.field5053[var9] = true;
        }
        class253.field3720 = null;
        class418.field6032 = 0;
        class142.field1937 = null;
        for (int var10 = 0; var10 < 6; var10++) {
            class14.field228[var10] = new class404();
        }
        for (int var11 = 0; var11 < 25; var11++) {
            class143.field1947[var11] = 0;
            class369.field5331[var11] = 0;
            class47.field614[var11] = 0;
        }
        class365.method2329(123);
        class373.field5455 = true;
        class213.field3007 = class67.field896 = class46.field609 = class34.field490 = new short[256];
        class155.field2087 = class243.field3598.method2543(false, class153.field2073);
        class458.field6776 = 0;
        class22.field317 = false;
        class359.method2282(122);
        class454.method2814(false);
        class373.field5445.field1369 = 2;
        class167.field2198 = 0L;
        class408.field5874 = null;
    }
}
