import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class355 extends class60 {

    @OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
    public static int[] field4407 = null;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)V", line = 3)
    public final void method407(byte arg0, int arg1) {
        ++field4409;
        super.field799 = arg1;
        int var3 = -40 / ((arg0 - 28) / 50);
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)Z", line = 14)
    public final boolean method2084(byte arg0) {
        ++field4413;
        return arg0 < -61;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILhd;)V", line = 25)
    public class355(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 30)
    public final void method409(byte arg0) {
        ++field4405;
        if (arg0 > -27) {
            method2085((byte) 55, true, -2);
        }
        if (this.method2088(122)) {
            if (super.field798.field10665.method1905(14784) && !class89.method811(super.field798.field10665.method1903(0), (byte) -108)) {
                super.field799 = 1;
            }
            if (super.field798.field10630.method3823(0) == 1) {
                super.field799 = 1;
            }
        }
        if (~super.field799 == -4) {
            super.field799 = 2;
        }
        if (~super.field799 > -1 || super.field799 > 3) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BZI)Ljava/lang/String;", line = 59)
    public static final String method2085(byte arg0, boolean arg1, int arg2) {
        ++field4410;
        if (arg1 && ~arg2 <= -1) {
            if (arg0 != 97) {
                field4407 = null;
            }
            return class520.method3116(10, arg1, arg2, 100);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lhd;)V", line = 73)
    public class355(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V", line = 83)
    public static void method2086(boolean arg0) {
        if (arg0) {
            field4407 = null;
        }
        field4407 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I", line = 97)
    public final int method2087(int arg0) {
        if (arg0 != 0) {
            return 82;
        } else {
            ++field4411;
            return super.field799;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I", line = 111)
    public final int method405(boolean arg0) {
        ++field4408;
        if (arg0) {
            method2086(true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I", line = 124)
    public final int method406(int arg0, int arg1) {
        ++field4412;
        if (class330.method1956(arg1, 105)) {
            if (super.field798.field10665.method1905(14784) && !class89.method811(super.field798.field10665.method1903(0), (byte) -116)) {
                return 3;
            }
            if (super.field798.field10630.method3823(0) == 1) {
                return 3;
            }
        }
        if (arg0 != 0) {
            field4407 = null;
        }
        if (arg1 == 3) {
            return 3;
        } else {
            return class330.method1956(arg1, 121) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z", line = 158)
    public final boolean method2088(int arg0) {
        ++field4406;
        if (arg0 <= 116) {
            this.method409((byte) -31);
        }
        return class330.method1956(super.field799, 107);
    }
}
