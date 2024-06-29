import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class234 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "J")
    private static long field3591;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "J")
    private static long field3592;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)J", line = 6)
    public static final synchronized long method1650(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (field3591 > var1) {
            field3592 += field3591 - var1;
        }
        field3591 = var1;
        int var3 = -19 / ((arg0 + 47) / 54);
        return field3592 + var1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 22)
    private class234() {
    }
}
