import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class203 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "J")
    private static long field2791;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "J")
    private static long field2792;

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 4)
    private class203() {
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)J", line = 7)
    public static final synchronized long method1299(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field2791 > var1) {
            field2792 += field2791 - var1;
        }
        if (arg0 != 5) {
            field2791 = -60L;
        }
        field2791 = var1;
        return field2792 + var1;
    }
}
