import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class300 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "J")
    private static long field5003;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "J")
    private static long field5004;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 5)
    private class300() {
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)J", line = 10)
    public static final synchronized long method2048(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field5003) {
            field5004 += field5003 - var1;
        }
        if (arg0 == 18) {
            field5003 = var1;
            return field5004 + var1;
        } else {
            return -6L;
        }
    }
}
