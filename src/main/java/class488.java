import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class488 {

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "J")
    private static long field6844;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "J")
    private static long field6845;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)J")
    public static final synchronized long method2835(int arg0) {
        if (arg0 != 30160) {
            field6845 = 68L;
        }
        long var1 = System.currentTimeMillis();
        if (field6844 > var1) {
            field6845 += field6844 - var1;
        }
        field6844 = var1;
        return var1 + field6845;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
    private class488() {
    }
}
