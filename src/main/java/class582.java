import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class582 {

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "Ldj;")
    public class197 field8272 = class377.field5117;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lrt;")
    public class179 field8275;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lsq;")
    public class485 field8273;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "Leda;")
    public class561 field8274;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "Z")
    public boolean field8271;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ldj;B)V", line = 7)
    public void method2077(class197 arg0, byte arg1) {
        this.field8272 = arg0;
        if (arg1 != 93) {
            this.method2077(null, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Leda;Lsq;Lrt;ZI)V", line = 20)
    public class582(class561 arg0, class485 arg1, class179 arg2, boolean arg3, int arg4) {
        this.field8275 = arg2;
        this.field8273 = arg1;
        this.field8274 = arg0;
        this.field8271 = arg3;
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2075(int arg0);
}
