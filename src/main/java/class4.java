import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BINNTJRP")
public class class4 extends class57 {

    @OriginalMember(owner = "client!BINNTJRP", name = "n", descriptor = "Z")
    private boolean field34 = true;

    @OriginalMember(owner = "client!BINNTJRP", name = "m", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!BINNTJRP", name = "o", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!BINNTJRP", name = "a", descriptor = "(Z)LPOJFANDE;")
    public final class43 method54(boolean arg0) {
        if (!arg0) {
            this.field34 = !this.field34;
        }
        class22 var2 = class22.method290(this.field35);
        return var2.method297(this.field33);
    }
}
