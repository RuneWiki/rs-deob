import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class231 extends class38 {

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    private int field3383 = 6;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public static final void method1546(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= -90) {
            ++field3380;
            class150 var4 = class676.method3885(1000, 11, arg2);
            var4.method1116(124);
            var4.field2346 = arg0;
            var4.field2342 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 <= 34) {
            method1546(-121, -123, -116, -115);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field388 = arg2.method3745(-6314) == 1;
            }
        } else {
            this.field3383 = arg2.method3745(-6314);
        }
        ++field3382;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        if (arg0 != -18210) {
            this.field3383 = 86;
        }
        ++field3381;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, arg1);
            int[][] var5 = this.method195(true, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3383;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class729.field10216 > var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var22 - -var17 + -(var17 * var22 >> 11);
                                                                var7[var16] = var21 - (var19 * var21 >> 11) + var19;
                                                                var8[var16] = var20 - (var18 * var20 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class729.field10216 > var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var24 < var28 ? -var24 + var28 : var24 - var28;
                                                            var7[var23] = ~var25 > ~var27 ? -var25 + var27 : -var27 + var25;
                                                            var8[var23] = ~var29 <= ~var26 ? var29 - var26 : -var29 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class729.field10216 < ~var30; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var33 >= ~var32 ? var32 : var33;
                                                        var7[var30] = var35 <= var31 ? var31 : var35;
                                                        var8[var30] = ~var36 >= ~var34 ? var34 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class729.field10216 < ~var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var43 < var40 ? var43 : var40;
                                                    var7[var37] = var38 >= var42 ? var42 : var38;
                                                    var8[var37] = ~var41 >= ~var39 ? var41 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class729.field10216; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 != -1 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = var46 != 0 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var8[var44] = var47 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class729.field10216 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class729.field10216 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((4096 - var55) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var8[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var11[var52]) * (-var53 + 4096) >> 11) : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class729.field10216; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class729.field10216; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class729.field10216; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class729.field10216 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class729.field10216 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field3384;
        int[] var3 = super.field397.method1376(arg1, (byte) 121);
        if (arg0 > -43) {
            this.field3383 = -101;
        }
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            int[] var5 = this.method189(arg1, 1, (byte) -92);
            int var6 = this.field3383;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class729.field10216 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class729.field10216; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 > ~var11 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class729.field10216 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class729.field10216 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 <= var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class729.field10216; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class729.field10216; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class729.field10216 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class729.field10216; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; class729.field10216 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class729.field10216 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class729.field10216 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class729.field10216; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class231() {
        super(2, false);
    }
}
