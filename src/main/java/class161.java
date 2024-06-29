import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class161 {

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Lqfa;")
    public static class85 field2719 = new class85(81, 11);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "F")
    public static float field2718;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
    public static final void method1241(int arg0) {
        if (class547.method3153(true)) {
            if (class696.field9798 == null) {
                class609.method3501(45);
            }
            class144.field2519 = true;
            class300.field4466 = 0;
        }
        if (arg0 != 81) {
            field2718 = -1.4683818F;
        }
        field2720++;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field2719 = null;
        if (arg0 > -56) {
            method1242(41);
        }
    }
}
