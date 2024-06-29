import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class681 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ltda;")
    public class663 field9446 = class399.field5476;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lbja;")
    public class34 field9449;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lvea;")
    public class288 field9448;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lta;")
    public class224 field9450;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    public boolean field9447;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2576(boolean arg0);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILtda;)V")
    public void method2563(int arg0, class663 arg1) {
        if (arg0 != -1764) {
            this.field9449 = null;
        }
        this.field9446 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lta;Lvea;Lbja;ZI)V")
    public class681(class224 arg0, class288 arg1, class34 arg2, boolean arg3, int arg4) {
        this.field9449 = arg2;
        this.field9448 = arg1;
        this.field9450 = arg0;
        this.field9447 = arg3;
    }
}
