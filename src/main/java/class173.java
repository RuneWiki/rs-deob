import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class173 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "J")
    private static long field2237;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "J")
    private static long field2238;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)J")
    public static final synchronized long method1134(boolean arg0) {
        if (!arg0) {
            method1134(true);
        }
        long var1 = System.currentTimeMillis();
        if (field2237 > var1) {
            field2238 += field2237 - var1;
        }
        field2237 = var1;
        return var1 + field2238;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    private class173() {
    }
}
