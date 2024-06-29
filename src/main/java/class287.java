import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class287 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "J")
    private static long field4550;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "J")
    private static long field4551;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)J")
    public static final synchronized long method1928(int arg0) {
        if (arg0 != 27332) {
            method1928(-80);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field4551) {
            field4550 += field4551 - var1;
        }
        field4551 = var1;
        return var1 + field4550;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    private class287() {
    }
}
