import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class190 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
    public static int[] field3340 = new int[1000];

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Loa;")
    public static class99 field3346 = class221.method1463(2844, "welle:");

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Loa;")
    public static class99 field3348 = class221.method1463(2844, "::gc");

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "S")
    public static short field3343 = 320;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Loa;")
    private static class99 field3350 = class221.method1463(2844, "Loaded interfaces");

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Loa;")
    public static class99 field3344 = field3350;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Laa;")
    public static class170 field3349;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lbg;")
    public static class237 field3339;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[[[B")
    public static byte[][][] field3353;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwb;ZLtg;Ltg;I)V")
    public static final void method1292(class26 arg0, boolean arg1, class182 arg2, class182 arg3, int arg4) {
        class125.field2195 = arg3;
        field3352++;
        class37.field643 = arg2;
        class9.field77 = arg1;
        int var5 = class37.field643.method1234(0) - 1;
        class244.field4207 = var5 * 256 + class37.field643.method1233(var5, false);
        class125.field2199 = arg0;
        if (arg4 != 18507) {
            field3350 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1293(boolean arg0) {
        field3344 = null;
        field3339 = null;
        field3353 = null;
        if (!arg0) {
            method1292((class26) null, true, (class182) null, (class182) null, -32);
        }
        field3340 = null;
        field3350 = null;
        field3349 = null;
        field3346 = null;
        field3348 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1294(int arg0) {
        field3347++;
        for (class288 var1 = (class288) class254.field4397.method529(10); var1 != null; var1 = (class288) class254.field4397.method533(81)) {
            if (var1.field5049 > 0) {
                var1.field5049--;
            }
            if (var1.field5049 != 0) {
                if (var1.field5038 > 0) {
                    var1.field5038--;
                }
                if (var1.field5038 == 0 && var1.field5030 >= 1 && var1.field5040 >= 1 && var1.field5030 <= 102 && var1.field5040 <= 102 && (var1.field5033 < 0 || class185.method1269(var1.field5033, 103, var1.field5037))) {
                    class143.method978(var1.field5030, var1.field5045, var1.field5043, var1.field5033, 19242, var1.field5040, var1.field5037, var1.field5048);
                    var1.field5038 = -1;
                    if (var1.field5033 == var1.field5031 && var1.field5031 == -1) {
                        var1.method828((byte) -105);
                    } else if (var1.field5033 == var1.field5031 && var1.field5048 == var1.field5042 && var1.field5050 == var1.field5037) {
                        var1.method828((byte) 124);
                    }
                }
            } else if (var1.field5031 < 0 || class185.method1269(var1.field5031, 68, var1.field5050)) {
                class143.method978(var1.field5030, var1.field5045, var1.field5043, var1.field5031, 19242, var1.field5040, var1.field5050, var1.field5042);
                var1.method828((byte) 127);
            }
        }
        int var2 = 75 % ((55 - arg0) / 62);
    }
}
