import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class440 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "J")
    private static long field5945;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "J")
    private static long field5946;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)J", line = 4)
    public static final synchronized long method2583(int arg0) {
        if (arg0 != 25267) {
            return 80L;
        }
        long var1 = System.currentTimeMillis();
        if (field5946 > var1) {
            field5945 += field5946 - var1;
        }
        field5946 = var1;
        return field5945 + var1;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V", line = 24)
    private class440() {
    }
}
