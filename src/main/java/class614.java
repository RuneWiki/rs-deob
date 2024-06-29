import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class614 extends class573 {

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    private int field8929 = 6;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "Lhga;")
    public static class158 field8925 = new class158();

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "Lqfa;")
    public static class85 field8930 = new class85(32, -1);

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "Ljs;")
    public static class304 field8933;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(III)V")
    public static final void method3524(int arg0, int arg1, int arg2) {
        ++field8928;
        class19 var3 = class373.method2355(108, arg2, 7);
        var3.method432(64);
        if (arg0 != -605) {
            method3524(-17, 74, -105);
        }
        var3.field829 = arg1;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field8932;
        int[] var3 = super.field8321.method3164(arg0, -111);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field8321.field7825) {
                int[] var4 = this.method3292(0, arg1 + -1, arg0);
                int[] var5 = this.method3292(1, 0, arg0);
                int var6 = this.field8929;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (~var6 != -12) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~var7 > ~class540.field7555; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; var10 < class540.field7555; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = var12 > var11 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class540.field7555 < ~var13; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class540.field7555; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class540.field7555; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class540.field7555 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class540.field7555; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class540.field7555 < ~var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; class540.field7555 > var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class540.field7555; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class540.field7555 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class540.field7555; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V")
    public class614() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
    public static final void method3525(int[] arg0, int arg1, Object[] arg2) {
        if (arg1 == -12759) {
            class370.method2343((byte) 106, arg0, arg2, arg0.length + -1, 0);
            ++field8926;
        }
    }

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)V")
    public static void method3526(int arg0) {
        field8930 = null;
        if (arg0 != 4096) {
            field8933 = null;
        }
        field8925 = null;
        field8933 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field8929 = 60;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field8334 = arg0.method732(-559537960) == 1;
            }
        } else {
            this.field8929 = arg0.method732(arg2 + -559537963);
        }
        ++field8927;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        if (arg0 > -116) {
            field8933 = null;
        }
        ++field8931;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, -28, arg1);
            int[][] var5 = this.method3293(1, -31, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field8929;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class540.field7555; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var18 - -var22 - (var18 * var22 >> 11);
                                                                var7[var16] = var17 + var19 + -(var17 * var19 >> 11);
                                                                var8[var16] = var20 + var21 + -(var20 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class540.field7555 < ~var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var27 >= var24 ? var27 - var24 : -var27 + var24;
                                                            var7[var23] = ~var26 < ~var28 ? -var28 + var26 : var28 - var26;
                                                            var8[var23] = var25 > var29 ? -var29 + var25 : -var25 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class540.field7555; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var32 > ~var31 ? var31 : var32;
                                                        var7[var30] = var36 >= var33 ? var36 : var33;
                                                        var8[var30] = var35 > var34 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class540.field7555; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = ~var43 >= ~var41 ? var43 : var41;
                                                    var7[var37] = ~var38 < ~var39 ? var39 : var38;
                                                    var8[var37] = ~var42 < ~var40 ? var40 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class540.field7555 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var45 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var45 : 0;
                                                var8[var44] = var47 == 0 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class540.field7555 < ~var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class540.field7555 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((4096 - var11[var52]) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class540.field7555; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class540.field7555; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class540.field7555 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class540.field7555 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class540.field7555 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
