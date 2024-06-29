import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ACEAAIDL")
public class class3 extends class26 {

    @OriginalMember(owner = "client!ACEAAIDL", name = "k", descriptor = "I")
    public int field11 = 1000;

    @OriginalMember(owner = "client!ACEAAIDL", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!ACEAAIDL", name = "l", descriptor = "Z")
    public static boolean field12;

    @OriginalMember(owner = "client!ACEAAIDL", name = "j", descriptor = "[LGIKYYSAQ;")
    public class19[] field10;

    @OriginalMember(owner = "client!ACEAAIDL", name = "a", descriptor = "(IIIIIIIII)V")
    public void method7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var10 = this.method8(false);
        if (var10 != null) {
            this.field11 = var10.field11;
            var10.method7(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ACEAAIDL", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public class16 method8(boolean arg0) {
        if (arg0) {
            this.field9 = 494;
        }
        return null;
    }
}
