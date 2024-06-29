import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lhe;")
    private static class54 field2191 = class6.method58("Please contact customer support)3", false);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[Lk;")
    public static class69[] field2188 = new class69[50];

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2190 = 1;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2195 = 0;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
    public static int[] field2193 = new int[2048];

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lhe;")
    public static class54 field2200 = class6.method58("<img=0>", false);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lhe;")
    public static class54 field2199 = field2191;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lhe;")
    public static class54 field2202 = class6.method58("oberen Rand der Webseite ausw-=hlen)3", false);

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
    public static final void method705(int arg0, int arg1, int arg2) {
        field2192++;
        int[] var3 = new int[4];
        var3[0] = arg2;
        int[] var4 = new int[4];
        var4[0] = arg1;
        int var5 = 1;
        if (arg0 != -18088) {
            field2203 = -21;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            if (class43.field1096[var6] != arg2) {
                var3[var5] = class43.field1096[var6];
                var4[var5] = class130.field2930[var6];
                var5++;
            }
        }
        class130.field2930 = var4;
        class43.field1096 = var3;
        class128.method962(class130.field2930, arg0 + 18084, class22.field612.length + -1, class43.field1096, 0, class22.field612);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JB)V")
    public static final void method706(long arg0, byte arg1) {
        field2197++;
        if (arg0 == 0L) {
            return;
        }
        if (class54.field1347 >= 100) {
            class80.method612(class5.field142, class24.field671, (byte) 123, 0);
            return;
        }
        class54 var3 = class135.method1011(-5, arg0).method418(118);
        for (int var4 = 0; var4 < class54.field1347; var4++) {
            if (class15.field464[var4] == arg0) {
                class80.method612(class143.method1105(new class54[] { var3, class84.field2098 }, -842), class24.field671, (byte) 113, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class158.field3609; var5++) {
            if (class129.field2920[var5] == arg0) {
                class80.method612(class143.method1105(new class54[] { class103.field2578, var3, class75.field1864 }, -842), class24.field671, (byte) 120, 0);
                return;
            }
        }
        if (var3.method381(1, class108.field2639.field626)) {
            class80.method612(class52.field1238, class24.field671, (byte) 115, 0);
            return;
        }
        class15.field464[class54.field1347++] = arg0;
        class129.field2919++;
        class3.field60 = class84.field2084;
        class131.field2969.method454(102, -20);
        int var6 = 97 / ((-arg1 - 43) / 35);
        class131.field2969.method677(189354448, arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)[Lce;")
    public static final class20[] method707(int arg0) {
        field2189++;
        class20[] var1 = new class20[class91.field2212];
        if (arg0 != -31783) {
            method706(107L, (byte) 86);
        }
        for (int var2 = 0; var2 < class91.field2212; var2++) {
            class20 var3 = var1[var2] = new class20();
            var3.field572 = class103.field2574;
            var3.field570 = class64.field1549;
            var3.field571 = class68.field1686[var2];
            var3.field576 = class70.field1732[var2];
            var3.field574 = class62.field1503[var2];
            var3.field577 = class56.field1412[var2];
            var3.field575 = class134.field3050;
            var3.field573 = class141.field3221[var2];
        }
        class80.method610(true);
        return var1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method708(byte arg0) {
        field2199 = null;
        field2202 = null;
        field2191 = null;
        if (arg0 > -32) {
            field2193 = null;
        }
        field2200 = null;
        field2188 = null;
        field2193 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)I")
    public static final int method709(byte arg0) {
        int var1 = 71 % ((arg0 - 9) / 55);
        field2196++;
        int var2 = class134.method1007(class11.field315, class65.field1561, true, class157.field3573);
        return var2 - class93.field2277 >= 800 || (class87.field2152[class157.field3573][class11.field315 >> 7][class65.field1561 >> 7] & 0x4) == 0 ? 3 : class157.field3573;
    }
}
