import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ba")
public class class12 {

    @OriginalMember(owner = "ba", name = "h", descriptor = "J")
    public long field183 = 0L;

    @OriginalMember(owner = "ba", name = "c", descriptor = "Llf;")
    public static class109 field178 = class35.method275("Bitte entfernen Sie ", 2);

    @OriginalMember(owner = "ba", name = "f", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "ba", name = "g", descriptor = "Llf;")
    public static class109 field182 = class35.method275("<col=40ff00>", 2);

    @OriginalMember(owner = "ba", name = "a", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "ba", name = "b", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "ba", name = "e", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "ba", name = "i", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "ba", name = "j", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "ba", name = "k", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "ba", name = "l", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "ba", name = "n", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "ba", name = "m", descriptor = "Lka;")
    public class95 field188;

    @OriginalMember(owner = "ba", name = "o", descriptor = "Lka;")
    public class95 field190;

    @OriginalMember(owner = "ba", name = "d", descriptor = "[I")
    public static int[] field179;

    @OriginalMember(owner = "ba", name = "a", descriptor = "(Z)V")
    public static final void method80(boolean arg0) {
        field185++;
        try {
            if (class84.field1711 == 1) {
                int var1 = class67.field1309.method1163((byte) 110);
                if (var1 > 0 && class67.field1309.method1176(-90)) {
                    int var2 = var1 - class72.field1404;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class67.field1309.method1192(var2, (byte) -34);
                    return;
                }
                class67.field1309.method1195((byte) 94);
                class67.field1309.method1170(-102);
                if (class16.field302 == null) {
                    class84.field1711 = 0;
                } else {
                    class84.field1711 = 2;
                }
                class85.field1733 = null;
                class41.field871 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class67.field1309.method1195((byte) 102);
            class84.field1711 = 0;
            class41.field871 = null;
            class85.field1733 = null;
            class16.field302 = null;
        }
        if (arg0) {
            field189 = 48;
        }
    }

    @OriginalMember(owner = "ba", name = "a", descriptor = "(IILlf;SJILlf;)V")
    public static final void method81(int arg0, int arg1, class109 arg2, short arg3, long arg4, int arg5, class109 arg6) {
        field180++;
        if (class51.field1041 || class149.field2882 >= arg5) {
            return;
        }
        class115.field2282[class149.field2882] = arg2;
        class183.field3438[class149.field2882] = arg6;
        class31.field726[class149.field2882] = arg3;
        class72.field1392[class149.field2882] = arg4;
        class146.field2823[class149.field2882] = arg1;
        class201.field3966[class149.field2882] = arg0;
        class149.field2882++;
    }

    @OriginalMember(owner = "ba", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field179 = null;
        field178 = null;
        field182 = null;
        if (arg0 != 0) {
            field178 = null;
        }
    }
}
