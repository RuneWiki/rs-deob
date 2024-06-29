import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class442 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "J")
    private static long field6444;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "J")
    private static long field6445;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)J", line = 6)
    public static final synchronized long method2730(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field6445) {
            field6444 += field6445 - var1;
        }
        if (arg0 != 25207) {
            method2730(-46);
        }
        field6445 = var1;
        return field6444 + var1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 26)
    private class442() {
    }
}
