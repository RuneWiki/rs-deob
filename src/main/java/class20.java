import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GLSQHJVO")
public class class20 extends class42 {

    @OriginalMember(owner = "client!GLSQHJVO", name = "i", descriptor = "I")
    public int field794 = 1000;

    @OriginalMember(owner = "client!GLSQHJVO", name = "j", descriptor = "Z")
    public static boolean field795;

    @OriginalMember(owner = "client!GLSQHJVO", name = "h", descriptor = "[LQGLHAGGP;")
    public class49[] field793;

    @OriginalMember(owner = "client!GLSQHJVO", name = "a", descriptor = "(IIIIIIIII)V")
    public void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var10 = this.method168(-840);
        if (var10 != null) {
            this.field794 = var10.field794;
            var10.method212(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!GLSQHJVO", name = "a", descriptor = "(I)LIRLTEWJP;")
    public class26 method168(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return null;
    }
}
