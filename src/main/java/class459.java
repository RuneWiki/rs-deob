import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class459 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lrb;")
    public static class352 field6655 = new class352(10, 2, 2, 0);

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lmv;")
    public static class631 field6656;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 4)
    public static void method2738(int arg0) {
        if (arg0 == 3) {
            field6655 = null;
            field6656 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)I", line = 18)
    public static final int method2739(int arg0, int arg1, int arg2, int arg3) {
        field6657++;
        int var4 = arg0 & arg3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }
}
