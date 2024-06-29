import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class243 extends class436 {

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    private int field3361 = 6;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field3355 = -1;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "[I")
    public static int[] field3364 = new int[250];

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(B)V")
    public static final void method1525(byte arg0) {
        if (arg0 <= -113) {
            class79.field1228 = new class207(class99.field1514, "", class247.field3422, 1003, 0L, 0, 0);
            ++field3362;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field3357;
        int[] var3 = super.field6258.method2688((byte) -111, arg0);
        if (arg1 != 18338) {
            method1526(-45);
        }
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(0, arg1 + -18338, arg0);
            int[] var5 = this.method2729(1, 0, arg0);
            int var6 = this.field3361;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; var7 < class43.field653; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class43.field653; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class43.field653 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class43.field653; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 < ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class43.field653; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class43.field653 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class43.field653 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class43.field653 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class43.field653 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class43.field653; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class43.field653 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class43.field653; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V")
    public static void method1526(int arg0) {
        if (arg0 == -9857) {
            field3364 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 == 34) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    super.field6256 = arg2.method2429(arg0 ^ 34) == 1;
                }
            } else {
                this.field3361 = arg2.method2429(0);
            }
            ++field3360;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class243() {
        super(2, false);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        if (arg0 != -13348) {
            return null;
        } else {
            ++field3363;
            int[][] var3 = super.field6259.method1848((byte) 63, arg1);
            if (super.field6259.field3950) {
                int[][] var4 = this.method2731(arg1, false, 0);
                int[][] var5 = this.method2731(arg1, false, 1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field3361;
                if (~var15 != -2) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (~var15 != -7) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (~var15 != -12) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; class43.field653 > var16; ++var16) {
                                                                    int var17 = var9[var16];
                                                                    int var18 = var11[var16];
                                                                    int var19 = var13[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var10[var16];
                                                                    int var22 = var12[var16];
                                                                    var6[var16] = var17 - (-var22 - -(var17 * var22 >> 11));
                                                                    var7[var16] = var21 - (var19 * var21 >> 11) + var19;
                                                                    var8[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class43.field653 > var23; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var10[var23];
                                                                int var26 = var9[var23];
                                                                int var27 = var14[var23];
                                                                int var28 = var13[var23];
                                                                int var29 = var11[var23];
                                                                var6[var23] = ~var24 <= ~var26 ? -var26 + var24 : var26 - var24;
                                                                var7[var23] = var28 >= var25 ? var28 - var25 : var25 - var28;
                                                                var8[var23] = var29 <= var27 ? -var29 + var27 : -var27 + var29;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class43.field653; ++var30) {
                                                            int var31 = var11[var30];
                                                            int var32 = var14[var30];
                                                            int var33 = var9[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var12[var30];
                                                            int var36 = var13[var30];
                                                            var6[var30] = var35 >= var33 ? var35 : var33;
                                                            var7[var30] = ~var34 >= ~var36 ? var36 : var34;
                                                            var8[var30] = var32 < var31 ? var31 : var32;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; var37 < class43.field653; ++var37) {
                                                        int var38 = var9[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var12[var37];
                                                        int var41 = var13[var37];
                                                        int var42 = var11[var37];
                                                        int var43 = var10[var37];
                                                        var6[var37] = var40 > var38 ? var38 : var40;
                                                        var7[var37] = var41 <= var43 ? var41 : var43;
                                                        var8[var37] = ~var42 <= ~var39 ? var39 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class43.field653; ++var44) {
                                                    int var45 = var10[var44];
                                                    int var46 = var11[var44];
                                                    int var47 = var9[var44];
                                                    var6[var44] = ~var47 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                    var7[var44] = var45 != 0 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                    var8[var44] = var46 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~var48 > ~class43.field653; ++var48) {
                                                int var49 = var11[var48];
                                                int var50 = var10[var48];
                                                int var51 = var9[var48];
                                                var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (4096 - var51) : 4096;
                                                var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                                var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~var52 > ~class43.field653; ++var52) {
                                            int var53 = var12[var52];
                                            int var54 = var14[var52];
                                            int var55 = var13[var52];
                                            var6[var52] = ~var53 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var53 + 4096) >> 11) : var9[var52] * var53 >> 11;
                                            var7[var52] = ~var55 <= -2049 ? -((4096 - var55) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                            var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; ~var56 > ~class43.field653; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class43.field653; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var13[var57];
                                    int var60 = var14[var57];
                                    var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                    var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                    var8[var57] = ~var60 == -1 ? 4096 : (var11[var57] << 12) / var60;
                                }
                            }
                        } else {
                            for (int var61 = 0; var61 < class43.field653; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class43.field653 < ~var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] - var13[var62];
                            var8[var62] = var11[var62] - var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class43.field653; ++var63) {
                        var6[var63] = var9[var63] - -var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }
}
