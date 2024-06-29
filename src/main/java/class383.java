import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class383 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "Ljw;")
    public static class581 field5607 = new class581(118, -2);

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
    public static int[] field5611 = null;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Laj;")
    public static class333 field5606;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lwea;Z[[[BIB)Z")
    public static final boolean method2438(class167 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class269.field3967) {
            return false;
        }
        int var5 = arg0.field2257 >> class26.field388;
        int var6 = var5;
        int var7 = arg0.field2259 >> class26.field388;
        int var8 = var7;
        if (arg0 instanceof class319) {
            var6 = ((class319) arg0).field4595;
            var8 = ((class319) arg0).field4585;
            var5 = ((class319) arg0).field4600;
            var7 = ((class319) arg0).field4590;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field2244 < class315.field4541 && var9 >= class402.field5850 && var9 < class212.field2810 && var10 >= class391.field5697 && var10 < class647.field8988) {
                    if ((arg2 == null || arg0.field2250 < arg3 || arg2[arg0.field2250][var9][var10] != arg4) && arg0.method45(124) && !arg0.method41(101, class192.field2582)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class331.field4776 - 16 && var9 <= class331.field4776 + 16 && var10 >= class76.field1102 - 16 && var10 <= class76.field1102 + 16) {
                        if (class238.field3214) {
                            class398.field5838[class668.field9295++].method3138(-4194, arg0);
                            class668.field9295 %= class458.field6353;
                        } else {
                            arg0.method32((byte) 122, class192.field2582);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)Lkf;")
    public static final class267 method2439(int arg0, int arg1, int arg2, int arg3) {
        field5609++;
        class267 var4 = null;
        if (arg1 == 0) {
            var4 = class545.method3099((byte) 88, class269.field3966, class107.field1475);
            class490.field6800++;
        }
        if (arg3 != 255) {
            return null;
        }
        if (arg1 == 1) {
            class74.field1082++;
            var4 = class545.method3099((byte) 45, class269.field3966, class711.field9954);
        }
        var4.field3938.method2382(-25724, arg2 + class230.field3147);
        var4.field3938.method2363(29262, class121.field1765 + arg0);
        var4.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
        class768.field10595 = false;
        class779.field10689 = arg0;
        class692.field9714 = arg2;
        class212.method1405(arg3 ^ 0xFFFFFF2E);
        return var4;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Loba;Z)Ljava/lang/String;")
    public static final String method2440(class275 arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field5610++;
        if (arg0.field4082 == null || arg0.field4082.length() == 0) {
            return arg0.field4084 == null || arg0.field4084.length() <= 0 ? arg0.field4078 : arg0.field4078 + class474.field6571.method2780(100, class38.field589) + arg0.field4084;
        } else if (arg0.field4084 == null || arg0.field4084.length() <= 0) {
            return arg0.field4078 + class474.field6571.method2780(102, class38.field589) + arg0.field4082;
        } else {
            return arg0.field4078 + class474.field6571.method2780(116, class38.field589) + arg0.field4084 + class474.field6571.method2780(103, class38.field589) + arg0.field4082;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method2441(byte arg0) {
        field5611 = null;
        if (arg0 >= -27) {
            method2440(null, true);
        }
        field5606 = null;
        field5607 = null;
    }
}
