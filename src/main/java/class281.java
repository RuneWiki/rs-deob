import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class281 extends class393 {

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lmi;")
    public class408 field4135 = new class408();

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4132 = "flash2:";

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4129 = "Loaded wordpack";

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Lqj;")
    public static class238 field4131;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Lfl;")
    public static class386 field4136;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Z)V", line = 6)
    public static void method1798(boolean arg0) {
        field4129 = null;
        field4131 = null;
        field4136 = null;
        field4132 = null;
        if (!arg0) {
            method1798(false);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V", line = 31)
    public static final void method1799(int arg0, int arg1) {
        field4133++;
        int var2 = -48 % ((-arg1 - 46) / 47);
        class256 var3 = class363.method2385(2, arg0, (byte) 1);
        var3.method1611(-118);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V", line = 44)
    public static final void method1800(int arg0, int[] arg1, Object[] arg2) {
        class244.method1506(arg1.length - 1, arg1, arg2, 0, 123);
        field4134++;
        if (arg0 != 2175) {
            field4132 = null;
        }
    }
}
