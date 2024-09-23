import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "x", name = "j", descriptor = "Z")
    private boolean field390 = true;

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    private int field391 = 462;

    @OriginalMember(owner = "x", name = "m", descriptor = "I")
    public int field393 = 1000;

    @OriginalMember(owner = "x", name = "n", descriptor = "Z")
    public static boolean field394;

    @OriginalMember(owner = "x", name = "l", descriptor = "[Ln;")
    public VertexNormal[] field392;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIIIIIIII)V")
    public void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method109(true);
        if (var10 != null) {
            this.field393 = var10.field393;
            var10.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(Z)Leb;")
    public Model method109(boolean arg0) {
        if (!arg0) {
            this.field391 = 28;
        }
        return null;
    }
}
