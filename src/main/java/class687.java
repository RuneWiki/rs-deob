import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public abstract class class687 {

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "Lgca;")
    public class206 field9694 = class397.field5910;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "Lal;")
    public class121 field9698;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Z")
    public boolean field9697;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Llw;")
    public class233 field9696;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Lhb;")
    public class585 field9695;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lgca;I)V")
    public void method204(class206 arg0, int arg1) {
        int var3 = 17 % ((arg1 + 2) / 39);
        this.field9694 = arg0;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1860(byte arg0);

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lhb;Llw;Lal;ZI)V")
    public class687(class585 arg0, class233 arg1, class121 arg2, boolean arg3, int arg4) {
        this.field9698 = arg2;
        this.field9697 = arg3;
        this.field9696 = arg1;
        this.field9695 = arg0;
    }
}
