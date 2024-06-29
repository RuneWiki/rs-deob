import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class52 extends class243 {

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    private int field916 = 1;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    private int field924 = 1;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Lub;")
    public static class227 field919 = class257.method1749("sl_flags", 17263);

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field918 = -1;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "[I")
    public static int[] field921 = new int[32];

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "[I")
    public static int[] field926 = new int[256];

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field4230 = ~arg0.method1471(255) == -2;
                }
            } else {
                this.field924 = arg0.method1471(255);
            }
        } else {
            this.field916 = arg0.method1471(255);
        }
        if (arg1) {
            method306(56, 46, 0, (class105) null, -37);
        }
        ++field922;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = 20 / ((arg0 - -15) / 51);
        ++field920;
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var5 = this.field924 + this.field924 + 1;
            int var6 = this.field916 + this.field916 + 1;
            int[][] var7 = new int[var5][];
            int var8 = 65536 / var6;
            int var9 = 65536 / var5;
            for (int var10 = -this.field924 + arg1; ~var10 >= ~(arg1 - -this.field924); ++var10) {
                int[] var14 = this.method1614(0, class254.field4469 & var10, 97);
                int[] var15 = new int[class212.field3586];
                int var16 = 0;
                for (int var17 = -this.field916; ~this.field916 <= ~var17; ++var17) {
                    var16 += var14[class179.field3062 & var17];
                }
                int var18 = 0;
                while (var18 < class212.field3586) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[class179.field3062 & -this.field916 + var18];
                    ++var18;
                    var16 = var14[class179.field3062 & this.field916 + var18] + var19;
                }
                var7[-arg1 + this.field924 + var10] = var15;
            }
            for (int var11 = 0; var11 < class212.field3586; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var5 > var13; ++var13) {
                    var12 += var7[var13][var11];
                }
                var4[var11] = var9 * var12 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field917;
        if (class122.field2199 == 0 && !class57.field1050) {
            ++class229.field4007;
            int var7 = class75.field1312;
            int var8 = class225.field3838;
            int var9 = class145.field2506;
            int var10 = class205.field3495;
            int var11 = (arg6 - arg4) * (-var7 + var8) / arg0 + var7;
            int var12 = (arg1 - arg5) * (-var10 + var9) / arg2 + var10;
            class92.method538(var11, class91.field1558, var12, (short) 39, class218.field3675, 0L, (byte) -31);
        }
        long var13 = -1L;
        if (arg3 == 28676) {
            for (int var15 = 0; ~var15 > ~class10.field184; ++var15) {
                long var16 = class83.field1463[var15];
                int var18 = (int) var16 & 127;
                int var19 = (16288 & (int) var16) >> 7;
                int var20 = Integer.MAX_VALUE & (int) (var16 >>> 32);
                int var21 = 3 & (int) var16 >> 29;
                if (var13 != var16) {
                    var13 = var16;
                    if (~var21 == -3 && class24.method120(class64.field1171, var18, var19, var16)) {
                        class45 var22 = class220.method1389(var20, (byte) -91);
                        if (var22.field754 != null) {
                            var22 = var22.method242(64);
                        }
                        if (var22 == null) {
                            continue;
                        }
                        if (class122.field2199 != 1) {
                            if (class57.field1050) {
                                if (~(class177.field2983 & 4) == -5) {
                                    ++class235.field4071;
                                    class92.method538(var18, class76.method445((byte) -78, new class227[] { class149.field2608, class204.field3485, var22.field774 }), var19, (short) 12, class88.field1528, var16, (byte) -31);
                                }
                            } else {
                                ++class249.field4318;
                                class227[] var23 = var22.field812;
                                if (class173.field2883) {
                                    var23 = class95.method587((byte) -46, var23);
                                }
                                if (var23 != null) {
                                    for (int var24 = 4; var24 >= 0; --var24) {
                                        if (var23[var24] != null) {
                                            ++class10.field212;
                                            short var25 = 0;
                                            if (~var24 == -1) {
                                                var25 = 26;
                                            }
                                            if (~var24 == -2) {
                                                var25 = 29;
                                            }
                                            if (~var24 == -3) {
                                                var25 = 36;
                                            }
                                            if (~var24 == -4) {
                                                var25 = 1;
                                            }
                                            if (var24 == 4) {
                                                var25 = 1002;
                                            }
                                            class92.method538(var18, class76.method445((byte) 67, new class227[] { class230.field4026, var22.field774 }), var19, var25, var23[var24], var16, (byte) -31);
                                        }
                                    }
                                }
                                class92.method538(var18, class76.method445((byte) -122, new class227[] { class230.field4026, var22.field774 }), var19, (short) 1007, class73.field1286, (long) var22.field743, (byte) -31);
                            }
                        } else {
                            class92.method538(var18, class76.method445((byte) -92, new class227[] { class184.field3130, class204.field3485, var22.field774 }), var19, (short) 15, class40.field651, var16, (byte) -31);
                            ++class228.field3979;
                        }
                    }
                    if (~var21 == -2) {
                        class195 var26 = class220.field3715[var20];
                        if (var26.field3315.field2542 == 1 && ~(127 & var26.field50) == -65 && ~(127 & var26.field99) == -65) {
                            for (int var27 = 0; class71.field1254 > var27; ++var27) {
                                class195 var30 = class220.field3715[class146.field2517[var27]];
                                if (var30 != null && var26 != var30 && var30.field3315.field2542 == 1 && var26.field50 == var30.field50 && var26.field99 == var30.field99) {
                                    class168.method1036(var19, var30.field3315, (byte) 123, class146.field2517[var27], var18);
                                }
                            }
                            for (int var28 = 0; ~var28 > ~class146.field2512; ++var28) {
                                class225 var29 = class27.field446[class15.field278[var28]];
                                if (var29 != null && var26.field50 == var29.field50 && ~var26.field99 == ~var29.field99) {
                                    class257.method1747(var18, var19, class15.field278[var28], (byte) 115, var29);
                                }
                            }
                        }
                        class168.method1036(var19, var26.field3315, (byte) 122, var20, var18);
                    }
                    if (~var21 == -1) {
                        class225 var31 = class27.field446[var20];
                        if (~(var31.field50 & 127) == -65 && ~(var31.field99 & 127) == -65) {
                            for (int var32 = 0; ~class71.field1254 < ~var32; ++var32) {
                                class195 var35 = class220.field3715[class146.field2517[var32]];
                                if (var35 != null && var35.field3315.field2542 == 1 && ~var31.field50 == ~var35.field50 && var31.field99 == var35.field99) {
                                    class168.method1036(var19, var35.field3315, (byte) -95, class146.field2517[var32], var18);
                                }
                            }
                            for (int var33 = 0; class146.field2512 > var33; ++var33) {
                                class225 var34 = class27.field446[class15.field278[var33]];
                                if (var34 != null && var31 != var34 && ~var31.field50 == ~var34.field50 && ~var31.field99 == ~var34.field99) {
                                    class257.method1747(var18, var19, class15.field278[var33], (byte) 49, var34);
                                }
                            }
                        }
                        class257.method1747(var18, var19, var20, (byte) 95, var31);
                    }
                    if (var21 == 3) {
                        class198 var36 = class80.field1389[class64.field1171][var18][var19];
                        if (var36 != null) {
                            for (class67 var37 = (class67) var36.method1270(0); var37 != null; var37 = (class67) var36.method1279(0)) {
                                int var38 = var37.field1205.field3472;
                                class178 var39 = class133.method815(var38, (byte) -70);
                                if (~class122.field2199 == -2) {
                                    ++class198.field3392;
                                    class92.method538(var18, class76.method445((byte) 101, new class227[] { class184.field3130, class188.field3197, var39.field3048 }), var19, (short) 42, class40.field651, (long) var38, (byte) -31);
                                } else if (class57.field1050) {
                                    if (~(1 & class177.field2983) == -2) {
                                        ++class169.field2831;
                                        class92.method538(var18, class76.method445((byte) -97, new class227[] { class149.field2608, class188.field3197, var39.field3048 }), var19, (short) 45, class88.field1528, (long) var38, (byte) -31);
                                    }
                                } else {
                                    ++class34.field576;
                                    class227[] var40 = var39.field3057;
                                    if (class173.field2883) {
                                        var40 = class95.method587((byte) -105, var40);
                                    }
                                    for (int var41 = 4; var41 >= 0; --var41) {
                                        if (var40 != null && var40[var41] != null) {
                                            ++class15.field280;
                                            byte var42 = 0;
                                            if (var41 == 0) {
                                                var42 = 24;
                                            }
                                            if (~var41 == -2) {
                                                var42 = 14;
                                            }
                                            if (var41 == 2) {
                                                var42 = 33;
                                            }
                                            if (~var41 == -4) {
                                                var42 = 4;
                                            }
                                            if (~var41 == -5) {
                                                var42 = 31;
                                            }
                                            class92.method538(var18, class76.method445((byte) -100, new class227[] { class99.field1735, var39.field3048 }), var19, var42, var40[var41], (long) var38, (byte) -31);
                                        } else if (var41 == 2) {
                                            ++class229.field3998;
                                            class92.method538(var18, class76.method445((byte) -86, new class227[] { class99.field1735, var39.field3048 }), var19, (short) 33, class118.field2148, (long) var38, (byte) -31);
                                        }
                                    }
                                    class92.method538(var18, class76.method445((byte) -109, new class227[] { class99.field1735, var39.field3048 }), var19, (short) 1005, class73.field1286, (long) var38, (byte) -31);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        if (arg0 != 230) {
            return null;
        } else {
            ++field923;
            int[][] var3 = super.field4213.method1406(arg1, 0);
            if (super.field4213.field3771) {
                int var4 = this.field924 + 1 + this.field924;
                int var5 = this.field916 + this.field916 - -1;
                int var6 = 65536 / var4;
                int[][][] var7 = new int[var4][][];
                int var8 = 65536 / var5;
                for (int var9 = -this.field924 + arg1; arg1 - -this.field924 >= var9; ++var9) {
                    int var19 = 0;
                    int[][] var20 = this.method1616(-1, class254.field4469 & var9, 0);
                    int var21 = 0;
                    int[] var22 = var20[0];
                    int var23 = 0;
                    int[][] var24 = new int[3][class212.field3586];
                    int[] var25 = var20[2];
                    int[] var26 = var20[1];
                    for (int var27 = -this.field916; this.field916 >= var27; ++var27) {
                        int var37 = var27 & class179.field3062;
                        var23 += var26[var37];
                        var21 += var25[var37];
                        var19 += var22[var37];
                    }
                    int[] var28 = var24[0];
                    int[] var29 = var24[1];
                    int[] var30 = var24[2];
                    int var31 = 0;
                    while (class212.field3586 > var31) {
                        var28[var31] = var8 * var19 >> 16;
                        var29[var31] = var8 * var23 >> 16;
                        var30[var31] = var8 * var21 >> 16;
                        int var32 = -this.field916 + var31 & class179.field3062;
                        int var33 = var23 - var26[var32];
                        ++var31;
                        int var34 = var19 - var22[var32];
                        int var35 = var21 - var25[var32];
                        int var36 = this.field916 + var31 & class179.field3062;
                        var19 = var22[var36] + var34;
                        var23 = var26[var36] + var33;
                        var21 = var25[var36] + var35;
                    }
                    var7[var9 - (-this.field924 + arg1)] = var24;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~var13 > ~class212.field3586; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var7[var17];
                        var16 += var18[2][var13];
                        var14 += var18[1][var13];
                        var15 += var18[0][var13];
                    }
                    var10[var13] = var6 * var15 >> 16;
                    var11[var13] = var6 * var14 >> 16;
                    var12[var13] = var6 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method305(int arg0) {
        if (arg0 != 4) {
            field919 = null;
        }
        field926 = null;
        field919 = null;
        field921 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILta;I)V")
    public static final void method306(int arg0, int arg1, int arg2, class105 arg3, int arg4) {
        if (class11.field219 >= 3) {
            class111.method698(arg1, arg2, 0, arg3.field1859, arg3.field1843);
        } else {
            ((class163) class34.field584).method792(arg1, arg2, arg3.field1977, arg3.field1952, class34.field584.field3590 / 2, class34.field584.field3604 / 2, class29.field476, 256, arg3.field1859, arg3.field1843);
        }
        ++field925;
        if (arg0 != 256) {
            method304(22, 59, -127, 106, -28, -77, 88);
        }
        class79.field1379[arg4] = true;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, false);
    }
}
