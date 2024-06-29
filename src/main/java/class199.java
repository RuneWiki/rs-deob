import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class199 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "J")
    private static long field2864;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "J")
    private static long field2865;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)J")
    public static final synchronized long method1372(int arg0) {
        if (arg0 != 30938) {
            return -95L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field2864) {
            field2865 += field2864 - var1;
        }
        field2864 = var1;
        return field2865 + var1;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    private class199() {
    }
}
