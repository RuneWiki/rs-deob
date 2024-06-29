import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class224 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "J")
    private static long field3015;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "J")
    private static long field3016;

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    private class224() {
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)J")
    public static final synchronized long method1425(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field3015) {
            field3016 += field3015 - var1;
        }
        field3015 = var1;
        if (arg0 != -26805) {
            method1425(25);
        }
        return field3016 + var1;
    }
}
