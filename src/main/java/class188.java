import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class188 {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2600 = 0;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2602 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "F")
    public static float field2605;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Z")
    public static boolean field2599;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 5)
    public static void method1317(byte arg0) {
        field2602 = null;
        if (arg0 > -84) {
            method1319(-123, 46, -112, 80, -122, -20, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([II)[I", line = 35)
    public static final int[] method1318(int[] arg0, int arg1) {
        field2603++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class281.method1940(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIB)V", line = 54)
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class344 var7 = class20.method128(126, arg5, arg3);
        if (var7 != null && var7.field5260 != null) {
            class171 var8 = new class171();
            var8.field2333 = var7.field5260;
            var8.field2341 = var7;
            class314.method2145(112, var8);
        }
        class128.field1753 = arg1;
        class124.field1676 = true;
        class219.field3146 = arg3;
        field2601++;
        class52.field697 = arg5;
        class172.field2348 = arg4;
        int var9 = -26 / ((arg6 - 42) / 56);
        class273.field4091 = arg0;
        class42.field485 = arg2;
        class255.method1741(var7, false);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 90)
    public static final void method1320(byte arg0) {
        int var1 = 55 % ((arg0 - 36) / 58);
        for (class98 var2 = (class98) class291.field4344.method1335(1); var2 != null; var2 = (class98) class291.field4344.method1336(3)) {
            if (var2.field1329) {
                var2.method713((byte) -10);
            }
        }
        for (class98 var3 = (class98) class174.field2372.method1335(1); var3 != null; var3 = (class98) class174.field2372.method1336(3)) {
            if (var3.field1329) {
                var3.method713((byte) -10);
            }
        }
        field2598++;
    }
}
