import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class247 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "J")
    private static long field3956;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
    private static long field3957;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 5)
    private class247() {
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)J", line = 10)
    public static final synchronized long method1762(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field3956) {
            field3957 += field3956 - var1;
        }
        field3956 = var1;
        return arg0 == 19166 ? field3957 + var1 : -73L;
    }
}
