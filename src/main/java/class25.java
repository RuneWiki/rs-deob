import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field309 = -1;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lhn;")
    public static class509 field311 = new class509(94, -2);

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lgu;")
    public static class412 field314 = new class412(16);

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field315 = null;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lrg;")
    public class457 field312;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
    public int[] field308;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field310;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILuq;I)V", line = 7)
    public static final void method180(int arg0, int arg1, class114 arg2, int arg3) {
        if (class245.field3859) {
            class260 var4 = class108.field1514 == -1 ? null : class474.field6839.method3057(class108.field1514, (byte) 105);
            if (client.method1387(arg2).method2416((byte) -72) && (class366.field5390 & 0x20) != 0 && (var4 == null || arg2.method869(var4.field3981, class108.field1514, (byte) 82) != var4.field3981)) {
                class168.method1127(arg2.field1670, class190.field3206 + " -> " + arg2.field1600, arg2.field1630, arg2.field1644, true, 51, false, class412.field6176, arg3 ^ 0xFFFFFFC2, class424.field6317, 0L);
                class233.field3754++;
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class393.method2472(arg2, var5, arg3 - 18462);
                if (var9 != null) {
                    class168.method1127(arg2.field1670, arg2.field1600, arg2.field1630, arg2.field1644, true, 1007, false, var9, -108, class134.method981(arg2, true, var5), (long) (var5 + 1));
                    class469.field6775++;
                }
            }
            String var6 = class260.method1742(arg2, (byte) -115);
            if (var6 != null) {
                class514.field7466++;
                class168.method1127(arg2.field1670, arg2.field1600, arg2.field1630, arg2.field1644, true, 3, false, var6, -76, arg2.field1689, 0L);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class393.method2472(arg2, var7, -18462);
                if (var8 != null) {
                    class168.method1127(arg2.field1670, arg2.field1600, arg2.field1630, arg2.field1644, true, 22, false, var8, -89, class134.method981(arg2, true, var7), (long) (var7 + 1));
                    class469.field6775++;
                }
            }
            if (client.method1387(arg2).method2418((byte) -47)) {
                class108.field1504++;
                if (arg2.field1738 == null) {
                    class168.method1127(arg2.field1670, "", arg2.field1630, arg2.field1644, true, 2, false, class465.field6735.method1635(class224.field3673, (byte) 3), -125, -1, 0L);
                } else {
                    class168.method1127(arg2.field1670, "", arg2.field1630, arg2.field1644, true, 2, false, arg2.field1738, -128, -1, 0L);
                }
            }
        }
        if (arg3 == 0) {
            field313++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Lpd;", line = 85)
    public static final class172 method181(byte arg0, int arg1, int arg2) {
        field307++;
        int var3 = -12 % ((arg0 + 36) / 51);
        class172 var4 = new class172();
        var4.field2574 = arg1 + 1 + 5;
        var4.field2550 = arg2 + 6;
        var4.field2559 = -1;
        var4.field2565 = -1;
        var4.field2573 = new int[var4.field2550][var4.field2574];
        var4.method1161(37);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 121)
    public static void method182(int arg0) {
        if (arg0 < 53) {
            field316 = 31;
        }
        field314 = null;
        field311 = null;
        field315 = null;
    }
}
