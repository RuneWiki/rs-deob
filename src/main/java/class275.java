import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class275 extends class95 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "J")
    private long field3635 = 0L;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "J")
    private long field3636 = 0L;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    private int field3637 = 0;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field3640 = 1;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "[J")
    private long[] field3638 = new long[10];

    @OriginalMember(owner = "client!af", name = "k", descriptor = "J")
    private long field3639 = 0L;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public final void method135(int arg0) {
        if (this.field3635 > this.field3636) {
            this.field3636 += this.field3635 - this.field3636;
        }
        if (arg0 != -1) {
            this.method1545(71);
        }
        this.field3639 = 0L;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)J")
    private final long method1545(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3639;
        this.field3639 = var2;
        if (arg0 != 8162) {
            this.field3638 = null;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3638[this.field3637] = var4;
            this.field3637 = (this.field3637 + 1) % 10;
            if (this.field3640 < 1) {
                this.field3640++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3640; var8++) {
            var6 += this.field3638[(this.field3637 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3640;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)I")
    public final int method136(boolean arg0, int arg1) {
        this.field3636 += this.method1545(8162);
        if (arg0) {
            return -124;
        }
        long var3 = (long) arg1 * 1000000L;
        if (this.field3635 > this.field3636) {
            class374.method2298(-28114, (this.field3635 - this.field3636) / 1000000L);
            this.field3639 += this.field3635 - this.field3636;
            this.field3636 += this.field3635 - this.field3636;
            this.field3635 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field3635 += var3;
            var5++;
        } while (var5 < 10 && this.field3636 > this.field3635);
        if (this.field3635 < this.field3636) {
            this.field3635 = this.field3636;
        }
        return var5;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)J")
    public final long method134(int arg0) {
        if (arg0 != 28919) {
            this.method1545(-72);
        }
        return this.field3636;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class275() {
        this.field3635 = this.field3636 = jagmisc.nanoTime();
        if (this.field3636 == 0L) {
            throw new RuntimeException();
        }
    }
}
