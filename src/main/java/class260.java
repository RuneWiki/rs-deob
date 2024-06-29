import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class260 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "J")
    private static long field4207;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "J")
    private static long field4208;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)J")
    public static final synchronized long method1785(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field4208) {
            field4207 += field4208 - var1;
        }
        field4208 = var1;
        if (arg0 > -96) {
            field4208 = 63L;
        }
        return field4207 + var1;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    private class260() {
    }
}
