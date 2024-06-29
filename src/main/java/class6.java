import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class6 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "J")
    private static long field62;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "J")
    private static long field63;

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 4)
    private class6() {
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)J", line = 9)
    public static final synchronized long method37(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field63 > var1) {
            field62 += field63 - var1;
        }
        if (arg0 != 10828) {
            field63 = -1L;
        }
        field63 = var1;
        return field62 + var1;
    }
}
