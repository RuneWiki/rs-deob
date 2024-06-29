import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class437 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "J")
    private static long field6396;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "J")
    private static long field6397;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)J")
    public static final synchronized long method2644(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field6397 > var1) {
            field6396 += field6397 - var1;
        }
        field6397 = var1;
        return arg0 >= -47 ? -126L : field6396 + var1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    private class437() {
    }
}
