import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class44 {

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Lnd;")
    public class545 field478 = class705.field9884;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Z")
    public boolean field475;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Lkq;")
    public class594 field477;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lbea;")
    public class225 field476;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "Lkt;")
    public class159 field479;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method271(byte arg0);

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lbea;Lkt;Lkq;ZI)V")
    public class44(class225 arg0, class159 arg1, class594 arg2, boolean arg3, int arg4) {
        this.field475 = arg3;
        this.field477 = arg2;
        this.field476 = arg0;
        this.field479 = arg1;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLnd;)V")
    public void method272(byte arg0, class545 arg1) {
        this.field478 = arg1;
        if (arg0 != -81) {
            this.field476 = null;
        }
    }
}
