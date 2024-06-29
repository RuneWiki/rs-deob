import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class104 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lmc;")
    public static class75 field2633 = class30.method234(true, ")3000");

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lka;")
    public static class61 field2630 = new class61(8);

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lmc;")
    public static class75 field2646 = class30.method234(true, "Ung-Ultiger Benutzername oder Passwort)3");

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lmc;")
    private static class75 field2644 = class30.method234(true, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lmc;")
    public static class75 field2645 = class30.method234(true, ":  ");

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lmc;")
    public static class75 field2647 = class30.method234(true, "backright1");

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lmc;")
    public static class75 field2643 = field2644;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[J")
    public static long[] field2649 = new long[200];

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lmc;")
    private static class75 field2648 = class30.method234(true, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lmc;")
    public static class75 field2641 = field2648;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lud;")
    public static class121 field2639;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lpb;")
    public static class92 field2636;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lpb;")
    public static class92 field2638;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[Z")
    public static boolean[] field2632;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method858(byte arg0, int arg1) {
        field2628++;
        int var2 = 104 / ((53 - arg0) / 61);
        return (int) (Math.log((double) arg1 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lja;Lja;ILja;)V", line = 44)
    public static final void method859(class55 arg0, class55 arg1, int arg2, class55 arg3) {
        class24.field471 = arg3;
        class122.field3012 = arg0;
        field2637++;
        if (arg2 != -32000) {
            field2646 = null;
        }
        class100.field2576 = arg1;
        class74.field1854 = new class99[class122.field3012.method453(6439)][];
        field2632 = new boolean[class122.field3012.method453(6439)];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILja;B)Lnc;", line = 67)
    public static final class81 method860(int arg0, class55 arg1, byte arg2) {
        if (arg2 != 15) {
            method860(25, null, (byte) 102);
        }
        field2635++;
        return class32.method255(arg0, 27924, arg1) ? class86.method723(false) : null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 82)
    public static final void method861(int arg0) {
        field2629++;
        int var1 = 84 / ((-arg0 - 64) / 59);
        for (class108 var2 = (class108) class52.field1312.method248(32); var2 != null; var2 = (class108) class52.field1312.method252(120)) {
            if (class99.field2510 != var2.field2729 || var2.field2721 < class34.field781) {
                var2.method589(true);
            } else if (var2.field2728 <= class34.field781) {
                if (var2.field2700 > 0) {
                    class97 var3 = class12.field231[var2.field2700 - 1];
                    if (var3 != null && var3.field1233 >= 0 && var3.field1233 < 13312 && var3.field1242 >= 0 && var3.field1242 < 13312) {
                        var2.method891(class34.field781, var3.field1242, var3.field1233, class126.method1000(var3.field1242, var2.field2729, false, var3.field1233) - var2.field2731, (byte) -93);
                    }
                }
                if (var2.field2700 < 0) {
                    int var4 = -var2.field2700 - 1;
                    class122 var5;
                    if (class92.field2285 == var4) {
                        var5 = class52.field1315;
                    } else {
                        var5 = class40.field957[var4];
                    }
                    if (var5 != null && var5.field1233 >= 0 && var5.field1233 < 13312 && var5.field1242 >= 0 && var5.field1242 < 13312) {
                        var2.method891(class34.field781, var5.field1242, var5.field1233, class126.method1000(var5.field1242, var2.field2729, false, var5.field1233) - var2.field2731, (byte) -93);
                    }
                }
                var2.method887((byte) -78, class71.field1802);
                class107.field2679.method189(class99.field2510, (int) var2.field2707, (int) var2.field2704, (int) var2.field2705, 60, var2, var2.field2714, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 144)
    public static void method862(int arg0) {
        field2647 = null;
        field2644 = null;
        field2633 = null;
        field2641 = null;
        field2648 = null;
        field2645 = null;
        field2649 = null;
        if (arg0 != 29635) {
            return;
        }
        field2630 = null;
        field2639 = null;
        field2632 = null;
        field2643 = null;
        field2646 = null;
        field2636 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lmc;Lja;Lmc;I)Laa;", line = 169)
    public static final class2 method863(class75 arg0, class55 arg1, class75 arg2, int arg3) {
        field2631++;
        int var4 = arg1.method433(arg0, (byte) -122);
        int var5 = arg1.method451(arg2, var4, (byte) 124);
        int var6 = -61 / ((arg3 + 7) / 54);
        return class70.method597(var4, -1, var5, arg1);
    }
}
