import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class333 {

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "J")
    private static long field4531;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "J")
    private static long field4532;

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V", line = 4)
    private class333() {
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method1850(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field4532) {
            field4531 += field4532 - var1;
        }
        field4532 = var1;
        if (arg0 != -3562) {
            method1850(18);
        }
        return field4531 + var1;
    }
}
