import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "y", name = "j", descriptor = "I")
    public int field422 = 1000;

    @OriginalMember(owner = "y", name = "k", descriptor = "Z")
    public static boolean field423;

    @OriginalMember(owner = "y", name = "i", descriptor = "[Lo;")
    public VertexNormal[] field421;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IIIIIIIII)V")
    public void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method123((byte) 8);
        if (var10 != null) {
            this.field422 = var10.field422;
            var10.method122(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(B)Lfb;")
    public Model method123(byte arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
