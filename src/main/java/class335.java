import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class335 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Llba;")
    public class477 field4808 = class450.field6724;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lrca;")
    public class391 field4806;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Z")
    public boolean field4809;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lvt;")
    public class256 field4805;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lkp;")
    public class421 field4807;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Llba;I)V")
    public void method154(class477 arg0, int arg1) {
        this.field4808 = arg0;
        if (arg1 != -8457) {
            this.method153(108);
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method153(int arg0);

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lrca;Lkp;Lvt;ZI)V")
    public class335(class391 arg0, class421 arg1, class256 arg2, boolean arg3, int arg4) {
        this.field4806 = arg0;
        this.field4809 = arg3;
        this.field4805 = arg2;
        this.field4807 = arg1;
    }
}
