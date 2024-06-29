import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class231 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "J")
    private static long field3483;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "J")
    private static long field3484;

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 2)
    private class231() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method1594(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field3484) {
            field3483 += field3484 - var1;
        }
        field3484 = var1;
        if (arg0 != -20375) {
            method1594(-123);
        }
        return field3483 + var1;
    }
}
