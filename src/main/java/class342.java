import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class342 extends class417 {

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "[J")
    private long[] field4657 = new long[10];

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    private int field4659 = 1;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    private int field4660 = 0;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "J")
    private long field4656 = 0L;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "J")
    private long field4658 = 0L;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "J")
    private long field4661 = 0L;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public final void method1570(int arg0) {
        this.field4656 = 0L;
        if (arg0 >= 29 && this.field4661 < this.field4658) {
            this.field4661 += this.field4658 - this.field4661;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)J")
    private final long method2023(byte arg0) {
        long var2 = class193.method1237(-9581) * 1000000L;
        long var4 = var2 - this.field4656;
        this.field4656 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4657[this.field4660] = var4;
            if (this.field4659 < 10) {
                this.field4659++;
            }
            this.field4660 = (this.field4660 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 < 79) {
            this.method1568(-67);
        }
        for (int var8 = 1; var8 <= this.field4659; var8++) {
            var6 += this.field4657[(this.field4660 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field4659;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)I")
    public final int method1569(byte arg0, int arg1) {
        if (arg0 <= 90) {
            this.field4658 = 56L;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field4661 += this.method2023((byte) 82);
        if (this.field4658 > this.field4661) {
            class258.method1603(-649, (this.field4658 - this.field4661) / 1000000L);
            this.field4656 += this.field4658 - this.field4661;
            this.field4661 += this.field4658 - this.field4661;
            this.field4658 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4658 += var3;
            var5++;
        } while (var5 < 10 && this.field4658 < this.field4661);
        if (this.field4661 > this.field4658) {
            this.field4658 = this.field4661;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)J")
    public final long method1568(int arg0) {
        int var2 = -55 % ((arg0 + 20) / 62);
        return this.field4661;
    }
}
