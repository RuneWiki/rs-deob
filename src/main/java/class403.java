import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class403 extends class646 {

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    private int field5804 = 6;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "J")
    public static long field5802;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[[I")
    public final int[][] method298(int arg0, int arg1) {
        ++field5803;
        if (arg0 != -12424) {
            method2434((byte) 67, 108, (class345) null, 41);
        }
        int[][] var3 = super.field9164.method1002(89, arg1);
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(91, arg1, 0);
            int[][] var5 = this.method3626(125, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5804;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class89.field1330 < ~var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = -(var17 * var18 >> 11) + var17 - -var18;
                                                                var7[var16] = -(var19 * var22 >> 11) + var19 + var22;
                                                                var8[var16] = var20 - -var21 + -(var20 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class89.field1330; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = var29 >= var25 ? -var25 + var29 : -var29 + var25;
                                                            var7[var23] = ~var24 < ~var26 ? -var26 + var24 : var26 - var24;
                                                            var8[var23] = ~var27 <= ~var28 ? -var28 + var27 : -var27 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class89.field1330; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var36 <= var33 ? var33 : var36;
                                                        var7[var30] = ~var32 < ~var35 ? var32 : var35;
                                                        var8[var30] = var31 < var34 ? var34 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class89.field1330 > var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var38 < ~var43 ? var43 : var38;
                                                    var7[var37] = ~var39 <= ~var41 ? var41 : var39;
                                                    var8[var37] = var40 >= var42 ? var42 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class89.field1330 < ~var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var46 != 0 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class89.field1330 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class89.field1330 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((4096 - var55) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : 4096 - ((4096 - var10[var52]) * (-var54 + 4096) >> 11);
                                        var8[var52] = var53 >= 2048 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class89.field1330; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class89.field1330; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class89.field1330; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class89.field1330 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class89.field1330 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field9160 = arg0.method2705(-122) == 1;
            }
        } else {
            this.field5804 = arg0.method2705(-73);
        }
        if (arg2 < 7) {
            this.method298(102, 108);
        }
        ++field5806;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class403() {
        super(2, false);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public static final void method2433(int arg0) {
        ++field5801;
        class96.field1414 = true;
        if (arg0 >= -7) {
            method2433(-59);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field5805;
        if (arg1 != -120) {
            method2434((byte) 28, 85, (class345) null, 42);
        }
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0);
            int[] var5 = this.method3628(false, 1, arg0);
            int var6 = this.field5804;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; var7 < class89.field1330; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - -var8 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class89.field1330 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class89.field1330; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class89.field1330 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class89.field1330; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class89.field1330; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class89.field1330; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class89.field1330 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class89.field1330; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class89.field1330 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class89.field1330; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class89.field1330; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BILvo;I)Lqba;")
    public static final class369 method2434(byte arg0, int arg1, class345 arg2, int arg3) {
        ++field5807;
        class465 var4 = new class465(arg2.method2081(12, arg1, arg3));
        class369 var5 = new class369(arg1, var4.method2717(true), var4.method2717(true), var4.method2691((byte) -67), var4.method2691((byte) -67), var4.method2705(-97) == 1, var4.method2705(-56), var4.method2705(-114));
        int var6 = var4.method2705(-115);
        if (arg0 > -100) {
            field5802 = -37L;
        }
        for (int var7 = 0; var6 > var7; ++var7) {
            var5.field5100.method3904(new class180(var4.method2705(-122), var4.method2755((byte) -128), var4.method2755((byte) -74), var4.method2755((byte) -79), var4.method2755((byte) -102), var4.method2755((byte) -44), var4.method2755((byte) -85), var4.method2755((byte) -53), var4.method2755((byte) -94)), 0);
        }
        var5.method2206(0);
        return var5;
    }
}
