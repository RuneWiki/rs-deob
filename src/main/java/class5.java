import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class264 {

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    private int field66 = 6;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Lcf;")
    public static class93 field61 = class147.method1066("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", -48);

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "Lmb;")
    public static class160 field63 = new class160();

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "[[S")
    public static short[][] field71 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "Lcf;")
    private static class93 field74 = class147.method1066("Loading world list data", -48);

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Lcf;")
    private static class93 field70 = class147.method1066("You can(Wt add yourself to your own ignore list)3", -48);

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "J")
    public static long field75 = 0L;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "Lcf;")
    public static class93 field69 = field70;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "Lcf;")
    public static class93 field72 = field74;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "Lcf;")
    public static class93 field73 = class147.method1066("Connect-B au serveur de mise -9 jour", -48);

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "Lnh;")
    public static class54 field68 = new class54(5);

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.method17(19, false);
        }
        int[][] var3 = super.field4705.method1089(arg0, 36);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-120, 0, arg0);
            int[][] var5 = this.method1773(-128, 1, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var4[0];
            int[] var14 = var5[2];
            int var15 = this.field66;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class176.field3060; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var7[var16] = var18 - (var17 * var18 >> 11) + var17;
                                                                var8[var16] = var22 - -var20 + -(var20 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class176.field3060 < ~var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var25 <= ~var27 ? -var27 + var25 : -var25 + var27;
                                                            var7[var23] = ~var29 < ~var28 ? -var28 + var29 : -var29 + var28;
                                                            var8[var23] = var24 > var26 ? -var26 + var24 : -var24 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class176.field3060; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var35 < ~var31 ? var35 : var31;
                                                        var7[var30] = ~var34 <= ~var32 ? var34 : var32;
                                                        var8[var30] = var33 >= var36 ? var33 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class176.field3060 < ~var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = var42 <= var43 ? var42 : var43;
                                                    var7[var37] = ~var40 <= ~var39 ? var39 : var40;
                                                    var8[var37] = var41 > var38 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class176.field3060; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var13[var44];
                                                var6[var44] = ~var47 != -1 ? -((-var11[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var7[var44] = ~var45 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var45 : 0;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class176.field3060 > var48; ++var48) {
                                            int var49 = var13[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var49 == -4097 ? 4096 : (var11[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class176.field3060; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var11[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var54 < 2048 ? var13[var52] * var54 >> 11 : -((-var13[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var55 <= -2049 ? -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var8[var52] = ~var53 <= -2049 ? -((4096 - var53) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class176.field3060; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var11[var56]) * (-var13[var56] + 4096) >> 12);
                                    var7[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class176.field3060 > var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var11[var57];
                                var6[var57] = ~var60 != -1 ? (var13[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var8[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; class176.field3060 > var61; ++var61) {
                            var6[var61] = var11[var61] * var13[var61] >> 12;
                            var7[var61] = var9[var61] * var12[var61] >> 12;
                            var8[var61] = var10[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class176.field3060; ++var62) {
                        var6[var62] = var13[var62] + -var11[var62];
                        var7[var62] = var9[var62] + -var12[var62];
                        var8[var62] = var10[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class176.field3060; ++var63) {
                    var6[var63] = var13[var63] - -var11[var63];
                    var7[var63] = var9[var63] + var12[var63];
                    var8[var63] = var10[var63] - -var14[var63];
                }
            }
        }
        ++field67;
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method18(boolean arg0) {
        field72 = null;
        field74 = null;
        field70 = null;
        field69 = null;
        field63 = null;
        if (!arg0) {
            field63 = null;
        }
        field73 = null;
        field61 = null;
        field68 = null;
        field71 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Lkj;")
    public static final class145 method19(byte arg0, int arg1) {
        ++field60;
        class145 var2 = (class145) class230.field4114.method302((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class8.field105.method1271(class252.method1707(arg1, false), -2154, class168.method1215(arg1, (byte) -82));
            if (arg0 != -59) {
                field61 = null;
            }
            class145 var4 = new class145();
            var4.field2552 = arg1;
            if (var3 != null) {
                var4.method1059(new class280(var3), -5744);
            }
            var4.method1057(-123);
            class230.field4114.method297((long) arg1, var4, arg0 ^ -10389);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field64;
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4698 = ~arg2.method1907(16832) == -2;
            }
        } else {
            this.field66 = arg2.method1907(16832);
        }
        if (arg0 < 11) {
            field75 = -111L;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)Ltg;")
    public static final class181 method21(int arg0, int arg1, byte arg2) {
        if (arg2 != 40) {
            return null;
        } else {
            ++field62;
            class181 var3 = client.method1114(-20985, arg0);
            if (arg1 == -1) {
                return var3;
            } else {
                return var3 != null && var3.field3336 != null && ~arg1 > ~var3.field3336.length ? var3.field3336[arg1] : null;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        int[] var3 = super.field4716.method532((byte) 72, arg0);
        ++field59;
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, arg0, 21654);
            int[] var5 = this.method1767(1, arg0, 21654);
            int var6 = this.field66;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class176.field3060; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class176.field3060; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class176.field3060 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class176.field3060; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class176.field3060 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class176.field3060; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class176.field3060; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class176.field3060; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class176.field3060; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class176.field3060; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class176.field3060 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class176.field3060; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1 >= -83) {
            this.method22(110, (byte) -36);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(2, false);
    }
}
