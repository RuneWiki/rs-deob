import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class175 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "J")
    private static long field2394;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "J")
    private static long field2395;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)J")
    public static final synchronized long method1195(int arg0) {
        if (arg0 <= 19) {
            method1195(-18);
        }
        long var1 = System.currentTimeMillis();
        if (field2394 > var1) {
            field2395 += field2394 - var1;
        }
        field2394 = var1;
        return field2395 + var1;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    private class175() {
    }
}
