import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class262 extends class60 {

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "Llja;")
    public static class744 field3120 = new class744(23, -1);

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V", line = 3)
    public static void method1569(int arg0) {
        field3120 = null;
        if (arg0 != 15453) {
            method1570((byte) -12);
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)V", line = 16)
    public static final void method1570(byte arg0) {
        class198.field2363.method1690(0);
        ++field3113;
        if (arg0 >= -33) {
            method1569(-39);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "([SII)[S", line = 27)
    public static final short[] method1571(short[] arg0, int arg1, int arg2) {
        ++field3116;
        short[] var3 = new short[arg1];
        if (arg2 != -22600) {
            method1569(-12);
        }
        class211.method1334(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lhd;)V", line = 41)
    public class262(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(ILhd;)V", line = 44)
    public class262(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(II)I", line = 47)
    public final int method406(int arg0, int arg1) {
        ++field3119;
        if (arg0 != 0) {
            this.method409((byte) 104);
        }
        if (super.field798.method4292(-4152) == class359.field4463) {
            if (super.field798.method4287((byte) 124)) {
                return 3;
            } else {
                return arg1 != 0 && ~super.field798.field10677.method3451(0) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I", line = 72)
    public final int method1572(int arg0) {
        if (arg0 != 0) {
            return -72;
        } else {
            ++field3115;
            return super.field799;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)I", line = 85)
    public final int method405(boolean arg0) {
        if (arg0) {
            return -20;
        } else {
            ++field3121;
            return 1;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)V", line = 98)
    public final void method409(byte arg0) {
        if (super.field798.method4292(-4152) == class359.field4463) {
            if (super.field798.method4287((byte) 123)) {
                super.field799 = 0;
            }
        } else {
            super.field799 = 1;
        }
        if (arg0 <= -27) {
            ++field3118;
            if (~super.field799 != -1 && ~super.field799 != -2) {
                super.field799 = this.method405(false);
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)V", line = 119)
    public final void method407(byte arg0, int arg1) {
        int var3 = 3 / ((28 - arg0) / 50);
        ++field3117;
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(B)Z", line = 133)
    public final boolean method1573(byte arg0) {
        ++field3114;
        if (super.field798.method4292(-4152) == class359.field4463) {
            return !super.field798.method4287((byte) 45);
        } else {
            if (arg0 > -61) {
                method1571((short[]) null, 68, 40);
            }
            return false;
        }
    }
}
