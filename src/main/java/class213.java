import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class213 extends class449 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "J")
    private long field3385 = 0L;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    private int field3387 = 1;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "J")
    private long field3386 = 0L;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[J")
    private long[] field3383 = new long[10];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "J")
    private long field3384 = 0L;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    private int field3388 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final void method1440(int arg0) {
        this.field3386 = 0L;
        if (this.field3384 < this.field3385) {
            this.field3384 += this.field3385 - this.field3384;
        }
        int var2 = -125 / ((-arg0 - 47) / 53);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)J")
    private final long method1441(int arg0) {
        long var2 = class423.method2578(-19698) * 1000000L;
        long var4 = var2 - this.field3386;
        this.field3386 = var2;
        if (arg0 != 10) {
            this.field3383 = null;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3383[this.field3388] = var4;
            this.field3388 = (this.field3388 + 1) % 10;
            if (this.field3387 < 10) {
                this.field3387++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3387; var8++) {
            var6 += this.field3383[(this.field3388 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3387;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)J")
    public final long method1442(boolean arg0) {
        if (arg0) {
            this.field3385 = -92L;
        }
        return this.field3384;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public final int method1443(int arg0, int arg1) {
        this.field3384 += this.method1441(10);
        if (arg1 != 19116) {
            return -111;
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field3384 < this.field3385) {
            class50.method470((this.field3385 - this.field3384) / 1000000L, -5);
            this.field3386 += this.field3385 - this.field3384;
            this.field3384 += this.field3385 - this.field3384;
            this.field3385 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3385 += var3;
        } while (var5 < 10 && this.field3385 < this.field3384);
        if (this.field3385 < this.field3384) {
            this.field3385 = this.field3384;
        }
        return var5;
    }
}
