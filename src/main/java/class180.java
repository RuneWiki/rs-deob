import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class180 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "J")
    private static long field3259;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "J")
    private static long field3260;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)J")
    public static final synchronized long method1236(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field3259 > var1) {
            field3260 += field3259 - var1;
        }
        int var3 = 20 % ((arg0 - 49) / 43);
        field3259 = var1;
        return field3260 + var1;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    private class180() {
    }
}
