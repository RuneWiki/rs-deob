import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class150 extends class284 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "J")
    private long field1888 = 0L;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "J")
    private long field1887 = 0L;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    private int field1889 = 1;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[J")
    private long[] field1891 = new long[10];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "J")
    private long field1890 = 0L;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    private int field1892 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)J")
    private final long method988(int arg0) {
        if (arg0 != 14894) {
            this.field1891 = null;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1890;
        this.field1890 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1891[this.field1892] = var4;
            if (this.field1889 < 1) {
                this.field1889++;
            }
            this.field1892 = (this.field1892 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1889; var8++) {
            var6 += this.field1891[(this.field1892 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1889;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
    public final int method544(int arg0, int arg1) {
        this.field1887 += this.method988(14894);
        int var3 = 45 % ((arg0 + 80) / 44);
        long var4 = (long) arg1 * 1000000L;
        if (this.field1887 < this.field1888) {
            class199.method1251((this.field1888 - this.field1887) / 1000000L, (byte) 105);
            this.field1890 += this.field1888 - this.field1887;
            this.field1887 += this.field1888 - this.field1887;
            this.field1888 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1888 += var4;
        } while (var6 < 10 && this.field1888 < this.field1887);
        if (this.field1888 < this.field1887) {
            this.field1888 = this.field1887;
        }
        return var6;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method543(int arg0) {
        this.field1890 = 0L;
        if (this.field1888 > this.field1887) {
            this.field1887 += this.field1888 - this.field1887;
        }
        if (arg0 > -48) {
            this.method543(114);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)J")
    public final long method542(int arg0) {
        return arg0 <= 105 ? 82L : this.field1887;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class150() {
        this.field1888 = this.field1887 = jagmisc.nanoTime();
        if (this.field1887 == 0L) {
            throw new RuntimeException();
        }
    }
}
