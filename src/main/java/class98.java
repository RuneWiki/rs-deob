import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class98 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "J")
    private static long field1315;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "J")
    private static long field1316;

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 2)
    private class98() {
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)J", line = 8)
    public static final synchronized long method768(byte arg0) {
        int var1 = 18 / ((arg0 + 25) / 44);
        long var2 = System.currentTimeMillis();
        if (field1315 > var2) {
            field1316 += field1315 - var2;
        }
        field1315 = var2;
        return field1316 + var2;
    }
}
