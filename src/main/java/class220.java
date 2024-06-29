import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class220 extends class228 {

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    private int field3819 = 6;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "Z")
    public static boolean field3823 = false;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field3824 = -1;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "Loa;")
    public static class99 field3828 = class221.method1463(2844, "Cabbage");

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "Lbg;")
    public static class237 field3831 = new class237(16);

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "Loa;")
    public static class99 field3832 = class221.method1463(2844, "floorshadows");

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "Loa;")
    private static class99 field3833 = class221.method1463(2844, "wave:");

    @OriginalMember(owner = "client!ck", name = "lb", descriptor = "Loa;")
    public static class99 field3837 = field3833;

    @OriginalMember(owner = "client!ck", name = "jb", descriptor = "Loa;")
    public static class99 field3835 = field3833;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "B")
    public static byte field3822;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ck", name = "kb", descriptor = "Lic;")
    public static class141 field3836;

    @OriginalMember(owner = "client!ck", name = "ib", descriptor = "[[I")
    public static int[][] field3834;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)V")
    public static void method1458(boolean arg0) {
        field3828 = null;
        field3836 = null;
        field3831 = null;
        field3832 = null;
        field3834 = null;
        if (!arg0) {
            field3837 = null;
        }
        field3835 = null;
        field3833 = null;
        field3837 = null;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)V")
    public static final void method1459(int arg0, int arg1) {
        class143.field2514.method1809(arg0, (byte) 79);
        if (arg1 != 0) {
            field3834 = null;
        }
        ++field3825;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field3820;
        if (arg2 != -7618) {
            method1459(-50, 39);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field3943 = ~arg1.method1693((byte) -79) == -2;
            }
        } else {
            this.field3819 = arg1.method1693((byte) 51);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        if (arg0 != -27) {
            field3828 = null;
        }
        ++field3826;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[][] var5 = this.method1502(255, arg1, 1);
            int[] var6 = var3[1];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3819;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class234.field4046 < ~var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var7[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var8[var16] = -(var19 * var22 >> 11) + var19 + var22;
                                                                var6[var16] = var17 - (var17 * var20 >> 11) + var20;
                                                                var9[var16] = var18 - ((var18 * var21 >> 11) + -var21);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class234.field4046 < ~var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var7[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var10[var23];
                                                            var8[var23] = var27 >= var25 ? -var25 + var27 : -var27 + var25;
                                                            var6[var23] = var29 <= var26 ? -var29 + var26 : var29 - var26;
                                                            var9[var23] = var28 < var24 ? -var28 + var24 : var28 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class234.field4046 > var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var7[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var12[var30];
                                                        var8[var30] = ~var36 > ~var34 ? var34 : var36;
                                                        var6[var30] = var31 <= var32 ? var32 : var31;
                                                        var9[var30] = var35 < var33 ? var33 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class234.field4046 < ~var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var7[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var11[var37];
                                                    var8[var37] = var42 > var39 ? var39 : var42;
                                                    var6[var37] = var38 < var41 ? var38 : var41;
                                                    var9[var37] = ~var40 >= ~var43 ? var40 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class234.field4046; ++var44) {
                                                int var45 = var7[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var8[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var6[var44] = var46 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var9[var44] = ~var47 == -1 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class234.field4046 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var7[var48];
                                            var8[var48] = var51 != 4096 ? (var12[var48] << 12) / (4096 - var51) : 4096;
                                            var6[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var9[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class234.field4046 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var8[var52] = var55 < 2048 ? var7[var52] * var55 >> 11 : -((4096 - var55) * (-var7[var52] + 4096) >> 11) + 4096;
                                        var6[var52] = ~var54 <= -2049 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var9[var52] = var53 >= 2048 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class234.field4046 < ~var56; ++var56) {
                                    var8[var56] = -((-var7[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class234.field4046 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var8[var57] = ~var60 == -1 ? 4096 : (var7[var57] << 12) / var60;
                                var6[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var9[var57] = ~var58 != -1 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class234.field4046 < ~var61; ++var61) {
                            var8[var61] = var7[var61] * var12[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var9[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class234.field4046; ++var62) {
                        var8[var62] = var7[var62] + -var12[var62];
                        var6[var62] = var10[var62] + -var13[var62];
                        var9[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class234.field4046; ++var63) {
                    var8[var63] = var7[var63] + var12[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var9[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class220() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
    public static final void method1460(int arg0, byte arg1, int arg2) {
        ++field3829;
        if (class22.method134(arg2, (byte) 50)) {
            if (arg1 < 116) {
                field3833 = null;
            }
            class276.method1827(-2, class125.field2188[arg2], arg0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field3830;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0, 0, (byte) 109);
            int[] var5 = this.method1500(arg0, 1, (byte) 126);
            int var6 = this.field3819;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class234.field4046; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class234.field4046 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class234.field4046 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class234.field4046; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class234.field4046 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class234.field4046; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class234.field4046 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class234.field4046 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class234.field4046; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class234.field4046; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class234.field4046; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class234.field4046; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1 != -3) {
            this.method19((byte) 54, -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZLik;IIIIBI)V")
    public static final void method1461(int arg0, boolean arg1, class261 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 <= 95) {
            field3832 = null;
        }
        ++field3827;
        if (arg3 >= 0 && arg3 < 104 && arg8 >= 0 && arg8 < 104) {
            if (!arg1) {
                class230.field3973[arg0][arg3][arg8] = 0;
            }
            while (true) {
                int var9 = arg2.method1693((byte) 56);
                if (var9 == 0) {
                    if (!arg1) {
                        if (~arg0 == -1) {
                            class189.field3337[0][arg3][arg8] = 8 * -class230.method1512(arg3 + 932731 + arg4, false, arg8 + 556238 + arg5);
                            return;
                        } else {
                            class189.field3337[arg0][arg3][arg8] = class189.field3337[arg0 - 1][arg3][arg8] + -240;
                            return;
                        }
                    } else {
                        class189.field3337[0][arg3][arg8] = class112.field2025[0][arg3][arg8];
                        return;
                    }
                }
                if (var9 == 1) {
                    int var10 = arg2.method1693((byte) 54);
                    if (!arg1) {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg0 != 0) {
                            class189.field3337[arg0][arg3][arg8] = class189.field3337[arg0 + -1][arg3][arg8] - var10 * 8;
                            return;
                        }
                        class189.field3337[0][arg3][arg8] = -var10 * 8;
                        return;
                    }
                    class189.field3337[0][arg3][arg8] = class112.field2025[0][arg3][arg8] - -(var10 * 8);
                    return;
                }
                if (~var9 >= -50) {
                    class111.field2001[arg0][arg3][arg8] = arg2.method1706(10819);
                    class224.field3897[arg0][arg3][arg8] = (byte) ((var9 + -2) / 4);
                    class69.field1148[arg0][arg3][arg8] = (byte) class71.method502(3, var9 + -2 + arg6);
                } else if (var9 <= 81) {
                    if (!arg1) {
                        class230.field3973[arg0][arg3][arg8] = (byte) (var9 + -49);
                    }
                } else {
                    class24.field357[arg0][arg3][arg8] = (byte) (var9 + -81);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method1693((byte) 84);
                if (~var11 == -1) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method1693((byte) -79);
                    return;
                }
                if (~var11 >= -50) {
                    arg2.method1693((byte) -118);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)V")
    public static final void method1462(byte arg0, int arg1) {
        for (class125 var2 = class139.field2454.method1552(122); var2 != null; var2 = class139.field2454.method1549(72)) {
            if ((var2.field2187 >> 48 & 65535L) == (long) arg1) {
                var2.method828((byte) 122);
            }
        }
        if (arg0 < -83) {
            ++field3821;
        }
    }
}
