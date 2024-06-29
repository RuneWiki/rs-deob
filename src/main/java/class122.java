import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class122 extends class99 {

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "Lr;")
    public static class66 field2304 = class93.method641(43, "cookieprefix");

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Lr;")
    public static class66 field2305 = class93.method641(43, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZJ)V")
    public static final void method825(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0) {
                method825(false, 103L);
            }
        } catch (InterruptedException var3) {
        }
        ++field2306;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class122() {
        this(4096);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field2298;
        if (arg0 != -61) {
            this.method11((class249) null, 45, -36);
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            class46.method330(var3, 0, class199.field3432, this.field2301);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLr;)Luf;")
    public static final class240 method826(byte arg0, class66 arg1) {
        ++field2302;
        for (class240 var2 = (class240) class241.field4183.method873((byte) 76); var2 != null; var2 = (class240) class241.field4183.method870((byte) -118)) {
            if (var2.field4164.method463(arg1, (byte) 125)) {
                return var2;
            }
        }
        int var3 = 46 % ((arg0 - 28) / 32);
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static void method827(int arg0) {
        field2304 = null;
        field2305 = null;
        if (arg0 != 0) {
            field2304 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)I")
    public static final int method828(int arg0, int arg1) {
        ++field2307;
        if (arg0 != -1872384500) {
            field2304 = null;
        }
        if (arg1 >= 97 && ~arg1 >= -123 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (~arg1 == -256) {
            return 159;
        } else {
            return ~arg1 == -157 ? 140 : arg1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
    private class122(int arg0) {
        super(0, true);
        this.field2301 = 4096;
        this.field2301 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method829(String arg0, int arg1) throws ClassNotFoundException {
        ++field2303;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg1 != -1) {
                field2305 = null;
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILr;)V")
    public static final void method830(byte arg0, int arg1, class66 arg2) {
        ++field2300;
        class197 var3 = class135.method933(arg1, 2, (byte) -120);
        var3.method1284(0);
        var3.field3412 = arg2;
        if (arg0 < 69) {
            field2305 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lcj;ILcj;)I")
    public static final int method831(class28 arg0, int arg1, class28 arg2) {
        ++field2299;
        int var3 = 0;
        if (arg0.method157(class215.field3700, 0)) {
            ++var3;
        }
        if (arg0.method157(class244.field4268, 0)) {
            ++var3;
        }
        if (arg0.method157(class91.field1756, 0)) {
            ++var3;
        }
        if (arg2.method157(class215.field3700, 0)) {
            ++var3;
        }
        if (arg1 < 43) {
            method826((byte) -13, (class66) null);
        }
        if (arg2.method157(class244.field4268, 0)) {
            ++var3;
        }
        if (arg2.method157(class91.field1756, 0)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field2304 = null;
        }
        if (~arg1 == -1) {
            this.field2301 = (arg0.method1677(arg2 + -6676) << 12) / 255;
        }
        ++field2309;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
    public static final void method832(int arg0) {
        ++field2308;
        if (arg0 != 19114) {
            field2304 = null;
        }
        while (class84.field1627.method575(class61.field1033, -104) >= 27) {
            int var1 = class84.field1627.method572((byte) 0, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class178.field3112[var1] == null) {
                var2 = true;
                class178.field3112[var1] = new class37();
            }
            class37 var3 = class178.field3112[var1];
            class49.field877[class160.field2869++] = var1;
            var3.field2091 = class75.field1501;
            var3.field548 = class96.method665(class84.field1627.method572((byte) 0, 14), -103);
            int var4 = class84.field1627.method572((byte) 0, 1);
            if (var4 == 1) {
                class83.field1599[class240.field4170++] = var1;
            }
            int var5 = class84.field1627.method572((byte) 0, 5);
            if (~var5 < -16) {
                var5 -= 32;
            }
            int var6 = class84.field1627.method572((byte) 0, 5);
            int var7 = class12.field153[class84.field1627.method572((byte) 0, 3)];
            if (var2) {
                var3.field2049 = var3.field2064 = var7;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class84.field1627.method572((byte) 0, 1);
            var3.field2048 = var3.field548.field3520;
            var3.field2060 = var3.field548.field3561;
            var3.field2046 = var3.field548.field3519;
            var3.field2097 = var3.field548.field3566;
            var3.field2081 = var3.field548.field3577;
            var3.field2080 = var3.field548.field3531;
            var3.field2059 = var3.field548.field3550;
            if (~var3.field2097 == -1) {
                var3.field2064 = 0;
            }
            var3.field2090 = var3.field548.field3557;
            var3.field2079 = var3.field548.field3525;
            var3.method731(class207.field3595.field2086[0] + var5, (byte) -68, class207.field3595.field2039[0] - -var6, ~var8 == -2);
            if (var3.field548.method1336(arg0 ^ 19114)) {
                class242.method1596(19395, var3.field2086[0], var3, (class231) null, 0, var3.field2039[0], class196.field3401, (class45) null);
            }
        }
        class84.field1627.method571((byte) -59);
    }
}
