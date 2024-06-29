import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class504 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "J")
    private static long field7272;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "J")
    private static long field7273;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)J", line = 3)
    public static final synchronized long method3034(byte arg0) {
        if (arg0 >= -94) {
            return 113L;
        }
        long var1 = System.currentTimeMillis();
        if (field7272 > var1) {
            field7273 += field7272 - var1;
        }
        field7272 = var1;
        return field7273 + var1;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 26)
    private class504() {
    }
}
