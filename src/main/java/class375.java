import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class375 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
    private static long field5537;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "J")
    private static long field5538;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)J")
    public static final synchronized long method2397(byte arg0) {
        if (arg0 != -75) {
            field5537 = 60L;
        }
        long var1 = System.currentTimeMillis();
        if (field5537 > var1) {
            field5538 += field5537 - var1;
        }
        field5537 = var1;
        return field5538 + var1;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    private class375() {
    }
}
