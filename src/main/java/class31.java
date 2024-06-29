import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class class31 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "Lqo;")
    public class22 field354 = class523.field7453;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "Lwd;")
    public class272 field357;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "Z")
    public boolean field358;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Lhl;")
    public class527 field355;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "Ljm;")
    public class687 field356;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method154(boolean arg0);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lqo;I)V")
    public void method155(class22 arg0, int arg1) {
        this.field354 = arg0;
        if (arg1 != -25446) {
            this.method154(false);
        }
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lhl;Lwd;Ljm;ZI)V")
    public class31(class527 arg0, class272 arg1, class687 arg2, boolean arg3, int arg4) {
        this.field357 = arg1;
        this.field358 = arg3;
        this.field355 = arg0;
        this.field356 = arg2;
    }
}
