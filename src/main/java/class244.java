import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class244 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "J")
    private static long field4352;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "J")
    private static long field4353;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    private class244() {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)J")
    public static final synchronized long method1644(byte arg0) {
        if (arg0 > -19) {
            method1644((byte) 76);
        }
        long var1 = System.currentTimeMillis();
        if (field4352 > var1) {
            field4353 += field4352 - var1;
        }
        field4352 = var1;
        return field4353 + var1;
    }
}
