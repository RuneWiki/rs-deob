import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class200 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    public static int[] field2401 = new int[13];

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[Z")
    public static boolean[] field2400 = new boolean[100];

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Ldn;")
    public static class438 field2405;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
    public static final int method1078(int arg0, int arg1, int arg2) {
        int var3 = 124 / ((68 - arg1) / 43);
        field2404++;
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2405 = null;
        if (arg0 != -22561) {
            method1078(-45, -108, 120);
        }
        field2400 = null;
        field2401 = null;
    }
}
