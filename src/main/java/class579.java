import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class579 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field7916 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lvm;")
    public static class422 field7919;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(CB)Z")
    public static final boolean method3194(char arg0, byte arg1) {
        field7917++;
        if (arg1 == 8) {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method3195(byte arg0) {
        if (arg0 != 38) {
            method3195((byte) -38);
        }
        field7919 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
    public static final int method3196(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 11336) {
            return 28;
        }
        int var4 = arg3 & 0x3;
        field7918++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }
}
