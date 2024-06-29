import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class284 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
    public boolean field4126 = true;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "C")
    private char field4133;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lv;")
    public static class407 field4134;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljava/lang/String;")
    public String field4122;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 7)
    public static void method1808(int arg0) {
        int var1 = 32 % ((-arg0 - 42) / 45);
        field4134 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Z", line = 17)
    public static final boolean method1809(int arg0, int arg1) {
        field4125++;
        if (arg1 != -6) {
            field4129 = -2;
        }
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z", line = 31)
    public final boolean method1810(int arg0) {
        field4130++;
        if (arg0 != 115) {
            this.field4133 = (char) 65436;
        }
        return this.field4133 == 's';
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method1811(int arg0, byte arg1) {
        class380.field5611.method1116(arg0, -50);
        if (arg1 != 55) {
            field4134 = null;
        }
        field4123++;
        class93.field1272.method1116(arg0, -50);
        class229.field3358.method1116(arg0, -50);
        class452.field6648.method1116(arg0, -50);
        class358.field4979.method1116(arg0, arg1 - 105);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILiv;I)V", line = 68)
    private final void method1812(int arg0, class65 arg1, int arg2) {
        if (~arg2 == arg0) {
            this.field4133 = class208.method1445(32404, arg1.method629(false));
        } else if (arg2 == 2) {
            this.field4127 = arg1.method616((byte) 95);
        } else if (arg2 == 4) {
            this.field4126 = false;
        } else if (arg2 == 5) {
            this.field4122 = arg1.method624((byte) -40);
        }
        field4128++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLac;Lac;)V", line = 96)
    public static final void method1813(boolean arg0, class376 arg1, class376 arg2) {
        field4131++;
        if (arg2.field5565 != null) {
            arg2.method2307((byte) -111);
        }
        arg2.field5565 = arg1;
        arg2.field5564 = arg1.field5564;
        arg2.field5565.field5564 = arg2;
        arg2.field5564.field5565 = arg2;
        if (!arg0) {
            method1808(102);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Liv;B)V", line = 113)
    public final void method1814(class65 arg0, byte arg1) {
        if (arg1 != 71) {
            this.field4122 = null;
        }
        field4124++;
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                return;
            }
            this.method1812(-2, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 137)
    public static final void method1815(byte arg0) {
        field4132++;
        class235.field3450 = true;
        if (arg0 != -36) {
            method1815((byte) 60);
        }
    }
}
