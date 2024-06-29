import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class371 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lqt;")
    public class525 field4539 = class212.field2911;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
    public boolean field4542;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ltn;")
    public class749 field4540;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lds;")
    public class73 field4543;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lcka;")
    public class248 field4541;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLqt;)V", line = 6)
    public void method774(byte arg0, class525 arg1) {
        int var3 = 96 / ((arg0 + 66) / 35);
        this.field4539 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lcka;Ltn;Lds;ZI)V", line = 20)
    public class371(class248 arg0, class749 arg1, class73 arg2, boolean arg3, int arg4) {
        this.field4542 = arg3;
        this.field4540 = arg1;
        this.field4543 = arg2;
        this.field4541 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method2125(byte arg0);
}
