import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class173 extends class17 {

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "J")
    private long field2485 = 0L;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field2487 = 0;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[J")
    private long[] field2490 = new long[10];

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "J")
    private long field2489 = 0L;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field2486 = 1;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "J")
    private long field2488 = 0L;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I", line = 5)
    public final int method114(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        class81.method485((long) arg0, 1);
        this.field2488 += this.method1133(10);
        if (arg1 != 100) {
            this.field2487 = 63;
        }
        if (this.field2488 < this.field2485) {
            class81.method485((this.field2485 - this.field2488) / 1000000L, 1);
            this.field2489 += this.field2485 - this.field2488;
            this.field2488 += this.field2485 - this.field2488;
            this.field2485 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field2485 += var4;
            var6++;
        } while (var6 < 10 && this.field2488 > this.field2485);
        if (this.field2488 > this.field2485) {
            this.field2485 = this.field2488;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)J", line = 46)
    private final long method1133(int arg0) {
        if (arg0 != 10) {
            this.field2485 = 96L;
        }
        long var2 = class200.method1375(-16185) * 1000000L;
        long var4 = var2 - this.field2489;
        this.field2489 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2490[this.field2487] = var4;
            if (this.field2486 < 10) {
                this.field2486++;
            }
            this.field2487 = (this.field2487 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field2486; var8++) {
            var6 += this.field2490[(this.field2487 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2486;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J", line = 86)
    public final long method116(int arg0) {
        int var2 = 32 % ((61 - arg0) / 34);
        return this.field2488;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 95)
    public final void method113(byte arg0) {
        int var2 = 43 / ((arg0 - 43) / 33);
        this.field2489 = 0L;
        if (this.field2485 > this.field2488) {
            this.field2488 += this.field2485 - this.field2488;
        }
    }
}
