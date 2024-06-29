import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class141 extends class287 {

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "J")
    private long field2105 = 0L;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "J")
    private long field2106 = 0L;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    private int field2108 = 1;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[J")
    private long[] field2107 = new long[10];

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private int field2109 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "J")
    private long field2110 = 0L;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)J", line = 4)
    public final long method1028(int arg0) {
        return arg0 == 0 ? this.field2106 : 64L;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)I", line = 14)
    public final int method1029(int arg0, int arg1) {
        if (arg1 > -16) {
            this.method1028(54);
        }
        long var3 = (long) arg0 * 1000000L;
        this.field2106 += this.method1030(0);
        if (this.field2105 > this.field2106) {
            class185.method1285(113, (this.field2105 - this.field2106) / 1000000L);
            this.field2110 += this.field2105 - this.field2106;
            this.field2106 += this.field2105 - this.field2106;
            this.field2105 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2105 += var3;
            var5++;
        } while (var5 < 10 && this.field2106 > this.field2105);
        if (this.field2105 < this.field2106) {
            this.field2105 = this.field2106;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)J", line = 51)
    private final long method1030(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2110;
        this.field2110 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2107[this.field2109] = var4;
            this.field2109 = (this.field2109 + 1) % 10;
            if (this.field2108 < 1) {
                this.field2108++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field2108; var8++) {
            var6 += this.field2107[(this.field2109 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2108;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 82)
    public final void method1031(int arg0) {
        this.field2110 = 0L;
        if (this.field2105 > this.field2106) {
            this.field2106 += this.field2105 - this.field2106;
        }
        if (arg0 <= 114) {
            this.field2106 = 120L;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 101)
    public class141() {
        this.field2105 = this.field2106 = jagmisc.nanoTime();
        if (this.field2106 == 0L) {
            throw new RuntimeException();
        }
    }
}
