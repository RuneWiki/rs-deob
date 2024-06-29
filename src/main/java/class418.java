import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class418 extends class386 {

    @OriginalMember(owner = "client!uda", name = "E", descriptor = "I")
    private int field5918 = 6;

    @OriginalMember(owner = "client!uda", name = "C", descriptor = "Ln;")
    public static class17 field5916 = null;

    @OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
    public static int field5920 = -1;

    @OriginalMember(owner = "client!uda", name = "L", descriptor = "I")
    public static int field5925 = 2;

    @OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!uda", name = "J", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!uda", name = "K", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "Lmd;")
    public static class504 field5919;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method359(int arg0, int arg1) {
        int var3 = -44 / ((arg1 - 13) / 40);
        ++field5922;
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) 113, arg0, 0);
            int[] var6 = this.method2212((byte) 85, arg0, 1);
            int var7 = this.field5918;
            if (~var7 != -2) {
                if (~var7 != -3) {
                    if (var7 != 3) {
                        if (var7 != 4) {
                            if (var7 != 5) {
                                if (var7 != 6) {
                                    if (var7 != 7) {
                                        if (var7 != 8) {
                                            if (var7 != 9) {
                                                if (var7 != 10) {
                                                    if (var7 != 11) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; var8 < class599.field8643; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var4[var8] = var9 + var10 + -(var9 * var10 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; ~class599.field8643 < ~var11; ++var11) {
                                                            int var12 = var6[var11];
                                                            int var13 = var5[var11];
                                                            var4[var11] = ~var12 <= ~var13 ? var12 - var13 : var13 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; ~var14 > ~class599.field8643; ++var14) {
                                                        int var15 = var5[var14];
                                                        int var16 = var6[var14];
                                                        var4[var14] = var16 < var15 ? var15 : var16;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~class599.field8643 < ~var17; ++var17) {
                                                    int var18 = var6[var17];
                                                    int var19 = var5[var17];
                                                    var4[var17] = ~var18 >= ~var19 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; ~var20 > ~class599.field8643; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = var21 != 0 ? -((-var6[var20] + 4096 << 12) / var21) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; class599.field8643 > var22; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = var23 == 4096 ? 4096 : (var6[var22] << 12) / (-var23 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; var24 < class599.field8643; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = ~var25 <= -2049 ? -((4096 - var5[var24]) * (-var25 + 4096) >> 11) + 4096 : var5[var24] * var25 >> 11;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class599.field8643; ++var26) {
                                    var4[var26] = -((4096 - var6[var26]) * (-var5[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; var27 < class599.field8643; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 == 0 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; class599.field8643 > var29; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class599.field8643; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; class599.field8643 > var31; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBLun;)V", line = 250)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 >= 111) {
            ++field5923;
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field5145 = ~arg2.method2229(255) == -2;
                }
            } else {
                this.field5918 = arg2.method2229(255);
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)[[I", line = 294)
    public final int[][] method645(int arg0, int arg1) {
        ++field5917;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (arg1 != 3) {
            this.method355(99, (byte) 27, (class389) null);
        }
        if (super.field5148.field2041) {
            int[][] var4 = this.method2211(arg0, 0, arg1 ^ -102);
            int[][] var5 = this.method2211(arg0, 1, -108);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5918;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class599.field8643 < ~var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var17 + var20 - (var17 * var20 >> 11);
                                                                var7[var16] = -(var21 * var22 >> 11) + var21 + var22;
                                                                var8[var16] = -(var18 * var19 >> 11) + var19 - -var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class599.field8643; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var26 < ~var25 ? -var25 + var26 : var25 - var26;
                                                            var7[var23] = var24 <= var27 ? -var24 + var27 : -var27 + var24;
                                                            var8[var23] = var28 <= var29 ? var29 - var28 : var28 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class599.field8643; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var36 > var33 ? var36 : var33;
                                                        var7[var30] = ~var32 > ~var34 ? var34 : var32;
                                                        var8[var30] = var31 <= var35 ? var35 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class599.field8643 < ~var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var41 < ~var43 ? var43 : var41;
                                                    var7[var37] = var38 <= var42 ? var38 : var42;
                                                    var8[var37] = ~var40 >= ~var39 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class599.field8643; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var47 : 0;
                                                var7[var44] = ~var46 != -1 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var8[var44] = var45 == 0 ? 0 : -((4096 - var14[var44] << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class599.field8643 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class599.field8643 < ~var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((4096 - var53) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = var55 >= 2048 ? 4096 - ((4096 - var55) * (-var10[var52] + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((4096 - var54) * (-var11[var52] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class599.field8643 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class599.field8643; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; class599.field8643 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class599.field8643 < ~var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class599.field8643; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "(I)V", line = 608)
    public static void method2511(int arg0) {
        field5916 = null;
        if (arg0 == 17817) {
            field5919 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILdc;)I", line = 620)
    public static final int method2512(int arg0, class5 arg1) {
        ++field5924;
        int var2 = arg1.method25(2, 255);
        int var3;
        if (~var2 != -1) {
            if (~var2 != -2) {
                if (var2 == 2) {
                    var3 = arg1.method25(8, 255);
                } else {
                    var3 = arg1.method25(11, 255);
                }
            } else {
                var3 = arg1.method25(5, 255);
            }
        } else {
            var3 = 0;
        }
        if (arg0 > -45) {
            field5919 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V", line = 650)
    public class418() {
        super(2, false);
    }
}
