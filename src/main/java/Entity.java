import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "y", name = "h", descriptor = "Z")
    private boolean field396 = false;

    @OriginalMember(owner = "y", name = "j", descriptor = "I")
    public int field398 = 1000;

    @OriginalMember(owner = "y", name = "k", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "y", name = "i", descriptor = "[Lo;")
    public VertexNormal[] field397;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IIIIIIIII)V")
    public void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method121(false);
        if (var10 != null) {
            this.field398 = var10.field398;
            var10.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Lfb;")
    public Model method121(boolean arg0) {
        if (arg0) {
            this.field396 = !this.field396;
        }
        return null;
    }
}
