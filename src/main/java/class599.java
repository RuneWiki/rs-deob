import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class599 extends class56 {

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    private int field8110 = 6;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field8111 = 1406;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "Lifa;")
    public static class450 field8109 = new class450();

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field8115 = 0;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Lbt;")
    public static class48 field8106;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BB)Z")
    public static final boolean method3415(byte arg0, byte arg1) {
        ++field8112;
        if (arg1 != 39) {
            method3415((byte) 47, (byte) 85);
        }
        int var2 = arg0 & 255;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || ~var2 <= -161 || ~class88.field1183[var2 + -128] != -1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public static void method3416(byte arg0) {
        int var1 = 16 / ((arg0 - -70) / 34);
        field8109 = null;
        field8106 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
    public class599() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field8108;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int[][] var4 = this.method495(96, arg1, 0);
            int[][] var5 = this.method495(-55, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field8110;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class642.field8759; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var18 - (var18 * var21 >> 11) + var21;
                                                                var7[var16] = var19 + var20 - (var19 * var20 >> 11);
                                                                var8[var16] = -(var17 * var22 >> 11) + var17 + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class642.field8759 > var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var27 <= ~var28 ? -var28 + var27 : -var27 + var28;
                                                            var7[var23] = var24 >= var29 ? -var29 + var24 : -var24 + var29;
                                                            var8[var23] = ~var25 <= ~var26 ? -var26 + var25 : -var25 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class642.field8759; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = ~var35 >= ~var32 ? var32 : var35;
                                                        var7[var30] = ~var31 <= ~var33 ? var31 : var33;
                                                        var8[var30] = var34 > var36 ? var34 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class642.field8759 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = ~var40 <= ~var42 ? var42 : var40;
                                                    var7[var37] = var39 >= var43 ? var43 : var39;
                                                    var8[var37] = ~var38 > ~var41 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class642.field8759; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 != -1 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = var45 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var45) + 4096;
                                                var8[var44] = ~var47 != -1 ? 4096 - (4096 - var14[var44] << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class642.field8759 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class642.field8759 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((4096 - var54) * (-var9[var52] + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = var53 < 2048 ? var11[var52] * var53 >> 11 : 4096 - ((-var11[var52] + 4096) * (-var53 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class642.field8759 < ~var56; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12);
                                    var7[var56] = 4096 - ((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class642.field8759 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class642.field8759 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class642.field8759; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class642.field8759 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        if (arg0 < 35) {
            field8107 = 88;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lbn;I)I")
    public static final int method3417(class468 arg0, int arg1) {
        ++field8105;
        int var2 = arg0.method2802(2, -20468);
        int var3;
        if (var2 != 0) {
            if (var2 == 1) {
                var3 = arg0.method2802(5, -20468);
            } else if (var2 != 2) {
                var3 = arg0.method2802(11, -20468);
            } else {
                var3 = arg0.method2802(8, -20468);
            }
        } else {
            var3 = 0;
        }
        int var4 = 3 % ((-42 - arg1) / 59);
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field8113;
        if (arg0 < -44) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    super.field762 = ~arg2.method2396((byte) -89) == -2;
                }
            } else {
                this.field8110 = arg2.method2396((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field8114;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, arg1, (byte) 74);
            int[] var5 = this.method492(1, arg1, (byte) 71);
            int var6 = this.field8110;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class642.field8759; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class642.field8759 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class642.field8759 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class642.field8759 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class642.field8759 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class642.field8759; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class642.field8759; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class642.field8759; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class642.field8759 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class642.field8759; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class642.field8759 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class642.field8759 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg0 != 0) {
            this.method187((byte) 40, -108);
        }
        return var3;
    }
}
