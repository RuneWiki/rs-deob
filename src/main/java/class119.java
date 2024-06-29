import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class119 extends class315 {

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    private int field1662 = 0;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Lsc;")
    private class265 field1656 = new class265();

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lpi;")
    public static class340 field1655 = new class340(49, 0);

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Lpi;")
    public static class340 field1663 = new class340(46, 2);

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Lhb;")
    public static class250 field1665 = new class250(70, 0);

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "Lhb;")
    public static class250 field1666 = new class250(46, 7);

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V", line = 10)
    public final void method200(int arg0, int arg1) {
        ++field1659;
        if (arg1 > -127) {
            field1663 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 23)
    public final void method202(byte arg0) {
        int var2 = 26 / ((-31 - arg0) / 60);
        while (super.field4061 != super.field4053) {
            this.method758((byte) 41);
        }
        ++field1651;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V", line = 35)
    private final void method758(byte arg0) {
        ++field1657;
        int var2 = super.field4061++;
        if (super.field4061 >= 5000) {
            super.field4061 = 0;
        }
        this.field1662 = super.field4057[var2];
        Object var3 = super.field4056[var2];
        super.field4056[var2] = null;
        if (this.field1662 == 21) {
            class177.method1147(this.field1656, (class510) var3);
        } else if (this.field1662 == 20) {
            class510 var4 = (class510) var3;
            if (var4.field7499 != null) {
                var4.field7499.method175((byte) 91, class372.field4831);
            }
            if (var4.field7502 != null) {
                var4.field7502.method175((byte) 91, class372.field4831);
            }
            if (var4.field7485 != null) {
                var4.field7485.method175((byte) 91, class372.field4831);
            }
            if (var4.field7497 != null) {
                var4.field7497.method175((byte) 91, class372.field4831);
            }
            if (var4.field7492 != null) {
                var4.field7492.method175((byte) 91, class372.field4831);
            }
            for (class319 var5 = var4.field7494; var5 != null; var5 = var5.field4102) {
                var5.field4107.method175((byte) 91, class372.field4831);
            }
        } else if (~this.field1662 <= -31 && ~this.field1662 >= -34) {
            class372.field4831.method913(3000.0F, super.field4058[var2] * 1.5F);
            ((class251) var3).method1177(class225.field2922, class477.field6969, class18.field318, class357.field4598, this.field1662 + -30 == 0);
        } else if (this.field1662 >= 40 && this.field1662 <= 43) {
            class372.field4831.method913(3000.0F, super.field4058[var2] * 1.5F);
            ((class251) var3).method1177(class225.field2922, class477.field6969, class18.field318, class465.field6840, ~(this.field1662 - 40) == -1);
        } else if (~this.field1662 == -23) {
            class372.field4831.method823(-1, 1583160, 40, 127);
        } else if (~this.field1662 == -24) {
            class372.field4831.method831();
        } else if (~this.field1662 == -25) {
            class372.field4831.method906(0, (class182[]) null);
        }
        if (arg0 != 41) {
            field1666 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 127)
    public static void method759(boolean arg0) {
        field1665 = null;
        if (!arg0) {
            field1665 = null;
        }
        field1666 = null;
        field1663 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V", line = 141)
    public final void method205(int arg0, boolean arg1) {
        ++field1664;
        super.field4057[super.field4053] = (byte) arg0;
        ++super.field4053;
        if (!arg1) {
            this.method200(112, -121);
        }
        if (super.field4053 >= 5000) {
            super.field4053 = 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ltg;B)V", line = 156)
    public final void method197(class510 arg0, byte arg1) {
        --super.field4061;
        if (arg1 >= 103) {
            ++field1652;
            if (~super.field4061 > -1) {
                super.field4061 = 4999;
            }
            super.field4057[super.field4061] = 21;
            super.field4056[super.field4061] = arg0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ltg;I)V", line = 172)
    public final void method198(class510 arg0, int arg1) {
        super.field4057[super.field4053] = 20;
        ++field1653;
        super.field4056[super.field4053] = arg0;
        ++super.field4053;
        if (~super.field4053 <= -5001) {
            super.field4053 = 0;
        }
        if (arg1 != -23985) {
            field1666 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 188)
    public final void method199(int arg0) {
        if (arg0 != 5000) {
            this.method205(-54, false);
        }
        ++field1660;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lna;IBFZ)V", line = 199)
    public final void method201(class251 arg0, int arg1, byte arg2, float arg3, boolean arg4) {
        ++field1658;
        if (arg2 < 58) {
            this.method205(-26, true);
        }
        super.field4057[super.field4053] = (byte) (arg4 ? arg1 + 40 : arg1 + 30);
        super.field4056[super.field4053] = arg0;
        super.field4058[super.field4053] = arg3;
        ++super.field4053;
        if (super.field4053 >= 5000) {
            super.field4053 = 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLtg;)V", line = 221)
    public final void method196(boolean arg0, class510 arg1) {
        super.field4057[super.field4053] = 21;
        if (!arg0) {
            field1665 = null;
        }
        ++field1654;
        super.field4056[super.field4053] = arg1;
        ++super.field4053;
        if (~super.field4053 <= -5001) {
            super.field4053 = 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ldn;II)Lov;", line = 252)
    public static final class278 method760(class201 arg0, int arg1, int arg2) {
        ++field1661;
        byte[] var3 = arg0.method1320(arg1, 1);
        if (arg2 != -24) {
            field1663 = null;
        }
        return var3 == null ? null : new class278(var3);
    }
}
