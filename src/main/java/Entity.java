import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "y", name = "h", descriptor = "I")
    private int field408 = -39370;

    @OriginalMember(owner = "y", name = "j", descriptor = "I")
    public int field410 = 1000;

    @OriginalMember(owner = "y", name = "k", descriptor = "Z")
    public static boolean field411;

    @OriginalMember(owner = "y", name = "i", descriptor = "[Lo;")
    public VertexNormal[] field409;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IIIIIIIII)V")
    public void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method122(-13634);
        if (var10 != null) {
            this.field410 = var10.field410;
            var10.method121(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Lfb;")
    public Model method122(int arg0) {
        if (arg0 != -13634) {
            this.field408 = -160;
        }
        return null;
    }
}
