import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class38 extends class91 {

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "[J")
    private long[] field572 = new long[10];

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    private int field564 = 256;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    private int field558 = 0;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field576 = 1;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "J")
    private long field565 = class3.method13(17161);

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lr;")
    private static class66 field553 = class93.method641(43, "Oct");

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lr;")
    private static class66 field557 = class93.method641(43, "Mar");

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lr;")
    private static class66 field552 = class93.method641(43, "Dec");

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lr;")
    private static class66 field562 = class93.method641(43, "Jun");

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "Lr;")
    private static class66 field566 = class93.method641(43, "Jul");

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field568 = 1;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lr;")
    private static class66 field554 = class93.method641(43, "Aug");

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lr;")
    private static class66 field560 = class93.method641(43, "Apr");

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lr;")
    private static class66 field567 = class93.method641(43, "Sep");

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Lr;")
    private static class66 field575 = class93.method641(43, "Jan");

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lr;")
    private static class66 field573 = class93.method641(43, "Nov");

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Lr;")
    private static class66 field569 = class93.method641(43, "May");

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "Lr;")
    private static class66 field574 = class93.method641(43, "Feb");

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "[Lr;")
    public static class66[] field563 = new class66[] { field575, field574, field557, field560, field569, field562, field566, field554, field567, field553, field573, field552 };

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lcj;")
    public static class28 field559;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
    public static final int method208(int arg0, byte arg1) {
        if (arg1 == 65) {
            field556++;
            return arg0 & 0x7F;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method209(int arg0) {
        if (arg0 != 25) {
            field574 = null;
        }
        field563 = null;
        field574 = null;
        field557 = null;
        field553 = null;
        field575 = null;
        field554 = null;
        field552 = null;
        field559 = null;
        field566 = null;
        field567 = null;
        field560 = null;
        field562 = null;
        field573 = null;
        field569 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public final void method210(boolean arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field572[var2] = 0L;
        }
        field571++;
        if (!arg0) {
            method209(-115);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public final int method211(int arg0, int arg1, int arg2) {
        field561++;
        if (arg1 != -19) {
            field557 = null;
        }
        int var4 = this.field564;
        this.field564 = 300;
        int var5 = this.field576;
        this.field576 = 1;
        this.field565 = class3.method13(17161);
        if (this.field572[this.field570] == 0L) {
            this.field564 = var4;
            this.field576 = var5;
        } else if (this.field572[this.field570] < this.field565) {
            this.field564 = (int) ((long) (arg2 * 2560) / (this.field565 - this.field572[this.field570]));
        }
        if (this.field564 < 25) {
            this.field564 = 25;
        }
        if (this.field564 > 256) {
            this.field564 = 256;
            this.field576 = (int) ((long) arg2 - ((this.field565 - this.field572[this.field570]) / 10L));
        }
        if (this.field576 > arg2) {
            this.field576 = arg2;
        }
        this.field572[this.field570] = this.field565;
        this.field570 = (this.field570 + 1) % 10;
        if (this.field576 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field572[var6] != 0L) {
                    this.field572[var6] -= -((long) this.field576);
                }
            }
        }
        if (this.field576 < arg0) {
            this.field576 = arg0;
        }
        class91.method636(arg1 + 14, (long) this.field576);
        int var7 = 0;
        while (this.field558 < 256) {
            this.field558 += this.field564;
            var7++;
        }
        this.field558 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class38() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field572[var1] = this.field565;
        }
    }
}
