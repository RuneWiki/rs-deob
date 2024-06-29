import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class137 extends class167 {

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    private int field2475 = 6;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "[[B")
    public static byte[][] field2471 = new byte[250][];

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "Lkh;")
    public static class117 field2474 = class224.method1450((byte) 110, "scrollen:");

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Lkh;")
    public static class117 field2470 = class224.method1450((byte) -77, "<col=c0ff00>");

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field2479 = 0;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "Ldb;")
    public static class36 field2477 = new class36();

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static volatile int field2482 = -1;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "[I")
    public static int[] field2483 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "[I")
    public static int[] field2481;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "[Lch;")
    public static class31[] field2476;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V")
    public static void method917(byte arg0) {
        field2474 = null;
        field2483 = null;
        field2471 = null;
        field2481 = null;
        field2477 = null;
        int var1 = -19 / ((-9 - arg0) / 49);
        field2470 = null;
        field2476 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field2478;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (arg1 != -9179) {
            this.method116(-95, 13);
        }
        if (super.field3022.field2957) {
            int[][] var4 = this.method1180(arg0, 26851, 0);
            int[][] var5 = this.method1180(arg0, 26851, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2475;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class115.field2146 < ~var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = -(var21 * var22 >> 11) + var21 + var22;
                                                                var7[var16] = -(var18 * var20 >> 11) + var20 + var18;
                                                                var8[var16] = -(var17 * var19 >> 11) + var19 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class115.field2146; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var27 <= var26 ? var26 - var27 : -var26 + var27;
                                                            var7[var23] = var25 < var28 ? var28 - var25 : -var28 + var25;
                                                            var8[var23] = ~var24 <= ~var29 ? -var29 + var24 : -var24 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class115.field2146; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = var35 >= var31 ? var35 : var31;
                                                        var7[var30] = ~var33 > ~var32 ? var32 : var33;
                                                        var8[var30] = ~var34 < ~var36 ? var34 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class115.field2146 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = ~var42 <= ~var41 ? var41 : var42;
                                                    var7[var37] = var40 <= var38 ? var40 : var38;
                                                    var8[var37] = var43 > var39 ? var39 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class115.field2146 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var45 : 0;
                                                var7[var44] = ~var47 == -1 ? 0 : -((4096 - var13[var44] << 12) / var47) + 4096;
                                                var8[var44] = ~var46 != -1 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class115.field2146; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class115.field2146; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 <= -2049 ? -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var53 > -2049 ? var10[var52] * var53 >> 11 : -((4096 - var10[var52]) * (4096 - var53) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class115.field2146; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var13[var56]) * (-var11[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var10[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class115.field2146 < ~var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; class115.field2146 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var11[var61] * var13[var61] >> 12;
                            var8[var61] = var10[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class115.field2146; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var11[var62] + -var13[var62];
                        var8[var62] = var10[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class115.field2146; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var11[var63] + var13[var63];
                    var8[var63] = var10[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            field2472 = -11;
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        ++field2480;
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, 0, 0);
            int[] var5 = this.method1186(arg1, arg0 + 96, 1);
            int var6 = this.field2475;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class115.field2146 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class115.field2146 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 <= var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class115.field2146; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class115.field2146; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 >= var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class115.field2146 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class115.field2146; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class115.field2146 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (4096 - var24) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class115.field2146 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class115.field2146 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class115.field2146; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class115.field2146; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class115.field2146; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field2473;
        if (arg1) {
            this.field2475 = -128;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3009 = arg0.method998(75) == 1;
            }
        } else {
            this.field2475 = arg0.method998(107);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class137() {
        super(2, false);
    }
}
