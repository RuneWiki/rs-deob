import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class class111 {

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "Lfw;")
    public class52 field1427 = class151.field1872;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "Lkaa;")
    public class44 field1425;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Lfca;")
    public class75 field1429;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "Z")
    public boolean field1426;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Lbv;")
    public class279 field1428;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILfw;)V")
    public void method798(int arg0, class52 arg1) {
        if (arg0 != -13883) {
            this.method798(-83, null);
        }
        this.field1427 = arg1;
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method799(int arg0);

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lkaa;Lfca;Lbv;ZI)V")
    public class111(class44 arg0, class75 arg1, class279 arg2, boolean arg3, int arg4) {
        this.field1425 = arg0;
        this.field1429 = arg1;
        this.field1426 = arg3;
        this.field1428 = arg2;
    }
}
