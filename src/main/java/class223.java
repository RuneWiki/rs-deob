import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class223 extends class270 {

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    private int field3314 = 6;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "Z")
    public static boolean field3313 = false;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "Z")
    public static boolean field3316;

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 10)
    public class223() {
        super(2, false);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)[[I", line = 13)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field3317;
        if (!arg0) {
            this.method78((byte) -64, (class37) null, -43);
        }
        int[][] var3 = super.field4046.method244(arg1, 122);
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[][] var5 = this.method1930(arg1, 1, (byte) -75);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3314;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class161.field2445 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = -(var21 * var22 >> 11) + var21 + var22;
                                                                var7[var16] = -(var17 * var18 >> 11) + var18 + var17;
                                                                var8[var16] = -(var19 * var20 >> 11) + var20 - -var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class161.field2445 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = var29 >= var27 ? -var27 + var29 : -var29 + var27;
                                                            var7[var23] = var26 <= var24 ? -var26 + var24 : -var24 + var26;
                                                            var8[var23] = var25 > var28 ? -var28 + var25 : var28 - var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class161.field2445 > var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var34 > ~var31 ? var31 : var34;
                                                        var7[var30] = ~var32 >= ~var36 ? var36 : var32;
                                                        var8[var30] = ~var33 < ~var35 ? var33 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class161.field2445 > var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = var39 >= var43 ? var43 : var39;
                                                    var7[var37] = ~var38 >= ~var41 ? var38 : var41;
                                                    var8[var37] = var40 <= var42 ? var40 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class161.field2445; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var46 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class161.field2445 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (4096 - var49) : 4096;
                                            var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (4096 - var51) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class161.field2445; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((4096 - var9[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 >= 2048 ? 4096 - ((-var10[var52] + 4096) * (-var53 + 4096) >> 11) : var10[var52] * var53 >> 11;
                                        var8[var52] = var55 >= 2048 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class161.field2445 > var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class161.field2445; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class161.field2445 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class161.field2445 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class161.field2445 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)[I", line = 325)
    public final int[] method81(byte arg0, int arg1) {
        ++field3315;
        if (arg0 <= 26) {
            field3313 = true;
        }
        int[] var3 = super.field4053.method396(arg1, 123);
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, arg1);
            int[] var5 = this.method1927(0, 1, arg1);
            int var6 = this.field3314;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class161.field2445 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - -var8 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class161.field2445 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class161.field2445 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class161.field2445; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class161.field2445; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class161.field2445; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class161.field2445; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class161.field2445 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class161.field2445 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class161.field2445 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class161.field2445 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class161.field2445; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLec;I)V", line = 577)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field3311;
        if (arg0 != 108) {
            field3312 = -75;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field4055 = arg1.method271((byte) 103) == 1;
            }
        } else {
            this.field3314 = arg1.method271((byte) 123);
        }
    }
}
