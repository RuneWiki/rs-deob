import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class16 {

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "J")
    private long field36 = 0L;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "J")
    private long field37 = 0L;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "J")
    private long field39 = 0L;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    private int field40 = 1;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[J")
    private long[] field38 = new long[10];

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    private int field41 = 0;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 94)
    public class4() {
        this.field37 = System.nanoTime();
        this.field36 = System.nanoTime();
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)J", line = 11)
    private final long method39(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field39;
        this.field39 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field38[this.field41] = var4;
            if (this.field40 < 1) {
                this.field40++;
            }
            this.field41 = (this.field41 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 == 3080) {
            for (int var8 = 1; var8 <= this.field40; var8++) {
                var6 += this.field38[(this.field41 + 10 - var8) % 10];
            }
            return var6 / (long) this.field40;
        } else {
            return -100L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I", line = 49)
    public final int method40(int arg0, int arg1) {
        int var3 = -128 % ((-arg1 - 11) / 35);
        long var4 = (long) arg0 * 1000000L;
        this.field37 += this.method39(3080);
        if (this.field36 > this.field37) {
            class404.method2628(-107, (this.field36 - this.field37) / 1000000L);
            this.field39 += this.field36 - this.field37;
            this.field37 += this.field36 - this.field37;
            this.field36 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field36 += var4;
            var6++;
        } while (var6 < 10 && this.field36 < this.field37);
        if (this.field37 > this.field36) {
            this.field36 = this.field37;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 83)
    public final void method41(int arg0) {
        this.field39 = 0L;
        int var2 = 79 / ((arg0 - 9) / 63);
        if (this.field37 < this.field36) {
            this.field37 += this.field36 - this.field37;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)J", line = 105)
    public final long method42(int arg0) {
        return arg0 == 30786 ? this.field37 : -68L;
    }
}
