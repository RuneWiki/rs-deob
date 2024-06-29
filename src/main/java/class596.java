import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class596 {

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lqt;")
    public class634 field8712 = class267.field3864;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Llt;")
    public class672 field8710;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lti;")
    public class438 field8713;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Z")
    public boolean field8709;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lkca;")
    public class82 field8711;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lqt;I)V")
    public void method979(class634 arg0, int arg1) {
        if (arg1 > -81) {
            this.method979(null, 70);
        }
        this.field8712 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method978(byte arg0);

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Llt;Lkca;Lti;ZI)V")
    public class596(class672 arg0, class82 arg1, class438 arg2, boolean arg3, int arg4) {
        this.field8710 = arg0;
        this.field8713 = arg2;
        this.field8709 = arg3;
        this.field8711 = arg1;
    }
}
