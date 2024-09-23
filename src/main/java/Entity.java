import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    public int field394 = 1000;

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "x", name = "l", descriptor = "Z")
    public static boolean field395;

    @OriginalMember(owner = "x", name = "j", descriptor = "[Ln;")
    public VertexNormal[] field393;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIIIIIIII)V")
    public void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method109(false);
        if (var10 != null) {
            this.field394 = var10.field394;
            var10.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(Z)Leb;")
    public Model method109(boolean arg0) {
        if (arg0) {
            this.field392 = -394;
        }
        return null;
    }
}
