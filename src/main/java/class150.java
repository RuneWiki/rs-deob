import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class150 {

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lje;")
    private static class67 field3440 = class85.method592(255, "Loaded interfaces");

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lje;")
    public static class67 field3437 = class85.method592(255, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lje;")
    public static class67 field3434 = field3440;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[[S")
    public static short[][] field3446 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lje;")
    private static class67 field3447 = class85.method592(255, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lje;")
    public static class67 field3448 = field3447;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field3441;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILfd;I)Lkd;")
    public static final class73 method1147(int arg0, int arg1, class40 arg2, int arg3) {
        field3443++;
        if (method1149(arg2, arg3 ^ 0xFFFFD815, arg1, arg0)) {
            return arg3 == 10145 ? class31.method197((byte) -7) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)J")
    public static final synchronized long method1148(int arg0) {
        field3436++;
        if (arg0 != -85808345) {
            method1152(112, (byte) 88);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class148.field3390) {
            class52.field1043 += class148.field3390 - var1;
        }
        class148.field3390 = var1;
        return class52.field1043 + var1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lfd;III)Z")
    public static final boolean method1149(class40 arg0, int arg1, int arg2, int arg3) {
        field3444++;
        byte[] var4 = arg0.method267((byte) -124, arg2, arg3);
        if (var4 == null) {
            return false;
        } else if (arg1 > -59) {
            return true;
        } else {
            class127.method974(-53, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public static final void method1150(int arg0, int arg1, int arg2) {
        field3442++;
        if (class37.field668 != 2) {
            return;
        }
        if (arg1 < 48) {
            field3446 = null;
        }
        class71.method514((class79.field1747 - class130.field2863 << 7) + class42.field798, 1820713769, (class77.field1647 - class35.field647 << 7) + client.field403, class147.field3363 * 2);
        if (class148.field3401 > -1 && class34.field627 % 20 < 10) {
            class61.field1218[0].method916(arg2 + class148.field3401 - 12, arg0 + -28 + class142.field3281);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method1151(int arg0) {
        field3448 = null;
        field3434 = null;
        field3437 = null;
        field3440 = null;
        if (arg0 != 8526) {
            field3434 = null;
        }
        field3447 = null;
        field3446 = null;
        field3441 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lod;")
    public static final class101 method1152(int arg0, byte arg1) {
        int var2 = -80 / ((46 - arg1) / 57);
        field3433++;
        class101 var3 = (class101) class18.field341.method764((long) arg0, 24182);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class81.field1795.method267((byte) -124, 0, arg0);
        if (var4 == null) {
            return null;
        }
        class101 var5 = new class101();
        int var6 = 0;
        class91 var7 = new class91(var4);
        var7.field2043 = var7.field1991.length - 12;
        int var8 = var7.method631(-50);
        var5.field2257 = var7.method641(255);
        var5.field2261 = var7.method641(255);
        var5.field2285 = var7.method641(255);
        var5.field2278 = var7.method641(255);
        var7.field2043 = 0;
        var5.field2287 = var7.method624(-102);
        var5.field2263 = new int[var8];
        var5.field2268 = new class67[var8];
        var5.field2265 = new int[var8];
        while (var7.field1991.length - 12 > var7.field2043) {
            int var9 = var7.method641(255);
            if (var9 == 3) {
                var5.field2268[var6] = var7.method634(-1);
            } else if (var9 >= 100 || var9 == 21 || var9 == 38 || var9 == 39) {
                var5.field2263[var6] = var7.method649(false);
            } else {
                var5.field2263[var6] = var7.method631(-39);
            }
            var5.field2265[var6++] = var9;
        }
        class18.field341.method765((long) arg0, var5, (byte) -115);
        return var5;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static final void method1153(int arg0) {
        field3439++;
        if (!class38.field691 || arg0 != 8526) {
            return;
        }
        class72 var1 = class106.method836(class39.field708, class12.field224, arg0 - 8513);
        if (var1 != null && var1.field1564 != null) {
            class35 var2 = new class35();
            var2.field630 = var1.field1564;
            var2.field640 = var1;
            class71.method513((byte) 89, var2);
        }
        class38.field691 = false;
        class23.method160((byte) -29, var1);
    }
}
