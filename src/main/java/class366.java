import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class class366 {

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "Lcw;")
    public class144 field5265 = class109.field1320;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "Lpb;")
    public class2 field5267;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "Z")
    public boolean field5268;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "Lsga;")
    public class608 field5266;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "Loea;")
    public class612 field5269;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLcw;)V", line = 5)
    public void method280(byte arg0, class144 arg1) {
        int var3 = -123 / ((18 - arg0) / 60);
        this.field5265 = arg1;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lsga;Lpb;Loea;ZI)V", line = 20)
    public class366(class608 arg0, class2 arg1, class612 arg2, boolean arg3, int arg4) {
        this.field5267 = arg1;
        this.field5268 = arg3;
        this.field5266 = arg0;
        this.field5269 = arg2;
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method334(int arg0);
}
