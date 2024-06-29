import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class318 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
    public static boolean field4370 = false;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lqj;")
    public static class296 field4371;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
    public static final int method2024(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4374++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            if (arg1 >= -124) {
                method2025((byte) -89);
            }
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method2025(byte arg0) {
        field4371 = null;
        if (arg0 < 119) {
            method2026(-102, (String) null, -24, (String) null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2026(int arg0, String arg1, int arg2, String arg3) {
        field4373++;
        class152.field2155 = arg1;
        class401.field5853 = arg0;
        class401.field5857 = arg3;
        if (class152.field2155.equals("") || class401.field5857.equals("")) {
            class163.field2296 = 3;
        } else if (class393.field5755 == -1) {
            class163.field2296 = -3;
            class230.field3071 = 0;
            class430.field6193 = 1;
            class286.field3940 = 0;
            class371 var4 = new class371(128);
            var4.method2396(10, 12450);
            var4.method2386((int) (Math.random() * 9.9999999E7D), 19324);
            var4.method2409(class3.method17((byte) -93, class152.field2155), true);
            var4.method2386((int) (Math.random() * 9.9999999E7D), 19324);
            var4.method2412(-72, class401.field5857);
            var4.method2386((int) (Math.random() * 9.9999999E7D), 19324);
            var4.method2380(class163.field2289, class184.field2577, -16385);
            class442.field6400.field5273 = 0;
            class442.field6400.method2396(24, 12450);
            class442.field6400.method2396(var4.field5273 + 2, arg2 + 12450);
            class442.field6400.method2416(22064, 563);
            class442.field6400.method2434(var4.field5258, 713288968, arg2, var4.field5273);
        } else {
            class5.method39(32343);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public static final void method2027(int arg0, int arg1, int arg2) {
        class142 var3 = class5.field79[arg0][arg1][arg2];
        if (var3 != null && var3.field2047 != null) {
            var3.field2047 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public static int method2028(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
