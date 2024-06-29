import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class177 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[S")
    public static short[] field2775 = new short[256];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2779 = null;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Z")
    public static boolean field2778 = false;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lja;")
    public static class64 field2777;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1316(byte arg0) {
        field2776++;
        int var1 = 8 % ((-arg0 - 47) / 49);
        while (class267.field4132.method237((byte) -125, class45.field779) >= 27) {
            int var2 = class267.field4132.method240(15, -70);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class138.field2196[var2] == null) {
                var3 = true;
                class138.field2196[var2] = new class305();
            }
            class305 var4 = class138.field2196[var2];
            class145.field2279[class77.field1173++] = var2;
            var4.field1462 = class205.field3252;
            if (var4.field4778 != null && var4.field4778.method1513(true)) {
                class13.method117(var4, 32);
            }
            int var5 = class288.field4391[class267.field4132.method240(3, -111)];
            if (var3) {
                var4.field1395 = var4.field1443 = var5;
            }
            int var6 = class267.field4132.method240(5, -75);
            int var7 = class267.field4132.method240(1, -86);
            var4.method2112(class17.method145((byte) 48, class267.field4132.method240(14, -100)), (byte) 119);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class267.field4132.method240(5, -77);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class267.field4132.method240(1, -56);
            if (var9 == 1) {
                class231.field3673[class75.field1160++] = var2;
            }
            var4.method643(var4.field4778.field3292, (byte) -93);
            var4.field1405 = var4.field4778.field3276;
            var4.field1384 = var4.field4778.field3319;
            if (var4.field1384 == 0) {
                var4.field1443 = 0;
            }
            var4.method639(21696, class19.field356.field1388[0] + var6, var4.method200(-1), class19.field356.field1386[0] + var8, var7 == 1);
            if (var4.field4778.method1513(true)) {
                class272.method1962((byte) -104, var4.field1388[0], 0, var4, (class6) null, (class30) null, class41.field734, var4.field1386[0]);
            }
        }
        class267.field4132.method238(7);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 93)
    public static void method1317(boolean arg0) {
        field2775 = null;
        if (arg0) {
            field2780 = -81;
        }
        field2777 = null;
        field2779 = null;
    }
}
