import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 extends class95 {

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    private int field288 = 1;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "[J")
    private long[] field291 = new long[10];

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "J")
    private long field289 = 0L;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "J")
    private long field290 = 0L;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    private int field292 = 0;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "J")
    private long field287 = 0L;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)J", line = 6)
    public final long method134(int arg0) {
        if (arg0 != 28919) {
            this.method134(88);
        }
        return this.field289;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 20)
    public final void method135(int arg0) {
        if (this.field287 > this.field289) {
            this.field289 += this.field287 - this.field289;
        }
        this.field290 = 0L;
        if (arg0 != -1) {
            this.field292 = 105;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)I", line = 34)
    public final int method136(boolean arg0, int arg1) {
        if (arg0) {
            this.method137(false);
        }
        long var3 = (long) arg1 * 1000000L;
        this.field289 += this.method137(arg0);
        if (this.field287 > this.field289) {
            class374.method2298(-28114, (this.field287 - this.field289) / 1000000L);
            this.field290 += this.field287 - this.field289;
            this.field289 += this.field287 - this.field289;
            this.field287 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field287 += var3;
        } while (var5 < 10 && this.field289 > this.field287);
        if (this.field287 < this.field289) {
            this.field287 = this.field289;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)J", line = 72)
    private final long method137(boolean arg0) {
        long var2 = class440.method2583(25267) * 1000000L;
        long var4 = var2 - this.field290;
        this.field290 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field291[this.field292] = var4;
            if (this.field288 < 10) {
                this.field288++;
            }
            this.field292 = (this.field292 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field288; var8++) {
            var6 += this.field291[(this.field292 + 10 - var8) % 10];
        }
        if (arg0) {
            this.field287 = -83L;
        }
        return var6 / (long) this.field288;
    }
}
