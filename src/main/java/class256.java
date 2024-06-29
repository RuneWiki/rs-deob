import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class256 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "J")
    private static long field3785;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "J")
    private static long field3786;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)J")
    public static final synchronized long method1708(byte arg0) {
        if (arg0 != 118) {
            field3785 = 85L;
        }
        long var1 = System.currentTimeMillis();
        if (field3786 > var1) {
            field3785 += field3786 - var1;
        }
        field3786 = var1;
        return var1 + field3785;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    private class256() {
    }
}
