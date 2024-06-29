import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class334 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Liv;")
    public static class64 field5039 = new class64(55, 8);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Liv;")
    public static class64 field5041 = new class64(80, 14);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field5043 = 0;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lpi;")
    public static class342 field5046 = new class342("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lkn;")
    public static class519 field5047 = new class519(8);

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5049 = "";

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Liv;")
    public static class64 field5048 = new class64(27, 2);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 7)
    public static final boolean method2140(int arg0, String arg1) {
        field5040++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class1.field9; var2++) {
            if (arg1.equalsIgnoreCase(class274.field3963[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class121.field1963[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILob;IIIILob;I)V", line = 43)
    public static final void method2141(int arg0, int arg1, int arg2, class517 arg3, int arg4, int arg5, int arg6, int arg7, class517 arg8, int arg9) {
        field5044++;
        int var10 = arg3.method1644((byte) 114);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class529 var12 = (class529) class471.field7071.method494(0, (long) var10);
        if (var12 == null) {
            class279[] var13 = class279.method1779(class151.field2407, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class4.field109.method304(var13[0], true);
            class471.field7071.method485((long) var10, (byte) -125, var12);
        }
        class221.method1468(arg5 >> 1, arg8.field6232, 0, arg0, arg8.field6233, arg6 >> 1, arg7, arg8.field6228, 0, arg8.method1654(126) * 64);
        int var14 = class72.field1246[0] + arg2 - 18;
        int var15 = arg1 / 4 * 18 + var14;
        int var16 = arg4 + class72.field1246[1] - 54 - 16;
        int var17 = arg1 % 4 * 18 + var16;
        if (arg9 < 58) {
            field5045 = 0;
        }
        var12.method3137(var15, var17);
        if (arg3 == arg8) {
            class4.field109.method1196(18, var15 - 1, (byte) -85, 18, -256, var17 - 1);
        }
        class271 var18 = class160.method1185(0);
        var18.field3914 = var15;
        var18.field3912 = var17 + 16;
        var18.field3911 = var17;
        var18.field3915 = arg3;
        var18.field3913 = var15 + 16;
        class470.field7034.method1636(9, var18);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)V", line = 95)
    public static final void method2142(byte arg0, int arg1, int arg2) {
        field5042++;
        if (arg0 != 0) {
            field5043 = 125;
        }
        class54 var3 = class442.method2651(0, 15, -13208);
        var3.method480(0);
        var3.field934 = arg1;
        var3.field930 = arg2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 110)
    public static void method2143(boolean arg0) {
        field5047 = null;
        if (!arg0) {
            return;
        }
        field5041 = null;
        field5048 = null;
        field5046 = null;
        field5049 = null;
        field5039 = null;
    }
}
