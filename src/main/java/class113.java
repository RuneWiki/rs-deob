import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class113 extends class95 {

    @OriginalMember(owner = "client!op", name = "g", descriptor = "J")
    private long field1704 = 0L;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "J")
    private long field1705 = 0L;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "J")
    private long field1708 = 0L;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    private int field1709 = 1;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    private int field1707 = 0;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "[J")
    private long[] field1706 = new long[10];

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)J", line = 4)
    private final long method725(int arg0) {
        if (arg0 != 10) {
            return 33L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1708;
        this.field1708 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1706[this.field1707] = var4;
            this.field1707 = (this.field1707 + 1) % 10;
            if (this.field1709 < 1) {
                this.field1709++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1709; var8++) {
            var6 += this.field1706[(this.field1707 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1709;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)I", line = 39)
    public final int method136(boolean arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field1704 += this.method725(10);
        if (arg0) {
            return -65;
        } else if (this.field1704 < this.field1705) {
            class374.method2298(-28114, (this.field1705 - this.field1704) / 1000000L);
            this.field1708 += this.field1705 - this.field1704;
            this.field1704 += this.field1705 - this.field1704;
            this.field1705 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                this.field1705 += var3;
                var5++;
            } while (var5 < 10 && this.field1705 < this.field1704);
            if (this.field1705 < this.field1704) {
                this.field1705 = this.field1704;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 74)
    public final void method135(int arg0) {
        if (this.field1705 > this.field1704) {
            this.field1704 += this.field1705 - this.field1704;
        }
        if (arg0 != -1) {
            this.method135(49);
        }
        this.field1708 = 0L;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)J", line = 88)
    public final long method134(int arg0) {
        if (arg0 != 28919) {
            this.method134(59);
        }
        return this.field1704;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V", line = 104)
    public class113() {
        this.field1704 = System.nanoTime();
        this.field1705 = System.nanoTime();
    }
}
