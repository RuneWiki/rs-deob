import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class549 extends class388 {

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    private int field7796 = 1;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "J")
    private long field7797 = 0L;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "[J")
    private long[] field7795 = new long[10];

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "J")
    private long field7798 = 0L;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "J")
    private long field7799 = 0L;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    private int field7794 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)J")
    public final long method2284(int arg0) {
        if (arg0 != 2) {
            this.method2286((byte) 49);
        }
        this.field7799 += this.method3159(1);
        return this.field7797 > this.field7799 ? (this.field7797 - this.field7799) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(IJ)I")
    public final int method2285(int arg0, long arg1) {
        if (arg0 < 115) {
            return 125;
        } else if (this.field7799 < this.field7797) {
            this.field7798 += this.field7797 - this.field7799;
            this.field7799 += this.field7797 - this.field7799;
            this.field7797 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field7797 += arg1;
            } while (var4 < 10 && this.field7797 < this.field7799);
            if (this.field7797 < this.field7799) {
                this.field7797 = this.field7799;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public final void method2286(byte arg0) {
        if (this.field7797 > this.field7799) {
            this.field7799 += this.field7797 - this.field7799;
        }
        this.field7798 = 0L;
        if (arg0 > -7) {
            this.method3159(-86);
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)J")
    private final long method3159(int arg0) {
        long var2 = class525.method3074((byte) -101) * 1000000L;
        long var4 = var2 - this.field7798;
        this.field7798 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7795[this.field7794] = var4;
            this.field7794 = (this.field7794 + 1) % 10;
            if (this.field7796 < 10) {
                this.field7796++;
            }
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field7796; var8++) {
            var6 += this.field7795[(this.field7794 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7796;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)J")
    public final long method2287(int arg0) {
        int var2 = 60 % ((arg0 - 26) / 39);
        return this.field7799;
    }
}
