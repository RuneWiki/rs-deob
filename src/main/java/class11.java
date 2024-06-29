import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CRKDFBCP")
public class class11 extends class33 {

    @OriginalMember(owner = "client!CRKDFBCP", name = "j", descriptor = "I")
    public int field695 = 1000;

    @OriginalMember(owner = "client!CRKDFBCP", name = "k", descriptor = "Z")
    public static boolean field696;

    @OriginalMember(owner = "client!CRKDFBCP", name = "i", descriptor = "[LRRADOXCY;")
    public class52[] field694;

    @OriginalMember(owner = "client!CRKDFBCP", name = "a", descriptor = "(IIIIIIIII)V")
    public void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class45 var10 = this.method5(0);
        if (var10 != null) {
            this.field695 = var10.field695;
            var10.method181(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!CRKDFBCP", name = "a", descriptor = "(I)LOGORHYVW;")
    public class45 method5(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return null;
    }
}
