import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class467 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field6935 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    public static int[] field6937;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method2850(byte arg0) {
        field6937 = null;
        int var1 = 52 / ((8 - arg0) / 53);
        field6935 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z")
    public static final boolean method2851(int arg0, int arg1, int arg2) {
        field6936++;
        if (arg1 != 55) {
            method2850((byte) 25);
        }
        if (((arg0 & 0x10000) != 0 | class151.method905(arg2, arg0, 32210)) || class493.method2980(arg1 - 25, arg2, arg0)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class371.method2198(arg0, arg2, 45056);
        }
    }
}
