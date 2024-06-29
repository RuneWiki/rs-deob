import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class481 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lqaa;")
    public class26 field6699 = class81.field1132;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lps;")
    public class82 field6701;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Z")
    public boolean field6700;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lkf;")
    public class229 field6702;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lvg;")
    public class49 field6698;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLqaa;)V")
    public void method131(byte arg0, class26 arg1) {
        this.field6699 = arg1;
        if (arg0 < 24) {
            this.method131((byte) -5, null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method130(int arg0);

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lvg;Lkf;Lps;ZI)V")
    public class481(class49 arg0, class229 arg1, class82 arg2, boolean arg3, int arg4) {
        this.field6701 = arg2;
        this.field6700 = arg3;
        this.field6702 = arg1;
        this.field6698 = arg0;
    }
}
