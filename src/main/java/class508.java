import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class508 {

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "J")
    private static long field7056;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "J")
    private static long field7057;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)J", line = 4)
    public static final synchronized long method2860(boolean arg0) {
        if (arg0) {
            field7056 = 62L;
        }
        long var1 = System.currentTimeMillis();
        if (field7056 > var1) {
            field7057 += field7056 - var1;
        }
        field7056 = var1;
        return field7057 + var1;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V", line = 25)
    private class508() {
    }
}
