import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class430 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Ldca;")
    public class161 field6546 = class379.field5910;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Los;")
    public class408 field6549;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lto;")
    public class8 field6547;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lmg;")
    public class134 field6548;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
    public boolean field6550;

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lto;Los;Lmg;ZI)V", line = 11)
    public class430(class8 arg0, class408 arg1, class134 arg2, boolean arg3, int arg4) {
        this.field6549 = arg1;
        this.field6547 = arg0;
        this.field6548 = arg2;
        this.field6550 = arg3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ldca;B)V", line = 23)
    public void method246(class161 arg0, byte arg1) {
        this.field6546 = arg0;
        int var3 = 83 % ((64 - arg1) / 39);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method575(byte arg0);
}
