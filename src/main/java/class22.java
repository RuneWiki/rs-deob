import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class22 {

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Lrha;")
    public class455 field256 = class362.field5131;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Ldr;")
    public class629 field254;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Llj;")
    public class8 field252;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lnea;")
    public class600 field255;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
    public boolean field253;

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Llj;Lnea;Ldr;ZI)V")
    public class22(class8 arg0, class600 arg1, class629 arg2, boolean arg3, int arg4) {
        this.field254 = arg2;
        this.field252 = arg0;
        this.field255 = arg1;
        this.field253 = arg3;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method210(byte arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILrha;)V")
    public void method211(int arg0, class455 arg1) {
        this.field256 = arg1;
        if (arg0 != 27691) {
            this.field253 = false;
        }
    }
}
