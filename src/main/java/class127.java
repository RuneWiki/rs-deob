import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class127 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2033 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    public static int[] field2034;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "[I")
    public static int[] field2041;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILid;)V")
    public static final void method859(int arg0, int arg1, class230 arg2) {
        field2040++;
        if (class73.field924 < arg2.field3799) {
            class220.method1556(64, arg2);
        } else if (class73.field924 > arg2.field3792) {
            class289.method1946(arg2, -2);
        } else {
            class282.method1882(arg2, (byte) -97);
        }
        if (arg2.field3818 < 128 || arg2.field3820 < 128 || arg2.field3818 >= 13184 || arg2.field3820 >= 13184) {
            arg2.field3757 = -1;
            arg2.field3827 = -1;
            arg2.field3792 = 0;
            arg2.field3799 = 0;
            arg2.field3818 = arg2.field3829[0] * 128 + (arg2.method1638(-6377) * 64);
            arg2.field3820 = arg2.field3836[0] * 128 + arg2.method1638(-6377) * 64;
            arg2.method1640(0);
        }
        if (class286.field4571 == arg2 && (arg2.field3818 < 1536 || arg2.field3820 < 1536 || arg2.field3818 >= 11776 || arg2.field3820 >= 11776)) {
            arg2.field3792 = 0;
            arg2.field3757 = -1;
            arg2.field3799 = 0;
            arg2.field3827 = -1;
            arg2.field3818 = arg2.field3829[0] * 128 + arg2.method1638(-6377) * 64;
            arg2.field3820 = arg2.field3836[0] * 128 + arg2.method1638(-6377) * 64;
            arg2.method1640(0);
        }
        class251.method1729((byte) 125, arg2);
        if (arg0 < -118) {
            class52.method301((byte) 84, arg2);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[B")
    public abstract byte[] method860(int arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method861(int arg0) {
        class25.field349++;
        field2036++;
        if (arg0 != 30362) {
            method865((byte) -97);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static final void method862(boolean arg0) {
        if (arg0) {
            class46.field585 = class75.field943;
            class17.field209 = class172.field2739;
        } else {
            class46.field585 = class84.field1044;
            class17.field209 = class25.field348;
        }
        class34.field444 = class46.field585.length;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Z")
    public static final boolean method863(int arg0) {
        field2039++;
        if (arg0 != -31459) {
            return false;
        }
        try {
            return class276.method1847((byte) -21);
        } catch (IOException var4) {
            class42.method229(true);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class152.field2363 + "," + class200.field3167 + "," + class285.field4530 + " - " + class219.field3508 + "," + (class286.field4571.field3829[0] + class167.field2683) + "," + (class181.field2883 + class286.field4571.field3836[0]) + " - ";
            for (int var3 = 0; var3 < class219.field3508 && var3 < 50; var3++) {
                var2 = var2 + class96.field1283.field1218[var3] + ",";
            }
            class30.method168((byte) -93, var5, var2);
            class144.method1008(-8905);
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
    public abstract void method864(byte arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method865(byte arg0) {
        for (int var1 = 0; var1 < class71.field883; var1++) {
            class234 var3 = class242.method1691(30099, var1);
            if (var3 != null && var3.field3865 == 0) {
                class238.field3939[var1] = 0;
                class135.field2141[var1] = 0;
            }
        }
        int var2 = 48 / ((arg0 - 40) / 41);
        field2035++;
        class144.field2276 = new class110(16);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
    public abstract int method866(int arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLeh;)V")
    public static final void method867(byte arg0, class137 arg1) {
        class45.field575 = arg1;
        field2038++;
        class42.field534 = class45.field575.method926(26899, 4);
        if (arg0 <= 22) {
            field2033 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
    public static final void method868(boolean arg0, int arg1) {
        if (!arg0) {
            method863(17);
        }
        field2042++;
        class233 var2 = class114.method746(arg1, 1228126432, 4);
        var2.method1653(false);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Lhh;")
    public abstract class44 method869(byte arg0);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method870(int arg0) {
        if (arg0 == -25708) {
            field2041 = null;
            field2033 = null;
            field2034 = null;
        }
    }
}
