import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class98 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "J")
    private static long field1468;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "J")
    private static long field1469;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)J")
    public static final synchronized long method665(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (!arg0) {
            field1468 = -82L;
        }
        if (field1468 > var1) {
            field1469 += field1468 - var1;
        }
        field1468 = var1;
        return field1469 + var1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    private class98() {
    }
}
