import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class598 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "J")
    private static long field8832;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "J")
    private static long field8833;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)J", line = 3)
    public static final synchronized long method3538(boolean arg0) {
        if (!arg0) {
            method3538(false);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field8833) {
            field8832 += field8833 - var1;
        }
        field8833 = var1;
        return var1 + field8832;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 23)
    private class598() {
    }
}
