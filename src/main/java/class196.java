import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class196 extends class287 {

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Loo;")
    public class648 field2831;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lsc;")
    public class451 field2828;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Lefa;")
    public static class528 field2829 = new class528();

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "Z")
    public static boolean field2835 = true;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "F")
    public static float field2836 = 0.0F;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "Lrl;")
    public static class232 field2837;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field2837 = null;
        field2829 = null;
        if (arg0 > -100) {
            method1322(57);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public final void method1323(boolean arg0) {
        this.field2825 = this.field2831.field9190;
        this.field2830 = this.field2831.field9185;
        this.field2833 = this.field2831.field9186;
        field2827++;
        if (this.field2831.field9191 != null) {
            this.field2831.field9191.method872(this.field2828.field6195, this.field2828.field6213, this.field2828.field6200, class456.field6279);
        }
        this.field2826 = class456.field6279[0];
        this.field2834 = class456.field6279[2];
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Loo;Lpba;)V")
    public class196(class648 arg0, class198 arg1) {
        this.field2831 = arg0;
        this.field2828 = this.field2831.method3757(0);
        this.method1323(true);
    }
}
