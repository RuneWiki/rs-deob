import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class419 extends class269 {

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public int field5900;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field5898 = 0;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lke;")
    public static class622 field5896 = new class622(105, 0);

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lre;")
    public static class625 field5901;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 5)
    public static void method2501(byte arg0) {
        field5896 = null;
        field5901 = null;
        if (arg0 > -85) {
            field5901 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lfda;Laba;IIIIIIIIII)V", line = 26)
    public class419(class336 arg0, class185 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5900 = arg11;
        this.field5897 = arg10;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lve;", line = 39)
    public final class527 method606(int arg0) {
        field5899++;
        return arg0 == 0 ? class640.field8997 : null;
    }
}
