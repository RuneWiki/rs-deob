import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class245 extends class260 {

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lbu;")
    public static class21 field3643 = new class21(118, -1);

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lvk;")
    public static class387 field3645 = new class387(2);

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 4)
    public static final void method1622(int arg0) {
        class5.field40.method3999(-98);
        ++field3646;
        class207.field3200.method3924((byte) 33);
        class386.field5352.method1221(75);
        class277.field4038.method3916(1);
        class575.field8103.method2442((byte) 125);
        class313.field4456.method1678(-21455);
        class563.field7993.method650(2);
        class456.field6385.method2383((byte) 64);
        class95.field1084.method1422(102);
        class653.field9128.method18((byte) 61);
        class564.field7999.method2468((byte) -121);
        class541.field7792.method1718(arg0 + -60);
        class618.field8642.method4320((byte) 121);
        class53.field669.method1233(~arg0);
        class240.field3602.method3431(-10162);
        class184.field2832.method4112(-47);
        class107.field1602.method1934((byte) 41);
        class316.field4491.method2606(3);
        class518.field7313.method31(arg0 + -4823);
        if (arg0 != -3) {
            method1623(109, 98, -103);
        }
        class186.field2845.method3246((byte) 101);
        class89.field1002.method2822(true);
        class532.field7690.method1455((byte) -47);
        class447.method2663(Integer.MIN_VALUE);
        class204.method1427((byte) -91);
        class42.method317((byte) 48);
        class291.method1864(293);
        class588.method3432(arg0 ^ -254);
        class386.field5353.method3743(8);
        class284.field4192.method3743(8);
        class354.field4977.method3743(8);
        class483.field6802.method3743(8);
        class379.field5225.method3743(arg0 ^ -11);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I", line = 46)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            this.method126(-40);
        }
        ++field3640;
        return 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V", line = 62)
    public static final void method1623(int arg0, int arg1, int arg2) {
        if (arg1 >= -84) {
            method1627(-103, 12, (byte) -116);
        }
        ++field3644;
        class313 var3 = class312.method1998((long) arg2, 13, -1);
        var3.method2001((byte) 89);
        var3.field4464 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILgn;)V", line = 76)
    public class245(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V", line = 79)
    public static void method1624(int arg0) {
        field3643 = null;
        field3645 = null;
        if (arg0 != 2) {
            method1625(false);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 93)
    public static final void method1625(boolean arg0) {
        ++field3642;
        if (!arg0) {
            method1623(-81, 11, 39);
        }
        if (class280.field4071 != null) {
            class280.field4071 = null;
            class110.method835(0, class295.field4298, class724.field10026, class545.field7847, class55.field705);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lwia;B)V", line = 110)
    public static final void method1626(class791 arg0, byte arg1) {
        if (arg1 == -76) {
            ++field3638;
            class287.field4223 = arg0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lgn;)V", line = 124)
    public class245(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 128)
    public static final String method1627(int arg0, int arg1, byte arg2) {
        ++field3639;
        int var3 = -arg1 + arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else {
            if (arg2 != 47) {
                method1626((class791) null, (byte) 44);
            }
            if (var3 > 3) {
                return "<col=80ff00>";
            } else {
                return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Z", line = 171)
    public final boolean method1628(int arg0) {
        ++field3637;
        if (arg0 < 73) {
            field3643 = null;
        }
        return class613.method3561(super.field3829.field10098.method1588(-66), -1);
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)I", line = 186)
    public final int method1629(int arg0) {
        ++field3635;
        if (arg0 > -14) {
            this.method126(85);
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 197)
    public final void method126(int arg0) {
        ++field3647;
        if (super.field3829.field10098.method1591(124) && !class613.method3561(super.field3829.field10098.method1588(-27), -1)) {
            super.field3828 = 0;
        }
        if (super.field3828 < 0 || ~super.field3828 < -3) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 <= 102) {
            field3645 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)I", line = 217)
    public final int method129(int arg0, int arg1) {
        ++field3641;
        return !class613.method3561(super.field3829.field10098.method1588(-122), arg0) ? 3 : 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V", line = 228)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field3636;
        if (arg1 != 122) {
            field3643 = null;
        }
    }
}
