import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class248 extends class676 {

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "[I")
    public static int[] field3217 = new int[8];

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "Z")
    public static boolean field3218 = false;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
    public static void method1503(int arg0) {
        if (arg0 > 21) {
            field3217 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lr;IZI)Lla;")
    public static final class409 method1504(class562 arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 59 % ((arg3 + 48) / 43);
        field3216++;
        class633 var5 = class468.method2607(arg1, 10735, arg2, arg0);
        return var5 == null ? null : var5.field8762;
    }
}
