import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class108 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "J")
    private static long field1575;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "J")
    private static long field1576;

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 3)
    private class108() {
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)J", line = 8)
    public static final synchronized long method902(byte arg0) {
        if (arg0 != -93) {
            return 3L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field1575) {
            field1576 += field1575 - var1;
        }
        field1575 = var1;
        return var1 + field1576;
    }
}
