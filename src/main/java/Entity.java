import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    private int field390 = 772;

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    public int field392 = 1000;

    @OriginalMember(owner = "x", name = "l", descriptor = "Z")
    public static boolean field393;

    @OriginalMember(owner = "x", name = "j", descriptor = "[Ln;")
    public VertexNormal[] field391;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIIIIIIII)V")
    public void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method109(-37770);
        if (var10 != null) {
            this.field392 = var10.field392;
            var10.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(I)Leb;")
    public Model method109(int arg0) {
        if (arg0 != -37770) {
            this.field390 = 414;
        }
        return null;
    }
}
