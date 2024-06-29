import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class205 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "J")
    private static long field3355;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "J")
    private static long field3356;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)J", line = 6)
    public static final synchronized long method1451(int arg0) {
        int var1 = -48 % ((-arg0 - 50) / 32);
        long var2 = System.currentTimeMillis();
        if (field3355 > var2) {
            field3356 += field3355 - var2;
        }
        field3355 = var2;
        return var2 + field3356;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 23)
    private class205() {
    }
}
