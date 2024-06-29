import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class381 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "J")
    private static long field5728;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "J")
    private static long field5729;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)J", line = 5)
    public static final synchronized long method2281(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field5728) {
            field5729 += field5728 - var1;
        }
        field5728 = var1;
        int var3 = -123 / ((arg0 + 47) / 60);
        return field5729 + var1;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 24)
    private class381() {
    }
}
