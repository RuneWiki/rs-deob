import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CYZGZTKE")
public class class12 extends class60 {

    @OriginalMember(owner = "CYZGZTKE", name = "l", descriptor = "I")
    public int field582 = 1000;

    @OriginalMember(owner = "CYZGZTKE", name = "m", descriptor = "Z")
    public static boolean field583;

    @OriginalMember(owner = "CYZGZTKE", name = "k", descriptor = "[LBRVNRJXX;")
    public class5[] field581;

    @OriginalMember(owner = "CYZGZTKE", name = "a", descriptor = "(IIIIIIIII)V")
    public void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class37 var10 = this.method1(0);
        if (var10 != null) {
            this.field582 = var10.field582;
            var10.method231(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "CYZGZTKE", name = "a", descriptor = "(I)LLFTMDGKK;")
    public class37 method1(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return null;
    }
}
