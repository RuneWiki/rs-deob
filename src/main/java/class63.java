import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class63 extends class178 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "J")
    private long field948 = 0L;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "J")
    private long field949 = 0L;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    private int field950 = 1;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "J")
    private long field951 = 0L;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    private int field952 = 0;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "[J")
    private long[] field953 = new long[10];

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)J", line = 5)
    private final long method450(int arg0) {
        if (arg0 != -2) {
            this.method452((byte) -72);
        }
        long var2 = 0L;
        long var4 = jagmisc.nanoTime();
        long var6 = var4 - this.field951;
        this.field951 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field953[this.field952] = var6;
            if (this.field950 < 1) {
                this.field950++;
            }
            this.field952 = (this.field952 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field950; var8++) {
            var2 += this.field953[(this.field952 + 10 - var8) % 10];
        }
        return var2 / (long) this.field950;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J", line = 39)
    public final long method451(int arg0) {
        return arg0 <= 51 ? -123L : this.field949;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 49)
    public final void method452(byte arg0) {
        if (arg0 != 105) {
            this.field951 = -79L;
        }
        this.field951 = 0L;
        if (this.field948 > this.field949) {
            this.field949 += this.field948 - this.field949;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 105)
    public class63() {
        this.field948 = this.field949 = jagmisc.nanoTime();
        if (this.field949 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I", line = 67)
    public final int method453(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg0 >= -19) {
            this.field948 = -65L;
        }
        class177.method1246((long) arg1, -32644);
        this.field949 += this.method450(-2);
        if (this.field948 > this.field949) {
            class177.method1246((this.field948 - this.field949) / 1000000L, -32644);
            this.field951 += this.field948 - this.field949;
            this.field949 += this.field948 - this.field949;
            this.field948 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field948 += var4;
            var6++;
        } while (var6 < 10 && this.field948 < this.field949);
        if (this.field949 > this.field948) {
            this.field948 = this.field949;
        }
        return var6;
    }
}
