import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class277 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4439 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[C")
    public static char[] field4441 = new char[128];

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4442 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "J")
    public static long field4438 = 0L;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lsd;")
    public static class45 field4440;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Z")
    public static boolean field4437;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Llc;B)Z")
    public static final boolean method1914(class86 arg0, byte arg1) {
        field4444++;
        if (arg0.method634(class69.field1023, arg1 - 33)) {
            return true;
        } else if (arg1 == 33) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1915(boolean arg0) {
        field4441 = null;
        if (!arg0) {
            field4439 = null;
            field4440 = null;
        }
    }
}
