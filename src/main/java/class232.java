import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class232 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "J")
    private static long field3872;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "J")
    private static long field3873;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    private class232() {
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)J")
    public static final synchronized long method1544(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 > -63) {
            field3873 = 83L;
        }
        if (var1 < field3873) {
            field3872 += field3873 - var1;
        }
        field3873 = var1;
        return var1 + field3872;
    }
}
