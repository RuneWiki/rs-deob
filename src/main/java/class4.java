import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    public static int[] field66 = new int[25];

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Z")
    public static boolean field70 = false;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lqf;")
    public static class117 field76 = class72.method514(125, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lqf;")
    private static class117 field75 = class72.method514(125, "Could not complete login)3");

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lqf;")
    public static class117 field77 = class72.method514(126, " ");

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lqf;")
    public static class117 field71 = field75;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Z")
    public static boolean field74 = false;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ldf;")
    public static class28 field73;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method10(int arg0) {
        field71 = null;
        if (arg0 != 3207) {
            return;
        }
        field76 = null;
        field73 = null;
        field66 = null;
        field77 = null;
        field75 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method11(int arg0) {
        if (arg0 != 20) {
            return;
        }
        field67++;
        if (class132.field3119 == 2) {
            class87.method687((class130.field3109 - class133.field3153 << 7) + class5.field81, class8.field127 * 2, (class141.field3405 - class19.field312 << 7) + class20.field332, (byte) -97);
            if (class79.field1787 > -1 && class43.field856 % 20 < 10) {
                class117.field2810[0].method660(class79.field1787 - 12, class36.field769 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static final void method12(int arg0) {
        if (arg0 != -13313) {
            return;
        }
        class90 var1 = (class90) class133.field3141.method27(18823);
        field68++;
        while (var1 != null) {
            if (class140.field3344 != var1.field2175 || var1.field2164 < class43.field856) {
                var1.method495(-117);
            } else if (var1.field2168 <= class43.field856) {
                if (var1.field2188 > 0) {
                    class58 var2 = class72.field1533[var1.field2188 - 1];
                    if (var2 != null && var2.field1998 >= 0 && var2.field1998 < 13312 && var2.field1960 >= 0 && var2.field1960 < 13312) {
                        var1.method712(class80.method626(var2.field1998, var1.field2175, var2.field1960, 0) - var1.field2196, (byte) -117, var2.field1960, class43.field856, var2.field1998);
                    }
                }
                if (var1.field2188 < 0) {
                    int var3 = -var1.field2188 - 1;
                    class21 var4;
                    if (class43.field857 == var3) {
                        var4 = class141.field3395;
                    } else {
                        var4 = class149.field3709[var3];
                    }
                    if (var4 != null && var4.field1998 >= 0 && var4.field1998 < 13312 && var4.field1960 >= 0 && var4.field1960 < 13312) {
                        var1.method712(class80.method626(var4.field1998, var1.field2175, var4.field1960, -127) - var1.field2196, (byte) -86, var4.field1960, class43.field856, var4.field1998);
                    }
                }
                var1.method715(90, class83.field1911);
                class19.field311.method868(class140.field3344, (int) var1.field2171, (int) var1.field2192, (int) var1.field2183, 60, var1, var1.field2167, -1, false);
            }
            var1 = (class90) class133.field3141.method25((byte) -128);
        }
    }
}
