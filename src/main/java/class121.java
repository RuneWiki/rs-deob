import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class121 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "J")
    private static long field2180;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "J")
    private static long field2181;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)J")
    public static final synchronized long method888(byte arg0) {
        if (arg0 != -119) {
            method888((byte) -9);
        }
        long var1 = System.currentTimeMillis();
        if (field2180 > var1) {
            field2181 += field2180 - var1;
        }
        field2180 = var1;
        return field2181 + var1;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    private class121() {
    }
}
