import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class144 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Lkr;")
    public static class602 field2028 = new class602(48, 5);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method938(int arg0) {
        if (arg0 >= -50) {
            method938(40);
        }
        field2028 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIIILha;IIII[[[B)V")
    public static final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class548 arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field2029++;
        if (arg9 == 0 || arg5 == 0) {
            return;
        }
        if (arg9 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 10) {
            arg9 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        arg7.method1449(arg0, arg4, arg8, arg2, arg3, arg1, arg12[arg9 - 1][arg6], arg5, arg11);
        int var13 = -27 / ((58 - arg10) / 49);
    }
}
