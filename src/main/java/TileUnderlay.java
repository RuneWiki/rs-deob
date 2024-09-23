import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("p")
public class TileUnderlay {

    @OriginalMember(owner = "p", name = "f", descriptor = "Z")
    public boolean field264 = true;

    @OriginalMember(owner = "p", name = "a", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "p", name = "b", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "p", name = "c", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "p", name = "d", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "p", name = "e", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "p", name = "g", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "p", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field259 = arg0;
        this.field260 = arg1;
        this.field261 = arg2;
        this.field262 = arg3;
        this.field263 = arg4;
        this.field265 = arg5;
        this.field264 = arg6;
    }
}
