import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class246 extends class265 {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "J")
    private long field3591 = 0L;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "J")
    private long field3590 = 0L;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    private int field3593 = 1;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    private int field3592 = 0;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "J")
    private long field3594 = 0L;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "[J")
    private long[] field3595 = new long[10];

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)J", line = 4)
    public final long method195(int arg0) {
        return arg0 == 0 ? this.field3590 : -63L;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)J", line = 17)
    private final long method1731(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3594;
        this.field3594 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3595[this.field3592] = var4;
            if (this.field3593 < 1) {
                this.field3593++;
            }
            this.field3592 = (this.field3592 + 1) % 10;
        }
        for (int var8 = arg0; var8 <= this.field3593; var8++) {
            var6 += this.field3595[(this.field3592 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3593;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 52)
    public class246() {
        this.field3591 = this.field3590 = jagmisc.nanoTime();
        if (this.field3590 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I", line = 65)
    public final int method198(int arg0, int arg1, int arg2) {
        if (arg1 <= 91) {
            return -128;
        }
        class177.method1299((byte) 64, (long) arg0);
        long var4 = (long) arg2 * 1000000L;
        this.field3590 += this.method1731(1);
        if (this.field3590 < this.field3591) {
            class177.method1299((byte) 64, (this.field3591 - this.field3590) / 1000000L);
            this.field3594 += this.field3591 - this.field3590;
            this.field3590 += this.field3591 - this.field3590;
            this.field3591 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3591 += var4;
            var6++;
        } while (var6 < 10 && this.field3591 < this.field3590);
        if (this.field3591 < this.field3590) {
            this.field3591 = this.field3590;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 104)
    public final void method197(int arg0) {
        this.field3594 = 0L;
        int var2 = -52 % ((2 - arg0) / 59);
        if (this.field3591 > this.field3590) {
            this.field3590 += this.field3591 - this.field3590;
        }
    }
}
