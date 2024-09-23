import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FGVBONDH")
public class class21 extends class30 {

    @OriginalMember(owner = "FGVBONDH", name = "k", descriptor = "I")
    public int field741 = 1000;

    @OriginalMember(owner = "FGVBONDH", name = "i", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "FGVBONDH", name = "l", descriptor = "Z")
    public static boolean field742;

    @OriginalMember(owner = "FGVBONDH", name = "j", descriptor = "[LGPZVLKRL;")
    public class24[] field740;

    @OriginalMember(owner = "FGVBONDH", name = "a", descriptor = "(IIIIIIIII)V")
    public void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class27 var10 = this.method1(8);
        if (var10 != null) {
            this.field741 = var10.field741;
            var10.method274(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "FGVBONDH", name = "a", descriptor = "(I)LHEQROJXW;")
    public class27 method1(int arg0) {
        if (arg0 != 8) {
            this.field739 = 253;
        }
        return null;
    }
}
