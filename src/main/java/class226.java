import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class226 extends class273 {

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    private int field3602 = 6;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field3596;
        if (arg0 < 122) {
            this.field3602 = 124;
        }
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[][] var5 = this.method1853(1, arg1, (byte) 8);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field3602;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class26.field458; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = -(var17 * var20 >> 11) + var17 + var20;
                                                                var7[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var8[var16] = var18 - (var18 * var21 >> 11) + var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class26.field458 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var28 < var27 ? -var28 + var27 : var28 - var27;
                                                            var7[var23] = var26 < var29 ? var29 - var26 : -var29 + var26;
                                                            var8[var23] = var25 >= var24 ? -var24 + var25 : var24 - var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class26.field458; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var35 > ~var31 ? var31 : var35;
                                                        var7[var30] = var33 >= var34 ? var33 : var34;
                                                        var8[var30] = ~var36 <= ~var32 ? var36 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class26.field458; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = ~var40 < ~var39 ? var39 : var40;
                                                    var7[var37] = var38 >= var42 ? var42 : var38;
                                                    var8[var37] = var41 > var43 ? var43 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class26.field458; ++var44) {
                                                int var45 = var12[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : 4096 - (-var11[var44] + 4096 << 12) / var46;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = ~var45 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class26.field458; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var12[var48];
                                            var6[var48] = var49 != 4096 ? (var11[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class26.field458; ++var52) {
                                        int var53 = var11[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : -((4096 - var53) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = var54 >= 2048 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = var55 < 2048 ? var12[var52] * var55 >> 11 : 4096 - ((-var12[var52] + 4096) * (-var55 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class26.field458 < ~var56; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var9[var56]) * (4096 - var11[var56]) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var12[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class26.field458; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var11[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = ~var60 == -1 ? 4096 : (var12[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class26.field458; ++var61) {
                            var6[var61] = var9[var61] * var11[var61] >> 12;
                            var7[var61] = var10[var61] * var14[var61] >> 12;
                            var8[var61] = var12[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class26.field458 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var11[var62];
                        var7[var62] = var10[var62] - var14[var62];
                        var8[var62] = var12[var62] + -var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class26.field458 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var11[var63];
                    var7[var63] = var10[var63] + var14[var63];
                    var8[var63] = var12[var63] - -var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            field3601 = 0;
        }
        ++field3599;
        int[] var3 = super.field4359.method387((byte) -58, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) -128);
            int[] var5 = this.method1850(arg1, 1, (byte) -125);
            int var6 = this.field3602;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class26.field458; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class26.field458; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 >= var11 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class26.field458; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class26.field458 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 >= var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class26.field458 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class26.field458 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class26.field458; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class26.field458; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class26.field458 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class26.field458; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class26.field458; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class26.field458 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class226() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)Lfl;")
    public static final class80 method1512(byte arg0) {
        ++field3598;
        if (class143.field2362.length > class235.field3725) {
            return class143.field2362[class235.field3725++];
        } else {
            return arg0 < 97 ? null : null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V")
    public static final void method1513(byte arg0) {
        ++field3595;
        class180.field2994.method1157(760);
        client.field4569.method1157(760);
        int var1 = -61 % ((-51 - arg0) / 41);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field4358 = arg0.method1012(4) == 1;
            }
        } else {
            this.field3602 = arg0.method1012(4);
        }
        if (arg2 != 5) {
            this.method2((class136) null, -59, 6);
        }
        ++field3597;
    }
}
