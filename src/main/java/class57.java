import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class57 extends class71 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[J")
    private long[] field902 = new long[10];

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    private int field901 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "J")
    private long field906 = 0L;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "J")
    private long field903 = 0L;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    private int field905 = 1;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "J")
    private long field904 = 0L;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public final int method100(int arg0, int arg1) {
        if (arg0 != 99) {
            this.method97(-56);
        }
        this.field903 += this.method443((byte) -64);
        long var3 = (long) arg1 * 1000000L;
        if (this.field903 < this.field906) {
            class134.method1106((this.field906 - this.field903) / 1000000L, 10);
            this.field904 += this.field906 - this.field903;
            this.field903 += this.field906 - this.field903;
            this.field906 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field906 += var3;
        } while (var5 < 10 && this.field903 > this.field906);
        if (this.field903 > this.field906) {
            this.field906 = this.field903;
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)J")
    private final long method443(byte arg0) {
        long var2 = class10.method63(-21149) * 1000000L;
        long var4 = var2 - this.field904;
        this.field904 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field902[this.field901] = var4;
            this.field901 = (this.field901 + 1) % 10;
            if (this.field905 < 10) {
                this.field905++;
            }
        }
        if (arg0 >= -31) {
            this.method99((byte) -36);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field905; var8++) {
            var6 += this.field902[(this.field901 + 10 - var8) % 10];
        }
        return var6 / (long) this.field905;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)J")
    public final long method99(byte arg0) {
        if (arg0 <= 12) {
            this.field901 = 40;
        }
        return this.field903;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (this.field906 > this.field903) {
            this.field903 += this.field906 - this.field903;
        }
        if (arg0 != 99) {
            this.field903 = 113L;
        }
        this.field904 = 0L;
    }
}
