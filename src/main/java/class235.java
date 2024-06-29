import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class235 extends class183 {

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "J")
    private long field3355 = 0L;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[J")
    private long[] field3357 = new long[10];

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "J")
    private long field3358 = 0L;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "J")
    private long field3354 = 0L;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    private int field3356 = 1;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    private int field3359 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I")
    public final int method1195(int arg0, byte arg1) {
        long var3 = (long) arg0 * 1000000L;
        if (arg1 > -44) {
            this.method1194((byte) -111);
        }
        this.field3358 += this.method1598(63);
        if (this.field3354 > this.field3358) {
            class349.method2219((this.field3354 - this.field3358) / 1000000L, -88);
            this.field3355 += this.field3354 - this.field3358;
            this.field3358 += this.field3354 - this.field3358;
            this.field3354 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3354 += var3;
        } while (var5 < 10 && this.field3354 < this.field3358);
        if (this.field3358 > this.field3354) {
            this.field3354 = this.field3358;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)J")
    private final long method1598(int arg0) {
        long var2 = class385.method2442(-6631) * 1000000L;
        long var4 = var2 - this.field3355;
        this.field3355 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3357[this.field3359] = var4;
            if (this.field3356 < 10) {
                this.field3356++;
            }
            this.field3359 = (this.field3359 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3356; var8++) {
            var6 += this.field3357[(this.field3359 + 10 - var8) % 10];
        }
        if (arg0 < 55) {
            this.field3359 = -75;
        }
        return var6 / (long) this.field3356;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public final void method1194(byte arg0) {
        this.field3355 = 0L;
        if (this.field3358 < this.field3354) {
            this.field3358 += this.field3354 - this.field3358;
        }
        if (arg0 != -41) {
            this.method1194((byte) -119);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
    public final long method1198(int arg0) {
        if (arg0 >= -69) {
            this.field3359 = -88;
        }
        return this.field3358;
    }
}
