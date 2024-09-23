import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("n")
public class TileUnderlay {

    @OriginalMember(owner = "n", name = "f", descriptor = "Z")
    public boolean field170 = true;

    @OriginalMember(owner = "n", name = "a", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "n", name = "b", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "n", name = "c", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "n", name = "d", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "n", name = "e", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "n", name = "g", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "n", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field165 = arg0;
        this.field166 = arg1;
        this.field167 = arg2;
        this.field168 = arg3;
        this.field169 = arg4;
        this.field171 = arg5;
        this.field170 = arg6;
    }
}
