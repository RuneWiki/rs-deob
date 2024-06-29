import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class223 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "J")
    private static long field3334;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
    private static long field3335;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)J")
    public static final synchronized long method1433(byte arg0) {
        int var1 = -113 % ((arg0 + 42) / 39);
        long var2 = System.currentTimeMillis();
        if (var2 < field3335) {
            field3334 += field3335 - var2;
        }
        field3335 = var2;
        return field3334 + var2;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    private class223() {
    }
}
