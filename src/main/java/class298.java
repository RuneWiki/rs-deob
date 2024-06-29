import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class298 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "Lgw;")
    public class155 field4453 = class34.field969;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Lhg;")
    public class644 field4455;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Z")
    public boolean field4456;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "Lfda;")
    public class294 field4454;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Lro;")
    public class2 field4457;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZLgw;)V")
    public void method774(boolean arg0, class155 arg1) {
        this.field4453 = arg1;
        if (!arg0) {
            this.method772((byte) 96);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method772(byte arg0);

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lhg;Lfda;Lro;ZI)V")
    public class298(class644 arg0, class294 arg1, class2 arg2, boolean arg3, int arg4) {
        this.field4455 = arg0;
        this.field4456 = arg3;
        this.field4454 = arg1;
        this.field4457 = arg2;
    }
}
