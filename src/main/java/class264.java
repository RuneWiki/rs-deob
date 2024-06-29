import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class264 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "J")
    private static long field3677;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "J")
    private static long field3678;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)J", line = 5)
    public static final synchronized long method1698(boolean arg0) {
        if (!arg0) {
            field3678 = -102L;
        }
        long var1 = System.currentTimeMillis();
        if (field3678 > var1) {
            field3677 += field3678 - var1;
        }
        field3678 = var1;
        return field3677 + var1;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V", line = 25)
    private class264() {
    }
}
