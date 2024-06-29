import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class566 {

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "Ltha;")
    public class372 field7848 = class432.field6028;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "Ljt;")
    public class38 field7845;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "Lkfa;")
    public class386 field7844;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "Z")
    public boolean field7846;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "Liv;")
    public class25 field7847;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ltha;B)V", line = 9)
    public void method1121(class372 arg0, byte arg1) {
        this.field7848 = arg0;
        if (arg1 != 66) {
            this.field7845 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lkfa;Liv;Ljt;ZI)V", line = 21)
    public class566(class386 arg0, class25 arg1, class38 arg2, boolean arg3, int arg4) {
        this.field7845 = arg2;
        this.field7844 = arg0;
        this.field7846 = arg3;
        this.field7847 = arg1;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1211(byte arg0);
}
