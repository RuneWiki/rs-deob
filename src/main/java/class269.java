import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class269 {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Lov;")
    public static class666 field3820;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "[I")
    public static int[] field3822;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
    public static final void method1760(int arg0, int arg1) {
        field3821++;
        class503 var2 = class512.method3112(arg0, arg1, 0);
        var2.method3074(arg0 ^ 0xFFFFFFA7);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method1761(byte arg0) {
        field3822 = null;
        field3820 = null;
        int var1 = -69 % ((arg0 + 50) / 58);
    }
}
