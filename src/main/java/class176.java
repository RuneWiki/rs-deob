import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class176 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lcd;")
    private static class23 field3500 = class54.method414("Login", -1);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[I")
    public static int[] field3502 = new int[1000];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lcd;")
    public static class23 field3498 = class54.method414("compass", -1);

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lcd;")
    public static class23 field3503 = class54.method414(" loggt sich ein)3", -1);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lcd;")
    public static class23 field3501 = field3500;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lve;")
    public static class193 field3499 = new class193();

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[II)I")
    public static final int method1105(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != 100) {
            field3498 = null;
        }
        field3505++;
        return arg2[1] * arg0 + arg2[0] * arg3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        int var1 = class134.field2790.field215 + class27.field568;
        field3506++;
        if (class110.field2340[98]) {
            class172.field3423 += (12 - class172.field3423) / 2;
        } else if (class110.field2340[99]) {
            class172.field3423 += (-class172.field3423 - 12) / 2;
        } else {
            class172.field3423 /= 2;
        }
        if (class110.field2340[96]) {
            class203.field4002 += (-class203.field4002 - 24) / 2;
        } else if (class110.field2340[97]) {
            class203.field4002 += (24 - class203.field4002) / 2;
        } else {
            class203.field4002 /= 2;
        }
        class13.field297 += class172.field3423 / 2;
        if (class13.field297 < 128) {
            class13.field297 = 128;
        }
        if (class13.field297 > 383) {
            class13.field297 = 383;
        }
        int var2 = class180.field3561 + class134.field2790.field277;
        if (class70.field1630 - var1 < -500 || class70.field1630 - var1 > 500 || class66.field1556 - var2 < -500 || class66.field1556 - var2 > 500) {
            class66.field1556 = var2;
            class70.field1630 = var1;
        }
        class48.field1155 = class203.field4002 / 2 + class48.field1155 & 0x7FF;
        if (class66.field1556 != var2) {
            class66.field1556 += (var2 - class66.field1556) / 16;
        }
        if (class70.field1630 != var1) {
            class70.field1630 += (var1 - class70.field1630) / 16;
        }
        int var3 = class70.field1630 >> 7;
        if (arg0 >= -35) {
            field3500 = null;
        }
        int var4 = class66.field1556 >> 7;
        int var5 = class203.method1330((byte) -88, class66.field1556, class70.field1630, class59.field1385);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class59.field1385;
                    if (var9 < 3 && (class53.field1253[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var5 - class182.field3596[var9][var7][var8];
                    if (var10 > var6) {
                        var6 = var10;
                    }
                }
            }
        }
        int var11 = var6 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class57.field1346) {
            class57.field1346 += (var11 - class57.field1346) / 24;
        } else if (var11 < class57.field1346) {
            class57.field1346 += (var11 - class57.field1346) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1107(byte arg0) {
        field3500 = null;
        field3499 = null;
        if (arg0 <= 44) {
            field3502 = null;
        }
        field3502 = null;
        field3501 = null;
        field3503 = null;
        field3498 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)Z")
    public static final boolean method1108(int arg0, byte arg1) {
        if (arg1 != -111) {
            field3502 = null;
        }
        field3507++;
        return arg0 >= 48 && arg0 <= 57;
    }
}
