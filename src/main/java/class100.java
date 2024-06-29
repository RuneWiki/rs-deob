import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lv;")
    public static class146 field2419 = class159.method1226((byte) -37, "cross");

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lv;")
    public static class146 field2422 = class159.method1226((byte) -37, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lv;")
    private static class146 field2425 = class159.method1226((byte) -37, "Prepared sound engine");

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lv;")
    public static class146 field2429 = field2425;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lv;")
    public static class146 field2428 = class159.method1226((byte) -37, "Hierhin gehen");

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lv;")
    public static class146 field2427 = class159.method1226((byte) -37, ":chalreq:");

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lv;")
    public static class146 field2432 = class159.method1226((byte) -37, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[I")
    public static int[] field2433 = new int[200];

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2439 = 0;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[[[B")
    public static byte[][][] field2423;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
    public static final void method829(byte arg0, int arg1) {
        int var2 = -118 / ((arg0 + 23) / 33);
        if (class58.field1300 == 0) {
            class35.field760.method536(arg1, -104);
        } else {
            class132.field3010 = arg1;
        }
        field2420++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lqe;")
    public static final class116 method830(int arg0, int arg1) {
        field2434++;
        class116 var2 = (class116) class8.field155.method1045((long) arg0, 123);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class73.field1704.method585(13, arg1 ^ 0xFFFFB744, arg0);
        class116 var4 = new class116();
        var4.field2701 = arg0;
        if (var3 != null) {
            var4.method894((byte) -38, new class95(var3));
        }
        if (arg1 != -18626) {
            method831(-87);
        }
        class8.field155.method1047(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method831(int arg0) {
        if (arg0 != 20096) {
            method831(-58);
        }
        field2438++;
        class35.field760.method561(-17);
        class33.field693 = null;
        class58.field1300 = 1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILdd;)Ldd;")
    public static final class26 method832(int arg0, class26 arg1) {
        field2426++;
        int var2 = class121.method916((byte) -77, class42.method281(arg1, arg0 ^ 0x4D74B64C));
        if (var2 == 0) {
            return null;
        }
        if (arg0 != 3116) {
            field2428 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class64.method466(-1922515024, arg1.field498);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
    public static final void method833(int arg0, byte arg1, int arg2) {
        field2431++;
        int[] var3 = new int[4];
        var3[0] = arg2;
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg0;
        if (arg1 != -87) {
            field2424 = 26;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            if (class72.field1689[var6] != arg2) {
                var3[var4] = class72.field1689[var6];
                var5[var4] = class29.field604[var6];
                var4++;
            }
        }
        class29.field604 = var5;
        class72.field1689 = var3;
        class117.method897(class29.field604, class97.field2337, class97.field2337.length - 1, class72.field1689, 0, arg1 + 86);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method834(byte arg0) {
        field2419 = null;
        if (arg0 > -39) {
            field2427 = null;
        }
        field2422 = null;
        field2432 = null;
        field2428 = null;
        field2429 = null;
        field2423 = null;
        field2427 = null;
        field2433 = null;
        field2425 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lla;Lv;Lv;B)[Lue;")
    public static final class144[] method835(class77 arg0, class146 arg1, class146 arg2, byte arg3) {
        int var4 = arg0.method593(92, arg2);
        int var5 = arg0.method592(arg1, 125, var4);
        if (arg3 > -116) {
            return null;
        } else {
            field2435++;
            return class66.method472(arg0, true, var4, var5);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILla;II)Lie;")
    public static final class61 method836(int arg0, class77 arg1, int arg2, int arg3) {
        field2421++;
        if (class1.method3(arg3, arg2, -107, arg1)) {
            return arg0 == 10764 ? class118.method903((byte) -40) : null;
        } else {
            return null;
        }
    }
}
