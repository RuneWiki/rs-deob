import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class156 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "J")
    private static long field2507;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "J")
    private static long field2508;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)J", line = 5)
    public static final synchronized long method1273(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field2507) {
            field2508 += field2507 - var1;
        }
        if (arg0 > -20) {
            method1273((byte) -124);
        }
        field2507 = var1;
        return field2508 + var1;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 24)
    private class156() {
    }
}
