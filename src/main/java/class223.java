import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class223 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "J")
    private static long field3915;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "J")
    private static long field3916;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)J")
    public static final synchronized long method1537(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field3916) {
            field3915 += field3916 - var1;
        }
        field3916 = var1;
        if (arg0 != -26619) {
            field3916 = 98L;
        }
        return field3915 + var1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    private class223() {
    }
}
