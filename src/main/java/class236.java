import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class236 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lls;")
    public static class141 field3428 = new class141(0, 0);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[[I")
    public static int[][] field3435 = new int[6][];

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lbh;")
    public static class37[] field3438 = new class37[4];

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field3437 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lmi;")
    public static class496[] field3436;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIBI)V", line = 3)
    public static final void method1641(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3433++;
        float var5 = (float) class489.field6789 / (float) class489.field6781;
        int var6 = arg0;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg2 - (arg0 - var6) / 2;
        int var9 = arg4 - (arg1 - var7) / 2;
        class606.field8321 = -1;
        class614.field8388 = class489.field6789 - (class489.field6789 * var9 / var7);
        class33.field850 = class489.field6781 * var8 / var6;
        class638.field8761 = -1;
        int var10 = 50 / ((-arg3 - 12) / 40);
        class7.method27(false);
    }

    @OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;", line = 33)
    public final String toString() {
        field3429++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 41)
    public static void method1642(int arg0) {
        field3435 = null;
        field3428 = null;
        if (arg0 >= 93) {
            field3436 = null;
            field3438 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 56)
    public static final void method1643(int arg0) {
        if (arg0 != -2049) {
            field3435 = null;
        }
        field3431++;
        if (!class184.field2785) {
            return;
        }
        class378 var1 = class751.method4199(class44.field980, (byte) -54, class406.field5949);
        if (var1 != null && var1.field5356 != null) {
            class33 var2 = new class33();
            var2.field847 = var1;
            var2.field845 = var1.field5356;
            class83.method788(var2);
        }
        class173.field2690 = -1;
        class184.field2785 = false;
        class130.field2184 = -1;
        if (var1 != null) {
            class296.method1945(-9343, var1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I", line = 89)
    public final int method1644(int arg0, int arg1, int arg2) {
        field3434++;
        if (arg2 != 1595) {
            return 38;
        }
        int var4 = class582.field7968 <= arg0 ? arg0 : class582.field7968;
        if (class453.field6388 == this) {
            return 0;
        } else if (class469.field6577 == this) {
            return var4 - arg1;
        } else if (class581.field7964 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 115)
    public static final String method1645(String arg0, boolean arg1, String arg2, String arg3) {
        field3439++;
        for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, arg0.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(arg2.length() + var4);
        }
        if (!arg1) {
            method1643(45);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 145)
    public static final void method1646(int arg0) {
        if (arg0 != 9864) {
            return;
        }
        field3432++;
        if (class272.field3822 == null) {
            return;
        }
        if (class241.field3529) {
            class186.method1352(true);
        }
        class545.field7511.method2654((byte) 69);
        class390.method2454();
        class748.method4175(arg0 - 9865);
        class497.method2934(-127);
        class257.method1742(-113);
        class394.method2474((byte) 124);
        if (class318.field4390 != null) {
            class318.field4390.method2719((byte) 96);
        }
        class319.method2052(true);
        class340.method2149((byte) 127);
        class246.method1691(-29776);
        class347.method2183(12639);
        class587.method3353(-78, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class598 var5 = class49.field1040[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field5749.length; var6++) {
                    var5.field5749[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class77.field1375; var2++) {
            class9 var3 = class728.field9860[var2].field10510;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field5749.length; var4++) {
                    var3.field5749[var4] = null;
                }
            }
        }
        class216.field3122 = null;
        class244.field3536 = null;
        class272.field3822.method614((byte) 64);
        class272.field3822 = null;
    }
}
