import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class729 extends class311 {

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "Luh;")
    public static class168 field9868 = new class168();

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "[I")
    public static int[] field9869 = new int[1000];

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "[Lrh;")
    public static class267[] field9866;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "(B)V", line = 5)
    public static void method4033(byte arg0) {
        if (arg0 < 23) {
            field9869 = null;
        }
        field9866 = null;
        field9868 = null;
        field9869 = null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lin;Lin;Lfu;)V", line = 17)
    public class729(class91 arg0, class91 arg1, class392 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIBII)V", line = 22)
    public final void method2025(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 21) {
            field9866 = null;
        }
        ++field9865;
        int var6 = super.field4336.method1618();
        int var7 = ((class392) super.field8228).field5769 * class393.method2470(512) / 10 % var6;
        super.field4336.method2923(arg3 - (var6 - var7), arg0, arg4 - -var6 + -var7, arg1);
    }
}
