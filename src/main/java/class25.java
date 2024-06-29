import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "J")
    private static long field696;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
    private static long field697;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    private class25() {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)J")
    public static final synchronized long method182(boolean arg0) {
        if (!arg0) {
            field697 = 77L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field697) {
            field696 += field697 - var1;
        }
        field697 = var1;
        return var1 + field696;
    }
}
