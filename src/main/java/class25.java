import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class25 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "J")
    private static long field299;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "J")
    private static long field300;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 5)
    private class25() {
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)J", line = 9)
    public static final synchronized long method197(int arg0) {
        if (arg0 != -3418) {
            method197(67);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field299) {
            field300 += field299 - var1;
        }
        field299 = var1;
        return field300 + var1;
    }
}
