import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class439 {

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "Ltd;")
    public class457 field6469 = class350.field5072;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Lhh;")
    public class250 field6467;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "Los;")
    public class253 field6468;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "Lon;")
    public class496 field6471;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "Z")
    public boolean field6470;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ltd;I)V")
    public void method2250(class457 arg0, int arg1) {
        if (arg1 == 18475) {
            this.field6469 = arg0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2249(int arg0);

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Los;Lhh;Lon;ZI)V")
    public class439(class253 arg0, class250 arg1, class496 arg2, boolean arg3, int arg4) {
        this.field6467 = arg1;
        this.field6468 = arg0;
        this.field6471 = arg2;
        this.field6470 = arg3;
    }
}
