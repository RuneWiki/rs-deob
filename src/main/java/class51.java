import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class51 extends class324 {

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "J")
    private long field690 = 0L;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "[J")
    private long[] field689 = new long[10];

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    private int field687 = 1;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "J")
    private long field688 = 0L;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    private int field691 = 0;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "J")
    private long field692 = 0L;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IJ)I")
    public final int method278(int arg0, long arg1) {
        if (arg0 <= 19) {
            this.field687 = 34;
        }
        if (this.field690 < this.field692) {
            this.field688 += this.field692 - this.field690;
            this.field690 += this.field692 - this.field690;
            this.field692 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field692 += arg1;
            var4++;
        } while (var4 < 10 && this.field692 < this.field690);
        if (this.field692 < this.field690) {
            this.field692 = this.field690;
        }
        return var4;
    }

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "(I)J")
    private final long method279(int arg0) {
        long var2 = class348.method2175(arg0 ^ 0xFFFFCDF4) * 1000000L;
        long var4 = var2 - this.field688;
        this.field688 = var2;
        if (arg0 != 12913) {
            this.method282(7);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field689[this.field691] = var4;
            this.field691 = (this.field691 + 1) % 10;
            if (this.field687 < 10) {
                this.field687++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field687; var8++) {
            var6 += this.field689[(this.field691 + 10 - var8) % 10];
        }
        return var6 / (long) this.field687;
    }

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)J")
    public final long method280(int arg0) {
        this.field690 += this.method279(12913);
        int var2 = 44 / ((37 - arg0) / 41);
        return this.field692 > this.field690 ? (this.field692 - this.field690) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)J")
    public final long method281(int arg0) {
        if (arg0 != -9060) {
            this.method278(118, 31L);
        }
        return this.field690;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public final void method282(int arg0) {
        if (this.field692 > this.field690) {
            this.field690 += this.field692 - this.field690;
        }
        if (arg0 != 17184) {
            this.field690 = -9L;
        }
        this.field688 = 0L;
    }
}
