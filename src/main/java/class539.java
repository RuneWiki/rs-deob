import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class539 implements class721 {

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lmp;")
    private class758 field7582 = new class758(128);

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
    public int[] field7584 = new int[class99.field1677.field5275];

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    private int[] field7580 = new int[class99.field1677.field5275];

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lqe;")
    public static class465 field7581 = new class465(117, 3);

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
    public static int[] field7589 = new int[5];

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "F")
    public static float field7588 = 0.25F;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lqaa;")
    public static class27 field7587 = new class27(73, -1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Liga;", line = 4)
    public static final class454[] method3167(int arg0) {
        field7574++;
        if (arg0 >= -22) {
            method3175(-98);
        }
        return new class454[] { class36.field537, class254.field3687, class611.field8845 };
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I", line = 17)
    public final int method3168(boolean arg0, int arg1) {
        field7583++;
        long var3 = class742.method4128(arg1 - 14174);
        class586 var5 = arg0 ? (class586) this.field7582.method4209(false) : (class586) this.field7582.method4207(9356);
        if (arg1 != 14175) {
            field7587 = null;
        }
        while (var5 != null) {
            if ((var5.field8246 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field8246 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field8991;
                    this.field7584[var6] = this.field7580[var6];
                    var5.method3617(1);
                    return var6;
                }
                var5.method3617(1);
            }
            var5 = (class586) this.field7582.method4207(9356);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZI)V", line = 58)
    public final void method3169(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field7573++;
        this.field7580[arg0] = arg2;
        class586 var4 = (class586) this.field7582.method4203(!arg1, (long) arg0);
        if (var4 == null) {
            class586 var5 = new class586(4611686018427387905L);
            this.field7582.method4211(var5, (byte) 109, (long) arg0);
        } else if (var4.field8246 != 4611686018427387905L) {
            var4.field8246 = class742.method4128(1) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 87)
    public final void method3170(int arg0, int arg1, int arg2) {
        this.field7584[arg1] = arg0;
        field7572++;
        class586 var4 = (class586) this.field7582.method4203(true, (long) arg1);
        if (var4 == null) {
            class586 var5 = new class586(class742.method4128(arg2 ^ 0xFFFFFFFE) + 500L);
            this.field7582.method4211(var5, (byte) 107, (long) arg1);
        } else {
            var4.field8246 = class742.method4128(arg2 + 2) + 500L;
        }
        if (arg2 != -1) {
            this.field7582 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V", line = 111)
    public final void method3171(int arg0, byte arg1, int arg2) {
        field7576++;
        class662 var4 = class679.field9567.method210(arg2, 112);
        int var5 = var4.field9319;
        int var6 = var4.field9310;
        int var7 = var4.field9312;
        int var8 = class63.field1139[var7 - var6];
        int var9 = 5 % ((arg1 - 63) / 56);
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var10 = var8 << var6;
        this.method3169(var5, false, arg0 << var6 & var10 | ~var10 & this.field7580[var5]);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V", line = 138)
    public static final void method3172(boolean arg0, boolean arg1) {
        field7575++;
        class565.method3297(96);
        if (!class379.method2373(arg0, class611.field8839)) {
            return;
        }
        class373.field5241++;
        if (class373.field5241 < 50 && !arg1) {
            return;
        }
        class373.field5241 = 0;
        if (!class420.field5904 && class555.field7776 != null) {
            class21.field267++;
            class135 var2 = class273.method1801(class459.field6629, class392.field5505, 2);
            method3178(var2, -18925);
            try {
                class464.method2823((byte) 120);
            } catch (IOException var3) {
                class420.field5904 = true;
            }
        }
        class565.method3297(88);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V", line = 171)
    public final void method3173(int arg0, int arg1, int arg2) {
        int var4 = -33 % ((52 - arg1) / 61);
        field7578++;
        class662 var5 = class679.field9567.method210(arg2, 111);
        int var6 = var5.field9319;
        int var7 = var5.field9310;
        int var8 = var5.field9312;
        int var9 = class63.field1139[var8 - var7];
        if (arg0 < 0 || var9 < arg0) {
            arg0 = 0;
        }
        int var10 = var9 << var7;
        this.method3170(var10 & arg0 << var7 | this.field7584[var6] & ~var10, var6, -1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I", line = 199)
    public final int method3174(int arg0, int arg1) {
        int var3 = -118 / ((10 - arg1) / 45);
        field7586++;
        return this.field7584[arg0];
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 209)
    public static void method3175(int arg0) {
        field7587 = null;
        field7581 = null;
        if (arg0 != 20444) {
            method3172(false, false);
        }
        field7589 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I", line = 227)
    public final int method3176(byte arg0, int arg1) {
        field7577++;
        if (arg0 <= 64) {
            return -14;
        }
        class662 var3 = class679.field9567.method210(arg1, 69);
        int var4 = var3.field9319;
        int var5 = var3.field9310;
        int var6 = var3.field9312;
        int var7 = class63.field1139[var6 - var5];
        return var7 & this.field7584[var4] >> var5;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 248)
    public final void method3177(int arg0) {
        for (int var2 = 0; var2 < class99.field1677.field5275; var2++) {
            class318 var3 = class99.field1677.method2365((byte) 65, var2);
            if (var3 != null && var3.field4507 == 0) {
                this.field7580[var2] = 0;
                this.field7584[var2] = 0;
            }
        }
        field7585++;
        this.field7582 = new class758(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lvr;I)V", line = 272)
    public static final void method3178(class135 arg0, int arg1) {
        class744.field10423.method1526(arg0, arg1 + 19044);
        field7579++;
        arg0.field2112 = arg0.field2109.field469;
        arg0.field2109.field469 = 0;
        if (arg1 != -18925) {
            field7587 = null;
        }
        class667.field9363 += arg0.field2112;
    }
}
