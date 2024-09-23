import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XVTADERI")
public class class65 extends class1 {

    @OriginalMember(owner = "XVTADERI", name = "l", descriptor = "I")
    private int field1489 = -929;

    @OriginalMember(owner = "XVTADERI", name = "k", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "XVTADERI", name = "m", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "XVTADERI", name = "a", descriptor = "(Z)LYYHPBDED;")
    public final class70 method2(boolean arg0) {
        class3 var2 = class3.method13(this.field1490);
        if (!arg0) {
            this.field1489 = 303;
        }
        return var2.method16(this.field1488);
    }
}
