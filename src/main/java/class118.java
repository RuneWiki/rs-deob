import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends RuntimeException {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Ljava/lang/String;")
    public String field2654;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2651;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2652 = 0;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lje;")
    public static class67 field2655 = class85.method592(255, "(Udns");

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lje;")
    private static class67 field2659 = class85.method592(255, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lje;")
    public static class67 field2660 = field2659;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lob;")
    public static class99 field2657 = new class99(64);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lje;")
    private static class67 field2665 = class85.method592(255, "red:");

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lje;")
    public static class67 field2662 = field2665;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lje;")
    public static class67 field2670 = class85.method592(255, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lje;")
    public static class67 field2664 = field2665;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Lje;")
    private static class67 field2666 = class85.method592(255, "Choose Option");

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lje;")
    public static class67 field2669 = field2666;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lje;")
    public static class67 field2668 = class85.method592(255, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Luf;")
    public static class145 field2663 = new class145(32);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lje;")
    public static class67 field2671 = class85.method592(255, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[I")
    public static int[] field2667;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
    public static final int method941(int arg0, int arg1, int arg2) {
        int var3 = -58 % ((arg1 - 4) / 54);
        field2658++;
        class117 var4 = (class117) class79.field1705.method1119(28254, (long) arg2);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field2638.length > arg0) {
            return var4.field2638[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method942(int arg0, int arg1) {
        field2653++;
        if (arg0 < 14) {
            return;
        }
        for (class84 var2 = (class84) class128.field2819.method1116(0); var2 != null; var2 = (class84) class128.field2819.method1124(-1)) {
            if ((long) arg1 == (var2.field300 >> 48 & 0xFFFFL)) {
                var2.method115(26851);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method943(int arg0) {
        if (arg0 != -28901) {
            return;
        }
        for (int var1 = 0; var1 < class86.field1903; var1++) {
            int var10002 = class129.field2845[var1]--;
            if (class129.field2845[var1] >= -10) {
                class124 var3 = class80.field1767[var1];
                if (var3 == null) {
                    var3 = class124.method967(class39.field709, class59.field1174[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class129.field2845[var1] += var3.method966();
                    class80.field1767[var1] = var3;
                }
                if (class129.field2845[var1] < 0) {
                    int var10;
                    if (class145.field3352[var1] == 0) {
                        var10 = class82.field1801;
                    } else {
                        int var4 = class145.field3352[var1] >> 8 & 0xFF;
                        int var5 = class145.field3352[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class37.field667.field2957;
                        int var7 = (class145.field3352[var1] & 0xFF) * 128;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var4 * 128 + 64 - class37.field667.field2963;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var7) {
                            class129.field2845[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var7 - var9) * class129.field2842 / var7;
                    }
                    if (var10 > 0) {
                        class125 var11 = var3.method968().method969(client.field383);
                        class94 var12 = class94.method717(var11, 100, var10);
                        var12.method730(class127.field2783[var1] - 1);
                        class95.field2132.method554(var12);
                    }
                    class129.field2845[var1] = -100;
                }
            } else {
                class86.field1903--;
                for (int var2 = var1; var2 < class86.field1903; var2++) {
                    class59.field1174[var2] = class59.field1174[var2 + 1];
                    class80.field1767[var2] = class80.field1767[var2 + 1];
                    class127.field2783[var2] = class127.field2783[var2 + 1];
                    class129.field2845[var2] = class129.field2845[var2 + 1];
                    class145.field3352[var2] = class145.field3352[var2 + 1];
                }
                var1--;
            }
        }
        if (class105.field2404 && !class69.method507((byte) -7)) {
            if (class99.field2203 != 0 && class97.field2171 != -1) {
                class64.method435(false, class97.field2171, 0, class76.field1640, (byte) 110, class99.field2203);
            }
            class105.field2404 = false;
        }
        field2661++;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class118(Throwable arg0, String arg1) {
        this.field2654 = arg1;
        this.field2651 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static void method944(int arg0) {
        field2665 = null;
        field2669 = null;
        field2666 = null;
        field2668 = null;
        field2655 = null;
        if (arg0 != -1) {
            method941(-11, 4, -23);
        }
        field2670 = null;
        field2657 = null;
        field2663 = null;
        field2659 = null;
        field2660 = null;
        field2671 = null;
        field2667 = null;
        field2662 = null;
        field2664 = null;
    }
}
