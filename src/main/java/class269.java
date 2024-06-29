import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class269 extends class576 {

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "J")
    private long field4144 = 0L;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "J")
    private long field4145 = 0L;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    private int field4147 = 1;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "[J")
    private long[] field4148 = new long[10];

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    private int field4146 = 0;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "J")
    private long field4149 = 0L;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)J")
    private final long method1780(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4149;
        this.field4149 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4148[this.field4146] = var4;
            this.field4146 = (this.field4146 + 1) % 10;
            if (this.field4147 < 1) {
                this.field4147++;
            }
        }
        long var6 = 0L;
        if (arg0 == 10) {
            for (int var8 = 1; var8 <= this.field4147; var8++) {
                var6 += this.field4148[(this.field4146 + 10 - var8) % 10];
            }
            return var6 / (long) this.field4147;
        } else {
            return 83L;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)J")
    public final long method41(byte arg0) {
        int var2 = 115 / ((arg0 + 75) / 37);
        return this.field4145;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public final void method42(int arg0) {
        if (arg0 > -67) {
            this.field4146 = 21;
        }
        this.field4149 = 0L;
        if (this.field4145 < this.field4144) {
            this.field4145 += this.field4144 - this.field4145;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)J")
    public final long method40(int arg0) {
        this.field4145 += this.method1780(arg0 ^ 0xA);
        if (arg0 != 0) {
            this.method1780(28);
        }
        return this.field4145 < this.field4144 ? (this.field4144 - this.field4145) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(JB)I")
    public final int method39(long arg0, byte arg1) {
        if (arg1 <= 104) {
            this.field4146 = -76;
        }
        if (this.field4144 > this.field4145) {
            this.field4149 += this.field4144 - this.field4145;
            this.field4145 += this.field4144 - this.field4145;
            this.field4144 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field4144 += arg0;
            var4++;
        } while (var4 < 10 && this.field4145 > this.field4144);
        if (this.field4144 < this.field4145) {
            this.field4144 = this.field4145;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
    public class269() {
        this.field4144 = this.field4145 = jagmisc.nanoTime();
        if (this.field4145 == 0L) {
            throw new RuntimeException();
        }
    }
}
