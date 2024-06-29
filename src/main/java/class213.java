import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class213 extends class202 {

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3482 = "Ok";

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Lf;")
    public class36 field3480;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Lf;")
    public class36 field3485;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "Ljava/lang/String;")
    public String field3488;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Z")
    public boolean field3484;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field3477;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method1463(String arg0, String arg1, int arg2) {
        int var3 = arg0.length();
        int var4 = arg1.length();
        field3474++;
        if (var4 > var3) {
            return false;
        }
        if (arg2 != -17327) {
            method1463((String) null, (String) null, 63);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg1.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)Lmi;")
    public static final class259 method1464(byte arg0, int arg1, int arg2) {
        field3489++;
        class259 var3 = (class259) class128.field2076.method1400((long) arg1 | (long) arg2 << 32, true);
        if (var3 == null) {
            var3 = new class259(arg2, arg1);
            class128.field2076.method1399(7292, var3, var3.field3247);
        }
        return arg0 > -90 ? null : var3;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)V")
    public static final void method1465(boolean arg0) {
        field3478++;
        if (arg0) {
            method1467(false, -62, (class269) null);
        }
        Container var1;
        if (class77.field1234 != null) {
            var1 = class77.field1234;
        } else if (class110.field1811 == null) {
            var1 = class105.field1684.field2620;
        } else {
            var1 = class110.field1811;
        }
        class255.field4048 = var1.getSize().width;
        class258.field4099 = var1.getSize().height;
        if (class110.field1811 == var1) {
            Insets var2 = class110.field1811.getInsets();
            class255.field4048 -= var2.right + var2.left;
            class258.field4099 -= var2.top + var2.bottom;
        }
        if (class259.method1764(0) < 2) {
            class84.field1326 = 765;
            class198.field3163 = 0;
            class279.field4423 = 503;
            class236.field3842 = (class255.field4048 - 765) / 2;
        } else {
            class236.field3842 = 0;
            class84.field1326 = class255.field4048;
            class279.field4423 = class258.field4099;
            class198.field3163 = 0;
        }
        class155.field2511.setSize(class84.field1326, class279.field4423);
        if (class110.field1811 == var1) {
            Insets var3 = class110.field1811.getInsets();
            class155.field2511.setLocation(class236.field3842 + var3.left, class198.field3163 + var3.top);
        } else {
            class155.field2511.setLocation(class236.field3842, class198.field3163);
        }
        if (class157.field2548 != -1) {
            class271.method1836(true, -86);
        }
        class196.method1334(-1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1466(byte arg0) {
        if (arg0 > 112) {
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZILjb;)V")
    public static final void method1467(boolean arg0, int arg1, class269 arg2) {
        if (arg0) {
            int var3 = class279.field4423;
            int var4 = var3 * 956 / 503;
            class77.field1242.method327((class84.field1326 - var4) / 2, 0, var4, var3);
            class96.field1574.method1592(class84.field1326 / 2 - (class96.field1574.field3744 / 2), 18);
        }
        field3481++;
        arg2.method1797(class281.field4448, class84.field1326 / 2, class279.field4423 / 2 - 26, 16777215, -1);
        int var5 = class279.field4423 / 2 - 18;
        class2.method24(class84.field1326 / 2 - 152, var5, 304, 34, 9179409);
        class2.method24(class84.field1326 / 2 - 151, var5 - -1, 302, 32, arg1);
        class2.method25(class84.field1326 / 2 - 150, var5 - -2, class263.field4186 * 3, 30, 9179409);
        class2.method25(class263.field4186 * 3 + (class84.field1326 / 2 - 150), var5 + 2, 300 - (class263.field4186 * 3), 30, 0);
        arg2.method1797(class4.field51, class84.field1326 / 2, class279.field4423 / 2 + 4, 16777215, -1);
    }
}
