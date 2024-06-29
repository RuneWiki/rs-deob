import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class188 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "J")
    private static long field2998;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "J")
    private static long field2999;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)J")
    public static final synchronized long method1355(int arg0) {
        int var1 = -37 % ((arg0 + 6) / 52);
        long var2 = System.currentTimeMillis();
        if (var2 < field2998) {
            field2999 += field2998 - var2;
        }
        field2998 = var2;
        return field2999 + var2;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    private class188() {
    }
}
