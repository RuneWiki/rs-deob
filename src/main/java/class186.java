import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class186 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lvf;")
    public static class265 field3368 = class87.method582(-46, "::noclip");

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lcg;")
    public static class34 field3370 = null;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lvf;")
    public static class265 field3369 = class87.method582(-46, "runes");

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lhh;")
    public static class177 field3366 = new class177();

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Z")
    public static boolean field3373 = false;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lgk;")
    public static class6 field3365;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lfl;I)V")
    public static final void method1275(class192 arg0, int arg1) {
        class258.field4441 = class89.method611(arg0, -115, class40.field920, 0);
        class13.field406 = new class34[class258.field4441.length];
        field3363++;
        class5.field71 = new class34[class258.field4441.length];
        class181.field3216 = new class34[class258.field4441.length];
        for (int var2 = 0; var2 < class258.field4441.length; var2++) {
            class258.field4441[var2].method276();
            class13.field406[var2] = class258.field4441[var2].method273();
            class258.field4441[var2].method276();
            class5.field71[var2] = class258.field4441[var2].method273();
            class258.field4441[var2].method276();
            class181.field3216[var2] = class258.field4441[var2].method273();
            class258.field4441[var2].method276();
        }
        class59.field1196 = class283.method1920((byte) 28, 0, class21.field644, arg0);
        class260.field4481 = class59.method439(arg0, 0, class203.field3641, true);
        class91.field1622 = class59.method439(arg0, 0, class106.field1877, true);
        class200.field3573 = class59.method439(arg0, 0, class155.field2873, true);
        class182.field3240 = class59.method439(arg0, 0, class78.field1484, true);
        class162.field2945 = class59.method439(arg0, 0, class230.field4062, true);
        class95.field1678 = class59.method439(arg0, 0, class33.field816, true);
        class140.field2596 = class179.method1167(arg0, class27.field718, arg1 ^ arg1, 0);
        class179.field3182 = class62.method460(arg0, class57.field1170, 0, (byte) 125);
        class188.field3388 = class62.method460(arg0, class121.field2150, 0, (byte) 125);
        class2.field30 = class198.method1366(arg0, 0, class123.field2221, (byte) 104);
        class97.field1714 = class198.method1366(arg0, 0, class116.field2054, (byte) 116);
        class263.field4592.method764(class97.field1714, (int[]) null);
        class22.field668.method764(class97.field1714, (int[]) null);
        class205.field3692.method764(class97.field1714, (int[]) null);
        class88 var3 = class66.method473(-1, 0, class130.field2315, arg0);
        var3.method608();
        class143.field2657 = var3;
        class88[] var4 = class283.method1920((byte) 28, 0, class43.field962, arg0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method608();
        }
        class6.field154 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class59.field1196.length; var10++) {
            class59.field1196[var10].method597(var6 + var9, var7 + var9, var8 + var9);
        }
        class258.field4441[0].method275(var6 + var9, var7 + var9, var8 + var9);
        class57.field1159 = class59.field1196;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1276(byte arg0) {
        field3370 = null;
        field3369 = null;
        field3365 = null;
        field3368 = null;
        field3366 = null;
        if (arg0 < 66) {
            method1278(-76, false);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class178 var5 = class188.method1282(arg2, arg0, arg0 ^ 0xF940B6A);
        var5.method1162(true);
        var5.field3170 = arg3;
        field3367++;
        var5.field3172 = arg4;
        var5.field3171 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
    public static final void method1278(int arg0, boolean arg1) {
        field3362++;
        if (class214.field3827.field2600 >> 7 == class161.field2936 && class214.field3827.field2564 >> 7 == class203.field3633) {
            class161.field2936 = 0;
        }
        int var2 = class19.field520;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            class122 var4;
            long var5;
            if (arg1) {
                var4 = class214.field3827;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class93.field1652[var3] << 32;
                var4 = class209.field3766[class93.field1652[var3]];
            }
            if (var4 != null && var4.method227((byte) 115)) {
                var4.field2175 = false;
                if ((class61.field1219 && class19.field520 > 200 || class19.field520 > 50) && !arg1 && var4.field2601 == var4.field2582) {
                    var4.field2175 = true;
                }
                int var7 = var4.field2600 >> 7;
                int var8 = var4.field2564 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field2178 == null || class93.field1655 < var4.field2192 || var4.field2172 <= class93.field1655) {
                        if (var4.method822(2) == 1 && (var4.field2600 & 0x7F) == 64 && (var4.field2564 & 0x7F) == 64) {
                            if (class81.field1524[var7][var8] == class257.field4401) {
                                continue;
                            }
                            class81.field1524[var7][var8] = class257.field4401;
                        }
                        var4.field2560 = class67.method483(var4.field2564, -125, var4.field2600, class216.field3902);
                        class78.method543(class216.field3902, var4.field2600, var4.field2564, var4.field2560, var4.method822(arg0 ^ 0x2) * 64 + 60 - 64, var4, var4.field2563, var5, var4.field2544);
                    } else {
                        var4.field2175 = false;
                        var4.field2560 = class67.method483(var4.field2564, -118, var4.field2600, class216.field3902);
                        class205.method1403(class216.field3902, var4.field2600, var4.field2564, var4.field2560, var4, var4.field2563, var5, var4.field2200, var4.field2168, var4.field2179, var4.field2176);
                    }
                }
            }
        }
    }
}
