import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class40 extends class274 {

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    private int field438 = 1;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "J")
    private long field442 = 0L;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "J")
    private long field441 = 0L;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "J")
    private long field439 = 0L;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    private int field443 = 0;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "[J")
    private long[] field440 = new long[10];

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 8)
    public final void method246(byte arg0) {
        if (arg0 < 124) {
            this.field441 = -127L;
        }
        if (this.field442 < this.field439) {
            this.field442 += this.field439 - this.field442;
        }
        this.field441 = 0L;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J", line = 28)
    private final long method247(int arg0) {
        long var2 = class9.method57(arg0 ^ 0xFFFFC8CA) * 1000000L;
        long var4 = var2 - this.field441;
        long var6 = 0L;
        this.field441 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field440[this.field443] = var4;
            if (this.field438 < 10) {
                this.field438++;
            }
            this.field443 = (this.field443 + 1) % 10;
        }
        for (int var8 = arg0; var8 <= this.field438; var8++) {
            var6 += this.field440[(this.field443 + 10 - var8) % 10];
        }
        return var6 / (long) this.field438;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBI)I", line = 58)
    public final int method248(int arg0, byte arg1, int arg2) {
        if (arg1 < 64) {
            return 94;
        }
        long var4 = (long) arg2 * 1000000L;
        class19.method140((long) arg0, 16711680);
        this.field442 += this.method247(1);
        if (this.field442 < this.field439) {
            class19.method140((this.field439 - this.field442) / 1000000L, 16711680);
            this.field441 += this.field439 - this.field442;
            this.field442 += this.field439 - this.field442;
            this.field439 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field439 += var4;
        } while (var6 < 10 && this.field439 < this.field442);
        if (this.field439 < this.field442) {
            this.field439 = this.field442;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)J", line = 114)
    public final long method249(int arg0) {
        if (arg0 != 0) {
            this.method246((byte) -61);
        }
        return this.field442;
    }
}
