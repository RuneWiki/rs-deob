import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "Lada;")
    public static class144 field106 = new class144(18, -1);

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "Lh;")
    public static class572 field108 = new class572("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "F")
    public static float field107;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "Lkda;")
    public static class328 field110;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIZBIIIII)Z")
    public static final boolean method50(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field104++;
        int var9 = class541.field8119.field1957[0];
        if (arg3 <= 110) {
            method51((byte) 64);
        }
        int var10 = class541.field8119.field1955[0];
        if (var9 < 0 || var9 >= class146.field2125 || var10 < 0 || class410.field5609 <= var10) {
            return false;
        } else if (arg0 >= 0 && class146.field2125 > arg0 && arg4 >= 0 && arg4 < class410.field5609) {
            int var11 = class245.method1555(arg8, arg4, arg7, arg0, var10, class394.field5418, arg5, 50, arg2, class127.field1774[class541.field8119.field8501], arg6, arg1, var9, class343.field4739, class541.field8119.method940(-1));
            if (var11 < 1) {
                return false;
            }
            class618.field9137 = class394.field5418[var11 - 1];
            class349.field4776 = class343.field4739[var11 - 1];
            class5.field45 = false;
            class169.method1204(-83);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static void method51(byte arg0) {
        field108 = null;
        field106 = null;
        int var1 = -83 % ((23 - arg0) / 62);
        field110 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIIIIIZII)Z")
    public static final boolean method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field105++;
        if (!arg6) {
            return true;
        } else if (arg2 < arg1 + arg7 && (arg2 + arg8) > arg1) {
            return arg3 < arg4 + arg5 && (arg0 + arg3) > arg5;
        } else {
            return false;
        }
    }
}
