import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class161 extends class223 {

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private final int field2619;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    private final int field2621;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private final int field2613;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    private final int field2622;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lgb;")
    public static class212 field2617 = new class212(64);

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Ltl;")
    public static class59 field2623 = class85.method639("<img=0>", 9588);

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[I")
    public static int[] field2618;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V", line = 4)
    public final void method1144(int arg0, int arg1, int arg2) {
        if (arg2 != -19486) {
            this.method1144(70, 53, -68);
        }
        field2614++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1145(byte arg0) {
        class87.method655(98);
        field2616++;
        class16.method104(255);
        class216.method1500(-17121);
        class275.method1921(true);
        class222.method1537(0);
        class305.method2116(true);
        class202.method1446((byte) 83);
        class218.method1510(1);
        class120.method897(false);
        class182.method1354((byte) 126);
        class243.method1730(true);
        class243.method1728(-127);
        class177.method1314(true);
        class4.method27(-51);
        if (!class55.field815) {
            ((class280) class298.field5107).method1972((byte) 14);
        }
        class234.field3890.method1005(98);
        class245.field4099.method2043(false);
        class254.field4221.method2043(false);
        class162.field2642.method2043(false);
        class11.field145.method2043(false);
        class269.field4664.method2043(false);
        class98.field1573.method2043(false);
        class72.field1135.method2043(false);
        class34.field502.method2043(false);
        class155.field2535.method2043(false);
        if (arg0 <= 1) {
            field2618 = (int[]) null;
        }
        class149.field2448.method2043(false);
        class234.field3897.method2043(false);
        class169.field2722.method1484(false);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 61)
    public static void method1146(byte arg0) {
        field2618 = null;
        field2617 = null;
        if (arg0 != -109) {
            method1145((byte) 35);
        }
        field2623 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILme;Lme;)Lvj;", line = 73)
    public static final class95 method1147(int arg0, int arg1, int arg2, class295 arg3, class295 arg4) {
        field2624++;
        if (arg0 == 1) {
            return class33.method222(6, arg1, arg2, arg3) ? class190.method1401(arg4.method2042(arg1, arg2, (byte) -127), arg0 ^ 0xFFFFFFE8) : null;
        } else {
            return (class95) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V", line = 91)
    public final void method1148(int arg0, int arg1, int arg2) {
        field2615++;
        int var4 = this.field2619 * arg0 >> 12;
        int var5 = this.field2622 * arg1 >> 12;
        int var6 = this.field2621 * arg0 >> 12;
        if (arg2 >= -54) {
            method1150(-112L, 58);
        }
        int var7 = this.field2613 * arg1 >> 12;
        class187.method1382(var4, var7, this.field3618, var6, var5, 21);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V", line = 115)
    public final void method1149(int arg0, int arg1, int arg2) {
        int var4 = 16 % ((arg1 - 75) / 43);
        field2620++;
        int var5 = this.field2619 * arg2 >> 12;
        int var6 = this.field2621 * arg2 >> 12;
        int var7 = this.field2622 * arg0 >> 12;
        int var8 = this.field2613 * arg0 >> 12;
        class313.method2159(this.field3618, var8, -97, var5, this.field3621, this.field3608, var7, var6);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIII)V", line = 137)
    public class161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2619 = arg0;
        this.field2621 = arg2;
        this.field2613 = arg1;
        this.field2622 = arg3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JI)V", line = 152)
    public static final void method1150(long arg0, int arg1) {
        field2625++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 1) {
            field2617 = (class212) null;
        }
        for (int var3 = 0; var3 < class293.field5001; var3++) {
            if (class16.field213[var3] == arg0) {
                class260.field4338++;
                class293.field5001--;
                for (int var4 = var3; var4 < class293.field5001; var4++) {
                    class88.field1380[var4] = class88.field1380[var4 + 1];
                    class25.field332[var4] = class25.field332[var4 + 1];
                    class97.field1560[var4] = class97.field1560[var4 + 1];
                    class16.field213[var4] = class16.field213[var4 + 1];
                    class34.field501[var4] = class34.field501[var4 + 1];
                    class87.field1375[var4] = class87.field1375[var4 + 1];
                }
                class154.field2520 = class180.field3007;
                class234.field3888.method1768(true, 127);
                class234.field3888.method1206(arg0, false);
                break;
            }
        }
    }
}
