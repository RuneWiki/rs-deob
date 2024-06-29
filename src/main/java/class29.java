import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class29 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "J")
    private static long field363;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
    private static long field364;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 3)
    private class29() {
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)J", line = 9)
    public static final synchronized long method174(int arg0) {
        if (arg0 != 27763) {
            method174(-27);
        }
        long var1 = System.currentTimeMillis();
        if (field363 > var1) {
            field364 += field363 - var1;
        }
        field363 = var1;
        return var1 + field364;
    }
}
