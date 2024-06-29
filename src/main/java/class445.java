import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class445 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
    private static long field6555;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
    private static long field6556;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
    public static final synchronized long method2750(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -27580) {
            method2750(38);
        }
        if (var1 < field6555) {
            field6556 += field6555 - var1;
        }
        field6555 = var1;
        return field6556 + var1;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    private class445() {
    }
}
