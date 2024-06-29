import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class479 extends class392 {

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "[J")
    public static long[] field6592 = new long[32];

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "Lin;")
    public static class380 field6587 = new class380(113, 6);

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method2836(int arg0) {
        if (arg0 != 0) {
            field6582 = 56;
        }
        ++field6585;
        return true;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 16)
    public static void method2837(byte arg0) {
        field6592 = null;
        int var1 = 110 / ((9 - arg0) / 42);
        field6587 = null;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Z", line = 26)
    public final boolean method2838(int arg0) {
        ++field6586;
        return arg0 != 30861 ? true : class117.method1030(super.field5452, (byte) 35);
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)I", line = 39)
    public final int method2839(int arg0) {
        if (arg0 != 17539) {
            return -64;
        } else {
            ++field6588;
            return super.field5452;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V", line = 53)
    public final void method291(boolean arg0) {
        ++field6591;
        if (this.method2838(30861)) {
            if (super.field5454.field9482.method2337((byte) 82) && !class285.method1816(96, super.field5454.field9482.method2338(17539))) {
                super.field5452 = 1;
            }
            if (super.field5454.field9445.method3773(17539) == 1) {
                super.field5452 = 1;
            }
        }
        if (~super.field5452 == -4) {
            super.field5452 = 2;
        }
        if (arg0) {
            field6589 = -109;
        }
        if (super.field5452 < 0 || super.field5452 > 3) {
            super.field5452 = this.method292(true);
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(ILw;)V", line = 83)
    public class479(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lw;)V", line = 87)
    public class479(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V", line = 91)
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        ++field6583;
        int var3 = 68 % ((-80 - arg0) / 38);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)I", line = 101)
    public final int method290(int arg0, int arg1) {
        ++field6581;
        if (class117.method1030(arg0, (byte) -104)) {
            if (super.field5454.field9482.method2337((byte) 82) && !class285.method1816(97, super.field5454.field9482.method2338(17539))) {
                return 3;
            }
            if (~super.field5454.field9445.method3773(17539) == -2) {
                return 3;
            }
        }
        if (arg0 == 3) {
            return 3;
        } else {
            if (arg1 > -124) {
                this.method290(51, 60);
            }
            return class117.method1030(arg0, (byte) 117) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(II)V", line = 130)
    public static final void method2840(int arg0, int arg1) {
        class481.field6610 = arg0;
        if (arg1 == 1) {
            ++field6584;
            class521.field7311.method2881((byte) -24);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)I", line = 144)
    public final int method292(boolean arg0) {
        ++field6590;
        if (!arg0) {
            field6587 = null;
        }
        return 0;
    }
}
