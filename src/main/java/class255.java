import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class255 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field3883 = -1;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field3888 = 0;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3887 = new String[100];

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Lrp;")
    public static class288 field3889 = new class288(4);

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "Lph;")
    public class438 field3885;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
    public static void method1530(boolean arg0) {
        if (!arg0) {
            field3889 = null;
            field3887 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1531(int arg0, int arg1) {
        field3884++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class96.field1740.method2473(class406.field5898, -75) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class442.field6681.method2473(class406.field5898, -119) + " (" + var2 + ")</col>";
        } else {
            if (arg1 != 2006) {
                field3889 = null;
            }
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ltq;I)V")
    public static final void method1532(class427 arg0, int arg1) {
        field3890++;
        if (arg1 != -8) {
            method1531(63, 121);
        }
        class427 var2 = class188.method1164(arg0, (byte) 125);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class482.field7368;
            var3 = class147.field2384;
        } else {
            var3 = var2.field6126;
            var4 = var2.field6175;
        }
        class229.method1377(var3, -5, var4, false, arg0);
        class290.method1767(30789, arg0, var4, var3);
    }
}
