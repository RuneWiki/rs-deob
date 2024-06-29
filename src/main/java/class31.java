import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lfa;")
    public static class32 field689 = new class32();

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lmc;")
    public static class75 field696 = class30.method234(true, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lmc;")
    public static class75 field698 = class30.method234(true, "Okay");

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lmc;")
    private static class75 field694 = class30.method234(true, "Loaded wordpack");

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lmc;")
    public static class75 field702 = field694;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lmc;")
    public static class75 field704 = class30.method234(true, "chatback");

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "J")
    public static long field701;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lja;")
    public static class55 field691;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lna;")
    public static class79 field703;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lp;")
    public static class90 field693;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    public static int[] field705;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 10)
    public static final void method240(int arg0, int arg1) {
        class7.field99 = arg1;
        field690++;
        if (arg0 != 29837) {
            method240(-73, -115);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 21)
    public static final void method241(int arg0) {
        field688++;
        if (class28.field595 == 0) {
            return;
        }
        if (arg0 != 13256) {
            method240(-65, 42);
        }
        int var1 = 0;
        class54 var2 = class114.field2869;
        if (class32.field727 != 0) {
            var1 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class21.field387[var3] != null) {
                int var4 = class63.field1670[var3];
                byte var5 = 0;
                class75 var6 = class117.field2900[var3];
                if (var6 != null && var6.method655(class59.field1527, arg0 - 13371)) {
                    var5 = 1;
                    var6 = var6.method645(5, (byte) 110);
                }
                if (var6 != null && var6.method655(class24.field469, arg0 ^ 0xFFFFCC48)) {
                    var5 = 2;
                    var6 = var6.method645(5, (byte) 110);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class37.field894 == 0 || class37.field894 == 1 && class87.method727(var6, (byte) -42))) {
                    byte var7 = 4;
                    int var8 = 329 - var1 * 13;
                    var1++;
                    var2.method423(class72.field1826, var7, var8, 0);
                    var2.method423(class72.field1826, var7, var8 - 1, 65535);
                    int var9 = var7 + var2.method410(class72.field1826);
                    int var10 = var9 + var2.method425(32);
                    if (var5 == 1) {
                        class109.field2769[0].method687(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class109.field2769[1].method687(var10, var8 - 12);
                        var10 += 14;
                    }
                    var2.method423(class69.method586(new class75[] { var6, class65.field1704, class21.field387[var3] }, (byte) 102), var10, var8, 0);
                    var2.method423(class69.method586(new class75[] { var6, class65.field1704, class21.field387[var3] }, (byte) 39), var10, var8 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class37.field894 < 2) {
                    int var11 = 329 - var1 * 13;
                    var1++;
                    var2.method423(class21.field387[var3], 4, var11, 0);
                    var2.method423(class21.field387[var3], 4, var11 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class37.field894 < 2) {
                    int var12 = 329 - var1 * 13;
                    var2.method423(class69.method586(new class75[] { class17.field335, class71.field1805, var6, class65.field1704, class21.field387[var3] }, (byte) 61), 4, var12, 0);
                    var2.method423(class69.method586(new class75[] { class17.field335, class71.field1805, var6, class65.field1704, class21.field387[var3] }, (byte) 45), 4, var12 - 1, 65535);
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmc;IILmc;)V", line = 180)
    public static final void method242(class75 arg0, int arg1, int arg2, class75 arg3) {
        field685++;
        if (class130.field3161 == -1) {
            class35.field841 = true;
        }
        if (arg1 == 0 && class55.field1377 != -1) {
            class97.field2435 = 0;
            class32.field732 = arg3;
        }
        if (arg2 != -1) {
            return;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class63.field1670[var4] = class63.field1670[var4 - 1];
            class117.field2900[var4] = class117.field2900[var4 - 1];
            class21.field387[var4] = class21.field387[var4 - 1];
        }
        class63.field1670[0] = arg1;
        class117.field2900[0] = arg0;
        class21.field387[0] = arg3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)Lmc;", line = 217)
    public static final class75 method243(int arg0, byte arg1, int arg2) {
        field687++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class28.field602;
        } else if (var3 < -6) {
            return class41.field987;
        } else if (var3 < -3) {
            return class90.field2187;
        } else if (var3 < 0) {
            return class69.field1758;
        } else if (var3 > 9) {
            return class55.field1404;
        } else if (var3 > 6) {
            return class38.field913;
        } else if (var3 > 3) {
            return class27.field539;
        } else if (arg1 == 92) {
            return var3 > 0 ? client.field376 : class119.field2934;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 293)
    public static void method244(int arg0) {
        field703 = null;
        int var1 = 86 % ((arg0 + 17) / 43);
        field694 = null;
        field689 = null;
        field696 = null;
        field704 = null;
        field702 = null;
        field705 = null;
        field693 = null;
        field698 = null;
        field691 = null;
    }
}
