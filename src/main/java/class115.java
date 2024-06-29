import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field2730 = 0;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public int field2739 = 0;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Laf;")
    private static class7 field2745 = class48.method406(40, "flash2:");

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Laf;")
    public static class7 field2738 = field2745;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Laf;")
    public static class7 field2740 = class48.method406(40, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Laf;")
    public static class7 field2733 = class48.method406(40, "va");

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Laf;")
    public static class7 field2744 = field2745;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public static int[] field2731 = new int[500];

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Laf;")
    public static class7 field2746 = class48.method406(40, "scrollen:");

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lod;")
    public class101 field2737;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lod;")
    public class101 field2742;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lkb;")
    public static class71 field2736;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lkb;")
    public static class71 field2747;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
    public static int[] field2750;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2738 = null;
        field2746 = null;
        field2750 = null;
        field2733 = null;
        field2736 = null;
        field2744 = null;
        if (arg0 != -24324) {
            field2736 = null;
        }
        field2745 = null;
        field2731 = null;
        field2747 = null;
        field2740 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZI)Laf;")
    public static final class7 method898(boolean arg0, boolean arg1, int arg2) {
        if (!arg0) {
            method900(-73, -120, -30, false, null, -65);
        }
        field2749++;
        return class21.method194(10, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method899(int arg0) {
        field2732++;
        while (class91.field2100.method1145(false, class87.field2026) >= 11) {
            int var1 = class91.field2100.method1138(11, false);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class18.field425[var1] == null) {
                class18.field425[var1] = new class92();
                var2 = true;
                if (class111.field2688[var1] != null) {
                    class18.field425[var1].method742((byte) 31, class111.field2688[var1]);
                }
            }
            class87.field2046[class130.field3088++] = var1;
            class92 var3 = class18.field425[var1];
            var3.field476 = class155.field3611;
            int var4 = class91.field2100.method1138(5, false);
            int var5 = class6.field113[class91.field2100.method1138(3, false)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field492 = var3.field485 = var5;
            }
            int var6 = class91.field2100.method1138(1, false);
            int var7 = class91.field2100.method1138(1, false);
            if (var7 == 1) {
                class21.field537[class98.field2325++] = var1;
            }
            int var8 = class91.field2100.method1138(5, false);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method178(class21.field531.field493[0] + var8, (byte) -125, class21.field531.field509[0] + var4, var6 == 1);
        }
        class91.field2100.method1134(arg0 ^ 0x840);
        if (arg0 != 30269) {
            field2740 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZLlf;I)V")
    public static final void method900(int arg0, int arg1, int arg2, boolean arg3, class82 arg4, int arg5) {
        if (!arg3) {
            return;
        }
        field2735++;
        class96 var6 = new class96();
        var6.field2277 = arg4.field1908;
        var6.field2272 = arg4.field1889;
        var6.field2290 = arg5 * 128;
        var6.field2295 = arg4.field1931 * 128;
        var6.field2268 = arg2;
        var6.field2284 = arg1 * 128;
        int var7 = arg4.field1914;
        int var8 = arg4.field1917;
        var6.field2291 = arg4.field1870;
        if (arg0 == 1 || arg0 == 3) {
            var8 = arg4.field1914;
            var7 = arg4.field1917;
        }
        var6.field2273 = (arg5 + var7) * 128;
        var6.field2287 = (arg1 + var8) * 128;
        var6.field2270 = arg4.field1899;
        if (arg4.field1926 != null) {
            var6.field2278 = arg4;
            var6.method784(22773);
        }
        class39.field980.method765(var6, 0);
        if (var6.field2272 != null) {
            var6.field2292 = (int) (Math.random() * (double) (var6.field2291 - var6.field2270)) + var6.field2270;
        }
    }
}
