import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class608 {

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLrca;)Z")
    public static final boolean method3421(byte arg0, class457 arg1) {
        if (arg0 != 90) {
            method3421((byte) -32, null);
        }
        field8443++;
        class543 var2 = client.field3995.method3384(arg1.method745((byte) -119), false);
        if (var2.field7512 == -1) {
            return true;
        } else {
            class12 var3 = class52.field741.method589(arg0 - 32762, var2.field7512);
            return var3.field146 == -1 ? true : var3.method72(arg0 + 12197);
        }
    }
}
