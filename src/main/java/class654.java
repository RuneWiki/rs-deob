import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class654 {

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field9256 = 0;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "[I")
    public static int[] field9260 = new int[16384];

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Z")
    public static boolean field9261 = false;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "[I")
    public static int[] field9259 = new int[16384];

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field9254 = 0;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "Lek;")
    public static class540 field9262;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z")
    public static final boolean method3621(int arg0, int arg1, int arg2) {
        if (arg1 <= 2) {
            return false;
        } else {
            field9258++;
            return (arg0 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIII)V")
    public static final void method3622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9257++;
        class19 var5 = class364.method2236(1248116640, arg4, 8);
        if (arg0 == -1) {
            var5.method110(12142);
            var5.field171 = arg1;
            var5.field180 = arg3;
            var5.field173 = arg2;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
    public static void method3623(boolean arg0) {
        field9259 = null;
        field9260 = null;
        if (!arg0) {
            field9256 = 111;
        }
        field9262 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILfca;B)V")
    public static final void method3624(int arg0, int arg1, class188 arg2, byte arg3) {
        if (arg2.field2418 == 0) {
            arg2.field2428 = arg2.field2299;
        } else if (arg2.field2418 == 1) {
            arg2.field2428 = (arg0 - arg2.field2371) / 2 + arg2.field2299;
        } else if (arg2.field2418 == 2) {
            arg2.field2428 = arg0 - arg2.field2371 - arg2.field2299;
        } else if (arg2.field2418 == 3) {
            arg2.field2428 = arg2.field2299 * arg0 >> 14;
        } else if (arg2.field2418 == 4) {
            arg2.field2428 = (arg2.field2299 * arg0 >> 14) + (arg0 - arg2.field2371) / 2;
        } else {
            arg2.field2428 = arg0 - arg2.field2371 - (arg2.field2299 * arg0 >> 14);
        }
        if (arg2.field2373 == 0) {
            arg2.field2305 = arg2.field2404;
        } else if (arg2.field2373 == 1) {
            arg2.field2305 = (arg1 - arg2.field2438) / 2 + arg2.field2404;
        } else if (arg2.field2373 == 2) {
            arg2.field2305 = arg1 - arg2.field2438 - arg2.field2404;
        } else if (arg2.field2373 == 3) {
            arg2.field2305 = arg2.field2404 * arg1 >> 14;
        } else if (arg2.field2373 == 4) {
            arg2.field2305 = (arg2.field2404 * arg1 >> 14) + (arg1 - arg2.field2438) / 2;
        } else {
            arg2.field2305 = arg1 - arg2.field2438 - (arg2.field2404 * arg1 >> 14);
        }
        field9255++;
        if (class380.field5455 && (client.method1411(arg2).field3648 != 0 || arg2.field2304 == 0)) {
            if (arg2.field2428 < 0) {
                arg2.field2428 = 0;
            } else if (arg2.field2428 + arg2.field2371 > arg0) {
                arg2.field2428 = arg0 - arg2.field2371;
            }
            if (arg2.field2305 < 0) {
                arg2.field2305 = 0;
            } else if (arg2.field2438 + arg2.field2305 > arg1) {
                arg2.field2305 = arg1 - arg2.field2438;
            }
        }
        if (arg3 > -94) {
            field9256 = 93;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9259[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field9260[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
