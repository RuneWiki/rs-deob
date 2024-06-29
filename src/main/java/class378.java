import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class378 extends class439 {

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
    private int field5277 = 1;

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "J")
    private long field5280 = 0L;

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "[J")
    private long[] field5281 = new long[10];

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "J")
    private long field5279 = 0L;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "J")
    private long field5278 = 0L;

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
    private int field5282 = 0;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IJ)I")
    public final int method2081(int arg0, long arg1) {
        int var4 = -36 / (-arg0 / 61);
        if (this.field5278 > this.field5279) {
            this.field5280 += this.field5278 - this.field5279;
            this.field5279 += this.field5278 - this.field5279;
            this.field5278 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5278 += arg1;
            var5++;
        } while (var5 < 10 && this.field5278 < this.field5279);
        if (this.field5279 > this.field5278) {
            this.field5278 = this.field5279;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V")
    public final void method2082(int arg0) {
        if (this.field5278 > this.field5279) {
            this.field5279 += this.field5278 - this.field5279;
        }
        if (arg0 != 328) {
            this.field5282 = 108;
        }
        this.field5280 = 0L;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)J")
    public final long method2083(int arg0) {
        this.field5279 += this.method2371(-364);
        if (this.field5279 < this.field5278) {
            return (this.field5278 - this.field5279) / 1000000L;
        } else {
            if (arg0 != -1) {
                this.method2081(-61, 125L);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)J")
    public final long method2080(int arg0) {
        return arg0 < 58 ? 115L : this.field5279;
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)J")
    private final long method2371(int arg0) {
        long var2 = class742.method4128(arg0 ^ 0xFFFFFE95) * 1000000L;
        long var4 = var2 - this.field5280;
        this.field5280 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5281[this.field5282] = var4;
            if (this.field5277 < 10) {
                this.field5277++;
            }
            this.field5282 = (this.field5282 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != -364) {
            this.method2083(2);
        }
        for (int var8 = 1; var8 <= this.field5277; var8++) {
            var6 += this.field5281[(this.field5282 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5277;
    }
}
