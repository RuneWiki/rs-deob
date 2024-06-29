import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class114 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "J")
    private static long field1603;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "J")
    private static long field1604;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)J")
    public static final synchronized long method735(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field1603) {
            field1604 += field1603 - var1;
        }
        if (arg0 <= 91) {
            return -88L;
        } else {
            field1603 = var1;
            return field1604 + var1;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    private class114() {
    }
}
