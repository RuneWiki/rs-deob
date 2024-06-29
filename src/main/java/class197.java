import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class197 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "J")
    private static long field3189;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "J")
    private static long field3190;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    private class197() {
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)J")
    public static final synchronized long method1454(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -104) {
            method1454((byte) 122);
        }
        if (var1 < field3190) {
            field3189 += field3190 - var1;
        }
        field3190 = var1;
        return field3189 + var1;
    }
}
