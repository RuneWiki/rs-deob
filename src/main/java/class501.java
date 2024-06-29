import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class501 extends class532 {

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Ldj;")
    public static class362 field7024 = new class362(16);

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "[[B")
    public static byte[][] field7029 = new byte[1000][];

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Lhj;")
    public static class596 field7027 = new class596(65, -1);

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        ++field7021;
        super.field7494.method2643(-2, arg2);
        if (arg0) {
            super.field7494.method2649((byte) 126, arg1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        if (arg0 <= 126) {
            field7029 = null;
        }
        ++field7023;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        ++field7030;
        super.field7494.method2659(arg0, 24103);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
    public static final void method2972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class187.field2268 && ~arg2 >= ~class461.field6480) {
            int var5 = class155.method1103(class471.field6572, arg4, false, class223.field2604);
            int var6 = class155.method1103(class471.field6572, arg3, false, class223.field2604);
            class218.method1354(arg1, var5, arg2, 2, var6);
        }
        ++field7026;
        if (arg0 != 1000) {
            field7027 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
    public static final void method2973(int arg0) {
        if (arg0 <= 110) {
            field7024 = null;
        }
        class100.field1308 = null;
        ++field7022;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
    public static void method2974(int arg0) {
        field7027 = null;
        field7029 = null;
        if (arg0 == 30813) {
            field7024 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        ++field7031;
        if (arg1 != -10) {
            field7027 = null;
        }
        super.field7494.method2659(true, 24103);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        ++field7020;
        if (arg1 != 94) {
            this.method702(false, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        ++field7025;
        if (arg1 != 30902) {
            this.method703((byte) -90);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Z")
    public static final boolean method2975(int arg0, byte arg1) {
        ++field7028;
        if (arg0 != 9 && ~arg0 != -20 && ~arg0 != -4 && ~arg0 != -3 && arg0 != 1007) {
            if (~arg0 != -52 && arg0 != 1011) {
                int var2 = 123 / ((arg1 - 62) / 46);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lwg;)V")
    public class501(class449 arg0) {
        super(arg0);
    }
}
