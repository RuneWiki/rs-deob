import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class647 extends class555 {

    @OriginalMember(owner = "client!it", name = "h", descriptor = "J")
    private long field8586 = 0L;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "J")
    private long field8587 = 0L;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    private int field8590 = 0;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    private int field8589 = 1;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "[J")
    private long[] field8588 = new long[10];

    @OriginalMember(owner = "client!it", name = "m", descriptor = "J")
    private long field8591 = 0L;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(JI)I", line = 3)
    public final int method1091(long arg0, int arg1) {
        if (arg1 > -123) {
            this.method1091(-34L, 24);
        }
        if (this.field8586 > this.field8587) {
            this.field8591 += this.field8586 - this.field8587;
            this.field8587 += this.field8586 - this.field8587;
            this.field8586 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field8586 += arg0;
            var4++;
        } while (var4 < 10 && this.field8586 < this.field8587);
        if (this.field8587 > this.field8586) {
            this.field8586 = this.field8587;
        }
        return var4;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)J", line = 36)
    public final long method1094(int arg0) {
        if (arg0 != -21571) {
            this.field8590 = -77;
        }
        return this.field8587;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)J", line = 46)
    private final long method3541(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field8591;
        int var6 = -60 / ((arg0 - 22) / 56);
        this.field8591 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8588[this.field8590] = var4;
            if (this.field8589 < 1) {
                this.field8589++;
            }
            this.field8590 = (this.field8590 + 1) % 10;
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field8589; var9++) {
            var7 += this.field8588[(this.field8590 + 10 - var9) % 10];
        }
        return var7 / (long) this.field8589;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V", line = 115)
    public class647() {
        this.field8586 = this.field8587 = jagmisc.nanoTime();
        if (this.field8587 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)J", line = 83)
    public final long method1092(int arg0) {
        if (arg0 != 6407) {
            this.method1092(-3);
        }
        this.field8587 += this.method3541(-99);
        return this.field8587 < this.field8586 ? (this.field8586 - this.field8587) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 99)
    public final void method1093(byte arg0) {
        this.field8591 = 0L;
        if (this.field8586 > this.field8587) {
            this.field8587 += this.field8586 - this.field8587;
        }
        int var2 = -58 / ((21 - arg0) / 57);
    }
}
