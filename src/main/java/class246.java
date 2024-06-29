import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class246 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
    private static long field3422;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
    private static long field3423;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 2)
    private class246() {
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J", line = 6)
    public static final synchronized long method1483(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field3422 > var1) {
            field3423 += field3422 - var1;
        }
        field3422 = var1;
        if (arg0 != 5957) {
            field3422 = 111L;
        }
        return field3423 + var1;
    }
}
