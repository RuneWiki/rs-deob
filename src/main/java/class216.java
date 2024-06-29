import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class216 extends class207 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Laka;")
    public static class86 field2827 = new class86("LIVE", 0);

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2832 = -1;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)V", line = 3)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 >= -7) {
            field2827 = null;
        }
        ++field2829;
        class542.method3130(super.field2669, -1);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrd;)V", line = 18)
    public class216(class355 arg0) {
        super(arg0);
        class542.method3130(super.field2669, -1);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)I", line = 26)
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            return 73;
        } else {
            ++field2833;
            return super.field2668.method2249((byte) 118).method2153(true) < 96 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILrd;)V", line = 42)
    public class216(int arg0, class355 arg1) {
        super(arg0, arg1);
        class542.method3130(super.field2669, -1);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 50)
    public static void method1392(int arg0) {
        if (arg0 != 0) {
            method1392(9);
        }
        field2827 = null;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I", line = 61)
    public final int method1393(int arg0) {
        ++field2826;
        if (arg0 != 43) {
            field2832 = 33;
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z", line = 74)
    public final boolean method1394(byte arg0) {
        if (arg0 != 8) {
            field2827 = null;
        }
        ++field2825;
        return super.field2668.method2249((byte) 118).method2153(true) >= 96;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 91)
    public final void method37(int arg0) {
        if (super.field2668.method2249((byte) 124).method2153(true) < 96) {
            super.field2669 = 0;
        }
        int var2 = -82 / ((arg0 - -58) / 48);
        ++field2830;
        if (super.field2669 < 0 || super.field2669 > 2) {
            super.field2669 = this.method36(-99);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I", line = 115)
    public final int method36(int arg0) {
        if (arg0 > -14) {
            field2832 = 67;
        }
        ++field2828;
        return ~super.field2668.method2249((byte) 117).method2153(true) > -97 ? 0 : 2;
    }
}
