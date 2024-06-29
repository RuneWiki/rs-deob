import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class264 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "J")
    private static long field4310;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "J")
    private static long field4311;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)J")
    public static final synchronized long method1778(int arg0) {
        if (arg0 != 6573) {
            return -60L;
        }
        long var1 = System.currentTimeMillis();
        if (field4310 > var1) {
            field4311 += field4310 - var1;
        }
        field4310 = var1;
        return field4311 + var1;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    private class264() {
    }
}
