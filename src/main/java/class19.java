import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class19 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "J")
    private static long field203;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "J")
    private static long field204;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)J")
    public static final synchronized long method91(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field204 > var1) {
            field203 += field204 - var1;
        }
        if (arg0 < 75) {
            field204 = 47L;
        }
        field204 = var1;
        return field203 + var1;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    private class19() {
    }
}
