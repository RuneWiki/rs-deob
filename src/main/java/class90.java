import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class90 extends class192 {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
    private long field1272 = 0L;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "J")
    private long field1273 = 0L;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[J")
    private long[] field1275 = new long[10];

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field1274 = 1;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "J")
    private long field1276 = 0L;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private int field1277 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)J")
    private final long method757(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1276;
        this.field1276 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1275[this.field1277] = var4;
            if (this.field1274 < 1) {
                this.field1274++;
            }
            this.field1277 = (this.field1277 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1274; var8++) {
            var6 += this.field1275[(this.field1277 + 10 - var8) % 10];
        }
        if (arg0) {
            this.method757(true);
        }
        return var6 / (long) this.field1274;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public final void method460(int arg0) {
        this.field1276 = 0L;
        if (arg0 >= 22 && this.field1273 > this.field1272) {
            this.field1272 += this.field1273 - this.field1272;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)J")
    public final long method458(int arg0) {
        int var2 = 14 / ((arg0 - 77) / 35);
        return this.field1272;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)I")
    public final int method457(byte arg0, int arg1) {
        this.field1272 += this.method757(false);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 119) {
            return 90;
        } else if (this.field1272 < this.field1273) {
            class89.method752(0, (this.field1273 - this.field1272) / 1000000L);
            this.field1276 += this.field1273 - this.field1272;
            this.field1272 += this.field1273 - this.field1272;
            this.field1273 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                var5++;
                this.field1273 += var3;
            } while (var5 < 10 && this.field1273 < this.field1272);
            if (this.field1273 < this.field1272) {
                this.field1273 = this.field1272;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class90() {
        this.field1272 = System.nanoTime();
        this.field1273 = System.nanoTime();
    }
}
