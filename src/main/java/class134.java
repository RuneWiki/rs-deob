import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class134 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "J")
    private static long field2095;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "J")
    private static long field2096;

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    private class134() {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)J")
    public static final synchronized long method924(boolean arg0) {
        if (arg0) {
            field2095 = 119L;
        }
        long var1 = System.currentTimeMillis();
        if (field2095 > var1) {
            field2096 += field2095 - var1;
        }
        field2095 = var1;
        return field2096 + var1;
    }
}
