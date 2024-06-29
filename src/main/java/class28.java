import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class28 extends class36 {

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "J")
    private long field383 = 0L;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    private int field387 = 1;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "J")
    private long field384 = 0L;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[J")
    private long[] field385 = new long[10];

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    private int field388 = 0;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "J")
    private long field386 = 0L;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)J", line = 10)
    private final long method161(int arg0) {
        long var2 = class283.method2038((byte) 124) * 1000000L;
        long var4 = var2 - this.field386;
        this.field386 = var2;
        long var6 = 0L;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field385[this.field388] = var4;
            if (this.field387 < 10) {
                this.field387++;
            }
            this.field388 = (this.field388 + 1) % 10;
        }
        for (int var8 = arg0; var8 <= this.field387; var8++) {
            var6 += this.field385[(this.field388 + 10 - var8) % 10];
        }
        return var6 / (long) this.field387;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)J", line = 41)
    public final long method162(int arg0) {
        return arg0 == 64 ? this.field383 : 74L;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I", line = 70)
    public final int method163(int arg0, int arg1, int arg2) {
        class121.method867((byte) -128, (long) arg1);
        if (arg0 != 0) {
            this.field388 = 69;
        }
        long var4 = (long) arg2 * 1000000L;
        this.field383 += this.method161(1);
        if (this.field383 < this.field384) {
            class121.method867((byte) -105, (this.field384 - this.field383) / 1000000L);
            this.field386 += this.field384 - this.field383;
            this.field383 += this.field384 - this.field383;
            this.field384 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field384 += var4;
            var6++;
        } while (var6 < 10 && this.field384 < this.field383);
        if (this.field384 < this.field383) {
            this.field384 = this.field383;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 109)
    public final void method164(int arg0) {
        if (this.field383 < this.field384) {
            this.field383 += this.field384 - this.field383;
        }
        this.field386 = (long) arg0;
    }
}
