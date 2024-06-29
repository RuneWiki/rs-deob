import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class159 extends class27 {

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Lkb;")
    public static class93 field3204 = class76.method390(")3", 0);

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Lkb;")
    private static class93 field3206 = class76.method390("Press (Wchange your password(W on front page)3", 0);

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lkb;")
    public static class93 field3201 = field3206;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Ljg;")
    public static class89 field3200;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Ljg;")
    public static class89 field3208;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1088(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3203;
        class110 var5 = (class110) class98.field1834.method692(!arg4);
        if (!arg4) {
            field3204 = null;
        }
        while (var5 != null) {
            if (~var5.field1994 != 0 || var5.field1985 != null) {
                int var6 = 0;
                if (~var5.field1990 > ~arg2) {
                    var6 += -var5.field1990 + arg2;
                } else if (var5.field1992 > arg2) {
                    var6 += -arg2 + var5.field1992;
                }
                if (arg0 > var5.field1986) {
                    var6 += -var5.field1986 + arg0;
                } else if (~arg0 > ~var5.field1979) {
                    var6 += -arg0 + var5.field1979;
                }
                if (~(var6 + -64) >= ~var5.field1995 && class167.field3334 != 0 && var5.field1982 == arg1) {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (-var6 + var5.field1995) * class167.field3334 / var5.field1995;
                    if (var5.field1977 != null) {
                        var5.field1977.method1300(var7);
                    } else if (~var5.field1994 <= -1) {
                        class48 var8 = class48.method257(class76.field1375, var5.field1994, 0);
                        if (var8 != null) {
                            class202 var9 = var8.method260().method1317(class138.field2673);
                            class199 var10 = class199.method1272(var9, 100, var7);
                            var10.method1277(-1);
                            class184.field3634.method1137(var10);
                            var5.field1977 = var10;
                        }
                    }
                    if (var5.field1975 == null) {
                        if (var5.field1985 != null && ~(var5.field1980 -= arg3) >= -1) {
                            int var11 = (int) (Math.random() * (double) var5.field1985.length);
                            class48 var12 = class48.method257(class76.field1375, var5.field1985[var11], 0);
                            if (var12 != null) {
                                class202 var13 = var12.method260().method1317(class138.field2673);
                                class199 var14 = class199.method1272(var13, 100, var7);
                                var14.method1277(0);
                                class184.field3634.method1137(var14);
                                var5.field1980 = (int) (Math.random() * (double) (-var5.field1981 + var5.field1978)) + var5.field1981;
                                var5.field1975 = var14;
                            }
                        }
                    } else {
                        var5.field1975.method1300(var7);
                        if (!var5.field1975.method238((byte) -66)) {
                            var5.field1975 = null;
                        }
                    }
                } else {
                    if (var5.field1977 != null) {
                        class184.field3634.method1133(var5.field1977);
                        var5.field1977 = null;
                    }
                    if (var5.field1975 != null) {
                        class184.field3634.method1133(var5.field1975);
                        var5.field1975 = null;
                    }
                }
            }
            var5 = (class110) class98.field1834.method695(512);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)I")
    private final int method1089(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1089(-87, false, 107);
        }
        ++field3199;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
    public static void method1090(boolean arg0) {
        field3201 = null;
        field3206 = null;
        if (!arg0) {
            field3205 = 119;
        }
        field3204 = null;
        field3208 = null;
        field3200 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Lte;")
    public static final class177 method1091(byte arg0, int arg1) {
        class177 var2 = (class177) class15.field266.method680((long) arg1, (byte) -66);
        if (arg0 != 63) {
            return null;
        } else {
            ++field3198;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class127.field2399.method461(4, (byte) 103, arg1);
                class177 var4 = new class177();
                if (var3 != null) {
                    var4.method1169(new class158(var3), arg1, (byte) -12);
                }
                class15.field266.method678(true, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lmc;I)V")
    public static final void method1092(class112 arg0, int arg1) {
        if (class21.field338 == arg0.field2037 || ~arg0.field2077 == 0 || arg0.field2062 != 0 || ~(arg0.field2039 + 1) < ~class39.method213(-10639, arg0.field2077).field615[arg0.field2012]) {
            int var2 = class21.field338 - arg0.field2056;
            int var3 = -arg0.field2056 + arg0.field2037;
            int var4 = arg0.field2046 * 64 + arg0.field2027 * 128;
            int var5 = arg0.field2046 * 64 + arg0.field2035 * 128;
            int var6 = arg0.field2046 * 64 + arg0.field2017 * 128;
            arg0.field2032 = ((-var2 + var3) * var4 + var2 * var6) / var3;
            int var7 = arg0.field2046 * 64 + arg0.field2023 * 128;
            arg0.field2045 = ((-var2 + var3) * var5 + var2 * var7) / var3;
        }
        ++field3207;
        if (arg0.field2061 == 0) {
            arg0.field2071 = 1024;
        }
        if (arg0.field2061 == 1) {
            arg0.field2071 = 1536;
        }
        arg0.field2043 = 0;
        if (arg0.field2061 == 2) {
            arg0.field2071 = 0;
        }
        if (arg1 != 128) {
            field3209 = -113;
        }
        if (arg0.field2061 == 3) {
            arg0.field2071 = 512;
        }
        arg0.field2075 = arg0.field2071;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lmc;I)V")
    public static final void method1093(class112 arg0, int arg1) {
        ++field3210;
        arg0.field2055 = false;
        if (~arg0.field2054 != 0) {
            class37 var2 = class39.method213(-10639, arg0.field2054);
            if (var2 != null && var2.field616 != null) {
                ++arg0.field2033;
                if (~var2.field616.length < ~arg0.field2018 && var2.field615[arg0.field2018] < arg0.field2033) {
                    arg0.field2033 = 1;
                    ++arg0.field2018;
                    class70.method368(class106.field1940 == arg0, 32333, arg0.field2018, var2, arg0.field2032, arg0.field2045);
                }
                if (arg0.field2018 >= var2.field616.length) {
                    arg0.field2033 = 0;
                    arg0.field2018 = 0;
                    class70.method368(class106.field1940 == arg0, 32333, arg0.field2018, var2, arg0.field2032, arg0.field2045);
                }
            } else {
                arg0.field2054 = -1;
            }
        }
        if (~arg0.field2040 != 0 && arg0.field2058 <= class21.field338) {
            if (~arg0.field2019 > -1) {
                arg0.field2019 = 0;
            }
            int var3 = class176.method1163(arg0.field2040, -44).field907;
            if (var3 != -1) {
                class37 var4 = class39.method213(-10639, var3);
                if (var4 != null && var4.field616 != null) {
                    ++arg0.field2066;
                    if (~arg0.field2019 > ~var4.field616.length && arg0.field2066 > var4.field615[arg0.field2019]) {
                        arg0.field2066 = 1;
                        ++arg0.field2019;
                        class70.method368(class106.field1940 == arg0, 32333, arg0.field2019, var4, arg0.field2032, arg0.field2045);
                    }
                    if (arg0.field2019 >= var4.field616.length) {
                        arg0.field2040 = -1;
                    }
                } else {
                    arg0.field2040 = -1;
                }
            } else {
                arg0.field2040 = -1;
            }
        }
        if (~arg0.field2077 != 0 && arg0.field2062 <= 1) {
            class37 var5 = class39.method213(-10639, arg0.field2077);
            if (~var5.field612 == -2 && ~arg0.field2050 < -1 && ~class21.field338 <= ~arg0.field2056 && arg0.field2037 < class21.field338) {
                arg0.field2062 = 1;
                return;
            }
        }
        if (arg0.field2077 != -1 && ~arg0.field2062 == -1) {
            class37 var6 = class39.method213(-10639, arg0.field2077);
            if (var6 != null && var6.field616 != null) {
                ++arg0.field2039;
                if (~var6.field616.length < ~arg0.field2012 && ~var6.field615[arg0.field2012] > ~arg0.field2039) {
                    arg0.field2039 = 1;
                    ++arg0.field2012;
                    class70.method368(class106.field1940 == arg0, 32333, arg0.field2012, var6, arg0.field2032, arg0.field2045);
                }
                if (~var6.field616.length >= ~arg0.field2012) {
                    ++arg0.field2070;
                    arg0.field2012 -= var6.field609;
                    if (var6.field621 > arg0.field2070) {
                        if (arg0.field2012 >= 0 && ~var6.field616.length < ~arg0.field2012) {
                            class70.method368(class106.field1940 == arg0, 32333, arg0.field2012, var6, arg0.field2032, arg0.field2045);
                        } else {
                            arg0.field2077 = -1;
                        }
                    } else {
                        arg0.field2077 = -1;
                    }
                }
                arg0.field2055 = var6.field605;
            } else {
                arg0.field2077 = -1;
            }
        }
        int var7 = -6 % ((45 - arg1) / 59);
        if (~arg0.field2062 < -1) {
            --arg0.field2062;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field3202;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class142.field2781[arg0];
            for (int var5 = 0; var5 < field3209; ++var5) {
                var3[var5] = this.method1089(var4, false, class97.field1808[var5]) % 4096;
            }
        }
        return var3;
    }
}
