import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public abstract class class85 {

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Ltb;")
    public class657 field1187 = class48.field711;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "Z")
    public boolean field1183;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "Lkea;")
    public class77 field1186;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "Lkf;")
    public class720 field1184;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "Lrd;")
    public class549 field1185;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLtb;)V", line = 6)
    public void method521(byte arg0, class657 arg1) {
        this.field1187 = arg1;
        if (arg0 >= -65) {
            this.field1186 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lrd;Lkea;Lkf;ZI)V", line = 21)
    public class85(class549 arg0, class77 arg1, class720 arg2, boolean arg3, int arg4) {
        this.field1183 = arg3;
        this.field1186 = arg1;
        this.field1184 = arg2;
        this.field1185 = arg0;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method522(boolean arg0);
}
