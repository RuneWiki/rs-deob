import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("o")
public class TileUnderlay {

    @OriginalMember(owner = "o", name = "f", descriptor = "Z")
    public boolean field250 = true;

    @OriginalMember(owner = "o", name = "a", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "o", name = "b", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "o", name = "c", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "o", name = "d", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "o", name = "e", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "o", name = "g", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "o", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field245 = arg0;
        this.field246 = arg1;
        this.field247 = arg2;
        this.field248 = arg3;
        this.field249 = arg4;
        this.field251 = arg5;
        this.field250 = arg6;
    }
}
