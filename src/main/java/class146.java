import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class146 {

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Lvq;")
    public static class433 field1895 = new class433();

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
    public static int[] field1896;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)Lck;")
    public static final class8 method798(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7896;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(III)Z")
    public static final boolean method799(int arg0, int arg1, int arg2) {
        field1894++;
        if (arg1 == 10754) {
            return (arg2 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
    public static void method800(boolean arg0) {
        field1896 = null;
        if (!arg0) {
            field1897 = 85;
        }
        field1895 = null;
    }
}
