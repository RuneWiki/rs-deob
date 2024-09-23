import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("p")
public class TileUnderlay {

    @OriginalMember(owner = "p", name = "f", descriptor = "Z")
    public boolean field255 = true;

    @OriginalMember(owner = "p", name = "a", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "p", name = "b", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "p", name = "c", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "p", name = "d", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "p", name = "e", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "p", name = "g", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "p", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field250 = arg0;
        this.field251 = arg1;
        this.field252 = arg2;
        this.field253 = arg3;
        this.field254 = arg4;
        this.field256 = arg5;
        this.field255 = arg6;
    }
}
