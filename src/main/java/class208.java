import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class208 extends class99 {

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    private int field3604 = 6;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field3599 = 10;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Z")
    public static boolean field3601 = true;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field3602 = 0;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "[I")
    public static int[] field3611 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "Lqc;")
    public static class245 field3605 = new class245(64);

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)V")
    public static final void method1351(byte arg0, int arg1, int arg2) {
        ++field3608;
        if (arg0 != 106) {
            field3599 = -11;
        }
        if (class164.field2936 != 0 && ~arg2 != 0) {
            class233.method1525(arg2, class28.field418, false, 0, class164.field2936, false);
            class252.field4431 = true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public static final void method1352(byte arg0) {
        class84.field1628.method1613((byte) 94);
        if (arg0 == -115) {
            ++field3603;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3606;
        if (arg0 != -61) {
            return null;
        } else {
            int[] var3 = super.field1943.method749(false, arg1);
            if (super.field1943.field2147) {
                int[] var4 = this.method682(0, arg1, 29149);
                int[] var5 = this.method682(1, arg1, 29149);
                int var6 = this.field3604;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~class199.field3432 < ~var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 - -var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~var10 > ~class199.field3432; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var11 <= var12 ? var12 - var11 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class199.field3432; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class199.field3432 < ~var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var17 > ~var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class199.field3432 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class199.field3432 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class199.field3432 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class199.field3432 < ~var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class199.field3432; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; class199.field3432 > var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class199.field3432; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class199.field3432; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(III)V")
    public static final void method1353(int arg0, int arg1, int arg2) {
        ++field3600;
        class197 var3 = class135.method933(arg2, 1, (byte) -127);
        var3.method1284(0);
        if (arg1 < 89) {
            method1351((byte) -107, -116, -64);
        }
        var3.field3405 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method1354(boolean arg0) {
        field3611 = null;
        field3605 = null;
        if (!arg0) {
            method1353(99, -56, -68);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class208() {
        super(2, false);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(III)Lhd;")
    public static final class90 method1355(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        return var3 != null && var3.field225 != null ? var3.field225 : null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field3610;
        int[][] var3 = super.field1946.method823(arg0, (byte) -102);
        if (super.field1946.field2297) {
            int[][] var4 = this.method683(-125, 0, arg0);
            int[][] var5 = this.method683(-128, 1, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3604;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class199.field3432; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var14[var16];
                                                                var8[var16] = -(var17 * var18 >> 11) + var17 + var18;
                                                                var6[var16] = var19 + var20 - (var19 * var20 >> 11);
                                                                var7[var16] = -(var21 * var22 >> 11) + var22 + var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class199.field3432; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var9[var23];
                                                            var8[var23] = var28 >= var29 ? var28 - var29 : -var28 + var29;
                                                            var6[var23] = var25 > var24 ? -var24 + var25 : var24 - var25;
                                                            var7[var23] = ~var26 > ~var27 ? var27 - var26 : var26 - var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class199.field3432 < ~var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var12[var30];
                                                        var8[var30] = ~var36 <= ~var32 ? var36 : var32;
                                                        var6[var30] = ~var33 > ~var31 ? var31 : var33;
                                                        var7[var30] = ~var34 < ~var35 ? var34 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class199.field3432; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var8[var37] = var41 <= var40 ? var41 : var40;
                                                    var6[var37] = ~var39 < ~var43 ? var43 : var39;
                                                    var7[var37] = var38 < var42 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class199.field3432; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var8[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var45 == 0 ? 0 : -((4096 - var14[var44] << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class199.field3432; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var8[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var6[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var49);
                                            var7[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var51);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class199.field3432; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var8[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((4096 - var9[var52]) * (4096 - var53) >> 11) + 4096;
                                        var6[var52] = var55 >= 2048 ? 4096 - ((4096 - var55) * (-var10[var52] + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var7[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var54 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class199.field3432; ++var56) {
                                    var8[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var6[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var7[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class199.field3432 > var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var8[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var6[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var7[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; class199.field3432 > var61; ++var61) {
                            var8[var61] = var9[var61] * var12[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var7[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class199.field3432 < ~var62; ++var62) {
                        var8[var62] = var9[var62] - var12[var62];
                        var6[var62] = var10[var62] + -var13[var62];
                        var7[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class199.field3432 < ~var63; ++var63) {
                    var8[var63] = var9[var63] - -var12[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var7[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (!arg1) {
            method1354(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field1938 = arg0.method1677(arg2 + -6676) == 1;
            }
        } else {
            this.field3604 = arg0.method1677(arg2 + -6676);
        }
        if (arg2 != -1) {
            field3605 = null;
        }
        ++field3607;
    }
}
