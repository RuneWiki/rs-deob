import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NDUHNYJR")
public class class42 extends class53 {

    @OriginalMember(owner = "NDUHNYJR", name = "l", descriptor = "I")
    private int field1136 = 41041;

    @OriginalMember(owner = "NDUHNYJR", name = "m", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "NDUHNYJR", name = "n", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "NDUHNYJR", name = "a", descriptor = "(Z)LITSMSHJO;")
    public final class27 method2(boolean arg0) {
        if (!arg0) {
            this.field1136 = -431;
        }
        class57 var2 = class57.method437(this.field1137);
        return var2.method433(this.field1138);
    }
}
