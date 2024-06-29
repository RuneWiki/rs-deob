import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class219 {

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "Lja;")
    public static class254 field3576 = new class254();

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3577 = -1;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIII)I")
    public static final int method1630(int arg0, int arg1, int arg2, int arg3) {
        field3575++;
        int var4 = arg0 & 0x3;
        if (~var4 == arg1) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static void method1631(int arg0) {
        field3576 = null;
        if (arg0 != 7) {
            field3578 = 88;
        }
    }
}
