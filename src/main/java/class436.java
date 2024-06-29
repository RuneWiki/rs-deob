import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class436 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Ldi;")
    public static class83 field6381 = new class83(60, 7);

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Ldi;")
    public static class83 field6382 = new class83(26, 6);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIZ)V", line = 6)
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6380++;
        if (class256.method1534(32554, arg0)) {
            class200.method1248(arg3, class495.field7226[arg0], -1, arg2, arg4, -1);
            if (arg1 != 31708) {
                method2570(2);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 21)
    public static void method2570(int arg0) {
        field6382 = null;
        if (arg0 == 7) {
            field6381 = null;
        }
    }
}
