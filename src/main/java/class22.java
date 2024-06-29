import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GXJXRNJQ")
public class class22 extends class56 {

    @OriginalMember(owner = "client!GXJXRNJQ", name = "n", descriptor = "Z")
    private boolean field785 = false;

    @OriginalMember(owner = "client!GXJXRNJQ", name = "m", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!GXJXRNJQ", name = "o", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!GXJXRNJQ", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public final class29 method214(byte arg0) {
        class27 var2 = class27.method285(this.field784);
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            this.field785 = !this.field785;
        }
        return var2.method291(this.field786);
    }
}
