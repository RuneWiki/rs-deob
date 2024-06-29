import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class435 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "J")
    private static long field6163;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "J")
    private static long field6164;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)J")
    public static final synchronized long method2539(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field6164) {
            field6163 += field6164 - var1;
        }
        field6164 = var1;
        return arg0 == -10659 ? var1 + field6163 : 57L;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
    private class435() {
    }
}
