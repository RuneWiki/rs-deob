import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class304 extends class645 {

    @OriginalMember(owner = "client!vt", name = "Zb", descriptor = "I")
    public static int field4319 = 1;

    @OriginalMember(owner = "client!vt", name = "Gb", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vt", name = "Hb", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!vt", name = "Ib", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vt", name = "Kb", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vt", name = "Lb", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!vt", name = "Mb", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vt", name = "Nb", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!vt", name = "Ob", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!vt", name = "Pb", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!vt", name = "Qb", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!vt", name = "Rb", descriptor = "I")
    private int field4311;

    @OriginalMember(owner = "client!vt", name = "Tb", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!vt", name = "Vb", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!vt", name = "Wb", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!vt", name = "Xb", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!vt", name = "Yb", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!vt", name = "Ub", descriptor = "Lom;")
    public static class374 field4314;

    @OriginalMember(owner = "client!vt", name = "Sb", descriptor = "Lpga;")
    public static class536 field4312;

    @OriginalMember(owner = "client!vt", name = "Jb", descriptor = "Lhd;")
    private class744 field4303;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "(B)V")
    public final void method1913(byte arg0) {
        if (arg0 > -81) {
            field4300 = -33;
        }
        ++field4308;
        this.field4311 = super.field9084 * 8;
    }

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "(II)I")
    public final int method1914(int arg0, int arg1) {
        if (arg0 != 11356) {
            this.method1922(55);
        }
        ++field4309;
        int var3 = this.field4311 >> 3;
        int var4 = 8 - (7 & this.field4311);
        int var5 = 0;
        this.field4311 += arg1;
        while (~var4 > ~arg1) {
            var5 += (class32.field331[var4] & super.field9068[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (super.field9068[var3] & class32.field331[var4]) + var5;
        } else {
            var6 = (super.field9068[var3] >> -arg1 + var4 & class32.field331[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "(B)I")
    public final int method1915(byte arg0) {
        ++field4302;
        if (arg0 != -14) {
            return -96;
        } else {
            int var2 = super.field9068[super.field9084++] - this.field4303.method4162(true) & 255;
            return ~var2 > -129 ? var2 : (var2 - 128 << 8) - -(255 & super.field9068[super.field9084++] - this.field4303.method4162(true));
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([BIII)V")
    public final void method1916(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field4306;
        for (int var5 = arg1; var5 < arg2; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field9068[super.field9084++] + -this.field4303.method4162(true));
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILhd;)V")
    public final void method1917(int arg0, class744 arg1) {
        this.field4303 = arg1;
        ++field4315;
        if (arg0 != -32769) {
            field4312 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([SI)[S")
    public static final short[] method1918(short[] arg0, int arg1) {
        ++field4317;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 != -980740478) {
                method1924((class645) null, 48);
            }
            short[] var2 = new short[arg0.length];
            class319.method2020(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V")
    public class304(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([II)V")
    public final void method1919(int[] arg0, int arg1) {
        if (arg1 >= -87) {
            field4314 = null;
        }
        ++field4316;
        this.field4303 = new class744(arg0);
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(Z)V")
    public static void method1920(boolean arg0) {
        field4312 = null;
        field4314 = null;
        if (arg0) {
            method1923(-97, 56, -17, (class665) null, (class665) null);
        }
    }

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "(II)V")
    public final void method1921(int arg0, int arg1) {
        ++field4301;
        super.field9068[super.field9084++] = (byte) (this.field4303.method4162(true) + arg0);
        if (arg1 != 2537) {
            this.method1917(-67, (class744) null);
        }
    }

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "(I)Z")
    public final boolean method1922(int arg0) {
        ++field4310;
        if (arg0 >= -64) {
            field4314 = null;
        }
        int var2 = 255 & super.field9068[super.field9084] - this.field4303.method4161(13837);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIILica;Lica;)V")
    public static final void method1923(int arg0, int arg1, int arg2, class665 arg3, class665 arg4) {
        class186 var5 = class467.method2834(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2835 = arg3;
            var5.field2832 = arg4;
            int var6 = class582.field8287 == class46.field568 ? 1 : 0;
            if (arg3.method320((byte) 84)) {
                if (arg3.method329((byte) 71)) {
                    arg3.field8431 = class614.field8664[var6];
                    class614.field8664[var6] = arg3;
                } else {
                    arg3.field8431 = class577.field8153[var6];
                    class577.field8153[var6] = arg3;
                    class226.field3323 = true;
                }
            } else {
                arg3.field8431 = class374.field5677[var6];
                class374.field5677[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method320((byte) 84)) {
                    if (arg4.method329((byte) 23)) {
                        arg4.field8431 = class614.field8664[var6];
                        class614.field8664[var6] = arg4;
                        return;
                    }
                    arg4.field8431 = class577.field8153[var6];
                    class577.field8153[var6] = arg4;
                    class226.field3323 = true;
                    return;
                }
                arg4.field8431 = class374.field5677[var6];
                class374.field5677[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lrg;I)Lap;")
    public static final class478 method1924(class645 arg0, int arg1) {
        ++field4313;
        class739 var2 = class600.method3490((byte) -2, arg0);
        int var3 = arg0.method3712((byte) -107);
        int var4 = arg0.method3712((byte) -117);
        int var5 = arg0.method3712((byte) -105);
        int var6 = arg0.method3712((byte) 18);
        int var7 = arg0.method3712((byte) -106);
        if (arg1 != -9) {
            field4305 = 53;
        }
        int var8 = arg0.method3712((byte) 76);
        return new class478(var2.field10372, var2.field10360, var2.field10369, var2.field10365, var2.field10371, var2.field10364, var2.field10359, var2.field10368, var2.field10358, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "(II)I")
    public final int method1925(int arg0, int arg1) {
        ++field4304;
        if (arg1 > -19) {
            this.field4303 = null;
        }
        return arg0 * 8 + -this.field4311;
    }

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "(B)V")
    public final void method1926(byte arg0) {
        ++field4307;
        super.field9084 = (this.field4311 - -7) / 8;
        if (arg0 != 44) {
            field4319 = -66;
        }
    }
}
