import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class190 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "J")
    private static long field2298;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "J")
    private static long field2299;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 2)
    private class190() {
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)J", line = 8)
    public static final synchronized long method1030(boolean arg0) {
        if (arg0) {
            method1030(true);
        }
        long var1 = System.currentTimeMillis();
        if (field2299 > var1) {
            field2298 += field2299 - var1;
        }
        field2299 = var1;
        return var1 + field2298;
    }
}
