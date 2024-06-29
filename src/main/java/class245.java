import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class245 extends class107 {

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    private int field4288 = 6;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "[[I")
    public static int[][] field4287 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "Lpj;")
    public static class237 field4290 = class189.method1283(-74, 160);

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "Lpj;")
    public static class237 field4294 = class33.method353(" zuerst von Ihrer Ignorieren)2Liste(Q", 73);

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lpj;")
    public static class237 field4295 = class33.method353("<col=c0ff00>", 43);

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field4296 = 0;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            field4294 = null;
        }
        ++field4293;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, arg1, (byte) 90);
            int[] var5 = this.method797(1, arg1, (byte) -14);
            int var6 = this.field4288;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class106.field1862; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class106.field1862; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 >= var11 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class106.field1862; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class106.field1862 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 < ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class106.field1862; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class106.field1862; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class106.field1862 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class106.field1862 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class106.field1862; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class106.field1862 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class106.field1862 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class106.field1862 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class245() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1897 = arg0.method316((byte) 98) == 1;
            }
        } else {
            this.field4288 = arg0.method316((byte) 107);
        }
        if (arg2 == -32513) {
            ++field4286;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field4289;
        int var3 = -123 % ((26 - arg0) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var5 = this.method802(3, arg1, 0);
            int[][] var6 = this.method802(3, arg1, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var6[2];
            int[] var14 = var5[2];
            int[] var15 = var6[1];
            int var16 = this.field4288;
            if (~var16 != -2) {
                if (var16 != 2) {
                    if (~var16 != -4) {
                        if (var16 != 4) {
                            if (~var16 != -6) {
                                if (var16 != 6) {
                                    if (~var16 != -8) {
                                        if (var16 != 8) {
                                            if (var16 != 9) {
                                                if (var16 != 10) {
                                                    if (~var16 != -12) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~var17 > ~class106.field1862; ++var17) {
                                                                int var18 = var15[var17];
                                                                int var19 = var14[var17];
                                                                int var20 = var13[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var10[var17];
                                                                int var23 = var12[var17];
                                                                var7[var17] = var22 + var23 + -(var22 * var23 >> 11);
                                                                var8[var17] = -(var18 * var21 >> 11) + var18 + var21;
                                                                var9[var17] = -(var19 * var20 >> 11) + var19 + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class106.field1862 > var24; ++var24) {
                                                            int var25 = var14[var24];
                                                            int var26 = var10[var24];
                                                            int var27 = var13[var24];
                                                            int var28 = var12[var24];
                                                            int var29 = var11[var24];
                                                            int var30 = var15[var24];
                                                            var7[var24] = ~var26 < ~var28 ? var26 - var28 : -var26 + var28;
                                                            var8[var24] = ~var30 > ~var29 ? -var30 + var29 : -var29 + var30;
                                                            var9[var24] = ~var25 < ~var27 ? -var27 + var25 : -var25 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class106.field1862; ++var31) {
                                                        int var32 = var13[var31];
                                                        int var33 = var11[var31];
                                                        int var34 = var12[var31];
                                                        int var35 = var10[var31];
                                                        int var36 = var15[var31];
                                                        int var37 = var14[var31];
                                                        var7[var31] = var34 < var35 ? var35 : var34;
                                                        var8[var31] = var36 >= var33 ? var36 : var33;
                                                        var9[var31] = var37 > var32 ? var37 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~class106.field1862 < ~var38; ++var38) {
                                                    int var39 = var11[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var14[var38];
                                                    int var42 = var13[var38];
                                                    int var43 = var12[var38];
                                                    int var44 = var10[var38];
                                                    var7[var38] = var44 >= var43 ? var43 : var44;
                                                    var8[var38] = var40 > var39 ? var39 : var40;
                                                    var9[var38] = ~var42 >= ~var41 ? var42 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class106.field1862 > var45; ++var45) {
                                                int var46 = var14[var45];
                                                int var47 = var10[var45];
                                                int var48 = var11[var45];
                                                var7[var45] = ~var47 != -1 ? -((-var12[var45] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var45] = ~var48 != -1 ? -((-var15[var45] + 4096 << 12) / var48) + 4096 : 0;
                                                var9[var45] = var46 == 0 ? 0 : -((-var13[var45] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~class106.field1862 < ~var49; ++var49) {
                                            int var50 = var11[var49];
                                            int var51 = var14[var49];
                                            int var52 = var10[var49];
                                            var7[var49] = ~var52 == -4097 ? 4096 : (var12[var49] << 12) / (-var52 + 4096);
                                            var8[var49] = ~var50 == -4097 ? 4096 : (var15[var49] << 12) / (-var50 + 4096);
                                            var9[var49] = ~var51 == -4097 ? 4096 : (var13[var49] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~var53 > ~class106.field1862; ++var53) {
                                        int var54 = var15[var53];
                                        int var55 = var13[var53];
                                        int var56 = var12[var53];
                                        var7[var53] = var56 >= 2048 ? -((-var10[var53] + 4096) * (-var56 + 4096) >> 11) + 4096 : var10[var53] * var56 >> 11;
                                        var8[var53] = ~var54 > -2049 ? var11[var53] * var54 >> 11 : -((-var11[var53] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var9[var53] = var55 >= 2048 ? -((-var14[var53] + 4096) * (-var55 + 4096) >> 11) + 4096 : var14[var53] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class106.field1862; ++var57) {
                                    var7[var57] = -((4096 - var10[var57]) * (-var12[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((4096 - var11[var57]) * (-var15[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((4096 - var14[var57]) * (-var13[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class106.field1862 < ~var58; ++var58) {
                                int var59 = var15[var58];
                                int var60 = var13[var58];
                                int var61 = var12[var58];
                                var7[var58] = var61 == 0 ? 4096 : (var10[var58] << 12) / var61;
                                var8[var58] = var59 != 0 ? (var11[var58] << 12) / var59 : 4096;
                                var9[var58] = ~var60 == -1 ? 4096 : (var14[var58] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class106.field1862; ++var62) {
                            var7[var62] = var10[var62] * var12[var62] >> 12;
                            var8[var62] = var11[var62] * var15[var62] >> 12;
                            var9[var62] = var13[var62] * var14[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class106.field1862; ++var63) {
                        var7[var63] = var10[var63] + -var12[var63];
                        var8[var63] = var11[var63] + -var15[var63];
                        var9[var63] = var14[var63] + -var13[var63];
                    }
                }
            } else {
                for (int var64 = 0; var64 < class106.field1862; ++var64) {
                    var7[var64] = var10[var64] + var12[var64];
                    var8[var64] = var11[var64] + var15[var64];
                    var9[var64] = var14[var64] - -var13[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field4290 = null;
        field4295 = null;
        field4287 = null;
        field4294 = null;
        if (arg0 < 85) {
            field4294 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1688(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field4292;
        if (~arg2 == ~arg6) {
            class128.method909(arg0, arg2, arg4 ^ 103, arg3, arg5, arg7, arg1);
        } else if (arg4 == 103) {
            if (class89.field1637 <= -arg2 + arg5 && ~class94.field1676 <= ~(arg5 - -arg2) && ~(-arg6 + arg3) <= ~class13.field215 && ~(arg3 - -arg6) >= ~class34.field727) {
                class44.method418(arg1, arg3, arg6, arg5, arg0, arg2, arg7, 6683);
            } else {
                class113.method834(arg3, arg1, arg6, arg2, arg5, arg7, (byte) -65, arg0);
            }
        }
    }
}
