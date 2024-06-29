import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class128 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "J")
    private static long field1973;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "J")
    private static long field1974;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)J", line = 4)
    public static final synchronized long method869(byte arg0) {
        if (arg0 != -55) {
            return -90L;
        }
        long var1 = System.currentTimeMillis();
        if (field1974 > var1) {
            field1973 += field1974 - var1;
        }
        field1974 = var1;
        return field1973 + var1;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 23)
    private class128() {
    }
}
