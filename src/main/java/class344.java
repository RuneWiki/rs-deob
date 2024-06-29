import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class344 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "J")
    private static long field5113;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "J")
    private static long field5114;

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V", line = 2)
    private class344() {
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)J", line = 5)
    public static final synchronized long method2111(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field5114 > var1) {
            field5113 += field5114 - var1;
        }
        field5114 = var1;
        if (arg0 >= -13) {
            method2111((byte) -89);
        }
        return field5113 + var1;
    }
}
