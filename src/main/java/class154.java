import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class154 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "J")
    private static long field2471;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "J")
    private static long field2472;

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 2)
    private class154() {
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)J", line = 6)
    public static final synchronized long method1172(byte arg0) {
        if (arg0 <= 77) {
            return 7L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field2472) {
            field2471 += field2472 - var1;
        }
        field2472 = var1;
        return field2471 + var1;
    }
}
