import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class345 extends class17 {

    @OriginalMember(owner = "client!mw", name = "M", descriptor = "I")
    private int field5012 = 6;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "[Z")
    public static boolean[] field5005 = new boolean[8];

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "[Z")
    public static boolean[] field5006 = new boolean[5];

    @OriginalMember(owner = "client!mw", name = "L", descriptor = "[Ltt;")
    public static class62[] field5011 = new class62[6];

    @OriginalMember(owner = "client!mw", name = "H", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!mw", name = "K", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!mw", name = "N", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "Ldf;")
    public static class279 field5009;

    static {
        new class530((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "(I)V", line = 8)
    public static void method2052(int arg0) {
        field5009 = null;
        field5006 = null;
        field5011 = null;
        if (arg0 != 15322) {
            method2052(-102);
        }
        field5005 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IB)[[I", line = 22)
    public final int[][] method89(int arg0, byte arg1) {
        ++field5008;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            return null;
        } else {
            if (super.field201.field4431) {
                int[][] var4 = this.method91(0, 0, arg0);
                int[][] var5 = this.method91(1, 0, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field5012;
                if (var15 != 1) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (var15 != 10) {
                                                        if (~var15 != -12) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; class530.field7763 > var16; ++var16) {
                                                                    int var17 = var14[var16];
                                                                    int var18 = var13[var16];
                                                                    int var19 = var11[var16];
                                                                    int var20 = var9[var16];
                                                                    int var21 = var10[var16];
                                                                    int var22 = var12[var16];
                                                                    var6[var16] = var20 + var22 - (var20 * var22 >> 11);
                                                                    var7[var16] = -(var18 * var21 >> 11) + var18 + var21;
                                                                    var8[var16] = var19 - -var17 + -(var17 * var19 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; var23 < class530.field7763; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var10[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var13[var23];
                                                                int var28 = var9[var23];
                                                                int var29 = var11[var23];
                                                                var6[var23] = var24 >= var28 ? -var28 + var24 : -var24 + var28;
                                                                var7[var23] = ~var27 <= ~var25 ? var27 - var25 : -var27 + var25;
                                                                var8[var23] = ~var29 < ~var26 ? var29 - var26 : -var29 + var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class530.field7763; ++var30) {
                                                            int var31 = var9[var30];
                                                            int var32 = var12[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var14[var30];
                                                            int var35 = var10[var30];
                                                            int var36 = var13[var30];
                                                            var6[var30] = ~var32 > ~var31 ? var31 : var32;
                                                            var7[var30] = var36 >= var35 ? var36 : var35;
                                                            var8[var30] = ~var34 <= ~var33 ? var34 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; class530.field7763 > var37; ++var37) {
                                                        int var38 = var9[var37];
                                                        int var39 = var10[var37];
                                                        int var40 = var11[var37];
                                                        int var41 = var13[var37];
                                                        int var42 = var12[var37];
                                                        int var43 = var14[var37];
                                                        var6[var37] = var42 <= var38 ? var42 : var38;
                                                        var7[var37] = var41 <= var39 ? var41 : var39;
                                                        var8[var37] = var40 < var43 ? var40 : var43;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class530.field7763; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var10[var44];
                                                    var6[var44] = ~var46 != -1 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                    var7[var44] = var47 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                    var8[var44] = ~var45 != -1 ? 4096 - (4096 - var14[var44] << 12) / var45 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class530.field7763 > var48; ++var48) {
                                                int var49 = var11[var48];
                                                int var50 = var9[var48];
                                                int var51 = var10[var48];
                                                var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                                var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                                var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class530.field7763 < ~var52; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var12[var52];
                                            int var55 = var13[var52];
                                            var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : 4096 - ((4096 - var54) * (-var9[var52] + 4096) >> 11);
                                            var7[var52] = ~var55 <= -2049 ? -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                            var8[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var11[var52]) * (-var53 + 4096) >> 11) : var11[var52] * var53 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; ~var56 > ~class530.field7763; ++var56) {
                                        var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~class530.field7763 < ~var57; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var14[var57];
                                    int var60 = var13[var57];
                                    var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                    var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                    var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                                }
                            }
                        } else {
                            for (int var61 = 0; class530.field7763 > var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class530.field7763; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] - var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; class530.field7763 > var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] - -var13[var63];
                        var8[var63] = var11[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lwm;II)V", line = 339)
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field5007;
        if (arg2 != 5159) {
            this.method34((class403) null, -35, 90);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field205 = arg0.method2357((byte) 122) == 1;
            }
        } else {
            this.field5012 = arg0.method2357((byte) 111);
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V", line = 379)
    public class345() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[I", line = 397)
    public final int[] method27(int arg0, int arg1) {
        ++field5013;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            int[] var5 = this.method88(arg0, -4526, 1);
            int var6 = this.field5012;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~class530.field7763 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class530.field7763; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class530.field7763; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class530.field7763 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class530.field7763; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class530.field7763 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class530.field7763 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class530.field7763; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class530.field7763; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class530.field7763; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class530.field7763 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class530.field7763; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return arg1 < 53 ? null : var3;
    }
}
