import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class283 {

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Lju;")
    public class115 field3588 = class396.field5036;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Ltga;")
    public class54 field3589;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lnh;")
    public class699 field3587;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Z")
    public boolean field3590;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Ljr;")
    public class100 field3586;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILju;)V", line = 8)
    public void method43(int arg0, class115 arg1) {
        this.field3588 = arg1;
        if (arg0 != -29198) {
            this.field3586 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ltga;Lnh;Ljr;ZI)V", line = 21)
    public class283(class54 arg0, class699 arg1, class100 arg2, boolean arg3, int arg4) {
        this.field3589 = arg0;
        this.field3587 = arg1;
        this.field3590 = arg3;
        this.field3586 = arg2;
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method33(int arg0);
}
