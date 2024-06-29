import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class153 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "J")
    private static long field2634;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "J")
    private static long field2635;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)J", line = 5)
    public static final synchronized long method1032(int arg0) {
        if (arg0 <= 100) {
            return 21L;
        }
        long var1 = System.currentTimeMillis();
        if (field2635 > var1) {
            field2634 += field2635 - var1;
        }
        field2635 = var1;
        return field2634 + var1;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 24)
    private class153() {
    }
}
