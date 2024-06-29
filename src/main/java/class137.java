import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class137 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[J")
    public static long[] field2379 = new long[100];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
    public static int[] field2380 = new int[32768];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljd;")
    private static class85 field2378 = class221.method1499("Loading wordpack )2 ", (byte) -45);

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "J")
    public static long field2382 = 0L;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljd;")
    public static class85 field2387 = class221.method1499(":tradereq:", (byte) -96);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Ljd;")
    public static class85 field2385 = field2378;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lge;")
    public static class68 field2388;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)I")
    public static final int method906(int arg0, byte arg1, int arg2) {
        field2384++;
        if (arg1 != 67) {
            method910(-127);
        }
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method907(byte arg0) {
        field2380 = null;
        field2378 = null;
        field2385 = null;
        if (arg0 < 12) {
            method908(125, 93);
        }
        field2379 = null;
        field2387 = null;
        field2388 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method908(int arg0, int arg1) {
        if (arg1 != -101) {
            field2388 = null;
        }
        class13.field200.method1267(arg0, (byte) -71);
        class112.field1960.method1267(arg0, (byte) -94);
        field2383++;
        class152.field2585.method1267(arg0, (byte) -84);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static final void method909(boolean arg0) {
        field2386++;
        if (!arg0) {
            return;
        }
        if (class199.field3413 < 128) {
            class199.field3413 = 128;
        }
        class30.field450 &= 0x7FF;
        if (class199.field3413 > 383) {
            class199.field3413 = 383;
        }
        int var1 = class86.field1613 >> 7;
        int var2 = 0;
        int var3 = class61.field1104 >> 7;
        int var4 = class246.method1660(604124551, class61.field1104, class116.field2066, class86.field1613);
        if (var3 > 3 && var1 > 3 && var3 < 100 && var1 < 100) {
            for (int var5 = var3 - 4; var5 <= var3 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class116.field2066;
                    if (var7 < 3 && (class228.field3952[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class245.field4193[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class113.field1979) {
            class113.field1979 += (var9 - class113.field1979) / 24;
        } else if (var9 < class113.field1979) {
            class113.field1979 += (var9 - class113.field1979) / 80;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method910(int arg0) {
        field2381++;
        if (!class52.field902) {
            class124.field2198[0] = class38.field586;
            class90.field1659[0] = 1001;
            class115.field2058 = 1;
            class184.field3161[0] = class100.field1795;
            if (class203.field3541 != 0) {
                class151.field2551 = class19.field278;
                class194.field3315 = class152.field2604;
            } else if (class75.field1393 == 0) {
                class194.field3315 = class106.field1851;
                class151.field2551 = class245.field4195;
            } else {
                class151.field2551 = class99.field1784;
                class194.field3315 = class175.field3008;
            }
        }
        if (~class129.field2267 != arg0) {
            class66.method445(-123, class129.field2267);
        }
        for (int var1 = 0; var1 < class22.field307; var1++) {
            if (class20.field286[var1]) {
                class217.field3803[var1] = true;
            }
            class269.field4778[var1] = class20.field286[var1];
            class20.field286[var1] = false;
        }
        class98.field1770 = -1;
        class211.field3704 = class151.field2555;
        class22.field309 = null;
        class239.field4124 = -1;
        if (class129.field2267 != -1) {
            class22.field307 = 0;
            class182.method1252(-1, class154.field2664, 0, (byte) 4, class154.field2662, 0, 0, 0, class129.field2267);
        }
        class179.method1212();
        class12.method100(arg0 - 7031);
        if (class52.field902) {
            class32.method220(119);
        } else if (class98.field1770 != -1) {
            class52.method346(class239.field4124, class98.field1770, true);
        }
        if (class183.field3128 == 3) {
            for (int var2 = 0; var2 < class22.field307; var2++) {
                if (class269.field4778[var2]) {
                    class179.method1210(class146.field2493[var2], class253.field4364[var2], class54.field947[var2], class246.field4201[var2], 16711935, 128);
                } else if (class217.field3803[var2]) {
                    class179.method1210(class146.field2493[var2], class253.field4364[var2], class54.field947[var2], class246.field4201[var2], 16711680, 128);
                }
            }
        }
        class68.method470(arg0 ^ 0x26, class218.field3820, class22.field308.field1027, class22.field308.field1042, class116.field2066);
        class218.field3820 = 0;
    }
}
