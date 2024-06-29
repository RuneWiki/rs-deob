import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class205 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "J")
    private static long field3718;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "J")
    private static long field3719;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)J")
    public static final synchronized long method1403(int arg0) {
        int var1 = 118 % ((arg0 - 16) / 33);
        long var2 = System.currentTimeMillis();
        if (var2 < field3719) {
            field3718 += field3719 - var2;
        }
        field3719 = var2;
        return var2 + field3718;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    private class205() {
    }
}
