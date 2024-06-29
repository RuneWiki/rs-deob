import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class76 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[[S")
    public static short[][] field1121 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lso;")
    public static class327 field1122 = new class327(14, 18);

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lki;")
    public static class498 field1126 = new class498(49, 6);

    @OriginalMember(owner = "client!co", name = "n", descriptor = "[I")
    public static int[] field1132 = new int[1];

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Z")
    public static boolean field1131 = false;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "[I")
    public static int[] field1130;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method429(int arg0) {
        field1121 = null;
        field1122 = null;
        field1130 = null;
        int var1 = 99 / ((-arg0 - 65) / 41);
        field1132 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLdh;)V")
    public final void method430(boolean arg0, class209 arg1) {
        if (arg0) {
            method433(71, false, 101, 61, -80, 33);
        }
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field1129++;
                return;
            }
            this.method432(-92, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)[Lgo;")
    public static final class441[] method431(byte arg0) {
        if (arg0 == 52) {
            field1128++;
            return new class441[] { class449.field6695, class393.field5934, class211.field3078, class493.field7288, class405.field6111, class176.field2599, class176.field2598, class8.field110, class478.field7026, class73.field1084, class324.field4629, class320.field4577, class391.field5887, class444.field6614 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILdh;)V")
    private final void method432(int arg0, int arg1, class209 arg2) {
        field1120++;
        if (arg1 == 1) {
            this.field1127 = arg2.method1450((byte) 28);
            this.field1123 = arg2.method1428(32122);
            this.field1124 = arg2.method1428(32122);
        }
        if (arg0 > -46) {
            method434(71, -110, true, -41, -47);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZIIII)V")
    public static final void method433(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1125++;
        long var6 = (long) (arg5 | (arg1 ? Integer.MIN_VALUE : 0));
        if (arg0 != 26897) {
            return;
        }
        class138 var8 = (class138) class81.field1223.method2605(false, var6);
        if (var8 == null) {
            var8 = new class138();
            class81.field1223.method2606(var8, var6, 0);
        }
        if (var8.field2079.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field2079.length; var11++) {
                var9[var11] = var8.field2079[var11];
                var10[var11] = var8.field2081[var11];
            }
            for (int var12 = var8.field2079.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field2079 = var9;
            var8.field2081 = var10;
        }
        var8.field2079[arg3] = arg4;
        var8.field2081[arg3] = arg2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIZII)Lls;")
    public static final class92 method434(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1119++;
        class92 var5 = new class92();
        var5.field1378 = arg0;
        var5.field1376 = arg4;
        class431.field6450.method2606(var5, (long) arg3, arg1 ^ arg1);
        class24.method152(41, arg0);
        class38 var6 = class149.method979((byte) -113, arg3);
        if (var6 != null) {
            class350.method2203((byte) -120, var6);
        }
        if (class191.field2809 != null) {
            class350.method2203((byte) -117, class191.field2809);
            class191.field2809 = null;
        }
        class519.method3057(false);
        if (var6 != null) {
            class478.method2850(var6, !arg2, true);
        }
        if (!arg2) {
            class360.method2239(arg0);
        }
        if (!arg2 && class6.field79 != -1) {
            class110.method677(1, false, class6.field79);
        }
        return var5;
    }
}
