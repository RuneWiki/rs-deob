import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class58 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "J")
    private static long field832;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "J")
    private static long field833;

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 4)
    private class58() {
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)J", line = 8)
    public static final synchronized long method427(byte arg0) {
        if (arg0 != -19) {
            field832 = 7L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field833) {
            field832 += field833 - var1;
        }
        field833 = var1;
        return field832 + var1;
    }
}
