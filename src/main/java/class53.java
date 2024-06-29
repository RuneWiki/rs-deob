import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class53 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "J")
    private static long field1011;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "J")
    private static long field1012;

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    private class53() {
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J")
    public static final synchronized long method405(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 <= 12) {
            field1011 = 67L;
        }
        if (var1 < field1012) {
            field1011 += field1012 - var1;
        }
        field1012 = var1;
        return field1011 + var1;
    }
}
