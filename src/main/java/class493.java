import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class493 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
    private static long field7119;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "J")
    private static long field7120;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 3)
    private class493() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)J", line = 8)
    public static final synchronized long method2937(int arg0) {
        if (arg0 > -56) {
            return -17L;
        }
        long var1 = System.currentTimeMillis();
        if (field7120 > var1) {
            field7119 += field7120 - var1;
        }
        field7120 = var1;
        return field7119 + var1;
    }
}
