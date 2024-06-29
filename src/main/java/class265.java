import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class265 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lcg;")
    public class140 field3354 = class223.field2980;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lwha;")
    public class285 field3350;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Let;")
    public class596 field3353;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lul;")
    public class574 field3351;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
    public boolean field3352;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILcg;)V", line = 10)
    public void method694(int arg0, class140 arg1) {
        if (arg0 != -21167) {
            this.field3351 = null;
        }
        this.field3354 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lul;Let;Lwha;ZI)V", line = 21)
    public class265(class574 arg0, class596 arg1, class285 arg2, boolean arg3, int arg4) {
        this.field3350 = arg2;
        this.field3353 = arg1;
        this.field3351 = arg0;
        this.field3352 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1454(int arg0);
}
