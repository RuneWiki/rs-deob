import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class260 {

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "J")
    private long field523 = 0L;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "J")
    private long field524 = 0L;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[J")
    private long[] field525 = new long[10];

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "J")
    private long field526 = 0L;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    private int field528 = 1;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)J", line = 4)
    private final long method264(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 <= 70) {
            return 43L;
        }
        long var4 = var2 - this.field526;
        this.field526 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field525[this.field527] = var4;
            this.field527 = (this.field527 + 1) % 10;
            if (this.field528 < 1) {
                this.field528++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field528; var8++) {
            var6 += this.field525[(this.field527 + 10 - var8) % 10];
        }
        return var6 / (long) this.field528;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)I", line = 39)
    public final int method265(byte arg0, int arg1) {
        this.field523 += this.method264(119);
        int var3 = -40 / ((arg0 + 5) / 37);
        long var4 = (long) arg1 * 1000000L;
        if (this.field524 > this.field523) {
            class52.method411((this.field524 - this.field523) / 1000000L, (byte) 106);
            this.field526 += this.field524 - this.field523;
            this.field523 += this.field524 - this.field523;
            this.field524 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field524 += var4;
        } while (var6 < 10 && this.field524 < this.field523);
        if (this.field523 > this.field524) {
            this.field524 = this.field523;
        }
        return var6;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 104)
    public class46() {
        this.field524 = this.field523 = jagmisc.nanoTime();
        if (this.field523 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 78)
    public final void method266(int arg0) {
        if (this.field524 > this.field523) {
            this.field523 += this.field524 - this.field523;
        }
        if (arg0 == -9282) {
            this.field526 = 0L;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)J", line = 92)
    public final long method267(int arg0) {
        if (arg0 <= 116) {
            this.field528 = 92;
        }
        return this.field523;
    }
}
