import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class214 extends class273 {

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    private int field3864 = 6;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Ljd;")
    public static class86 field3862 = class122.method868("Cache:", true);

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "Z")
    public static boolean field3867 = false;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "Ljd;")
    private static class86 field3870 = class122.method868("glow2:", true);

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "Ljd;")
    public static class86 field3863 = field3870;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Ljd;")
    public static class86 field3868 = field3870;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "Luk;")
    public static class96 field3869 = new class96(200);

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field3872 = 50;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)I")
    public static final int method1515(int arg0, boolean arg1) {
        if (!arg1) {
            return 106;
        } else {
            ++field3860;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1516(boolean arg0) {
        class185.field3284.method1705(16);
        class210.field3792.method994(8);
        class140.field2662.method994(8);
        ++field3861;
        if (arg0) {
            field3870 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
    public static void method1517(boolean arg0) {
        field3862 = null;
        field3863 = null;
        if (arg0) {
            method1517(false);
        }
        field3868 = null;
        field3869 = null;
        field3870 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLfj;IILfj;)I")
    public static final int method1518(boolean arg0, class239 arg1, int arg2, int arg3, class239 arg4) {
        ++field3871;
        if (~arg3 == -2) {
            int var5 = arg1.field1730;
            int var6 = arg4.field1730;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg3 == -3) {
            return arg1.method1646((byte) -19).field4641.method623(arg4.method1646((byte) -19).field4641, arg2 ^ 209);
        } else if (~arg3 == -4) {
            return arg1.field4303.method623(arg4.field4303, -14154);
        } else if (~arg3 == -5) {
            if (arg1.method642((byte) 48)) {
                return arg4.method642((byte) 48) ? 0 : 1;
            } else {
                return !arg4.method642((byte) 48) ? 0 : -1;
            }
        } else if (~arg3 == -6) {
            if (!arg1.method636(0)) {
                return !arg4.method636(arg2 + 14233) ? 0 : -1;
            } else {
                return arg4.method636(0) ? 0 : 1;
            }
        } else {
            if (arg2 != -14233) {
                field3872 = 40;
            }
            if (~arg3 == -7) {
                if (!arg1.method644(4)) {
                    return arg4.method644(4) ? -1 : 0;
                } else {
                    return arg4.method644(4) ? 0 : 1;
                }
            } else if (~arg3 == -8) {
                if (!arg1.method638((byte) 120)) {
                    return arg4.method638((byte) 96) ? -1 : 0;
                } else {
                    return !arg4.method638((byte) 122) ? 1 : 0;
                }
            } else {
                return -arg4.field4307 + arg1.field4307;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class214() {
        super(2, false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field3859;
        if (arg0 != -7420) {
            return null;
        } else {
            int[] var3 = super.field4800.method1224(arg1, 0);
            if (super.field4800.field3160) {
                int[] var4 = this.method1863(-87, 0, arg1);
                int[] var5 = this.method1863(-93, 1, arg1);
                int var6 = this.field3864;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (var6 != 8) {
                                                if (var6 != 9) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; var7 < class176.field3200; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; var10 < class176.field3200; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class176.field3200; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var15 > var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class176.field3200; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; class176.field3200 > var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 == -1 ? 0 : 4096 - (-var5[var19] + 4096 << 12) / var20;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~var21 > ~class176.field3200; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class176.field3200; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class176.field3200 < ~var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class176.field3200; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class176.field3200; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class176.field3200; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class176.field3200 < ~var30; ++var30) {
                        var3[var30] = var4[var30] - -var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg2 > -16) {
            this.method29(-24, (byte) -12);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field4778 = arg1.method1408((byte) -75) == 1;
            }
        } else {
            this.field3864 = arg1.method1408((byte) -97);
        }
        ++field3865;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = -89 / ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -101);
        ++field3866;
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[][] var6 = this.method1859(arg0, 1, 3);
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var6[0];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var5[1];
            int[] var15 = var6[2];
            int var16 = this.field3864;
            if (~var16 != -2) {
                if (var16 != 2) {
                    if (var16 != 3) {
                        if (var16 != 4) {
                            if (var16 != 5) {
                                if (var16 != 6) {
                                    if (var16 != 7) {
                                        if (~var16 != -9) {
                                            if (~var16 != -10) {
                                                if (~var16 != -11) {
                                                    if (var16 != 11) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; class176.field3200 > var17; ++var17) {
                                                                int var18 = var13[var17];
                                                                int var19 = var12[var17];
                                                                int var20 = var11[var17];
                                                                int var21 = var14[var17];
                                                                int var22 = var10[var17];
                                                                int var23 = var15[var17];
                                                                var9[var17] = var20 + var22 + -(var20 * var22 >> 11);
                                                                var7[var17] = var18 + var21 + -(var18 * var21 >> 11);
                                                                var8[var17] = var19 + var23 - (var19 * var23 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; ~var24 > ~class176.field3200; ++var24) {
                                                            int var25 = var11[var24];
                                                            int var26 = var14[var24];
                                                            int var27 = var13[var24];
                                                            int var28 = var10[var24];
                                                            int var29 = var15[var24];
                                                            int var30 = var12[var24];
                                                            var9[var24] = var28 < var25 ? -var28 + var25 : -var25 + var28;
                                                            var7[var24] = var27 < var26 ? var26 - var27 : -var26 + var27;
                                                            var8[var24] = var30 <= var29 ? -var30 + var29 : var30 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; var31 < class176.field3200; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var13[var31];
                                                        int var34 = var15[var31];
                                                        int var35 = var10[var31];
                                                        int var36 = var12[var31];
                                                        int var37 = var14[var31];
                                                        var9[var31] = var35 < var32 ? var32 : var35;
                                                        var7[var31] = var37 > var33 ? var37 : var33;
                                                        var8[var31] = var34 >= var36 ? var34 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~class176.field3200 < ~var38; ++var38) {
                                                    int var39 = var11[var38];
                                                    int var40 = var10[var38];
                                                    int var41 = var13[var38];
                                                    int var42 = var12[var38];
                                                    int var43 = var14[var38];
                                                    int var44 = var15[var38];
                                                    var9[var38] = ~var39 > ~var40 ? var39 : var40;
                                                    var7[var38] = var43 < var41 ? var43 : var41;
                                                    var8[var38] = ~var42 > ~var44 ? var42 : var44;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class176.field3200 > var45; ++var45) {
                                                int var46 = var11[var45];
                                                int var47 = var14[var45];
                                                int var48 = var12[var45];
                                                var9[var45] = var46 != 0 ? 4096 - (4096 - var10[var45] << 12) / var46 : 0;
                                                var7[var45] = var47 != 0 ? -((-var13[var45] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var45] = ~var48 != -1 ? -((-var15[var45] + 4096 << 12) / var48) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~class176.field3200 < ~var49; ++var49) {
                                            int var50 = var14[var49];
                                            int var51 = var11[var49];
                                            int var52 = var12[var49];
                                            var9[var49] = ~var51 == -4097 ? 4096 : (var10[var49] << 12) / (-var51 + 4096);
                                            var7[var49] = ~var50 == -4097 ? 4096 : (var13[var49] << 12) / (-var50 + 4096);
                                            var8[var49] = ~var52 == -4097 ? 4096 : (var15[var49] << 12) / (-var52 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~class176.field3200 < ~var53; ++var53) {
                                        int var54 = var15[var53];
                                        int var55 = var10[var53];
                                        int var56 = var13[var53];
                                        var9[var53] = var55 >= 2048 ? -((4096 - var11[var53]) * (-var55 + 4096) >> 11) + 4096 : var11[var53] * var55 >> 11;
                                        var7[var53] = var56 < 2048 ? var14[var53] * var56 >> 11 : -((4096 - var14[var53]) * (4096 - var56) >> 11) + 4096;
                                        var8[var53] = ~var54 > -2049 ? var12[var53] * var54 >> 11 : 4096 - ((4096 - var54) * (-var12[var53] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var57 = 0; class176.field3200 > var57; ++var57) {
                                    var9[var57] = -((4096 - var10[var57]) * (-var11[var57] + 4096) >> 12) + 4096;
                                    var7[var57] = 4096 - ((-var13[var57] + 4096) * (-var14[var57] + 4096) >> 12);
                                    var8[var57] = -((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; var58 < class176.field3200; ++var58) {
                                int var59 = var13[var58];
                                int var60 = var15[var58];
                                int var61 = var10[var58];
                                var9[var58] = var61 == 0 ? 4096 : (var11[var58] << 12) / var61;
                                var7[var58] = ~var59 != -1 ? (var14[var58] << 12) / var59 : 4096;
                                var8[var58] = var60 == 0 ? 4096 : (var12[var58] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class176.field3200; ++var62) {
                            var9[var62] = var10[var62] * var11[var62] >> 12;
                            var7[var62] = var13[var62] * var14[var62] >> 12;
                            var8[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class176.field3200; ++var63) {
                        var9[var63] = var11[var63] + -var10[var63];
                        var7[var63] = var14[var63] + -var13[var63];
                        var8[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; class176.field3200 > var64; ++var64) {
                    var9[var64] = var10[var64] + var11[var64];
                    var7[var64] = var13[var64] + var14[var64];
                    var8[var64] = var12[var64] + var15[var64];
                }
            }
        }
        return var4;
    }
}
