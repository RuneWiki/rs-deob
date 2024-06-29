import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class46 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "J")
    private static long field576;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "J")
    private static long field577;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J", line = 4)
    public static final synchronized long method297(int arg0) {
        if (arg0 != 27104) {
            field577 = 30L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field576) {
            field577 += field576 - var1;
        }
        field576 = var1;
        return field577 + var1;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 23)
    private class46() {
    }
}
