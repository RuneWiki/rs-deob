import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class231 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lbba;")
    public class721 field3006 = class650.field8933;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lcu;")
    public class287 field3005;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Z")
    public boolean field3002;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Lem;")
    public class610 field3003;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lew;")
    public class240 field3004;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lbba;I)V", line = 9)
    public void method1466(class721 arg0, int arg1) {
        this.field3006 = arg0;
        if (arg1 != 13584) {
            this.method1465(91);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lcu;Lem;Lew;ZI)V", line = 21)
    public class231(class287 arg0, class610 arg1, class240 arg2, boolean arg3, int arg4) {
        this.field3005 = arg0;
        this.field3002 = arg3;
        this.field3003 = arg1;
        this.field3004 = arg2;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1465(int arg0);
}
