import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class464 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "J")
    private static long field6826;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "J")
    private static long field6827;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 3)
    private class464() {
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)J", line = 7)
    public static final synchronized long method2773(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != 103) {
            return -120L;
        }
        if (field6827 > var1) {
            field6826 += field6827 - var1;
        }
        field6827 = var1;
        return field6826 + var1;
    }
}
