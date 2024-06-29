import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class768 extends class753 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[Lls;")
    public class592[] field10436;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([Lls;)V")
    public class768(class592[] arg0) {
        this.field10436 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLjava/lang/String;IIZ)V")
    public static final void method4166(boolean arg0, String arg1, int arg2, int arg3, boolean arg4) {
        if (!arg0) {
            method4166(false, null, 93, 31, false);
        }
        field10437++;
        class48.method313((byte) 2, arg1, false, arg4, null, arg2, arg3);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)Z")
    public static boolean method4167(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
