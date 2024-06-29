import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class231 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "J")
    private static long field3990;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "J")
    private static long field3991;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)J")
    public static final synchronized long method1513(int arg0) {
        int var1 = -53 % ((arg0 - 12) / 38);
        long var2 = System.currentTimeMillis();
        if (field3991 > var2) {
            field3990 += field3991 - var2;
        }
        field3991 = var2;
        return field3990 + var2;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    private class231() {
    }
}
