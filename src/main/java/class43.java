import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class43 extends class192 {

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "J")
    private long field695 = 0L;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "J")
    private long field694 = 0L;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    private int field696 = 0;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[J")
    private long[] field697 = new long[10];

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    private int field698 = 1;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "J")
    private long field699 = 0L;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)I")
    public final int method457(byte arg0, int arg1) {
        if (arg0 != 119) {
            this.field697 = null;
        }
        this.field694 += this.method459(23731);
        long var3 = (long) arg1 * 1000000L;
        if (this.field694 < this.field695) {
            class89.method752(0, (this.field695 - this.field694) / 1000000L);
            this.field699 += this.field695 - this.field694;
            this.field694 += this.field695 - this.field694;
            this.field695 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field695 += var3;
        } while (var5 < 10 && this.field694 > this.field695);
        if (this.field694 > this.field695) {
            this.field695 = this.field694;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)J")
    public final long method458(int arg0) {
        int var2 = -82 % ((77 - arg0) / 35);
        return this.field694;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)J")
    private final long method459(int arg0) {
        if (arg0 != 23731) {
            return -125L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field699;
        this.field699 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field697[this.field696] = var4;
            this.field696 = (this.field696 + 1) % 10;
            if (this.field698 < 1) {
                this.field698++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field698; var8++) {
            var6 += this.field697[(this.field696 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field698;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public final void method460(int arg0) {
        if (arg0 > 22) {
            this.field699 = 0L;
            if (this.field695 > this.field694) {
                this.field694 += this.field695 - this.field694;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class43() {
        this.field695 = this.field694 = jagmisc.nanoTime();
        if (this.field694 == 0L) {
            throw new RuntimeException();
        }
    }
}
