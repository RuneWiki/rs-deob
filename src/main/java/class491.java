import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class491 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lse;")
    public class267 field7400 = class585.field8484;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Ldn;")
    public class544 field7401;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Ler;")
    public class113 field7398;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lua;")
    public class696 field7402;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
    public boolean field7399;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILse;)V")
    public void method1170(int arg0, class267 arg1) {
        if (arg0 == 15249) {
            this.field7400 = arg1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1169(int arg0);

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ler;Lua;Ldn;ZI)V")
    public class491(class113 arg0, class696 arg1, class544 arg2, boolean arg3, int arg4) {
        this.field7401 = arg2;
        this.field7398 = arg0;
        this.field7402 = arg1;
        this.field7399 = arg3;
    }
}
