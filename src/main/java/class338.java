import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class338 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "J")
    private static long field5247;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "J")
    private static long field5248;

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 2)
    private class338() {
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)J", line = 9)
    public static final synchronized long method2339(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field5247 > var1) {
            field5248 += field5247 - var1;
        }
        field5247 = var1;
        return arg0 == -120 ? field5248 + var1 : -87L;
    }
}
