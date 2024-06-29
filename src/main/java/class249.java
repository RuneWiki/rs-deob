import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class249 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "J")
    private static long field4081;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "J")
    private static long field4082;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    private class249() {
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)J")
    public static final synchronized long method1723(byte arg0) {
        if (arg0 < 3) {
            method1723((byte) 54);
        }
        long var1 = System.currentTimeMillis();
        if (field4081 > var1) {
            field4082 += field4081 - var1;
        }
        field4081 = var1;
        return field4082 + var1;
    }
}
