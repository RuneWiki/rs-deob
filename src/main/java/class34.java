import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class34 extends class225 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "J")
    private long field399 = 0L;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private int field401 = 1;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "J")
    private long field398 = 0L;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    private int field402 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[J")
    private long[] field400 = new long[10];

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "J")
    private long field403 = 0L;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)J")
    private final long method175(byte arg0) {
        if (arg0 != -117) {
            this.field398 = -17L;
        }
        long var2 = class98.method665(true) * 1000000L;
        long var4 = 0L;
        long var6 = var2 - this.field399;
        this.field399 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field400[this.field402] = var6;
            this.field402 = (this.field402 + 1) % 10;
            if (this.field401 < 10) {
                this.field401++;
            }
        }
        for (int var8 = 1; var8 <= this.field401; var8++) {
            var4 += this.field400[(this.field402 + 10 - var8) % 10];
        }
        return var4 / (long) this.field401;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
    public final int method176(int arg0, int arg1, int arg2) {
        class7.method43(-61, (long) arg0);
        if (arg2 != 2) {
            return -37;
        }
        this.field403 += this.method175((byte) -117);
        long var4 = (long) arg1 * 1000000L;
        if (this.field398 > this.field403) {
            class7.method43(-76, (this.field398 - this.field403) / 1000000L);
            this.field399 += this.field398 - this.field403;
            this.field403 += this.field398 - this.field403;
            this.field398 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field398 += var4;
        } while (var6 < 10 && this.field398 < this.field403);
        if (this.field398 < this.field403) {
            this.field398 = this.field403;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)J")
    public final long method177(byte arg0) {
        int var2 = -12 / ((70 - arg0) / 54);
        return this.field403;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
        if (this.field403 < this.field398) {
            this.field403 += this.field398 - this.field403;
        }
        if (!arg0) {
            this.field399 = 0L;
        }
    }
}
