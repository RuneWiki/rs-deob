import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class160 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Ldj;")
    public static class44 field2761 = class89.method650(255, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field2763 = -1;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lih;")
    public static class95 field2764 = new class95(50);

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lih;")
    public static class95 field2766 = new class95(500);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Ldj;")
    private static class44 field2767 = class89.method650(255, " is already on your friend list)3");

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Ldj;")
    public static class44 field2768 = field2767;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class237 var20 = new class237(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class32.field567[var21][arg1][arg2] == null) {
                    class32.field567[var21][arg1][arg2] = new class68(var21, arg1, arg2);
                }
            }
            class32.field567[arg0][arg1][arg2].field1313 = var20;
        } else if (arg3 == 1) {
            class237 var22 = new class237(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class32.field567[var23][arg1][arg2] == null) {
                    class32.field567[var23][arg1][arg2] = new class68(var23, arg1, arg2);
                }
            }
            class32.field567[arg0][arg1][arg2].field1313 = var22;
        } else {
            class26 var24 = new class26(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class32.field567[var25][arg1][arg2] == null) {
                    class32.field567[var25][arg1][arg2] = new class68(var25, arg1, arg2);
                }
            }
            class32.field567[arg0][arg1][arg2].field1301 = var24;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([BIIB)I")
    public static final int method1038(byte[] arg0, int arg1, int arg2, byte arg3) {
        field2762++;
        int var4 = -1;
        int var5 = arg2;
        if (arg3 < 57) {
            method1039(-32);
        }
        while (var5 < arg1) {
            var4 = var4 >>> 8 ^ class203.field3633[(arg0[var5] ^ var4) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2767 = null;
        if (arg0 >= 77) {
            field2761 = null;
            field2768 = null;
            field2764 = null;
            field2766 = null;
        }
    }
}
