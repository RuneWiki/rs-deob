import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    public int field399 = 1000;

    @OriginalMember(owner = "x", name = "l", descriptor = "Z")
    public static boolean field400;

    @OriginalMember(owner = "x", name = "j", descriptor = "[Ln;")
    public VertexNormal[] field398;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIIIIIIII)V")
    public void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method109(-47094);
        if (var10 != null) {
            this.field399 = var10.field399;
            var10.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(I)Leb;")
    public Model method109(int arg0) {
        if (arg0 != -47094) {
            throw new NullPointerException();
        }
        return null;
    }
}
