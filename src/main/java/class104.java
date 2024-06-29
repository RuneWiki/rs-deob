import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class104 extends class3 {

    @OriginalMember(owner = "client!le", name = "Kb", descriptor = "[I")
    public static int[] field2388 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!le", name = "Rb", descriptor = "Lgg;")
    private static class63 field2395 = class116.method911(43, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!le", name = "Ub", descriptor = "Z")
    public static boolean field2398 = false;

    @OriginalMember(owner = "client!le", name = "Tb", descriptor = "Lgg;")
    public static class63 field2397 = class116.method911(43, "<col=ff7000>");

    @OriginalMember(owner = "client!le", name = "Xb", descriptor = "Lgg;")
    private static class63 field2401 = class116.method911(43, "Take");

    @OriginalMember(owner = "client!le", name = "Ib", descriptor = "Lgg;")
    public static class63 field2386 = class116.method911(43, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!le", name = "Yb", descriptor = "Lgg;")
    public static class63 field2402 = field2395;

    @OriginalMember(owner = "client!le", name = "Zb", descriptor = "Lgg;")
    public static class63 field2403 = field2401;

    @OriginalMember(owner = "client!le", name = "Hb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!le", name = "Jb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!le", name = "Lb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!le", name = "Mb", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!le", name = "Ob", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!le", name = "Pb", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!le", name = "Qb", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!le", name = "Sb", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!le", name = "Vb", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!le", name = "Wb", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!le", name = "ac", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!le", name = "bc", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!le", name = "cc", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!le", name = "Nb", descriptor = "Lne;")
    private class122 field2391;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
    public final void method854(int arg0, boolean arg1) {
        ++field2405;
        if (arg1) {
            super.field48[super.field54++] = (byte) (arg0 + this.field2391.method935(3120));
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
    public class104(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!le", name = "s", descriptor = "(I)V")
    public static void method855(int arg0) {
        field2397 = null;
        field2386 = null;
        field2395 = null;
        field2388 = null;
        field2401 = null;
        if (arg0 == -1) {
            field2402 = null;
            field2403 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(BI)I")
    public final int method856(byte arg0, int arg1) {
        ++field2396;
        int var3 = this.field2392 >> 3;
        int var4 = -(7 & this.field2392) + 8;
        this.field2392 += arg1;
        if (arg0 != 2) {
            this.method856((byte) -76, 65);
        }
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (class69.field1734[var4] & super.field48[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field48[var3] >> var4 - arg1 & class69.field1734[arg1]) + var5;
        } else {
            var6 = (super.field48[var3] & class69.field1734[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!le", name = "i", descriptor = "(B)V")
    public final void method857(byte arg0) {
        if (arg0 > 49) {
            ++field2393;
            this.field2392 = super.field54 * 8;
        }
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(Z)V")
    public static final void method858(boolean arg0) {
        Object var1 = class183.field3710;
        synchronized (class183.field3710) {
            if (~class189.field3801 != -1) {
                class189.field3801 = 1;
                try {
                    class183.field3710.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (!arg0) {
                field2387 = -75;
            }
        }
        ++field2400;
    }

    @OriginalMember(owner = "client!le", name = "h", descriptor = "(II)I")
    public final int method859(int arg0, int arg1) {
        if (arg0 > -22) {
            field2403 = null;
        }
        ++field2390;
        return arg1 * 8 + -this.field2392;
    }

    @OriginalMember(owner = "client!le", name = "j", descriptor = "(B)V")
    public final void method860(byte arg0) {
        super.field54 = (this.field2392 + 7) / 8;
        ++field2404;
        int var2 = 35 / ((arg0 - -28) / 35);
    }

    @OriginalMember(owner = "client!le", name = "t", descriptor = "(I)V")
    public static final void method861(int arg0) {
        for (int var1 = 0; var1 < class89.field2092; ++var1) {
            int var3 = class3.field84[var1];
            class62 var4 = class33.field806[var3];
            int var5 = class167.field3437.method64(31790);
            if (~(128 & var5) != -1) {
                var5 += class167.field3437.method64(31790) << 8;
            }
            class152.method1065(var3, var4, var5, 0);
        }
        ++field2389;
        int var2 = 1 / ((arg0 - 45) / 51);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIIILjc;)V")
    public static final void method862(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class85 arg6) {
        class97.field2308 = arg0;
        class117.field2618 = arg5;
        ++field2385;
        class101.field2368 = arg4;
        class42.field971 = 1;
        class90.field2110 = arg2;
        class150.field3156 = arg3;
        class49.field1187 = arg6;
        if (arg1 != -23216) {
            method862(-102, -86, false, -6, -122, 65, (class85) null);
        }
    }

    @OriginalMember(owner = "client!le", name = "u", descriptor = "(I)I")
    public final int method863(int arg0) {
        if (arg0 != -14615) {
            return -13;
        } else {
            ++field2399;
            return 255 & super.field48[super.field54++] - this.field2391.method935(3120);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([IZ)V")
    public final void method864(int[] arg0, boolean arg1) {
        ++field2406;
        this.field2391 = new class122(arg0);
        if (!arg1) {
            method861(-29);
        }
    }
}
