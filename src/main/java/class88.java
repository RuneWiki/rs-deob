import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class88 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field1556 = -1;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field1552 = 99;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lsb;")
    public static class98 field1566 = class47.method368(" <col=ffffff>", 0);

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field1563 = -1;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lvf;")
    public static class48 field1554 = new class48();

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lsb;")
    private static class98 field1568 = class47.method368("red:", 0);

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[J")
    public static long[] field1569 = new long[500];

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lsb;")
    public static class98 field1570 = class47.method368("mapflag", 0);

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lsb;")
    public static class98 field1571 = field1568;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lsb;")
    public static class98 field1572 = field1568;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method655(int arg0, int arg1) {
        field1560++;
        if (arg1 != 0) {
            method655(-50, 92);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
    public static final void method656() {
        for (int var0 = 0; var0 < class198.field3406; var0++) {
            class14 var1 = class105.field1877[var0];
            client.method778(var1);
            class105.field1877[var0] = null;
        }
        class198.field3406 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z[BII)Z")
    public static final boolean method657(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field1557++;
        boolean var4 = true;
        if (arg0) {
            field1568 = null;
        }
        class216 var5 = new class216(arg1);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method1485(false);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1482(26084);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = arg2 + var13;
                    int var15 = var5.method1446(5350) >> 2;
                    int var16 = arg3 + var12;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class21 var17 = class125.method929(var6, (byte) -78);
                        if (var15 != 22 || class104.field1848 || var17.field396 != 0 || var17.field442 == 1 || var17.field400) {
                            var9 = true;
                            if (!var17.method225((byte) -26)) {
                                class138.field2443++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method1482(26084);
                if (var10 == 0) {
                    break;
                }
                var5.method1446(5350);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method658(byte arg0) {
        field1572 = null;
        field1568 = null;
        field1554 = null;
        field1566 = null;
        field1571 = null;
        if (arg0 >= 96) {
            field1570 = null;
            field1569 = null;
        }
    }
}
