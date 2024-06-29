import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class613 {

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "[I")
    public static int[] field8703 = new int[13];

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "Z")
    public static boolean field8705 = false;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Loo;")
    public static class12 field8701;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field8700;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "[[B")
    public static byte[][] field8704;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public static void method3537(byte arg0) {
        field8700 = null;
        field8701 = null;
        field8703 = null;
        field8704 = null;
        if (arg0 <= 92) {
            method3537((byte) 74);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method3538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field8702++;
        if (!class484.method2853(arg1, (byte) -99)) {
            return;
        }
        if (class556.field7720[arg1] == null) {
            client.method893(class610.field8661[arg1], -1, arg10, arg3, arg11, arg5, arg6, arg0, arg8, arg2, arg7, arg4);
        } else {
            client.method893(class556.field7720[arg1], -1, arg10, arg3, arg11, arg5, arg6, arg0, arg8, arg2, arg7, arg4);
        }
        if (arg9 != -1) {
            method3538(35, 20, -30, 20, 18, -97, -91, -4, -83, 76, -29, -5);
        }
    }
}
