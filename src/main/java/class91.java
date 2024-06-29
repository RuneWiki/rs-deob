import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 extends class105 {

    @OriginalMember(owner = "client!na", name = "Xb", descriptor = "Lr;")
    public static class118 field2168 = class153.method1136(98, "0(U");

    @OriginalMember(owner = "client!na", name = "hc", descriptor = "I")
    public static int field2178 = 127;

    @OriginalMember(owner = "client!na", name = "Wb", descriptor = "Lge;")
    public static class47 field2167 = new class47(64);

    @OriginalMember(owner = "client!na", name = "kc", descriptor = "Lr;")
    public static class118 field2181 = class153.method1136(80, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!na", name = "jc", descriptor = "Lr;")
    public static class118 field2180 = class153.method1136(97, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!na", name = "nc", descriptor = "Lr;")
    public static class118 field2184 = class153.method1136(106, "<col=ff9040>");

    @OriginalMember(owner = "client!na", name = "oc", descriptor = "Lr;")
    private static class118 field2185 = class153.method1136(105, "glow2:");

    @OriginalMember(owner = "client!na", name = "mc", descriptor = "[I")
    public static int[] field2183 = new int[100];

    @OriginalMember(owner = "client!na", name = "rc", descriptor = "Lr;")
    public static class118 field2188 = field2185;

    @OriginalMember(owner = "client!na", name = "pc", descriptor = "Lr;")
    public static class118 field2186 = field2185;

    @OriginalMember(owner = "client!na", name = "Qb", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!na", name = "Rb", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!na", name = "Sb", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!na", name = "Tb", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!na", name = "Ub", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!na", name = "Vb", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!na", name = "Yb", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!na", name = "Zb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!na", name = "ac", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!na", name = "bc", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!na", name = "cc", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!na", name = "ec", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!na", name = "fc", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!na", name = "gc", descriptor = "I")
    private int field2177;

    @OriginalMember(owner = "client!na", name = "lc", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!na", name = "ic", descriptor = "Lde;")
    private class27 field2179;

    @OriginalMember(owner = "client!na", name = "sc", descriptor = "Ljf;")
    public static class68 field2189;

    @OriginalMember(owner = "client!na", name = "dc", descriptor = "Ln;")
    public static class90 field2174;

    @OriginalMember(owner = "client!na", name = "qc", descriptor = "Lba;")
    public static class9 field2187;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIII)V")
    public static final void method721(byte arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; ~var4 > -9; ++var4) {
            for (int var7 = 0; ~var7 > -9; ++var7) {
                class72.field1668[arg1][arg2 + var4][arg3 + var7] = 0;
            }
        }
        if (arg0 == -109) {
            if (arg2 > 0) {
                for (int var5 = 1; ~var5 > -9; ++var5) {
                    class72.field1668[arg1][arg2][arg3 - -var5] = class72.field1668[arg1][arg2 + -1][arg3 - -var5];
                }
            }
            ++field2172;
            if (arg3 > 0) {
                for (int var6 = 1; ~var6 > -9; ++var6) {
                    class72.field1668[arg1][arg2 + var6][arg3] = class72.field1668[arg1][arg2 - -var6][arg3 - 1];
                }
            }
            if (~arg2 < -1 && ~class72.field1668[arg1][arg2 + -1][arg3] != -1) {
                class72.field1668[arg1][arg2][arg3] = class72.field1668[arg1][arg2 + -1][arg3];
            } else if (~arg3 < -1 && class72.field1668[arg1][arg2][arg3 + -1] != 0) {
                class72.field1668[arg1][arg2][arg3] = class72.field1668[arg1][arg2][arg3 - 1];
            } else if (arg2 > 0 && arg3 > 0 && ~class72.field1668[arg1][arg2 - 1][arg3 + -1] != -1) {
                class72.field1668[arg1][arg2][arg3] = class72.field1668[arg1][arg2 + -1][arg3 + -1];
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(IB)V")
    public final void method722(int arg0, byte arg1) {
        ++field2165;
        super.field2405[super.field2404++] = (byte) (this.field2179.method238(-67) + arg0);
        int var3 = -84 % ((-75 - arg1) / 49);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[I)V")
    public final void method723(int arg0, int[] arg1) {
        ++field2171;
        this.field2179 = new class27(arg1);
        if (arg0 != -1) {
            field2167 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "s", descriptor = "(I)I")
    public final int method724(int arg0) {
        ++field2169;
        if (arg0 != 255) {
            field2181 = null;
        }
        return 255 & super.field2405[super.field2404++] + -this.field2179.method238(-118);
    }

    @OriginalMember(owner = "client!na", name = "p", descriptor = "(II)I")
    public final int method725(int arg0, int arg1) {
        int var3 = this.field2177 >> 3;
        ++field2175;
        int var4 = -(7 & this.field2177) + arg0;
        int var5 = 0;
        this.field2177 += arg1;
        while (~arg1 < ~var4) {
            var5 += (class14.field300[var4] & super.field2405[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field2405[var3] >> var4 - arg1 & class14.field300[arg1]) + var5;
        } else {
            var6 = (super.field2405[var3] & class14.field300[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!na", name = "t", descriptor = "(I)V")
    public final void method726(int arg0) {
        ++field2162;
        if (arg0 == -5) {
            this.field2177 = super.field2404 * 8;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILff;)Lka;")
    public static final class70 method727(int arg0, int arg1, class42 arg2) {
        ++field2173;
        byte[] var3 = arg2.method346(-1, arg0);
        if (arg1 != 18741) {
            field2167 = null;
        }
        return var3 == null ? null : new class70(var3);
    }

    @OriginalMember(owner = "client!na", name = "q", descriptor = "(II)I")
    public final int method728(int arg0, int arg1) {
        ++field2176;
        if (arg1 != 0) {
            this.method726(1);
        }
        return arg0 * 8 + -this.field2177;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[Lke;IIIIIII)V")
    public static final void method729(int arg0, int arg1, class74[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2166;
        class52.method461(arg6, arg4, arg5, arg0);
        class58.method515();
        int var10 = 0;
        if (arg9 == -1) {
            while (var10 < arg2.length) {
                class74 var11 = arg2[var10];
                if (var11 != null && (var11.field1828 == arg7 || ~arg7 == 1412584498 && class95.field2249 == var11)) {
                    int var12;
                    if (arg3 != -1) {
                        var12 = arg3;
                    } else {
                        field2183[class153.field3481] = var11.field1798 + arg8;
                        class44.field1059[class153.field3481] = var11.field1791 + arg1;
                        class63.field1447[class153.field3481] = var11.field1779;
                        class89.field2144[class153.field3481] = var11.field1748;
                        var12 = class153.field3481++;
                    }
                    var11.field1752 = var12;
                    var11.field1749 = class65.field1479;
                    if (!var11.field1805 || !class87.method709(true, var11)) {
                        label758: {
                            if (~var11.field1731 < -1) {
                                class126.method983(var11, 8);
                            }
                            int var13 = var11.field1798 + arg8;
                            int var14 = var11.field1791 + arg1;
                            int var15 = var11.field1824;
                            if (class95.field2249 == var11) {
                                if (arg7 != -1412584499 && !var11.field1819) {
                                    class35.field881 = arg1;
                                    class133.field3044 = arg8;
                                    class157.field3612 = arg2;
                                    break label758;
                                }
                                if (!var11.field1819) {
                                    var15 = 128;
                                }
                                if (class103.field2380 && class114.field2665) {
                                    int var16 = class33.field827;
                                    int var17 = var16 - class157.field3630;
                                    if (~class33.field843 < ~var17) {
                                        var17 = class33.field843;
                                    }
                                    int var18 = class44.field1049;
                                    int var19 = var18 - class153.field3450;
                                    if (var19 < class139.field3170) {
                                        var19 = class139.field3170;
                                    }
                                    if (~(class33.field843 - -class75.field1859.field1779) > ~(var11.field1779 + var17)) {
                                        var17 = -var11.field1779 + class75.field1859.field1779 + class33.field843;
                                    }
                                    if (var11.field1748 + var19 > class139.field3170 + class75.field1859.field1748) {
                                        var19 = class139.field3170 + class75.field1859.field1748 + -var11.field1748;
                                    }
                                    var14 = var19;
                                    var13 = var17;
                                }
                            }
                            int var26;
                            int var27;
                            int var28;
                            int var29;
                            if (var11.field1807 != 2) {
                                if (var11.field1807 == 9) {
                                    int var20 = var13;
                                    int var21 = var11.field1779 + var13;
                                    int var22 = var14;
                                    int var23 = var11.field1748 + var14;
                                    if (var21 < var13) {
                                        var20 = var21;
                                        var21 = var13;
                                    }
                                    if (~var14 < ~var23) {
                                        var22 = var23;
                                        var23 = var14;
                                    }
                                    ++var23;
                                    var26 = arg0 <= var23 ? arg0 : var23;
                                    ++var21;
                                    var27 = var21 < arg5 ? var21 : arg5;
                                    var28 = var20 > arg6 ? var20 : arg6;
                                    var29 = arg4 < var22 ? var22 : arg4;
                                } else {
                                    var28 = ~arg6 <= ~var13 ? arg6 : var13;
                                    var29 = ~arg4 <= ~var14 ? arg4 : var14;
                                    int var30 = var11.field1779 + var13;
                                    int var31 = var14 - -var11.field1748;
                                    var26 = arg0 <= var31 ? arg0 : var31;
                                    var27 = ~arg5 >= ~var30 ? arg5 : var30;
                                }
                            } else {
                                var27 = arg5;
                                var26 = arg0;
                                var28 = arg6;
                                var29 = arg4;
                            }
                            if (!var11.field1805 || var27 > var28 && var29 < var26) {
                                label765: {
                                    if (~var11.field1731 != -1) {
                                        if (~var11.field1731 == -1338) {
                                            class79.field1919 = var13;
                                            class15.field393 = var14;
                                            class43.method363(var11.field1779, var14, var11.field1748, var13, 1);
                                            class52.method461(arg6, arg4, arg5, arg0);
                                            break label765;
                                        }
                                        if (~var11.field1731 == -1339) {
                                            class20.method182(var13, var12, var14, 108);
                                            class52.method461(arg6, arg4, arg5, arg0);
                                            break label765;
                                        }
                                    }
                                    int var32 = class44.field1049;
                                    int var33 = class33.field827;
                                    if (!class138.field3144 && var33 >= var28 && var32 >= var29 && ~var33 > ~var27 && ~var32 > ~var26) {
                                        class34.method283(var33 - var13, var32 - var14, arg9 ^ 120, var11);
                                    }
                                    if (~var11.field1807 == -1) {
                                        if (!var11.field1805 && class87.method709(true, var11) && class151.field3379 != var11) {
                                            break label765;
                                        }
                                        if (!var11.field1805) {
                                            if (-var11.field1748 + var11.field1792 < var11.field1789) {
                                                var11.field1789 = -var11.field1748 + var11.field1792;
                                            }
                                            if (var11.field1789 < 0) {
                                                var11.field1789 = 0;
                                            }
                                        }
                                        method729(var26, var14 - var11.field1789, arg2, var12, var29, var27, var28, var11.field1703, -var11.field1757 + var13, -1);
                                        if (var11.field1729 != null) {
                                            method729(var26, -var11.field1789 + var14, var11.field1729, var12, var29, var27, var28, var11.field1703, -var11.field1757 + var13, -1);
                                        }
                                        class87 var34 = (class87) class31.field797.method297((long) var11.field1703, -1);
                                        if (var34 != null) {
                                            if (var34.field2107 == 0 && var28 <= class33.field827 && ~var29 >= ~class44.field1049 && class33.field827 < var27 && ~var26 < ~class44.field1049 && !class138.field3144 && !class33.field844) {
                                                class42.field1015[0] = 1005;
                                                class144.field3250[0] = class83.field1985;
                                                class39.field950 = 1;
                                                class126.field2876[0] = class110.field2567;
                                            }
                                            class83.method682(var27, var34.field2114, var29, var26, var13, -1412584499, var14, var28, var12);
                                        }
                                        class52.method461(arg6, arg4, arg5, arg0);
                                        class58.method515();
                                    }
                                    if (class39.field946[var12] || class73.field1687 > 1) {
                                        if (~var11.field1807 == -1 && !var11.field1805 && var11.field1792 > var11.field1748) {
                                            class25.method221(arg9 + 35, var14, var11.field1789, var11.field1779 + var13, var11.field1792, var11.field1748);
                                        }
                                        if (var11.field1807 != 1) {
                                            if (~var11.field1807 == -3) {
                                                int var35 = 0;
                                                for (int var36 = 0; var11.field1748 > var36; ++var36) {
                                                    for (int var37 = 0; ~var11.field1779 < ~var37; ++var37) {
                                                        int var38 = var14 - -((var11.field1706 + 32) * var36);
                                                        int var39 = (var11.field1747 + 32) * var37 + var13;
                                                        if (var35 < 20) {
                                                            var38 += var11.field1804[var35];
                                                            var39 += var11.field1709[var35];
                                                        }
                                                        if (~var11.field1816[var35] >= -1) {
                                                            if (var11.field1751 != null && var35 < 20) {
                                                                class150 var40 = var11.method619(var35, (byte) 88);
                                                                if (var40 == null) {
                                                                    if (class159.field3654) {
                                                                        class26.method232((byte) 90, var11);
                                                                    }
                                                                } else {
                                                                    var40.method1109(var39, var38);
                                                                }
                                                            }
                                                        } else {
                                                            boolean var41 = false;
                                                            boolean var42 = false;
                                                            int var43 = var11.field1816[var35] - 1;
                                                            if (~(var39 + 32) < ~arg6 && arg5 > var39 && ~arg4 > ~(var38 + 32) && var38 < arg0 || class136.field3086 == var11 && class88.field2131 == var35) {
                                                                class150 var44;
                                                                if (~class144.field3245 == -2 && ~class132.field2994 == ~var35 && class95.field2252 == var11.field1703) {
                                                                    var44 = class53.method485(var43, 2, 0, (byte) -30, false, var11.field1743[var35]);
                                                                } else {
                                                                    var44 = class53.method485(var43, 1, 3153952, (byte) -30, false, var11.field1743[var35]);
                                                                }
                                                                if (var44 == null) {
                                                                    class26.method232((byte) 100, var11);
                                                                } else if (class136.field3086 == var11 && ~class88.field2131 == ~var35) {
                                                                    int var45 = -class14.field340 + class44.field1049;
                                                                    if (var45 < 5 && var45 > -5) {
                                                                        var45 = 0;
                                                                    }
                                                                    int var46 = -class80.field1944 + class33.field827;
                                                                    if (~var46 > -6 && var46 > -5) {
                                                                        var46 = 0;
                                                                    }
                                                                    if (class31.field784 < 5) {
                                                                        var46 = 0;
                                                                        var45 = 0;
                                                                    }
                                                                    var44.method1115(var39 + var46, var38 + var45, 128);
                                                                    if (arg7 != -1) {
                                                                        class74 var47 = arg2[arg7 & 65535];
                                                                        int var48 = class52.field1247;
                                                                        int var49 = class52.field1246;
                                                                        if (~var49 < ~(var38 - -var45) && ~var47.field1789 < -1) {
                                                                            int var50 = (var49 - var45 + -var38) * class9.field212 / 3;
                                                                            if (~(class9.field212 * 10) > ~var50) {
                                                                                var50 = class9.field212 * 10;
                                                                            }
                                                                            if (var50 > var47.field1789) {
                                                                                var50 = var47.field1789;
                                                                            }
                                                                            class14.field340 += var50;
                                                                            var47.field1789 -= var50;
                                                                            class26.method232((byte) 67, var47);
                                                                        }
                                                                        if (var48 < var45 + 32 + var38 && -var47.field1748 + var47.field1792 > var47.field1789) {
                                                                            int var51 = (-var48 + var45 + var38 + 32) * class9.field212 / 3;
                                                                            if (class9.field212 * 10 < var51) {
                                                                                var51 = class9.field212 * 10;
                                                                            }
                                                                            if (~(var47.field1792 - var47.field1748 - var47.field1789) > ~var51) {
                                                                                var51 = -var47.field1748 + var47.field1792 + -var47.field1789;
                                                                            }
                                                                            var47.field1789 += var51;
                                                                            class14.field340 -= var51;
                                                                            class26.method232((byte) 107, var47);
                                                                        }
                                                                    }
                                                                } else if (class32.field820 == var11 && class35.field894 == var35) {
                                                                    var44.method1115(var39, var38, 128);
                                                                } else {
                                                                    var44.method1109(var39, var38);
                                                                }
                                                            }
                                                        }
                                                        ++var35;
                                                    }
                                                }
                                            } else if (~var11.field1807 == -4) {
                                                int var52;
                                                if (!class124.method961(var11, arg9 + -12224)) {
                                                    var52 = var11.field1700;
                                                    if (class151.field3379 == var11 && ~var11.field1763 != -1) {
                                                        var52 = var11.field1763;
                                                    }
                                                } else {
                                                    var52 = var11.field1759;
                                                    if (class151.field3379 == var11 && ~var11.field1781 != -1) {
                                                        var52 = var11.field1781;
                                                    }
                                                }
                                                if (var15 != 0) {
                                                    if (!var11.field1812) {
                                                        class52.method463(var13, var14, var11.field1779, var11.field1748, var52, -(255 & var15) + 256);
                                                    } else {
                                                        class52.method465(var13, var14, var11.field1779, var11.field1748, var52, -(var15 & 255) + 256);
                                                    }
                                                } else if (!var11.field1812) {
                                                    class52.method478(var13, var14, var11.field1779, var11.field1748, var52);
                                                } else {
                                                    class52.method473(var13, var14, var11.field1779, var11.field1748, var52);
                                                }
                                            } else if (~var11.field1807 == -5) {
                                                class28 var53 = var11.method624((byte) -30);
                                                if (var53 == null) {
                                                    if (class159.field3654) {
                                                        class26.method232((byte) 115, var11);
                                                    }
                                                } else {
                                                    class118 var54 = var11.field1713;
                                                    int var55;
                                                    if (class124.method961(var11, -12225)) {
                                                        var55 = var11.field1759;
                                                        if (class151.field3379 == var11 && ~var11.field1781 != -1) {
                                                            var55 = var11.field1781;
                                                        }
                                                        if (var11.field1801.method935(-68) > 0) {
                                                            var54 = var11.field1801;
                                                        }
                                                    } else {
                                                        var55 = var11.field1700;
                                                        if (class151.field3379 == var11 && ~var11.field1763 != -1) {
                                                            var55 = var11.field1763;
                                                        }
                                                    }
                                                    if (var11.field1805 && ~var11.field1710 != 0) {
                                                        class85 var56 = class131.method1013(-12582, var11.field1710);
                                                        var54 = var56.field2048;
                                                        if (var54 == null) {
                                                            var54 = class142.field3217;
                                                        }
                                                        if ((~var56.field2033 == -2 || var11.field1737 != 1) && var11.field1737 != -1) {
                                                            var54 = class144.method1066(true, new class118[] { field2184, var54, class97.field2270, class122.method959(var11.field1737, arg9 ^ 6) });
                                                        }
                                                    }
                                                    if (class101.field2351 == var11) {
                                                        var54 = class120.field2781;
                                                        var55 = var11.field1700;
                                                    }
                                                    if (!var11.field1805) {
                                                        var54 = class85.method701((byte) -102, var11, var54);
                                                    }
                                                    var53.method50(var54, var13, var14, var11.field1779, var11.field1748, var55, var11.field1755 ? 0 : -1, var11.field1761, var11.field1699, var11.field1744);
                                                }
                                            } else if (var11.field1807 == 5) {
                                                if (!var11.field1805) {
                                                    class150 var65 = var11.method629(class124.method961(var11, arg9 + -12224), arg9 ^ -2);
                                                    if (var65 == null) {
                                                        if (class159.field3654) {
                                                            class26.method232((byte) 79, var11);
                                                        }
                                                    } else {
                                                        var65.method1109(var13, var14);
                                                    }
                                                } else {
                                                    class150 var57;
                                                    if (~var11.field1710 != 0) {
                                                        var57 = class53.method485(var11.field1710, var11.field1771, var11.field1776, (byte) -30, false, var11.field1737);
                                                    } else {
                                                        var57 = var11.method629(false, 1);
                                                    }
                                                    if (var57 == null) {
                                                        if (class159.field3654) {
                                                            class26.method232((byte) 65, var11);
                                                        }
                                                    } else {
                                                        int var58 = var57.field3368;
                                                        int var59 = var57.field3369;
                                                        if (!var11.field1806) {
                                                            int var60 = var11.field1779 * 4096 / var58;
                                                            if (~var11.field1800 != -1) {
                                                                var57.method1112(var13 - -(var11.field1779 / 2), var14 - -(var11.field1748 / 2), var11.field1800, var60);
                                                            } else if (var15 == 0) {
                                                                if (~var11.field1779 == ~var58 && var11.field1748 == var59) {
                                                                    var57.method1109(var13, var14);
                                                                } else {
                                                                    var57.method1120(var13, var14, var11.field1779, var11.field1748);
                                                                }
                                                            } else {
                                                                var57.method1102(var13, var14, var11.field1779, var11.field1748, -(255 & var15) + 256);
                                                            }
                                                        } else {
                                                            class52.method474(var13, var14, var11.field1779 + var13, var11.field1748 + var14);
                                                            int var61 = (var11.field1779 - 1 - -var58) / var58;
                                                            int var62 = (var59 - 1 + var11.field1748) / var59;
                                                            int var63 = 0;
                                                            while (true) {
                                                                if (~var63 <= ~var61) {
                                                                    class52.method461(arg6, arg4, arg5, arg0);
                                                                    break;
                                                                }
                                                                for (int var64 = 0; var62 > var64; ++var64) {
                                                                    if (var11.field1800 != 0) {
                                                                        var57.method1112(var58 * var63 + var58 / 2 + var13, var59 * var64 + var14 - -(var59 / 2), var11.field1800, 4096);
                                                                    } else if (var15 == 0) {
                                                                        var57.method1109(var58 * var63 + var13, var59 * var64 + var14);
                                                                    } else {
                                                                        var57.method1115(var58 * var63 + var13, var59 * var64 + var14, -(255 & var15) + 256);
                                                                    }
                                                                }
                                                                ++var63;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (var11.field1807 == 6) {
                                                boolean var66 = class124.method961(var11, -12225);
                                                int var67;
                                                if (!var66) {
                                                    var67 = var11.field1726;
                                                } else {
                                                    var67 = var11.field1736;
                                                }
                                                class155 var68 = null;
                                                int var69 = 0;
                                                if (var11.field1710 != -1) {
                                                    class85 var70 = class131.method1013(arg9 + -12581, var11.field1710);
                                                    if (var70 != null) {
                                                        class85 var71 = var70.method699(var11.field1737, arg9 ^ -2);
                                                        var68 = var71.method697((byte) -109, 1);
                                                        if (var68 == null) {
                                                            class26.method232((byte) 119, var11);
                                                        } else {
                                                            var68.method1199();
                                                            var69 = var68.field2145 / 2;
                                                        }
                                                    }
                                                } else if (~var11.field1772 == -6) {
                                                    if (~var11.field1826 == -1) {
                                                        var68 = class130.field2970.method552(-1, (class153) null, false, -1, (class153) null);
                                                    } else {
                                                        var68 = class89.field2150.method215(15246);
                                                    }
                                                } else if (var67 != -1) {
                                                    class153 var72 = class125.method970((byte) -68, var67);
                                                    var68 = var11.method617(var11.field1707, var72, class89.field2150.field2993, var66, arg9 ^ -126);
                                                    if (var68 == null && class159.field3654) {
                                                        class26.method232((byte) 79, var11);
                                                    }
                                                } else {
                                                    var68 = var11.method617(-1, (class153) null, class89.field2150.field2993, var66, 18);
                                                    if (var68 == null && class159.field3654) {
                                                        class26.method232((byte) 60, var11);
                                                    }
                                                }
                                                class58.method511(var13 - -(var11.field1779 / 2), var11.field1748 / 2 + var14);
                                                int var73 = class58.field1354[var11.field1770] * var11.field1803 >> 16;
                                                int var74 = class58.field1346[var11.field1770] * var11.field1803 >> 16;
                                                if (var68 != null) {
                                                    if (!var11.field1805) {
                                                        var68.method1200(0, var11.field1809, 0, var11.field1770, 0, var73, var74);
                                                    } else {
                                                        var68.method1199();
                                                        if (!var11.field1716) {
                                                            var68.method1200(0, var11.field1809, var11.field1808, var11.field1770, var11.field1814, var11.field1796 + var73 + var69, var11.field1796 + var74);
                                                        } else {
                                                            var68.method1212(0, var11.field1809, var11.field1808, var11.field1770, var11.field1814, var11.field1796 + var69 + var73, var11.field1796 + var74, var11.field1803);
                                                        }
                                                    }
                                                }
                                                class58.method513();
                                            } else {
                                                label747: {
                                                    if (var11.field1807 == 7) {
                                                        class28 var75 = var11.method624((byte) -30);
                                                        if (var75 == null) {
                                                            if (class159.field3654) {
                                                                class26.method232((byte) 118, var11);
                                                            }
                                                            break label747;
                                                        }
                                                        int var76 = 0;
                                                        for (int var77 = 0; ~var77 > ~var11.field1748; ++var77) {
                                                            for (int var78 = 0; var78 < var11.field1779; ++var78) {
                                                                if (~var11.field1816[var76] < -1) {
                                                                    class85 var79 = class131.method1013(-12582, var11.field1816[var76] + -1);
                                                                    class118 var80;
                                                                    if (var79.field2033 != 1 && ~var11.field1743[var76] == -2) {
                                                                        var80 = class144.method1066(true, new class118[] { field2184, var79.field2048, class63.field1444 });
                                                                    } else {
                                                                        var80 = class144.method1066(true, new class118[] { field2184, var79.field2048, class97.field2270, class122.method959(var11.field1743[var76], -7) });
                                                                    }
                                                                    int var81 = var13 - -((var11.field1747 + 115) * var78);
                                                                    int var82 = var14 - -((var11.field1706 + 12) * var77);
                                                                    if (~var11.field1761 == -1) {
                                                                        var75.method47(var80, var81, var82, var11.field1700, var11.field1755 ? 0 : -1);
                                                                    } else if (~var11.field1761 != -2) {
                                                                        var75.method57(var80, var11.field1779 + var81 + -1, var82, var11.field1700, var11.field1755 ? 0 : -1);
                                                                    } else {
                                                                        var75.method44(var80, var11.field1779 / 2 + var81, var82, var11.field1700, !var11.field1755 ? -1 : 0);
                                                                    }
                                                                }
                                                                ++var76;
                                                            }
                                                        }
                                                    }
                                                    if (~var11.field1807 == -9 && class157.field3611 == var11 && class94.field2229 == class108.field2520) {
                                                        int var83 = 0;
                                                        class118 var84 = var11.field1713;
                                                        class28 var85 = class10.field228;
                                                        class118 var86 = class85.method701((byte) -110, var11, var84);
                                                        int var87 = 0;
                                                        while (~var86.method935(-72) < -1) {
                                                            int var95 = var86.method933((byte) -97, class44.field1057);
                                                            class118 var96;
                                                            if (~var95 != 0) {
                                                                var96 = var86.method932(var95, (byte) 121, 0);
                                                                var86 = var86.method926(var95 - -4, (byte) 117);
                                                            } else {
                                                                var96 = var86;
                                                                var86 = class110.field2567;
                                                            }
                                                            int var97 = var85.method33(var96);
                                                            if (var87 < var97) {
                                                                var87 = var97;
                                                            }
                                                            var83 += var85.field157 + 1;
                                                        }
                                                        var83 += 7;
                                                        var87 += 6;
                                                        int var88 = var13 + -5 + var11.field1779 + -var87;
                                                        if (~(var13 - -5) < ~var88) {
                                                            var88 = var13 + 5;
                                                        }
                                                        if (~arg5 > ~(var87 + var88)) {
                                                            var88 = arg5 - var87;
                                                        }
                                                        int var89 = var14 + 5 + var11.field1748;
                                                        if (~(var83 + var89) < ~arg0) {
                                                            var89 = arg0 - var83;
                                                        }
                                                        class52.method473(var88, var89, var87, var83, 16777120);
                                                        class52.method478(var88, var89, var87, var83, 0);
                                                        class118 var90 = var11.field1713;
                                                        int var91 = var89 + 2 + var85.field157;
                                                        class118 var92 = class85.method701((byte) -127, var11, var90);
                                                        while (var92.method935(arg9 ^ 117) > 0) {
                                                            int var93 = var92.method933((byte) -113, class44.field1057);
                                                            class118 var94;
                                                            if (var93 != -1) {
                                                                var94 = var92.method932(var93, (byte) 24, 0);
                                                                var92 = var92.method926(var93 - -4, (byte) 117);
                                                            } else {
                                                                var94 = var92;
                                                                var92 = class110.field2567;
                                                            }
                                                            var85.method47(var94, var88 + 3, var91, 0, -1);
                                                            var91 += var85.field157 + 1;
                                                        }
                                                    }
                                                    if (~var11.field1807 == -10) {
                                                        if (~var11.field1827 != -2) {
                                                            int var98 = ~var11.field1748 > -1 ? -var11.field1748 : var11.field1748;
                                                            int var99 = var11.field1779 < 0 ? -var11.field1779 : var11.field1779;
                                                            int var100 = var99;
                                                            if (~var98 < ~var99) {
                                                                var100 = var98;
                                                            }
                                                            if (~var100 != -1) {
                                                                int var101 = (var11.field1748 << 16) / var100;
                                                                int var102 = (var11.field1779 << 16) / var100;
                                                                if (var101 > var102) {
                                                                    var101 = -var101;
                                                                } else {
                                                                    var102 = -var102;
                                                                }
                                                                int var103 = var11.field1827 * var101 >> 17;
                                                                int var104 = var11.field1827 * var102 >> 17;
                                                                int var105 = var11.field1827 * var101 - -1 >> 17;
                                                                int var106 = var11.field1827 * var102 + 1 >> 17;
                                                                int var107 = -arg6 + var13;
                                                                int var108 = var107 - -var103;
                                                                int var109 = -arg4 + var14;
                                                                int var110 = var107 - var105 + var11.field1779;
                                                                int var111 = var11.field1779 + var103 + var107;
                                                                int var112 = var107 - var105;
                                                                int var113 = var109 - -var104;
                                                                int var114 = -var106 + var109;
                                                                int var115 = var11.field1748 + var109 + var104;
                                                                int var116 = -var106 + var11.field1748 + var109;
                                                                class58.method520(var108, var112, var110);
                                                                class58.method516(var113, var114, var116, var108, var112, var110, var11.field1700);
                                                                class58.method520(var108, var110, var111);
                                                                class58.method516(var113, var116, var115, var108, var110, var111, var11.field1700);
                                                            }
                                                        } else {
                                                            class52.method476(var13, var14, var13 - -var11.field1779, var14 - -var11.field1748, var11.field1700);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ++var10;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
    public class91(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!na", name = "u", descriptor = "(I)V")
    public static void method730(int arg0) {
        if (arg0 != -1) {
            field2181 = null;
        }
        field2188 = null;
        field2181 = null;
        field2168 = null;
        field2183 = null;
        field2174 = null;
        field2184 = null;
        field2185 = null;
        field2186 = null;
        field2189 = null;
        field2187 = null;
        field2167 = null;
        field2180 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(ZI)Lse;")
    public static final class130 method731(boolean arg0, int arg1) {
        class130 var2 = (class130) class62.field1440.method395((byte) -108, (long) arg1);
        ++field2163;
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            byte[] var3 = class27.field653.method350(16, -80, arg1);
            class130 var4 = new class130();
            if (var3 != null) {
                var4.method1009(new class105(var3), !arg0);
            }
            class62.field1440.method391(var4, (long) arg1, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "v", descriptor = "(I)V")
    public final void method732(int arg0) {
        if (arg0 != 1) {
            method731(true, 6);
        }
        super.field2404 = (this.field2177 + 7) / 8;
        ++field2164;
    }
}
