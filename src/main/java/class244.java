import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class244 extends class30 {

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    private int field3323 = 6;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "Lem;")
    public static class206 field3319 = new class206(77, 2);

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "[I")
    public static int[] field3322;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field3321;
        if (arg0 != 1) {
            field3325 = 83;
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) -107);
            int[] var5 = this.method294(arg1, 1, (byte) -106);
            int var6 = this.field3323;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class31.field399 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class31.field399; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class31.field399 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class31.field399 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class31.field399 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class31.field399 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class31.field399; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class31.field399 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class31.field399; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class31.field399; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class31.field399 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class31.field399; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
    public static final void method1509(boolean arg0) {
        class647.field8937.method1515(31579);
        ++field3316;
        class418.method2429((byte) 2);
        class108.field1503 = null;
        class131.field1890 = null;
        class37.field444 = 0;
        class687.field9800 = null;
        class219.field3066 = 0;
        class660.field9184.field6892 = 0;
        class230.method1451(-25130);
        class671.field9419 = 0;
        class56.field633 = 0;
        class174.field2525 = null;
        class533.field7204 = 0;
        if (!arg0) {
            field3322 = null;
        }
        class347.field4641 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1510(int arg0, boolean arg1) {
        if (!arg1) {
            field3322 = null;
        }
        ++field3320;
        return ~arg0 <= -1 && arg0 <= 3 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field3317;
        if (arg1 != 7) {
            return null;
        } else {
            int[][] var3 = super.field377.method3683(arg0, (byte) 119);
            if (super.field377.field9085) {
                int[][] var4 = this.method292(104, 0, arg0);
                int[][] var5 = this.method292(74, 1, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field3323;
                if (~var15 != -2) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (~var15 != -5) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; var16 < class31.field399; ++var16) {
                                                                    int var17 = var13[var16];
                                                                    int var18 = var11[var16];
                                                                    int var19 = var9[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var12[var16];
                                                                    int var22 = var10[var16];
                                                                    var6[var16] = var19 + var21 - (var19 * var21 >> 11);
                                                                    var7[var16] = var22 - -var17 - (var17 * var22 >> 11);
                                                                    var8[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class31.field399 > var23; ++var23) {
                                                                int var24 = var11[var23];
                                                                int var25 = var9[var23];
                                                                int var26 = var12[var23];
                                                                int var27 = var14[var23];
                                                                int var28 = var13[var23];
                                                                int var29 = var10[var23];
                                                                var6[var23] = ~var25 >= ~var26 ? -var25 + var26 : -var26 + var25;
                                                                var7[var23] = var28 >= var29 ? -var29 + var28 : -var28 + var29;
                                                                var8[var23] = var24 <= var27 ? -var24 + var27 : -var27 + var24;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class31.field399; ++var30) {
                                                            int var31 = var9[var30];
                                                            int var32 = var10[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var13[var30];
                                                            int var35 = var12[var30];
                                                            int var36 = var14[var30];
                                                            var6[var30] = ~var31 >= ~var35 ? var35 : var31;
                                                            var7[var30] = ~var32 < ~var34 ? var32 : var34;
                                                            var8[var30] = ~var33 >= ~var36 ? var36 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; class31.field399 > var37; ++var37) {
                                                        int var38 = var11[var37];
                                                        int var39 = var13[var37];
                                                        int var40 = var9[var37];
                                                        int var41 = var14[var37];
                                                        int var42 = var10[var37];
                                                        int var43 = var12[var37];
                                                        var6[var37] = var40 < var43 ? var40 : var43;
                                                        var7[var37] = var42 >= var39 ? var39 : var42;
                                                        var8[var37] = var38 < var41 ? var38 : var41;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~class31.field399 < ~var44; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var10[var44];
                                                    int var47 = var9[var44];
                                                    var6[var44] = var47 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var47;
                                                    var7[var44] = ~var46 != -1 ? 4096 - (-var13[var44] + 4096 << 12) / var46 : 0;
                                                    var8[var44] = var45 != 0 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class31.field399 > var48; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var10[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (4096 - var49) : 4096;
                                                var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                                var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; class31.field399 > var52; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var12[var52];
                                            int var55 = var13[var52];
                                            var6[var52] = var54 >= 2048 ? -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                            var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                            var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((4096 - var11[var52]) * (-var53 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class31.field399; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class31.field399 > var57; ++var57) {
                                    int var58 = var13[var57];
                                    int var59 = var12[var57];
                                    int var60 = var14[var57];
                                    var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                    var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                    var8[var57] = ~var60 == -1 ? 4096 : (var11[var57] << 12) / var60;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~var61 > ~class31.field399; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; class31.field399 > var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; class31.field399 > var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
    public class244() {
        super(2, false);
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(B)V")
    public static void method1511(byte arg0) {
        field3322 = null;
        if (arg0 > 71) {
            field3319 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field378 = arg2.method2874((byte) -75) == 1;
            }
        } else {
            this.field3323 = arg2.method2874((byte) -75);
        }
        ++field3318;
        if (arg0 < 100) {
            this.field3323 = -11;
        }
    }
}
