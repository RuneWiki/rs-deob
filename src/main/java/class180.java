import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class180 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lcga;")
    public static class449 field2121 = new class449(16, 8);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Z")
    public static boolean field2124 = false;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Z")
    public static boolean field2123 = false;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lw;")
    public class279 field2118;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lba;")
    public class359 field2119;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lxa;")
    public static class468 field2122;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Luo;")
    public static final class539 method1065(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7073;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(FFF[BFIILkda;FBIII)V")
    public static final void method1066(float arg0, float arg1, float arg2, byte[] arg3, float arg4, int arg5, int arg6, class361 arg7, float arg8, byte arg9, int arg10, int arg11, int arg12) {
        field2120++;
        for (int var13 = 0; var13 < arg5; var13++) {
            class305.method1814(arg7, arg12, 0, arg1, arg2, arg0, var13, arg8, arg4, arg5, arg6, arg10, arg3, arg11);
            arg6 += arg10 * arg12;
        }
        if (arg9 != 16) {
            method1066(-1.1847848F, 0.78516185F, 0.3925295F, null, 0.08431533F, 8, -62, null, -1.0555491F, (byte) 42, -78, -98, -25);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method1067(byte arg0) {
        if (arg0 <= 68) {
            method1067((byte) -45);
        }
        field2122 = null;
        field2121 = null;
    }
}
