import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class155 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public static int[] field2327 = new int[25];

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lpf;")
    public static class294 field2330;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[[Z")
    public static boolean[][] field2329;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static final void method940(boolean arg0) {
        if (!arg0) {
            field2329 = null;
        }
        int var1 = class8.method41((byte) -125);
        field2332++;
        if (var1 == 0) {
            class272.field4093 = null;
            class246.method1543(0, -93);
        } else if (var1 == 1) {
            class45.method307(!arg0, (byte) 0);
            class246.method1543(512, -124);
            if (class221.field3333 != null) {
                class278.method1842((byte) 23);
                return;
            }
        } else {
            class45.method307(false, (byte) (class246.field3674 - 4 & 0xFF));
            class246.method1543(2, -47);
            return;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        if (arg0 != -1) {
            method940(true);
        }
        field2330 = null;
        field2327 = null;
        field2329 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method942(int arg0, int arg1) {
        field2331++;
        if (arg1 == 100 && class169.field2584 > 0) {
            byte[] var2 = class166.field2551[--class169.field2584];
            class166.field2551[class169.field2584] = null;
            return var2;
        } else if (arg1 == 5000 && class231.field3480 > 0) {
            byte[] var3 = class255.field3888[--class231.field3480];
            class255.field3888[class231.field3480] = null;
            return var3;
        } else if (arg1 == 30000 && class120.field1816 > 0) {
            byte[] var4 = class214.field3194[--class120.field1816];
            class214.field3194[class120.field1816] = null;
            return var4;
        } else {
            if (arg0 != 365) {
                method940(true);
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z[[[I[Lha;B)V")
    public static final void method943(boolean arg0, int[][][] arg1, class31[] arg2, byte arg3) {
        field2328++;
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class221.field3333[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class221.field3333[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method196(var5, var6, 2097152);
                            }
                        }
                    }
                }
            }
            class220.field3312 += (int) (Math.random() * 5.0D) - 2;
            class265.field3999 += (int) (Math.random() * 5.0D) - 2;
            if (class220.field3312 < -16) {
                class220.field3312 = -16;
            }
            if (class220.field3312 > 16) {
                class220.field3312 = 16;
            }
            if (class265.field3999 < -8) {
                class265.field3999 = -8;
            }
            if (class265.field3999 > 8) {
                class265.field3999 = 8;
            }
        }
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class220.field3312 >> 1;
        if (arg3 != 70) {
            method942(45, 42);
        }
        int var10 = class265.field3999 >> 2 << 10;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class118.field1784[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class67.field1072[var13][var101][var55 + 1] - class67.field1072[var13][var101][var55 - 1];
                    int var104 = class67.field1072[var13][var101 + 1][var55] - class67.field1072[var13][var101 - 1][var55];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = (var103 << 8) / var105;
                    int var108 = -65536 / var105;
                    int var109 = (var52[var101 - 1][var55] >> 2) + ((var52[var101 + 1][var55] >> 3) + (var52[var101][var55 - 1] >> 2) + (var52[var101][var55 + 1] >> 3)) + (var52[var101][var55] >> 1);
                    int var110 = (var106 * -50 + var107 * -50 + (var108 * -10)) / var54 + var102;
                    var12[var101][var55] = var110 - var109;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class106.field1634[var56] = 0;
                class43.field695[var56] = 0;
                class157.field2359[var56] = 0;
                class57.field909[var56] = 0;
                class39.field523[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class243.field3644[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class281 var97 = class270.method1802(var96 - 1, (byte) -88);
                            class106.field1634[var86] += var97.field4206;
                            class43.field695[var86] += var97.field4209;
                            class157.field2359[var86] += var97.field4204;
                            class57.field909[var86] += var97.field4198;
                            var10002 = class39.field523[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class243.field3644[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class281 var100 = class270.method1802(var99 - 1, (byte) -88);
                            class106.field1634[var86] -= var100.field4206;
                            class43.field695[var86] -= var100.field4209;
                            class157.field2359[var86] -= var100.field4204;
                            class57.field909[var86] -= var100.field4198;
                            var10002 = class39.field523[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var87 += class106.field1634[var93];
                            var90 += class57.field909[var93];
                            var89 += class43.field695[var93];
                            var91 += class39.field523[var93];
                            var88 += class157.field2359[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var91 -= class39.field523[var94];
                            var90 -= class57.field909[var94];
                            var87 -= class106.field1634[var94];
                            var89 -= class43.field695[var94];
                            var88 -= class157.field2359[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class143.method876(var89 / var91, (byte) -119, var88 / var91, var87 * 256 / var90);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg0 || class266.method1772(-128) || (class221.field3333[0][var58][var59] & 0x2) != 0 || (class221.field3333[var13][var58][var59] & 0x10) == 0 && class251.method1649((byte) 45, var58, var59, var13) == class79.field1273) {
                        if (var13 < class276.field4160) {
                            class276.field4160 = var13;
                        }
                        int var60 = class243.field3644[var13][var58][var59] & 0xFF;
                        int var61 = class70.field1108[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class67.field1072[var13][var58 + 1][var59];
                            int var63 = class67.field1072[var13][var58][var59];
                            int var64 = class67.field1072[var13][var58 + 1][var59 + 1];
                            int var65 = class67.field1072[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class20.field226[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class116.method745(var61 - 1, false).field1600) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var63 == var64 && var63 == var65) {
                                    class143.field2102[var13][var58][var59] = class63.method428(class143.field2102[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var11[var58][var59];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var67 + var10 & 0xFC00) - (-(var67 & 0x380) - var68);
                                var70 = class249.field3766[class296.method1987(65408, var69, 96)];
                            } else {
                                var70 = 0;
                                var67 = -1;
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59];
                            int var73 = var12[var58 + 1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class254.method1671(var13, var58, var59, 0, 0, -1, var63, var62, var64, var65, class296.method1987(arg3 ^ 0xFFC6, var67, var71), class296.method1987(arg3 ^ 0xFFC6, var67, var72), class296.method1987(arg3 ^ 0xFFC6, var67, var73), class296.method1987(65408, var67, var74), 0, 0, 0, 0, var70, 0);
                            } else {
                                byte var75 = class139.field2040[var13][var58][var59];
                                int var76 = class20.field226[var13][var58][var59] + 1;
                                class102 var77 = class116.method745(var61 - 1, false);
                                int var78 = var77.field1605;
                                if (var78 >= 0 && !class249.field3775.method1307(255, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class249.field3766[class151.method912(arg3 + 16, 96, class249.field3775.method1308(var78, -8604))];
                                } else if (var77.field1595 == -1) {
                                    var79 = -2;
                                    var80 = 0;
                                } else {
                                    var79 = var77.field1595;
                                    int var81 = (var79 & 0x7F) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var79 + var10 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class249.field3766[class151.method912(82, 96, var82)];
                                }
                                if (var77.field1603 >= 0) {
                                    int var83 = var77.field1603;
                                    int var84 = (var83 & 0x7F) + var9;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var10 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var80 = class249.field3766[class151.method912(118, 96, var85)];
                                }
                                class254.method1671(var13, var58, var59, var76, var75, var78, var63, var62, var64, var65, class296.method1987(65408, var67, var71), class296.method1987(65408, var67, var72), class296.method1987(65408, var67, var73), class296.method1987(65408, var67, var74), class151.method912(63, var71, var79), class151.method912(86, var72, var79), class151.method912(arg3 + 52, var73, var79), class151.method912(arg3 + 55, var74, var79), var70, var80);
                            }
                        }
                    }
                }
            }
            class243.field3644[var13] = null;
            class70.field1108[var13] = null;
            class20.field226[var13] = null;
            class139.field2040[var13] = null;
            class118.field1784[var13] = null;
        }
        class244.method1537(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class221.field3333[1][var14][var51] & 0x2) == 2) {
                    class173.method1071(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class143.field2102[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 < 104 && (class143.field2102[var15][var17][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19 = var15;
                        int var20 = var15;
                        int var21;
                        for (var21 = var16; var21 > 0 && (class143.field2102[var15][var17][var21 - 1] & 0x1) != 0; var21--) {
                        }
                        label352: while (var19 > 0) {
                            for (int var22 = var21; var22 <= var18; var22++) {
                                if ((class143.field2102[var19 - 1][var17][var22] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var19--;
                        }
                        label341: while (var20 < 3) {
                            for (int var23 = var21; var23 <= var18; var23++) {
                                if ((class143.field2102[var20 + 1][var17][var23] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var20++;
                        }
                        int var24 = (var20 - (var19 - 1)) * (var18 + 1 - var21);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class67.field1072[var20][var17][var21] - var25;
                            int var27 = class67.field1072[var19][var17][var21];
                            class11.method52(1, var17 * 128, var17 * 128, var21 * 128, var18 * 128 + 128, var26, var27);
                            for (int var28 = var19; var28 <= var20; var28++) {
                                for (int var29 = var21; var29 <= var18; var29++) {
                                    class143.field2102[var28][var17][var29] = class94.method598(class143.field2102[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class143.field2102[var15][var17][var16] & 0x2) != 0) {
                        int var30 = var17;
                        int var31 = var17;
                        int var32 = var15;
                        while (var30 > 0 && (class143.field2102[var15][var30 - 1][var16] & 0x2) != 0) {
                            var30--;
                        }
                        int var33 = var15;
                        while (var31 < 104 && (class143.field2102[var15][var31 + 1][var16] & 0x2) != 0) {
                            var31++;
                        }
                        label406: while (var33 > 0) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class143.field2102[var33 - 1][var34][var16] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                            var33--;
                        }
                        label395: while (var32 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class143.field2102[var32 + 1][var35][var16] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var32++;
                        }
                        int var36 = (var31 + 1 - var30) * (var32 + 1 - var33);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class67.field1072[var33][var30][var16];
                            int var39 = class67.field1072[var32][var30][var16] - var37;
                            class11.method52(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var39, var38);
                            for (int var40 = var33; var40 <= var32; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class143.field2102[var40][var41][var16] = class94.method598(class143.field2102[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class143.field2102[var15][var17][var16] & 0x4) != 0) {
                        int var42;
                        for (var42 = var16; var42 > 0 && (class143.field2102[var15][var17][var42 - 1] & 0x4) != 0; var42--) {
                        }
                        int var43 = var17;
                        int var44 = var17;
                        int var45;
                        for (var45 = var16; var45 < 104 && (class143.field2102[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        label460: while (var43 > 0) {
                            for (int var46 = var42; var46 <= var45; var46++) {
                                if ((class143.field2102[var15][var43 - 1][var46] & 0x4) == 0) {
                                    break label460;
                                }
                            }
                            var43--;
                        }
                        label449: while (var44 < 104) {
                            for (int var47 = var42; var47 <= var45; var47++) {
                                if ((class143.field2102[var15][var44 + 1][var47] & 0x4) == 0) {
                                    break label449;
                                }
                            }
                            var44++;
                        }
                        if ((var45 + 1 - var42) * (var44 + 1 - var43) >= 4) {
                            int var48 = class67.field1072[var15][var43][var42];
                            class11.method52(4, var43 * 128, var44 * 128 + 128, var42 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var43; var49 <= var44; var49++) {
                                for (int var50 = var42; var50 <= var45; var50++) {
                                    class143.field2102[var15][var49][var50] = class94.method598(class143.field2102[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
