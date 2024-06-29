import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class263 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
    public static int[] field3858 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public int field3857;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lwja;")
    public static class280 field3855;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIII)Z", line = 5)
    public static final boolean method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3854++;
        if (!class682.method3857(1, arg4, arg6, arg3)) {
            return false;
        }
        int var10 = class520.field7342[1];
        if (arg7 > -23) {
            return true;
        }
        int var11 = class520.field7342[2];
        int var12 = class520.field7342[0];
        if (!class682.method3857(1, arg5, arg0, arg8)) {
            return false;
        }
        int var13 = class520.field7342[0];
        int var14 = class520.field7342[2];
        int var15 = class520.field7342[1];
        if (class682.method3857(1, arg9, arg2, arg1)) {
            int var16 = class520.field7342[0];
            int var17 = class520.field7342[2];
            int var18 = class520.field7342[1];
            return class456.method2718(var11, var17, var16, var13, var14, var10, (byte) 36, var12, var15, var18);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 39)
    public static void method1707(byte arg0) {
        if (arg0 != 50) {
            field3858 = null;
        }
        field3855 = null;
        field3858 = null;
    }
}
