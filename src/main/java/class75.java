import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public abstract class class75 {

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "Lpw;")
    public class606 field1004 = class619.field9140;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Laq;")
    public class141 field1002;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "Lui;")
    public class194 field1006;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Lwda;")
    public class547 field1005;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "Z")
    public boolean field1003;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lpw;I)V", line = 8)
    public void method31(class606 arg0, int arg1) {
        if (arg1 == 29557) {
            this.field1004 = arg0;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lwda;Laq;Lui;ZI)V", line = 20)
    public class75(class547 arg0, class141 arg1, class194 arg2, boolean arg3, int arg4) {
        this.field1002 = arg1;
        this.field1006 = arg2;
        this.field1005 = arg0;
        this.field1003 = arg3;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method588(int arg0);
}
