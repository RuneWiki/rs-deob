import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class291 extends class211 {

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "J")
    private long field4532 = 0L;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "J")
    private long field4534 = 0L;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "J")
    private long field4535 = 0L;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    private int field4536 = 1;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "[J")
    private long[] field4537 = new long[10];

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    private int field4533 = 0;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)I", line = 7)
    public final int method4(int arg0, int arg1, int arg2) {
        class188.method1443(10, (long) arg1);
        this.field4534 += this.method2109(-116);
        long var4 = (long) arg0 * 1000000L;
        if (arg2 != 2) {
            return -83;
        } else if (this.field4534 < this.field4535) {
            class188.method1443(arg2 ^ 0x8, (this.field4535 - this.field4534) / 1000000L);
            this.field4532 += this.field4535 - this.field4534;
            this.field4534 += this.field4535 - this.field4534;
            this.field4535 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                this.field4535 += var4;
                var6++;
            } while (var6 < 10 && this.field4534 > this.field4535);
            if (this.field4535 < this.field4534) {
                this.field4535 = this.field4534;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 47)
    public final void method3(int arg0) {
        if (arg0 == 31) {
            if (this.field4534 < this.field4535) {
                this.field4534 += this.field4535 - this.field4534;
            }
            this.field4532 = 0L;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)J", line = 65)
    public final long method2(int arg0) {
        return arg0 == 0 ? this.field4534 : -30L;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)J", line = 91)
    private final long method2109(int arg0) {
        long var2 = class156.method1273((byte) -88) * 1000000L;
        long var4 = var2 - this.field4532;
        this.field4532 = var2;
        long var6 = 0L;
        if (arg0 > -76) {
            return -52L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4537[this.field4533] = var4;
            this.field4533 = (this.field4533 + 1) % 10;
            if (this.field4536 < 10) {
                this.field4536++;
            }
        }
        for (int var8 = 1; var8 <= this.field4536; var8++) {
            var6 += this.field4537[(this.field4533 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4536;
    }
}
