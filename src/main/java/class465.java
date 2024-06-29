import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class465 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "J")
    private static long field6496;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "J")
    private static long field6497;

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
    private class465() {
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)J")
    public static final synchronized long method2699(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field6497) {
            field6496 += field6497 - var1;
        }
        if (arg0 == 14) {
            field6497 = var1;
            return field6496 + var1;
        } else {
            return -13L;
        }
    }
}
