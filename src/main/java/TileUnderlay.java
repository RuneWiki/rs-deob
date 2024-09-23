import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("o")
public class TileUnderlay {

    @OriginalMember(owner = "o", name = "f", descriptor = "Z")
    public boolean field184 = true;

    @OriginalMember(owner = "o", name = "a", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "o", name = "b", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "o", name = "c", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "o", name = "d", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "o", name = "e", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "o", name = "g", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "o", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field179 = arg0;
        this.field180 = arg1;
        this.field181 = arg2;
        this.field182 = arg3;
        this.field183 = arg4;
        this.field185 = arg5;
        this.field184 = arg6;
    }
}
