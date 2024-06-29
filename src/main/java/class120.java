import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class120 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static volatile int field2017 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
    public static boolean field2016 = false;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Z")
    public static boolean field2021 = false;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Z")
    public static boolean field2025 = false;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Z")
    public static boolean field2014 = true;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lwa;")
    private static class75 field2019 = class66.method560("level)2", false);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field2027 = 3353893;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    public static int[] field2024 = new int[100];

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lwa;")
    public static class75 field2018 = field2019;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[J")
    public static long[] field2026 = new long[200];

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lwa;")
    public static class75[] field2020 = new class75[200];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -59 / ((arg1 - 17) / 43);
        int var10 = arg4 + 1;
        class150.method1151(7, class63.field1096[arg4], arg5, arg3, arg2);
        int var9 = arg0 - 1;
        class150.method1151(7, class63.field1096[arg0], arg5, arg3, arg2);
        field2022++;
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class63.field1096[var7];
            var8[arg5] = var8[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I", line = 29)
    public static final int method914(byte arg0) {
        field2015++;
        if (class108.field1811) {
            return 0;
        }
        int var1 = 16 / ((-arg0 - 68) / 57);
        if (class300.method2067(-12461)) {
            return class74.field1239 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZ)V", line = 66)
    public static final void method915(boolean arg0, boolean arg1) {
        field2028++;
        if (class279.field4831.field3259 >> 7 == class158.field2719 && (class279.field4831.field3218 >> 7) == class91.field1497) {
            class158.field2719 = 0;
        }
        int var2 = class229.field3894;
        if (!arg1) {
            method915(false, false);
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class96 var6;
            if (arg0) {
                var6 = class279.field4831;
                var4 = 8791798054912L;
            } else {
                var4 = (long) class65.field1131[var3] << 32;
                var6 = class169.field2842[class65.field1131[var3]];
            }
            if (var6 != null && var6.method744((byte) -109)) {
                int var7 = var6.field3259 >> 7;
                var6.field1577 = false;
                int var8 = var6.field3218 >> 7;
                if ((class246.field4140 && class229.field3894 > 200 || class229.field3894 > 50) && !arg0 && var6.field3228 == var6.field3215) {
                    var6.field1577 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field1571 == null || class143.field2463 < var6.field1573 || class143.field2463 >= var6.field1568) {
                        if (var6.method739(0) == 1 && (var6.field3259 & 0x7F) == 64 && (var6.field3218 & 0x7F) == 64) {
                            if (class123.field2051[var7][var8] == class190.field3167) {
                                continue;
                            }
                            class123.field2051[var7][var8] = class190.field3167;
                        }
                        var6.field3238 = class32.method217(var6.field3259, var6.field3218, arg1, class67.field1174);
                        class213.method1571(class67.field1174, var6.field3259, var6.field3218, var6.field3238, (var6.method739(0) - 1) * 64 + 60, var6, var6.field3274, var4, var6.field3220);
                    } else {
                        var6.field1577 = false;
                        var6.field3238 = class32.method217(var6.field3259, var6.field3218, arg1, class67.field1174);
                        class237.method1718(class67.field1174, var6.field3259, var6.field3218, var6.field3238, var6, var6.field3274, var4, var6.field1550, var6.field1556, var6.field1578, var6.field1565);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 151)
    public static void method916(int arg0) {
        field2018 = null;
        field2026 = null;
        if (arg0 > 58) {
            field2024 = null;
            field2019 = null;
            field2020 = null;
        }
    }
}
