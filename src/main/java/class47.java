import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RQFEYKNL")
public class class47 extends class50 {

    @OriginalMember(owner = "client!RQFEYKNL", name = "n", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!RQFEYKNL", name = "o", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!RQFEYKNL", name = "a", descriptor = "(I)LJUQSYEMB;")
    public final class22 method167(int arg0) {
        class58 var2 = class58.method520(this.field1195);
        int var3 = 51 / arg0;
        return var2.method515(this.field1194);
    }
}
