import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class498 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lgu;")
    public class126 field6937 = class96.field1289;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Luda;")
    public class509 field6941;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lhv;")
    public class188 field6940;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lsb;")
    public class280 field6939;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Z")
    public boolean field6938;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lgu;I)V")
    public void method49(class126 arg0, int arg1) {
        if (arg1 != 27754) {
            this.field6937 = null;
        }
        this.field6937 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1127(int arg0);

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lhv;Luda;Lsb;ZI)V")
    public class498(class188 arg0, class509 arg1, class280 arg2, boolean arg3, int arg4) {
        this.field6941 = arg1;
        this.field6940 = arg0;
        this.field6939 = arg2;
        this.field6938 = arg3;
    }
}
