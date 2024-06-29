import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class219 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "J")
    private static long field3473;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "J")
    private static long field3474;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 2)
    private class219() {
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method1609(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field3473 > var1) {
            field3474 += field3473 - var1;
        }
        field3473 = var1;
        if (arg0 != -898) {
            method1609(110);
        }
        return field3474 + var1;
    }
}
