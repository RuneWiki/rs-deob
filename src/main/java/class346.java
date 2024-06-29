import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class346 {

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lup;")
    public class249 field4516 = class17.field146;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lnb;")
    public class271 field4514;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "Lgb;")
    public class197 field4512;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lvj;")
    public class402 field4515;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Z")
    public boolean field4513;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILup;)V", line = 5)
    public void method842(int arg0, class249 arg1) {
        this.field4516 = arg1;
        if (arg0 != 16327) {
            this.field4515 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgb;Lvj;Lnb;ZI)V", line = 21)
    public class346(class197 arg0, class402 arg1, class271 arg2, boolean arg3, int arg4) {
        this.field4514 = arg2;
        this.field4512 = arg0;
        this.field4515 = arg1;
        this.field4513 = arg3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1900(byte arg0);
}
