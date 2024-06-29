import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class111 extends class69 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "J")
    private long field1709 = 0L;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[J")
    private long[] field1712 = new long[10];

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    private int field1714 = 1;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    private int field1710 = 0;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "J")
    private long field1713 = 0L;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "J")
    private long field1711 = 0L;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 4)
    public final void method491(int arg0) {
        if (this.field1709 < this.field1713) {
            this.field1709 += this.field1713 - this.field1709;
        }
        this.field1711 = (long) arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)I", line = 21)
    public final int method495(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field1712 = (long[]) null;
        }
        long var4 = (long) arg1 * 1000000L;
        class96.method657((long) arg2, (byte) -115);
        this.field1709 += this.method747(81);
        if (this.field1709 < this.field1713) {
            class96.method657((this.field1713 - this.field1709) / 1000000L, (byte) -115);
            this.field1711 += this.field1713 - this.field1709;
            this.field1709 += this.field1713 - this.field1709;
            this.field1713 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1713 += var4;
        } while (var6 < 10 && this.field1713 < this.field1709);
        if (this.field1713 < this.field1709) {
            this.field1713 = this.field1709;
        }
        return var6;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)J", line = 59)
    public final long method496(int arg0) {
        return arg0 == 4398 ? this.field1709 : -112L;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)J", line = 79)
    private final long method747(int arg0) {
        long var2 = class195.method1322(119) * 1000000L;
        long var4 = var2 - this.field1711;
        long var6 = 0L;
        this.field1711 = var2;
        if (arg0 <= 31) {
            return 120L;
        }
        if (var4 > 0L && var4 < 5000000000L) {
            this.field1712[this.field1710] = var4;
            this.field1710 = (this.field1710 + 1) % 10;
            if (this.field1714 < 10) {
                this.field1714++;
            }
        }
        for (int var8 = 1; var8 <= this.field1714; var8++) {
            var6 += this.field1712[(this.field1710 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1714;
    }
}
