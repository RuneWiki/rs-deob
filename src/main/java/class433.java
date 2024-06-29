import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class433 {

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "J")
    private static long field6049;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "J")
    private static long field6050;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)J")
    public static final synchronized long method2562(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field6049 > var1) {
            field6050 += field6049 - var1;
        }
        field6049 = var1;
        if (arg0 != -2039) {
            field6050 = -108L;
        }
        return field6050 + var1;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    private class433() {
    }
}
