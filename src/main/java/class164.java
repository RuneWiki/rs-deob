import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class164 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "J")
    private static long field1902;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "J")
    private static long field1903;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)J")
    public static final synchronized long method1038(int arg0) {
        if (arg0 != 8635) {
            method1038(1);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field1902) {
            field1903 += field1902 - var1;
        }
        field1902 = var1;
        return var1 + field1903;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    private class164() {
    }
}
