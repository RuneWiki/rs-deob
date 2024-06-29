import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class413 {

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Lli;")
    public class451 field6088 = class643.field9328;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "Z")
    public boolean field6090;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Lpj;")
    public class157 field6091;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lsd;")
    public class103 field6087;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Leu;")
    public class505 field6089;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLli;)V", line = 5)
    public void method2776(boolean arg0, class451 arg1) {
        if (arg0) {
            this.field6088 = arg1;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lsd;Leu;Lpj;ZI)V", line = 21)
    public class413(class103 arg0, class505 arg1, class157 arg2, boolean arg3, int arg4) {
        this.field6090 = arg3;
        this.field6091 = arg2;
        this.field6087 = arg0;
        this.field6089 = arg1;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method3152(byte arg0);
}
