import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class TileUnderlay {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
    public boolean field263 = true;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field258 = arg0;
        this.field259 = arg1;
        this.field260 = arg2;
        this.field261 = arg3;
        this.field262 = arg4;
        this.field264 = arg5;
        this.field263 = arg6;
    }
}
