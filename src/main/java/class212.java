import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class212 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "J")
    private static long field3318;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "J")
    private static long field3319;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 2)
    private class212() {
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)J", line = 9)
    public static final synchronized long method1543(int arg0) {
        if (arg0 != 22326) {
            method1543(-115);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field3319) {
            field3318 += field3319 - var1;
        }
        field3319 = var1;
        return field3318 + var1;
    }
}
