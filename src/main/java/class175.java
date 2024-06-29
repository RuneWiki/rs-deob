import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class175 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field3030 = 5063219;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lp;")
    public static class280 field3031 = class18.method140((byte) -118, "::rect_debug");

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lp;")
    private static class280 field3035 = class18.method140((byte) -123, "Select");

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lp;")
    public static class280 field3042 = field3035;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method1198(byte arg0) {
        if (arg0 != 103) {
            field3042 = null;
        }
        field3042 = null;
        field3031 = null;
        field3035 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method1199(int arg0) {
        field3040++;
        class205 var1 = class45.field750;
        synchronized (class45.field750) {
            class74.field1229 = class167.field2930;
            class134.field2377++;
            class229.field3957 = class282.field4961;
            class154.field2673 = class12.field242;
            field3034 = class13.field261;
            class98.field1572 = class245.field4310;
            class187.field3268 = class53.field874;
            class185.field3262 = class206.field3573;
            class13.field261 = arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
    public static final int method1200(int arg0) {
        field3037++;
        if (arg0 <= 15) {
            method1200(-45);
        }
        return class73.field1206 && class88.field1431[81] && class157.field2745 > 2 ? class123.field2161[class157.field2745 - 2] : class123.field2161[class157.field2745 - 1];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3032++;
        if (class48.method356(-664, arg1)) {
            class101.field1640 = null;
            if (arg5 != -8648) {
                method1198((byte) -32);
            }
            class164.method1154(arg8, -1, arg4, arg0, class251.field4394[arg1], arg7, arg3, arg2, 0, arg6);
            if (class101.field1640 != null) {
                class164.method1154(arg8, -1412584499, class3.field105, arg0, class101.field1640, arg7, arg3, class199.field3479, 0, arg6);
                class101.field1640 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class207.field3583[var9] = true;
            }
        } else {
            class207.field3583[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)Lbk;")
    public static final class20 method1202(byte arg0, int arg1) {
        field3036++;
        class20 var2 = (class20) class105.field1750.method1480((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field814.method1258(16, arg1, (byte) 112);
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method160(-7979, new class25(var3));
        }
        if (arg0 != 28) {
            field3034 = 14;
        }
        class105.field1750.method1483((byte) -108, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILp;)V")
    public static final void method1203(int arg0, class280 arg1) {
        field3041++;
        class188.field3309 = arg1;
        if (class118.field2117.field3473 == null) {
            return;
        }
        try {
            class280 var2 = class55.field903.method1879(class118.field2117.field3473, 105);
            class280 var3 = class167.field2932.method1879(class118.field2117.field3473, 106);
            class280 var4 = class30.method266(new class280[] { var2, class134.field2372, arg1, class257.field4533, var3 }, (byte) -87);
            class280 var5;
            if (arg1.method1889(-1) == 0) {
                var5 = class30.method266(new class280[] { var4, class190.field3327 }, (byte) -87);
            } else {
                var5 = class30.method266(new class280[] { var4, class29.field547, class159.method1133((byte) 113, class77.method569((byte) -114) + 94608000000L), class76.field1255, class203.method1387((byte) -32, 94608000L) }, (byte) -87);
            }
            class30.method266(new class280[] { class163.field2861, var5, class40.field690 }, (byte) -87).method1880(class118.field2117.field3473, arg0 ^ 0xFFFFFF90);
        } catch (Throwable var6) {
        }
        if (arg0 != 2) {
            field3038 = -105;
        }
    }
}
