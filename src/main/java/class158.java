import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class158 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Ljd;")
    public static class86 field2970 = class122.method868("Angreifen", true);

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Luk;")
    public static class96 field2973 = new class96(100);

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
    public static int[] field2974 = new int[128];

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[Ls;")
    public static class228[] field2971;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1144(int arg0, int arg1) {
        class122.field2375.method693(6, arg0);
        field2969++;
        class60.field1198.method693(6, arg0);
        class237.field4276.method693(arg1 ^ 0xFFFFFFF9, arg0);
        if (arg1 != -1) {
            method1145((byte) -35);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1145(byte arg0) {
        field2972++;
        int var1 = -1;
        int var2 = 124 / ((38 - arg0) / 39);
        while (class209.field3786 > var1) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class142.field2689[var1];
            }
            class224 var7 = class186.field3294[var6];
            if (var7 != null && var7.field714 > 0) {
                var7.field714--;
                if (var7.field714 == 0) {
                    var7.field725 = null;
                }
            }
            var1++;
        }
        for (int var3 = 0; var3 < class61.field1207; var3++) {
            int var4 = class189.field3350[var3];
            class170 var5 = class233.field4217[var4];
            if (var5 != null && var5.field714 > 0) {
                var5.field714--;
                if (var5.field714 == 0) {
                    var5.field725 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method1146(int arg0) {
        class227 var1 = class75.field1502;
        synchronized (class75.field1502) {
            class56.field1151 = class180.field3240;
            class147.field2767++;
            class6.field207 = class150.field2804;
            class90.field1841 = class105.field2014;
            if (arg0 > -8) {
                method1146(44);
            }
            class143.field2712 = class211.field3817;
            class185.field3288 = class234.field4234;
            class39.field906 = class46.field1016;
            class133.field2520 = class171.field3163;
            class211.field3817 = 0;
        }
        field2968++;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static final void method1147(int arg0) {
        field2967++;
        int var1 = 85 / ((arg0 + 40) / 49);
        for (class27 var2 = (class27) class23.field576.method1737((byte) 74); var2 != null; var2 = (class27) class23.field576.method1740(-8843)) {
            class134 var3 = var2.field624;
            if (class180.field3244 != var3.field2546 || class236.field4265 > var3.field2567) {
                var2.method1477(1);
            } else if (var3.field2551 <= class236.field4265) {
                if (var3.field2536 > 0) {
                    class170 var4 = class233.field4217[var3.field2536 - 1];
                    if (var4 != null && var4.field676 >= 0 && var4.field676 < 13312 && var4.field685 >= 0 && var4.field685 < 13312) {
                        var3.method963(class30.method198(31482, var4.field676, var4.field685, var3.field2546) - var3.field2555, class236.field4265, var4.field685, var4.field676, true);
                    }
                }
                if (var3.field2536 < 0) {
                    int var5 = -var3.field2536 - 1;
                    class224 var6;
                    if (class176.field3189 == var5) {
                        var6 = class124.field2412;
                    } else {
                        var6 = class186.field3294[var5];
                    }
                    if (var6 != null && var6.field676 >= 0 && var6.field676 < 13312 && var6.field685 >= 0 && var6.field685 < 13312) {
                        var3.method963(class30.method198(31482, var6.field676, var6.field685, var3.field2546) - var3.field2555, class236.field4265, var6.field685, var6.field676, true);
                    }
                }
                var3.method958(-1, class194.field3474);
                class130.method913(class180.field3244, (int) var3.field2549, (int) var3.field2577, (int) var3.field2557, 60, var3, var3.field2570, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        field2970 = null;
        field2974 = null;
        if (arg0 == -24) {
            field2971 = null;
            field2973 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lh;")
    public static final class258 method1149(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class258 var4 = var3.field4433;
            var3.field4433 = null;
            return var4;
        }
    }
}
