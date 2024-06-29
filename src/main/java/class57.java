import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class119 {

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public int field1276 = 0;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "[I")
    public static int[] field1272 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "J")
    public static long field1277 = 0L;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lv;")
    private static class146 field1278 = class159.method1226((byte) -37, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Lv;")
    private static class146 field1279 = class159.method1226((byte) -37, "Members only world");

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Lv;")
    public static class146 field1283 = class159.method1226((byte) -37, "Nehmen");

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Lv;")
    public static class146 field1287 = field1278;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Lv;")
    public static class146 field1288 = field1279;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "[I")
    public static int[] field1271 = new int[32768];

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lvb;")
    public static class148 field1282;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "[Lie;")
    public static class61[] field1273;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "[[I")
    public static int[][] field1286;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method393(int arg0) {
        field1271 = null;
        field1286 = null;
        field1288 = null;
        field1272 = null;
        field1282 = null;
        field1273 = null;
        field1287 = null;
        field1278 = null;
        field1283 = null;
        field1279 = null;
        if (arg0 != -24326) {
            field1286 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public static final void method394(int arg0, int arg1, int arg2) {
        field1284++;
        if (class74.field1747 != 0 && class74.field1747 != 3) {
            return;
        }
        if (arg0 != 19024) {
            method398((byte) 67, -8, null, 115);
        }
        if (class46.field1065 != 1) {
            return;
        }
        int var3 = class25.field401 - arg1 - 5;
        int var4 = class90.field2150 - arg2 - 25;
        if (var4 < 0 || var3 < 0 || var4 >= 146 || var3 >= 151) {
            return;
        }
        var4 -= 73;
        var3 -= 75;
        int var5 = class72.field1692 + class18.field296 & 0x7FF;
        int var6 = class45.field1030[var5];
        int var7 = class45.field1032[var5];
        int var8 = (class32.field667 + 256) * var6 >> 8;
        int var9 = (class32.field667 + 256) * var7 >> 8;
        int var10 = var3 * var8 + var4 * var9 >> 11;
        int var11 = var3 * var9 - var4 * var8 >> 11;
        int var12 = class116.field2696.field757 + var10 >> 7;
        int var13 = class116.field2696.field790 - var11 >> 7;
        boolean var14 = class81.method617(0, 0, var12, arg0 ^ 0x4A51, 0, 0, true, var13, 0, class116.field2696.field788[0], 1, class116.field2696.field738[0]);
        if (!var14) {
            return;
        }
        class82.field1990.method791(false, var4);
        class82.field1990.method791(false, var3);
        class82.field1990.method766(class72.field1692, (byte) 124);
        class82.field1990.method791(false, 57);
        class82.field1990.method791(false, class18.field296);
        class82.field1990.method791(false, class32.field667);
        class82.field1990.method791(false, 89);
        class82.field1990.method766(class116.field2696.field757, (byte) 116);
        class82.field1990.method766(class116.field2696.field790, (byte) 117);
        class82.field1990.method791(false, class115.field2683);
        class82.field1990.method791(false, 63);
        return;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lne;B)V")
    public final void method395(class95 arg0, byte arg1) {
        field1275++;
        int var3 = -113 % ((arg1 + 47) / 58);
        while (true) {
            int var4 = arg0.method790((byte) 73);
            if (var4 == 0) {
                return;
            }
            this.method396(arg0, -21202, var4);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lne;II)V")
    private final void method396(class95 arg0, int arg1, int arg2) {
        if (arg1 == -21202) {
            field1281++;
            if (arg2 == 2) {
                this.field1276 = arg0.method795(1);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)V")
    public static final void method397(byte arg0, int arg1, int arg2) {
        field1274++;
        if (arg0 > -64 || class13.field208 < 2 && class47.field1087 == 0 && !class22.field367) {
            return;
        }
        class146 var3;
        if (class47.field1087 == 1 && class13.field208 < 2) {
            var3 = class71.method509(new class146[] { class88.field2091, class13.field218, class59.field1359, class134.field3061 }, (byte) 51);
        } else if (class22.field367 && class13.field208 < 2) {
            var3 = class71.method509(new class146[] { class122.field2850, class13.field218, class140.field3206, class134.field3061 }, (byte) -97);
        } else {
            var3 = class41.method270(class13.field208 - 1, -1);
        }
        if (class13.field208 > 2) {
            var3 = class71.method509(new class146[] { var3, class28.field591, class75.method564(false, class13.field208 - 2), class63.field1424 }, (byte) -74);
        }
        class151.field3483.method810(var3, arg1 + 4, arg2 + 15, 16777215, 0, class94.field2229 / 1000);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILla;I)Lue;")
    public static final class144 method398(byte arg0, int arg1, class77 arg2, int arg3) {
        field1285++;
        if (arg0 == 60) {
            return class1.method3(arg3, arg1, arg0 ^ 0xFFFFFFA7, arg2) ? class26.method169(arg0 ^ 0x3C) : null;
        } else {
            return null;
        }
    }
}
