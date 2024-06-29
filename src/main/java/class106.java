import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class106 extends class112 {

    @OriginalMember(owner = "client!jh", name = "Mb", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!jh", name = "Fb", descriptor = "Lmb;")
    public static class132 field1977 = class166.method1092("da dieser Computer gegen unsere ", 111);

    @OriginalMember(owner = "client!jh", name = "Sb", descriptor = "Lmb;")
    private static class132 field1990 = class166.method1092("This computers address has been blocked", 125);

    @OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lmb;")
    public static class132 field1978 = field1990;

    @OriginalMember(owner = "client!jh", name = "Hb", descriptor = "[Loc;")
    public static class155[] field1979 = new class155[256];

    @OriginalMember(owner = "client!jh", name = "Tb", descriptor = "Lmb;")
    public static class132 field1991 = class166.method1092(")3", 126);

    @OriginalMember(owner = "client!jh", name = "Db", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!jh", name = "Eb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!jh", name = "Ib", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!jh", name = "Jb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!jh", name = "Kb", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!jh", name = "Nb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!jh", name = "Ob", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!jh", name = "Pb", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!jh", name = "Qb", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!jh", name = "Rb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!jh", name = "Ub", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!jh", name = "Vb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!jh", name = "Lb", descriptor = "Lpb;")
    public static class165 field1983;

    @OriginalMember(owner = "client!jh", name = "Cb", descriptor = "Lqd;")
    private class178 field1974;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Lei;")
    public static class54 field1973;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III[B)V")
    public final void method648(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 == 7853) {
            for (int var5 = 0; var5 < arg1; ++var5) {
                arg3[var5 - -arg0] = (byte) (super.field2157[super.field2133++] + -this.field1974.method1151((byte) -11));
            }
            ++field1993;
        }
    }

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "(II)I")
    public final int method649(int arg0, int arg1) {
        ++field1976;
        int var3 = this.field1987 >> 3;
        int var4 = -(7 & this.field1987) + 8;
        int var5 = 0;
        this.field1987 += arg0;
        if (arg1 != 25091) {
            field1979 = null;
        }
        while (arg0 > var4) {
            var5 += (class103.field1925[var4] & super.field2157[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field2157[var3] >> var4 - arg0 & class103.field1925[arg0]) + var5;
        } else {
            var6 = (class103.field1925[var4] & super.field2157[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "(I)V")
    public final void method650(int arg0) {
        ++field1981;
        super.field2133 = (this.field1987 + 7) / 8;
        if (arg0 >= -54) {
            this.method660(6, -50);
        }
    }

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "(B)V")
    public final void method651(byte arg0) {
        this.field1987 = super.field2133 * 8;
        ++field1992;
        if (arg0 != 80) {
            field1977 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class106(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "(I)I")
    public final int method652(int arg0) {
        int var2 = -113 / ((arg0 - 50) / 49);
        ++field1988;
        return super.field2157[super.field2133++] + -this.field1974.method1151((byte) 125) & 255;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(IB)I")
    public final int method653(int arg0, byte arg1) {
        ++field1985;
        int var3 = 115 % ((arg1 - 34) / 46);
        return arg0 * 8 - this.field1987;
    }

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "(B)V")
    public static final void method654(byte arg0) {
        if (arg0 != 43) {
            field1977 = null;
        }
        ++field1986;
        for (class105 var1 = (class105) class181.field3325.method119(true); var1 != null; var1 = (class105) class181.field3325.method125((byte) -85)) {
            class97 var2 = var1.field1967;
            if (class139.field2615 == var2.field1855 && !var2.field1853) {
                if (class30.field460 >= var2.field1851) {
                    var2.method610(class112.field2118, arg0 ^ 51);
                    if (var2.field1853) {
                        var1.method995((byte) 112);
                    } else {
                        class35.method249(var2.field1855, var2.field1867, var2.field1843, var2.field1864, 60, var2, 0, -1L, false);
                    }
                }
            } else {
                var1.method995((byte) 89);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIB[Ltf;II[B)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class210[] arg6, int arg7, int arg8, byte[] arg9) {
        ++field1989;
        if (arg5 < -123) {
            int var10 = -1;
            class112 var11 = new class112(arg9);
            while (true) {
                int var12 = var11.method754(4695);
                if (~var12 == -1) {
                    return;
                }
                var10 += var12;
                int var13 = 0;
                while (true) {
                    int var14 = var11.method754(4695);
                    if (~var14 == -1) {
                        break;
                    }
                    var13 += var14 + -1;
                    int var15 = 63 & var13;
                    int var16 = (var13 & 4036) >> 6;
                    int var17 = var13 >> 12;
                    int var18 = var11.method716(-1308);
                    int var19 = var18 >> 2;
                    int var20 = 3 & var18;
                    if (~arg0 == ~var17 && ~var16 <= ~arg1 && var16 < arg1 + 8 && ~var15 <= ~arg7 && arg7 + 8 > var15) {
                        class84 var21 = class66.method414(0, var10);
                        int var22 = arg8 - -class36.method258(7 & var15, true, var20, var21.field1440, arg4, var21.field1434, 7 & var16);
                        int var23 = arg3 - -class40.method281(var20, arg4, var21.field1434, 7 & var15, var21.field1440, 7 & var16, true);
                        if (var22 > 0 && var23 > 0 && ~var22 > -104 && ~var23 > -104) {
                            int var24 = arg2;
                            if (~(class148.field2722[1][var22][var23] & 2) == -3) {
                                var24 = arg2 - 1;
                            }
                            class210 var25 = null;
                            if (~var24 <= -1) {
                                var25 = arg6[var24];
                            }
                            class161.method1042(var19, var10, arg2, class66.field1096, var22, var23, 3 & arg4 + var20, var25, (byte) 123, arg2, true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "(B)V")
    public static void method656(byte arg0) {
        field1979 = null;
        field1977 = null;
        field1991 = null;
        field1978 = null;
        field1983 = null;
        field1973 = null;
        if (arg0 != -50) {
            field1978 = null;
        }
        field1990 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[I)V")
    public final void method657(int arg0, int[] arg1) {
        this.field1974 = new class178(arg1);
        ++field1982;
        if (arg0 >= -110) {
            this.method657(-62, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(IB)I")
    public static final int method658(int arg0, byte arg1) {
        if (arg1 >= -46) {
            field1973 = null;
        }
        ++field1975;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIILmf;IJ)Z")
    public static final boolean method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class136 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class123.method814(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "(II)V")
    public final void method660(int arg0, int arg1) {
        super.field2157[super.field2133++] = (byte) (arg0 + this.field1974.method1151((byte) -116));
        if (arg1 != 3) {
            this.field1974 = null;
        }
        ++field1980;
    }
}
