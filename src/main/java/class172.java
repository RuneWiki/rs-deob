import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class172 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Leba;")
    public static class550 field2442 = new class550(114, 7);

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Leba;")
    public static class550 field2444 = new class550(60, -2);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method1167(byte arg0) {
        field2444 = null;
        field2442 = null;
        if (arg0 < 52) {
            field2442 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class285.method1691(arg4, class315.field4224[arg5], arg1 ^ 0xFFF9FFF9, arg3, arg0);
        field2441++;
        int var8 = arg2 - 1;
        class285.method1691(arg4, class315.field4224[arg2], -7, arg3, arg0);
        if (arg1 == 393216) {
            for (int var6 = var9; var6 <= var8; var6++) {
                int[] var7 = class315.field4224[var6];
                var7[arg3] = var7[arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z")
    public static final boolean method1169(int arg0, int arg1, int arg2) {
        field2445++;
        return arg0 == 7 ? class690.method3899(arg2, arg1, (byte) -108) & class600.method3336(arg2, (byte) -55, arg1) : false;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)Z")
    public static final boolean method1170(int arg0, int arg1, int arg2) {
        field2443++;
        if (arg1 != -1) {
            field2444 = null;
        }
        return class322.method1873(arg0, arg2, (byte) -33) | (arg2 & 0x60000) != 0 || class229.method1421(arg2, arg0, -1) || class524.method2974(arg0, arg2, -14006);
    }
}
