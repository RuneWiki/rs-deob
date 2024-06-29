import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class147 extends class105 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field2744 = 6;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Lvf;")
    public static class265 field2741 = class87.method582(-46, "Hierhin drehen");

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lvf;")
    public static class265 field2752 = class87.method582(-46, " ");

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field2751 = 0;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lvf;")
    public static class265 field2753 = class87.method582(-46, "<col=ffff00>");

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field2742 = 0;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field2754 = -16 + (int) (Math.random() * 33.0D);

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Lfl;")
    public static class192 field2748;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lgk;IIZIB)V")
    public static final void method1012(class6[] arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        ++field2740;
        for (int var6 = 0; arg0.length > var6; ++var6) {
            class6 var7 = arg0[var6];
            if (var7 != null && ~var7.field142 == ~arg2) {
                class127.method845(var7, arg3, arg1, arg4, 105);
                class70.method495(arg4, arg1, var7, -26564);
                if (~(-var7.field89 + var7.field223) > ~var7.field109) {
                    var7.field109 = -var7.field89 + var7.field223;
                }
                if (var7.field109 < 0) {
                    var7.field109 = 0;
                }
                if (~var7.field193 < ~(var7.field195 - var7.field84)) {
                    var7.field193 = var7.field195 - var7.field84;
                }
                if (~var7.field193 > -1) {
                    var7.field193 = 0;
                }
                if (var7.field187 == 0) {
                    class126.method841(arg3, (byte) 91, var7);
                }
            }
        }
        if (arg5 > -6) {
            method1014(42, -128);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field2747;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field1853 = arg2.method920((byte) 80) == 1;
            }
        } else {
            this.field2744 = arg2.method920((byte) 121);
        }
        if (arg1 != 255) {
            field2753 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method1013(byte arg0) {
        field2752 = null;
        if (arg0 < -67) {
            field2753 = null;
            field2741 = null;
            field2748 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
    public static final void method1014(int arg0, int arg1) {
        ++field2745;
        class70.field1321.method1891(-23549, arg1);
        if (arg0 != 2103) {
            field2742 = 34;
        }
        class55.field1125.method1891(-23549, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        int[] var3 = super.field1862.method458(arg1, false);
        ++field2750;
        if (arg0 != 8055) {
            method1013((byte) 80);
        }
        if (super.field1862.field1236) {
            int[] var4 = this.method705(arg1, (byte) -21, 0);
            int[] var5 = this.method705(arg1, (byte) -40, 1);
            int var6 = this.field2744;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class94.field1668 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 - -var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class94.field1668; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class94.field1668 < ~var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class94.field1668; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 <= var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class94.field1668 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class94.field1668 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class94.field1668; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class94.field1668; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class94.field1668; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class94.field1668 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class94.field1668; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class94.field1668; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field2743;
        int[][] var3 = super.field1870.method569((byte) 82, arg0);
        if (arg1 > -110) {
            this.method18(-64, (byte) 28);
        }
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, arg0, 0);
            int[][] var5 = this.method702((byte) 94, arg0, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var5[2];
            int[] var14 = var4[0];
            int var15 = this.field2744;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class94.field1668 < ~var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var8[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var13[var16];
                                                                var7[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                var6[var16] = var20 + var21 - (var20 * var21 >> 11);
                                                                var10[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class94.field1668 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var8[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var12[var23];
                                                            var7[var23] = ~var28 < ~var26 ? var28 - var26 : -var28 + var26;
                                                            var6[var23] = var25 > var29 ? var25 - var29 : -var25 + var29;
                                                            var10[var23] = ~var27 >= ~var24 ? -var27 + var24 : -var24 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class94.field1668; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var8[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var9[var30];
                                                        var7[var30] = ~var31 <= ~var32 ? var31 : var32;
                                                        var6[var30] = var34 <= var35 ? var35 : var34;
                                                        var10[var30] = var33 < var36 ? var36 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class94.field1668; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var8[var37];
                                                    int var43 = var12[var37];
                                                    var7[var37] = var41 >= var40 ? var40 : var41;
                                                    var6[var37] = var43 > var42 ? var42 : var43;
                                                    var10[var37] = ~var38 >= ~var39 ? var38 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class94.field1668 < ~var44; ++var44) {
                                                int var45 = var8[var44];
                                                int var46 = var14[var44];
                                                int var47 = var9[var44];
                                                var7[var44] = ~var46 != -1 ? 4096 - (-var11[var44] + 4096 << 12) / var46 : 0;
                                                var6[var44] = var45 == 0 ? 0 : -((4096 - var12[var44] << 12) / var45) + 4096;
                                                var10[var44] = var47 != 0 ? -((4096 - var13[var44] << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class94.field1668; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var14[var48];
                                            int var51 = var8[var48];
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var11[var48] << 12) / (4096 - var50);
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var10[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class94.field1668; ++var52) {
                                        int var53 = var11[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var7[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var53) * (-var14[var52] + 4096) >> 11) : var14[var52] * var53 >> 11;
                                        var6[var52] = ~var55 <= -2049 ? -((-var8[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var8[var52] * var55 >> 11;
                                        var10[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class94.field1668; ++var56) {
                                    var7[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = 4096 - ((-var8[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var10[var56] = -((-var9[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class94.field1668; ++var57) {
                                int var58 = var11[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var7[var57] = ~var58 != -1 ? (var14[var57] << 12) / var58 : 4096;
                                var6[var57] = var59 == 0 ? 4096 : (var8[var57] << 12) / var59;
                                var10[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class94.field1668 > var61; ++var61) {
                            var7[var61] = var11[var61] * var14[var61] >> 12;
                            var6[var61] = var8[var61] * var12[var61] >> 12;
                            var10[var61] = var9[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class94.field1668 < ~var62; ++var62) {
                        var7[var62] = var14[var62] + -var11[var62];
                        var6[var62] = var8[var62] + -var12[var62];
                        var10[var62] = var9[var62] - var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class94.field1668 < ~var63; ++var63) {
                    var7[var63] = var11[var63] + var14[var63];
                    var6[var63] = var8[var63] + var12[var63];
                    var10[var63] = var9[var63] - -var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class147() {
        super(2, false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BJ)V")
    public static final void method1015(byte arg0, long arg1) {
        ++field2746;
        int var3 = 104 % ((arg0 - -48) / 52);
        if (arg1 != 0L) {
            class55.field1133.method1863(true, 157);
            class55.field1133.method911(0, arg1);
            ++class232.field4095;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V")
    public static final void method1016(boolean arg0) {
        ++field2749;
        class171.field3088.method1888((byte) 95);
        if (arg0) {
            method1015((byte) 123, 16L);
        }
    }
}
