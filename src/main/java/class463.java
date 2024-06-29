import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class463 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Lem;")
    public class599 field6695 = class549.field7730;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lkl;")
    public class468 field6698;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lde;")
    public class15 field6696;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
    public boolean field6697;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lvt;")
    public class343 field6694;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1538(int arg0);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lem;I)V")
    public void method840(class599 arg0, int arg1) {
        int var3 = -105 / ((arg1 + 72) / 48);
        this.field6695 = arg0;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lde;Lkl;Lvt;ZI)V")
    public class463(class15 arg0, class468 arg1, class343 arg2, boolean arg3, int arg4) {
        this.field6698 = arg1;
        this.field6696 = arg0;
        this.field6697 = arg3;
        this.field6694 = arg2;
    }
}
