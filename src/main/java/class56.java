import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[S")
    public static short[] field1557 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1553 = -1;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lrd;")
    private static class117 field1558 = class95.method812("Too many incorrect logins from your address)3", (byte) 8);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lrd;")
    public static class117 field1564 = field1558;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[J")
    public static long[] field1551 = new long[200];

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lrd;")
    public static class117 field1570 = class95.method812("", (byte) 8);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lrd;")
    public static class117 field1562 = field1570;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lrd;")
    private static class117 field1569 = class95.method812("No reply from loginserver)3", (byte) 8);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lrd;")
    private static class117 field1563 = class95.method812("cyan:", (byte) 8);

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lrd;")
    private static class117 field1559 = class95.method812("Your ignore list is full)3 Max of 100 hit", (byte) 8);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lrd;")
    public static class117 field1556 = field1569;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Z")
    public static volatile boolean field1572 = false;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lrd;")
    public static class117 field1571 = field1563;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lrd;")
    public static class117 field1566 = field1570;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lrd;")
    public static class117 field1555 = field1559;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lrd;")
    public static class117 field1568 = field1563;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Lrd;")
    public static class117 field1574 = class95.method812("Sprites geladen)3", (byte) 8);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lrd;")
    public static class117 field1560 = field1570;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Lrd;")
    public static class117 field1575 = field1570;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lrd;")
    public static class117 field1552 = field1570;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lrd;")
    public static class117 field1561 = field1570;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lge;")
    public static class47 field1565;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lb;")
    public static class8 field1567;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method593(byte arg0) {
        field1573++;
        int var1 = class138.field3311;
        int var2 = class44.field1242;
        if (arg0 != -89) {
            field1563 = null;
        }
        int var3 = class107.field2657;
        int var4 = 6116423;
        int var5 = class83.field2178;
        class145.method1165(var1, var2, var5, var3, var4);
        class145.method1165(var1 + 1, var2 + 1, var5 - 2, 16, 0);
        class145.method1163(var1 + 1, var2 - -18, var5 - 2, var3 - 19, 0);
        class137.field3305.method215(class17.field424, var1 + 3, var2 + 14, var4);
        int var6 = class66.field1878;
        int var7 = class121.field2961;
        if (client.field613 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (client.field613 == 1) {
            var7 -= 553;
            var6 -= 205;
        }
        if (client.field613 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < class21.field604; var8++) {
            int var9 = 16777215;
            int var10 = (class21.field604 - var8 - 1) * 15 + var2 + 31;
            if (var7 > var1 && var7 < var1 + var5 && var10 - 13 < var6 && var6 < var10 + 3) {
                var9 = 16776960;
            }
            class137.field3305.method199(class35.field1051[var8], var1 + 3, var10, var9, true);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILwa;)Lwa;")
    public static final class144 method594(int arg0, class144 arg1) {
        if (arg0 < 102) {
            method594(121, null);
        }
        field1554++;
        class144 var2 = class49.method555(arg1, true);
        if (var2 == null) {
            var2 = arg1.field3528;
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public static void method595(byte arg0) {
        field1558 = null;
        field1574 = null;
        field1563 = null;
        field1556 = null;
        field1571 = null;
        if (arg0 != -119) {
            field1562 = null;
        }
        field1570 = null;
        field1566 = null;
        field1560 = null;
        field1552 = null;
        field1557 = null;
        field1551 = null;
        field1561 = null;
        field1567 = null;
        field1569 = null;
        field1562 = null;
        field1564 = null;
        field1565 = null;
        field1559 = null;
        field1555 = null;
        field1568 = null;
        field1575 = null;
    }
}
