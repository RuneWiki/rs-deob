import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class49 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Z")
    public static boolean field807 = false;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public static int[] field810 = new int[50];

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lwh;")
    public static class289 field809;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method376(byte arg0) {
        if (arg0 < -124) {
            field810 = null;
            field809 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIII)I")
    public static final int method377(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 73) {
            method377((byte) -82, 23, 25, -73);
        }
        field812++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
    public static final int method378(int arg0, int arg1, int arg2) {
        field808++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else if (arg1 == -15337) {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        } else {
            return -90;
        }
    }
}
