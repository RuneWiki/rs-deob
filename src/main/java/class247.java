import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class247 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3295 = 0;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[[S")
    public static short[][] field3294 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lh;")
    public static class434 field3297 = new class434(67, -1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method1382(int arg0) {
        field3298++;
        int var1 = class239.field3187;
        int[] var2 = class265.field3502;
        for (int var3 = arg0; var3 < var1; var3++) {
            class487 var4 = class413.field5644[var2[var3]];
            if (var4 != null) {
                class369.method2278(var4, -921600, var4.method545(false));
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILbq;)Lbq;")
    public abstract class174 method1383(int arg0, class174 arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static final void method1384(boolean arg0) {
        class235.method1309();
        field3299++;
        for (int var1 = 0; var1 < 4; var1++) {
            class60.field805[var1].method1469(-92);
        }
        if (!arg0) {
            method1382(112);
        }
        class321.method1777(-128);
        class412.method2470(0);
        System.gc();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
    public static final int method1385(int arg0, int arg1, int arg2, int arg3) {
        field3296++;
        if (class221.field2945 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || class295.field3947 - 1 < var4 || var5 > (class39.field567 - 1)) {
            return 0;
        }
        int var6 = -33 / ((arg0 + 73) / 32);
        int var7 = arg3;
        if (arg3 < 3 && (class1.field26[1][var4][var5] & 0x2) != 0) {
            var7 = arg3 + 1;
        }
        return class221.field2945[var7].method368(arg1, arg2);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lqg;ZI)Z")
    public static final boolean method1386(class296 arg0, boolean arg1, int arg2) {
        field3293++;
        int var3 = arg0.method1664((byte) -13, 2);
        if (var3 == 0) {
            if (arg0.method1664((byte) -13, 1) != 0) {
                method1386(arg0, arg1, arg2);
            }
            int var4 = arg0.method1664((byte) -13, 6);
            int var5 = arg0.method1664((byte) -13, 6);
            boolean var6 = arg0.method1664((byte) -13, 1) == 1;
            if (var6) {
                class93.field1364[class151.field2133++] = arg2;
            }
            if (class413.field5644[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class487 var7 = class413.field5644[arg2] = new class487();
            var7.field1163 = arg2;
            if (class374.field5166[arg2] != null) {
                var7.method2829(class374.field5166[arg2], -108);
            }
            var7.method547(class108.field1617[arg2], 119);
            var7.field1154 = class15.field219[arg2];
            int var8 = class71.field978[arg2];
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 0xFF;
            int var11 = var8 & 0xFF;
            var7.field1195[0] = class280.field3754[arg2];
            var7.field6502 = (byte) var9;
            var7.method2827((var10 << 6) + var4 - class162.field2260, (var11 << 6) + -class266.field3511 + var5, true);
            var7.field6781 = false;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method1664((byte) -13, 2);
            int var13 = class71.field978[arg2];
            class71.field978[arg2] = class99.method612(805306368, (var13 >> 28) + var12 << 28) + class99.method612(var13, 268435455);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method1664((byte) -13, 5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class71.field978[arg2];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = (var17 & 0x3FFC5E) >> 14;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var19--;
                var20--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var20--;
                var19++;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var19--;
                var20++;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var19++;
                var20++;
            }
            class71.field978[arg2] = (var19 << 14) + (var18 << 28) + var20;
            return false;
        } else {
            int var21 = arg0.method1664((byte) -13, 18);
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = class71.field978[arg2];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            if (!arg1) {
                method1386((class296) null, true, 97);
            }
            int var28 = var24 + var25 & 0xFF;
            class71.field978[arg2] = (var27 << 14) + (var26 << 28) + var28;
            return false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method1387(int arg0) {
        field3297 = null;
        if (arg0 < -84) {
            field3294 = null;
        }
    }
}
