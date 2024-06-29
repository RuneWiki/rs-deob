import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class161 extends class337 {

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    private int field2396 = 6;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILhp;)V", line = 3)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field2398;
        int var4 = 21 % ((arg0 - 82) / 40);
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field5019 = ~arg2.method1515((byte) 121) == -2;
            }
        } else {
            this.field2396 = arg2.method1515((byte) 124);
        }
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V", line = 37)
    public static final void method1096(int arg0) {
        ++field2399;
        class382.field5752 = 0;
        class456.field6644.method993(126);
        if (arg0 == 15036) {
            class456.field6644.method994(class477.field6878, arg0 ^ -13478);
            ++class382.field5752;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I", line = 53)
    public final int[][] method673(int arg0, int arg1) {
        ++field2400;
        int var3 = -27 / ((-41 - arg1) / 49);
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[][] var5 = this.method2123(arg0, 0, -55);
            int[][] var6 = this.method2123(arg0, 1, -92);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field2396;
            if (~var16 != -2) {
                if (~var16 != -3) {
                    if (var16 != 3) {
                        if (var16 != 4) {
                            if (var16 != 5) {
                                if (var16 != 6) {
                                    if (var16 != 7) {
                                        if (var16 != 8) {
                                            if (~var16 != -10) {
                                                if (var16 != 10) {
                                                    if (~var16 != -12) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; class402.field5977 > var17; ++var17) {
                                                                int var18 = var11[var17];
                                                                int var19 = var15[var17];
                                                                int var20 = var12[var17];
                                                                int var21 = var13[var17];
                                                                int var22 = var14[var17];
                                                                int var23 = var10[var17];
                                                                var7[var17] = var21 + var23 - (var21 * var23 >> 11);
                                                                var8[var17] = -(var18 * var22 >> 11) + var22 + var18;
                                                                var9[var17] = -(var19 * var20 >> 11) + var20 + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class402.field5977 > var24; ++var24) {
                                                            int var25 = var10[var24];
                                                            int var26 = var12[var24];
                                                            int var27 = var11[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var13[var24];
                                                            int var30 = var14[var24];
                                                            var7[var24] = ~var29 <= ~var25 ? var29 - var25 : var25 - var29;
                                                            var8[var24] = var30 >= var27 ? -var27 + var30 : var27 - var30;
                                                            var9[var24] = ~var26 < ~var28 ? -var28 + var26 : var28 - var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class402.field5977; ++var31) {
                                                        int var32 = var12[var31];
                                                        int var33 = var11[var31];
                                                        int var34 = var14[var31];
                                                        int var35 = var13[var31];
                                                        int var36 = var10[var31];
                                                        int var37 = var15[var31];
                                                        var7[var31] = var36 > var35 ? var36 : var35;
                                                        var8[var31] = ~var34 > ~var33 ? var33 : var34;
                                                        var9[var31] = var32 <= var37 ? var37 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~var38 > ~class402.field5977; ++var38) {
                                                    int var39 = var10[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var13[var38];
                                                    int var42 = var14[var38];
                                                    int var43 = var11[var38];
                                                    int var44 = var12[var38];
                                                    var7[var38] = var39 < var41 ? var39 : var41;
                                                    var8[var38] = var43 >= var42 ? var42 : var43;
                                                    var9[var38] = var44 < var40 ? var44 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~var45 > ~class402.field5977; ++var45) {
                                                int var46 = var11[var45];
                                                int var47 = var10[var45];
                                                int var48 = var12[var45];
                                                var7[var45] = ~var47 != -1 ? -((-var13[var45] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var45] = ~var46 == -1 ? 0 : -((-var14[var45] + 4096 << 12) / var46) + 4096;
                                                var9[var45] = var48 == 0 ? 0 : 4096 - (-var15[var45] + 4096 << 12) / var48;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~var49 > ~class402.field5977; ++var49) {
                                            int var50 = var11[var49];
                                            int var51 = var12[var49];
                                            int var52 = var10[var49];
                                            var7[var49] = ~var52 == -4097 ? 4096 : (var13[var49] << 12) / (-var52 + 4096);
                                            var8[var49] = var50 != 4096 ? (var14[var49] << 12) / (-var50 + 4096) : 4096;
                                            var9[var49] = ~var51 != -4097 ? (var15[var49] << 12) / (4096 - var51) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; var53 < class402.field5977; ++var53) {
                                        int var54 = var15[var53];
                                        int var55 = var14[var53];
                                        int var56 = var13[var53];
                                        var7[var53] = var56 >= 2048 ? -((4096 - var10[var53]) * (4096 - var56) >> 11) + 4096 : var10[var53] * var56 >> 11;
                                        var8[var53] = ~var55 <= -2049 ? -((-var11[var53] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var53] * var55 >> 11;
                                        var9[var53] = var54 >= 2048 ? 4096 - ((-var12[var53] + 4096) * (-var54 + 4096) >> 11) : var12[var53] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class402.field5977 > var57; ++var57) {
                                    var7[var57] = -((-var10[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((4096 - var11[var57]) * (4096 - var14[var57]) >> 12) + 4096;
                                    var9[var57] = -((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class402.field5977 < ~var58; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var13[var58];
                                int var61 = var15[var58];
                                var7[var58] = ~var60 == -1 ? 4096 : (var10[var58] << 12) / var60;
                                var8[var58] = var59 == 0 ? 4096 : (var11[var58] << 12) / var59;
                                var9[var58] = var61 != 0 ? (var12[var58] << 12) / var61 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class402.field5977; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; class402.field5977 > var63; ++var63) {
                        var7[var63] = var10[var63] + -var13[var63];
                        var8[var63] = var11[var63] + -var14[var63];
                        var9[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~var64 > ~class402.field5977; ++var64) {
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var11[var64] + var14[var64];
                    var9[var64] = var12[var64] + var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 367)
    public class161() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I", line = 371)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            return null;
        } else {
            ++field2397;
            int[] var3 = super.field5007.method512(arg0, 0);
            if (super.field5007.field687) {
                int[] var4 = this.method2124(arg0, 0, -81);
                int[] var5 = this.method2124(arg0, 1, -46);
                int var6 = this.field2396;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; class402.field5977 > var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 - -var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class402.field5977 < ~var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var12 < var11 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class402.field5977 < ~var13; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class402.field5977 > var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var18 < var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class402.field5977; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class402.field5977 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; var23 < class402.field5977; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class402.field5977 < ~var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class402.field5977; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class402.field5977; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class402.field5977; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class402.field5977; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }
}
