import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class130 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lai;")
    public static class10 field2467 = class44.method278("Verbindung mit Update)2Server)3)3)3", -13);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lai;")
    private static class10 field2466 = class44.method278("Loading )2 please wait)3", -117);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lai;")
    public static class10 field2460 = field2466;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lai;")
    private static class10 field2462 = class44.method278(" from your ignore list first)3", -77);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lai;")
    public static class10 field2465 = class44.method278("huffman", 91);

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lai;")
    public static class10 field2470 = field2462;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Ldd;")
    public static class34 field2469 = new class34(64);

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field2472 = new int[500];

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lai;")
    public static class10 field2475 = class44.method278("Begeben Sie sich in ein freies Gebiet)1 um", -86);

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Z")
    public static boolean[] field2474 = new boolean[5];

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lai;")
    public static class10 field2473 = class44.method278("Abbrechen", 95);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[Z")
    public static boolean[] field2476;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public static final void method906(int arg0, int arg1, int arg2) {
        field2461++;
        class192 var3 = class33.field508[class42.field687][arg1][arg0];
        if (var3 == null) {
            class36.field560.method597(class42.field687, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class42 var5 = null;
        for (class42 var6 = (class42) var3.method1223(true); var6 != null; var6 = (class42) var3.method1226((byte) -57)) {
            class94 var11 = class104.method678(500, var6.field694);
            int var12 = var11.field1711;
            if (var11.field1693 == 1) {
                var12 = (var6.field684 + 1) * var12;
            }
            if (var12 > var4) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class36.field560.method597(class42.field687, arg1, arg0);
            return;
        }
        var3.method1231((byte) -101, var5);
        class42 var7 = null;
        class42 var8 = null;
        for (class42 var9 = (class42) var3.method1223(true); var9 != null; var9 = (class42) var3.method1226((byte) -57)) {
            if (var5.field694 != var9.field694) {
                if (var8 == null) {
                    var8 = var9;
                }
                if (var8.field694 != var9.field694 && var7 == null) {
                    var7 = var9;
                }
            }
        }
        if (arg2 == -24639) {
            int var10 = arg1 + (arg0 << 7) + 1610612736;
            class36.field560.method567(class42.field687, arg1, arg0, class145.method1003((byte) -94, arg1 * 128 + 64, arg0 * 128 + 64, class42.field687), var5, var10, var8, var7);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3) {
        if (class40.field676 != 0 && arg2 != 0 && class135.field2540 < 50) {
            class183.field3480[class135.field2540] = arg3;
            class176.field3373[class135.field2540] = arg2;
            class159.field3062[class135.field2540] = arg1;
            class139.field2625[class135.field2540] = null;
            class169.field3267[class135.field2540] = 0;
            class135.field2540++;
        }
        field2468++;
        int var4 = 69 % ((-arg0 - 40) / 32);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method908(byte arg0) {
        field2473 = null;
        field2466 = null;
        if (arg0 != 77) {
            return;
        }
        field2475 = null;
        field2476 = null;
        field2469 = null;
        field2470 = null;
        field2472 = null;
        field2460 = null;
        field2465 = null;
        field2467 = null;
        field2474 = null;
        field2462 = null;
    }
}
