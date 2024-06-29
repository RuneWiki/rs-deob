import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class221 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Ltd;")
    public class691 field2867 = class627.field8525;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lnl;")
    public class50 field2868;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Leea;")
    public class680 field2870;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lui;")
    public class130 field2866;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    public boolean field2869;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ltd;B)V", line = 7)
    public void method172(class691 arg0, byte arg1) {
        int var3 = -113 / ((arg1 - 2) / 53);
        this.field2867 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lui;Lnl;Leea;ZI)V", line = 20)
    public class221(class130 arg0, class50 arg1, class680 arg2, boolean arg3, int arg4) {
        this.field2868 = arg1;
        this.field2870 = arg2;
        this.field2866 = arg0;
        this.field2869 = arg3;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method165(int arg0);
}
