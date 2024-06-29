import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class433 extends class201 {

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "J")
    private long field6352 = 0L;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    private int field6354 = 0;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    private int field6353 = 1;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "[J")
    private long[] field6351 = new long[10];

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "J")
    private long field6355 = 0L;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "J")
    private long field6356 = 0L;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 3)
    public final void method237(byte arg0) {
        if (arg0 >= -121) {
            this.method237((byte) 42);
        }
        if (this.field6356 < this.field6352) {
            this.field6356 += this.field6352 - this.field6356;
        }
        this.field6355 = 0L;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I", line = 16)
    public final int method238(int arg0, int arg1) {
        this.field6356 += this.method2562(0);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 <= 57) {
            this.method236(99);
        }
        if (this.field6352 > this.field6356) {
            class322.method1935(true, (this.field6352 - this.field6356) / 1000000L);
            this.field6355 += this.field6352 - this.field6356;
            this.field6356 += this.field6352 - this.field6356;
            this.field6352 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6352 += var3;
            var5++;
        } while (var5 < 10 && this.field6356 > this.field6352);
        if (this.field6356 > this.field6352) {
            this.field6352 = this.field6356;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)J", line = 57)
    public final long method236(int arg0) {
        return arg0 >= -123 ? 21L : this.field6356;
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)J", line = 74)
    private final long method2562(int arg0) {
        long var2 = class109.method653(false) * 1000000L;
        long var4 = var2 - this.field6355;
        this.field6355 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6351[this.field6354] = var4;
            this.field6354 = (this.field6354 + 1) % 10;
            if (this.field6353 < 10) {
                this.field6353++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field6353; var8++) {
            var6 += this.field6351[(this.field6354 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6353;
    }
}
