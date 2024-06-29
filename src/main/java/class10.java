import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class113 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "J")
    private long field164 = 0L;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field166 = 0;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "J")
    private long field165 = 0L;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[J")
    private long[] field168 = new long[10];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    private int field167 = 1;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "J")
    private long field169 = 0L;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)J")
    private final long method60(byte arg0) {
        long var2 = class242.method1650(42) * 1000000L;
        long var4 = var2 - this.field164;
        long var6 = 0L;
        this.field164 = var2;
        if (arg0 <= 1) {
            this.field166 = 56;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field168[this.field166] = var4;
            this.field166 = (this.field166 + 1) % 10;
            if (this.field167 < 10) {
                this.field167++;
            }
        }
        for (int var8 = 1; var8 <= this.field167; var8++) {
            var6 += this.field168[(this.field166 + 10 - var8) % 10];
        }
        return var6 / (long) this.field167;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (this.field165 > this.field169) {
            this.field169 += this.field165 - this.field169;
        }
        if (!arg0) {
            this.field164 = 0L;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)J")
    public final long method62(byte arg0) {
        if (arg0 <= 99) {
            this.method60((byte) -78);
        }
        return this.field169;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)I")
    public final int method63(int arg0, int arg1, byte arg2) {
        class122.method922((long) arg1, (byte) -124);
        if (arg2 < 77) {
            this.method61(false);
        }
        this.field169 += this.method60((byte) 20);
        long var4 = (long) arg0 * 1000000L;
        if (this.field165 > this.field169) {
            class122.method922((this.field165 - this.field169) / 1000000L, (byte) -98);
            this.field164 += this.field165 - this.field169;
            this.field169 += this.field165 - this.field169;
            this.field165 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field165 += var4;
        } while (var6 < 10 && this.field165 < this.field169);
        if (this.field169 > this.field165) {
            this.field165 = this.field169;
        }
        return var6;
    }
}
