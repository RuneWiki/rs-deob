import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("p")
public class TileUnderlay {

    @OriginalMember(owner = "p", name = "f", descriptor = "Z")
    public boolean field251 = true;

    @OriginalMember(owner = "p", name = "a", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "p", name = "b", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "p", name = "c", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "p", name = "d", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "p", name = "e", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "p", name = "g", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "p", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field246 = arg0;
        this.field247 = arg1;
        this.field248 = arg2;
        this.field249 = arg3;
        this.field250 = arg4;
        this.field252 = arg5;
        this.field251 = arg6;
    }
}
