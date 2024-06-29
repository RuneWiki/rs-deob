import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class136 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "J")
    private static long field2492;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "J")
    private static long field2493;

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    private class136() {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)J")
    public static final synchronized long method950(int arg0) {
        if (arg0 != 8954) {
            return 89L;
        }
        long var1 = System.currentTimeMillis();
        if (field2492 > var1) {
            field2493 += field2492 - var1;
        }
        field2492 = var1;
        return field2493 + var1;
    }
}
