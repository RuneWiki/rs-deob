import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class348 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "J")
    private static long field4800;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "J")
    private static long field4801;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    private class348() {
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)J")
    public static final synchronized long method2175(int arg0) {
        if (arg0 > -115) {
            method2175(-74);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field4801) {
            field4800 += field4801 - var1;
        }
        field4801 = var1;
        return field4800 + var1;
    }
}
