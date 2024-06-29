import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class565 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lvt;")
    public static class344 field7918 = new class344("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7920;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method3169(byte arg0) {
        if (arg0 <= 110) {
            return;
        }
        field7919++;
        for (class124 var1 = (class124) class196.field2540.method3188((byte) -100); var1 != null; var1 = (class124) class196.field2540.method3182((byte) -67)) {
            class150 var2 = var1.field1544;
            if (var2.field1984 < class7.field61) {
                var1.method589(-8880);
                var2.method820(-1);
            } else if (class7.field61 >= var2.field1950) {
                if (var2.field1964 > 0) {
                    class480 var3 = (class480) class131.field1619.method3476((long) (var2.field1964 - 1), (byte) 28);
                    if (var3 != null) {
                        class585 var4 = var3.field6729;
                        if (var4.field6362 >= 0 && class139.field1760 * 512 > var4.field6362 && var4.field6368 >= 0 && var4.field6368 < class369.field5135 * 512) {
                            var2.method818(class341.method2147(var2.field6358, var4.field6362, 0, var4.field6368) - var2.field1988, var4.field6362, false, class7.field61, var4.field6368);
                        }
                    }
                }
                if (var2.field1964 < 0) {
                    int var5 = -var2.field1964 - 1;
                    class20 var6;
                    if (class182.field2335 == var5) {
                        var6 = class147.field1899;
                    } else {
                        var6 = class364.field5092[var5];
                    }
                    if (var6 != null && var6.field6362 >= 0 && (class139.field1760 * 512) > var6.field6362 && var6.field6368 >= 0 && var6.field6368 < (class369.field5135 * 512)) {
                        var2.method818(class341.method2147(var2.field6358, var6.field6362, 0, var6.field6368) - var2.field1988, var6.field6362, false, class7.field61, var6.field6368);
                    }
                }
                var2.method824(class153.field1999, (byte) -105);
                class523.method2925(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method3170(int arg0) {
        field7920 = null;
        field7918 = null;
        int var1 = 63 % ((-arg0 - 77) / 43);
    }
}
