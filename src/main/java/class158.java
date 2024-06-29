import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class158 extends class182 {

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    private int field2584 = 6;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[I")
    public static int[] field2585 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "[J")
    public static long[] field2589 = new long[32];

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "[I")
    public static int[] field2591;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field2592;
        int var3 = 41 / ((arg0 - -64) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 113);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[][] var6 = this.method1327(0, 1, arg1);
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            int var16 = this.field2584;
            if (~var16 != -2) {
                if (~var16 != -3) {
                    if (var16 != 3) {
                        if (var16 != 4) {
                            if (~var16 != -6) {
                                if (~var16 != -7) {
                                    if (var16 != 7) {
                                        if (var16 != 8) {
                                            if (var16 != 9) {
                                                if (~var16 != -11) {
                                                    if (~var16 != -12) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~var17 > ~class4.field116; ++var17) {
                                                                int var18 = var13[var17];
                                                                int var19 = var10[var17];
                                                                int var20 = var15[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var12[var17];
                                                                int var23 = var14[var17];
                                                                var7[var17] = var23 - (var19 * var23 >> 11) + var19;
                                                                var9[var17] = var18 + var22 + -(var18 * var22 >> 11);
                                                                var8[var17] = var21 - ((var20 * var21 >> 11) + -var20);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; var24 < class4.field116; ++var24) {
                                                            int var25 = var11[var24];
                                                            int var26 = var14[var24];
                                                            int var27 = var10[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var13[var24];
                                                            int var30 = var12[var24];
                                                            var7[var24] = ~var26 <= ~var27 ? -var27 + var26 : -var26 + var27;
                                                            var9[var24] = ~var29 > ~var30 ? var30 - var29 : -var30 + var29;
                                                            var8[var24] = var28 < var25 ? -var28 + var25 : -var25 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~class4.field116 < ~var31; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var13[var31];
                                                        int var34 = var10[var31];
                                                        int var35 = var12[var31];
                                                        int var36 = var14[var31];
                                                        int var37 = var15[var31];
                                                        var7[var31] = var36 < var34 ? var34 : var36;
                                                        var9[var31] = var35 > var33 ? var35 : var33;
                                                        var8[var31] = ~var32 >= ~var37 ? var37 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~class4.field116 < ~var38; ++var38) {
                                                    int var39 = var13[var38];
                                                    int var40 = var14[var38];
                                                    int var41 = var12[var38];
                                                    int var42 = var10[var38];
                                                    int var43 = var11[var38];
                                                    int var44 = var15[var38];
                                                    var7[var38] = ~var40 >= ~var42 ? var40 : var42;
                                                    var9[var38] = var41 >= var39 ? var39 : var41;
                                                    var8[var38] = ~var43 <= ~var44 ? var44 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class4.field116 > var45; ++var45) {
                                                int var46 = var11[var45];
                                                int var47 = var10[var45];
                                                int var48 = var12[var45];
                                                var7[var45] = var47 != 0 ? -((-var14[var45] + 4096 << 12) / var47) + 4096 : 0;
                                                var9[var45] = ~var48 != -1 ? 4096 - (4096 - var13[var45] << 12) / var48 : 0;
                                                var8[var45] = ~var46 != -1 ? -((-var15[var45] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~var49 > ~class4.field116; ++var49) {
                                            int var50 = var11[var49];
                                            int var51 = var12[var49];
                                            int var52 = var10[var49];
                                            var7[var49] = ~var52 != -4097 ? (var14[var49] << 12) / (-var52 + 4096) : 4096;
                                            var9[var49] = ~var51 == -4097 ? 4096 : (var13[var49] << 12) / (4096 - var51);
                                            var8[var49] = ~var50 != -4097 ? (var15[var49] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~class4.field116 < ~var53; ++var53) {
                                        int var54 = var14[var53];
                                        int var55 = var15[var53];
                                        int var56 = var13[var53];
                                        var7[var53] = ~var54 <= -2049 ? -((4096 - var54) * (-var10[var53] + 4096) >> 11) + 4096 : var10[var53] * var54 >> 11;
                                        var9[var53] = var56 < 2048 ? var12[var53] * var56 >> 11 : -((-var12[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                        var8[var53] = ~var55 > -2049 ? var11[var53] * var55 >> 11 : -((-var11[var53] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class4.field116; ++var57) {
                                    var7[var57] = -((-var10[var57] + 4096) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((-var12[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = 4096 - ((4096 - var11[var57]) * (-var15[var57] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var58 = 0; ~var58 > ~class4.field116; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var13[var58];
                                int var61 = var15[var58];
                                var7[var58] = ~var59 == -1 ? 4096 : (var10[var58] << 12) / var59;
                                var9[var58] = ~var60 == -1 ? 4096 : (var12[var58] << 12) / var60;
                                var8[var58] = ~var61 == -1 ? 4096 : (var11[var58] << 12) / var61;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class4.field116; ++var62) {
                            var7[var62] = var10[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; class4.field116 > var63; ++var63) {
                        var7[var63] = var10[var63] + -var14[var63];
                        var9[var63] = var12[var63] + -var13[var63];
                        var8[var63] = var11[var63] - var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; class4.field116 > var64; ++var64) {
                    var7[var64] = var10[var64] + var14[var64];
                    var9[var64] = var12[var64] + var13[var64];
                    var8[var64] = var11[var64] + var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field2590;
        if (arg0) {
            this.field2584 = 74;
        }
        int[] var3 = super.field2911.method77(arg1, -118);
        if (super.field2911.field287) {
            int[] var4 = this.method1323(0, -17707, arg1);
            int[] var5 = this.method1323(1, -17707, arg1);
            int var6 = this.field2584;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class4.field116; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class4.field116; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 <= var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class4.field116 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 > var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class4.field116; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 >= var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class4.field116 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class4.field116 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class4.field116 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class4.field116 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class4.field116 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class4.field116; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class4.field116 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class4.field116 < ~var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    public static final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2593;
        int var5 = 118 % ((arg1 - 1) / 60);
        for (int var6 = 0; class215.field3631 > var6; ++var6) {
            if (~arg0 > ~(class180.field2877[var6] + class17.field348[var6]) && ~(arg0 + arg4) < ~class180.field2877[var6] && ~arg3 > ~(class298.field4867[var6] + class159.field2607[var6]) && ~(arg2 + arg3) < ~class298.field4867[var6]) {
                class236.field3988[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field2589 = null;
        field2591 = null;
        if (arg0 != -1560301173) {
            method1183(-99, 97, 95, 2, -19);
        }
        field2585 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILuf;IIIII)V")
    public static final void method1185(int arg0, class46 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 25981) {
            method1184(17);
        }
        class36.method225(arg5, arg1.field771, arg2, 0, arg0, arg4, arg6, arg1.field715, true);
        ++field2587;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class158() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            field2591 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field2896 = ~arg1.method1802((byte) -88) == -2;
            }
        } else {
            this.field2584 = arg1.method1802((byte) 70);
        }
        ++field2588;
    }
}
