import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class45 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "F")
    public static float field604 = 0.0F;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lrm;")
    public static class184 field603 = new class184(260);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZI)I", line = 4)
    public static final int method356(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field604 = -1.1322114F;
        }
        field601++;
        int var3 = class344.method2376(4, arg0 + 91923, arg2 + 45365, 1994) - (-(class344.method2376(2, arg0 + 37821, arg2 - -10294, 1994) + -128 >> 1) - (class344.method2376(1, arg0, arg2, 1994) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 32)
    public static void method357(int arg0) {
        field603 = null;
        int var1 = 6 % ((arg0 - 74) / 45);
    }
}
