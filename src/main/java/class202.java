import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class202 extends class206 {

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "J")
    private long field2712 = 0L;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "J")
    private long field2711 = 0L;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "[J")
    private long[] field2715 = new long[10];

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "J")
    private long field2713 = 0L;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    private int field2716 = 1;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    private int field2714 = 0;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
    public final void method69(int arg0) {
        this.field2712 = arg0;
        if (this.field2713 > this.field2711) {
            this.field2711 += this.field2713 - this.field2711;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)J")
    public final long method70(int arg0) {
        int var2 = -50 / ((30 - arg0) / 63);
        return this.field2711;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(JI)I")
    public final int method71(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field2715 = null;
        }
        if (this.field2713 > this.field2711) {
            this.field2712 += this.field2713 - this.field2711;
            this.field2711 += this.field2713 - this.field2711;
            this.field2713 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field2713 += arg0;
            var4++;
        } while (var4 < 10 && this.field2713 < this.field2711);
        if (this.field2711 > this.field2713) {
            this.field2713 = this.field2711;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)J")
    public final long method68(int arg0) {
        this.field2711 += this.method1313((byte) -90);
        int var2 = 98 / ((45 - arg0) / 47);
        return this.field2711 < this.field2713 ? (this.field2713 - this.field2711) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)J")
    private final long method1313(byte arg0) {
        long var2 = class446.method2525(500) * 1000000L;
        long var4 = var2 - this.field2712;
        this.field2712 = var2;
        if (arg0 != -90) {
            this.field2712 = 110L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2715[this.field2714] = var4;
            this.field2714 = (this.field2714 + 1) % 10;
            if (this.field2716 < 10) {
                this.field2716++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2716; var8++) {
            var6 += this.field2715[(this.field2714 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2716;
    }
}
