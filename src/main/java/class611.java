import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class611 {

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "[F")
    public static float[] field8220 = new float[4];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method3463(int arg0) {
        field8220 = null;
        if (arg0 != 0) {
            field8220 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILkn;II)V")
    public static final void method3464(int arg0, int arg1, class520 arg2, int arg3, int arg4) {
        field8219++;
        long var5 = (long) (arg1 | arg0 << 14 | arg3 << 28);
        class662 var7 = (class662) class541.field7521.method812(127, var5);
        if (var7 == null) {
            class662 var8 = new class662();
            class541.field7521.method820(var5, (byte) -42, var8);
            var8.field8785.method3610(9289, arg2);
            return;
        }
        class671 var9 = class291.field4179.method1313(arg2.field7246, true);
        int var10 = var9.field9286;
        if (var9.field9316 == 1) {
            var10 = (arg2.field7251 + 1) * var10;
        }
        int var11 = 41 / ((-arg4 - 34) / 59);
        for (class520 var12 = (class520) var7.field8785.method3618(73); var12 != null; var12 = (class520) var7.field8785.method3619(0)) {
            class671 var13 = class291.field4179.method1313(var12.field7246, true);
            int var14 = var13.field9286;
            if (var13.field9316 == 1) {
                var14 = (var12.field7251 + 1) * var14;
            }
            if (var14 < var10) {
                class428.method2651(var12, arg2, -6059);
                return;
            }
        }
        var7.field8785.method3610(9289, arg2);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIII)V")
    public static final void method3465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 5) {
            method3467(42, 85, 76, 115, -97, -48, false);
        }
        field8221++;
        int var6 = class41.method223(true, class262.field3848, class291.field4181, arg3);
        int var7 = class41.method223(true, class262.field3848, class291.field4181, arg0);
        int var8 = class41.method223(true, class726.field10064, class607.field8185, arg5);
        int var9 = class41.method223(true, class726.field10064, class607.field8185, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class102.method675(arg4, 126, var8, var9, class538.field7454[var10]);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BZ)V")
    public static final void method3466(byte arg0, boolean arg1) {
        class332.field4707.method2158(0, class332.field4707.field4759, -15);
        field8217++;
        class332.field4707.method2158(0, class332.field4707.field4774, -15);
        class332.field4707.method2158(1, class332.field4707.field4763, -15);
        class332.field4707.method2158(1, class332.field4707.field4793, -15);
        class332.field4707.method2158(0, class332.field4707.field4779, -15);
        class332.field4707.method2158(0, class332.field4707.field4765, -15);
        class332.field4707.method2158(0, class332.field4707.field4752, arg0 ^ 0xFFFFFFF5);
        class332.field4707.method2158(0, class332.field4707.field4769, -15);
        class332.field4707.method2158(0, class332.field4707.field4799, -15);
        class332.field4707.method2158(0, class332.field4707.field4757, arg0 - 19);
        if (arg0 != 4) {
            return;
        }
        class332.field4707.method2158(0, class332.field4707.field4787, -15);
        class332.field4707.method2158(0, class332.field4707.field4792, -15);
        class332.field4707.method2158(0, class332.field4707.field4764, -15);
        class332.field4707.method2158(0, class332.field4707.field4791, -15);
        class332.field4707.method2158(0, class332.field4707.field4756, -15);
        class332.field4707.method2158(0, class332.field4707.field4773, -15);
        class332.field4707.method2158(0, class332.field4707.field4800, -15);
        class332.field4707.method2158(0, class332.field4707.field4770, arg0 - 19);
        class332.field4707.method2158(0, class332.field4707.field4767, -15);
        class274.method1843(20084);
        class332.field4707.method2158(2, class332.field4707.field4758, -15);
        class332.field4707.method2158(1, class332.field4707.field4785, -15);
        class211.method1261(18388);
        class124.method777((byte) -102);
        class641.field8597 = true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method3467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        for (class437 var7 = (class437) class217.field2831.method1638(false); var7 != null; var7 = (class437) class217.field2831.method1645(0)) {
            if (class483.field6741 >= var7.field6100) {
                var7.method3012(102);
            } else {
                class404.method2536((var7.field6097 << 9) + 256, (var7.field6098 << 9) + 256, var7.field6103 * 2, arg1 >> 1, arg4, arg2, var7.field6094, arg5 >> 1, (byte) 56);
                class758.field10575.method2508(var7.field6102, class185.field2530[1] + arg3, var7.field6096 | 0xFF000000, 0, -80, arg0 + class185.field2530[0]);
            }
        }
        if (!arg6) {
            field8220 = null;
        }
        field8218++;
    }
}
