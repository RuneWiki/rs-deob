import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lv;")
    public static class146 field2200 = class159.method1226((byte) -37, ":trade:");

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Ldd;")
    public static class26 field2207 = null;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lv;")
    public static class146 field2206 = class159.method1226((byte) -37, ")4l");

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
    public static int[] field2214 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lv;")
    private static class146 field2212 = class159.method1226((byte) -37, "Could not complete login)3");

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lv;")
    public static class146 field2205 = class159.method1226((byte) -37, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lv;")
    public static class146 field2204 = field2212;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lqb;")
    public static class113 field2199;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method732(int arg0) {
        field2206 = null;
        if (arg0 != -29461) {
            method736(-5, -104, 83, -89, null);
        }
        field2214 = null;
        field2204 = null;
        field2205 = null;
        field2200 = null;
        field2199 = null;
        field2207 = null;
        field2212 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lbe;")
    public static final class13 method733(int arg0, int arg1) {
        field2211++;
        class13 var2 = (class13) class81.field1963.method1045((long) arg0, arg1 + 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class143.field3278.method585(1, 124, arg0);
        class13 var4 = new class13();
        if (var3 != null) {
            var4.method80(arg0, -1, new class95(var3));
        }
        var4.method81(1492795248);
        if (arg1 == 0) {
            class81.field1963.method1047(-1, var4, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLv;)V")
    public static final void method734(byte arg0, class146 arg1) {
        field2213++;
        if (class32.field672 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1101(-51);
        if (var3 == 0L) {
            return;
        }
        int var5 = -88 % ((-arg0 - 73) / 53);
        while (var2 < class32.field672.length && class32.field672[var2].field679 != var3) {
            var2++;
        }
        if (var2 < class32.field672.length && class32.field672[var2] != null) {
            class82.field1990.method265((byte) -85, 23);
            class157.field3621++;
            class82.field1990.method746(class32.field672[var2].field679, 1101310632);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ldd;B)Ldd;")
    public static final class26 method735(class26 arg0, byte arg1) {
        if (arg1 != 106) {
            field2200 = null;
        }
        class26 var2 = class100.method832(arg1 + 3010, arg0);
        field2209++;
        if (var2 == null) {
            var2 = arg0.field453;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILv;)V")
    public static final void method736(int arg0, int arg1, int arg2, int arg3, class146 arg4) {
        class26 var5 = class74.method551(arg0, arg1, -32540);
        field2215++;
        if (var5 == null) {
            return;
        }
        if (var5.field559 != null) {
            class120 var6 = new class120();
            var6.field2790 = var5.field559;
            var6.field2792 = arg4;
            var6.field2787 = var5;
            var6.field2803 = arg2;
            class25.method157(var6, 5);
        }
        boolean var7 = true;
        if (var5.field442 > 0) {
            var7 = class94.method737(var5, -19443);
        }
        if (!var7 || !class124.method930(arg2 - 1, class42.method281(var5, 1299495520), (byte) 126)) {
            return;
        }
        if (arg2 == 1) {
            class105.field2532++;
            class82.field1990.method265((byte) -85, 162);
            class82.field1990.method788(arg1, -730641264);
            class82.field1990.method766(arg0, (byte) 114);
        }
        if (arg3 != -2625) {
            field2199 = null;
        }
        if (arg2 == 2) {
            class101.field2450++;
            class82.field1990.method265((byte) -85, 153);
            class82.field1990.method788(arg1, arg3 ^ 0x2B8CB92F);
            class82.field1990.method766(arg0, (byte) 124);
        }
        if (arg2 == 3) {
            class82.field1990.method265((byte) -85, 251);
            class34.field729++;
            class82.field1990.method788(arg1, arg3 - 730638639);
            class82.field1990.method766(arg0, (byte) 115);
        }
        if (arg2 == 4) {
            class110.field2602++;
            class82.field1990.method265((byte) -85, 60);
            class82.field1990.method788(arg1, -730641264);
            class82.field1990.method766(arg0, (byte) 121);
        }
        if (arg2 == 5) {
            class150.field3469++;
            class82.field1990.method265((byte) -85, 170);
            class82.field1990.method788(arg1, arg3 - 730638639);
            class82.field1990.method766(arg0, (byte) 120);
        }
        if (arg2 == 6) {
            class134.field3049++;
            class82.field1990.method265((byte) -85, 180);
            class82.field1990.method788(arg1, arg3 - 730638639);
            class82.field1990.method766(arg0, (byte) 118);
        }
        if (arg2 == 7) {
            class82.field1990.method265((byte) -85, 31);
            class82.field1990.method788(arg1, -730641264);
            class159.field3646++;
            class82.field1990.method766(arg0, (byte) 117);
        }
        if (arg2 == 8) {
            class44.field987++;
            class82.field1990.method265((byte) -85, 28);
            class82.field1990.method788(arg1, -730641264);
            class82.field1990.method766(arg0, (byte) 114);
        }
        if (arg2 == 9) {
            class82.field1990.method265((byte) -85, 160);
            class135.field3075++;
            class82.field1990.method788(arg1, arg3 ^ 0x2B8CB92F);
            class82.field1990.method766(arg0, (byte) 127);
        }
        if (arg2 == 10) {
            class100.field2437++;
            class82.field1990.method265((byte) -85, 132);
            class82.field1990.method788(arg1, -730641264);
            class82.field1990.method766(arg0, (byte) 124);
        }
    }
}
