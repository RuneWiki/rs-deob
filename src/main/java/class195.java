import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class195 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "J")
    private static long field2933;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "J")
    private static long field2934;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)J", line = 4)
    public static final synchronized long method1322(int arg0) {
        if (arg0 < 115) {
            method1322(71);
        }
        long var1 = System.currentTimeMillis();
        if (field2933 > var1) {
            field2934 += field2933 - var1;
        }
        field2933 = var1;
        return field2934 + var1;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 24)
    private class195() {
    }
}
