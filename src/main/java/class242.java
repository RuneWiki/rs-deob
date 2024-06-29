import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class242 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "J")
    private static long field3874;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "J")
    private static long field3875;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
    public static final synchronized long method1650(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 <= 16) {
            return 105L;
        }
        if (field3875 > var1) {
            field3874 += field3875 - var1;
        }
        field3875 = var1;
        return field3874 + var1;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    private class242() {
    }
}
