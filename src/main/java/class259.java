import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class259 extends class89 {

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    private int field4524 = 6;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field4520 = -1;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "Lhi;")
    public static class24 field4517 = null;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "Lha;")
    public static class46 field4522 = class271.method1828("Fallen lassen", -46);

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field4521 = 0;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "Lha;")
    public static class46 field4518 = class271.method1828(")3", -46);

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "Lpi;")
    public static class181 field4519;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "[I")
    public static int[] field4523;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public static void method1738(int arg0) {
        field4518 = null;
        field4517 = null;
        if (arg0 != -28073) {
            field4522 = null;
        }
        field4519 = null;
        field4522 = null;
        field4523 = null;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static final void method1739(int arg0) {
        if (arg0 != 14597) {
            field4518 = null;
        }
        ++class227.field3988;
        class58.field967.method285((byte) -90, 119);
        class58.field967.method546((byte) 107, class265.field4607);
        ++field4525;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        ++field4526;
        if (arg1 != 25) {
            return null;
        } else {
            if (super.field1695.field2028) {
                int[][] var4 = this.method689((byte) 95, 0, arg0);
                int[][] var5 = this.method689((byte) 95, 1, arg0);
                int[] var6 = var3[1];
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var4[1];
                int[] var10 = var4[0];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field4524;
                if (var15 != 1) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (var15 != 8) {
                                                if (~var15 != -10) {
                                                    if (var15 != 10) {
                                                        if (~var15 != -12) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; ~var16 > ~class241.field4284; ++var16) {
                                                                    int var17 = var14[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var10[var16];
                                                                    int var20 = var9[var16];
                                                                    int var21 = var13[var16];
                                                                    int var22 = var11[var16];
                                                                    var7[var16] = -(var18 * var19 >> 11) + var19 + var18;
                                                                    var6[var16] = var20 - -var21 - (var20 * var21 >> 11);
                                                                    var8[var16] = -(var17 * var22 >> 11) + var17 + var22;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class241.field4284 > var23; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var14[var23];
                                                                int var26 = var11[var23];
                                                                int var27 = var10[var23];
                                                                int var28 = var9[var23];
                                                                int var29 = var13[var23];
                                                                var7[var23] = ~var27 < ~var24 ? -var24 + var27 : -var27 + var24;
                                                                var6[var23] = var29 < var28 ? -var29 + var28 : -var28 + var29;
                                                                var8[var23] = ~var26 < ~var25 ? -var25 + var26 : -var26 + var25;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; var30 < class241.field4284; ++var30) {
                                                            int var31 = var9[var30];
                                                            int var32 = var14[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var12[var30];
                                                            int var36 = var13[var30];
                                                            var7[var30] = var34 > var35 ? var34 : var35;
                                                            var6[var30] = var31 > var36 ? var31 : var36;
                                                            var8[var30] = ~var32 > ~var33 ? var33 : var32;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~class241.field4284 < ~var37; ++var37) {
                                                        int var38 = var10[var37];
                                                        int var39 = var11[var37];
                                                        int var40 = var12[var37];
                                                        int var41 = var9[var37];
                                                        int var42 = var14[var37];
                                                        int var43 = var13[var37];
                                                        var7[var37] = ~var40 < ~var38 ? var38 : var40;
                                                        var6[var37] = ~var41 > ~var43 ? var41 : var43;
                                                        var8[var37] = ~var42 >= ~var39 ? var42 : var39;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~class241.field4284 < ~var44; ++var44) {
                                                    int var45 = var9[var44];
                                                    int var46 = var11[var44];
                                                    int var47 = var10[var44];
                                                    var7[var44] = ~var47 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                    var6[var44] = var45 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var45 : 0;
                                                    var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class241.field4284; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var11[var48];
                                                int var51 = var10[var48];
                                                var7[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                                var6[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                                var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (4096 - var50) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class241.field4284; ++var52) {
                                            int var53 = var12[var52];
                                            int var54 = var13[var52];
                                            int var55 = var14[var52];
                                            var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                            var6[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                            var8[var52] = ~var55 <= -2049 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class241.field4284; ++var56) {
                                        var7[var56] = 4096 - ((4096 - var10[var56]) * (4096 - var12[var56]) >> 12);
                                        var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                        var8[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class241.field4284 > var57; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var14[var57];
                                    int var60 = var13[var57];
                                    var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                    var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                    var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                                }
                            }
                        } else {
                            for (int var61 = 0; class241.field4284 > var61; ++var61) {
                                var7[var61] = var10[var61] * var12[var61] >> 12;
                                var6[var61] = var9[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class241.field4284 < ~var62; ++var62) {
                            var7[var62] = var10[var62] + -var12[var62];
                            var6[var62] = var9[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; class241.field4284 > var63; ++var63) {
                        var7[var63] = var10[var63] + var12[var63];
                        var6[var63] = var9[var63] - -var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = -120 / ((arg1 - 51) / 44);
        ++field4516;
        if (super.field1688.field2200) {
            int[] var5 = this.method685(-111, arg0, 0);
            int[] var6 = this.method685(98, arg0, 1);
            int var7 = this.field4524;
            if (~var7 != -2) {
                if (var7 != 2) {
                    if (var7 != 3) {
                        if (var7 != 4) {
                            if (~var7 != -6) {
                                if (var7 != 6) {
                                    if (var7 != 7) {
                                        if (~var7 != -9) {
                                            if (~var7 != -10) {
                                                if (var7 != 10) {
                                                    if (var7 != 11) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; ~var8 > ~class241.field4284; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var3[var8] = var9 + var10 + -(var9 * var10 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class241.field4284 > var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var3[var11] = ~var12 >= ~var13 ? -var12 + var13 : -var13 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; var14 < class241.field4284; ++var14) {
                                                        int var15 = var5[var14];
                                                        int var16 = var6[var14];
                                                        var3[var14] = var15 > var16 ? var15 : var16;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~class241.field4284 < ~var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var3[var17] = var18 < var19 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; ~class241.field4284 < ~var20; ++var20) {
                                                int var21 = var5[var20];
                                                var3[var20] = ~var21 == -1 ? 0 : -((4096 - var6[var20] << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; class241.field4284 > var22; ++var22) {
                                            int var23 = var5[var22];
                                            var3[var22] = ~var23 == -4097 ? 4096 : (var6[var22] << 12) / (-var23 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; ~var24 > ~class241.field4284; ++var24) {
                                        int var25 = var6[var24];
                                        var3[var24] = var25 < 2048 ? var5[var24] * var25 >> 11 : -((4096 - var25) * (-var5[var24] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; class241.field4284 > var26; ++var26) {
                                    var3[var26] = -((4096 - var6[var26]) * (-var5[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; var27 < class241.field4284; ++var27) {
                                int var28 = var6[var27];
                                var3[var27] = ~var28 == -1 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class241.field4284; ++var29) {
                            var3[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class241.field4284; ++var30) {
                        var3[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; class241.field4284 > var31; ++var31) {
                    var3[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1683 = ~arg0.method558(1) == -2;
            }
        } else {
            this.field4524 = arg0.method558(1);
        }
        if (arg1 != -641641492) {
            field4522 = null;
        }
        ++field4515;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class259() {
        super(2, false);
    }
}
