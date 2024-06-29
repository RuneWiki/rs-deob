import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class177 extends class248 {

    @OriginalMember(owner = "client!wg", name = "Ib", descriptor = "Z")
    public static boolean field2703 = false;

    @OriginalMember(owner = "client!wg", name = "Kb", descriptor = "[I")
    public static int[] field2705 = new int[32];

    @OriginalMember(owner = "client!wg", name = "Yb", descriptor = "[S")
    public static short[] field2719 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wg", name = "Ob", descriptor = "Lik;")
    public static class267 field2709 = new class267(64);

    @OriginalMember(owner = "client!wg", name = "Zb", descriptor = "Ldb;")
    public static class17 field2720 = new class17(128);

    @OriginalMember(owner = "client!wg", name = "bc", descriptor = "Z")
    public static boolean field2722 = true;

    @OriginalMember(owner = "client!wg", name = "Hb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!wg", name = "Jb", descriptor = "I")
    private int field2704;

    @OriginalMember(owner = "client!wg", name = "Lb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!wg", name = "Mb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!wg", name = "Nb", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!wg", name = "Pb", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!wg", name = "Qb", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!wg", name = "Rb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!wg", name = "Tb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!wg", name = "Ub", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!wg", name = "Vb", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!wg", name = "Wb", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!wg", name = "Xb", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!wg", name = "ac", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!wg", name = "Gb", descriptor = "Lmd;")
    private class227 field2701;

    @OriginalMember(owner = "client!wg", name = "Sb", descriptor = "Lng;")
    public static class78 field2713;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "(I)I")
    public final int method1094(int arg0) {
        if (arg0 != 17013) {
            this.method1102(96);
        }
        ++field2710;
        return super.field3723[super.field3748++] - this.field2701.method1449((byte) -65) & 255;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lrf;B)Z")
    public static final boolean method1095(class289 arg0, byte arg1) {
        ++field2702;
        if (arg0.field4516 == null) {
            return false;
        } else {
            int var2 = -20 % ((-20 - arg1) / 35);
            for (int var3 = 0; var3 < arg0.field4516.length; ++var3) {
                int var4 = class81.method531(arg0, var3, false);
                int var5 = arg0.field4409[var3];
                if (~arg0.field4516[var3] != -3) {
                    if (~arg0.field4516[var3] == -4) {
                        if (var4 <= var5) {
                            return false;
                        }
                    } else if (arg0.field4516[var3] == 4) {
                        if (var4 == var5) {
                            return false;
                        }
                    } else if (var4 != var5) {
                        return false;
                    }
                } else if (~var4 <= ~var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[B)V")
    public final void method1096(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2717;
        for (int var5 = arg2; arg0 > var5; ++var5) {
            arg3[arg1 + var5] = (byte) (super.field3723[super.field3748++] + -this.field2701.method1449((byte) -65));
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(II)I")
    public final int method1097(int arg0, int arg1) {
        if (arg1 != 8) {
            this.method1101(56, (int[]) null);
        }
        ++field2706;
        return arg0 * 8 + -this.field2704;
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(IB)I")
    public final int method1098(int arg0, byte arg1) {
        int var3 = -(7 & this.field2704) + 8;
        ++field2718;
        int var4 = 0;
        int var5 = this.field2704 >> 3;
        this.field2704 += arg0;
        int var6 = 72 % ((arg1 - 48) / 33);
        while (arg0 > var3) {
            var4 += (super.field3723[var5++] & class133.field1945[var3]) << -var3 + arg0;
            arg0 -= var3;
            var3 = 8;
        }
        int var7;
        if (arg0 == var3) {
            var7 = (super.field3723[var5] & class133.field1945[var3]) + var4;
        } else {
            var7 = (super.field3723[var5] >> -arg0 + var3 & class133.field1945[arg0]) + var4;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLqa;)V")
    public static final void method1099(byte arg0, class153 arg1) {
        arg1.field2298 = false;
        ++field2707;
        int var2 = -96 / ((-50 - arg0) / 44);
        if (arg1.field2303 != -1) {
            class215 var3 = class276.method1829(arg1.field2303, 29223);
            if (var3 != null && var3.field3215 != null) {
                ++arg1.field2222;
                if (~var3.field3215.length < ~arg1.field2264 && ~arg1.field2222 < ~var3.field3219[arg1.field2264]) {
                    ++arg1.field2235;
                    ++arg1.field2264;
                    arg1.field2222 = 1;
                    client.method966((byte) 52, arg1.field2264, class165.field2537 == arg1, arg1.field2234, var3, arg1.field2251);
                }
                if (var3.field3215.length <= arg1.field2264) {
                    arg1.field2264 = 0;
                    arg1.field2222 = 0;
                    client.method966((byte) 52, arg1.field2264, class165.field2537 == arg1, arg1.field2234, var3, arg1.field2251);
                }
                arg1.field2235 = arg1.field2264 + 1;
                if (arg1.field2235 >= var3.field3215.length) {
                    arg1.field2235 = 0;
                }
            } else {
                arg1.field2303 = -1;
            }
        }
        if (~arg1.field2230 != 0 && ~arg1.field2280 >= ~class270.field4058) {
            class21 var4 = class236.method1498((byte) -122, arg1.field2230);
            int var5 = var4.field249;
            if (var5 == -1) {
                arg1.field2230 = -1;
            } else {
                label294: {
                    class215 var6 = class276.method1829(var5, 29223);
                    if (var4.field256) {
                        if (~var6.field3242 != -4) {
                            if (~var6.field3242 == -2 && ~arg1.field2246 < -1 && arg1.field2262 <= class270.field4058 && arg1.field2289 < class270.field4058) {
                                arg1.field2280 = class270.field4058 - -1;
                                break label294;
                            }
                        } else if (~arg1.field2246 < -1 && ~class270.field4058 <= ~arg1.field2262 && ~class270.field4058 < ~arg1.field2289) {
                            arg1.field2230 = -1;
                            break label294;
                        }
                    }
                    if (var6 != null && var6.field3215 != null) {
                        if (~arg1.field2201 > -1) {
                            arg1.field2201 = 0;
                            client.method966((byte) 52, 0, class165.field2537 == arg1, arg1.field2234, var6, arg1.field2251);
                        }
                        ++arg1.field2218;
                        if (var6.field3215.length > arg1.field2201 && var6.field3219[arg1.field2201] < arg1.field2218) {
                            ++arg1.field2201;
                            arg1.field2218 = 1;
                            client.method966((byte) 52, arg1.field2201, class165.field2537 == arg1, arg1.field2234, var6, arg1.field2251);
                        }
                        if (~var6.field3215.length >= ~arg1.field2201) {
                            if (!var4.field256) {
                                arg1.field2230 = -1;
                            } else {
                                arg1.field2201 -= var6.field3218;
                                ++arg1.field2249;
                                if (arg1.field2249 >= var6.field3216) {
                                    arg1.field2230 = -1;
                                } else if (~arg1.field2201 <= -1 && ~arg1.field2201 > ~var6.field3215.length) {
                                    client.method966((byte) 52, arg1.field2201, class165.field2537 == arg1, arg1.field2234, var6, arg1.field2251);
                                } else {
                                    arg1.field2230 = -1;
                                }
                            }
                        }
                        arg1.field2272 = arg1.field2201 + 1;
                        if (~arg1.field2272 <= ~var6.field3215.length) {
                            if (!var4.field256) {
                                arg1.field2272 = -1;
                            } else {
                                arg1.field2272 -= var6.field3218;
                                if (~(arg1.field2249 + 1) > ~var6.field3216) {
                                    if (~arg1.field2272 > -1 || var6.field3215.length <= arg1.field2272) {
                                        arg1.field2272 = -1;
                                    }
                                } else {
                                    arg1.field2272 = -1;
                                }
                            }
                        }
                    } else {
                        arg1.field2230 = -1;
                    }
                }
            }
        }
        if (~arg1.field2260 != 0 && ~arg1.field2204 >= -2) {
            class215 var7 = class276.method1829(arg1.field2260, 29223);
            if (~var7.field3242 != -4) {
                if (var7.field3242 == 1 && ~arg1.field2246 < -1 && class270.field4058 >= arg1.field2262 && ~arg1.field2289 > ~class270.field4058) {
                    arg1.field2204 = 1;
                }
            } else if (arg1.field2246 > 0 && arg1.field2262 <= class270.field4058 && arg1.field2289 < class270.field4058) {
                arg1.field2260 = -1;
            }
        }
        if (~arg1.field2260 != 0 && ~arg1.field2204 == -1) {
            class215 var8 = class276.method1829(arg1.field2260, 29223);
            if (var8 != null && var8.field3215 != null) {
                ++arg1.field2237;
                if (var8.field3215.length > arg1.field2207 && ~var8.field3219[arg1.field2207] > ~arg1.field2237) {
                    ++arg1.field2207;
                    arg1.field2237 = 1;
                    client.method966((byte) 52, arg1.field2207, class165.field2537 == arg1, arg1.field2234, var8, arg1.field2251);
                }
                if (~var8.field3215.length >= ~arg1.field2207) {
                    arg1.field2207 -= var8.field3218;
                    ++arg1.field2270;
                    if (~var8.field3216 >= ~arg1.field2270) {
                        arg1.field2260 = -1;
                    } else if (arg1.field2207 >= 0 && var8.field3215.length > arg1.field2207) {
                        client.method966((byte) 52, arg1.field2207, class165.field2537 == arg1, arg1.field2234, var8, arg1.field2251);
                    } else {
                        arg1.field2260 = -1;
                    }
                }
                arg1.field2215 = arg1.field2207 - -1;
                if (arg1.field2215 >= var8.field3215.length) {
                    arg1.field2215 -= var8.field3218;
                    if (var8.field3216 > arg1.field2270 + 1) {
                        if (~arg1.field2215 > -1 || var8.field3215.length <= arg1.field2215) {
                            arg1.field2215 = -1;
                        }
                    } else {
                        arg1.field2215 = -1;
                    }
                }
                arg1.field2298 = var8.field3236;
            } else {
                arg1.field2260 = -1;
            }
        }
        if (arg1.field2204 > 0) {
            --arg1.field2204;
        }
        for (int var9 = 0; arg1.field2290.length > var9; ++var9) {
            class44 var10 = arg1.field2290[var9];
            if (var10 != null) {
                if (var10.field698 > 0) {
                    --var10.field698;
                } else {
                    class215 var11 = class276.method1829(var10.field702, 29223);
                    if (var11 != null && var11.field3215 != null) {
                        ++var10.field699;
                        if (var10.field700 < var11.field3215.length && ~var11.field3219[var10.field700] > ~var10.field699) {
                            var10.field699 = 1;
                            ++var10.field700;
                            client.method966((byte) 52, var10.field700, class165.field2537 == arg1, arg1.field2234, var11, arg1.field2251);
                        }
                        if (~var11.field3215.length >= ~var10.field700) {
                            var10.field700 -= var11.field3218;
                            ++var10.field703;
                            if (~var10.field703 > ~var11.field3216) {
                                if (~var10.field700 <= -1 && var10.field700 < var11.field3215.length) {
                                    client.method966((byte) 52, var10.field700, class165.field2537 == arg1, arg1.field2234, var11, arg1.field2251);
                                } else {
                                    arg1.field2290[var9] = null;
                                }
                            } else {
                                arg1.field2290[var9] = null;
                            }
                        }
                        var10.field701 = var10.field700 + 1;
                        if (var11.field3215.length <= var10.field701) {
                            var10.field701 -= var11.field3218;
                            if (var10.field703 + 1 >= var11.field3216) {
                                var10.field701 = -1;
                            } else if (~var10.field701 > -1 || ~var10.field701 <= ~var11.field3215.length) {
                                var10.field701 = -1;
                            }
                        }
                    } else {
                        arg1.field2290[var9] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIII)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class146.field2137 = -1;
        int var5 = 43 % ((35 - arg2) / 53);
        class268.field4042 = class99.field1564 * arg4 / arg0;
        class61.field973 = -1;
        class3.field51 = class106.field1616 * arg1 / arg3;
        ++field2715;
        class282.method1860(1);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I[I)V")
    public final void method1101(int arg0, int[] arg1) {
        this.field2701 = new class227(arg1);
        ++field2708;
        if (arg0 >= -61) {
            method1100(104, 95, 44, -98, -126);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
    public class177(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "(I)V")
    public final void method1102(int arg0) {
        ++field2714;
        this.field2704 = super.field3748 * 8;
        if (arg0 != -2836) {
            method1104(26, 58, -120, 122, -114, -113);
        }
    }

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "(B)V")
    public final void method1103(byte arg0) {
        if (arg0 == -65) {
            ++field2711;
            super.field3748 = (this.field2704 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2716;
        for (int var6 = arg0; ~var6 >= ~(arg0 + arg1); ++var6) {
            for (int var11 = arg3; arg2 + arg3 >= var11; ++var11) {
                if (~var11 <= -1 && ~var11 > -105 && var6 >= 0 && var6 < 104) {
                    class118.field1784[arg4][var11][var6] = 127;
                }
            }
        }
        if (arg5 != 3548) {
            field2705 = null;
        }
        for (int var7 = arg0; arg0 - -arg1 > var7; ++var7) {
            for (int var10 = arg3; arg3 - -arg2 > var10; ++var10) {
                if (~var10 <= -1 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class67.field1072[arg4][var10][var7] = ~arg4 >= -1 ? 0 : class67.field1072[arg4 + -1][var10][var7];
                }
            }
        }
        if (~arg3 < -1 && arg3 < 104) {
            for (int var8 = arg0 - -1; var8 < arg0 - -arg1; ++var8) {
                if (var8 >= 0 && var8 < 104) {
                    class67.field1072[arg4][arg3][var8] = class67.field1072[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var9 = arg3 + 1; arg2 + arg3 > var9; ++var9) {
                if (var9 >= 0 && ~var9 > -105) {
                    class67.field1072[arg4][var9][arg0] = class67.field1072[arg4][var9][arg0 + -1];
                }
            }
        }
        if (~arg3 <= -1 && arg0 >= 0 && ~arg3 > -105 && ~arg0 > -105) {
            if (~arg4 == -1) {
                if (~arg3 < -1 && ~class67.field1072[arg4][arg3 - 1][arg0] != -1) {
                    class67.field1072[arg4][arg3][arg0] = class67.field1072[arg4][arg3 + -1][arg0];
                    return;
                }
                if (~arg0 < -1 && class67.field1072[arg4][arg3][arg0 + -1] != 0) {
                    class67.field1072[arg4][arg3][arg0] = class67.field1072[arg4][arg3][arg0 - 1];
                    return;
                }
                if (arg3 > 0 && ~arg0 < -1 && class67.field1072[arg4][arg3 - 1][arg0 + -1] != 0) {
                    class67.field1072[arg4][arg3][arg0] = class67.field1072[arg4][arg3 - 1][arg0 + -1];
                    return;
                }
            } else {
                if (~arg3 >= -1 || ~class67.field1072[arg4][arg3 + -1][arg0] == ~class67.field1072[arg4 + -1][arg3 + -1][arg0]) {
                    if (~arg0 < -1 && class67.field1072[arg4][arg3][arg0 - 1] != class67.field1072[arg4 + -1][arg3][arg0 + -1]) {
                        class67.field1072[arg4][arg3][arg0] = class67.field1072[arg4][arg3][arg0 - 1];
                        return;
                    }
                    if (arg3 > 0 && arg0 > 0 && class67.field1072[arg4][arg3 + -1][arg0 - 1] != class67.field1072[arg4 - 1][arg3 + -1][arg0 + -1]) {
                        class67.field1072[arg4][arg3][arg0] = class67.field1072[arg4][arg3 + -1][arg0 + -1];
                        return;
                    }
                    return;
                }
                class67.field1072[arg4][arg3][arg0] = class67.field1072[arg4][arg3 + -1][arg0];
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "(I)V")
    public static void method1105(int arg0) {
        field2709 = null;
        field2719 = null;
        field2720 = null;
        int var1 = 54 % ((arg0 - 61) / 58);
        field2713 = null;
        field2705 = null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IZ)V")
    public final void method1106(int arg0, boolean arg1) {
        if (arg1) {
            method1100(-119, 126, 8, -24, -22);
        }
        ++field2712;
        super.field3723[super.field3748++] = (byte) (this.field2701.method1449((byte) -65) + arg0);
    }
}
