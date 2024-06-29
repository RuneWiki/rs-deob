import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class641 extends class264 {

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lcb;")
    public static class544 field9035;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lmfa;)V", line = 7)
    public class641(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)Luja;", line = 11)
    public static final class38 method3643(int arg0) {
        ++field9036;
        try {
            if (arg0 != -5) {
                method3644((byte) 116);
            }
            return (class38) Class.forName("cja").newInstance();
        } catch (Throwable var1) {
            return new class479();
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V", line = 26)
    public static void method3644(byte arg0) {
        field9035 = null;
        if (arg0 >= -88) {
            field9043 = 6;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)I", line = 36)
    public final int method3645(byte arg0) {
        if (arg0 >= -31) {
            return -46;
        } else {
            ++field9038;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V", line = 48)
    public final void method660(int arg0) {
        if (~super.field3733 > -1 && ~super.field3733 < -5) {
            super.field3733 = this.method663((byte) -38);
        }
        int var2 = -31 % ((arg0 - 1) / 41);
        ++field9041;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)I", line = 60)
    public final int method663(byte arg0) {
        ++field9037;
        if (arg0 != -38) {
            field9035 = null;
        }
        return super.field3731.method3634(0).method2856(arg0 ^ 25392) > 1 ? 4 : 2;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(BI)V", line = 76)
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            method3643(-71);
        }
        super.field3733 = arg1;
        ++field9042;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)Z", line = 91)
    public static final boolean method3646(int arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            return false;
        } else {
            ++field9040;
            return class195.method1421(arg2, arg0, -112) | (arg2 & 393216) != 0 || class339.method2177(arg2, arg0, false) || class73.method576(arg2, arg0, -123);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(ILmfa;)V", line = 103)
    public class641(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)I", line = 108)
    public final int method666(byte arg0, int arg1) {
        ++field9039;
        return arg0 != 112 ? 122 : 1;
    }
}
