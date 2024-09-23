import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("p")
public class TileUnderlay {

    @OriginalMember(owner = "p", name = "f", descriptor = "Z")
    public boolean field277 = true;

    @OriginalMember(owner = "p", name = "a", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "p", name = "b", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "p", name = "c", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "p", name = "d", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "p", name = "e", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "p", name = "g", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "p", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field272 = arg0;
        this.field273 = arg1;
        this.field274 = arg2;
        this.field275 = arg3;
        this.field276 = arg4;
        this.field278 = arg5;
        this.field277 = arg6;
    }
}
