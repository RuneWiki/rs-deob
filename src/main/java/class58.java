import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class58 extends class284 {

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "J")
    private long field754 = 0L;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "J")
    private long field757 = 0L;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    private int field755 = 0;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "J")
    private long field756 = 0L;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[J")
    private long[] field758 = new long[10];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    private int field759 = 1;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)J", line = 3)
    private final long method541(int arg0) {
        long var2 = class504.method3034((byte) -102) * 1000000L;
        long var4 = var2 - this.field754;
        this.field754 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field758[this.field755] = var4;
            if (this.field759 < 10) {
                this.field759++;
            }
            this.field755 = (this.field755 + 1) % 10;
        }
        if (arg0 != 10) {
            this.method541(-20);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field759; var8++) {
            var6 += this.field758[(this.field755 + 10 - var8) % 10];
        }
        return var6 / (long) this.field759;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)J", line = 38)
    public final long method542(int arg0) {
        return arg0 < 105 ? 96L : this.field757;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V", line = 52)
    public final void method543(int arg0) {
        if (this.field756 > this.field757) {
            this.field757 += this.field756 - this.field757;
        }
        if (arg0 <= -48) {
            this.field754 = 0L;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I", line = 70)
    public final int method544(int arg0, int arg1) {
        int var3 = 76 % ((-arg0 - 80) / 44);
        this.field757 += this.method541(10);
        long var4 = (long) arg1 * 1000000L;
        if (this.field756 > this.field757) {
            class199.method1251((this.field756 - this.field757) / 1000000L, (byte) 109);
            this.field754 += this.field756 - this.field757;
            this.field757 += this.field756 - this.field757;
            this.field756 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field756 += var4;
        } while (var6 < 10 && this.field756 < this.field757);
        if (this.field757 > this.field756) {
            this.field756 = this.field757;
        }
        return var6;
    }
}
