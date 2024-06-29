import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class18 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "J")
    private static long field248;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "J")
    private static long field249;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)J")
    public static final synchronized long method107(int arg0) {
        if (arg0 != -16145) {
            field248 = 10L;
        }
        long var1 = System.currentTimeMillis();
        if (field248 > var1) {
            field249 += field248 - var1;
        }
        field248 = var1;
        return field249 + var1;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    private class18() {
    }
}
