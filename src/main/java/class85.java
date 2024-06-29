import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class85 extends class377 {

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    private int field1091 = 6;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lrr;")
    public static class337 field1089 = null;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1085 = null;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field1090 = 104;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILpfa;Lpfa;B)V")
    public static final void method644(int arg0, class275 arg1, class275 arg2, byte arg3) {
        class395.field5030 = arg2;
        class557.field6973 = arg1;
        int var4 = -90 % ((36 - arg3) / 56);
        ++field1086;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILrr;Loa;)V")
    public static final void method645(int arg0, class337 arg1, class650 arg2) {
        ++field1088;
        boolean var3 = class504.field6287.method1632(arg1.field4259 | -16777216, (byte) -46, arg1.field4252, arg1.field4219, arg1.field4229, arg1.field4297 ? class67.field815.field4684 : null, arg1.field4150, arg2) == null;
        if (arg0 < 97) {
            field1092 = -48;
        }
        if (var3) {
            class146.field1744.method1904(new class295(arg1.field4252, arg1.field4229, arg1.field4150, -16777216 | arg1.field4259, arg1.field4219, arg1.field4297), -7);
            class99.method721((byte) 118, arg1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method646(boolean arg0) {
        field1089 = null;
        if (!arg0) {
            field1085 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class85() {
        super(2, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field1094;
        int var3 = 89 / ((arg1 - 31) / 42);
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[][] var5 = this.method2173(1, arg0, 0);
            int[][] var6 = this.method2173(1, arg0, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field1091;
            if (var16 != 1) {
                if (~var16 != -3) {
                    if (var16 != 3) {
                        if (var16 != 4) {
                            if (var16 != 5) {
                                if (~var16 != -7) {
                                    if (~var16 != -8) {
                                        if (~var16 != -9) {
                                            if (var16 != 9) {
                                                if (~var16 != -11) {
                                                    if (var16 != 11) {
                                                        if (var16 == 12) {
                                                            for (int var17 = 0; class528.field6661 > var17; ++var17) {
                                                                int var18 = var15[var17];
                                                                int var19 = var12[var17];
                                                                int var20 = var13[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var10[var17];
                                                                int var23 = var14[var17];
                                                                var7[var17] = var22 - -var20 + -(var20 * var22 >> 11);
                                                                var8[var17] = var21 - ((var21 * var23 >> 11) + -var23);
                                                                var9[var17] = -(var18 * var19 >> 11) + var19 + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; var24 < class528.field6661; ++var24) {
                                                            int var25 = var10[var24];
                                                            int var26 = var12[var24];
                                                            int var27 = var15[var24];
                                                            int var28 = var14[var24];
                                                            int var29 = var13[var24];
                                                            int var30 = var11[var24];
                                                            var7[var24] = ~var25 >= ~var29 ? -var25 + var29 : var25 - var29;
                                                            var8[var24] = var28 < var30 ? -var28 + var30 : -var30 + var28;
                                                            var9[var24] = ~var27 <= ~var26 ? -var26 + var27 : -var27 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~class528.field6661 < ~var31; ++var31) {
                                                        int var32 = var14[var31];
                                                        int var33 = var12[var31];
                                                        int var34 = var15[var31];
                                                        int var35 = var13[var31];
                                                        int var36 = var10[var31];
                                                        int var37 = var11[var31];
                                                        var7[var31] = var36 > var35 ? var36 : var35;
                                                        var8[var31] = var32 >= var37 ? var32 : var37;
                                                        var9[var31] = var33 > var34 ? var33 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~class528.field6661 < ~var38; ++var38) {
                                                    int var39 = var13[var38];
                                                    int var40 = var10[var38];
                                                    int var41 = var12[var38];
                                                    int var42 = var15[var38];
                                                    int var43 = var14[var38];
                                                    int var44 = var11[var38];
                                                    var7[var38] = ~var40 > ~var39 ? var40 : var39;
                                                    var8[var38] = ~var44 > ~var43 ? var44 : var43;
                                                    var9[var38] = ~var41 > ~var42 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~class528.field6661 < ~var45; ++var45) {
                                                int var46 = var12[var45];
                                                int var47 = var11[var45];
                                                int var48 = var10[var45];
                                                var7[var45] = ~var48 == -1 ? 0 : -((-var13[var45] + 4096 << 12) / var48) + 4096;
                                                var8[var45] = ~var47 == -1 ? 0 : -((-var14[var45] + 4096 << 12) / var47) + 4096;
                                                var9[var45] = var46 == 0 ? 0 : -((-var15[var45] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~class528.field6661 < ~var49; ++var49) {
                                            int var50 = var10[var49];
                                            int var51 = var11[var49];
                                            int var52 = var12[var49];
                                            var7[var49] = var50 == 4096 ? 4096 : (var13[var49] << 12) / (-var50 + 4096);
                                            var8[var49] = var51 == 4096 ? 4096 : (var14[var49] << 12) / (4096 - var51);
                                            var9[var49] = ~var52 == -4097 ? 4096 : (var15[var49] << 12) / (4096 - var52);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; class528.field6661 > var53; ++var53) {
                                        int var54 = var13[var53];
                                        int var55 = var15[var53];
                                        int var56 = var14[var53];
                                        var7[var53] = ~var54 <= -2049 ? -((-var10[var53] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var53] * var54 >> 11;
                                        var8[var53] = var56 < 2048 ? var11[var53] * var56 >> 11 : -((-var11[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                        var9[var53] = ~var55 <= -2049 ? -((4096 - var55) * (-var12[var53] + 4096) >> 11) + 4096 : var12[var53] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class528.field6661 > var57; ++var57) {
                                    var7[var57] = -((-var10[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((-var11[var57] + 4096) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = 4096 - ((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class528.field6661 < ~var58; ++var58) {
                                int var59 = var13[var58];
                                int var60 = var14[var58];
                                int var61 = var15[var58];
                                var7[var58] = var59 == 0 ? 4096 : (var10[var58] << 12) / var59;
                                var8[var58] = ~var60 != -1 ? (var11[var58] << 12) / var60 : 4096;
                                var9[var58] = var61 == 0 ? 4096 : (var12[var58] << 12) / var61;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class528.field6661 < ~var62; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~class528.field6661 < ~var63; ++var63) {
                        var7[var63] = var10[var63] - var13[var63];
                        var8[var63] = var11[var63] - var14[var63];
                        var9[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class528.field6661 < ~var64; ++var64) {
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var11[var64] + var14[var64];
                    var9[var64] = var12[var64] - -var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field1087;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field4853 = ~arg2.method3097((byte) 12) == -2;
            }
        } else {
            this.field1091 = arg2.method3097((byte) 12);
        }
        int var5 = 12 % ((arg1 - 13) / 55);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field1093;
        int var3 = -76 % ((arg1 - 5) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -114);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, arg0, (byte) -123);
            int[] var6 = this.method2174(1, arg0, (byte) 68);
            int var7 = this.field1091;
            if (~var7 != -2) {
                if (var7 != 2) {
                    if (var7 != 3) {
                        if (~var7 != -5) {
                            if (~var7 != -6) {
                                if (var7 != 6) {
                                    if (~var7 != -8) {
                                        if (~var7 != -9) {
                                            if (var7 != 9) {
                                                if (~var7 != -11) {
                                                    if (var7 != 11) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; ~class528.field6661 < ~var8; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var4[var8] = var10 - (-var9 - -(var9 * var10 >> 11));
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class528.field6661 > var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = var13 < var12 ? var12 - var13 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; var14 < class528.field6661; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var4[var14] = ~var15 <= ~var16 ? var15 : var16;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~var17 > ~class528.field6661; ++var17) {
                                                    int var18 = var6[var17];
                                                    int var19 = var5[var17];
                                                    var4[var17] = ~var18 >= ~var19 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; ~var20 > ~class528.field6661; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = var21 == 0 ? 0 : -((-var6[var20] + 4096 << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~var22 > ~class528.field6661; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = var23 != 4096 ? (var6[var22] << 12) / (-var23 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; ~var24 > ~class528.field6661; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = ~var25 > -2049 ? var5[var24] * var25 >> 11 : 4096 - ((4096 - var5[var24]) * (-var25 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class528.field6661; ++var26) {
                                    var4[var26] = -((-var5[var26] + 4096) * (-var6[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; ~class528.field6661 < ~var27; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 == 0 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class528.field6661; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class528.field6661; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class528.field6661; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var4;
    }
}
