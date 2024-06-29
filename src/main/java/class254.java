import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class254 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "J")
    private static long field3473;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "J")
    private static long field3474;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    private class254() {
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)J")
    public static final synchronized long method1522(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field3473 > var1) {
            field3474 += field3473 - var1;
        }
        if (arg0 == -51) {
            field3473 = var1;
            return field3474 + var1;
        } else {
            return 46L;
        }
    }
}
