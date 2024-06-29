import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class144 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Ljk;", line = 8)
    public static final class659 method1022(byte arg0, int arg1) {
        field2108++;
        class659 var2 = (class659) class454.field6365.method3742((byte) 67, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class157.field2529.method4339(arg1, 0, 0);
        class659 var4 = new class659();
        int var5 = -80 / ((-arg0 - 43) / 61);
        if (var3 != null) {
            var4.method3764((byte) -52, new class494(var3), arg1);
        }
        class454.field6365.method3739((long) arg1, (byte) 87, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IC)Z", line = 31)
    public static final boolean method1023(int arg0, char arg1) {
        field2109++;
        if (arg0 != -10520) {
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
