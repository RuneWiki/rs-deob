import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class269 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "J")
    private static long field4272;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "J")
    private static long field4273;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J")
    public static final synchronized long method1823(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field4273) {
            field4272 += field4273 - var1;
        }
        if (arg0 >= -16) {
            method1823(-60);
        }
        field4273 = var1;
        return field4272 + var1;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    private class269() {
    }
}
