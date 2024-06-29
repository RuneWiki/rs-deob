import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class187 extends class224 {

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    private int field2945 = 6;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    public static final void method1298(int arg0) {
        class145.field2135.method1420(~arg0);
        class207.field3234.method1420(arg0 + -1);
        class168.field2596.method1420(-1);
        ++field2947;
        if (arg0 != 0) {
            method1298(90);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            this.method15(-13, -38);
        }
        ++field2949;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(arg0, 0, (byte) 84);
            int[] var5 = this.method1527(arg0, 1, (byte) 84);
            int var6 = this.field2945;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~class78.field1108 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class78.field1108; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 < var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class78.field1108 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class78.field1108; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 < var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class78.field1108; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class78.field1108; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class78.field1108; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class78.field1108 > var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class78.field1108; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class78.field1108; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class78.field1108 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class78.field1108 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field3624 = ~arg0.method201(255) == -2;
            }
        } else {
            this.field2945 = arg0.method201(255);
        }
        ++field2943;
        if (arg2 > -46) {
            method1299(-87, 54);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)V")
    public static final void method1299(int arg0, int arg1) {
        if (arg0 != 0) {
            field2950 = -37;
        }
        ++field2952;
        if (class6.field86 == null || ~arg1 < ~class6.field86.length) {
            class6.field86 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class187() {
        super(2, false);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(III)Z")
    public static final boolean method1300(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        if (arg0 != 8) {
            field2950 = 13;
        }
        class181 var3 = class25.method224(arg1, 0);
        ++field2948;
        return var3.method1265(-116, arg2);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field2944;
        if (arg1 != 1) {
            this.method16((class25) null, 111, (byte) -30);
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(arg1 + 76, 0, arg0);
            int[][] var5 = this.method1532(67, 1, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var4[1];
            int[] var9 = var3[0];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2945;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class78.field1108; ++var16) {
                                                                int var17 = var8[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var9[var16] = -(var20 * var21 >> 11) + var21 + var20;
                                                                var6[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                                var7[var16] = var22 - (var19 * var22 >> 11) + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class78.field1108; ++var23) {
                                                            int var24 = var8[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var11[var23];
                                                            var9[var23] = ~var26 > ~var29 ? -var26 + var29 : var26 - var29;
                                                            var6[var23] = var25 >= var24 ? -var24 + var25 : -var25 + var24;
                                                            var7[var23] = var28 >= var27 ? -var27 + var28 : var27 - var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class78.field1108 > var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var8[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var12[var30];
                                                        var9[var30] = var35 <= var36 ? var36 : var35;
                                                        var6[var30] = ~var33 <= ~var34 ? var33 : var34;
                                                        var7[var30] = ~var32 > ~var31 ? var31 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class78.field1108; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var8[var37];
                                                    int var43 = var10[var37];
                                                    var9[var37] = var40 < var41 ? var40 : var41;
                                                    var6[var37] = ~var42 <= ~var39 ? var39 : var42;
                                                    var7[var37] = ~var43 <= ~var38 ? var38 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class78.field1108; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var8[var44];
                                                var9[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var6[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class78.field1108; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var8[var48];
                                            int var51 = var10[var48];
                                            var9[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var49);
                                            var6[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class78.field1108 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var9[var52] = var55 >= 2048 ? -((4096 - var55) * (-var11[var52] + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                        var6[var52] = var54 < 2048 ? var8[var52] * var54 >> 11 : 4096 - ((-var8[var52] + 4096) * (-var54 + 4096) >> 11);
                                        var7[var52] = ~var53 > -2049 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class78.field1108; ++var56) {
                                    var9[var56] = -((4096 - var11[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = 4096 - ((4096 - var8[var56]) * (-var13[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class78.field1108; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var9[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                                var6[var57] = var58 != 0 ? (var8[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class78.field1108 > var61; ++var61) {
                            var9[var61] = var11[var61] * var12[var61] >> 12;
                            var6[var61] = var8[var61] * var13[var61] >> 12;
                            var7[var61] = var10[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class78.field1108 > var62; ++var62) {
                        var9[var62] = var11[var62] + -var12[var62];
                        var6[var62] = var8[var62] - var13[var62];
                        var7[var62] = var10[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class78.field1108; ++var63) {
                    var9[var63] = var11[var63] + var12[var63];
                    var6[var63] = var8[var63] - -var13[var63];
                    var7[var63] = var10[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
    public static final void method1301(int arg0, byte arg1) {
        if (arg1 > -91) {
            field2946 = -31;
        }
        ++field2951;
        class287 var2 = class261.method1786(arg0, false, 11);
        var2.method1912((byte) 96);
    }
}
