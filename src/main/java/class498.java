import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class498 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "J")
    private static long field6893;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "J")
    private static long field6894;

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    private class498() {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)J")
    public static final synchronized long method2854(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field6893 > var1) {
            field6894 += field6893 - var1;
        }
        field6893 = var1;
        if (arg0 >= -108) {
            method2854(-8);
        }
        return field6894 + var1;
    }
}
