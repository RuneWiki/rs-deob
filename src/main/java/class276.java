import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class276 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "J")
    private static long field4356;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "J")
    private static long field4357;

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    private class276() {
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)J")
    public static final synchronized long method1861(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field4356) {
            field4357 += field4356 - var1;
        }
        field4356 = var1;
        if (arg0 != 122) {
            method1861((byte) -90);
        }
        return field4357 + var1;
    }
}
