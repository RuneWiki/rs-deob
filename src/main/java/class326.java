import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class326 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lri;")
    public static class73 field4646 = new class73(57, 4);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lki;")
    public static class498 field4649 = new class498(47, 3);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[Lsl;")
    public static class317[] field4650;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lri;")
    public static class73 field4651;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIII)V")
    public static final void method2015(byte arg0, int arg1, int arg2, int arg3) {
        field4648++;
        if (class108.field1553 == null) {
            return;
        }
        int var4 = -76 % ((arg0 + 58) / 54);
        long var5 = (long) (arg1 << 28 | arg3 << 14 | arg2);
        class84 var7 = (class84) class176.field2591.method2605(false, var5);
        if (var7 == null) {
            class289.method1858(arg1, arg2, arg3);
            return;
        }
        class237 var8 = (class237) var7.field1291.method816(106);
        if (var8 == null) {
            class289.method1858(arg1, arg2, arg3);
            return;
        }
        class200 var9 = (class200) class289.method1858(arg1, arg2, arg3);
        if (var9 == null) {
            var9 = new class200();
        } else {
            var9.field2896 = var9.field2898 = -1;
        }
        var9.field2890 = var8.field3494;
        var9.field2899 = var8.field3491;
        label44: while (true) {
            class237 var10 = (class237) var7.field1291.method812(82);
            if (var10 == null) {
                break;
            }
            if (var9.field2899 != var10.field3491) {
                var9.field2896 = var10.field3491;
                var9.field2894 = var10.field3494;
                while (true) {
                    class237 var11 = (class237) var7.field1291.method812(92);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field2899 != var11.field3491 && var9.field2896 != var11.field3491) {
                        var9.field2898 = var11.field3491;
                        var9.field2888 = var11.field3494;
                    }
                }
            }
        }
        int var12 = class377.method2316((arg3 << 7) + 64, false, (arg2 << 7) + 64, arg1);
        class331.method2025(arg1, arg2, arg3, var12, var9);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2016(int arg0) {
        field4646 = null;
        field4649 = null;
        if (arg0 == -25125) {
            field4651 = null;
            field4650 = null;
        }
    }

    static {
        new class475("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field4650 = new class317[30];
        field4651 = new class73(109, 8);
    }
}
