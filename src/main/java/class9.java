import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class9 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "J")
    private static long field92;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "J")
    private static long field93;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 4)
    private class9() {
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)J", line = 10)
    public static final synchronized long method57(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -14133) {
            method57(-107);
        }
        if (var1 < field92) {
            field93 += field92 - var1;
        }
        field92 = var1;
        return field93 + var1;
    }
}
