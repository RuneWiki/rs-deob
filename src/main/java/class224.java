import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class224 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "J")
    private static long field3909;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "J")
    private static long field3910;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)J", line = 6)
    public static final synchronized long method1536(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (field3910 > var1) {
            field3909 += field3910 - var1;
        }
        field3910 = var1;
        if (arg0) {
            method1536(true);
        }
        return field3909 + var1;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 25)
    private class224() {
    }
}
