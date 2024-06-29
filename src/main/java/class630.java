import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class630 extends class297 {

    @OriginalMember(owner = "client!pda", name = "M", descriptor = "I")
    private int field8671 = 6;

    @OriginalMember(owner = "client!pda", name = "P", descriptor = "Z")
    public static volatile boolean field8674 = true;

    @OriginalMember(owner = "client!pda", name = "Q", descriptor = "[I")
    public static int[] field8675 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "Lmu;")
    public static class303 field8670 = new class303(28, -2);

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!pda", name = "N", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!pda", name = "O", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!pda", name = "R", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            this.field8671 = -83;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4178 = ~arg0.method1535(255) == -2;
            }
        } else {
            this.field8671 = arg0.method1535(255);
        }
        ++field8672;
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            method3601(-88);
        }
        ++field8668;
        int[][] var3 = super.field4166.method2180(arg1 ^ 1564598951, arg0);
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) -51, arg0, 0);
            int[][] var5 = this.method1948((byte) -66, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field8671;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class525.field7275; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                var7[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                var8[var16] = var18 + var19 - (var18 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class525.field7275 > var23; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var27 > ~var28 ? -var27 + var28 : var27 - var28;
                                                            var7[var23] = ~var25 >= ~var29 ? -var25 + var29 : -var29 + var25;
                                                            var8[var23] = var26 <= var24 ? var24 - var26 : -var24 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class525.field7275; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var34 < var36 ? var36 : var34;
                                                        var7[var30] = ~var33 <= ~var31 ? var33 : var31;
                                                        var8[var30] = ~var32 >= ~var35 ? var35 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class525.field7275; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var43 > ~var41 ? var43 : var41;
                                                    var7[var37] = ~var38 > ~var39 ? var38 : var39;
                                                    var8[var37] = var40 > var42 ? var42 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class525.field7275; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var45 != 0 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = ~var47 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class525.field7275 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var50 != -4097 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var49);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class525.field7275 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((4096 - var9[var52]) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class525.field7275 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class525.field7275; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var58 != -1 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class525.field7275; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class525.field7275; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class525.field7275; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(Z)V")
    public static void method3599(boolean arg0) {
        field8675 = null;
        field8670 = null;
        if (arg0) {
            method3601(-42);
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
    public class630() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method18(50, -18);
        }
        ++field8669;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            int[] var5 = this.method1951(arg0, 633706337, 1);
            int var6 = this.field8671;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class525.field7275 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - -var8 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class525.field7275; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 >= ~var11 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class525.field7275 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class525.field7275; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class525.field7275; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class525.field7275; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class525.field7275; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class525.field7275 > var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class525.field7275; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class525.field7275; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class525.field7275; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class525.field7275; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)V")
    public static final void method3600(int arg0) {
        ++field8673;
        if (class440.field6259 != class436.field6234) {
            if (arg0 == 9) {
                try {
                    class43.method542((byte) 125, class334.field4684, "tbrefresh");
                } catch (Throwable var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)V")
    public static final void method3601(int arg0) {
        class295.field4138 = -1;
        class136.field2279 = -1;
        class511.field7109 = -1;
        ++field8667;
        class318.field4392 = 0;
        int var1 = -95 % ((arg0 - -46) / 52);
    }
}
