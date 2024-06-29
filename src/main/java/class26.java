import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class26 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lgf;")
    public static class7 field435 = new class7(30);

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Lli;")
    private static class185 field442 = class245.method1649("May", 124);

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lli;")
    private static class185 field438 = class245.method1649("Mar", -111);

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lli;")
    private static class185 field436 = class245.method1649("Apr", -15);

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lli;")
    private static class185 field440 = class245.method1649("Jun", 126);

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lli;")
    private static class185 field445 = class245.method1649("Oct", -23);

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Lli;")
    private static class185 field448 = class245.method1649("Jul", 125);

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Lli;")
    private static class185 field446 = class245.method1649("Aug", -67);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lli;")
    private static class185 field444 = class245.method1649("Nov", 125);

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lli;")
    public static class185 field450 = class245.method1649("Chargement des textures )2 ", -119);

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lli;")
    private static class185 field437 = class245.method1649("Feb", -54);

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lli;")
    private static class185 field443 = class245.method1649("Dec", -14);

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lli;")
    private static class185 field441 = class245.method1649("Jan", -105);

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Lli;")
    private static class185 field451 = class245.method1649("Sep", 127);

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[Lli;")
    public static class185[] field447 = new class185[] { field441, field437, field438, field436, field442, field440, field448, field446, field451, field445, field444, field443 };

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lhi;")
    public static class250 field449;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
    public static final int method171(int arg0, int arg1, int arg2) {
        int var3 = arg0 * 57 + arg1;
        field434++;
        int var4 = var3 << 13 ^ var3;
        if (arg2 != 1) {
            method172(-23, (byte) 91);
        }
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public static final void method172(int arg0, byte arg1) {
        field433++;
        class18 var2 = (class18) class152.field2871.method195(123, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 <= 66) {
            return;
        }
        while (var3 < var2.field286.length) {
            var2.field286[var3] = -1;
            var2.field285[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method173(int arg0) {
        field446 = null;
        field450 = null;
        field441 = null;
        field443 = null;
        field448 = null;
        field445 = null;
        field437 = null;
        field449 = null;
        field436 = null;
        field442 = null;
        field451 = null;
        if (arg0 != 2) {
            method173(-51);
        }
        field447 = null;
        field440 = null;
        field435 = null;
        field444 = null;
        field438 = null;
    }
}
