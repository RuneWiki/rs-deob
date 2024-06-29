import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class354 extends class211 {

    @OriginalMember(owner = "client!en", name = "f", descriptor = "J")
    private long field5644 = 0L;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "J")
    private long field5643 = 0L;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    private int field5646 = 0;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "J")
    private long field5645 = 0L;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "[J")
    private long[] field5647 = new long[10];

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    private int field5648 = 1;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(III)I", line = 5)
    public final int method4(int arg0, int arg1, int arg2) {
        class188.method1443(arg2 + 8, (long) arg1);
        this.field5643 += this.method2492(arg2 ^ 0xFFFFDBF2);
        if (arg2 != 2) {
            this.method3(3);
        }
        long var4 = (long) arg0 * 1000000L;
        if (this.field5643 < this.field5644) {
            class188.method1443(arg2 + 8, (-this.field5643 + this.field5644) / 1000000L);
            this.field5645 += this.field5644 - this.field5643;
            this.field5643 += this.field5644 - this.field5643;
            this.field5644 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field5644 += var4;
        } while (var6 < 10 && this.field5643 > this.field5644);
        if (this.field5643 > this.field5644) {
            this.field5644 = this.field5643;
        }
        return var6;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)J", line = 42)
    public final long method2(int arg0) {
        return arg0 == 0 ? this.field5643 : -98L;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)J", line = 53)
    private final long method2492(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5645;
        this.field5645 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5647[this.field5646] = var4;
            this.field5646 = (this.field5646 + 1) % 10;
            if (this.field5648 < 1) {
                this.field5648++;
            }
        }
        int var8 = 1;
        if (arg0 != -9232) {
            return 118L;
        }
        while (var8 <= this.field5648) {
            var6 += this.field5647[(this.field5646 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field5648;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 87)
    public final void method3(int arg0) {
        this.field5645 = 0L;
        if (arg0 != 31) {
            this.method2(96);
        }
        if (this.field5644 > this.field5643) {
            this.field5643 += this.field5644 - this.field5643;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 104)
    public class354() {
        this.field5644 = this.field5643 = jagmisc.nanoTime();
        if (this.field5643 == 0L) {
            throw new RuntimeException();
        }
    }
}
