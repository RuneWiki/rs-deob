import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field785 = new int[256];

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[I")
    public static int[] field786 = new int[50];

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[[S")
    public static short[][] field788 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field793 = 0;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field794 = "green:";

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lqd;")
    public static class3 field787;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 116) {
            field786 = null;
        }
        class292.field4607.field588 = 0;
        field784++;
        class292.field4607.method287(440742616, 20);
        class292.field4607.method287(440742616, arg0);
        class292.field4607.method287(440742616, arg2);
        class292.field4607.method312(1489253544, arg1);
        class292.field4607.method312(1489253544, arg4);
        class255.field3911 = 0;
        class137.field2132 = 1;
        class6.field102 = 0;
        class259.field3978 = -3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Luf;ILuf;)V")
    public static final void method393(class176 arg0, int arg1, class176 arg2) {
        class35.field555 = arg0;
        if (arg1 == 0) {
            field791++;
            class63.field1013 = arg2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        field794 = null;
        field786 = null;
        field785 = null;
        field788 = null;
        if (arg0 < 24) {
            field793 = -101;
        }
        field787 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILrg;IIII)Lrg;")
    public static final class233 method395(int arg0, int arg1, class233 arg2, int arg3, int arg4, int arg5, int arg6) {
        field789++;
        if (arg1 < 31) {
            field793 = 45;
        }
        long var7 = (long) arg6;
        class233 var9 = (class233) class179.field2675.method1780(var7, (byte) -125);
        if (var9 == null) {
            class183 var10 = class183.method1225(class259.field3983, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1210(64, 768, -50, -10, -50);
            class179.field2675.method1784(var9, false, var7);
        }
        int var11 = arg2.method1550();
        int var12 = arg2.method1535();
        int var13 = arg2.method1531();
        int var14 = arg2.method1529();
        class233 var15 = var9.method1537(true, true, true);
        if (arg3 != 0) {
            var15.method1552(arg3);
        }
        class281 var16 = (class281) var15;
        if (class224.method1502((byte) -125, class274.field4318, arg4 + var13, arg5 + var11) != arg0 || class224.method1502((byte) -126, class274.field4318, arg4 + var14, arg5 - -var12) != arg0) {
            for (int var17 = 0; var17 < var16.field4413; var17++) {
                var16.field4394[var17] += class224.method1502((byte) -126, class274.field4318, var16.field4402[var17] + arg4, var16.field4424[var17] - -arg5) - arg0;
            }
            var16.field4408 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method396(int arg0, int arg1) {
        field790++;
        class295 var2 = class250.method1673(-116, arg1, arg0);
        var2.method1979(arg1 ^ 0xFFFFDFF1);
    }
}
