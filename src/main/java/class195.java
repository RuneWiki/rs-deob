import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class195 extends class413 {

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "J")
    private long field3163 = 0L;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "J")
    private long field3164 = 0L;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "[J")
    private long[] field3166 = new long[10];

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    private int field3168 = 0;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    private int field3165 = 1;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "J")
    private long field3167 = 0L;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method1366(int arg0) {
        this.field3167 = 0L;
        if (arg0 != -233) {
            this.method1367(true, 17);
        }
        if (this.field3164 > this.field3163) {
            this.field3163 += this.field3164 - this.field3163;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)I")
    public final int method1367(boolean arg0, int arg1) {
        if (arg0) {
            this.field3168 = -28;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field3163 += this.method1368((byte) -121);
        if (this.field3163 < this.field3164) {
            class84.method517((byte) 119, (this.field3164 - this.field3163) / 1000000L);
            this.field3167 += this.field3164 - this.field3163;
            this.field3163 += this.field3164 - this.field3163;
            this.field3164 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3164 += var3;
        } while (var5 < 10 && this.field3163 > this.field3164);
        if (this.field3163 > this.field3164) {
            this.field3164 = this.field3163;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)J")
    private final long method1368(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3167;
        this.field3167 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3166[this.field3168] = var4;
            this.field3168 = (this.field3168 + 1) % 10;
            if (this.field3165 < 1) {
                this.field3165++;
            }
        }
        long var6 = 0L;
        int var8 = 127 % ((arg0 + 83) / 36);
        for (int var9 = 1; var9 <= this.field3165; var9++) {
            var6 += this.field3166[(this.field3168 + 10 - var9) % 10];
        }
        return var6 / (long) this.field3165;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)J")
    public final long method1369(byte arg0) {
        return arg0 == 83 ? this.field3163 : 120L;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class195() {
        this.field3163 = System.nanoTime();
        this.field3164 = System.nanoTime();
    }
}
