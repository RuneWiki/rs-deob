import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class326 extends class135 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "J")
    private long field5252 = 0L;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "J")
    private long field5253 = 0L;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field5256 = 1;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "J")
    private long field5255 = 0L;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    private int field5257 = 0;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[J")
    private long[] field5254 = new long[10];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V", line = 4)
    public final void method39(boolean arg0) {
        if (!arg0) {
            this.field5253 = 44L;
        }
        if (this.field5252 > this.field5253) {
            this.field5253 += this.field5252 - this.field5253;
        }
        this.field5255 = 0L;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I", line = 19)
    public final int method38(int arg0, int arg1, int arg2) {
        class122.method881(-110, (long) arg2);
        long var4 = (long) arg1 * 1000000L;
        this.field5253 += this.method2330(false);
        if (arg0 != -128) {
            this.field5255 = 73L;
        }
        if (this.field5253 < this.field5252) {
            class122.method881(-79, (this.field5252 - this.field5253) / 1000000L);
            this.field5255 += this.field5252 - this.field5253;
            this.field5253 += this.field5252 - this.field5253;
            this.field5252 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field5252 += var4;
        } while (var6 < 10 && this.field5253 > this.field5252);
        if (this.field5253 > this.field5252) {
            this.field5252 = this.field5253;
        }
        return var6;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)J", line = 57)
    private final long method2330(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0) {
            return 7L;
        }
        long var4 = 0L;
        long var6 = var2 - this.field5255;
        this.field5255 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field5254[this.field5257] = var6;
            if (this.field5256 < 1) {
                this.field5256++;
            }
            this.field5257 = (this.field5257 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field5256; var8++) {
            var4 += this.field5254[(this.field5257 + 10 - var8) % 10];
        }
        return var4 / (long) this.field5256;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)J", line = 90)
    public final long method37(boolean arg0) {
        if (arg0) {
            this.field5256 = 98;
        }
        return this.field5253;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 105)
    public class326() {
        this.field5252 = this.field5253 = jagmisc.nanoTime();
        if (this.field5253 == 0L) {
            throw new RuntimeException();
        }
    }
}
