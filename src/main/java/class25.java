import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LBFKEYAG")
public class class25 extends class54 {

    @OriginalMember(owner = "LBFKEYAG", name = "l", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "LBFKEYAG", name = "m", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "LBFKEYAG", name = "a", descriptor = "(B)LCCYECDYX;")
    public final class4 method181(byte arg0) {
        class46 var2 = class46.method416(this.field972);
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return var2.method418(this.field971);
    }
}
