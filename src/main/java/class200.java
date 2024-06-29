import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class200 extends class116 {

    @OriginalMember(owner = "client!o", name = "i", descriptor = "J")
    private long field3288 = 0L;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "J")
    private long field3287 = 0L;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "J")
    private long field3290 = 0L;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    private int field3289 = 1;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[J")
    private long[] field3291 = new long[10];

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    private int field3292 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (arg0 > -6) {
            this.field3287 = -6L;
        }
        this.field3290 = 0L;
        if (this.field3287 > this.field3288) {
            this.field3288 += this.field3287 - this.field3288;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)I")
    public final int method427(int arg0, byte arg1, int arg2) {
        class245.method1636(false, (long) arg2);
        if (arg1 < 39) {
            return 10;
        }
        long var4 = (long) arg0 * 1000000L;
        this.field3288 += this.method1335((byte) 7);
        if (this.field3288 < this.field3287) {
            class245.method1636(false, (this.field3287 - this.field3288) / 1000000L);
            this.field3290 += this.field3287 - this.field3288;
            this.field3288 += this.field3287 - this.field3288;
            this.field3287 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field3287 += var4;
        } while (var6 < 10 && this.field3287 < this.field3288);
        if (this.field3287 < this.field3288) {
            this.field3287 = this.field3288;
        }
        return var6;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)J")
    public final long method425(byte arg0) {
        if (arg0 != 109) {
            this.field3290 = -35L;
        }
        return this.field3288;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)J")
    private final long method1335(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field3290;
        this.field3290 = var2;
        if (var6 > 0L && var6 < 5000000000L) {
            this.field3291[this.field3292] = var6;
            this.field3292 = (this.field3292 + 1) % 10;
            if (this.field3289 < 1) {
                this.field3289++;
            }
        }
        if (arg0 != 7) {
            this.field3291 = (long[]) null;
        }
        for (int var8 = 1; var8 <= this.field3289; var8++) {
            var4 += this.field3291[(this.field3292 + 10 - var8) % 10];
        }
        return var4 / (long) this.field3289;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class200() {
        this.field3288 = System.nanoTime();
        this.field3287 = System.nanoTime();
    }
}
