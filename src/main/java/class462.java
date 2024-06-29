import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class462 extends class324 {

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "J")
    private long field6576 = 0L;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "J")
    private long field6577 = 0L;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[J")
    private long[] field6578 = new long[10];

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    private int field6579 = 1;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    private int field6581 = 0;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "J")
    private long field6580 = 0L;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)J")
    public final long method281(int arg0) {
        if (arg0 != -9060) {
            this.method2672(-3);
        }
        return this.field6577;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public final void method282(int arg0) {
        if (this.field6576 > this.field6577) {
            this.field6577 += this.field6576 - this.field6577;
        }
        if (arg0 == 17184) {
            this.field6580 = 0L;
        }
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)J")
    private final long method2672(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6580;
        this.field6580 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6578[this.field6581] = var4;
            this.field6581 = (this.field6581 + 1) % 10;
            if (this.field6579 < 1) {
                this.field6579++;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 != 29766) {
            this.field6579 = 61;
        }
        while (var8 <= this.field6579) {
            var6 += this.field6578[(this.field6581 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field6579;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)J")
    public final long method280(int arg0) {
        this.field6577 += this.method2672(29766);
        int var2 = -56 % ((37 - arg0) / 41);
        return this.field6577 < this.field6576 ? (this.field6576 - this.field6577) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IJ)I")
    public final int method278(int arg0, long arg1) {
        if (arg0 <= 19) {
            this.method280(-76);
        }
        if (this.field6576 > this.field6577) {
            this.field6580 += this.field6576 - this.field6577;
            this.field6577 += this.field6576 - this.field6577;
            this.field6576 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field6576 += arg1;
            var4++;
        } while (var4 < 10 && this.field6577 > this.field6576);
        if (this.field6576 < this.field6577) {
            this.field6576 = this.field6577;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
    public class462() {
        this.field6576 = this.field6577 = jagmisc.nanoTime();
        if (this.field6577 == 0L) {
            throw new RuntimeException();
        }
    }
}
