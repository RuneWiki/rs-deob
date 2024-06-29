import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class255 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public static int[] field4455 = new int[32];

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "[I")
    public static int[] field4462 = new int[2048];

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[I")
    public static int[] field4457 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lve;")
    public static class189 field4461 = new class189(2);

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Lid;")
    public static class149 field4466 = class60.method382("Memory before cleanup=", (byte) 127);

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lid;")
    public static class149 field4467 = class60.method382("Veuillez patienter)3)3)3", (byte) 96);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1753(int arg0) {
        if (arg0 <= 110) {
            return;
        }
        field4461 = null;
        field4466 = null;
        field4455 = null;
        field4457 = null;
        field4462 = null;
        field4467 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lid;")
    public static final class149 method1754(int arg0, int arg1) {
        field4459++;
        if (arg1 < 100000) {
            return class237.method1603(new class149[] { class147.field2657, class211.method1434(arg1, true), class269.field4852 }, -125);
        } else {
            int var2 = -22 / ((arg0 - 34) / 55);
            return arg1 < 10000000 ? class237.method1603(new class149[] { class2.field36, class211.method1434(arg1 / 1000, true), class106.field1841, class269.field4852 }, -96) : class237.method1603(new class149[] { class259.field4558, class211.method1434(arg1 / 1000000, true), class227.field3980, class269.field4852 }, -94);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILaj;IB)V")
    public static final void method1755(int arg0, class47 arg1, int arg2, byte arg3) {
        field4460++;
        if (class60.field1092 < 2 && class43.field657 == 0 && !class40.field621 || arg3 <= 106) {
            return;
        }
        class149 var4 = class221.method1491(2);
        if (arg1 == null) {
            int var6 = class173.field3180.method1162(var4, arg0 + 4, arg2 + 15, 16777215, 0, class92.field1633, class172.field3171);
            class279.method1925(15, arg0 + 4, var6 + class173.field3180.method1161(var4), 0, arg2);
            return;
        }
        class160 var5 = arg1.method306(class184.field3326, (byte) 97);
        if (var5 == null) {
            var5 = class173.field3180;
        }
        var5.method1167(var4, arg0, arg2, arg1.field722, arg1.field727, arg1.field812, arg1.field827, arg1.field747, arg1.field781, class92.field1633, class172.field3171, class182.field3284);
        class279.method1925(class182.field3284[3], class182.field3284[0], class182.field3284[2], 0, class182.field3284[1]);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILaj;IIII)V")
    public static final void method1756(int arg0, int arg1, int arg2, class47 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class47.field764) {
            class124.field2194 = 32;
        } else {
            class124.field2194 = 0;
        }
        field4458++;
        class47.field764 = false;
        int var8 = 103 % ((56 - arg2) / 47);
        if (class263.field4671 != 0) {
            if (arg6 <= arg5 && arg6 + 16 > arg5 && arg0 >= arg4 && arg4 + 16 > arg0) {
                arg3.field824 -= 4;
                class182.method1267(arg3, 110);
            } else if (arg5 >= arg6 && (arg6 + 16) > arg5 && (arg7 + arg4 - 16) <= arg0 && arg4 + arg7 > arg0) {
                arg3.field824 += 4;
                class182.method1267(arg3, 113);
            } else if (arg5 >= arg6 - class124.field2194 && arg6 + class124.field2194 + 16 > arg5 && arg0 >= (arg4 + 16) && arg0 < arg4 + arg7 - 16) {
                int var9 = (arg7 - 32) * arg7 / arg1;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg7 - var9 - 32;
                int var11 = arg0 - arg4 - (var9 / 2) - 16;
                arg3.field824 = (arg1 - arg7) * var11 / var10;
                class182.method1267(arg3, 122);
                class47.field764 = true;
            }
        }
        if (class180.field3250 == 0) {
            return;
        }
        int var12 = arg3.field722;
        if (arg6 - var12 <= arg5 && arg4 <= arg0 && arg5 < (arg6 + 16) && arg4 + arg7 >= arg0) {
            arg3.field824 += class180.field3250 * 45;
            class182.method1267(arg3, 88);
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lqk;")
    public static final class208 method1757(int arg0, int arg1) {
        if (arg1 > -10) {
            method1758(30);
        }
        field4453++;
        return class237.field4149 && arg0 >= class78.field1461 && class140.field2551 >= arg0 ? class61.field1101[arg0 - class78.field1461] : null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static final void method1758(int arg0) {
        class261.field4634 = -1;
        class248.field4355 = false;
        field4456++;
        class52.field941 = 0;
        class140.field2558 = -3;
        class128.field2256 = 0;
        class91.field1614 = 1;
        class162.field3012 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILal;)Lrh;")
    public static final class46 method1759(int arg0, int arg1, class230 arg2) {
        field4454++;
        int var3 = 123 % ((56 - arg0) / 57);
        return class39.method226(arg2, arg1, 101) ? class55.method351((byte) 125) : null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILid;Lal;)Lkc;")
    public static final class278 method1760(int arg0, class149 arg1, class230 arg2) {
        field4465++;
        int var3 = arg2.method1550((byte) 66, arg1);
        if (var3 == -1) {
            return new class278(0);
        }
        int[] var4 = arg2.method1555(var3, (byte) -113);
        if (arg0 != 12447) {
            field4466 = null;
        }
        class278 var5 = new class278(var4.length);
        for (int var6 = 0; var6 < var5.field4965; var6++) {
            class74 var7 = new class74(arg2.method1562(-809612665, var4[var6], var3));
            var5.field4967[var6] = var7.method529(-1);
            var5.field4963[var6] = var7.method514((byte) 1);
            var5.field4970[var6] = (short) var7.method485(-2386);
            var5.field4969[var6] = (short) var7.method485(-2386);
            var5.field4959[var6] = var7.method498((byte) 126);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)V")
    public static final void method1761(byte arg0, int arg1) {
        field4464++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class236.method1599((byte) -18);
        } else if (arg1 == 2) {
            class112.method787(114);
        } else {
            throw new RuntimeException();
        }
        if (arg0 < 126) {
            method1760(95, (class149) null, (class230) null);
        }
    }
}
