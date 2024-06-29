import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class211 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "J")
    private static long field3030;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "J")
    private static long field3031;

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 3)
    private class211() {
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)J", line = 8)
    public static final synchronized long method1419(int arg0) {
        if (arg0 != 12921) {
            method1419(-124);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field3031) {
            field3030 += field3031 - var1;
        }
        field3031 = var1;
        return field3030 + var1;
    }
}
