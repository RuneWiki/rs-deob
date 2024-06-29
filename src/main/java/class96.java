import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class96 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1566 = -1;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Laf;")
    public static class68 field1569 = new class68(64);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lia;")
    public static class226 field1574;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILwe;)V")
    public static final void method710(int arg0, class15 arg1) {
        field1571++;
        if (arg0 != 29933) {
            return;
        }
        for (class97 var2 = (class97) class263.field4188.method843(114); var2 != null; var2 = (class97) class263.field4188.method852((byte) 123)) {
            if (var2.field1591 == arg1) {
                if (var2.field1596 != null) {
                    class195.field3123.method1707(var2.field1596);
                    var2.field1596 = null;
                }
                var2.method1388(58);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method711(int arg0) {
        field1569 = null;
        int var1 = 121 % ((arg0 + 59) / 61);
        field1574 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static final void method712(byte arg0) {
        class122.field1985 &= 0x7FF;
        int var1 = -2 % ((arg0 + 57) / 48);
        field1568++;
        int var2 = class282.field4472 >> 7;
        int var3 = class101.field1667 >> 7;
        if (class199.field3186 < 128) {
            class199.field3186 = 128;
        }
        if (class199.field3186 > 383) {
            class199.field3186 = 383;
        }
        int var4 = 0;
        int var5 = class225.method1583(class101.field1667, class282.field4472, class250.field3980, 0);
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = class250.field3980;
                    if (var8 < 3 && (class201.field3198[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = (class206.field3311[var8][var6][var7] & 0xFF) * 8 + var5 - class124.field2012[var8][var6][var7];
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (class97.field1594 < var10) {
            class97.field1594 += (var10 - class97.field1594) / 24;
        } else if (class97.field1594 > var10) {
            class97.field1594 += (var10 - class97.field1594) / 80;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method713(int arg0) {
        field1573++;
        for (int var1 = 0; var1 < 5; var1++) {
            class285.field4514[var1] = false;
        }
        class184.field2898 = -1;
        class229.field3786 = 1;
        class101.field1661 = 0;
        class7.field89 = -1;
        class213.field3486 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLqh;)Z")
    public static final boolean method714(int arg0, byte arg1, class201 arg2) {
        field1570++;
        byte[] var3 = arg2.method1367(-124, arg0);
        if (var3 == null) {
            return false;
        }
        if (arg1 < 55) {
            method710(104, (class15) null);
        }
        class197.method1335(var3, false);
        return true;
    }
}
