import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class141 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public int field2605 = -1;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lca;")
    public static class24 field2608 = new class24(5);

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[J")
    public static long[] field2610 = new long[256];

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Li;")
    private static class88 field2614;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[[S")
    public static short[][] field2613;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lnb;")
    public static class144 field2609;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lwh;")
    public class247 field2607;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public int[] field2601;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[I")
    public static int[] field2611;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[Li;")
    public class88[] field2606;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZILrf;)V")
    public static final void method927(int arg0, boolean arg1, int arg2, class191 arg3) {
        if (arg3.field4079 == arg0 && arg0 != -1) {
            class109 var4 = class15.method75(arg0, (byte) -35);
            int var5 = var4.field1968;
            if (var5 == 1) {
                arg3.field4134 = 0;
                arg3.field4100 = 0;
                arg3.field4142 = arg2;
                arg3.field4103 = 0;
                class60.method433(105, false, arg3.field4123, arg3.field4103, arg3.field4138, var4);
            }
            if (var5 == 2) {
                arg3.field4134 = 0;
            }
        } else if (arg0 == -1 || arg3.field4079 == -1 || class15.method75(arg0, (byte) -126).field2001 >= class15.method75(arg3.field4079, (byte) -75).field2001) {
            arg3.field4100 = 0;
            arg3.field4142 = arg2;
            arg3.field4139 = arg3.field4137;
            arg3.field4103 = 0;
            arg3.field4134 = 0;
            arg3.field4079 = arg0;
            if (arg3.field4079 != -1) {
                class60.method433(28, false, arg3.field4123, arg3.field4103, arg3.field4138, class15.method75(arg3.field4079, (byte) 83));
            }
        }
        field2602++;
        if (arg1) {
            field2610 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Li;")
    public static final class88 method928(int arg0, int arg1) {
        if (arg0 != -1) {
            method929(75);
        }
        field2604++;
        return class166.method1142(new class88[] { class170.method1214(arg1 >> 24 & 0xFF, 50), field2614, class170.method1214(arg1 >> 16 & 0xFF, -104), field2614, class170.method1214(arg1 >> 8 & 0xFF, 90), field2614, class170.method1214(arg1 & 0xFF, arg0 + 94) }, -3);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method929(int arg0) {
        field2608 = null;
        field2611 = null;
        field2609 = null;
        field2610 = null;
        field2614 = null;
        int var1 = 19 / ((-arg0 - 18) / 34);
        field2613 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2610[var0] = var1;
        }
        field2614 = class208.method1425(105, ")3");
        field2613 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
        field2612 = 0;
    }
}
