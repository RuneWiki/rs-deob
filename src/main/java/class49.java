import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class49 extends class252 {

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    private int field860 = 6;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "Ljd;")
    public static class85 field864 = class221.method1499("blinken2:", (byte) 115);

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field859 = -1;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Ljd;")
    public static class85 field868 = class221.method1499("T", (byte) 118);

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Ljd;")
    public static class85 field872 = class221.method1499("(U0a )2 in: ", (byte) -69);

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Lhj;")
    public static class69 field869;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "[[[B")
    public static byte[][][] field871;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static void method330(int arg0) {
        field864 = null;
        field872 = null;
        field869 = null;
        field871 = null;
        field868 = null;
        if (arg0 != 4096) {
            method332((byte) -55);
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
    public static final void method331(int arg0) {
        ++field861;
        class52.field903.method1262(17244);
        if (arg0 != 4096) {
            field859 = -82;
        }
        class48.field848.method1262(arg0 + 13148);
        class185.field3185.method1262(17244);
        class171.field2944.method1262(17244);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -123) {
            return null;
        } else {
            ++field867;
            int[][] var3 = super.field4350.method155(arg0, false);
            if (super.field4350.field338) {
                int[][] var4 = this.method1737(0, arg1 + 126, arg0);
                int[][] var5 = this.method1737(1, 3, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field860;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (var15 != 3) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; ~var16 > ~class5.field63; ++var16) {
                                                                    int var17 = var14[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var10[var16];
                                                                    int var20 = var9[var16];
                                                                    int var21 = var13[var16];
                                                                    int var22 = var11[var16];
                                                                    var6[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                    var7[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                    var8[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class5.field63 > var23; ++var23) {
                                                                int var24 = var13[var23];
                                                                int var25 = var9[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var12[var23];
                                                                int var28 = var11[var23];
                                                                int var29 = var10[var23];
                                                                var6[var23] = ~var27 <= ~var25 ? -var25 + var27 : -var27 + var25;
                                                                var7[var23] = var29 <= var24 ? -var29 + var24 : -var24 + var29;
                                                                var8[var23] = var26 >= var28 ? -var28 + var26 : var28 - var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~class5.field63 < ~var30; ++var30) {
                                                            int var31 = var9[var30];
                                                            int var32 = var11[var30];
                                                            int var33 = var12[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var13[var30];
                                                            int var36 = var14[var30];
                                                            var6[var30] = var31 <= var33 ? var33 : var31;
                                                            var7[var30] = var35 >= var34 ? var35 : var34;
                                                            var8[var30] = ~var32 >= ~var36 ? var36 : var32;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class5.field63; ++var37) {
                                                        int var38 = var12[var37];
                                                        int var39 = var11[var37];
                                                        int var40 = var13[var37];
                                                        int var41 = var9[var37];
                                                        int var42 = var14[var37];
                                                        int var43 = var10[var37];
                                                        var6[var37] = var38 <= var41 ? var38 : var41;
                                                        var7[var37] = var43 < var40 ? var43 : var40;
                                                        var8[var37] = ~var42 < ~var39 ? var39 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~class5.field63 < ~var44; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var10[var44];
                                                    int var47 = var9[var44];
                                                    var6[var44] = ~var47 == -1 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var47;
                                                    var7[var44] = var46 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var46 : 0;
                                                    var8[var44] = var45 == 0 ? 0 : 4096 - (4096 - var14[var44] << 12) / var45;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class5.field63; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var10[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                                var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                                var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class5.field63; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var13[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : 4096 - ((-var9[var52] + 4096) * (-var55 + 4096) >> 11);
                                            var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (4096 - var54) >> 11) + 4096;
                                            var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((4096 - var53) * (-var11[var52] + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; class5.field63 > var56; ++var56) {
                                        var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class5.field63; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var14[var57];
                                    int var60 = var13[var57];
                                    var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                    var7[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                    var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~class5.field63 < ~var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class5.field63; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] - var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class5.field63 < ~var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] - -var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static final void method332(byte arg0) {
        ++field863;
        if (class153.field2621 > 0) {
            class171.method1143((byte) -115);
        } else {
            if (arg0 != 30) {
                field871 = null;
            }
            class194.field3310 = class198.field3390;
            class198.field3390 = null;
            class169.method1136(true, 40);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class49() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field866;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field4338 = ~arg0.method1711((byte) -67) == -2;
            }
        } else {
            this.field860 = arg0.method1711((byte) -67);
        }
        if (arg2 != -99) {
            method332((byte) -30);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field865;
        int[] var3 = super.field4356.method868(arg0, (byte) 116);
        if (arg1 != -55) {
            return null;
        } else {
            if (super.field4356.field2258) {
                int[] var4 = this.method1742((byte) 8, 0, arg0);
                int[] var5 = this.method1742((byte) 8, 1, arg0);
                int var6 = this.field860;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; var7 < class5.field63; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~var10 > ~class5.field63; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var12 > ~var11 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class5.field63; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var14 <= var15 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class5.field63 < ~var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var18 >= var17 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class5.field63; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class5.field63 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class5.field63 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class5.field63 < ~var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class5.field63; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; var28 < class5.field63; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class5.field63 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class5.field63 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
    public static final void method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field870;
        for (int var6 = arg5; ~(arg4 + arg5) <= ~var6; ++var6) {
            for (int var11 = arg0; arg0 + arg2 >= var11; ++var11) {
                if (~var11 <= -1 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class264.field4718[arg3][var11][var6] = 127;
                }
            }
        }
        if (arg1 >= 122) {
            for (int var7 = arg5; ~var7 > ~(arg4 + arg5); ++var7) {
                for (int var10 = arg0; arg0 + arg2 > var10; ++var10) {
                    if (~var10 <= -1 && var10 < 104 && var7 >= 0 && ~var7 > -105) {
                        class245.field4193[arg3][var10][var7] = arg3 > 0 ? class245.field4193[arg3 + -1][var10][var7] : 0;
                    }
                }
            }
            if (arg0 > 0 && ~arg0 > -105) {
                for (int var8 = arg5 - -1; var8 < arg4 + arg5; ++var8) {
                    if (~var8 <= -1 && var8 < 104) {
                        class245.field4193[arg3][arg0][var8] = class245.field4193[arg3][arg0 + -1][var8];
                    }
                }
            }
            if (~arg5 < -1 && ~arg5 > -105) {
                for (int var9 = arg0 + 1; ~(arg0 + arg2) < ~var9; ++var9) {
                    if (var9 >= 0 && var9 < 104) {
                        class245.field4193[arg3][var9][arg5] = class245.field4193[arg3][var9][arg5 + -1];
                    }
                }
            }
            if (~arg0 <= -1 && ~arg5 <= -1 && ~arg0 > -105 && ~arg5 > -105) {
                if (~arg3 != -1) {
                    if (~arg0 < -1 && class245.field4193[arg3 + -1][arg0 + -1][arg5] != class245.field4193[arg3][arg0 + -1][arg5]) {
                        class245.field4193[arg3][arg0][arg5] = class245.field4193[arg3][arg0 - 1][arg5];
                        return;
                    }
                    if (~arg5 < -1 && ~class245.field4193[arg3 + -1][arg0][arg5 - 1] != ~class245.field4193[arg3][arg0][arg5 + -1]) {
                        class245.field4193[arg3][arg0][arg5] = class245.field4193[arg3][arg0][arg5 + -1];
                        return;
                    }
                    if (arg0 > 0 && ~arg5 < -1 && class245.field4193[arg3][arg0 + -1][arg5 - 1] != class245.field4193[arg3 - 1][arg0 + -1][arg5 + -1]) {
                        class245.field4193[arg3][arg0][arg5] = class245.field4193[arg3][arg0 + -1][arg5 + -1];
                        return;
                    }
                } else {
                    if (arg0 <= 0 || ~class245.field4193[arg3][arg0 + -1][arg5] == -1) {
                        if (~arg5 < -1 && class245.field4193[arg3][arg0][arg5 - 1] != 0) {
                            class245.field4193[arg3][arg0][arg5] = class245.field4193[arg3][arg0][arg5 + -1];
                            return;
                        }
                        if (arg0 > 0 && ~arg5 < -1 && class245.field4193[arg3][arg0 + -1][arg5 + -1] != 0) {
                            class245.field4193[arg3][arg0][arg5] = class245.field4193[arg3][arg0 + -1][arg5 + -1];
                            return;
                        }
                        return;
                    }
                    class245.field4193[arg3][arg0][arg5] = class245.field4193[arg3][arg0 + -1][arg5];
                }
            }
        }
    }
}
