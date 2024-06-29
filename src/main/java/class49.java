import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class49 extends class89 {

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    private int field824 = 6;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lda;")
    public static class275 field821 = class255.method1672(106, "::tele ");

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[[[B")
    public static byte[][][] field817;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        int[] var3 = super.field1503.method229(arg0, (byte) -121);
        ++field819;
        if (arg1) {
            method312(-110);
        }
        if (super.field1503.field664) {
            int[] var4 = this.method645(63, 0, arg0);
            int[] var5 = this.method645(-125, 1, arg0);
            int var6 = this.field824;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class65.field1070; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - (var8 * var9 >> 11) + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class65.field1070 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class65.field1070 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class65.field1070; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class65.field1070 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class65.field1070; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class65.field1070 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class65.field1070 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class65.field1070 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class65.field1070 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class65.field1070 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class65.field1070 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)[Lwb;")
    public static final class179[] method311(int arg0) {
        ++field820;
        class179[] var1 = new class179[class151.field2633];
        int var2 = -86 % ((-34 - arg0) / 55);
        for (int var3 = 0; var3 < class151.field2633; ++var3) {
            int var4 = class32.field480[var3] * class152.field2662[var3];
            byte[] var5 = class67.field1101[var3];
            if (!class158.field2775[var3]) {
                int[] var6 = new int[var4];
                for (int var7 = 0; ~var7 > ~var4; ++var7) {
                    var6[var7] = class270.field4695[class19.method98(var5[var7], 255)];
                }
                var1[var3] = new class259(class267.field4646, class250.field4419, class114.field2010[var3], class246.field4357[var3], class152.field2662[var3], class32.field480[var3], var6);
            } else {
                int[] var8 = new int[var4];
                byte[] var9 = class144.field2520[var3];
                for (int var10 = 0; ~var10 > ~var4; ++var10) {
                    var8[var10] = class246.method1612(class270.field4695[class19.method98(255, var5[var10])], class19.method98(255, var9[var10]) << 24);
                }
                var1[var3] = new class101(class267.field4646, class250.field4419, class114.field2010[var3], class246.field4357[var3], class152.field2662[var3], class32.field480[var3], var8);
            }
        }
        class134.method978(-90);
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class49() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
    public static void method312(int arg0) {
        field821 = null;
        if (arg0 == 0) {
            field817 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field1508 = ~arg1.method564((byte) 75) == -2;
            }
        } else {
            this.field824 = arg1.method564((byte) 100);
        }
        ++field818;
        if (arg0 != -20503) {
            method311(116);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field823;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (!arg0) {
            field821 = null;
        }
        if (super.field1512.field2007) {
            int[][] var4 = this.method648(true, 0, arg1);
            int[][] var5 = this.method648(true, 1, arg1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field824;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class65.field1070 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var7[var16] = var18 + var22 - (var18 * var22 >> 11);
                                                                var6[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                                var8[var16] = var19 + var21 - (var19 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class65.field1070 > var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var14[var23];
                                                            var7[var23] = var24 < var26 ? var26 - var24 : -var26 + var24;
                                                            var6[var23] = ~var25 >= ~var28 ? -var25 + var28 : -var28 + var25;
                                                            var8[var23] = ~var27 >= ~var29 ? -var27 + var29 : -var29 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class65.field1070 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var10[var30];
                                                        var7[var30] = ~var33 < ~var35 ? var33 : var35;
                                                        var6[var30] = ~var32 <= ~var36 ? var32 : var36;
                                                        var8[var30] = ~var31 <= ~var34 ? var31 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class65.field1070; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var12[var37];
                                                    var7[var37] = ~var39 > ~var43 ? var39 : var43;
                                                    var6[var37] = ~var40 > ~var42 ? var40 : var42;
                                                    var8[var37] = var41 >= var38 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class65.field1070; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var7[var44] = var45 != 0 ? -((4096 - var12[var44] << 12) / var45) + 4096 : 0;
                                                var6[var44] = var46 != 0 ? -((4096 - var13[var44] << 12) / var46) + 4096 : 0;
                                                var8[var44] = ~var47 == -1 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class65.field1070; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var7[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (4096 - var51) : 4096;
                                            var6[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class65.field1070 < ~var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var7[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var6[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = var55 >= 2048 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class65.field1070 > var56; ++var56) {
                                    var7[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class65.field1070 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var7[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var6[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class65.field1070 > var61; ++var61) {
                            var7[var61] = var9[var61] * var12[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class65.field1070 > var62; ++var62) {
                        var7[var62] = var9[var62] - var12[var62];
                        var6[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class65.field1070 < ~var63; ++var63) {
                    var7[var63] = var9[var63] + var12[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lma;IZI)[Lwb;")
    public static final class179[] method313(class105 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field821 = null;
        }
        ++field825;
        return !class210.method1353(arg1, arg0, arg3, (byte) -120) ? null : class139.method1001((byte) -2);
    }
}
