import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class461 {

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Ldca;")
    public class160 field6356 = class544.field7382;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljg;")
    public class309 field6354;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lega;")
    public class662 field6355;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lpn;")
    public class692 field6353;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
    public boolean field6357;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldca;B)V")
    public void method1259(class160 arg0, byte arg1) {
        if (arg1 < 66) {
            this.field6355 = null;
        }
        this.field6356 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2393(byte arg0);

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lega;Lpn;Ljg;ZI)V")
    public class461(class662 arg0, class692 arg1, class309 arg2, boolean arg3, int arg4) {
        this.field6354 = arg2;
        this.field6355 = arg0;
        this.field6353 = arg1;
        this.field6357 = arg3;
    }
}
