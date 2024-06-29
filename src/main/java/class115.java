import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class115 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[Z")
    public static boolean[] field1908 = new boolean[100];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1909 = -1;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 3)
    public static void method851(int arg0) {
        field1908 = null;
        if (arg0 != -24138) {
            method852(72, -21, -81, 72, -37, -51);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)Z", line = 13)
    public static final boolean method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -2) {
            return true;
        }
        field1907++;
        for (int var6 = arg0; var6 <= arg2; var6++) {
            for (int var7 = arg3; var7 <= arg5; var7++) {
                if (class511.field7542[var6][var7] == arg1 && class54.field942[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I", line = 51)
    public static final int method853(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field1906++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 != 25) {
            field1909 = -102;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
