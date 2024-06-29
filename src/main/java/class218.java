import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class218 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "J")
    private static long field3626;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "J")
    private static long field3627;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 2)
    private class218() {
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)J", line = 8)
    public static final synchronized long method1520(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field3626) {
            field3627 += field3626 - var1;
        }
        if (arg0 < 29) {
            field3627 = -19L;
        }
        field3626 = var1;
        return var1 + field3627;
    }
}
