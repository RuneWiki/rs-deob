import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class387 extends class264 {

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    private int field5307 = 6;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[I")
    public static int[] field5304 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "[J")
    public static long[] field5305 = new long[100];

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "[Lrn;")
    public static class417[] field5303;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "[Lrn;")
    public static class417[] field5310;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field5309;
        int[] var3 = super.field3808.method958((byte) 64, arg0);
        if (arg1 != 21034) {
            field5306 = 11;
        }
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -63, 0);
            int[] var5 = this.method1788(arg0, (byte) -105, 1);
            int var6 = this.field5307;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class478.field6792; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - (var8 * var9 >> 11) + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class478.field6792 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 < ~var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class478.field6792; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class478.field6792; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class478.field6792; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class478.field6792 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class478.field6792 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class478.field6792 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class478.field6792; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class478.field6792 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class478.field6792 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class478.field6792; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLae;)V")
    public static final void method2351(boolean arg0, class172 arg1) {
        if (arg1.field2602 == 5 && ~arg1.field2483 != 0) {
            class206.method1412((byte) -95, class374.field5152, arg1);
        }
        if (!arg0) {
            method2352((byte) 20);
        }
        ++field5308;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class387() {
        super(2, false);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public static void method2352(byte arg0) {
        field5303 = null;
        if (arg0 < 71) {
            field5310 = null;
        }
        field5304 = null;
        field5310 = null;
        field5305 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3794 = ~arg1.method1172((byte) 30) == -2;
            }
        } else {
            this.field5307 = arg1.method1172((byte) 114);
        }
        if (arg0 <= 31) {
            method2353(-84, 100, 11);
        }
        ++field5311;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public static final void method2353(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field755 != null) {
                var3.field755 = null;
            }
            if (var3.field756 != null) {
                var3.field756 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field5312;
        if (arg0 != 116) {
            method2353(-42, 109, -40);
        }
        int[][] var3 = super.field3816.method1928((byte) 83, arg1);
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 115, 0);
            int[][] var5 = this.method1782(arg1, (byte) 115, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5307;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class478.field6792 < ~var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = var19 - -var18 + -(var18 * var19 >> 11);
                                                                var7[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                var8[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class478.field6792 > var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var24 > ~var27 ? var27 - var24 : -var27 + var24;
                                                            var7[var23] = var28 < var25 ? -var28 + var25 : -var25 + var28;
                                                            var8[var23] = var29 < var26 ? -var29 + var26 : var29 - var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class478.field6792 < ~var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = var31 <= var35 ? var35 : var31;
                                                        var7[var30] = ~var34 >= ~var36 ? var36 : var34;
                                                        var8[var30] = ~var33 < ~var32 ? var33 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class478.field6792; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var39 <= var43 ? var39 : var43;
                                                    var7[var37] = ~var40 < ~var41 ? var41 : var40;
                                                    var8[var37] = var42 >= var38 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class478.field6792; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = var46 == 0 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var46;
                                                var8[var44] = var45 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var45;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class478.field6792 < ~var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class478.field6792 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var55 + 4096) >> 11) : var9[var52] * var55 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var11[var52] + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class478.field6792; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class478.field6792 > var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class478.field6792 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class478.field6792; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class478.field6792; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
