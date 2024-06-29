import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class261 extends class30 {

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lld;")
    public class116 field3678;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lni;")
    public static class367 field3680 = new class367(34, -1);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILuu;II)Lnd;")
    public static final class387 method1690(int arg0, class191 arg1, int arg2, int arg3) {
        field3677++;
        byte[] var4 = arg1.method1281(arg2, arg3, 69);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                method1691(36);
            }
            return new class387(var4);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method1691(int arg0) {
        field3680 = null;
        if (arg0 != 0) {
            field3680 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIFFIIFIF[BFLag;II)V")
    public static final void method1692(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, float arg8, byte[] arg9, float arg10, class490 arg11, int arg12, int arg13) {
        field3679++;
        int var14 = arg1 * arg12;
        float[] var15 = new float[var14];
        if (arg13 != 2253) {
            field3680 = null;
        }
        for (int var16 = 0; var16 < arg7; var16++) {
            arg11.method2353(arg3 / (float) arg12, arg0, arg6 / (float) arg1, arg1, arg10 * 127.0F, var15, arg12, 24345, arg8 / (float) arg0, arg4, 0);
            int var19 = arg5;
            for (int var20 = 0; var20 < var14; var20++) {
                arg9[var19] = (byte) ((int) ((float) arg9[var19] + var15[var20]));
                var19++;
            }
            arg6 *= 2.0F;
            arg3 *= 2.0F;
            arg8 *= 2.0F;
            arg10 = arg2 * arg10;
        }
        int var17 = arg5;
        for (int var18 = 0; var18 < var14; var18++) {
            arg9[var17] = (byte) (arg9[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lnq;II[B)V")
    public class261(class325 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3678 = class194.method1312(arg1, 6406, 44, arg0, arg2, 6406, arg3, false);
        this.field3678.method229((byte) 77, false, false);
    }

    static {
        new class446(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
