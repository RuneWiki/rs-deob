import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class34 {

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lvg;")
    public static class55 field541 = new class55("LIVE", 0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[Leo;")
    public static class423[] field540;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Z")
    public static final boolean method223(int arg0, int arg1, int arg2) {
        if (arg1 != 7350) {
            field541 = null;
        }
        field538++;
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method224(int arg0) {
        field540 = null;
        field541 = null;
        if (arg0 != -1) {
            field540 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIFFIIFIFLqi;F)[B")
    public static final byte[] method225(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, float arg8, class385 arg9, float arg10) {
        field539++;
        byte[] var11 = new byte[arg1 * arg5 * arg7];
        class364.method2138(arg8, arg6, arg1, arg10, arg3, var11, 0, arg4, arg5, true, arg7, arg9, arg2);
        if (arg0 != -14866) {
            field541 = null;
        }
        return var11;
    }
}
