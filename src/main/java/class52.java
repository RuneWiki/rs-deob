import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SXUWJAYK")
public class class52 extends class53 {

    @OriginalMember(owner = "client!SXUWJAYK", name = "k", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!SXUWJAYK", name = "l", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!SXUWJAYK", name = "a", descriptor = "(B)LCYPZUKMB;")
    public final class8 method2(byte arg0) {
        class60 var2 = class60.method554(this.field1433);
        if (arg0 != -99) {
            throw new NullPointerException();
        }
        return var2.method551(this.field1434);
    }
}
