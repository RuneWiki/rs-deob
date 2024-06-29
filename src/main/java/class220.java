import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class220 extends class166 {

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    private int field3960 = 6;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field3959 = -1;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[I")
    public static int[] field3956 = new int[50];

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
    public static int[] field3955;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIII)V")
    public static final void method1558(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class227.field4143 = (short) arg4;
        ++field3961;
        if (arg5 != 222) {
            field3955 = null;
        }
        class256.field4598 = (short) arg0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            method1558(44, 69, true, -1, -119, -73);
        }
        ++field3963;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(123, arg0, 0);
            int[] var5 = this.method1231(127, arg0, 1);
            int var6 = this.field3960;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class253.field4565 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 - -var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class253.field4565 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 < ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class253.field4565; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class253.field4565; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class253.field4565; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class253.field4565; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class253.field4565 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class253.field4565; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class253.field4565; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class253.field4565; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class253.field4565 < ~var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class253.field4565; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field3953;
        int[][] var3 = super.field3064.method320(arg1, (byte) -120);
        if (super.field3064.field979) {
            int[][] var4 = this.method1229(arg1, arg0 ^ 23580, 0);
            int[][] var5 = this.method1229(arg1, 23580, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3960;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class253.field4565 < ~var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var8[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = -(var17 * var22 >> 11) + var22 + var17;
                                                                var9[var16] = -(var18 * var20 >> 11) + var20 + var18;
                                                                var7[var16] = -(var19 * var21 >> 11) + var21 + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class253.field4565; ++var23) {
                                                            int var24 = var8[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var27 > ~var29 ? -var27 + var29 : -var29 + var27;
                                                            var9[var23] = var24 > var26 ? var24 - var26 : -var24 + var26;
                                                            var7[var23] = var25 <= var28 ? -var25 + var28 : var25 - var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class253.field4565 < ~var30; ++var30) {
                                                        int var31 = var8[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var33 < ~var34 ? var33 : var34;
                                                        var9[var30] = var31 <= var36 ? var36 : var31;
                                                        var7[var30] = ~var32 < ~var35 ? var32 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class253.field4565; ++var37) {
                                                    int var38 = var8[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = ~var40 > ~var39 ? var40 : var39;
                                                    var9[var37] = ~var41 >= ~var38 ? var41 : var38;
                                                    var7[var37] = ~var42 <= ~var43 ? var43 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class253.field4565 > var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var8[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var9[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = var46 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var46;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class253.field4565; ++var48) {
                                            int var49 = var8[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (4096 - var51);
                                            var9[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (4096 - var50) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class253.field4565 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var9[var52] = ~var53 <= -2049 ? -((-var8[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var8[var52] * var53 >> 11;
                                        var7[var52] = ~var55 <= -2049 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class253.field4565 > var56; ++var56) {
                                    var6[var56] = -((-var10[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((4096 - var8[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class253.field4565; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var9[var57] = ~var60 == -1 ? 4096 : (var8[var57] << 12) / var60;
                                var7[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class253.field4565; ++var61) {
                            var6[var61] = var10[var61] * var12[var61] >> 12;
                            var9[var61] = var8[var61] * var13[var61] >> 12;
                            var7[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class253.field4565; ++var62) {
                        var6[var62] = var10[var62] + -var12[var62];
                        var9[var62] = var8[var62] + -var13[var62];
                        var7[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class253.field4565; ++var63) {
                    var6[var63] = var10[var63] - -var12[var63];
                    var9[var63] = var8[var63] + var13[var63];
                    var7[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (arg0 != 0) {
            field3959 = 35;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method1559(int arg0) {
        field3955 = null;
        if (arg0 <= 56) {
            field3959 = 13;
        }
        field3956 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3074 = ~arg1.method937(false) == -2;
            }
        } else {
            this.field3960 = arg1.method937(false);
        }
        if (arg0 != 96) {
            this.method18((byte) -53, (class128) null, 79);
        }
        ++field3957;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(II)I")
    public static final int method1560(int arg0, int arg1) {
        ++field3958;
        return arg1 <= 72 ? -96 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(II)I")
    public static final int method1561(int arg0, int arg1) {
        ++field3954;
        if ((~arg1 > -66 || ~arg1 < -91) && (arg1 < 192 || arg1 > 222 || ~arg1 == -216)) {
            if (arg0 != -11124) {
                method1561(-48, 70);
            }
            if (~arg1 == -160) {
                return 255;
            } else {
                return ~arg1 == -141 ? 156 : arg1;
            }
        } else {
            return arg1 + 32;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class220() {
        super(2, false);
    }
}
