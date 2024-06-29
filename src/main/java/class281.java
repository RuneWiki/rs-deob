import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class281 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[J")
    public static long[] field4103 = new long[32];

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZZ)V", line = 3)
    public static final void method1798(boolean arg0, boolean arg1, boolean arg2) {
        field4105++;
        if (arg1) {
            field4103 = null;
        }
        if (arg0) {
            class110.field1557++;
            class172.method1220((byte) -24);
        }
        if (arg2) {
            class323.field4538++;
            class450.method2719((byte) 94);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 29)
    public static void method1799(byte arg0) {
        if (arg0 != -116) {
            field4103 = null;
        }
        field4103 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 44)
    public static final String method1800(boolean arg0, String arg1) {
        field4104++;
        if (!arg0) {
            method1798(false, true, false);
        }
        String var2 = class359.method2161(class141.method1055(1, arg1), -81);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
