import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class573 extends class280 {

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[J")
    private long[] field8087 = new long[10];

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "J")
    private long field8088 = 0L;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    private int field8086 = 0;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    private int field8090 = 1;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "J")
    private long field8089 = 0L;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "J")
    private long field8091 = 0L;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)J")
    public final long method1520(int arg0) {
        return arg0 == 0 ? this.field8089 : -22L;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)J")
    public final long method1521(byte arg0) {
        this.field8089 += this.method3367(22723);
        if (arg0 < 110) {
            this.method1520(-116);
        }
        return this.field8089 < this.field8088 ? (this.field8088 - this.field8089) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method1519(int arg0) {
        this.field8091 = 0L;
        if (this.field8088 > this.field8089) {
            this.field8089 += this.field8088 - this.field8089;
        }
        if (arg0 < 55) {
            this.method1522(97, 45L);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)J")
    private final long method3367(int arg0) {
        long var2 = class459.method2731(110) * 1000000L;
        long var4 = var2 - this.field8091;
        this.field8091 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8087[this.field8086] = var4;
            this.field8086 = (this.field8086 + 1) % 10;
            if (this.field8090 < 10) {
                this.field8090++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field8090; var8++) {
            var6 += this.field8087[(this.field8086 - (var8 - 10)) % 10];
        }
        if (arg0 != 22723) {
            this.field8087 = null;
        }
        return var6 / (long) this.field8090;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IJ)I")
    public final int method1522(int arg0, long arg1) {
        int var4 = 51 / ((67 - arg0) / 58);
        if (this.field8088 > this.field8089) {
            this.field8091 += this.field8088 - this.field8089;
            this.field8089 += this.field8088 - this.field8089;
            this.field8088 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field8088 += arg1;
        } while (var5 < 10 && this.field8089 > this.field8088);
        if (this.field8089 > this.field8088) {
            this.field8088 = this.field8089;
        }
        return var5;
    }
}
