import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class24 extends class360 {

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    private int field313 = 0;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[J")
    private long[] field314 = new long[10];

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "J")
    private long field315 = 0L;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    private int field312 = 1;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "J")
    private long field316 = 0L;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "J")
    private long field317 = 0L;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method149(int arg0) {
        this.field315 = 0L;
        if (arg0 < 84) {
            this.method150((byte) -3);
        }
        if (this.field316 > this.field317) {
            this.field317 += this.field316 - this.field317;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)J")
    public final long method150(byte arg0) {
        if (arg0 <= 121) {
            this.method150((byte) 30);
        }
        return this.field317;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public final int method151(int arg0, int arg1) {
        int var3 = 89 % ((arg0 - 15) / 43);
        this.field317 += this.method152(10);
        long var4 = (long) arg1 * 1000000L;
        if (this.field316 > this.field317) {
            class109.method674((byte) 99, (this.field316 - this.field317) / 1000000L);
            this.field315 += this.field316 - this.field317;
            this.field317 += this.field316 - this.field317;
            this.field316 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field316 += var4;
        } while (var6 < 10 && this.field317 > this.field316);
        if (this.field316 < this.field317) {
            this.field316 = this.field317;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)J")
    private final long method152(int arg0) {
        long var2 = class445.method2750(-27580) * 1000000L;
        long var4 = var2 - this.field315;
        this.field315 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field314[this.field313] = var4;
            this.field313 = (this.field313 + 1) % 10;
            if (this.field312 < 10) {
                this.field312++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field312; var8++) {
            var6 += this.field314[(this.field313 + 10 - var8) % 10];
        }
        return arg0 == 10 ? var6 / (long) this.field312 : -27L;
    }
}
