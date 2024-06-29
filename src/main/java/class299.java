import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class299 {

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field3800 = 0;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "[I")
    public static int[] field3803;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "[Ld;")
    public static class140[] field3801;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 5)
    public static void method1782(int arg0) {
        field3803 = null;
        field3801 = null;
        if (arg0 != 0) {
            field3803 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIIBI)V", line = 19)
    public static final void method1783(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class628.field8526 == 0) {
            class569.method3016(false, (byte) 110);
        } else {
            class599.field8038 = class628.field8526;
            class364.method2114(0, 112);
        }
        field3802++;
        class309.field3896 = arg0;
        class381.field4882 = arg2;
        if (arg3 > 57) {
            class255.field3278 = arg4;
            class604.method3343(arg1);
        }
    }
}
