import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class272 extends class535 {

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    private int field4081 = 6;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    public static int field4083 = 0;

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILwn;I)V", line = 6)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            this.method61(-20, 60);
        }
        ++field4086;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field7878 = arg1.method3072((byte) -120) == 1;
            }
        } else {
            this.field4081 = arg1.method3072((byte) -124);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I", line = 42)
    public final int[][] method61(int arg0, int arg1) {
        ++field4082;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[][] var5 = this.method3157((byte) 67, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4081;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class174.field2597; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var19 + var20 - (var19 * var20 >> 11);
                                                                var7[var16] = var18 - -var22 - (var18 * var22 >> 11);
                                                                var8[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class174.field2597 < ~var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var24 < ~var27 ? -var27 + var24 : var27 - var24;
                                                            var7[var23] = var28 <= var25 ? var25 - var28 : -var25 + var28;
                                                            var8[var23] = var29 >= var26 ? -var26 + var29 : -var29 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class174.field2597; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var35 <= ~var34 ? var35 : var34;
                                                        var7[var30] = var31 <= var32 ? var32 : var31;
                                                        var8[var30] = var33 < var36 ? var36 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class174.field2597 < ~var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = ~var41 > ~var38 ? var41 : var38;
                                                    var7[var37] = ~var40 <= ~var43 ? var43 : var40;
                                                    var8[var37] = var42 <= var39 ? var42 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class174.field2597 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 != -1 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = ~var47 != -1 ? 4096 - (-var13[var44] + 4096 << 12) / var47 : 0;
                                                var8[var44] = ~var46 != -1 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class174.field2597; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class174.field2597 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = var55 >= 2048 ? 4096 - ((4096 - var55) * (-var10[var52] + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var53 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var53 + 4096) >> 11) : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class174.field2597 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class174.field2597 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class174.field2597 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class174.field2597; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class174.field2597; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (arg0 > -116) {
            this.method60(62, (class519) null, 94);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)[I", line = 360)
    public final int[] method65(int arg0, int arg1) {
        ++field4084;
        if (arg1 != 1) {
            this.method61(92, -74);
        }
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(80, 0, arg0);
            int[] var5 = this.method3158(arg1 ^ -90, 1, arg0);
            int var6 = this.field4081;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class174.field2597; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class174.field2597; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class174.field2597; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 < var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class174.field2597; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 <= var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class174.field2597 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class174.field2597 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class174.field2597; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (4096 - var24) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class174.field2597; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class174.field2597; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class174.field2597 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class174.field2597 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class174.field2597 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 608)
    public class272() {
        super(2, false);
    }
}
