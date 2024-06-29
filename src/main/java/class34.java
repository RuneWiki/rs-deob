import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class34 extends class56 {

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    private int field439 = 6;

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "Lqfa;")
    public static class98 field441 = new class98(57, -2);

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(I)V", line = 3)
    public static void method194(int arg0) {
        if (arg0 != 4096) {
            method195(73, -125, -1, -51, (byte[]) null, 65);
        }
        field441 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[[I", line = 16)
    public final int[][] method5(int arg0, int arg1) {
        if (arg1 != 1) {
            field441 = null;
        }
        ++field440;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[][] var4 = this.method369(arg0, 126, 0);
            int[][] var5 = this.method369(arg0, arg1 + 124, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field439;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class328.field4576 > var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var18 * var21 >> 11) + var18 + var21;
                                                                var7[var16] = var17 + var20 - (var17 * var20 >> 11);
                                                                var8[var16] = var19 + var22 - (var19 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class328.field4576 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var25 < ~var24 ? -var24 + var25 : -var25 + var24;
                                                            var7[var23] = var29 > var27 ? -var27 + var29 : -var29 + var27;
                                                            var8[var23] = ~var26 <= ~var28 ? -var28 + var26 : var28 - var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class328.field4576; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = var31 > var36 ? var31 : var36;
                                                        var7[var30] = ~var33 <= ~var35 ? var33 : var35;
                                                        var8[var30] = var32 > var34 ? var32 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class328.field4576 < ~var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var41 > var42 ? var42 : var41;
                                                    var7[var37] = ~var38 <= ~var39 ? var39 : var38;
                                                    var8[var37] = ~var40 > ~var43 ? var40 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class328.field4576; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var47;
                                                var7[var44] = var46 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var8[var44] = ~var45 == -1 ? 0 : -((4096 - var14[var44] << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class328.field4576 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class328.field4576; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : 4096 - ((4096 - var54) * (-var10[var52] + 4096) >> 11);
                                        var8[var52] = var55 >= 2048 ? -((4096 - var11[var52]) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class328.field4576 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class328.field4576; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var60 == -1 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class328.field4576; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class328.field4576; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class328.field4576; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILee;I)V", line = 332)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 == 3731) {
            ++field438;
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    super.field674 = arg1.method3750((byte) 35) == 1;
                }
            } else {
                this.field439 = arg1.method3750((byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)[I", line = 367)
    public final int[] method24(int arg0, boolean arg1) {
        ++field437;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            return null;
        } else {
            if (super.field673.field8073) {
                int[] var4 = this.method367(4463, 0, arg0);
                int[] var5 = this.method367(4463, 1, arg0);
                int var6 = this.field439;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (~var6 != -12) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~var7 > ~class328.field4576; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class328.field4576 < ~var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = ~var12 >= ~var11 ? -var12 + var11 : var12 - var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class328.field4576 < ~var13; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var14 >= var15 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class328.field4576 < ~var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var17 > ~var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class328.field4576; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < class328.field4576; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class328.field4576; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~var25 > ~class328.field4576; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; class328.field4576 > var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; class328.field4576 > var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class328.field4576; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class328.field4576 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V", line = 618)
    public class34() {
        super(2, false);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII[BI)V", line = 631)
    public static final void method195(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        ++field442;
        if (arg0 < arg1) {
            int var6 = arg0 + arg3;
            int var7 = -arg0 + arg1 >> 2;
            while (true) {
                --var7;
                if (var7 < 0) {
                    if (arg5 != -1212415540) {
                        method194(81);
                    }
                    int var8 = -arg0 + arg1 & 3;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            return;
                        }
                        arg4[var6++] = 1;
                    }
                }
                arg4[var6++] = 1;
                arg4[var6++] = 1;
                arg4[var6++] = 1;
                arg4[var6++] = 1;
            }
        }
    }
}
