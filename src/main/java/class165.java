import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class165 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "J")
    private static long field2490;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "J")
    private static long field2491;

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    private class165() {
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)J")
    public static final synchronized long method1188(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field2491) {
            field2490 += field2491 - var1;
        }
        if (arg0 != 26) {
            method1188((byte) -41);
        }
        field2491 = var1;
        return field2490 + var1;
    }
}
