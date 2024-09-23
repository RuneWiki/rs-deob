import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("o")
public class TileUnderlay {

    @OriginalMember(owner = "o", name = "f", descriptor = "Z")
    public boolean field253 = true;

    @OriginalMember(owner = "o", name = "a", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "o", name = "b", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "o", name = "c", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "o", name = "d", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "o", name = "e", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "o", name = "g", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "o", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field248 = arg0;
        this.field249 = arg1;
        this.field250 = arg2;
        this.field251 = arg3;
        this.field252 = arg4;
        this.field254 = arg5;
        this.field253 = arg6;
    }
}
