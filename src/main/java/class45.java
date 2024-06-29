import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class45 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "J")
    private static long field467;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "J")
    private static long field468;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)J", line = 4)
    public static final synchronized long method252(byte arg0) {
        if (arg0 != -8) {
            field468 = 47L;
        }
        long var1 = System.currentTimeMillis();
        if (field468 > var1) {
            field467 += field468 - var1;
        }
        field468 = var1;
        return field467 + var1;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 23)
    private class45() {
    }
}
