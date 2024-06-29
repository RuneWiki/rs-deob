import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class588 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Ltn;")
    public class166 field8581 = class484.field6901;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Loe;")
    public class13 field8582;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljb;")
    public class666 field8583;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lqda;")
    public class689 field8584;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Z")
    public boolean field8585;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLtn;)V")
    public void method394(byte arg0, class166 arg1) {
        if (arg0 < -92) {
            this.field8581 = arg1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method650(boolean arg0);

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Loe;Ljb;Lqda;ZI)V")
    public class588(class13 arg0, class666 arg1, class689 arg2, boolean arg3, int arg4) {
        this.field8582 = arg0;
        this.field8583 = arg1;
        this.field8584 = arg2;
        this.field8585 = arg3;
    }
}
