import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class193 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "J")
    private static long field2755;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "J")
    private static long field2756;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J", line = 3)
    public static final synchronized long method1237(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field2755 > var1) {
            field2756 += field2755 - var1;
        }
        if (arg0 != -9581) {
            method1237(-8);
        }
        field2755 = var1;
        return var1 + field2756;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 25)
    private class193() {
    }
}
