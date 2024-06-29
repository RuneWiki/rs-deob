import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class363 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lws;")
    public class379 field4946 = class782.field10751;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Laia;")
    public class242 field4942;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lso;")
    public class497 field4944;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lul;")
    public class599 field4945;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
    public boolean field4943;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2032(byte arg0);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lws;B)V")
    public void method2034(class379 arg0, byte arg1) {
        if (arg1 < 27) {
            this.method2034(null, (byte) 109);
        }
        this.field4946 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Laia;Lul;Lso;ZI)V")
    public class363(class242 arg0, class599 arg1, class497 arg2, boolean arg3, int arg4) {
        this.field4942 = arg0;
        this.field4944 = arg2;
        this.field4945 = arg1;
        this.field4943 = arg3;
    }
}
