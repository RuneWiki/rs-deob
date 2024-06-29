import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class103 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lnk;")
    public static class326 field1695;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1697;

    static {
        new class306("Select", "Auswählen", "Sélectionner", "Selecionar");
        field1695 = new class326(77, -1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lec;III)V", line = 9)
    public static final void method701(class68 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            method701(null, -20, -116, 91);
        }
        field1696++;
        if (class508.field7386) {
            class223 var9 = class251.field4297 == -1 ? null : class213.field3383.method2258(true, class251.field4297);
            if (!client.method475(arg0).method1994(1) || (class313.field4934 & 0x20) == 0) {
                return;
            }
            if (var9 == null || arg0.method452(7952, var9.field3853, class251.field4297) != var9.field3853) {
                class307.method1956(51, true, -1, false, class208.field3282, arg0.field1062, arg0.field1059, 0L, arg0.field1152, class460.field6823, class15.field179 + " -> " + arg0.field1052);
                class229.field3997++;
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var8 = class430.method2618(var4, arg0, (byte) 126);
            if (var8 != null) {
                class367.field5712++;
                class307.method1956(1009, true, -1, false, class263.method1756(33984, arg0, var4), arg0.field1062, arg0.field1059, (long) (var4 + 1), arg0.field1152, var8, arg0.field1052);
            }
        }
        String var5 = class125.method983(true, arg0);
        if (var5 != null) {
            class307.method1956(2, true, arg1, false, arg0.field1079, arg0.field1062, arg0.field1059, 0L, arg0.field1152, var5, arg0.field1052);
            class115.field2035++;
        }
        for (int var6 = 4; var6 >= 0; var6--) {
            String var7 = class430.method2618(var6, arg0, (byte) 115);
            if (var7 != null) {
                class367.field5712++;
                class307.method1956(18, true, -1, false, class263.method1756(33984, arg0, var6), arg0.field1062, arg0.field1059, (long) (var6 + 1), arg0.field1152, var7, arg0.field1052);
            }
        }
        if (!client.method475(arg0).method1992(1)) {
            return;
        }
        class165.field2611++;
        if (arg0.field1082 == null) {
            class307.method1956(47, true, -1, false, -1, arg0.field1062, arg0.field1059, 0L, arg0.field1152, class270.field4490.method1954(class300.field4813, arg1 - 30365), "");
            return;
        }
        class307.method1956(47, true, -1, false, -1, arg0.field1062, arg0.field1059, 0L, arg0.field1152, arg0.field1082, "");
        return;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 86)
    public static void method702(int arg0) {
        if (arg0 == 21091) {
            field1695 = null;
        }
    }
}
