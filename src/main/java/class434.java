import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class434 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "J")
    private static long field6261;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "J")
    private static long field6262;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)J")
    public static final synchronized long method2591(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field6261 > var1) {
            field6262 += field6261 - var1;
        }
        if (arg0 != -19310) {
            method2591(111);
        }
        field6261 = var1;
        return var1 + field6262;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    private class434() {
    }
}
