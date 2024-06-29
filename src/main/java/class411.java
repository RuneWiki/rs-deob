import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class411 {

    @OriginalMember(owner = "client!br", name = "c", descriptor = "[F")
    public static float[] field5799 = new float[16];

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5801 = -50;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "J")
    public static long field5802 = 0L;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field5803 = 1401;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "[I")
    public static int[] field5797;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BIIILie;)V", line = 7)
    public static final void method2471(byte arg0, int arg1, int arg2, int arg3, class6 arg4) {
        field5800++;
        long var5 = (long) (arg1 | arg3 << 28 | arg2 << 14);
        class541 var7 = (class541) class70.field959.method380((byte) -3, var5);
        if (var7 == null) {
            class541 var8 = new class541();
            class70.field959.method384(var5, var8, false);
            var8.field7586.method2510(arg4, false);
            return;
        }
        class501 var9 = class526.field7490.method3567(arg4.field62, true);
        int var10 = var9.field7166;
        if (var9.field7176 == 1) {
            var10 = (arg4.field64 + 1) * var10;
        }
        if (arg0 != -35) {
            field5797 = null;
        }
        for (class6 var11 = (class6) var7.field7586.method2508((byte) 109); var11 != null; var11 = (class6) var7.field7586.method2505((byte) -55)) {
            class501 var12 = class526.field7490.method3567(var11.field62, true);
            int var13 = var12.field7166;
            if (var12.field7176 == 1) {
                var13 = (var11.field64 + 1) * var13;
            }
            if (var10 > var13) {
                class246.method1657(arg4, var11, arg0 ^ 0xFF00DD);
                return;
            }
        }
        var7.field7586.method2510(arg4, false);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 63)
    public static void method2472(int arg0) {
        field5797 = null;
        if (arg0 == 97) {
            field5799 = null;
        }
    }
}
