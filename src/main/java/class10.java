import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class10 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "J")
    private static long field72;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "J")
    private static long field73;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    private class10() {
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)J")
    public static final synchronized long method51(int arg0) {
        if (arg0 != -3183) {
            method51(109);
        }
        long var1 = System.currentTimeMillis();
        if (field73 > var1) {
            field72 += field73 - var1;
        }
        field73 = var1;
        return var1 + field72;
    }
}
