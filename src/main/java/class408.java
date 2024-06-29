import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class408 {

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Lrn;")
    public static class633 field5422 = new class633(76, -1);

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
    public static int[] field5423 = new int[2];

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "Ljava/lang/String;")
    public String field5419;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5421++;
        if ((class410.field5439[0][arg3][arg2] & 0x2) != 0) {
            return true;
        } else if ((arg1 & class410.field5439[arg4][arg3][arg2]) == 0) {
            return class650.method3508(arg4, arg3, arg2, false) == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method2374(int arg0) {
        field5423 = null;
        if (arg0 <= -38) {
            field5422 = null;
        }
    }
}
