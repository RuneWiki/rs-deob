import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class class10 {

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "Lgaa;")
    public class267 field98 = class69.field1245;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Ltb;")
    public class364 field99;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "Lig;")
    public class218 field96;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "Z")
    public boolean field97;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Llca;")
    public class597 field95;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lgaa;I)V")
    public void method54(class267 arg0, int arg1) {
        this.field98 = arg0;
        if (arg1 != -26149) {
            this.method54(null, -93);
        }
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method55(int arg0);

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Ltb;Llca;Lig;ZI)V")
    public class10(class364 arg0, class597 arg1, class218 arg2, boolean arg3, int arg4) {
        this.field99 = arg0;
        this.field96 = arg2;
        this.field97 = arg3;
        this.field95 = arg1;
    }
}
