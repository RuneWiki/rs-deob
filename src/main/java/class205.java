import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class205 extends class47 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "J")
    private long field2819 = 0L;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "J")
    private long field2820 = 0L;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    private int field2821 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "J")
    private long field2822 = 0L;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[J")
    private long[] field2824 = new long[10];

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    private int field2823 = 1;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)J")
    private final long method1354(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2822;
        this.field2822 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2824[this.field2821] = var4;
            if (this.field2823 < 1) {
                this.field2823++;
            }
            this.field2821 = (this.field2821 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 <= 85) {
            this.field2824 = null;
        }
        for (int var8 = 1; var8 <= this.field2823; var8++) {
            var6 += this.field2824[(this.field2821 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field2823;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
    public final long method339(boolean arg0) {
        return arg0 ? 37L : this.field2820;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method334(byte arg0) {
        this.field2822 = 0L;
        if (arg0 != -120) {
            this.field2821 = -18;
        }
        if (this.field2819 > this.field2820) {
            this.field2820 += this.field2819 - this.field2820;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
    public final int method337(int arg0, boolean arg1) {
        long var3 = (long) arg0 * 1000000L;
        this.field2820 += this.method1354((byte) 89);
        if (!arg1) {
            return -52;
        } else if (this.field2820 < this.field2819) {
            class31.method245((this.field2819 - this.field2820) / 1000000L, -115);
            this.field2822 += this.field2819 - this.field2820;
            this.field2820 += this.field2819 - this.field2820;
            this.field2819 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                var5++;
                this.field2819 += var3;
            } while (var5 < 10 && this.field2820 > this.field2819);
            if (this.field2819 < this.field2820) {
                this.field2819 = this.field2820;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class205() {
        this.field2819 = this.field2820 = jagmisc.nanoTime();
        if (this.field2820 == 0L) {
            throw new RuntimeException();
        }
    }
}
