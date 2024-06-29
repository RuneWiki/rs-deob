import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class338 extends class13 {

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    private int field4643 = 6;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field4647 = -1;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "[I")
    public static int[] field4649 = new int[100];

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "[I")
    public static int[] field4648 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lck;")
    public static class384 field4650;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field4644;
        if (arg1 <= 50) {
            this.field4643 = 29;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field259 = arg0.method172((byte) 52) == 1;
            }
        } else {
            this.field4643 = arg0.method172((byte) 52);
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public static void method2162(int arg0) {
        field4649 = null;
        if (arg0 != 1604079724) {
            field4647 = 39;
        }
        field4648 = null;
        field4650 = null;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static final void method2163(int arg0) {
        ++field4651;
        class278.field3895 = new class150(8);
        class187.field2559 = arg0;
        for (class313 var1 = (class313) class21.field380.method1005(-1); var1 != null; var1 = (class313) class21.field380.method1012((byte) 96)) {
            var1.method2021();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field4646;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int[] var4 = this.method223(0, -11541, arg1);
            int[] var5 = this.method223(1, -11541, arg1);
            int var6 = this.field4643;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class269.field3751 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class269.field3751 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class269.field3751; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class269.field3751; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class269.field3751 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class269.field3751; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class269.field3751; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class269.field3751; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class269.field3751; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class269.field3751 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class269.field3751 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class269.field3751; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (!arg0) {
            method2162(34);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field4645;
        if (arg0 != -27832) {
            method2162(-33);
        }
        int[][] var3 = super.field256.method1930(arg1, (byte) 125);
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, arg1, 0);
            int[][] var5 = this.method227(false, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4643;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class269.field3751 < ~var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var19 + var22 - (var19 * var22 >> 11);
                                                                var7[var16] = var20 - (var17 * var20 >> 11) + var17;
                                                                var8[var16] = var18 + var21 - (var18 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class269.field3751 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = var29 > var24 ? -var24 + var29 : var24 - var29;
                                                            var7[var23] = ~var25 <= ~var28 ? var25 - var28 : var28 - var25;
                                                            var8[var23] = var27 > var26 ? -var26 + var27 : -var27 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class269.field3751 < ~var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var33 < var36 ? var36 : var33;
                                                        var7[var30] = ~var34 <= ~var32 ? var34 : var32;
                                                        var8[var30] = var31 >= var35 ? var31 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class269.field3751 > var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var40 > var39 ? var39 : var40;
                                                    var7[var37] = ~var41 <= ~var38 ? var38 : var41;
                                                    var8[var37] = var42 < var43 ? var42 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class269.field3751; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = var47 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = ~var46 != -1 ? 4096 - (-var14[var44] + 4096 << 12) / var46 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class269.field3751; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class269.field3751; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? -((4096 - var9[var52]) * (4096 - var54) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class269.field3751; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = 4096 - ((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class269.field3751 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var58 != -1 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class269.field3751; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class269.field3751 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class269.field3751 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class338() {
        super(2, false);
    }
}
