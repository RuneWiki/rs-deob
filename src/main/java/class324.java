import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class324 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lie;")
    public class6 field4108 = class178.field2158;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lg;")
    public class135 field4109;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Z")
    public boolean field4106;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lhg;")
    public class591 field4107;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lvp;")
    public class160 field4110;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILie;)V")
    public void method1272(int arg0, class6 arg1) {
        this.field4108 = arg1;
        if (arg0 != 13027) {
            this.method1273(-68);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1273(int arg0);

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lhg;Lg;Lvp;ZI)V")
    public class324(class591 arg0, class135 arg1, class160 arg2, boolean arg3, int arg4) {
        this.field4109 = arg1;
        this.field4106 = arg3;
        this.field4107 = arg0;
        this.field4110 = arg2;
    }
}
