import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class283 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "J")
    private static long field4539;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "J")
    private static long field4540;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)J", line = 6)
    public static final synchronized long method2038(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field4540 > var1) {
            field4539 += field4540 - var1;
        }
        if (arg0 <= 121) {
            method2038((byte) -125);
        }
        field4540 = var1;
        return field4539 + var1;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 24)
    private class283() {
    }
}
