import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class111 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "J")
    private static long field2221;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "J")
    private static long field2222;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)J")
    public static final synchronized long method874(int arg0) {
        if (arg0 != 30351) {
            method874(-20);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field2222) {
            field2221 += field2222 - var1;
        }
        field2222 = var1;
        return field2221 + var1;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    private class111() {
    }
}
