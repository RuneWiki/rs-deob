import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "y", name = "j", descriptor = "I")
    public int field400 = 1000;

    @OriginalMember(owner = "y", name = "k", descriptor = "Z")
    public static boolean field401;

    @OriginalMember(owner = "y", name = "i", descriptor = "[Lo;")
    public VertexNormal[] field399;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IIIIIIIII)V")
    public void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method122(5560);
        if (var10 != null) {
            this.field400 = var10.field400;
            var10.method121(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Lfb;")
    public Model method122(int arg0) {
        if (arg0 != 5560) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
