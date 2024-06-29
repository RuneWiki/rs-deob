import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 extends class125 {

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Z")
    public boolean field3037 = false;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "J")
    public static long field3043 = 0L;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lcb;")
    public static class17 field3038 = new class17(500);

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Lod;")
    public static class101 field3052 = class46.method335(62, "Schlie-8en");

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lqe;")
    public static class116 field3040;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lka;")
    public static class70 field3047;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lkc;")
    public static class72 field3039;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[[S")
    public static short[][] field3049;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method1026(boolean arg0) {
        field3053++;
        while (class118.field2611.method418(class8.field121, 8) >= 27) {
            int var1 = class118.field2611.method426(true, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class18.field376[var1] == null) {
                var2 = true;
                class18.field376[var1] = new class62();
            }
            class62 var3 = class18.field376[var1];
            class73.field1586[class40.field959++] = var1;
            var3.field1283 = class143.field3305;
            int var4 = class118.field2611.method426(true, 1);
            if (var4 == 1) {
                class39.field935[class11.field176++] = var1;
            }
            int var5 = class118.field2611.method426(!arg0, 1);
            int var6 = class118.field2611.method426(true, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.field1374 = class134.method1033(class118.field2611.method426(!arg0, 14), 9);
            int var7 = class118.field2611.method426(true, 5);
            int var8 = class47.field1105[class118.field2611.method426(true, 3)];
            var3.field1292 = var3.field1374.field2523;
            var3.field1334 = var3.field1374.field2540;
            var3.field1296 = var3.field1374.field2530;
            var3.field1289 = var3.field1374.field2527;
            var3.field1279 = var3.field1374.field2550;
            var3.field1327 = var3.field1374.field2560;
            var3.field1302 = var3.field1374.field2537;
            var3.field1273 = var3.field1374.field2564;
            var3.field1335 = var3.field1374.field2543;
            if (var2) {
                var3.field1307 = var3.field1310 = var8;
            }
            if (var3.field1279 == 0) {
                var3.field1310 = 0;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method406(var5 == 1, class82.field1778.field1271[0] + var7, class82.field1778.field1291[0] + var6, 29682);
        }
        if (!arg0) {
            class118.field2611.method421(-107);
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field3040 = null;
        field3039 = null;
        field3052 = null;
        field3047 = null;
        field3049 = null;
        field3038 = null;
        if (arg0 != 15) {
            field3040 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public static final void method1028(int arg0, int arg1) {
        class130 var2 = (class130) class93.field1999.method1141((long) arg1, -1);
        field3041++;
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2975.length; var3++) {
            var2.field2975[var3] = -1;
            var2.field2971[var3] = 0;
        }
        if (arg0 != 8061) {
            field3040 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsa;BI)Lod;")
    public static final class101 method1029(class126 arg0, byte arg1, int arg2) {
        field3045++;
        if (!class149.method1162(class42.method313(arg0, (byte) -114), (byte) 126, arg2) && arg0.field2740 == null) {
            return null;
        }
        if (arg1 != -82) {
            field3047 = null;
        }
        if (arg0.field2865 == null || arg0.field2865.length <= arg2 || arg0.field2865[arg2] == null || arg0.field2865[arg2].method726(false).method737(0) == 0) {
            return class79.field1659 ? class15.method101(arg1 ^ 0xFFFFFFCD, new class101[] { class29.field764, class82.method592(false, arg2) }) : null;
        } else {
            return arg0.field2865[arg2];
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
    public static final int method1030(int arg0, int arg1, int arg2) {
        field3042++;
        if (arg0 == arg2) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
