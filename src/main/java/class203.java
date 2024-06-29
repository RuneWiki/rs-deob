import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class203 extends class507 {

    @OriginalMember(owner = "client!le", name = "u", descriptor = "[B")
    public byte[] field2689;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([B)V")
    public class203(byte[] arg0) {
        this.field2689 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1300(boolean arg0, char arg1) {
        field2688++;
        if (arg0) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }
}
