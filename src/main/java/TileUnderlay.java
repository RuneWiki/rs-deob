import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class TileUnderlay {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
    public boolean field257 = true;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field252 = arg0;
        this.field253 = arg1;
        this.field254 = arg2;
        this.field255 = arg3;
        this.field256 = arg4;
        this.field258 = arg5;
        this.field257 = arg6;
    }
}
