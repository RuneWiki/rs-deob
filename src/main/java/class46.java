import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class46 extends class212 {

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "J")
    private long field626 = 0L;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "J")
    private long field627 = 0L;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[J")
    private long[] field628 = new long[10];

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    private int field629 = 1;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    private int field630 = 0;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "J")
    private long field631 = 0L;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)J")
    public final long method137(int arg0) {
        int var2 = 25 % ((-arg0 - 83) / 39);
        return this.field626;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)J")
    private final long method290(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field631;
        this.field631 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field628[this.field630] = var6;
            if (this.field629 < 1) {
                this.field629++;
            }
            this.field630 = (this.field630 + 1) % 10;
        }
        if (!arg0) {
            this.field631 = 125L;
        }
        for (int var8 = 1; var8 <= this.field629; var8++) {
            var4 += this.field628[(this.field630 + 10 - var8) % 10];
        }
        return var4 / (long) this.field629;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII)I")
    public final int method135(byte arg0, int arg1, int arg2) {
        if (arg0 != -33) {
            this.field626 = 115L;
        }
        class96.method614(0, (long) arg2);
        this.field626 += this.method290(true);
        long var4 = (long) arg1 * 1000000L;
        if (this.field626 < this.field627) {
            class96.method614(0, (this.field627 - this.field626) / 1000000L);
            this.field631 += this.field627 - this.field626;
            this.field626 += this.field627 - this.field626;
            this.field627 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field627 += var4;
        } while (var6 < 10 && this.field626 > this.field627);
        if (this.field627 < this.field626) {
            this.field627 = this.field626;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        if (this.field626 < this.field627) {
            this.field626 += this.field627 - this.field626;
        }
        this.field631 = 0L;
        if (!arg0) {
            this.field627 = 115L;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class46() {
        this.field626 = System.nanoTime();
        this.field627 = System.nanoTime();
    }
}
