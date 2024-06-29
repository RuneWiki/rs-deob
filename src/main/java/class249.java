import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class249 extends class259 {

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    private int field4409 = 6;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field4405 = -1;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "[I")
    public static int[] field4410 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)V")
    public static final void method1744(int arg0, boolean arg1) {
        ++field4408;
        class132.field2600.method1642(arg0, 86);
        class9.field168.method1642(arg0, 61);
        if (arg1) {
            method1747(-94, 25, 25, 113, 80, 118);
        }
        class261.field4606.method1642(arg0, 79);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(1 & arg3) == -2) {
            int var7 = arg6;
            arg6 = arg4;
            arg4 = var7;
        }
        int var8 = arg0 & 3;
        ++field4407;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return -arg5 + 7 + -arg6 + 1;
        } else if (arg2 >= -14) {
            return -114;
        } else {
            return var8 == 2 ? -arg4 + 7 + -arg1 - -1 : arg5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field4412;
        int var3 = 43 % ((arg0 - -48) / 42);
        int[][] var4 = super.field4568.method241(42, arg1);
        if (super.field4568.field564) {
            int[][] var5 = this.method1795(arg1, 2, 0);
            int[][] var6 = this.method1795(arg1, 2, 1);
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field4409;
            if (~var16 != -2) {
                if (var16 != 2) {
                    if (~var16 != -4) {
                        if (~var16 != -5) {
                            if (~var16 != -6) {
                                if (var16 != 6) {
                                    if (~var16 != -8) {
                                        if (var16 != 8) {
                                            if (~var16 != -10) {
                                                if (var16 != 10) {
                                                    if (var16 != 11) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; var17 < class223.field3999; ++var17) {
                                                                int var18 = var14[var17];
                                                                int var19 = var15[var17];
                                                                int var20 = var13[var17];
                                                                int var21 = var12[var17];
                                                                int var22 = var10[var17];
                                                                int var23 = var11[var17];
                                                                var8[var17] = var22 - -var21 + -(var21 * var22 >> 11);
                                                                var7[var17] = -(var18 * var23 >> 11) + var18 + var23;
                                                                var9[var17] = var19 + var20 + -(var19 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; ~var24 > ~class223.field3999; ++var24) {
                                                            int var25 = var14[var24];
                                                            int var26 = var10[var24];
                                                            int var27 = var11[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var13[var24];
                                                            int var30 = var12[var24];
                                                            var8[var24] = ~var26 >= ~var30 ? -var26 + var30 : -var30 + var26;
                                                            var7[var24] = var27 <= var25 ? -var27 + var25 : -var25 + var27;
                                                            var9[var24] = var29 > var28 ? -var28 + var29 : -var29 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class223.field3999; ++var31) {
                                                        int var32 = var10[var31];
                                                        int var33 = var15[var31];
                                                        int var34 = var13[var31];
                                                        int var35 = var11[var31];
                                                        int var36 = var12[var31];
                                                        int var37 = var14[var31];
                                                        var8[var31] = var36 < var32 ? var32 : var36;
                                                        var7[var31] = ~var37 > ~var35 ? var35 : var37;
                                                        var9[var31] = ~var34 < ~var33 ? var34 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~var38 > ~class223.field3999; ++var38) {
                                                    int var39 = var12[var38];
                                                    int var40 = var14[var38];
                                                    int var41 = var15[var38];
                                                    int var42 = var10[var38];
                                                    int var43 = var11[var38];
                                                    int var44 = var13[var38];
                                                    var8[var38] = var42 >= var39 ? var39 : var42;
                                                    var7[var38] = var40 > var43 ? var43 : var40;
                                                    var9[var38] = var44 >= var41 ? var41 : var44;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~var45 > ~class223.field3999; ++var45) {
                                                int var46 = var11[var45];
                                                int var47 = var13[var45];
                                                int var48 = var10[var45];
                                                var8[var45] = var48 == 0 ? 0 : -((4096 - var12[var45] << 12) / var48) + 4096;
                                                var7[var45] = ~var46 == -1 ? 0 : -((4096 - var14[var45] << 12) / var46) + 4096;
                                                var9[var45] = var47 == 0 ? 0 : -((-var15[var45] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~class223.field3999 < ~var49; ++var49) {
                                            int var50 = var11[var49];
                                            int var51 = var10[var49];
                                            int var52 = var13[var49];
                                            var8[var49] = ~var51 == -4097 ? 4096 : (var12[var49] << 12) / (4096 - var51);
                                            var7[var49] = ~var50 != -4097 ? (var14[var49] << 12) / (-var50 + 4096) : 4096;
                                            var9[var49] = ~var52 == -4097 ? 4096 : (var15[var49] << 12) / (4096 - var52);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; class223.field3999 > var53; ++var53) {
                                        int var54 = var12[var53];
                                        int var55 = var14[var53];
                                        int var56 = var15[var53];
                                        var8[var53] = ~var54 > -2049 ? var10[var53] * var54 >> 11 : 4096 - ((-var10[var53] + 4096) * (-var54 + 4096) >> 11);
                                        var7[var53] = var55 >= 2048 ? -((-var11[var53] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var53] * var55 >> 11;
                                        var9[var53] = ~var56 > -2049 ? var13[var53] * var56 >> 11 : -((-var13[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~class223.field3999 < ~var57; ++var57) {
                                    var8[var57] = -((4096 - var10[var57]) * (-var12[var57] + 4096) >> 12) + 4096;
                                    var7[var57] = 4096 - ((-var11[var57] + 4096) * (-var14[var57] + 4096) >> 12);
                                    var9[var57] = 4096 - ((4096 - var13[var57]) * (-var15[var57] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class223.field3999 < ~var58; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var15[var58];
                                int var61 = var12[var58];
                                var8[var58] = var61 == 0 ? 4096 : (var10[var58] << 12) / var61;
                                var7[var58] = ~var59 == -1 ? 4096 : (var11[var58] << 12) / var59;
                                var9[var58] = var60 != 0 ? (var13[var58] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class223.field3999; ++var62) {
                            var8[var62] = var10[var62] * var12[var62] >> 12;
                            var7[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var13[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; class223.field3999 > var63; ++var63) {
                        var8[var63] = var10[var63] + -var12[var63];
                        var7[var63] = var11[var63] + -var14[var63];
                        var9[var63] = var13[var63] - var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; class223.field3999 > var64; ++var64) {
                    var8[var64] = var10[var64] + var12[var64];
                    var7[var64] = var11[var64] + var14[var64];
                    var9[var64] = var13[var64] + var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field4411;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(0, arg0, 126);
            int[] var5 = this.method1799(1, arg0, 116);
            int var6 = this.field4409;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class223.field3999; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class223.field3999 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 <= var11 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class223.field3999; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 > var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class223.field3999; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class223.field3999 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class223.field3999; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class223.field3999; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class223.field3999; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class223.field3999; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class223.field3999 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class223.field3999 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class223.field3999 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1) {
            field4405 = -123;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.method4(-75, -94, (class8) null);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field4588 = arg2.method63((byte) 49) == 1;
            }
        } else {
            this.field4409 = arg2.method63((byte) 88);
        }
        ++field4406;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class249() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)V")
    public static void method1746(int arg0) {
        if (arg0 != -9169) {
            field4404 = 116;
        }
        field4410 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4413;
        if (arg0 == 27522) {
            for (int var6 = arg3; arg3 - -arg5 >= var6; ++var6) {
                for (int var11 = arg2; var11 <= arg1 + arg2; ++var11) {
                    if (var11 >= 0 && var11 < 104 && ~var6 <= -1 && ~var6 > -105) {
                        class166.field3050[arg4][var11][var6] = 127;
                    }
                }
            }
            for (int var7 = arg3; arg3 + arg5 > var7; ++var7) {
                for (int var10 = arg2; ~(arg1 + arg2) < ~var10; ++var10) {
                    if (~var10 <= -1 && var10 < 104 && var7 >= 0 && ~var7 > -105) {
                        class242.field4333[arg4][var10][var7] = arg4 > 0 ? class242.field4333[arg4 + -1][var10][var7] : 0;
                    }
                }
            }
            if (~arg2 < -1 && ~arg2 > -105) {
                for (int var8 = arg3 + 1; arg3 + arg5 > var8; ++var8) {
                    if (~var8 <= -1 && ~var8 > -105) {
                        class242.field4333[arg4][arg2][var8] = class242.field4333[arg4][arg2 + -1][var8];
                    }
                }
            }
            if (~arg3 < -1 && arg3 < 104) {
                for (int var9 = arg2 + 1; ~var9 > ~(arg1 + arg2); ++var9) {
                    if (var9 >= 0 && ~var9 > -105) {
                        class242.field4333[arg4][var9][arg3] = class242.field4333[arg4][var9][arg3 + -1];
                    }
                }
            }
            if (~arg2 <= -1 && ~arg3 <= -1 && ~arg2 > -105 && arg3 < 104) {
                if (arg4 != 0) {
                    if (~arg2 < -1 && class242.field4333[arg4 + -1][arg2 + -1][arg3] != class242.field4333[arg4][arg2 + -1][arg3]) {
                        class242.field4333[arg4][arg2][arg3] = class242.field4333[arg4][arg2 - 1][arg3];
                        return;
                    }
                    if (~arg3 < -1 && ~class242.field4333[arg4 + -1][arg2][arg3 - 1] != ~class242.field4333[arg4][arg2][arg3 - 1]) {
                        class242.field4333[arg4][arg2][arg3] = class242.field4333[arg4][arg2][arg3 + -1];
                        return;
                    }
                    if (~arg2 < -1 && arg3 > 0 && class242.field4333[arg4][arg2 - 1][arg3 + -1] != class242.field4333[arg4 + -1][arg2 + -1][arg3 + -1]) {
                        class242.field4333[arg4][arg2][arg3] = class242.field4333[arg4][arg2 + -1][arg3 + -1];
                        return;
                    }
                    return;
                }
                if (arg2 > 0 && ~class242.field4333[arg4][arg2 + -1][arg3] != -1) {
                    class242.field4333[arg4][arg2][arg3] = class242.field4333[arg4][arg2 + -1][arg3];
                    return;
                }
                if (arg3 > 0 && ~class242.field4333[arg4][arg2][arg3 + -1] != -1) {
                    class242.field4333[arg4][arg2][arg3] = class242.field4333[arg4][arg2][arg3 + -1];
                    return;
                }
                if (arg2 > 0 && arg3 > 0 && class242.field4333[arg4][arg2 + -1][arg3 + -1] != 0) {
                    class242.field4333[arg4][arg2][arg3] = class242.field4333[arg4][arg2 + -1][arg3 + -1];
                    return;
                }
            }
        }
    }
}
