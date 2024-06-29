import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class491 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "Lej;")
    public class123 field7004 = class395.field5936;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "Z")
    public boolean field7005;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Lok;")
    public class256 field7006;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "Lfi;")
    public class558 field7008;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "Lpd;")
    public class259 field7007;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1401(byte arg0);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLej;)V")
    public void method1342(byte arg0, class123 arg1) {
        if (arg0 <= 33) {
            this.method1401((byte) -72);
        }
        this.field7004 = arg1;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lfi;Lpd;Lok;ZI)V")
    public class491(class558 arg0, class259 arg1, class256 arg2, boolean arg3, int arg4) {
        this.field7005 = arg3;
        this.field7006 = arg2;
        this.field7008 = arg0;
        this.field7007 = arg1;
    }
}
