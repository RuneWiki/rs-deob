import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class155 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "J")
    private static long field2720;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "J")
    private static long field2721;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)J")
    public static final synchronized long method1133(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field2721 > var1) {
            field2720 += field2721 - var1;
        }
        if (arg0 <= 122) {
            return 50L;
        } else {
            field2721 = var1;
            return field2720 + var1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    private class155() {
    }
}
