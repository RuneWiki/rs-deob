import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AYYYSATX")
public class TileUnderlay {

    @OriginalMember(owner = "client!AYYYSATX", name = "f", descriptor = "Z")
    public boolean field63 = true;

    @OriginalMember(owner = "client!AYYYSATX", name = "a", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!AYYYSATX", name = "b", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!AYYYSATX", name = "c", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!AYYYSATX", name = "d", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!AYYYSATX", name = "e", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!AYYYSATX", name = "g", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!AYYYSATX", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field58 = arg0;
        this.field59 = arg1;
        this.field60 = arg2;
        this.field61 = arg3;
        this.field62 = arg4;
        this.field64 = arg5;
        this.field63 = arg6;
    }
}
