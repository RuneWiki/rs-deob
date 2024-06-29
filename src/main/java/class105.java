import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class105 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "J")
    private static long field1536;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "J")
    private static long field1537;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)J", line = 5)
    public static final synchronized long method789(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != 55) {
            return -120L;
        }
        if (var1 < field1537) {
            field1536 += field1537 - var1;
        }
        field1537 = var1;
        return field1536 + var1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 25)
    private class105() {
    }
}
