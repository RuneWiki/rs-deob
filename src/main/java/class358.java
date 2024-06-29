import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class class358 {

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lwga;")
    public class779 field5240 = class503.field6966;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lig;")
    public class258 field5238;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lsw;")
    public class787 field5241;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Z")
    public boolean field5239;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lrja;")
    public class115 field5242;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILwga;)V", line = 9)
    public void method1003(int arg0, class779 arg1) {
        this.field5240 = arg1;
        if (arg0 >= -104) {
            this.field5240 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lrja;Lsw;Lig;ZI)V", line = 21)
    public class358(class115 arg0, class787 arg1, class258 arg2, boolean arg3, int arg4) {
        this.field5238 = arg2;
        this.field5241 = arg1;
        this.field5239 = arg3;
        this.field5242 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2252(int arg0);
}
