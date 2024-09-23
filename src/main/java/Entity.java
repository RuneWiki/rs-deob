import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XHHRODPC")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "XHHRODPC", name = "i", descriptor = "I")
    private int _flowObfuscator4 = 923;

    @OriginalMember(owner = "XHHRODPC", name = "k", descriptor = "I")
    public int minY = 1000;

    @OriginalMember(owner = "XHHRODPC", name = "l", descriptor = "Z")
    public static boolean _flowObfuscator5;

    @OriginalMember(owner = "XHHRODPC", name = "j", descriptor = "[LRJXWGZGD;")
    public VertexNormal[] vertexNormal;

    @OriginalMember(owner = "XHHRODPC", name = "a", descriptor = "(IIIIIIIII)V")
    public void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.getModel(4016);
        if (var10 != null) {
            this.minY = var10.minY;
            var10.draw(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "XHHRODPC", name = "a", descriptor = "(I)LZKARKDQW;")
    public Model getModel(int arg0) {
        if (arg0 != 4016) {
            this._flowObfuscator4 = -185;
        }
        return null;
    }
}
