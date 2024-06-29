import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class464 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lm;")
    public class189 field6565 = new class189();

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field6561 = new int[2];

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[J")
    public static long[] field6575 = new long[32];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lm;")
    private class189 field6577;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Z")
    public final boolean method2757(byte arg0) {
        field6569++;
        if (arg0 == 27) {
            return this.field6565.field2543 == this.field6565;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2758(int arg0) {
        field6561 = null;
        field6575 = null;
        if (arg0 != 2) {
            method2768(null, false);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lm;")
    public final class189 method2759(int arg0) {
        field6563++;
        class189 var2 = this.field6577;
        if (this.field6565 == var2) {
            this.field6577 = null;
            return null;
        }
        this.field6577 = var2.field2543;
        if (arg0 != -15361) {
            this.field6565 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lm;")
    public final class189 method2760(boolean arg0) {
        if (!arg0) {
            field6561 = null;
        }
        field6570++;
        class189 var2 = this.field6577;
        if (this.field6565 == var2) {
            this.field6577 = null;
            return null;
        } else {
            this.field6577 = var2.field2545;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILbg;)V")
    public final void method2761(int arg0, class464 arg1) {
        field6560++;
        if (arg0 > 49) {
            this.method2771(-52, arg1, this.field6565.field2543);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Lm;")
    public final class189 method2762(byte arg0) {
        field6571++;
        if (arg0 != -16) {
            method2758(75);
        }
        class189 var2 = this.field6565.field2543;
        if (this.field6565 == var2) {
            return null;
        } else {
            var2.method1185(arg0 - 78);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lm;")
    public final class189 method2763(int arg0) {
        int var2 = 120 % ((arg0 - 50) / 42);
        field6573++;
        class189 var3 = this.field6565.field2545;
        if (this.field6565 == var3) {
            this.field6577 = null;
            return null;
        } else {
            this.field6577 = var3.field2545;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
    public final int method2764(int arg0) {
        field6572++;
        int var2 = 0;
        if (arg0 <= 11) {
            this.field6577 = null;
        }
        for (class189 var3 = this.field6565.field2543; var3 != this.field6565; var3 = var3.field2543) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Lm;")
    public final class189 method2765(int arg0) {
        if (arg0 != -12261) {
            return null;
        }
        field6576++;
        class189 var2 = this.field6565.field2543;
        if (this.field6565 == var2) {
            this.field6577 = null;
            return null;
        } else {
            this.field6577 = var2.field2543;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    public static final void method2766(int arg0) {
        class582.field8201 = new class37(class71.field900.method588((byte) 112, class549.field7669), "", class86.field1057, 1011, -1, 0L, 0, 0, true, false, 0L, true);
        int var1 = 57 % ((arg0 - 26) / 60);
        field6566++;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public final void method2767(byte arg0) {
        while (true) {
            class189 var2 = this.field6565.field2543;
            if (this.field6565 == var2) {
                field6567++;
                this.field6577 = null;
                if (arg0 != -19) {
                    this.method2770((byte) -54, null);
                    return;
                }
                return;
            }
            var2.method1185(-50);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbe;Z)V")
    public static final void method2768(class37 arg0, boolean arg1) {
        field6559++;
        if (arg0 == null) {
            return;
        }
        class215.field2820.method2770((byte) -13, arg0);
        if (arg1) {
            return;
        }
        class25.field341++;
        Object var2 = null;
        class508 var5;
        if (arg0.field464 || "".equals(arg0.field470)) {
            var5 = new class508(arg0.field470);
            class350.field4958++;
        } else {
            long var3 = arg0.field466;
            for (var5 = (class508) class417.field5899.method1180((byte) 26, var3); var5 != null && !var5.field7270.equals(arg0.field470); var5 = (class508) class417.field5899.method1174(0)) {
            }
            if (var5 == null) {
                var5 = (class508) class609.field8569.method4022(var3, (byte) -91);
                if (var5 != null && !var5.field7270.equals(arg0.field470)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class508(arg0.field470);
                }
                class417.field5899.method1179(var3, var5, (byte) -26);
                class350.field4958++;
            }
        }
        if (var5.method3000((byte) 11, arg0)) {
            class76.method610(-40, var5);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lm;I)V")
    public final void method2769(class189 arg0, int arg1) {
        field6564++;
        if (arg0.field2545 != null) {
            arg0.method1185(-62);
        }
        arg0.field2543 = this.field6565.field2543;
        arg0.field2545 = this.field6565;
        arg0.field2545.field2543 = arg0;
        int var3 = -121 / ((22 - arg1) / 41);
        arg0.field2543.field2545 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLm;)V")
    public final void method2770(byte arg0, class189 arg1) {
        if (arg1.field2545 != null) {
            arg1.method1185(-46);
        }
        field6574++;
        arg1.field2545 = this.field6565.field2545;
        arg1.field2543 = this.field6565;
        arg1.field2545.field2543 = arg1;
        arg1.field2543.field2545 = arg1;
        if (arg0 != -13) {
            field6575 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILbg;Lm;)V")
    private final void method2771(int arg0, class464 arg1, class189 arg2) {
        field6562++;
        if (arg0 > -51) {
            this.field6577 = null;
        }
        class189 var4 = this.field6565.field2545;
        this.field6565.field2545 = arg2.field2545;
        arg2.field2545.field2543 = this.field6565;
        if (this.field6565 != arg2) {
            arg2.field2545 = arg1.field6565.field2545;
            arg2.field2545.field2543 = arg2;
            arg1.field6565.field2545 = var4;
            var4.field2543 = arg1.field6565;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class464() {
        this.field6565.field2543 = this.field6565;
        this.field6565.field2545 = this.field6565;
    }
}
