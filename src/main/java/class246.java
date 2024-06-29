import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class246 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "J")
    private static long field3997;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "J")
    private static long field3998;

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
    private class246() {
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)J")
    public static final synchronized long method1705(byte arg0) {
        if (arg0 != 28) {
            method1705((byte) -126);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field3998) {
            field3997 += field3998 - var1;
        }
        field3998 = var1;
        return field3997 + var1;
    }
}
