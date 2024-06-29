import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class257 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "J")
    private static long field3951;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "J")
    private static long field3952;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)J")
    public static final synchronized long method1736(int arg0) {
        if (arg0 != 14361) {
            method1736(126);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field3952) {
            field3951 += field3952 - var1;
        }
        field3952 = var1;
        return field3951 + var1;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    private class257() {
    }
}
