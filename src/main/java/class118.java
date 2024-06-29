import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class118 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
    private static long field2041;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
    private static long field2042;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J", line = 6)
    public static final synchronized long method835(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field2042 > var1) {
            field2041 += field2042 - var1;
        }
        if (arg0 == -1272) {
            field2042 = var1;
            return field2041 + var1;
        } else {
            return -128L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 26)
    private class118() {
    }
}
