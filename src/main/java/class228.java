import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class228 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lfj;")
    private class274 field3570 = new class274((byte[]) null);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[B")
    private static byte[] field3569 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    private int field3577;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "J")
    private long field3576;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
    public int[] field3572;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
    private int[] field3573;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[I")
    private int[] field3574;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
    private int[] field3575;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
    public final int method1570(int arg0) {
        return this.method1573(arg0);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public final void method1571(int arg0) {
        int var2 = this.field3570.method1850(true);
        this.field3572[arg0] += var2;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)J")
    public final long method1572(int arg0) {
        return (long) this.field3577 * (long) arg0 + this.field3576;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I")
    private final int method1573(int arg0) {
        byte var2 = this.field3570.field4441[this.field3570.field4458];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3574[arg0] = var3;
            this.field3570.field4458++;
        } else {
            var3 = this.field3574[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1578(arg0, var3);
        }
        int var4 = this.field3570.method1850(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3570.field4441[this.field3570.field4458] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3570.field4458++;
                this.field3574[arg0] = var5;
                return this.method1578(arg0, var5);
            }
        }
        this.field3570.field4458 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
    public final void method1574() {
        this.field3570.field4441 = null;
        this.field3573 = null;
        this.field3575 = null;
        this.field3572 = null;
        this.field3574 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V")
    public final void method1575() {
        this.field3570.field4458 = -1;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public final void method1576(int arg0) {
        this.field3575[arg0] = this.field3570.field4458;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()Z")
    public final boolean method1577() {
        return this.field3570.field4441 != null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
    private final int method1578(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3569[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3570.method1849(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3570.method1849(255) << 16;
            }
            return var8;
        }
        int var3 = this.field3570.method1849(255);
        int var4 = this.field3570.method1850(true);
        if (var3 == 47) {
            this.field3570.field4458 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3570.method1812(true);
            var4 -= 3;
            int var6 = this.field3572[arg0];
            this.field3576 += (long) (this.field3577 - var5) * (long) var6;
            this.field3577 = var5;
            this.field3570.field4458 += var4;
            return 2;
        } else {
            this.field3570.field4458 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
    public final int method1579() {
        int var1 = this.field3575.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3575[var4] >= 0 && this.field3572[var4] < var3) {
                var2 = var4;
                var3 = this.field3572[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()Z")
    public final boolean method1580() {
        int var1 = this.field3575.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3575[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "()I")
    public final int method1581() {
        return this.field3575.length;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    public final void method1582(int arg0) {
        this.field3570.field4458 = this.field3575[arg0];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(J)V")
    public final void method1583(long arg0) {
        this.field3576 = arg0;
        int var3 = this.field3575.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3572[var4] = 0;
            this.field3574[var4] = 0;
            this.field3570.field4458 = this.field3573[var4];
            this.method1571(var4);
            this.field3575[var4] = this.field3570.field4458;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([B)V")
    public final void method1584(byte[] arg0) {
        this.field3570.field4441 = arg0;
        this.field3570.field4458 = 10;
        int var2 = this.field3570.method1837(252);
        this.field3571 = this.field3570.method1837(252);
        this.field3577 = 500000;
        this.field3573 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3570.method1833((byte) -104);
            int var6 = this.field3570.method1833((byte) -104);
            if (var5 == 1297379947) {
                this.field3573[var3] = this.field3570.field4458;
                var3++;
            }
            this.field3570.field4458 += var6;
        }
        this.field3576 = 0L;
        this.field3575 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3575[var4] = this.field3573[var4];
        }
        this.field3572 = new int[var2];
        this.field3574 = new int[var2];
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "()V")
    public static void method1585() {
        field3569 = null;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class228() {
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V")
    public class228(byte[] arg0) {
        this.method1584(arg0);
    }
}
