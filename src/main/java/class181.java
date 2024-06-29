import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class181 {

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILgj;)Lnm;")
    public static final class500 method1356(int arg0, int arg1, class662 arg2) {
        if (arg1 != -1422) {
            method1356(81, 47, null);
        }
        field2836++;
        byte[] var3 = arg2.method3742(arg1 + 1427, arg0);
        return var3 == null ? null : new class500(var3);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIZ)I")
    public static final int method1357(int arg0, int arg1, boolean arg2) {
        field2833++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            if (arg2) {
                field2835 = -34;
            }
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
