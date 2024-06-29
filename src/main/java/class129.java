import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class129 {

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lvd;")
    private static class222 field2511 = class212.method1357("Username: ", 10731);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2509 = 0;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lvd;")
    public static class222 field2510 = field2511;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field2516 = 0;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lvd;")
    public static class222 field2515 = class212.method1357("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 10731);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lvd;")
    public static class222 field2518 = class212.method1357("huffman", 10731);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[[B")
    public static byte[][] field2513;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V")
    public static final void method813(boolean arg0, int arg1) {
        if (class17.field432.field1353 >> 7 == class131.field2537 && class17.field432.field1360 >> 7 == class214.field3973) {
            class131.field2537 = 0;
        }
        int var2 = class38.field859;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            long var4;
            class38 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class17.field432;
            } else {
                var4 = (long) class122.field2328[var3] << 32;
                var6 = class54.field1024[class122.field2328[var3]];
            }
            if (var6 != null && var6.method306(-34)) {
                var6.field857 = false;
                if ((class122.field2331 && class38.field859 > 50 || class38.field859 > 200) && !arg0 && var6.field1370 == var6.field1322) {
                    var6.field857 = true;
                }
                int var7 = var6.field1353 >> 7;
                int var8 = var6.field1360 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field844 == null || class175.field3280 < var6.field841 || var6.field833 <= class175.field3280) {
                        if ((var6.field1353 & 0x7F) == 64 && (var6.field1360 & 0x7F) == 64) {
                            if (class227.field4264[var7][var8] == class228.field4287) {
                                continue;
                            }
                            class227.field4264[var7][var8] = class228.field4287;
                        }
                        var6.field1308 = class71.method482(var6.field1360, var6.field1353, class217.field4036, (byte) 126);
                        class6.method57(class217.field4036, var6.field1353, var6.field1360, var6.field1308, 60, var6, var6.field1365, var4, var6.field1344);
                    } else {
                        var6.field857 = false;
                        var6.field1308 = class71.method482(var6.field1360, var6.field1353, class217.field4036, (byte) 121);
                        class26.method227(class217.field4036, var6.field1353, var6.field1360, var6.field1308, var6, var6.field1365, var4, var6.field843, var6.field846, var6.field830, var6.field847);
                    }
                }
            }
        }
        field2507++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method814(int arg0) {
        if (arg0 != 0) {
            method813(true, -1);
        }
        field2511 = null;
        field2515 = null;
        field2518 = null;
        field2510 = null;
        field2513 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method815(int arg0) {
        field2512++;
        int[] var1 = new int[class173.field3245];
        int var2 = 0;
        if (arg0 > -80) {
            field2518 = null;
        }
        for (int var3 = 0; var3 < class173.field3245; var3++) {
            class204 var5 = class112.method728(var3, (byte) 119);
            if (var5.field3747 >= 0 || var5.field3780 >= 0) {
                var1[var2++] = var3;
            }
        }
        class118.field2239 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class118.field2239[var4] = var1[var4];
        }
    }
}
