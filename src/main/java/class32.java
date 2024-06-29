import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class32 extends class212 {

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    private int field401 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "J")
    private long field402 = 0L;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[J")
    private long[] field404 = new long[10];

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    private int field400 = 1;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "J")
    private long field403 = 0L;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "J")
    private long field405 = 0L;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)J")
    private final long method188(byte arg0) {
        long var2 = class267.method1841((byte) 99) * 1000000L;
        long var4 = var2 - this.field402;
        long var6 = 0L;
        this.field402 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field404[this.field401] = var4;
            this.field401 = (this.field401 + 1) % 10;
            if (this.field400 < 10) {
                this.field400++;
            }
        }
        if (arg0 != -36) {
            this.method136(false);
        }
        for (int var8 = 1; var8 <= this.field400; var8++) {
            var6 += this.field404[(this.field401 + 10 - var8) % 10];
        }
        return var6 / (long) this.field400;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)J")
    public final long method137(int arg0) {
        int var2 = 99 / ((-arg0 - 83) / 39);
        return this.field405;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        this.field402 = 0L;
        if (arg0 && this.field405 < this.field403) {
            this.field405 += this.field403 - this.field405;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)I")
    public final int method135(byte arg0, int arg1, int arg2) {
        class96.method614(0, (long) arg2);
        this.field405 += this.method188((byte) -36);
        long var4 = (long) arg1 * 1000000L;
        if (arg0 != -33) {
            return 100;
        } else if (this.field403 > this.field405) {
            class96.method614(0, (this.field403 - this.field405) / 1000000L);
            this.field402 += this.field403 - this.field405;
            this.field405 += this.field403 - this.field405;
            this.field403 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                var6++;
                this.field403 += var4;
            } while (var6 < 10 && this.field405 > this.field403);
            if (this.field403 < this.field405) {
                this.field403 = this.field405;
            }
            return var6;
        }
    }
}
