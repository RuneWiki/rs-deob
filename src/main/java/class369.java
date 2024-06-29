import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class369 extends class747 {

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    private int field5219 = 6;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "Z")
    public static boolean field5216;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field5218;
        if (arg1 != 11608) {
            this.field5219 = 65;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field10281 = arg0.method505((byte) -119) == 1;
            }
        } else {
            this.field5219 = arg0.method505((byte) -119);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class369() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field5220;
        int[][] var3 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var4 = this.method4158(0, arg1, 2);
            int[][] var5 = this.method4158(1, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5219;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class73.field1095; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = var17 + var19 - (var17 * var19 >> 11);
                                                                var7[var16] = var22 - ((var20 * var22 >> 11) + -var20);
                                                                var8[var16] = var18 + var21 + -(var18 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class73.field1095; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var29 < ~var24 ? var29 - var24 : var24 - var29;
                                                            var7[var23] = var25 > var27 ? -var27 + var25 : -var25 + var27;
                                                            var8[var23] = ~var26 <= ~var28 ? -var28 + var26 : var28 - var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class73.field1095 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var35 < var32 ? var32 : var35;
                                                        var7[var30] = var36 <= var33 ? var33 : var36;
                                                        var8[var30] = ~var31 > ~var34 ? var34 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class73.field1095 > var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = var39 <= var38 ? var39 : var38;
                                                    var7[var37] = var43 <= var42 ? var43 : var42;
                                                    var8[var37] = var41 <= var40 ? var41 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class73.field1095; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var45 : 0;
                                                var7[var44] = ~var47 != -1 ? 4096 - (-var13[var44] + 4096 << 12) / var47 : 0;
                                                var8[var44] = var46 == 0 ? 0 : -((4096 - var14[var44] << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class73.field1095 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class73.field1095; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 <= -2049 ? -((4096 - var55) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((4096 - var10[var52]) * (4096 - var53) >> 11) + 4096;
                                        var8[var52] = ~var54 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var54 + 4096) >> 11) : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class73.field1095; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class73.field1095; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = ~var60 == -1 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class73.field1095 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class73.field1095 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class73.field1095 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        int var64 = 31 / ((35 - arg0) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field5217;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (arg1 >= -89) {
            this.method688(77, 94);
        }
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(-127, arg0, 0);
            int[] var5 = this.method4156(-118, arg0, 1);
            int var6 = this.field5219;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~class73.field1095 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class73.field1095; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class73.field1095; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class73.field1095 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class73.field1095; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class73.field1095 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class73.field1095 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class73.field1095; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class73.field1095 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class73.field1095; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class73.field1095 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class73.field1095; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }
}
