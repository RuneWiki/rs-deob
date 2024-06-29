import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class176 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "J")
    private static long field2532;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "J")
    private static long field2533;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)J", line = 5)
    public static final synchronized long method1234(int arg0) {
        if (arg0 != 5574) {
            field2533 = -37L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field2533) {
            field2532 += field2533 - var1;
        }
        field2533 = var1;
        return field2532 + var1;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V", line = 26)
    private class176() {
    }
}
