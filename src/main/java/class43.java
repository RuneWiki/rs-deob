import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class43 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "J")
    private static long field571;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
    private static long field572;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    private class43() {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)J")
    public static final synchronized long method364(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -16756) {
            field572 = -93L;
        }
        if (var1 < field572) {
            field571 += field572 - var1;
        }
        field572 = var1;
        return field571 + var1;
    }
}
