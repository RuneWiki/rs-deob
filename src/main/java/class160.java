import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class160 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2240 = -1;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2241 = -1;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ltl;")
    public static class369 field2239 = new class369(0, 0);

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2244;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBI)V", line = 10)
    public static final void method1061(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2243++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -73 / ((arg3 - 20) / 61);
        int var8 = -arg2;
        int var9 = -1;
        int var10 = class302.method1951(class154.field2161, 0, arg2 + arg4, class233.field3350);
        int var11 = class302.method1951(class154.field2161, 0, arg4 - arg2, class233.field3350);
        class295.method1924(3289650, class296.field4138[arg1], var10, arg0, var11);
        while (var6 > var5) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                var6--;
                var8 -= var6 << 1;
                int var12 = arg1 - var6;
                int var13 = arg1 + var6;
                if (var13 >= class290.field4058 && var12 <= class442.field6212) {
                    int var14 = class302.method1951(class154.field2161, 0, arg4 + var5, class233.field3350);
                    int var15 = class302.method1951(class154.field2161, 0, arg4 - var5, class233.field3350);
                    if (class442.field6212 >= var13) {
                        class295.method1924(3289650, class296.field4138[var13], var14, arg0, var15);
                    }
                    if (class290.field4058 <= var12) {
                        class295.method1924(3289650, class296.field4138[var12], var14, arg0, var15);
                    }
                }
            }
            var5++;
            int var16 = arg1 - var5;
            int var17 = arg1 + var5;
            if (var17 >= class290.field4058 && var16 <= class442.field6212) {
                int var18 = class302.method1951(class154.field2161, 0, arg4 + var6, class233.field3350);
                int var19 = class302.method1951(class154.field2161, 0, arg4 - var6, class233.field3350);
                if (class442.field6212 >= var17) {
                    class295.method1924(3289650, class296.field4138[var17], var18, arg0, var19);
                }
                if (class290.field4058 <= var16) {
                    class295.method1924(3289650, class296.field4138[var16], var18, arg0, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 91)
    public static void method1062(byte arg0) {
        field2239 = null;
        if (arg0 != -46) {
            method1062((byte) -65);
        }
        field2244 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 105)
    public static final void method1063(byte arg0) {
        field2242++;
        int var1 = class403.field5718.length;
        if (arg0 != -58) {
            method1063((byte) -81);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class403.field5718[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class107.field1480; var4++) {
                    if (class155.field2191[var2] == class15.field289[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class15.field289[class107.field1480] = class155.field2191[var2];
                    var3 = class107.field1480++;
                }
                class11 var5 = new class11(class403.field5718[var2]);
                int var6 = 0;
                while (var5.field191 < class403.field5718[var2].length && var6 < 511 && class125.field1758 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method174(255);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class155.field2191[var2] >> 8) * 64 + var10 - class212.field2968;
                    int var13 = (class155.field2191[var2] & 0xFF) * 64 + var11 - class447.field6269;
                    class327 var14 = class412.method2584(var5.method174(255), true);
                    if (class98.field1358[var7] == null && (var14.field4523 & 0x1) > 0 && class125.field1760 == var9 && var12 >= 0 && (var12 + var14.field4488) < class211.field2954 && var13 >= 0 && class290.field4061 > var13 + var14.field4488) {
                        class98.field1358[var7] = new class198();
                        class98.field1358[var7].field5294 = var7;
                        class198 var15 = class98.field1358[var7];
                        class135.field1967[class125.field1758++] = var7;
                        var15.field5260 = class276.field3837;
                        var15.method1290((byte) 114, var14);
                        var15.method2383(var15.field2737.field4488, (byte) 1);
                        var15.field5313 = var15.field2737.field4478 << 3;
                        if (var15.field5313 == 0) {
                            var15.method2386(16383, 0);
                        } else {
                            var15.method2386(16383, var15.field2737.field4520 + 4 << 11 & 0x3BB8);
                        }
                        var15.method2389(var12, var9, var15.method942(false), true, -95, var13);
                    }
                }
            }
        }
    }
}
