import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class261 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "J")
    private static long field4375;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
    private static long field4376;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 3)
    private class261() {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)J", line = 8)
    public static final synchronized long method1765(int arg0) {
        if (arg0 != 16299) {
            return -104L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field4375) {
            field4376 += field4375 - var1;
        }
        field4375 = var1;
        return field4376 + var1;
    }
}
