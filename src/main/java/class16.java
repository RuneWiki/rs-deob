import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ESJLSSWI")
public class class16 extends class21 {

    @OriginalMember(owner = "client!ESJLSSWI", name = "h", descriptor = "Z")
    private boolean field724 = true;

    @OriginalMember(owner = "client!ESJLSSWI", name = "j", descriptor = "I")
    public int field726 = 1000;

    @OriginalMember(owner = "client!ESJLSSWI", name = "k", descriptor = "Z")
    public static boolean field727;

    @OriginalMember(owner = "client!ESJLSSWI", name = "i", descriptor = "[LEQPISSKH;")
    public class15[] field725;

    @OriginalMember(owner = "client!ESJLSSWI", name = "a", descriptor = "(IIIIIIIII)V")
    public void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class61 var10 = this.method174(false);
        if (var10 != null) {
            this.field726 = var10.field726;
            var10.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ESJLSSWI", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public class61 method174(boolean arg0) {
        if (arg0) {
            this.field724 = !this.field724;
        }
        return null;
    }
}
