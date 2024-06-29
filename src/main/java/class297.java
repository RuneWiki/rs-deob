import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class297 {

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ltba;")
    public static class165 field3910 = new class165(4);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(CI)Z")
    public static final boolean method1779(char arg0, int arg1) {
        field3909++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            int var2 = 41 % ((arg1 + 5) / 57);
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1780(int arg0) {
        field3910 = null;
        if (arg0 != 19897) {
            method1780(52);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
    public static final void method1781(boolean arg0, int arg1) {
        field3911++;
        int var2 = class180.field2530;
        int var3 = class232.field3055;
        if (arg1 != -127) {
            field3910 = null;
        }
        if (arg0 && class232.field3053) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class386.field4930.method468(var3, var2);
    }
}
