import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class219 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lcga;")
    public static class449 field2548 = new class449(51, 5);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Ldr;")
    public static class675 field2550 = new class675(85, -1);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public static final void method1258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2549++;
        if (class292.field3700 <= arg3 - arg2 && arg2 + arg3 <= class337.field4186 && class125.field1524 <= (arg4 - arg2) && arg4 + arg2 <= class377.field4848) {
            class113.method781(arg2, 108, arg1, arg4, arg3);
        } else {
            class38.method246(arg3, arg1, arg4, arg2, 2048);
        }
        int var5 = 126 / ((arg0 + 30) / 53);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1259(int arg0) {
        field2550 = null;
        if (arg0 != 5) {
            method1259(28);
        }
        field2548 = null;
    }
}
