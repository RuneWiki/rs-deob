import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class35 extends class14 {

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "J")
    private long field526 = 0L;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "J")
    private long field525 = 0L;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "J")
    private long field528 = 0L;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    private int field529 = 1;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[J")
    private long[] field530 = new long[10];

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)J", line = 4)
    public final long method186(byte arg0) {
        return arg0 > -107 ? 108L : this.field525;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZII)I", line = 16)
    public final int method184(boolean arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        if (arg0) {
            return 48;
        }
        class245.method1729(123, (long) arg2);
        this.field525 += this.method318(true);
        if (this.field526 > this.field525) {
            class245.method1729(-42, (this.field526 - this.field525) / 1000000L);
            this.field528 += this.field526 - this.field525;
            this.field525 += this.field526 - this.field525;
            this.field526 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field526 += var4;
            var6++;
        } while (var6 < 10 && this.field525 > this.field526);
        if (this.field525 > this.field526) {
            this.field526 = this.field525;
        }
        return var6;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 53)
    public final void method181(byte arg0) {
        this.field528 = 0L;
        if (arg0 > -35) {
            this.field527 = 81;
        }
        if (this.field526 > this.field525) {
            this.field525 += this.field526 - this.field525;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)J", line = 68)
    private final long method318(boolean arg0) {
        if (!arg0) {
            this.field530 = (long[]) null;
        }
        long var2 = 0L;
        long var4 = System.nanoTime();
        long var6 = var4 - this.field528;
        this.field528 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field530[this.field527] = var6;
            if (this.field529 < 1) {
                this.field529++;
            }
            this.field527 = (this.field527 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field529; var8++) {
            var2 += this.field530[(this.field527 - (var8 - 10)) % 10];
        }
        return var2 / (long) this.field529;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 105)
    public class35() {
        this.field525 = System.nanoTime();
        this.field526 = System.nanoTime();
    }
}
