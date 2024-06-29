import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class604 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field8405 = 0;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lha;")
    public class54 field8406;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lda;")
    public class55 field8408;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
    public static final int method3397(int arg0, int arg1, int arg2) {
        field8407++;
        if (~arg1 == arg0) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Z")
    public static final boolean method3398(int arg0, int arg1, int arg2) {
        field8409++;
        if ((class91.method662(-2, arg0, arg2) | (arg2 & 0x10000) != 0) || class306.method1857(arg0, arg2, 0)) {
            return true;
        } else {
            if (arg1 != -20448) {
                field8405 = 15;
            }
            return (arg0 & 0x37) == 0 && class66.method559(arg2, arg0, false);
        }
    }
}
