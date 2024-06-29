import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class57 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "J")
    private static long field919;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "J")
    private static long field920;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method391(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field920) {
            field919 += field920 - var1;
        }
        field920 = var1;
        if (arg0 != 19211) {
            field920 = -40L;
        }
        return field919 + var1;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 26)
    private class57() {
    }
}
