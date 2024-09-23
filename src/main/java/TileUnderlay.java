import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XPBACSMK")
public class TileUnderlay {

    @OriginalMember(owner = "XPBACSMK", name = "f", descriptor = "Z")
    public boolean flat = true;

    @OriginalMember(owner = "XPBACSMK", name = "a", descriptor = "I")
    public int southwestColor;

    @OriginalMember(owner = "XPBACSMK", name = "b", descriptor = "I")
    public int southeastColor;

    @OriginalMember(owner = "XPBACSMK", name = "c", descriptor = "I")
    public int northeastColor;

    @OriginalMember(owner = "XPBACSMK", name = "d", descriptor = "I")
    public int northwestColor;

    @OriginalMember(owner = "XPBACSMK", name = "e", descriptor = "I")
    public int textureId;

    @OriginalMember(owner = "XPBACSMK", name = "g", descriptor = "I")
    public int rgb;

    @OriginalMember(owner = "XPBACSMK", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.southwestColor = arg0;
        this.southeastColor = arg1;
        this.northeastColor = arg2;
        this.northwestColor = arg3;
        this.textureId = arg4;
        this.rgb = arg5;
        this.flat = arg6;
    }
}
