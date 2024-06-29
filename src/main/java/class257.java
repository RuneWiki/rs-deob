import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class257 extends class117 {

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    private int field4504 = 6;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "[S")
    public static short[] field4498 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4496 = 2;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "[I")
    public static int[] field4494 = new int[1000];

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "Lhh;")
    private static class163 field4506 = class137.method1065("OFF", 17);

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "Lhh;")
    public static class163 field4502 = field4506;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "[I")
    public static int[] field4508 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "[I")
    public static int[] field4505;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILta;Lta;IIIIJ)V")
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, class165 arg4, class165 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class93 var12 = new class93();
            var12.field1755 = arg10;
            var12.field1758 = arg1 * 128 + 64;
            var12.field1759 = arg2 * 128 + 64;
            var12.field1753 = arg3;
            var12.field1748 = arg4;
            var12.field1749 = arg5;
            var12.field1766 = arg6;
            var12.field1752 = arg7;
            var12.field1756 = arg8;
            var12.field1769 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class259.field4542[var13][arg1][arg2] == null) {
                    class259.field4542[var13][arg1][arg2] = new class144(var13, arg1, arg2);
                }
            }
            class259.field4542[arg0][arg1][arg2].field2742 = var12;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lhh;I)V")
    public static final void method1736(class163 arg0, int arg1) {
        class48.method345(false);
        if (arg1 >= -110) {
            field4498 = null;
        }
        class50.method357(arg0, (byte) 112);
        ++field4495;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILqh;)V")
    public static final void method1737(int arg0, int arg1, int arg2, int arg3, class69 arg4) {
        if (class22.field351 < 3) {
            ((class105) class231.field4133).method105(arg3, arg2, arg4.field1183, arg4.field1220, class231.field4133.field1336 / 2, class231.field4133.field1337 / 2, class93.field1750, 256, arg4.field1262, arg4.field1306);
        } else {
            class206.method1477(arg3, arg2, 0, arg4.field1262, arg4.field1306);
        }
        class91.field1671[arg0] = true;
        if (arg1 == -4235) {
            ++field4503;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        int[][] var3 = super.field2228.method1304(arg0, (byte) 97);
        if (!arg1) {
            method1738(15);
        }
        ++field4499;
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(arg0, 48, 0);
            int[][] var5 = this.method931(arg0, 49, 1);
            int[] var6 = var3[1];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4504;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class143.field2702; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var7[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var10[var16];
                                                                var9[var16] = -(var18 * var20 >> 11) + var18 + var20;
                                                                var6[var16] = -(var19 * var22 >> 11) + var19 + var22;
                                                                var8[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class143.field2702; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var7[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var11[var23];
                                                            var9[var23] = ~var29 > ~var27 ? -var29 + var27 : -var27 + var29;
                                                            var6[var23] = ~var25 > ~var26 ? -var25 + var26 : -var26 + var25;
                                                            var8[var23] = ~var24 <= ~var28 ? -var28 + var24 : var28 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class143.field2702 > var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var7[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var11[var30];
                                                        var9[var30] = ~var36 > ~var32 ? var32 : var36;
                                                        var6[var30] = ~var33 <= ~var31 ? var33 : var31;
                                                        var8[var30] = var34 <= var35 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class143.field2702; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var7[var37];
                                                    var9[var37] = var42 > var43 ? var43 : var42;
                                                    var6[var37] = ~var39 < ~var40 ? var40 : var39;
                                                    var8[var37] = var41 >= var38 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class143.field2702; ++var44) {
                                                int var45 = var12[var44];
                                                int var46 = var10[var44];
                                                int var47 = var7[var44];
                                                var9[var44] = var47 != 0 ? -((-var11[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var6[var44] = var46 != 0 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var8[var44] = var45 != 0 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class143.field2702 > var48; ++var48) {
                                            int var49 = var12[var48];
                                            int var50 = var10[var48];
                                            int var51 = var7[var48];
                                            var9[var48] = var51 != 4096 ? (var11[var48] << 12) / (4096 - var51) : 4096;
                                            var6[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class143.field2702 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var11[var52];
                                        int var55 = var13[var52];
                                        var9[var52] = ~var54 <= -2049 ? 4096 - ((-var7[var52] + 4096) * (-var54 + 4096) >> 11) : var7[var52] * var54 >> 11;
                                        var6[var52] = var55 < 2048 ? var10[var52] * var55 >> 11 : -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var53 >= 2048 ? -((4096 - var12[var52]) * (4096 - var53) >> 11) + 4096 : var12[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class143.field2702; ++var56) {
                                    var9[var56] = -((-var7[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var12[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class143.field2702; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var11[var57];
                                int var60 = var13[var57];
                                var9[var57] = var59 == 0 ? 4096 : (var7[var57] << 12) / var59;
                                var6[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = var58 != 0 ? (var12[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class143.field2702 < ~var61; ++var61) {
                            var9[var61] = var7[var61] * var11[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class143.field2702 > var62; ++var62) {
                        var9[var62] = var7[var62] + -var11[var62];
                        var6[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var12[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class143.field2702; ++var63) {
                    var9[var63] = var7[var63] + var11[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var8[var63] = var12[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
    public static void method1738(int arg0) {
        field4505 = null;
        field4502 = null;
        field4506 = null;
        field4508 = null;
        field4498 = null;
        int var1 = 94 % ((-38 - arg0) / 53);
        field4494 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class257() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field2208 = arg2.method622(true) == 1;
            }
        } else {
            this.field4504 = arg2.method622(true);
        }
        if (arg0 != 0) {
            method1736((class163) null, -49);
        }
        ++field4507;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, arg0 ^ arg0);
        ++field4501;
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 0);
            int[] var5 = this.method932(arg1, false, 1);
            int var6 = this.field4504;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class143.field2702 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class143.field2702 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class143.field2702; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class143.field2702 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 <= var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class143.field2702 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : 4096 - (-var5[var19] + 4096 << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class143.field2702 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class143.field2702; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class143.field2702 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class143.field2702; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class143.field2702 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class143.field2702; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class143.field2702 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }
}
