import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class55 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "J")
    private static long field808;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "J")
    private static long field809;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J")
    public static final synchronized long method375(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field808 > var1) {
            field809 += field808 - var1;
        }
        if (arg0 != -3913) {
            field808 = -67L;
        }
        field808 = var1;
        return var1 + field809;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    private class55() {
    }
}
