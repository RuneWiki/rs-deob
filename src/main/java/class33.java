import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class33 extends class118 {

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    private int field418 = 6;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "[I")
    public static int[] field416;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    super.field1552 = ~arg2.method2343(255) == -2;
                }
            } else {
                this.field418 = arg2.method2343(arg1 ^ 254);
            }
            ++field417;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field415;
        if (arg0) {
            method196((byte) 90);
        }
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(arg1, (byte) -110, 0);
            int[][] var5 = this.method708(arg1, (byte) -115, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field418;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class440.field6474; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var18 * var20 >> 11) + var18 + var20;
                                                                var7[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                                var8[var16] = var19 + var22 - (var19 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class440.field6474; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = ~var28 <= ~var26 ? var28 - var26 : -var28 + var26;
                                                            var7[var23] = var24 > var25 ? -var25 + var24 : -var24 + var25;
                                                            var8[var23] = ~var27 > ~var29 ? -var27 + var29 : -var29 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class440.field6474 > var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var33 <= ~var31 ? var33 : var31;
                                                        var7[var30] = ~var36 <= ~var32 ? var36 : var32;
                                                        var8[var30] = ~var34 > ~var35 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class440.field6474 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var42 >= ~var43 ? var42 : var43;
                                                    var7[var37] = var40 <= var39 ? var40 : var39;
                                                    var8[var37] = var41 > var38 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class440.field6474; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var46 != 0 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = ~var45 == -1 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var45;
                                                var8[var44] = ~var47 != -1 ? -((4096 - var14[var44] << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class440.field6474 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (4096 - var51);
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class440.field6474 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((4096 - var9[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((4096 - var53) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; class440.field6474 > var56; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class440.field6474; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class440.field6474 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class440.field6474; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class440.field6474; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field420;
        if (arg0 != 1) {
            return null;
        } else {
            int[] var3 = super.field1537.method2395(30963, arg1);
            if (super.field1537.field5756) {
                int[] var4 = this.method703(0, arg1, -2);
                int[] var5 = this.method703(1, arg1, -2);
                int var6 = this.field418;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (var6 != 9) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; class440.field6474 > var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class440.field6474 < ~var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = ~var12 >= ~var11 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class440.field6474; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class440.field6474 > var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var17 <= var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class440.field6474 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class440.field6474 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class440.field6474; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; var25 < class440.field6474; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class440.field6474; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class440.field6474; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class440.field6474; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class440.field6474 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class33() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)V")
    public static void method196(byte arg0) {
        field416 = null;
        int var1 = -64 % ((arg0 - 58) / 62);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != -1) {
            field416 = null;
        }
        ++field419;
        if (arg0 == arg3 && arg1 == arg8 && arg2 == arg7 && arg6 == arg9) {
            class402.method2524(arg2, arg8, arg9, arg5, arg4 + 1, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg8;
            int var12 = arg0 * 3;
            int var13 = arg8 * 3;
            int var14 = arg3 * 3;
            int var15 = arg1 * 3;
            int var16 = arg7 * 3;
            int var17 = arg6 * 3;
            int var18 = -var16 + arg2 - arg0 + var14;
            int var19 = arg9 + var15 + -var17 + -arg8;
            int var20 = -var14 + var12 + var16 - var14;
            int var21 = -var15 + var17 - -var13 + -var15;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - (-var29 - var31) >> 12) + arg0;
                int var34 = (var28 + var30 - -var32 >> 12) + arg8;
                class402.method2524(var33, var11, var34, arg5, 0, var10);
                var10 = var33;
                var11 = var34;
            }
        }
    }
}
