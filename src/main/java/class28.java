import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "J")
    private static long field355;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "J")
    private static long field356;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)J")
    public static final synchronized long method155(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field355 > var1) {
            field356 += field355 - var1;
        }
        int var3 = -67 / ((arg0 - 49) / 48);
        field355 = var1;
        return field356 + var1;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    private class28() {
    }
}
