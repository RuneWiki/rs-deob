import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JEESRQGR")
public class class30 extends class27 {

    @OriginalMember(owner = "JEESRQGR", name = "j", descriptor = "I")
    public int field935 = 1000;

    @OriginalMember(owner = "JEESRQGR", name = "k", descriptor = "Z")
    public static boolean field936;

    @OriginalMember(owner = "JEESRQGR", name = "i", descriptor = "[LLWVZOAPR;")
    public class40[] field934;

    @OriginalMember(owner = "JEESRQGR", name = "a", descriptor = "(IIIIIIIII)V")
    public void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class66 var10 = this.method13(186);
        if (var10 != null) {
            this.field935 = var10.field935;
            var10.method261(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "JEESRQGR", name = "a", descriptor = "(I)LVYUQHOMO;")
    public class66 method13(int arg0) {
        int var2 = 5 / arg0;
        return null;
    }
}
