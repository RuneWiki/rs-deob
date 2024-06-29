import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class3 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field38 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lub;")
    public static class227 field35 = class257.method1749("(U0a )2 non)2existant gosub script)2num: ", 17263);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method9(int arg0) {
        field35 = null;
        int var1 = 46 % ((-arg0 - 75) / 47);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)I")
    public static final int method10(int arg0, int arg1, byte arg2) {
        field36++;
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
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (arg2 < 108) {
                return -46;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
