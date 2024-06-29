import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class35 extends class276 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field521 = 0;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[J")
    private long[] field525 = new long[10];

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "J")
    private long field522 = 0L;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "J")
    private long field523 = 0L;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "J")
    private long field526 = 0L;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    private int field524 = 1;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)J")
    public final long method154(byte arg0) {
        if (arg0 != 7) {
            this.field523 = 88L;
        }
        return this.field523;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field523 < this.field526) {
            this.field523 += this.field526 - this.field523;
        }
        if (arg0 == 29051) {
            this.field522 = 0L;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)J")
    private final long method226(int arg0) {
        long var2 = class191.method1350((byte) 121) * 1000000L;
        int var4 = 48 / ((54 - arg0) / 57);
        long var5 = 0L;
        long var7 = var2 - this.field522;
        this.field522 = var2;
        if (var7 > -5000000000L && var7 < 5000000000L) {
            this.field525[this.field521] = var7;
            this.field521 = (this.field521 + 1) % 10;
            if (this.field524 < 10) {
                this.field524++;
            }
        }
        for (int var9 = 1; var9 <= this.field524; var9++) {
            var5 += this.field525[(this.field521 + 10 - var9) % 10];
        }
        return var5 / (long) this.field524;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
    public final int method152(int arg0, int arg1, int arg2) {
        class262.method1758((long) arg2, 29552);
        long var4 = (long) arg0 * 1000000L;
        this.field523 += this.method226(126);
        int var6 = -55 % ((arg1 + 35) / 48);
        if (this.field526 > this.field523) {
            class262.method1758((this.field526 - this.field523) / 1000000L, 29552);
            this.field522 += this.field526 - this.field523;
            this.field523 += this.field526 - this.field523;
            this.field526 += var4;
            return 1;
        }
        int var7 = 0;
        do {
            this.field526 += var4;
            var7++;
        } while (var7 < 10 && this.field523 > this.field526);
        if (this.field526 < this.field523) {
            this.field526 = this.field523;
        }
        return var7;
    }
}
