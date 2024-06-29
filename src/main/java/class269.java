import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class269 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lna;")
    private static class26 field4440 = class69.method505("Loading world list data", (byte) -126);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "[Ltk;")
    public static class249[] field4439 = new class249[14];

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Z")
    public static boolean field4441 = false;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lna;")
    public static class26 field4438 = field4440;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 22)
    public static void method1907(boolean arg0) {
        field4440 = null;
        field4439 = null;
        if (arg0) {
            field4439 = (class249[]) null;
        }
        field4438 = null;
    }
}
