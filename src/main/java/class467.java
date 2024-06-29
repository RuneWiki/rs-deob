import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class467 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lkha;")
    public class584 field6416 = class475.field6514;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lqda;")
    public class105 field6420;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Z")
    public boolean field6417;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lmh;")
    public class632 field6418;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lns;")
    public class408 field6419;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILkha;)V")
    public void method340(int arg0, class584 arg1) {
        if (arg0 != -9495) {
            this.method535(-28);
        }
        this.field6416 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method535(int arg0);

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lmh;Lqda;Lns;ZI)V")
    public class467(class632 arg0, class105 arg1, class408 arg2, boolean arg3, int arg4) {
        this.field6420 = arg1;
        this.field6417 = arg3;
        this.field6418 = arg0;
        this.field6419 = arg2;
    }
}
