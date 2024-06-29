import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class188 extends class175 {

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "[I")
    public static int[] field3292 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "Lmb;")
    private static class96 field3291 = class243.method1708("Close", (byte) 113);

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "Lmb;")
    public static class96 field3296 = class243.method1708("Speicher wird zugewiesen)3", (byte) 111);

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "Lmb;")
    public static class96 field3293 = class243.method1708("blaugr-Un:", (byte) 124);

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Lmb;")
    public static class96 field3289 = field3291;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "[B")
    public static byte[] field3295;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field3290;
        if (arg1 == 0) {
            super.field3034 = ~arg2.method1651(4139) == -2;
        }
        int var4 = 83 / ((-22 - arg0) / 58);
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static void method1326(int arg0) {
        field3295 = null;
        field3291 = null;
        field3293 = null;
        if (arg0 != -21961) {
            field3291 = null;
        }
        field3289 = null;
        field3296 = null;
        field3292 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBIIII)V")
    public static final void method1327(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; arg0 + arg2 >= var6; ++var6) {
            for (int var11 = arg4; ~var11 >= ~(arg4 + arg5); ++var11) {
                if (var11 >= 0 && ~var11 > -105 && ~var6 <= -1 && var6 < 104) {
                    class27.field462[arg3][var11][var6] = 127;
                }
            }
        }
        if (arg1 >= -109) {
            method1329(-8, 71, -51, 26, (class108) null, -59L, true);
        }
        ++field3297;
        for (int var7 = arg0; var7 < arg0 + arg2; ++var7) {
            for (int var10 = arg4; var10 < arg4 + arg5; ++var10) {
                if (~var10 <= -1 && var10 < 104 && var7 >= 0 && ~var7 > -105) {
                    class173.field3022[arg3][var10][var7] = ~arg3 >= -1 ? 0 : class173.field3022[arg3 + -1][var10][var7];
                }
            }
        }
        if (arg4 > 0 && ~arg4 > -105) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg2; ++var8) {
                if (~var8 <= -1 && var8 < 104) {
                    class173.field3022[arg3][arg4][var8] = class173.field3022[arg3][arg4 + -1][var8];
                }
            }
        }
        if (~arg0 < -1 && arg0 < 104) {
            for (int var9 = arg4 + 1; ~var9 > ~(arg4 - -arg5); ++var9) {
                if (~var9 <= -1 && ~var9 > -105) {
                    class173.field3022[arg3][var9][arg0] = class173.field3022[arg3][var9][arg0 - 1];
                }
            }
        }
        if (arg4 >= 0 && ~arg0 <= -1 && ~arg4 > -105 && arg0 < 104) {
            if (~arg3 == -1) {
                if (arg4 > 0 && class173.field3022[arg3][arg4 + -1][arg0] != 0) {
                    class173.field3022[arg3][arg4][arg0] = class173.field3022[arg3][arg4 + -1][arg0];
                    return;
                }
                if (~arg0 < -1 && class173.field3022[arg3][arg4][arg0 + -1] != 0) {
                    class173.field3022[arg3][arg4][arg0] = class173.field3022[arg3][arg4][arg0 + -1];
                    return;
                }
                if (arg4 > 0 && arg0 > 0 && ~class173.field3022[arg3][arg4 + -1][arg0 + -1] != -1) {
                    class173.field3022[arg3][arg4][arg0] = class173.field3022[arg3][arg4 - 1][arg0 + -1];
                    return;
                }
            } else {
                if (arg4 <= 0 || ~class173.field3022[arg3 + -1][arg4 + -1][arg0] == ~class173.field3022[arg3][arg4 + -1][arg0]) {
                    if (~arg0 < -1 && class173.field3022[arg3][arg4][arg0 - 1] != class173.field3022[arg3 - 1][arg4][arg0 + -1]) {
                        class173.field3022[arg3][arg4][arg0] = class173.field3022[arg3][arg4][arg0 - 1];
                        return;
                    }
                    if (arg4 > 0 && arg0 > 0 && ~class173.field3022[arg3][arg4 + -1][arg0 - 1] != ~class173.field3022[arg3 + -1][arg4 + -1][arg0 + -1]) {
                        class173.field3022[arg3][arg4][arg0] = class173.field3022[arg3][arg4 - 1][arg0 + -1];
                        return;
                    }
                    return;
                }
                class173.field3022[arg3][arg4][arg0] = class173.field3022[arg3][arg4 + -1][arg0];
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = -arg0 + arg6;
        if (arg6 < class176.field3068) {
            ++var11;
        }
        int var12 = arg2 - arg4;
        if (arg2 < class140.field2500) {
            ++var12;
        }
        int var10000;
        for (int var13 = 0; var12 > var13; ++var13) {
            int var44 = arg7 * var13 + arg8 >> 16;
            int var45 = (var13 + 1) * arg7 + arg8 >> 16;
            int var46 = -var44 + var45;
            if (~var46 < -1) {
                int var47 = var13 - -arg4 >> 6;
                if (~var47 <= -1 && ~(class210.field3622.length + -1) <= ~var47) {
                    int var48 = arg1 + var45;
                    byte[][] var49 = class75.field1298[var47];
                    int[][] var50 = class210.field3622[var47];
                    byte[][] var51 = class38.field653[var47];
                    int var52 = arg1 + var44;
                    byte[][] var53 = class32.field500[var47];
                    byte[][] var54 = class45.field775[var47];
                    byte[][] var55 = class9.field159[var47];
                    for (int var56 = 0; var56 < var11; ++var56) {
                        int var57 = arg3 * var56 + arg5 >> 16;
                        int var58 = (var56 - -1) * arg3 + arg5 >> 16;
                        int var59 = -var57 + var58;
                        if (var59 > 0) {
                            int var60 = arg10 + var57;
                            int var61 = arg10 + var58;
                            int var62 = arg0 + var56 >> 6;
                            int var63 = 63 & arg4 + var13;
                            int var64 = arg0 + var56 & 63;
                            int var65 = (var64 << 6) - -var63;
                            int var66;
                            if (~var62 <= -1 && var62 <= var50.length - 1 && var50[var62] != null) {
                                var66 = var50[var62][var65];
                            } else {
                                if (~class90.field1500.field4620 == 0) {
                                    if (~(var56 - -arg0 & 4) == ~(arg4 + var13 & 4)) {
                                        var66 = class247.field4280[class20.field328 + 1];
                                    } else {
                                        var66 = 4936552;
                                    }
                                } else {
                                    var66 = class90.field1500.field4620;
                                }
                                if (var62 < 0 || ~var62 < ~(var50.length + -1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class84.method598(var52, var60, var46, var59, var66);
                                    continue;
                                }
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var51[var62] != null ? class247.field4280[var51[var62][var65] & 255] : 0;
                            int var68 = var53[var62] != null ? class247.field4280[var53[var62][var65] & 255] : 0;
                            if (var68 == 0 && ~var67 == -1) {
                                class84.method598(var52, var60, var46, var59, var66);
                            } else {
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = 1;
                                    }
                                    byte var69 = var49[var62] != null ? var49[var62][var65] : 0;
                                    int var70 = 252 & var69;
                                    if (var70 != 0 && var46 > 1 && var59 > 1) {
                                        class124.method957(var66, var59, var60, var46, var68, class84.field1427, var52, true, var70 >> 2, 3 & var69, arg9 + 10069);
                                    } else {
                                        class84.method598(var52, var60, var46, var59, var68);
                                    }
                                }
                                if (~var67 != -1) {
                                    if (~var67 == 0) {
                                        var67 = var66;
                                    }
                                    byte var71 = var54[var62][var65];
                                    int var72 = 252 & var71;
                                    if (~var72 == -1 || var46 <= 1 || ~var59 >= -2) {
                                        class84.method598(var52, var60, var46, var59, var67);
                                    }
                                    class124.method957(0, var59, var60, var46, var67, class84.field1427, var52, var68 == 0, var72 >> 2, var71 & 3, 16274);
                                }
                            }
                            if (var55[var62] != null) {
                                int var73 = var55[var62][var65] & 255;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var52;
                                    } else {
                                        var74 = var48 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var60;
                                    } else {
                                        var75 = var61 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (~var73 <= -6 && ~var73 >= -9 || ~var73 <= -14 && ~var73 >= -17 || ~var73 <= -22 && ~var73 >= -25 || ~var73 == -28 || ~var73 == -29) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 != 1) {
                                        if (var73 == 2) {
                                            class84.method595(var52, var60, var46, var76);
                                        } else if (~var73 != -4) {
                                            if (var73 != 4) {
                                                if (var73 != 9) {
                                                    if (~var73 == -11) {
                                                        class84.method613(var74, var60, var59, 16777215);
                                                        class84.method595(var52, var60, var46, var76);
                                                    } else if (~var73 == -12) {
                                                        class84.method613(var74, var60, var59, 16777215);
                                                        class84.method595(var52, var75, var46, var76);
                                                    } else if (var73 != 12) {
                                                        if (var73 == 17) {
                                                            class84.method595(var52, var60, 1, var76);
                                                        } else if (var73 != 18) {
                                                            if (~var73 != -20) {
                                                                if (~var73 == -21) {
                                                                    class84.method595(var52, var75, 1, var76);
                                                                } else if (var73 == 25) {
                                                                    for (int var77 = 0; ~var77 > ~var59; ++var77) {
                                                                        class84.method595(var52 + var77, var75 - var77, 1, var76);
                                                                    }
                                                                } else if (var73 == 26) {
                                                                    for (int var78 = 0; var78 < var59; ++var78) {
                                                                        class84.method595(var52 + var78, var60 + var78, 1, var76);
                                                                    }
                                                                }
                                                            } else {
                                                                class84.method595(var74, var75, 1, var76);
                                                            }
                                                        } else {
                                                            class84.method595(var74, var60, 1, var76);
                                                        }
                                                    } else {
                                                        class84.method613(var52, var60, var59, 16777215);
                                                        class84.method595(var52, var75, var46, var76);
                                                    }
                                                } else {
                                                    class84.method613(var52, var60, var59, 16777215);
                                                    class84.method595(var52, var60, var46, var76);
                                                }
                                            } else {
                                                class84.method595(var52, var75, var46, var76);
                                            }
                                        } else {
                                            class84.method613(var74, var60, var59, var76);
                                        }
                                    } else {
                                        class84.method613(var52, var60, var59, var76);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var45;
                    int var80 = arg1 + var44;
                    for (int var81 = 0; var81 < var11; ++var81) {
                        int var82 = ((var81 + 1) * arg3 + arg5 >> 16) - -arg10;
                        int var83;
                        if (class90.field1500.field4620 == -1) {
                            if ((arg0 + var81 & 4) != (arg4 + var13 & 4)) {
                                var83 = 4936552;
                            } else {
                                var83 = class247.field4280[class20.field328 - -1];
                            }
                        } else {
                            var83 = class90.field1500.field4620;
                        }
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        int var84 = (arg3 * var81 + arg5 >> 16) + arg10;
                        int var85 = var82 - var84;
                        class84.method598(var80, var84, var46, var85, var83);
                    }
                }
            }
        }
        ++field3287;
        if (arg9 != 6205) {
            field3291 = null;
        }
        for (int var14 = -2; var12 + 2 > var14; ++var14) {
            int var15 = arg7 * var14 + arg8 >> 16;
            int var16 = arg8 - -((var14 + 1) * arg7) >> 16;
            int var17 = -var15 + var16;
            if (~var17 < -1) {
                var10000 = arg1 + var16;
                int var19 = arg1 + var15;
                int var20 = var14 - -arg4 >> 6;
                if (~var20 <= -1 && class106.field1807.length + -1 >= var20) {
                    short[][] var21 = class106.field1807[var20];
                    for (int var22 = -2; var22 < var11 + 2; ++var22) {
                        int var23 = arg3 * var22 + arg5 >> 16;
                        int var24 = arg5 - -((var22 + 1) * arg3) >> 16;
                        int var25 = -var23 + var24;
                        if (var25 > 0) {
                            int var26 = arg10 + var23;
                            int var27 = arg0 + var22 >> 6;
                            var10000 = arg10 + var24;
                            if (var27 >= 0 && var27 <= var21.length + -1) {
                                int var29 = ((arg0 + var22 & 63) << 6) + (arg4 + var14 & 63);
                                if (var21[var27] != null) {
                                    int var30 = 16383 & var21[var27][var29];
                                    int var31 = (64281 & var21[var27][var29]) >> 14;
                                    if (var30 != 0) {
                                        if (~var31 == -1) {
                                            int var32 = class265.field4638[var30 + -1].field1462 * var17 / 4;
                                            int var33 = class265.field4638[var30 + -1].field1461 * var25 / 4;
                                            int var34 = class265.field4638[var30 + -1].field1460 * var25 / 4;
                                            class265.field4638[var30 - 1].method202(var19, -var34 + var26, var32, var33);
                                        } else if (var31 != 1) {
                                            if (var31 == 2) {
                                                int var35 = class165.field2918[var30 - 1].field1462 * var17 / 4;
                                                int var36 = class165.field2918[var30 + -1].field1461 * var25 / 4;
                                                int var37 = class165.field2918[var30 + -1].field1460 * var25 / 4;
                                                class165.field2918[var30 + -1].method202(var19, -var37 + var26, var35, var36);
                                            } else if (var31 == 3) {
                                                int var38 = class139.field2491[var30 + -1].field1462 * var17 / 4;
                                                int var39 = class139.field2491[var30 + -1].field1461 * var25 / 4;
                                                int var40 = class139.field2491[var30 - 1].field1460 * var25 / 4;
                                                class139.field2491[var30 + -1].method202(var19, -var40 + var26, var38, var39);
                                            }
                                        } else {
                                            int var41 = class67.field1153[var30 + -1].field1462 * var17 / 4;
                                            int var42 = class67.field1153[var30 + -1].field1461 * var25 / 4;
                                            int var43 = class67.field1153[var30 + -1].field1460 * var25 / 4;
                                            class67.field1153[var30 - 1].method202(var19, -var43 + var26, var41, var42);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            method1327(126, (byte) 30, -110, -28, -113, -33);
        }
        ++field3288;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(arg0, -2880, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class1.field11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var7[var11];
                var10[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = 35 / ((arg0 - 62) / 54);
        ++field3294;
        int[] var4 = super.field3044.method904((byte) 84, arg1);
        if (super.field3044.field2150) {
            int[] var5 = this.method1255(0, arg1, 128);
            for (int var6 = 0; var6 < class1.field11; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIILnb;JZ)V")
    public static final void method1329(int arg0, int arg1, int arg2, int arg3, class108 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class5 var8 = new class5();
            var8.field104 = arg4;
            var8.field106 = arg1 * 128 + 64;
            var8.field108 = arg2 * 128 + 64;
            var8.field103 = arg3;
            var8.field111 = arg5;
            if (class259.field4487[arg0][arg1][arg2] == null) {
                class259.field4487[arg0][arg1][arg2] = new class187(arg0, arg1, arg2);
            }
            class259.field4487[arg0][arg1][arg2].field3279 = var8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3298;
        int var6 = (arg2 - 32) * arg2 / arg0;
        class226.field3847[0].method197(arg3, arg4);
        class226.field3847[1].method197(arg3, arg2 + arg4 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 + -32 + -var6) * arg1 / (-arg2 + arg0);
        if (arg5) {
            method1326(-112);
        }
        class84.method598(arg3, arg4 + 16, 16, arg2 + -32, class65.field1111);
        class84.method598(arg3, arg4 + var7 + 16, 16, var6, class83.field1401);
        class84.method613(arg3, arg4 - -16 + var7, var6, class3.field58);
        class84.method613(arg3 + 1, var7 + 16 + arg4, var6, class3.field58);
        class84.method595(arg3, arg4 + 16 + var7, 16, class3.field58);
        class84.method595(arg3, arg4 - -17 - -var7, 16, class3.field58);
        class84.method613(arg3 - -15, arg4 + var7 + 16, var6, class4.field83);
        class84.method613(arg3 + 14, arg4 - -17 + var7, var6 - 1, class4.field83);
        class84.method595(arg3, arg4 + 15 + var7 - -var6, 16, class4.field83);
        class84.method595(arg3 + 1, arg4 - (-var7 + -14) + var6, 15, class4.field83);
    }
}
