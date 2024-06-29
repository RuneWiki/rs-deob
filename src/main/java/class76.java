import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class76 extends class135 {

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    private int field1089 = 6;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "[S")
    public static short[] field1086 = new short[256];

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[Z")
    public static boolean[] field1087 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Lqj;")
    private static class196 field1093 = class80.method502("Loaded textures", -48);

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "B")
    public static byte field1098 = 0;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lqj;")
    public static class196 field1091 = field1093;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "[I")
    public static int[] field1100 = new int[2];

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "Lbk;")
    public static class136 field1103;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lec;")
    public static class178 field1101;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "Ll;")
    public static class190 field1097;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lnb;")
    public static class95 field1088;

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class76() {
        super(2, false);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1962 = arg0.method367(1) == 1;
            }
        } else {
            this.field1089 = arg0.method367(1);
        }
        if (arg2 != -16231) {
            this.method164(-60, -72);
        }
        ++field1099;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public static void method476(int arg0) {
        field1103 = null;
        if (arg0 == -13) {
            field1097 = null;
            field1088 = null;
            field1093 = null;
            field1086 = null;
            field1087 = null;
            field1100 = null;
            field1101 = null;
            field1091 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field1090;
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(2, arg1, 0);
            int[][] var5 = this.method818(2, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var4[2];
            int[] var14 = var5[2];
            int var15 = this.field1089;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class131.field1862; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var19 - -var22 + -(var19 * var22 >> 11);
                                                                var8[var16] = var20 - -var21 - (var20 * var21 >> 11);
                                                                var7[var16] = -(var17 * var18 >> 11) + var18 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class131.field1862; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = var24 >= var26 ? var24 - var26 : -var24 + var26;
                                                            var8[var23] = var25 <= var27 ? var27 - var25 : var25 - var27;
                                                            var7[var23] = ~var28 > ~var29 ? -var28 + var29 : var28 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class131.field1862; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = var36 >= var31 ? var36 : var31;
                                                        var8[var30] = ~var32 >= ~var34 ? var34 : var32;
                                                        var7[var30] = ~var33 > ~var35 ? var35 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class131.field1862; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = var40 < var43 ? var40 : var43;
                                                    var8[var37] = ~var42 < ~var41 ? var41 : var42;
                                                    var7[var37] = var39 <= var38 ? var39 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class131.field1862; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var13[var44];
                                                var6[var44] = ~var45 != -1 ? -((-var11[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = var46 != 0 ? 4096 - (-var12[var44] + 4096 << 12) / var46 : 0;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class131.field1862 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var13[var48];
                                            var6[var48] = var50 != 4096 ? (var11[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class131.field1862 > var52; ++var52) {
                                        int var53 = var11[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = var55 >= 2048 ? 4096 - ((4096 - var55) * (-var10[var52] + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var7[var52] = ~var54 > -2049 ? var13[var52] * var54 >> 11 : -((-var13[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class131.field1862; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var10[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var13[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class131.field1862 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var11[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var60 != -1 ? (var13[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class131.field1862; ++var61) {
                            var6[var61] = var9[var61] * var11[var61] >> 12;
                            var8[var61] = var10[var61] * var12[var61] >> 12;
                            var7[var61] = var13[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class131.field1862 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var11[var62];
                        var8[var62] = var10[var62] - var12[var62];
                        var7[var62] = var13[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class131.field1862 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var11[var63];
                    var8[var63] = var10[var63] - -var12[var63];
                    var7[var63] = var13[var63] + var14[var63];
                }
            }
        }
        return arg0 != 260028743 ? null : var3;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)I")
    public static final int method477(int arg0) {
        ++field1085;
        if (arg0 != 27725) {
            field1091 = null;
        }
        return class60.field802;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lbk;I)V")
    public static final void method478(class136 arg0, int arg1) {
        ++field1095;
        class179.field3167 = arg0.method833((byte) -97, class130.field1857);
        int var2 = 99 % ((-77 - arg1) / 46);
        class85.field1251 = arg0.method833((byte) -112, class3.field24);
        class215.field3877 = arg0.method833((byte) -81, class234.field4158);
        class151.field2445 = arg0.method833((byte) -51, class181.field3189);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            method476(-51);
        }
        ++field1092;
        int[] var3 = super.field1954.method110(arg0, -119);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-113, 0, arg0);
            int[] var5 = this.method819(-118, 1, arg0);
            int var6 = this.field1089;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class131.field1862; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class131.field1862; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class131.field1862; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class131.field1862 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class131.field1862 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (4096 - var5[var19] << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class131.field1862; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class131.field1862 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class131.field1862; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class131.field1862 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class131.field1862 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class131.field1862 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class131.field1862 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }
}
