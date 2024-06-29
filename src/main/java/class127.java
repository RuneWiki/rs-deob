import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class127 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
    private static long field2351;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
    private static long field2352;

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 2)
    private class127() {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)J", line = 9)
    public static final synchronized long method1015(int arg0) {
        if (arg0 != 21504) {
            return 79L;
        }
        long var1 = System.currentTimeMillis();
        if (field2351 > var1) {
            field2352 += field2351 - var1;
        }
        field2351 = var1;
        return field2352 + var1;
    }
}
