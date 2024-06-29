import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Laf;")
    private static class7 field1067 = class48.method406(40, "Players");

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1068 = 2;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Laf;")
    public static class7 field1073 = class48.method406(40, "Mem:");

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Laf;")
    public static class7 field1063 = class48.method406(40, "Freie Welt");

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Laf;")
    private static class7 field1071 = class48.method406(40, "Please use a different world)3");

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Laf;")
    public static class7 field1066 = field1071;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Laf;")
    private static class7 field1077 = class48.method406(40, "Type");

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Laf;")
    public static class7 field1075 = class48.method406(40, "(U1");

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Laf;")
    public static class7 field1064 = field1077;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Laf;")
    public static class7 field1072 = field1071;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Laf;")
    private static class7 field1076 = class48.method406(40, " is already on your ignore list");

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Laf;")
    public static class7 field1079 = field1067;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Laf;")
    public static class7 field1081 = class48.method406(40, "headicons_prayer");

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Laf;")
    public static class7 field1074 = field1076;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    public static int[] field1065 = new int[25];

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Laf;")
    public static class7 field1082 = class48.method406(40, "Fallen lassen");

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[I")
    public static int[] field1084 = new int[500];

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwe;")
    public static final class155 method385(Throwable arg0, String arg1) {
        field1083++;
        class155 var2;
        if (arg0 instanceof class155) {
            var2 = (class155) arg0;
            var2.field3608 = var2.field3608 + ' ' + arg1;
        } else {
            var2 = new class155(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V")
    public static final void method386(boolean arg0, byte arg1) {
        for (int var2 = 0; var2 < class106.field2615; var2++) {
            int var3 = (class155.field3600[var2] << 14) + 536870912;
            class141 var4 = class121.field2843[class155.field3600[var2]];
            if (var4 != null && var4.method186(-127) && arg0 == var4.field3323.field2214 && var4.field3323.method778(-1)) {
                int var5 = var4.field505 >> 7;
                int var6 = var4.field491 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field473 == 1 && (var4.field505 & 0x7F) == 64 && (var4.field491 & 0x7F) == 64) {
                        if (class4.field46[var5][var6] == class144.field3411) {
                            continue;
                        }
                        class4.field46[var5][var6] = class144.field3411;
                    }
                    if (!var4.field3323.field2235) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class47.field1151.method1024(class8.field186, var4.field505, var4.field491, class119.method921(var4.field473 * 64 + var4.field491 - 64, -21697, class8.field186, var4.field505 + (var4.field473 - 1) * 64), var4.field473 * 64 + 60 - 64, var4, var4.field485, var3, var4.field437);
                }
            }
        }
        if (arg1 == -124) {
            field1070++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method387(boolean arg0) {
        field1071 = null;
        field1075 = null;
        field1063 = null;
        field1077 = null;
        field1084 = null;
        field1082 = null;
        field1076 = null;
        field1074 = null;
        field1066 = null;
        field1073 = null;
        field1072 = null;
        field1067 = null;
        field1079 = null;
        field1064 = null;
        if (arg0) {
            method387(false);
        }
        field1065 = null;
        field1081 = null;
    }
}
