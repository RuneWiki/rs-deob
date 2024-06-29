import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class669 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Llda;")
    public class485 field9088 = class601.field8433;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
    public boolean field9087;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lbda;")
    public class505 field9089;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Ltg;")
    public class229 field9086;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lwt;")
    public class309 field9090;

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ltg;Lbda;Lwt;ZI)V", line = 21)
    public class669(class229 arg0, class505 arg1, class309 arg2, boolean arg3, int arg4) {
        this.field9087 = arg3;
        this.field9089 = arg1;
        this.field9086 = arg0;
        this.field9090 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Llda;I)V", line = 12)
    public void method81(class485 arg0, int arg1) {
        this.field9088 = arg0;
        if (arg1 != -21969) {
            this.method1787(-39);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1787(int arg0);
}
