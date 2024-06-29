import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class483 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lng;")
    public class219 field6728 = class266.field3443;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
    public boolean field6724;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lvea;")
    public class404 field6726;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lsk;")
    public class452 field6727;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lhb;")
    public class343 field6725;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILng;)V", line = 4)
    public void method390(int arg0, class219 arg1) {
        if (arg0 == 29613) {
            this.field6728 = arg1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lhb;Lsk;Lvea;ZI)V", line = 21)
    public class483(class343 arg0, class452 arg1, class404 arg2, boolean arg3, int arg4) {
        this.field6724 = arg3;
        this.field6726 = arg2;
        this.field6727 = arg1;
        this.field6725 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method388(int arg0);
}
