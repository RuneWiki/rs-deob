import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class112 extends class4 {

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    public static int field2506 = 0;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "Lab;")
    public static class3 field2507 = new class3(32);

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "Loa;")
    public static class98 field2515 = class38.method349(255, "mn");

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "Loa;")
    private static class98 field2516 = class38.method349(255, "wave2:");

    @OriginalMember(owner = "client!qb", name = "sb", descriptor = "Loa;")
    public static class98 field2517 = field2516;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "Loa;")
    public static class98 field2513 = field2516;

    @OriginalMember(owner = "client!qb", name = "tb", descriptor = "Loa;")
    private static class98 field2518 = class38.method349(255, " is already on your ignore list");

    @OriginalMember(owner = "client!qb", name = "ub", descriptor = "Loa;")
    public static class98 field2519 = class38.method349(255, "Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!qb", name = "vb", descriptor = "[I")
    public static int[] field2520 = new int[25];

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "Loa;")
    public static class98 field2512 = field2518;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "J")
    public static long field2503;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "Lmd;")
    public static class87 field2514;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "[I")
    public int[] field2496;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "[I")
    public int[] field2502;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "[Loa;")
    public class98[] field2498;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
    public static final void method911(byte arg0) {
        if (class78.field1706 != null) {
            class78.field1706.method283(-30232);
        }
        int var1 = 108 / ((arg0 - 8) / 43);
        field2509++;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static final void method912(int arg0) {
        class127.field2854++;
        class18.method168(2879, true);
        field2504++;
        class97.method775(true, arg0 ^ 0x227);
        class18.method168(2879, false);
        class97.method775(false, arg0 ^ 0x227);
        class1.method2(true);
        class10.method120((byte) -108);
        if (arg0 != 600) {
            method911((byte) -9);
        }
        if (!class31.field733) {
            int var1 = class127.field2843;
            if (var1 < class56.field1242 / 256) {
                var1 = class56.field1242 / 256;
            }
            if (class74.field1577[4] && class140.field3415[4] + 128 > var1) {
                var1 = class140.field3415[4] + 128;
            }
            int var2 = class25.field611 + field2505 & 0x7FF;
            class88.method719(var1, class102.field2358, var1 * 3 + 600, var2, class90.field2080, class31.method305(-48, class73.field1536.field3667, class114.field2572, class73.field1536.field3657) - 50, arg0 ^ 0xA58);
        }
        int var3;
        if (class31.field733) {
            var3 = class36.method341(arg0 + 26201);
        } else {
            var3 = class77.method627((byte) -105);
        }
        int var4 = class71.field1472;
        int var5 = class132.field3227;
        int var6 = class18.field394;
        int var7 = class118.field2639;
        int var8 = class114.field2581;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class74.field1577[var9]) {
                int var10 = (int) ((double) -class87.field2006[var9] + Math.random() * (double) (class87.field2006[var9] * 2 + 1) + Math.sin((double) class44.field1016[var9] / 100.0D * (double) class102.field2348[var9]) * (double) class140.field3415[var9]);
                if (var9 == 3) {
                    class114.field2581 = class114.field2581 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class71.field1472 += var10;
                }
                if (var9 == 2) {
                    class18.field394 += var10;
                }
                if (var9 == 1) {
                    class132.field3227 += var10;
                }
                if (var9 == 4) {
                    class118.field2639 += var10;
                    if (class118.field2639 < 128) {
                        class118.field2639 = 128;
                    }
                    if (class118.field2639 > 383) {
                        class118.field2639 = 383;
                    }
                }
            }
        }
        class105.method888(115);
        class128.field2927 = class42.field990 - 4;
        class128.field2925 = 0;
        class128.field2924 = true;
        class128.field2914 = class123.field2749 - 4;
        class21.method190((byte) -39);
        class7.method40();
        class21.method190((byte) -39);
        class138.field3373.method261(class71.field1472, class132.field3227, class18.field394, class118.field2639, class114.field2581, var3);
        class21.method190((byte) -39);
        class138.field3373.method221();
        class48.method411((byte) 55);
        class150.method1205(false);
        ((class32) class66.field1408).method309(class52.field1161, -2151);
        class10.method114((byte) 1);
        if (class46.field1065 && class134.method1094((byte) 33, false, true) == 0) {
            class46.field1065 = false;
        }
        if (class46.field1065) {
            class105.method888(50);
            class7.method40();
            class96.method766(false, class54.field1194, null, -21);
        }
        class21.method190((byte) -39);
        class82.method659(arg0 ^ 0x205);
        class18.field394 = var6;
        class114.field2581 = var8;
        class71.field1472 = var4;
        class132.field3227 = var5;
        class118.field2639 = var7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        field2520 = null;
        field2512 = null;
        if (arg0) {
            return;
        }
        field2519 = null;
        field2514 = null;
        field2513 = null;
        field2507 = null;
        field2515 = null;
        field2516 = null;
        field2517 = null;
        field2518 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ltb;ZI)Loc;")
    public static final class100 method914(class130 arg0, boolean arg1, int arg2) {
        field2500++;
        if (class17.method166(arg2, arg0, 100)) {
            return arg1 ? null : class71.method567(8404);
        } else {
            return null;
        }
    }
}
