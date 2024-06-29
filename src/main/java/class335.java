import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class335 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lcr;")
    public class597 field4989 = class480.field6804;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lki;")
    public class735 field4987;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
    public boolean field4990;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Lkn;")
    public class770 field4988;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lofa;")
    public class345 field4991;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lcr;Z)V", line = 5)
    public void method2161(class597 arg0, boolean arg1) {
        this.field4989 = arg0;
        if (arg1) {
            this.method2161(null, true);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lki;Lofa;Lkn;ZI)V", line = 21)
    public class335(class735 arg0, class345 arg1, class770 arg2, boolean arg3, int arg4) {
        this.field4987 = arg0;
        this.field4990 = arg3;
        this.field4988 = arg2;
        this.field4991 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2162(int arg0);
}
