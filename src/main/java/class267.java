import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class267 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "J")
    private static long field4392;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "J")
    private static long field4393;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    private class267() {
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)J")
    public static final synchronized long method1841(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field4392 > var1) {
            field4393 += field4392 - var1;
        }
        if (arg0 < 97) {
            return -64L;
        } else {
            field4392 = var1;
            return field4393 + var1;
        }
    }
}
