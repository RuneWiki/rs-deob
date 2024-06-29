import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class13 extends class34 {

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    private int field188 = 6;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "Ljava/lang/String;")
    public static String field189 = "Please wait...";

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[I")
    public static int[] field187;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field604 = arg2.method407(255) == 1;
            }
        } else {
            this.field188 = arg2.method407(255);
        }
        if (arg0 != 6) {
            this.method50(-27, -121, (class54) null);
        }
        ++field186;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method89(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class44.field772 * arg0 + class185.field2692 * arg3 >> 16;
        int var6 = class44.field772 * arg3 - class185.field2692 * arg0 >> 16;
        int var7 = class69.field1140 * var6 + class153.field2241 * arg1 >> 16;
        int var8 = class69.field1140 * arg1 - class153.field2241 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class69.field1140 * var6 + class153.field2241 * arg2 >> 16;
        int var12 = class69.field1140 * arg2 - class153.field2241 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class223.field3465 && var13 < class223.field3465) {
            return false;
        } else if (var9 > class114.field1742 && var13 > class114.field1742) {
            return false;
        } else if (var10 < class81.field1265 && var14 < class81.field1265) {
            return false;
        } else {
            return var10 <= class167.field2467 || var14 <= class167.field2467;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class13() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field191;
        if (arg0 <= 75) {
            field193 = 108;
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[] var4 = this.method230(arg1, -15337, 0);
            int[] var5 = this.method230(arg1, -15337, 1);
            int var6 = this.field188;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class226.field3527; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class226.field3527 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 <= ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class226.field3527; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class226.field3527 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class226.field3527; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class226.field3527 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class226.field3527 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class226.field3527 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class226.field3527; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class226.field3527 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class226.field3527 < ~var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class226.field3527; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = 46 / ((-54 - arg0) / 44);
        int[][] var4 = super.field618.method91(-111, arg1);
        if (super.field618.field211) {
            int[][] var5 = this.method231(arg1, (byte) 122, 0);
            int[][] var6 = this.method231(arg1, (byte) 94, 1);
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[0];
            int[] var11 = var6[0];
            int[] var12 = var5[2];
            int[] var13 = var5[1];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field188;
            if (~var16 != -2) {
                if (var16 != 2) {
                    if (~var16 != -4) {
                        if (var16 != 4) {
                            if (var16 != 5) {
                                if (var16 != 6) {
                                    if (~var16 != -8) {
                                        if (~var16 != -9) {
                                            if (~var16 != -10) {
                                                if (var16 != 10) {
                                                    if (~var16 != -12) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~class226.field3527 < ~var17; ++var17) {
                                                                int var18 = var10[var17];
                                                                int var19 = var11[var17];
                                                                int var20 = var14[var17];
                                                                int var21 = var15[var17];
                                                                int var22 = var13[var17];
                                                                int var23 = var12[var17];
                                                                var8[var17] = -(var18 * var19 >> 11) + var18 + var19;
                                                                var9[var17] = var20 + var22 + -(var20 * var22 >> 11);
                                                                var7[var17] = var21 + var23 - (var21 * var23 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; var24 < class226.field3527; ++var24) {
                                                            int var25 = var15[var24];
                                                            int var26 = var12[var24];
                                                            int var27 = var11[var24];
                                                            int var28 = var13[var24];
                                                            int var29 = var10[var24];
                                                            int var30 = var14[var24];
                                                            var8[var24] = var27 < var29 ? -var27 + var29 : -var29 + var27;
                                                            var9[var24] = ~var30 <= ~var28 ? var30 - var28 : -var30 + var28;
                                                            var7[var24] = var25 >= var26 ? -var26 + var25 : -var25 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; class226.field3527 > var31; ++var31) {
                                                        int var32 = var13[var31];
                                                        int var33 = var15[var31];
                                                        int var34 = var11[var31];
                                                        int var35 = var10[var31];
                                                        int var36 = var14[var31];
                                                        int var37 = var12[var31];
                                                        var8[var31] = ~var34 > ~var35 ? var35 : var34;
                                                        var9[var31] = var32 > var36 ? var32 : var36;
                                                        var7[var31] = ~var37 < ~var33 ? var37 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~var38 > ~class226.field3527; ++var38) {
                                                    int var39 = var14[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var12[var38];
                                                    int var42 = var10[var38];
                                                    int var43 = var13[var38];
                                                    int var44 = var11[var38];
                                                    var8[var38] = ~var44 < ~var42 ? var42 : var44;
                                                    var9[var38] = ~var43 > ~var39 ? var43 : var39;
                                                    var7[var38] = ~var40 < ~var41 ? var41 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~class226.field3527 < ~var45; ++var45) {
                                                int var46 = var10[var45];
                                                int var47 = var12[var45];
                                                int var48 = var13[var45];
                                                var8[var45] = ~var46 == -1 ? 0 : -((-var11[var45] + 4096 << 12) / var46) + 4096;
                                                var9[var45] = var48 != 0 ? -((-var14[var45] + 4096 << 12) / var48) + 4096 : 0;
                                                var7[var45] = var47 == 0 ? 0 : -((4096 - var15[var45] << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~var49 > ~class226.field3527; ++var49) {
                                            int var50 = var12[var49];
                                            int var51 = var13[var49];
                                            int var52 = var10[var49];
                                            var8[var49] = var52 != 4096 ? (var11[var49] << 12) / (-var52 + 4096) : 4096;
                                            var9[var49] = var51 == 4096 ? 4096 : (var14[var49] << 12) / (-var51 + 4096);
                                            var7[var49] = var50 != 4096 ? (var15[var49] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~class226.field3527 < ~var53; ++var53) {
                                        int var54 = var14[var53];
                                        int var55 = var15[var53];
                                        int var56 = var11[var53];
                                        var8[var53] = ~var56 > -2049 ? var10[var53] * var56 >> 11 : -((-var10[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                        var9[var53] = var54 >= 2048 ? -((4096 - var13[var53]) * (-var54 + 4096) >> 11) + 4096 : var13[var53] * var54 >> 11;
                                        var7[var53] = ~var55 > -2049 ? var12[var53] * var55 >> 11 : -((-var12[var53] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class226.field3527 > var57; ++var57) {
                                    var8[var57] = 4096 - ((-var10[var57] + 4096) * (-var11[var57] + 4096) >> 12);
                                    var9[var57] = -((4096 - var14[var57]) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var7[var57] = -((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class226.field3527 < ~var58; ++var58) {
                                int var59 = var11[var58];
                                int var60 = var15[var58];
                                int var61 = var14[var58];
                                var8[var58] = var59 != 0 ? (var10[var58] << 12) / var59 : 4096;
                                var9[var58] = ~var61 != -1 ? (var13[var58] << 12) / var61 : 4096;
                                var7[var58] = ~var60 == -1 ? 4096 : (var12[var58] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class226.field3527 < ~var62; ++var62) {
                            var8[var62] = var10[var62] * var11[var62] >> 12;
                            var9[var62] = var13[var62] * var14[var62] >> 12;
                            var7[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; class226.field3527 > var63; ++var63) {
                        var8[var63] = var10[var63] + -var11[var63];
                        var9[var63] = var13[var63] - var14[var63];
                        var7[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class226.field3527 < ~var64; ++var64) {
                    var8[var64] = var10[var64] - -var11[var64];
                    var9[var64] = var13[var64] + var14[var64];
                    var7[var64] = var12[var64] + var15[var64];
                }
            }
        }
        ++field192;
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static void method90(int arg0) {
        field189 = null;
        field187 = null;
        if (arg0 != 4096) {
            method90(90);
        }
    }
}
