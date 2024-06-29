import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class261 extends class71 {

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    private int field3528 = 1;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "[J")
    private long[] field3530 = new long[10];

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "J")
    private long field3527 = 0L;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    private int field3526 = 0;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "J")
    private long field3531 = 0L;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "J")
    private long field3529 = 0L;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
    private final long method1548(byte arg0) {
        long var2 = class254.method1522((byte) -51) * 1000000L;
        long var4 = var2 - this.field3529;
        int var6 = 54 / ((11 - arg0) / 37);
        this.field3529 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3530[this.field3526] = var4;
            this.field3526 = (this.field3526 + 1) % 10;
            if (this.field3528 < 10) {
                this.field3528++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field3528; var9++) {
            var7 += this.field3530[(this.field3526 + 10 - var9) % 10];
        }
        return var7 / (long) this.field3528;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)J")
    public final long method153(int arg0) {
        return arg0 == 10 ? this.field3527 : 90L;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)I")
    public final int method151(byte arg0, int arg1) {
        if (arg0 >= -78) {
            this.field3531 = -68L;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field3527 += this.method1548((byte) 119);
        if (this.field3531 > this.field3527) {
            class334.method2047((this.field3531 - this.field3527) / 1000000L, 0);
            this.field3529 += this.field3531 - this.field3527;
            this.field3527 += this.field3531 - this.field3527;
            this.field3531 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3531 += var3;
        } while (var5 < 10 && this.field3531 < this.field3527);
        if (this.field3531 < this.field3527) {
            this.field3531 = this.field3527;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (this.field3527 < this.field3531) {
            this.field3527 += this.field3531 - this.field3527;
        }
        if (arg0 != -1) {
            this.method152(-66);
        }
        this.field3529 = 0L;
    }
}
