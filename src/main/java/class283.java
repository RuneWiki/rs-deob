import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class283 {

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "D")
    public static double field4190;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIII)V", line = 12)
    public static final void method1845(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4189++;
        class313 var5 = class312.method1998((long) arg1 << 32 | (long) arg0, 19, -1);
        if (arg3 != -10135) {
            field4190 = -1.060381927718365D;
        }
        var5.method2001((byte) 93);
        var5.field4455 = arg2;
        var5.field4464 = arg4;
    }
}
