import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class304 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "J")
    private static long field4748;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "J")
    private static long field4749;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)J", line = 4)
    public static final synchronized long method2128(byte arg0) {
        if (arg0 > -65) {
            field4749 = 19L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field4748) {
            field4749 += field4748 - var1;
        }
        field4748 = var1;
        return var1 + field4749;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 25)
    private class304() {
    }
}
