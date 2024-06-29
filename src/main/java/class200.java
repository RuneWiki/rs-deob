import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class200 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "J")
    private static long field2843;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
    private static long field2844;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 4)
    private class200() {
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)J", line = 9)
    public static final synchronized long method1375(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -16185) {
            field2843 = 7L;
        }
        if (field2843 > var1) {
            field2844 += field2843 - var1;
        }
        field2843 = var1;
        return field2844 + var1;
    }
}
