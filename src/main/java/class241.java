import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class241 extends class148 {

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    private int field3564 = 6;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field3562 = 16777215;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "[[B")
    public static byte[][] field3567;

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 3)
    public class241() {
        super(2, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method25(int arg0, int arg1) {
        ++field3568;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            int[] var5 = this.method971(false, arg1, 1);
            int var6 = this.field3564;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class320.field4579 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class320.field4579; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class320.field4579 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class320.field4579 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class320.field4579; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class320.field4579; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class320.field4579; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var24) * (-var4[var23] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class320.field4579 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class320.field4579 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class320.field4579 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class320.field4579 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class320.field4579 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg0 > -65) {
            this.method25(-13, 93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V", line = 259)
    public static void method1626(int arg0) {
        if (arg0 != 257029100) {
            field3562 = -26;
        }
        field3567 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[[I", line = 273)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field3563;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[][] var5 = this.method974(true, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3564;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class320.field4579 > var16; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = -(var20 * var21 >> 11) + var20 + var21;
                                                                var7[var16] = var19 - -var22 - (var19 * var22 >> 11);
                                                                var8[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class320.field4579 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var25 <= var24 ? -var25 + var24 : -var24 + var25;
                                                            var7[var23] = ~var26 > ~var27 ? -var26 + var27 : var26 - var27;
                                                            var8[var23] = var28 > var29 ? -var29 + var28 : var29 - var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class320.field4579; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = ~var34 <= ~var31 ? var34 : var31;
                                                        var7[var30] = ~var33 > ~var35 ? var35 : var33;
                                                        var8[var30] = ~var32 >= ~var36 ? var36 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class320.field4579 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var39 > var41 ? var41 : var39;
                                                    var7[var37] = var40 >= var42 ? var42 : var40;
                                                    var8[var37] = ~var38 > ~var43 ? var38 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class320.field4579 > var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 == -1 ? 0 : 4096 - (4096 - var12[var44] << 12) / var47;
                                                var7[var44] = var45 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var45) + 4096;
                                                var8[var44] = var46 != 0 ? -((4096 - var14[var44] << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class320.field4579 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class320.field4579; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var54 <= -2049 ? -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = var55 >= 2048 ? 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11) : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class320.field4579; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class320.field4579; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class320.field4579 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class320.field4579 < ~var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class320.field4579 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (!arg0) {
            this.method25(69, -13);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILdh;I)V", line = 596)
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field3561;
        int var4 = -78 / ((-88 - arg2) / 33);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field2183 = arg1.method1428(32122) == 1;
            }
        } else {
            this.field3564 = arg1.method1428(32122);
        }
    }
}
