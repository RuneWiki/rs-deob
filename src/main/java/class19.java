import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class19 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "J")
    private static long field230;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "J")
    private static long field231;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 2)
    private class19() {
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)J", line = 10)
    public static final synchronized long method122(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field231) {
            field230 += field231 - var1;
        }
        if (arg0 != -12169) {
            field231 = -29L;
        }
        field231 = var1;
        return field230 + var1;
    }
}
