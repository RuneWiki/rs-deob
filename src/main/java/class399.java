import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class399 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Z")
    public static boolean field5871 = false;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Ldp;")
    public static class174 field5867;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I")
    public static final int method2543(int arg0, int arg1, int arg2) {
        if (arg2 != -5386) {
            method2544(50, (byte) -43, 67, -32, 63, 35, 68);
        }
        field5866++;
        int var3 = class277.method1980(arg1 - 1, 57, arg0 - 1) + class277.method1980(arg1 + 1, arg2 ^ 0xFFFFEACF, arg0 - 1) + (class277.method1980(arg1 - 1, 57, arg0 - -1) - -class277.method1980(arg1 + 1, 57, arg0 + 1));
        int var4 = class277.method1980(arg1 - 1, 57, arg0) + class277.method1980(arg1 + 1, 57, arg0) + (class277.method1980(arg1, arg2 ^ 0xFFFFEACF, arg0 + -1) - -class277.method1980(arg1, 57, arg0 - -1));
        int var5 = class277.method1980(arg1, arg2 ^ 0xFFFFEACF, arg0);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIIII)I")
    public static final int method2544(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5869++;
        int var7 = 27 % ((arg1 - 47) / 44);
        int var8 = arg4 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var9 = arg2;
            arg2 = arg5;
            arg5 = var9;
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 1 + 7 - arg2 - arg3;
        } else if (var8 == 2) {
            return 7 - (arg5 - 1) - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method2545(byte arg0) {
        field5867 = null;
        if (arg0 > -98) {
            field5870 = 32;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2546(int arg0, String arg1) {
        if (arg0 < 76) {
            method2545((byte) 75);
        }
        System.out.println("Error: " + class162.method1265(-1, "\n", "%0a", arg1));
        field5868++;
    }
}
