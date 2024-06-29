import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "J")
    private static long field34;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "J")
    private static long field35;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)J")
    public static final synchronized long method14(int arg0) {
        if (arg0 != 29853) {
            method14(-51);
        }
        long var1 = System.currentTimeMillis();
        if (field35 > var1) {
            field34 += field35 - var1;
        }
        field35 = var1;
        return var1 + field34;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    private class3() {
    }
}
