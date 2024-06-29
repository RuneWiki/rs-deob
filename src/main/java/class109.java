import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class109 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "J")
    private static long field1441;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "J")
    private static long field1442;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)J")
    public static final synchronized long method653(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field1441) {
            field1442 += field1441 - var1;
        }
        field1441 = var1;
        if (arg0) {
            field1442 = -79L;
        }
        return field1442 + var1;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
    private class109() {
    }
}
