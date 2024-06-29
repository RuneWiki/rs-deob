import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class67 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "J")
    private static long field1123;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "J")
    private static long field1124;

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 5)
    private class67() {
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)J", line = 10)
    public static final synchronized long method501(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 >= -93) {
            return -87L;
        }
        if (field1123 > var1) {
            field1124 += field1123 - var1;
        }
        field1123 = var1;
        return field1124 + var1;
    }
}
