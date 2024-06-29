import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class450 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "J")
    private static long field6580;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "J")
    private static long field6581;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)J")
    public static final synchronized long method2719(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field6580) {
            field6581 += field6580 - var1;
        }
        field6580 = var1;
        int var3 = 84 / ((57 - arg0) / 61);
        return field6581 + var1;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    private class450() {
    }
}
