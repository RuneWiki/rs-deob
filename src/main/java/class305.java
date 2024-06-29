import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class305 extends class307 {

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "J")
    private long field4958 = 0L;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "J")
    private long field4957 = 0L;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    private int field4959 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "[J")
    private long[] field4961 = new long[10];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    private int field4960 = 1;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "J")
    private long field4962 = 0L;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)I")
    public final int method276(int arg0, byte arg1, int arg2) {
        if (arg1 > -25) {
            return 51;
        }
        long var4 = (long) arg0 * 1000000L;
        class33.method250((long) arg2, 256);
        this.field4957 += this.method2074(-119);
        if (this.field4957 < this.field4962) {
            class33.method250((this.field4962 - this.field4957) / 1000000L, 256);
            this.field4958 += this.field4962 - this.field4957;
            this.field4957 += this.field4962 - this.field4957;
            this.field4962 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field4962 += var4;
            var6++;
        } while (var6 < 10 && this.field4957 > this.field4962);
        if (this.field4957 > this.field4962) {
            this.field4962 = this.field4957;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)J")
    private final long method2074(int arg0) {
        long var2 = class264.method1778(6573) * 1000000L;
        long var4 = var2 - this.field4958;
        this.field4958 = var2;
        if (arg0 > -93) {
            this.field4960 = 92;
        }
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4961[this.field4959] = var4;
            if (this.field4960 < 10) {
                this.field4960++;
            }
            this.field4959 = (this.field4959 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field4960; var8++) {
            var6 += this.field4961[(this.field4959 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field4960;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public final void method275(byte arg0) {
        if (this.field4957 < this.field4962) {
            this.field4957 += this.field4962 - this.field4957;
        }
        this.field4958 = 0L;
        if (arg0 > -52) {
            this.field4961 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)J")
    public final long method273(byte arg0) {
        if (arg0 != -106) {
            this.field4961 = null;
        }
        return this.field4957;
    }
}
