import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HTDIJKWW")
public class class17 extends class57 {

    @OriginalMember(owner = "client!HTDIJKWW", name = "i", descriptor = "I")
    public int field758 = 1000;

    @OriginalMember(owner = "client!HTDIJKWW", name = "j", descriptor = "Z")
    public static boolean field759;

    @OriginalMember(owner = "client!HTDIJKWW", name = "h", descriptor = "[LHULEYVZK;")
    public class18[] field757;

    @OriginalMember(owner = "client!HTDIJKWW", name = "a", descriptor = "(IIIIIIIII)V")
    public void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class25 var10 = this.method185(9);
        if (var10 != null) {
            this.field758 = var10.field758;
            var10.method221(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!HTDIJKWW", name = "a", descriptor = "(I)LKDWDYCIL;")
    public class25 method185(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        return null;
    }
}
