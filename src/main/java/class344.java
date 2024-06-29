import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class344 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lnj;")
    public static class415 field4402 = new class415(78, 7);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method1982(int arg0) {
        if (arg0 != 78) {
            method1984(59, false, 36, -61, (byte) -24);
        }
        field4402 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IFFIIIILjr;F[BIFF)V")
    public static final void method1983(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, class288 arg7, float arg8, byte[] arg9, int arg10, float arg11, float arg12) {
        for (int var13 = 0; var13 < arg4; var13++) {
            class122.method903(arg10, arg0, var13, arg8, 118, arg12, arg1, arg11, arg2, arg7, arg4, arg6, arg9, arg3);
            arg6 += arg0 * arg10;
        }
        if (arg5 >= -6) {
            field4402 = null;
        }
        field4403++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZIIB)V")
    public static final void method1984(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field4401++;
        if (arg4 != 103) {
            field4402 = null;
        }
        if (class152.method1106(103, arg0)) {
            class64.method538(class322.field4179[arg0], (byte) -106, arg3, -1, arg2, arg1);
        }
    }
}
