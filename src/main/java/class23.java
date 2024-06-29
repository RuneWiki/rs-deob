import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class23 extends class212 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "J")
    private long field297 = 0L;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "J")
    private long field298 = 0L;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    private int field299 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "J")
    private long field300 = 0L;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[J")
    private long[] field302 = new long[10];

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    private int field301 = 1;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)I")
    public final int method135(byte arg0, int arg1, int arg2) {
        class96.method614(arg0 ^ 0xFFFFFFDF, (long) arg2);
        this.field298 += this.method138(-104);
        if (arg0 != -33) {
            this.method138(14);
        }
        long var4 = (long) arg1 * 1000000L;
        if (this.field298 < this.field297) {
            class96.method614(0, (this.field297 - this.field298) / 1000000L);
            this.field300 += this.field297 - this.field298;
            this.field298 += this.field297 - this.field298;
            this.field297 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field297 += var4;
            var6++;
        } while (var6 < 10 && this.field298 > this.field297);
        if (this.field297 < this.field298) {
            this.field297 = this.field298;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        if (this.field297 > this.field298) {
            this.field298 += this.field297 - this.field298;
        }
        this.field300 = 0L;
        if (!arg0) {
            this.method136(true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)J")
    public final long method137(int arg0) {
        int var2 = -34 / ((-arg0 - 83) / 39);
        return this.field298;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)J")
    private final long method138(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 >= -97) {
            this.field300 = 57L;
        }
        long var4 = 0L;
        long var6 = var2 - this.field300;
        this.field300 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field302[this.field299] = var6;
            this.field299 = (this.field299 + 1) % 10;
            if (this.field301 < 1) {
                this.field301++;
            }
        }
        for (int var8 = 1; var8 <= this.field301; var8++) {
            var4 += this.field302[(this.field299 + 10 - var8) % 10];
        }
        return var4 / (long) this.field301;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class23() {
        this.field297 = this.field298 = jagmisc.nanoTime();
        if (this.field298 == 0L) {
            throw new RuntimeException();
        }
    }
}
