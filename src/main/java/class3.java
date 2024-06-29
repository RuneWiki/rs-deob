import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class3 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Loc;")
    public static class99 field45 = class48.method402((byte) -104, "(U3");

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lr;")
    public static class118 field51 = new class118(64);

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Loc;")
    public static class99 field52 = class48.method402((byte) -104, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Loc;")
    public static class99 field53 = class48.method402((byte) -104, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Loc;")
    public static class99 field59 = class48.method402((byte) -104, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Loc;")
    private static class99 field61 = class48.method402((byte) -104, "Take");

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
    public static int[] field60 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Loc;")
    private static class99 field57 = class48.method402((byte) -104, "Hide");

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Loc;")
    public static class99 field62 = field61;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Loc;")
    private static class99 field58 = class48.method402((byte) -104, "The server is being updated)3");

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Z")
    public static boolean field65 = false;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Loc;")
    public static class99 field67 = field58;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Loc;")
    private static class99 field68 = class48.method402((byte) -104, "Login server offline)3");

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Z")
    public static boolean field54 = false;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Loc;")
    public static class99 field69 = field57;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Loc;")
    public static class99 field64 = field68;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lib;")
    public static class57 field55;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method12(int arg0) {
        field47++;
        if (class105.field2593 == 0 || arg0 != -3) {
            return;
        }
        class115 var1 = client.field529;
        int var2 = 0;
        if (class67.field1719 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class81.field2003[var3] != null) {
                class99 var4 = class137.field3420[var3];
                byte var5 = 0;
                int var6 = class104.field2527[var3];
                if (var4 != null && var4.method851(0, class33.field801)) {
                    var4 = var4.method813(5, (byte) 103);
                    var5 = 1;
                }
                if (var4 != null && var4.method851(0, class95.field2311)) {
                    var4 = var4.method813(5, (byte) 121);
                    var5 = 2;
                }
                if ((var6 == 3 || var6 == 7) && (var6 == 7 || class84.field2096 == 0 || class84.field2096 == 1 && class2.method7(var4, (byte) -51))) {
                    int var7 = 329 - var2 * 13;
                    byte var8 = 4;
                    var1.method968(class73.field1843, var8, var7, 0);
                    var1.method968(class73.field1843, var8, var7 - 1, 65535);
                    var2++;
                    int var9 = var8 + var1.method974(class73.field1843);
                    int var10 = var9 + var1.method981(32);
                    if (var5 == 1) {
                        class79.field1955[0].method216(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class79.field1955[1].method216(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method968(class20.method189(new class99[] { var4, class5.field108, class81.field2003[var3] }, arg0 ^ 0xFFFFFFA3), var10, var7, 0);
                    var1.method968(class20.method189(new class99[] { var4, class5.field108, class81.field2003[var3] }, 101), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var6 == 5 && class84.field2096 < 2) {
                    int var11 = 329 - var2 * 13;
                    var1.method968(class81.field2003[var3], 4, var11, 0);
                    var2++;
                    var1.method968(class81.field2003[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var6 == 6 && class84.field2096 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method968(class20.method189(new class99[] { class69.field1778, class37.field948, var4, class5.field108, class81.field2003[var3] }, 93), 4, var12, 0);
                    var1.method968(class20.method189(new class99[] { class69.field1778, class37.field948, var4, class5.field108, class81.field2003[var3] }, 58), 4, var12 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lpc;III)Ldc;")
    public static final class24 method13(class105 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field55 = null;
        }
        field48++;
        return class95.method782(arg2, (byte) -99, arg0, arg3) ? class79.method687(0) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBII)V")
    public static final void method14(int arg0, byte arg1, int arg2, int arg3) {
        field63++;
        class54 var4 = class108.method927(arg0, arg3, 16777215);
        if (var4 != null && var4.field1373 != null) {
            class39.method321(var4, (byte) -54, 0, null, 0, var4.field1373, 0);
        }
        client.field520 = arg3;
        int var5 = 21 / ((43 - arg1) / 39);
        class121.field2957 = true;
        class111.field2774 = arg2;
        class37.field943 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method15(int arg0) {
        field46++;
        if (class27.field684 && class84.field2116 != class23.field560) {
            class136.method1134(class84.field2116, class82.field2040, class69.field1770.field3100[0], arg0 + 12078, class54.field1294, class69.field1770.field3096[0]);
            return;
        }
        if (class84.field2116 != class14.field352) {
            class14.field352 = class84.field2116;
            class63.method557(class84.field2116, (byte) 84);
        }
        if (arg0 != -11955) {
            field58 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static final void method16(int arg0) {
        if (arg0 == 0) {
            field50++;
            class59.field1591.method874((byte) 32);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public abstract void method17(int arg0);

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
    public abstract int method19(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method20(byte arg0) {
        field53 = null;
        field64 = null;
        field61 = null;
        field52 = null;
        field45 = null;
        field62 = null;
        field67 = null;
        if (arg0 > -12) {
            field58 = null;
        }
        field68 = null;
        field60 = null;
        field55 = null;
        field59 = null;
        field58 = null;
        field69 = null;
        field51 = null;
        field57 = null;
    }
}
