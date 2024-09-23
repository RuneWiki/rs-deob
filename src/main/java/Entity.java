import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "y", name = "i", descriptor = "I")
    private int field404 = 256;

    @OriginalMember(owner = "y", name = "k", descriptor = "I")
    public int field406 = 1000;

    @OriginalMember(owner = "y", name = "l", descriptor = "Z")
    public static boolean field407;

    @OriginalMember(owner = "y", name = "j", descriptor = "[Lo;")
    public VertexNormal[] field405;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IIIIIIIII)V")
    public void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method123(45160);
        if (var10 != null) {
            this.field406 = var10.field406;
            var10.method122(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Lfb;")
    public Model method123(int arg0) {
        if (arg0 != 45160) {
            this.field404 = 422;
        }
        return null;
    }
}
