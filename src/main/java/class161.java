import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class161 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Loc;")
    private static class151 field2909 = class137.method873(2, "Walk here");

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Loc;")
    public static class151 field2911 = class137.method873(2, " )2> ");

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Loc;")
    public static class151 field2908 = class137.method873(2, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Loc;")
    public static class151 field2910 = class137.method873(2, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    public static int[] field2904 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Loc;")
    private static class151 field2913 = class137.method873(2, "purple:");

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Loc;")
    public static class151 field2905 = field2909;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Loc;")
    public static class151 field2914 = field2913;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Loc;")
    public static class151 field2917 = field2913;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lve;")
    public class223 field2916;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
    public int[] field2912;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method1044(byte arg0) {
        field2903++;
        for (class128 var1 = (class128) class90.field1649.method1358(-29726); var1 != null; var1 = (class128) class90.field1649.method1360(true)) {
            class112 var2 = var1.field2300;
            if (class234.field4325 != var2.field1971 || class200.field3541 > var2.field1973) {
                var1.method636(90);
            } else if (var2.field1998 <= class200.field3541) {
                if (var2.field1980 > 0) {
                    class203 var3 = class122.field2190[var2.field1980 - 1];
                    if (var3 != null && var3.field3976 >= 0 && var3.field3976 < 13312 && var3.field4029 >= 0 && var3.field4029 < 13312) {
                        var2.method680(var3.field3976, class200.field3541, -78, class195.method1225(var3.field3976, var2.field1971, var3.field4029, (byte) -118) - var2.field1983, var3.field4029);
                    }
                }
                if (var2.field1980 < 0) {
                    int var4 = -var2.field1980 - 1;
                    class20 var5;
                    if (class163.field2943 == var4) {
                        var5 = class228.field3975;
                    } else {
                        var5 = class179.field3229[var4];
                    }
                    if (var5 != null && var5.field3976 >= 0 && var5.field3976 < 13312 && var5.field4029 >= 0 && var5.field4029 < 13312) {
                        var2.method680(var5.field3976, class200.field3541, -77, class195.method1225(var5.field3976, var2.field1971, var5.field4029, (byte) -118) - var2.field1983, var5.field4029);
                    }
                }
                var2.method674(false, class181.field3273);
                class154.method1014(class234.field4325, (int) var2.field2002, (int) var2.field2001, (int) var2.field1991, 60, var2, var2.field1972, -1L, false);
            }
        }
        if (arg0 <= 67) {
            method1044((byte) 51);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Loc;I)Loc;")
    public static final class151 method1045(class151 arg0, int arg1) {
        if (arg1 <= 125) {
            field2904 = null;
        }
        field2915++;
        class85 var2 = class42.method302(arg0, -9605);
        return var2 == null ? class93.field1742 : var2.field1603;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method1046(boolean arg0) {
        field2908 = null;
        field2911 = null;
        field2913 = null;
        field2904 = null;
        field2914 = null;
        field2910 = null;
        field2909 = null;
        field2917 = null;
        if (!arg0) {
            field2905 = null;
        }
    }
}
