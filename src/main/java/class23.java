import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 extends class260 {

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Loh;")
    public static class263 field664 = class253.method1681(-123, "hitmarks");

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Loh;")
    private static class263 field672 = class253.method1681(-121, "");

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Loh;")
    public static class263 field667 = field672;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Lli;")
    public static class277 field673 = new class277();

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "Loh;")
    public static class263 field678 = class253.method1681(-126, ":");

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lue;")
    public static class86 field674;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "[Log;")
    private class212[] field676;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            this.field676 = new class212[arg2.method1301(-8317)];
            for (int var4 = 0; ~var4 > ~this.field676.length; ++var4) {
                int var5 = arg2.method1301(arg1 + -14018);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field676[var4] = class176.method1156(arg2, (byte) 17);
                            }
                        } else {
                            this.field676[var4] = class189.method1242(arg2, 11238);
                        }
                    } else {
                        this.field676[var4] = class33.method217(-4168, arg2);
                    }
                } else {
                    this.field676[var4] = class47.method303(-29745, arg2);
                }
            }
        } else if (arg0 == 1) {
            super.field4505 = ~arg2.method1301(-8317) == -2;
        }
        if (arg1 == 5701) {
            ++field670;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([[II)V")
    private final void method167(int[][] arg0, int arg1) {
        ++field669;
        int var3 = class60.field1235;
        int var4 = class49.field1052;
        class61.method377(0, arg0);
        int var5 = -62 % ((arg1 - -15) / 62);
        class265.method1795(0, class277.field4846, 0, 0, class166.field3024);
        if (this.field676 != null) {
            for (int var6 = 0; var6 < this.field676.length; ++var6) {
                class212 var7 = this.field676[var6];
                int var8 = var7.field3793;
                int var9 = var7.field3788;
                if (var8 < 0) {
                    if (var9 >= 0) {
                        var7.method522(var3, -63, var4);
                    }
                } else if (var9 >= 0) {
                    var7.method528((byte) 84, var3, var4);
                } else {
                    var7.method531(var4, var3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
    public static final void method168(byte arg0) {
        int[] var1 = new int[class268.field4727];
        ++field665;
        if (arg0 != 26) {
            field678 = null;
        }
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class268.field4727; ++var3) {
            class72 var5 = class92.method649(-32508, var3);
            if (var5.field1501 >= 0 || ~var5.field1486 <= -1) {
                var1[var2++] = var3;
            }
        }
        class117.field2185 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class117.field2185[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public static void method169(int arg0) {
        field672 = null;
        field664 = null;
        field674 = null;
        field678 = null;
        if (arg0 != 0) {
            field678 = null;
        }
        field667 = null;
        field673 = null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
    public static final void method170(byte arg0) {
        int var1 = class83.field1652;
        ++field677;
        int var2 = class134.field2455;
        int var3 = 6116423;
        int var4 = class275.field4822;
        if (arg0 != 29) {
            field674 = null;
        }
        int var5 = class55.field1162;
        class133.method865(var1, var5, var4, var2, var3);
        class133.method865(var1 + 1, var5 + 1, var4 + -2, 16, 0);
        class133.method876(var1 + 1, var5 - -18, var4 + -2, var2 + -19, 0);
        class107.field2026.method411(class38.field864, var1 + 3, var5 - -14, var3, -1);
        int var6 = class136.field2492;
        int var7 = class252.field4380;
        for (int var8 = 0; class252.field4384 > var8; ++var8) {
            int var9 = (class252.field4384 - 1 + -var8) * 15 + var5 + 31;
            int var10 = 16777215;
            if (~var6 < ~var1 && var1 - -var4 > var6 && ~var7 < ~(var9 + -13) && ~(var9 + 3) < ~var7) {
                var10 = 16776960;
            }
            class107.field2026.method411(class200.method1388(var8, false), var1 + 3, var9, var10, 0);
        }
        class111.method730(class83.field1652, class275.field4822, class55.field1162, true, class134.field2455);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field668;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            this.method167(super.field4511.method306((byte) -59), 68);
        }
        if (arg1 != 255) {
            this.method167((int[][]) null, -21);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field663;
        int var8 = 0;
        int var9 = -arg4 + arg3;
        int var10 = 0;
        int var11 = arg3;
        int var12 = arg2 - arg4;
        int var13 = arg2 * arg2;
        int var14 = var12 * var12;
        int var15 = arg3 * arg3;
        int var16 = var13 << 1;
        int var17 = var9 * var9;
        int var18 = var17 << 1;
        int var19 = var15 << 1;
        int var20 = var14 << 1;
        int var21 = arg3 << 1;
        int var22 = var9 << 1;
        int var23 = (-var21 + 1) * var13 + var19;
        int var24 = -((var21 + -1) * var16) + var15;
        int var25 = (-var22 + 1) * var14 + var18;
        int var26 = var17 - (var22 + -1) * var20;
        int var27 = var15 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var17 << 2;
        int var31 = var19 * 3;
        int var32 = (var21 + -3) * var16;
        int var33 = var18 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var27;
        int var36 = (arg3 + -1) * var28;
        int var37 = (var9 - 1) * var29;
        int var38 = var30;
        if (arg0 != 9073) {
            field673 = null;
        }
        int[] var39 = class38.field870[arg1];
        class191.method1255(arg6 - arg2, arg7, -var12 + arg6, 68, var39);
        class191.method1255(-var12 + arg6, arg5, arg6 - -var12, 102, var39);
        class191.method1255(arg6 - -var12, arg7, arg2 + arg6, 88, var39);
        while (~var11 < -1) {
            boolean var40 = ~var11 >= ~var9;
            if (~var23 > -1) {
                while (var23 < 0) {
                    ++var10;
                    var24 += var35;
                    var23 += var31;
                    var31 += var27;
                    var35 += var27;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var38;
                        var38 += var30;
                        ++var8;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    ++var8;
                    var26 += var38;
                    var38 += var30;
                    var25 += var33;
                    var33 += var30;
                }
                var25 += -var37;
                var37 -= var29;
                var26 += -var34;
                var34 -= var29;
            }
            --var11;
            int var41 = -var11 + arg1;
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                var35 += var27;
                ++var10;
                var31 += var27;
            }
            var23 += -var36;
            int var42 = arg1 + var11;
            var24 += -var32;
            var32 -= var28;
            var36 -= var28;
            int var43 = arg6 - var10;
            int var44 = arg6 + var10;
            if (var40) {
                int var45 = arg6 + var8;
                int var46 = arg6 - var8;
                class191.method1255(var43, arg7, var46, 96, class38.field870[var41]);
                class191.method1255(var46, arg5, var45, 81, class38.field870[var41]);
                class191.method1255(var45, arg7, var44, 78, class38.field870[var41]);
                class191.method1255(var43, arg7, var46, 100, class38.field870[var42]);
                class191.method1255(var46, arg5, var45, 78, class38.field870[var42]);
                class191.method1255(var45, arg7, var44, 126, class38.field870[var42]);
            } else {
                class191.method1255(var43, arg7, var44, arg0 + -8946, class38.field870[var41]);
                class191.method1255(var43, arg7, var44, 76, class38.field870[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lbb;[Loe;Lue;I[Lbb;[Lbb;[Lbb;)V")
    public static final void method172(class88[] arg0, class140[] arg1, class86 arg2, int arg3, class88[] arg4, class88[] arg5, class88[] arg6) {
        class268.field4725 = arg5;
        class6.field111 = arg4;
        class93.field1830 = arg1;
        ++field675;
        if (arg3 >= 84) {
            class21.field624 = arg6;
            class36.field848 = arg2;
            class238.field4155 = arg0;
            class195.field3534.method1884(-33);
            int var7 = class36.field848.method573(-1, class14.field362);
            int[] var8 = class36.field848.method577(2828, var7);
            for (int var9 = 0; var8.length > var9; ++var9) {
                class195.field3534.method1883(class111.method733((byte) 127, new class194(class36.field848.method596(-122, var7, var8[var9]))), (byte) -3);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZI)I")
    public static final int method173(boolean arg0, int arg1) {
        ++field666;
        if (class166.field3023 != null) {
            class166.field3023.method809((byte) 63);
            class166.field3023 = null;
        }
        ++class138.field2551;
        if (~class138.field2551 < -5) {
            class184.field3335 = 0;
            class138.field2551 = 0;
            return arg1;
        } else {
            if (class48.field1032 == class245.field4322) {
                class48.field1032 = class116.field2164;
            } else {
                class48.field1032 = class245.field4322;
            }
            if (arg0) {
                return -58;
            } else {
                class184.field3335 = 0;
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field671;
        int[][] var3 = super.field4509.method1667(arg0, arg1 ^ arg1);
        if (super.field4509.field4346) {
            int var4 = class60.field1235;
            int var5 = class49.field1052;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = super.field4509.method1664(5262);
            this.method167(var6, 54);
            for (int var8 = 0; class60.field1235 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class49.field1052 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class263.method1777(var15, 255) << 4;
                    var12[var14] = class263.method1777(4080, var15 >> 4);
                    var11[var14] = class263.method1777(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)V")
    public static final void method175(byte arg0) {
        int var1 = class195.field3543.length;
        ++field662;
        for (int var2 = 0; ~var2 > ~var1; ++var2) {
            if (class195.field3543[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~var4 > ~class170.field3115; ++var4) {
                    if (class183.field3319[var4] == class128.field2370[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class183.field3319[class170.field3115] = class128.field2370[var2];
                    var3 = class170.field3115++;
                }
                int var5 = 0;
                class194 var6 = new class194(class195.field3543[var2]);
                while (class195.field3543[var2].length > var6.field3497 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1294((byte) 3);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 8180) >> 7;
                    int var11 = var8 & 63;
                    int var12 = (class128.field2370[var2] >> 8) * 64 + -class93.field1844 - -var10;
                    int var13 = (class128.field2370[var2] & 255) * 64 - (class142.field2596 - var11);
                    class204 var14 = class219.method1492(var6.method1294((byte) 3), 8);
                    if (class31.field774[var7] == null && (var14.field3672 & 1) > 0 && class171.field3128 == var9 && ~var12 <= -1 && var12 - -var14.field3694 < 104 && var13 >= 0 && var14.field3694 + var13 < 104) {
                        class31.field774[var7] = new class90();
                        class90 var15 = class31.field774[var7];
                        class117.field2191[class13.field345++] = var7;
                        var15.field1787 = var14;
                        var15.field4670 = class228.field4012;
                        var15.method1807(var15.field1787.field3694, -98);
                        var15.field4687 = var15.field1787.field3706;
                        var15.field4661 = var15.field1787.field3692;
                        var15.field4675 = var15.field1787.field3679;
                        var15.field4649 = var15.field1787.field3661;
                        var15.field4651 = var15.field1787.field3700;
                        var15.field4710 = var15.field1787.field3660;
                        if (~var15.field4710 == -1) {
                            var15.field4700 = 0;
                        }
                        var15.field4690 = var15.field1787.field3688;
                        var15.field4676 = var15.field1787.field3696;
                        var15.method1801((byte) -85, var12, var13, var15.method898(43), true);
                    }
                }
            }
        }
        if (arg0 < 99) {
            method173(false, 67);
        }
    }
}
