import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class300 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "Lbga;")
    public static class324 field4468;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lrga;)V", line = 5)
    public static final void method1929(class215 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class313.field4626[var1]; var2++) {
                if (class496.field7034[var1][var2] == arg0) {
                    class476.method2794(class496.field7034[var1], var2 + 1, class496.field7034[var1], var2, class313.field4626[var1] - var2 - 1);
                    var10002 = class313.field4626[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class59.field1130[var1]; var3++) {
                if (class232.field3618[var1][var3] == arg0) {
                    class476.method2794(class232.field3618[var1], var3 + 1, class232.field3618[var1], var3, class59.field1130[var1] - var3 - 1);
                    var10002 = class59.field1130[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class127.field1896[var1]; var4++) {
                if (class471.field6741[var1][var4] == arg0) {
                    class476.method2794(class471.field6741[var1], var4 + 1, class471.field6741[var1], var4, class127.field1896[var1] - var4 - 1);
                    var10002 = class127.field1896[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 64)
    public static final void method1930(int arg0, String arg1, boolean arg2) {
        field4469++;
        if (arg1 == null) {
            return;
        }
        if (class363.field5180 >= 100) {
            class60.method639(4, class274.field4155.method1804(7175, class512.field7203), 65535);
            return;
        }
        String var3 = class563.method3220((byte) 121, arg1);
        if (var3 == null) {
            return;
        }
        if (arg0 < 76) {
            method1932((byte) 26);
        }
        for (int var4 = 0; var4 < class363.field5180; var4++) {
            String var9 = class563.method3220((byte) 116, class98.field1547[var4]);
            if (var9 != null && var9.equals(var3)) {
                class60.method639(4, arg1 + class274.field4156.method1804(7175, class512.field7203), 65535);
                return;
            }
            if (class484.field6879[var4] != null) {
                String var10 = class563.method3220((byte) 63, class484.field6879[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class60.method639(4, arg1 + class274.field4156.method1804(7175, class512.field7203), 65535);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class142.field2091; var5++) {
            String var7 = class563.method3220((byte) 62, class124.field1865[var5]);
            if (var7 != null && var7.equals(var3)) {
                class60.method639(4, class274.field4161.method1804(7175, class512.field7203) + arg1 + class274.field4162.method1804(7175, class512.field7203), 65535);
                return;
            }
            if (class668.field9444[var5] != null) {
                String var8 = class563.method3220((byte) 84, class668.field9444[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class60.method639(4, class274.field4161.method1804(7175, class512.field7203) + arg1 + class274.field4162.method1804(7175, class512.field7203), 65535);
                    return;
                }
            }
        }
        if (class563.method3220((byte) 88, class648.field9106.field6981).equals(var3)) {
            class60.method639(4, class274.field4158.method1804(7175, class512.field7203), 65535);
            return;
        }
        class157.field2267++;
        class135 var6 = class688.method3794(class83.field1367, class583.field8198, (byte) 38);
        var6.field1978.method3853((byte) 51, class652.method3606(12351, arg1) + 1);
        var6.field1978.method3837(4102, arg1);
        var6.field1978.method3853((byte) 51, arg2 ? 1 : 0);
        class19.method223(var6, 0);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 160)
    public static final void method1931(int arg0) {
        for (int var1 = arg0; var1 < class115.field1765.length; var1++) {
            for (int var2 = 0; var2 < class115.field1765[var1].length; var2++) {
                class115.field1765[var1][var2] = class439.field6403;
            }
        }
        field4473++;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V", line = 185)
    public static void method1932(byte arg0) {
        int var1 = 104 / ((arg0 - 70) / 41);
        field4468 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BD)V", line = 197)
    public static final void method1933(byte arg0, double arg1) {
        field4467++;
        if (class493.field7011 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class105.field1634[var3] = var4 <= 255 ? var4 : 255;
            }
            class493.field7011 = arg1;
        }
        if (arg0 >= -123) {
            field4468 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZB)V", line = 224)
    public static final void method1934(boolean arg0, byte arg1) {
        if (arg0) {
            if (class100.field1556 != -1) {
                class178.method1212(2, class100.field1556);
            }
            for (class320 var2 = (class320) class654.field9178.method1407(-99); var2 != null; var2 = (class320) class654.field9178.method1413(true)) {
                if (!var2.method3675(true)) {
                    var2 = (class320) class654.field9178.method1407(104);
                    if (var2 == null) {
                        break;
                    }
                }
                class224.method1484(false, true, true, var2);
            }
            class100.field1556 = -1;
            class654.field9178 = new class213(8);
            class53.method582((byte) 106);
            class100.field1556 = class309.field4581;
            class433.method2580((byte) -54, false);
            class158.method1100(106);
            class220.method1451(class100.field1556);
        }
        field4470++;
        class565.field7973 = "";
        class224.field3152 = "";
        class315.field4671 = false;
        class252.method1688(124);
        class190.field2750 = -1;
        class410.method2478((byte) 90, class200.field2826);
        class648.field9106 = new class491();
        class648.field9106.field3029 = class232.field3611 * 512 / 2;
        class648.field9106.field6271[0] = class199.field2812 / 2;
        class648.field9106.field3024 = class199.field2812 * 512 / 2;
        if (arg1 != -60) {
            method1934(true, (byte) 49);
        }
        class648.field9106.field6262[0] = class232.field3611 / 2;
        class413.field6011 = 0;
        class131.field1928 = 0;
        if (class43.field700 == 2) {
            class413.field6011 = class318.field4691 << 9;
            class131.field1928 = class467.field6718 << 9;
        } else {
            class623.method3465(arg1 ^ 0xFFFF90A3);
        }
        class646.method3587((byte) -120);
    }
}
