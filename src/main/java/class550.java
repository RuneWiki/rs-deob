import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class550 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lfj;")
    public class564 field7605 = class241.field3384;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Lge;")
    public class608 field7608;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
    public boolean field7607;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Lbv;")
    public class256 field7609;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Ldk;")
    public class435 field7606;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1481(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLfj;)V")
    public void method1483(boolean arg0, class564 arg1) {
        if (!arg0) {
            this.field7605 = arg1;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lbv;Ldk;Lge;ZI)V")
    public class550(class256 arg0, class435 arg1, class608 arg2, boolean arg3, int arg4) {
        this.field7608 = arg2;
        this.field7607 = arg3;
        this.field7609 = arg0;
        this.field7606 = arg1;
    }
}
