import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class class385 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lcba;")
    public class516 field5123 = class708.field9922;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Z")
    public boolean field5126;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Lhi;")
    public class193 field5124;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Lne;")
    public class294 field5122;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lss;")
    public class401 field5125;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lcba;I)V")
    public void method166(class516 arg0, int arg1) {
        if (arg1 != 7651) {
            this.field5123 = null;
        }
        this.field5123 = arg0;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method167(int arg0);

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lss;Lhi;Lne;ZI)V")
    public class385(class401 arg0, class193 arg1, class294 arg2, boolean arg3, int arg4) {
        this.field5126 = arg3;
        this.field5124 = arg1;
        this.field5122 = arg2;
        this.field5125 = arg0;
    }
}
