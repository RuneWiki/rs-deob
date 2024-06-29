import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class22 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lva;")
    public static class288 field280 = new class288(8);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Ltq;")
    public static class376 field281;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field282;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBLon;I)V", line = 7)
    public static final void method159(int arg0, byte arg1, class184 arg2, int arg3) {
        if (!class279.field3951) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class281.method1858(arg2, arg1 ^ 0xFFFFBBD6, var4);
                if (var8 != null) {
                    class421.method2660(arg2.field2668, arg2.field2613, class441.method2754(arg2, arg1 ^ 0xFFFFFF9F, var4), var8, (long) (var4 + 1), arg2.field2584, 1006, (byte) 29);
                    class119.field1448++;
                }
            }
            String var5 = class170.method1144(arg1 - 2, arg2);
            if (var5 != null) {
                class421.method2660(arg2.field2668, arg2.field2613, arg2.field2513, var5, 0L, arg2.field2584, 23, (byte) 108);
                class161.field2127++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class281.method1858(arg2, -17459, var6);
                if (var7 != null) {
                    class119.field1448++;
                    class421.method2660(arg2.field2668, arg2.field2613, class441.method2754(arg2, arg1 - 153, var6), var7, (long) (var6 + 1), arg2.field2584, 5, (byte) 95);
                }
            }
            if (client.method1121(arg2).method1856(106)) {
                class232.field3260++;
                if (arg2.field2563 == null) {
                    class421.method2660(arg2.field2668, "", -1, class340.field4821.method2331(arg1 - 2, class271.field3836), 0L, arg2.field2584, 48, (byte) 89);
                } else {
                    class421.method2660(arg2.field2668, "", -1, arg2.field2563, 0L, arg2.field2584, 48, (byte) 120);
                }
            }
        } else if (client.method1121(arg2).method1857((byte) -80) && (class347.field4901 & 0x20) != 0) {
            class68.field780++;
            class421.method2660(arg2.field2668, class253.field3613 + " -> " + arg2.field2613, field279, class154.field1907, 0L, arg2.field2584, 17, (byte) 45);
        }
        field278++;
        if (arg1 != 27) {
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 92)
    public static void method160(int arg0) {
        field282 = null;
        field280 = null;
        field281 = null;
        if (arg0 != 0) {
            method160(70);
        }
    }
}
