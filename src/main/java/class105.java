import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 extends class143 {

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "Lu;")
    private static class135 field2519 = class87.method676((byte) -126, "Prepared sound engine");

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
    public static int field2517 = 0;

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lu;")
    private static class135 field2521 = class87.method676((byte) -76, "Enter your username (V password)3");

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "Lu;")
    public static class135 field2520 = field2519;

    @OriginalMember(owner = "client!pa", name = "ub", descriptor = "Lu;")
    public static class135 field2524 = field2521;

    @OriginalMember(owner = "client!pa", name = "xb", descriptor = "Lu;")
    public static class135 field2527 = class87.method676((byte) -65, "mapmarker");

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!pa", name = "vb", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!pa", name = "wb", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!pa", name = "zb", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!pa", name = "Ab", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!pa", name = "Bb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Lfc;")
    public static class39 field2516;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "Lg;")
    public static class43 field2523;

    @OriginalMember(owner = "client!pa", name = "yb", descriptor = "[[Lve;")
    public static class146[][] field2528;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
    public static final int method853(int arg0, byte arg1) {
        if (arg1 >= -93) {
            field2519 = null;
        }
        field2525++;
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
    public static final void method854(boolean arg0, int arg1) {
        if (arg1 != -1) {
            method854(true, -21);
        }
        for (int var2 = 0; var2 < class34.field790; var2++) {
            class111 var3 = class96.field2340[class47.field1124[var2]];
            int var4 = (class47.field1124[var2] << 14) + 536870912;
            if (var3 != null && var3.method45((byte) 55) && arg0 == var3.field2697.field1301 && var3.field2697.method425(850)) {
                int var5 = var3.field172 >> 7;
                int var6 = var3.field173 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field210 == 1 && (var3.field173 & 0x7F) == 64 && (var3.field172 & 0x7F) == 64) {
                        if (class65.field1624[var6][var5] == class69.field1704) {
                            continue;
                        }
                        class65.field1624[var6][var5] = class69.field1704;
                    }
                    if (!var3.field2697.field1330) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class100.field2418.method1018(class136.field3301, var3.field173, var3.field172, class20.method148((var3.field210 - 1) * 64 + var3.field173, var3.field172 - -((var3.field210 + -1) * 64), class136.field3301, -2), var3.field210 * 64 + 60 - 64, var3, var3.field230, var4, var3.field156);
                }
            }
        }
        field2529++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)Lna;")
    public final class91 method273(byte arg0) {
        field2531++;
        int var2 = 27 / ((-arg0 - 59) / 51);
        return class41.method306(-93, this.field2530).method774(-109, this.field2518);
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)Lae;")
    public static final class6 method855(int arg0) {
        field2526++;
        class6 var1 = new class6();
        var1.field131 = class69.field1696;
        var1.field137 = class29.field699[0];
        var1.field132 = class86.field2061[0];
        var1.field136 = class80.field1918;
        var1.field133 = class48.field1140;
        var1.field138 = class59.field1451[0];
        var1.field134 = client.field533[0];
        var1.field135 = class107.field2567[0];
        class43.method320(1);
        if (arg0 <= 25) {
            method855(56);
        }
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public static void method856(int arg0) {
        field2524 = null;
        field2519 = null;
        field2521 = null;
        field2528 = null;
        field2527 = null;
        field2523 = null;
        if (arg0 != 536870912) {
            method853(-43, (byte) 104);
        }
        field2520 = null;
        field2516 = null;
    }
}
