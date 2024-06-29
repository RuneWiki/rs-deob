import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class130 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "J")
    private static long field2127;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "J")
    private static long field2128;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)J", line = 5)
    public static final synchronized long method935(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (field2128 > var1) {
            field2127 += field2128 - var1;
        }
        if (arg0) {
            method935(false);
        }
        field2128 = var1;
        return field2127 + var1;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 25)
    private class130() {
    }
}
