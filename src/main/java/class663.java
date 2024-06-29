import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class663 extends class388 {

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "J")
    private long field9537 = 0L;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "J")
    private long field9538 = 0L;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "J")
    private long field9539 = 0L;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "[J")
    private long[] field9540 = new long[10];

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    private int field9542 = 0;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    private int field9541 = 1;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)J")
    public final long method2287(int arg0) {
        int var2 = -37 % ((arg0 - 26) / 39);
        return this.field9538;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(IJ)I")
    public final int method2285(int arg0, long arg1) {
        if (arg0 <= 115) {
            this.method2286((byte) -85);
        }
        if (this.field9537 > this.field9538) {
            this.field9539 += this.field9537 - this.field9538;
            this.field9538 += this.field9537 - this.field9538;
            this.field9537 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field9537 += arg1;
        } while (var4 < 10 && this.field9538 > this.field9537);
        if (this.field9537 < this.field9538) {
            this.field9537 = this.field9538;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
    public final void method2286(byte arg0) {
        if (this.field9537 > this.field9538) {
            this.field9538 += this.field9537 - this.field9538;
        }
        if (arg0 < -7) {
            this.field9539 = 0L;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)J")
    public final long method2284(int arg0) {
        this.field9538 += this.method3770(-98);
        if (arg0 == 2) {
            return this.field9537 <= this.field9538 ? 0L : (this.field9537 - this.field9538) / 1000000L;
        } else {
            return -98L;
        }
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)J")
    private final long method3770(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field9539;
        this.field9539 = var2;
        if (arg0 > -83) {
            this.method3770(125);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9540[this.field9542] = var4;
            this.field9542 = (this.field9542 + 1) % 10;
            if (this.field9541 < 1) {
                this.field9541++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9541; var8++) {
            var6 += this.field9540[(this.field9542 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9541;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V")
    public class663() {
        this.field9538 = System.nanoTime();
        this.field9537 = System.nanoTime();
    }
}
