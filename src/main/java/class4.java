import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AOBGXKOU")
public class class4 extends class61 {

    @OriginalMember(owner = "AOBGXKOU", name = "i", descriptor = "Z")
    private boolean field34 = true;

    @OriginalMember(owner = "AOBGXKOU", name = "j", descriptor = "Z")
    private boolean field35 = true;

    @OriginalMember(owner = "AOBGXKOU", name = "l", descriptor = "I")
    public int field37 = 1000;

    @OriginalMember(owner = "AOBGXKOU", name = "m", descriptor = "Z")
    public static boolean field38;

    @OriginalMember(owner = "AOBGXKOU", name = "k", descriptor = "[LKCBBJKUN;")
    public class32[] field36;

    @OriginalMember(owner = "AOBGXKOU", name = "a", descriptor = "(IIIIIIIII)V")
    public void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class67 var10 = this.method16(true);
        if (var10 != null) {
            this.field37 = var10.field37;
            var10.method15(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "AOBGXKOU", name = "a", descriptor = "(Z)LYABPKWWG;")
    public class67 method16(boolean arg0) {
        if (!arg0) {
            this.field35 = !this.field35;
        }
        return null;
    }
}
