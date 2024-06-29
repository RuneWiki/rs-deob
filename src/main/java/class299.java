import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class299 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
    private static long field4761;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
    private static long field4762;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
    public static final synchronized long method2006(int arg0) {
        if (arg0 != 9594) {
            method2006(122);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field4761) {
            field4762 += field4761 - var1;
        }
        field4761 = var1;
        return field4762 + var1;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    private class299() {
    }
}
