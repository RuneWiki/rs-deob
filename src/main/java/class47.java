import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class47 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "J")
    private static long field750;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "J")
    private static long field751;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)J", line = 5)
    public static final synchronized long method371(int arg0) {
        int var1 = 73 / ((-arg0 - 10) / 63);
        long var2 = System.currentTimeMillis();
        if (var2 < field751) {
            field750 += field751 - var2;
        }
        field751 = var2;
        return var2 + field750;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 25)
    private class47() {
    }
}
