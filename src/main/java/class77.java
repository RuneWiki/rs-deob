import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class77 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "J")
    private static long field1256;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "J")
    private static long field1257;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    private class77() {
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)J")
    public static final synchronized long method569(byte arg0) {
        int var1 = 42 % ((-arg0 - 61) / 50);
        long var2 = System.currentTimeMillis();
        if (field1256 > var2) {
            field1257 += field1256 - var2;
        }
        field1256 = var2;
        return field1257 + var2;
    }
}
