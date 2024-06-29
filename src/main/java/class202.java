import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class202 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Lsk;")
    public static class575 field2438 = null;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public static void method1231(byte arg0) {
        field2438 = null;
        int var1 = -76 / ((20 - arg0) / 45);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method1232(boolean arg0, String arg1) {
        field2439++;
        String var2 = class189.method1167(-5252, class78.method653(arg1, -3328));
        if (var2 == null) {
            var2 = "";
        }
        if (arg0) {
            method1233(99, -107);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
    public static final void method1233(int arg0, int arg1) {
        if (arg1 == 6339) {
            field2441++;
            class280.field3805 = arg0;
            class231.field3009.method2776(false);
        }
    }
}
