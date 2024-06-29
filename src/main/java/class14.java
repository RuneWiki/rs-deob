import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class14 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static volatile int field367 = 0;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lv;")
    private static class122 field365 = class55.method425(-61, "wishes to duel with you)3");

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lv;")
    public static class122 field364 = field365;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lv;")
    public static class122 field366 = class55.method425(-95, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lv;")
    private static class122 field369 = class55.method425(-124, "Continue");

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lv;")
    public static class122 field358 = field369;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lv;")
    public static class122 field370 = class55.method425(-103, "(U5");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lvc;")
    public static class125 field372 = new class125(5000);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[B")
    public static byte[] field359;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[[[B")
    public static byte[][][] field362;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)Lh;", line = 8)
    public static final class42 method124(byte arg0, int arg1) {
        field368++;
        class42 var2 = (class42) class54.field1383.method436(-99, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 52) {
            byte[] var3 = class5.field128.method611(arg0 - 52, 6, arg1);
            class42 var4 = new class42();
            var4.field1113 = arg1;
            if (var3 != null) {
                var4.method365((byte) -87, new class64(var3));
            }
            var4.method362((byte) -89);
            if (var4.field1077) {
                var4.field1075 = false;
                var4.field1102 = false;
            }
            class54.field1383.method437((long) arg1, var4, (byte) 69);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 40)
    public static final void method125(byte arg0) {
        int var1 = 94 / ((-arg0 - 63) / 47);
        field371++;
        int var2 = class103.field2545.method809(class74.field2001);
        for (int var3 = 0; var3 < class51.field1313; var3++) {
            int var11 = class103.field2545.method808(class23.field617[var3]);
            if (var2 < var11) {
                var2 = var11;
            }
        }
        int var4 = class51.field1313 * 15 + 21;
        var2 += 8;
        if (class125.field3049 > 4 && class34.field865 > 4 && class125.field3049 < 516 && class34.field865 < 338) {
            class50.field1261 = true;
            class55.field1424 = class51.field1313 * 15 + 22;
            class7.field176 = 0;
            class38.field1003 = var2;
            int var5 = class125.field3049 - var2 / 2 - 4;
            if (var5 + var2 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class16.field409 = var5;
            int var6 = class34.field865 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            class2.field85 = var6;
        }
        if (class125.field3049 > 553 && class34.field865 > 205 && class125.field3049 < 743 && class34.field865 < 466) {
            class38.field1003 = var2;
            class55.field1424 = class51.field1313 * 15 + 22;
            class7.field176 = 1;
            class50.field1261 = true;
            int var7 = class125.field3049 - var2 / 2 - 553;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            class16.field409 = var7;
            int var8 = class34.field865 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            class2.field85 = var8;
        }
        if (class125.field3049 <= 17 || class34.field865 <= 357 || class125.field3049 >= 496 || class34.field865 >= 453) {
            return;
        }
        class50.field1261 = true;
        class38.field1003 = var2;
        int var9 = class125.field3049 - var2 / 2 - 17;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 + var2 > 479) {
            var9 = 479 - var2;
        }
        class16.field409 = var9;
        class55.field1424 = class51.field1313 * 15 + 22;
        int var10 = class34.field865 - 357;
        if (var10 < 0) {
            var10 = 0;
        } else if (var10 + var4 > 96) {
            var10 = 96 - var4;
        }
        class7.field176 = 2;
        class2.field85 = var10;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 158)
    public static void method126(byte arg0) {
        field364 = null;
        field370 = null;
        field358 = null;
        field369 = null;
        if (arg0 <= 75) {
            return;
        }
        field365 = null;
        field366 = null;
        field372 = null;
        field359 = null;
        field362 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lge;", line = 225)
    public static final class41 method127(int arg0, byte arg1) {
        field357++;
        class41 var2 = (class41) class106.field2611.method436(-65, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field686.method611(0, 1, arg0);
        if (arg1 != -122) {
            method124((byte) -75, 125);
        }
        class41 var4 = new class41();
        if (var3 != null) {
            var4.method352(new class64(var3), arg0, (byte) -95);
        }
        var4.method347(4);
        class106.field2611.method437((long) arg0, var4, (byte) 69);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
    public abstract int method56(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public abstract void method57(int arg0);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public abstract void method54(boolean arg0);
}
