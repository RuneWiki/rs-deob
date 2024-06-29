import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class102 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "J")
    private static long field1590;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "J")
    private static long field1591;

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 3)
    private class102() {
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)J", line = 9)
    public static final synchronized long method743(byte arg0) {
        if (arg0 < 72) {
            method743((byte) 68);
        }
        long var1 = System.currentTimeMillis();
        if (field1590 > var1) {
            field1591 += field1590 - var1;
        }
        field1590 = var1;
        return field1591 + var1;
    }
}
