import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public abstract class class142 {

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "Lgv;")
    public class39 field1865 = class705.field9815;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Llj;")
    public class6 field1864;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Lmba;")
    public class70 field1866;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "Lpw;")
    public class89 field1867;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "Z")
    public boolean field1868;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1070(byte arg0);

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lgv;I)V")
    public void method1071(class39 arg0, int arg1) {
        if (arg1 != -30763) {
            this.field1865 = null;
        }
        this.field1865 = arg0;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lmba;Lpw;Llj;ZI)V")
    public class142(class70 arg0, class89 arg1, class6 arg2, boolean arg3, int arg4) {
        this.field1864 = arg2;
        this.field1866 = arg0;
        this.field1867 = arg1;
        this.field1868 = arg3;
    }
}
