import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class234 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lko;")
    public class531 field2782 = class140.field1751;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Ldw;")
    public class748 field2783;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Z")
    public boolean field2784;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lus;")
    public class1 field2785;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lpe;")
    public class636 field2786;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lko;I)V", line = 4)
    public void method1439(class531 arg0, int arg1) {
        this.field2782 = arg0;
        if (arg1 > -19) {
            this.field2782 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lus;Lpe;Ldw;ZI)V", line = 21)
    public class234(class1 arg0, class636 arg1, class748 arg2, boolean arg3, int arg4) {
        this.field2783 = arg2;
        this.field2784 = arg3;
        this.field2785 = arg0;
        this.field2786 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1440(boolean arg0);
}
