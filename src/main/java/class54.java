import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class54 extends class2 {

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field1292 = 0;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field1286 = -1;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1284 = 0;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[I")
    public static int[] field1285 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1289 = 0;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "[I")
    public static int[] field1300 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lkc;")
    public static class67 field1293 = class19.method144("mapmarker", 81);

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field1298 = 127;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
    public static int[] field1297 = new int[2000];

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Lkc;")
    public static class67 field1290 = class19.method144("p11_full", 73);

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Loc;")
    public static class91 field1295 = new class91(5000);

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lkc;")
    public static class67 field1312 = class19.method144("Angreifen", 72);

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lkc;")
    public static class67 field1311 = class19.method144("Der Server wird gerade aktualisiert)3", 104);

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lac;")
    public static class4 field1282;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Lnd;")
    public static class86 field1307;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1313;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "[[B")
    public static byte[][] field1310;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[[Led;")
    public static class33[][] field1305;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method437(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 8)
    public static void method433(int arg0) {
        field1293 = null;
        field1312 = null;
        field1282 = null;
        field1297 = null;
        field1310 = null;
        field1295 = null;
        if (arg0 != -10000001) {
            return;
        }
        field1305 = null;
        field1285 = null;
        field1307 = null;
        field1290 = null;
        field1300 = null;
        field1311 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Lkc;", line = 33)
    public static final class67 method434(int arg0, byte arg1) {
        field1304++;
        if (arg0 < 100000) {
            return class71.method586(103, arg0);
        } else if (arg0 < 10000000) {
            return class63.method479(new class67[] { class71.method586(103, arg0 / 1000), class38.field865 }, 0);
        } else {
            if (arg1 > -10) {
                field1289 = -87;
            }
            return class63.method479(new class67[] { class71.method586(103, arg0 / 1000000), class49.field1185 }, 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V", line = 53)
    public static final void method435(boolean arg0) {
        field1283++;
        if (arg0) {
            field1311 = null;
        }
        if (class80.field1901 == null) {
            return;
        }
        long var1 = class82.method644(0);
        if (var1 <= class74.field1778) {
            return;
        }
        class80.field1901.method295(var1);
        int var3 = (int) (var1 - class74.field1778);
        class74.field1778 = var1;
        synchronized (field1313 == null ? (field1313 = method437("wb")) : field1313) {
            class31.field660 += class4.field55 * var3;
            int var5 = (class31.field660 - class4.field55 * 2000) / 1000;
            if (var5 > 0) {
                if (class112.field2598 != null) {
                    class112.field2598.method198(var5);
                }
                class31.field660 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 151)
    public static final void method436(byte arg0) {
        class30.field625.method378((byte) -104);
        field1306++;
        if (arg0 < 103) {
            method434(96, (byte) -110);
        }
        class33.field815.method378((byte) -101);
    }
}
