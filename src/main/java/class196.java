import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class196 extends class307 {

    @OriginalMember(owner = "client!je", name = "j", descriptor = "J")
    private long field3163 = 0L;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "J")
    private long field3164 = 0L;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "J")
    private long field3165 = 0L;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    private int field3166 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    private int field3168 = 1;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[J")
    private long[] field3167 = new long[10];

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)J")
    private final long method1363(int arg0) {
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field3165;
        this.field3165 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field3167[this.field3166] = var6;
            this.field3166 = (this.field3166 + 1) % 10;
            if (this.field3168 < 1) {
                this.field3168++;
            }
        }
        if (arg0 != 10) {
            this.field3166 = 88;
        }
        for (int var8 = 1; var8 <= this.field3168; var8++) {
            var4 += this.field3167[(this.field3166 + 10 - var8) % 10];
        }
        return var4 / (long) this.field3168;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public final void method275(byte arg0) {
        if (this.field3164 > this.field3163) {
            this.field3163 += this.field3164 - this.field3163;
        }
        this.field3165 = 0L;
        if (arg0 > -52) {
            this.field3166 = 81;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)J")
    public final long method273(byte arg0) {
        if (arg0 != -106) {
            this.method273((byte) -42);
        }
        return this.field3163;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)I")
    public final int method276(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg1 >= -25) {
            this.field3168 = -52;
        }
        class33.method250((long) arg2, 256);
        this.field3163 += this.method1363(10);
        if (this.field3164 > this.field3163) {
            class33.method250((this.field3164 - this.field3163) / 1000000L, 256);
            this.field3165 += this.field3164 - this.field3163;
            this.field3163 += this.field3164 - this.field3163;
            this.field3164 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3164 += var4;
            var6++;
        } while (var6 < 10 && this.field3164 < this.field3163);
        if (this.field3163 > this.field3164) {
            this.field3164 = this.field3163;
        }
        return var6;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class196() {
        this.field3163 = System.nanoTime();
        this.field3164 = System.nanoTime();
    }
}
