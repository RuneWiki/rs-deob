import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class253 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Z")
    public static boolean field4216 = false;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static volatile int field4218 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lda;III)Lpm;", line = 18)
    public static final class99 method1760(class143 arg0, int arg1, int arg2, int arg3) {
        field4217++;
        if (arg1 != 0) {
            field4216 = true;
        }
        return class94.method757(arg0, arg3, arg1 - 1908303920, arg2) ? class30.method249((byte) 75) : null;
    }
}
