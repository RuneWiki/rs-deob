import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class class552 {

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "Lmv;")
    public class688 field7695 = class652.field9201;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Lgaa;")
    public class302 field7697;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Z")
    public boolean field7696;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Lec;")
    public class146 field7699;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lbt;")
    public class117 field7698;

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lgaa;Lec;Lbt;ZI)V", line = 21)
    public class552(class302 arg0, class146 arg1, class117 arg2, boolean arg3, int arg4) {
        this.field7697 = arg0;
        this.field7696 = arg3;
        this.field7699 = arg1;
        this.field7698 = arg2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lmv;I)V", line = 12)
    public void method521(class688 arg0, int arg1) {
        this.field7695 = arg0;
        if (arg1 != 15590) {
            this.method521(null, -51);
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method524(int arg0);
}
