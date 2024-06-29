import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class689 {

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "[I")
    public static int[] field9708 = new int[13];

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "[I")
    public static int[] field9710 = new int[4];

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Lqe;")
    public static class465 field9709;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method3871(int arg0) {
        field9708 = null;
        field9709 = null;
        if (arg0 != 13) {
            method3871(-40);
        }
        field9710 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
    public static final void method3872(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        if (var3 != null) {
            class260.method1768(var3.field5846);
            if (var3.field5846 != null) {
                var3.field5846 = null;
            }
        }
    }
}
