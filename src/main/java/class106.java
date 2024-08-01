import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class class106 extends class71 {

    @OriginalMember(owner = "lc", name = "n", descriptor = "[I")
    public int[] field2096 = new int[1];

    @OriginalMember(owner = "lc", name = "u", descriptor = "[I")
    public int[] field2103 = new int[] { -1 };

    @OriginalMember(owner = "lc", name = "r", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "lc", name = "z", descriptor = "Llf;")
    private static class109 field2108 = class35.method275("Loaded interfaces", 2);

    @OriginalMember(owner = "lc", name = "A", descriptor = "[I")
    public static int[] field2109 = new int[100];

    @OriginalMember(owner = "lc", name = "x", descriptor = "Llf;")
    public static class109 field2106 = field2108;

    @OriginalMember(owner = "lc", name = "D", descriptor = "J")
    public static volatile long field2112 = 0L;

    @OriginalMember(owner = "lc", name = "o", descriptor = "Llf;")
    public static class109 field2097 = class35.method275(" zuerst von Ihrer Freunde)2Liste(Q", 2);

    @OriginalMember(owner = "lc", name = "E", descriptor = "Llf;")
    public static class109 field2113 = class35.method275("null", 2);

    @OriginalMember(owner = "lc", name = "p", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "lc", name = "q", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "lc", name = "s", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "lc", name = "t", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "lc", name = "v", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "lc", name = "w", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "lc", name = "C", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "lc", name = "y", descriptor = "Lvg;")
    public static class200 field2107;

    @OriginalMember(owner = "lc", name = "B", descriptor = "[[[B")
    public static byte[][][] field2110;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)V")
    public static final void method765(int arg0) {
        if (arg0 != 5) {
            return;
        }
        field2101++;
        while (class95.field1934.method1340(class204.field4006, (byte) 43) >= 11) {
            int var1 = class95.field1934.method1341((byte) 89, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class202.field3975[var1] == null) {
                class202.field3975[var1] = new class184();
                if (class150.field2883[var1] != null) {
                    class202.field3975[var1].method1244(true, class150.field2883[var1]);
                }
                var2 = true;
            }
            class125.field2405[class157.field2956++] = var1;
            class184 var3 = class202.field3975[var1];
            var3.field3613 = class143.field2754;
            int var4 = class95.field1934.method1341((byte) 126, 5);
            int var5 = class95.field1934.method1341((byte) 112, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class95.field1934.method1341((byte) 124, 1);
            if (var6 == 1) {
                class102.field2018[class98.field1967++] = var1;
            }
            int var7 = class95.field1934.method1341((byte) 106, 1);
            int var8 = class184.field3462[class95.field1934.method1341((byte) 110, 3)];
            if (var2) {
                var3.field3600 = var3.field3556 = var8;
            }
            var3.method1268(true, class157.field2955.field3567[0] + var4, var7 == 1, class157.field2955.field3547[0] + var5);
        }
        class95.field1934.method1337(true);
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(Z)V")
    public static final void method766(boolean arg0) {
        class81.field1594++;
        class200.field3850.method1339((byte) 85, 188);
        field2111++;
        class200.field3850.method592(0L, -562765672);
        if (arg0) {
            field2112 = -57L;
        }
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)V")
    public static final void method767(int arg0) {
        class45.field946.method1088(-51);
        if (arg0 != 15359) {
            method769(67, (byte) -45);
        }
        field2104++;
    }

    @OriginalMember(owner = "lc", name = "c", descriptor = "(I)V")
    public static void method768(int arg0) {
        field2110 = null;
        field2097 = null;
        field2108 = null;
        field2113 = null;
        field2109 = null;
        int var1 = 16 / ((11 - arg0) / 51);
        field2107 = null;
        field2106 = null;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(IB)Z")
    public static final boolean method769(int arg0, byte arg1) {
        if (arg1 < 103) {
            return true;
        }
        field2098++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
