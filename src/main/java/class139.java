import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class139 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lria;")
    public class287 field2310 = class545.field7515;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lbaa;")
    public class523 field2311;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lbfa;")
    public class370 field2309;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Z")
    public boolean field2308;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lwq;")
    public class169 field2312;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lria;I)V")
    public void method376(class287 arg0, int arg1) {
        this.field2310 = arg0;
        if (arg1 != -22095) {
            this.method376(null, -80);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method375(int arg0);

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lbfa;Lwq;Lbaa;ZI)V")
    public class139(class370 arg0, class169 arg1, class523 arg2, boolean arg3, int arg4) {
        this.field2311 = arg2;
        this.field2309 = arg0;
        this.field2308 = arg3;
        this.field2312 = arg1;
    }
}
