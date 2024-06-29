import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class216 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public int field2969 = 1;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "Lsd;")
    public static class74 field2977 = new class74(68, 28);

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field2982 = -1;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "C")
    public char field2974;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lfi;")
    public static class180 field2978;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "[I")
    public static int[] field2981;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lvt;")
    public static final class179 method1205(byte arg0) {
        field2979++;
        class179 var1 = new class179(38);
        var1.method909(15, -1);
        var1.method909(class283.field4124, -1);
        var1.method909(class198.field2745 ? 1 : 0, arg0 + 89);
        var1.method909(class445.field6337 ? 1 : 0, -1);
        var1.method909(class119.field1484 ? 1 : 0, -1);
        var1.method909(class265.field3817 ? 1 : 0, -1);
        var1.method909(0, arg0 ^ 0x59);
        var1.method909(class191.field2611 ? 1 : 0, arg0 + 89);
        var1.method909(class304.field4496 ? 1 : 0, -1);
        var1.method909(class22.field305 ? 1 : 0, -1);
        var1.method909(class427.field6166, -1);
        var1.method909(class27.field359 ? 1 : 0, -1);
        var1.method909(class342.field4899 ? 1 : 0, -1);
        var1.method909(class304.field4495 ? 1 : 0, arg0 + 89);
        var1.method909(class401.field5719, arg0 ^ 0x59);
        var1.method909(class364.field5231 ? 1 : 0, arg0 + 89);
        if (arg0 != -90) {
            return null;
        }
        var1.method909(class304.field4494, arg0 + 89);
        var1.method909(class224.field3102, -1);
        var1.method909(class376.field5363, -1);
        var1.method884(class282.field4111, true);
        var1.method884(class92.field1143, true);
        var1.method909(class175.method861(-42), -1);
        var1.method897(class50.field657, -110);
        var1.method909(class262.field3766, -1);
        var1.method909(class468.field6577 ? 1 : 0, -1);
        var1.method909(class92.field1146 ? 1 : 0, -1);
        var1.method909(class46.field597, -1);
        var1.method909(class487.field6914 ? 1 : 0, -1);
        var1.method909(class82.field992 ? 1 : 0, -1);
        var1.method909(class346.field4943, -1);
        var1.method909(class346.field4949 ? 1 : 0, arg0 + 89);
        var1.method909(class300.field4466, -1);
        var1.method909(class217.field3010, -1);
        return var1;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILoj;Z)V")
    public static final void method1206(int arg0, int arg1, class280 arg2, boolean arg3) {
        field2972++;
        if (!arg3) {
            field2981 = null;
        }
        class274.field3912 = arg2;
        class200.field2784 = new class160[arg1][arg0];
        if (class261.field3762 != null) {
            class12.field180 = class453.method2650(class261.field3762[5], class261.field3762[1], class261.field3762[2], class261.field3762[4], class261.field3762[3], !arg3, class261.field3762[0]);
        }
        class288.field4314 = new class160();
        class144.method679((byte) -126);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
    public static void method1207(byte arg0) {
        if (arg0 > 12) {
            field2981 = null;
            field2978 = null;
            field2977 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLws;)I")
    public static final int method1208(boolean arg0, class158 arg1) {
        field2976++;
        if (arg0) {
            method1207((byte) 22);
        }
        String var2 = class125.method597(arg1, -104);
        int[] var3 = null;
        if (class419.method2493(arg1.field1889, 22383)) {
            var3 = class422.field6096.method121((int) arg1.field1883, -1).field5520;
        } else if (arg1.field1887 != -1) {
            var3 = class422.field6096.method121(arg1.field1887, -1).field5520;
        } else if (class45.method242(arg1.field1889, (byte) -69)) {
            class137 var6 = class448.field6366[(int) arg1.field1883];
            if (var6 != null) {
                class476 var7 = var6.field1643;
                if (var7.field6694 != null) {
                    var7 = var7.method2812(class75.field909, true);
                }
                if (var7 != null) {
                    var3 = var7.field6683;
                }
            }
        } else if (class432.method2587(arg1.field1889, (byte) -125)) {
            Object var4 = null;
            class415 var5;
            if (arg1.field1889 == 1004) {
                var5 = class173.field2084.method2297(50, (int) arg1.field1883);
            } else {
                var5 = class173.field2084.method2297(50, (int) (arg1.field1883 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field5951 != null) {
                var5 = var5.method2473(-18648, class75.field909);
            }
            if (var5 != null) {
                var3 = var5.field5922;
            }
        }
        if (var3 != null) {
            var2 = var2 + class349.method2115(14160, var3);
        }
        int var8 = class453.field6394.method2423(class430.field6222, !arg0, var2);
        if (arg1.field1879) {
            var8 += class408.field5780.method220() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILvt;)V")
    private final void method1209(int arg0, int arg1, class179 arg2) {
        if (arg1 == 1) {
            this.field2974 = class437.method2598(arg2.method922(32429), (byte) -49);
        } else if (arg1 == 2) {
            this.field2969 = 0;
        }
        field2975++;
        int var4 = 11 / ((arg0 - 71) / 35);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lvt;I)V")
    public final void method1210(class179 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method895((byte) -84);
            if (var3 == 0) {
                field2970++;
                if (arg1 != -31818) {
                    method1207((byte) -18);
                    return;
                }
                return;
            }
            this.method1209(-25, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
    public static final void method1211(int arg0, byte arg1) {
        field2973++;
        class401.field5720 = 3;
        int var2 = 54 / ((arg1 - 69) / 47);
        class224.field3108 = arg0;
        class413.field5878 = 100;
        class118.field1461 = -1;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2971++;
        if ((class140.field1686[0][arg1][arg0] & 0x2) != 0) {
            return true;
        } else if ((class140.field1686[arg2][arg1][arg0] & 0x10) == arg4) {
            return class344.method2090(arg2, true, arg0, arg1) == arg3;
        } else {
            return false;
        }
    }
}
