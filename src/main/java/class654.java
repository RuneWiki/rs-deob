import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class654 extends class440 {

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field9177 = 6;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lkea;")
    public static class213 field9178 = new class213(8);

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field9181 = -1;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lnea;")
    public static class664 field9180 = new class664(102, 7);

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 3)
    public static void method3608(byte arg0) {
        if (arg0 >= -9) {
            field9180 = null;
        }
        field9180 = null;
        field9178 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 14)
    public class654() {
        super(2, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILmo;I)V", line = 18)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field9175;
        if (arg0 != 5) {
            field9178 = null;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field6424 = arg1.method3826(false) == 1;
            }
        } else {
            this.field9177 = arg1.method3826(false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I", line = 54)
    public final int[][] method763(int arg0, int arg1) {
        if (arg0 != -5766) {
            method3609(40, -15);
        }
        ++field9176;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int[][] var4 = this.method2606(arg1, 0, arg0 ^ 5765);
            int[][] var5 = this.method2606(arg1, 1, -1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field9177;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class549.field7715 < ~var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                                var7[var16] = var18 + var21 - (var18 * var21 >> 11);
                                                                var8[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class549.field7715 < ~var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var28 >= ~var26 ? -var28 + var26 : -var26 + var28;
                                                            var7[var23] = var29 <= var25 ? -var29 + var25 : var29 - var25;
                                                            var8[var23] = var24 <= var27 ? -var24 + var27 : -var27 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class549.field7715; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var35 >= ~var34 ? var34 : var35;
                                                        var7[var30] = var33 > var31 ? var33 : var31;
                                                        var8[var30] = ~var32 <= ~var36 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class549.field7715 > var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = ~var41 < ~var38 ? var38 : var41;
                                                    var7[var37] = ~var43 < ~var40 ? var40 : var43;
                                                    var8[var37] = ~var39 <= ~var42 ? var42 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class549.field7715 < ~var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var46 != -1 ? 4096 - (4096 - var12[var44] << 12) / var46 : 0;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var45 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var45;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class549.field7715; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class549.field7715 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var53 >= 2048 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class549.field7715; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class549.field7715; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class549.field7715; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class549.field7715 > var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class549.field7715; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[I", line = 368)
    public final int[] method229(byte arg0, int arg1) {
        ++field9179;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = -11 / ((-56 - arg0) / 41);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(-109, arg1, 0);
            int[] var6 = this.method2611(108, arg1, 1);
            int var7 = this.field9177;
            if (var7 != 1) {
                if (var7 != 2) {
                    if (var7 != 3) {
                        if (var7 != 4) {
                            if (~var7 != -6) {
                                if (var7 != 6) {
                                    if (~var7 != -8) {
                                        if (var7 != 8) {
                                            if (~var7 != -10) {
                                                if (var7 != 10) {
                                                    if (var7 != 11) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; var8 < class549.field7715; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var3[var8] = -(var9 * var10 >> 11) + var10 - -var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; var11 < class549.field7715; ++var11) {
                                                            int var12 = var6[var11];
                                                            int var13 = var5[var11];
                                                            var3[var11] = ~var13 < ~var12 ? var13 - var12 : -var13 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; var14 < class549.field7715; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var3[var14] = ~var15 > ~var16 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; class549.field7715 > var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var3[var17] = var19 > var18 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; class549.field7715 > var20; ++var20) {
                                                int var21 = var5[var20];
                                                var3[var20] = ~var21 != -1 ? -((-var6[var20] + 4096 << 12) / var21) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; var22 < class549.field7715; ++var22) {
                                            int var23 = var5[var22];
                                            var3[var22] = ~var23 != -4097 ? (var6[var22] << 12) / (-var23 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; ~var24 > ~class549.field7715; ++var24) {
                                        int var25 = var6[var24];
                                        var3[var24] = var25 < 2048 ? var5[var24] * var25 >> 11 : -((-var5[var24] + 4096) * (-var25 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class549.field7715; ++var26) {
                                    var3[var26] = -((-var5[var26] + 4096) * (-var6[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; ~var27 > ~class549.field7715; ++var27) {
                                int var28 = var6[var27];
                                var3[var27] = var28 != 0 ? (var5[var27] << 12) / var28 : 4096;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class549.field7715; ++var29) {
                            var3[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~class549.field7715 < ~var30; ++var30) {
                        var3[var30] = var5[var30] - var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class549.field7715; ++var31) {
                    var3[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V", line = 619)
    public static final void method3609(int arg0, int arg1) {
        class319.field4698 = -1;
        class9.field89 = -1;
        class199.field2808 = arg1;
        if (arg0 > -15) {
            field9180 = null;
        }
        ++field9174;
        class167.method1159((byte) -33);
    }
}
