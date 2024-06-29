import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class175 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lqq;")
    public class599 field2666 = class579.field8529;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Llc;")
    public class629 field2662;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lnca;")
    public class54 field2663;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Z")
    public boolean field2664;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljt;")
    public class489 field2665;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lqq;I)V", line = 8)
    public void method379(class599 arg0, int arg1) {
        this.field2666 = arg0;
        if (arg1 != 2068) {
            this.field2662 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lnca;Ljt;Llc;ZI)V", line = 21)
    public class175(class54 arg0, class489 arg1, class629 arg2, boolean arg3, int arg4) {
        this.field2662 = arg2;
        this.field2663 = arg0;
        this.field2664 = arg3;
        this.field2665 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1179(boolean arg0);
}
