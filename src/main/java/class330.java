import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public abstract class class330 {

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "Lag;")
    public class710 field4687 = class177.field2332;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Z")
    public boolean field4684;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lwj;")
    public class415 field4685;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Luda;")
    public class475 field4686;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lg;")
    public class166 field4683;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2137(boolean arg0);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLag;)V")
    public void method706(byte arg0, class710 arg1) {
        this.field4687 = arg1;
        if (arg0 > -74) {
            this.field4686 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Luda;Lg;Lwj;ZI)V")
    public class330(class475 arg0, class166 arg1, class415 arg2, boolean arg3, int arg4) {
        this.field4684 = arg3;
        this.field4685 = arg2;
        this.field4686 = arg0;
        this.field4683 = arg1;
    }
}
