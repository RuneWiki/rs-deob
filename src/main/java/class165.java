import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class165 extends class71 {

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "J")
    private long field2475 = 0L;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "J")
    private long field2476 = 0L;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "J")
    private long field2477 = 0L;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "[J")
    private long[] field2478 = new long[10];

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    private int field2479 = 1;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    private int field2480 = 0;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)J", line = 3)
    private final long method1274(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2477;
        this.field2477 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2478[this.field2480] = var4;
            if (this.field2479 < 1) {
                this.field2479++;
            }
            this.field2480 = (this.field2480 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != 45) {
            this.field2475 = -10L;
        }
        for (int var8 = 1; var8 <= this.field2479; var8++) {
            var6 += this.field2478[(this.field2480 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2479;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 104)
    public class165() {
        this.field2475 = this.field2476 = jagmisc.nanoTime();
        if (this.field2476 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 41)
    public final void method97(int arg0) {
        this.field2477 = 0L;
        if (arg0 != 99) {
            this.field2479 = -50;
        }
        if (this.field2475 > this.field2476) {
            this.field2476 += this.field2475 - this.field2476;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)J", line = 56)
    public final long method99(byte arg0) {
        return arg0 < 12 ? 126L : this.field2476;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I", line = 69)
    public final int method100(int arg0, int arg1) {
        if (arg0 != 99) {
            this.field2479 = -80;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field2476 += this.method1274((byte) 45);
        if (this.field2475 > this.field2476) {
            class134.method1106((this.field2475 - this.field2476) / 1000000L, 10);
            this.field2477 += this.field2475 - this.field2476;
            this.field2476 += this.field2475 - this.field2476;
            this.field2475 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2475 += var3;
            var5++;
        } while (var5 < 10 && this.field2476 > this.field2475);
        if (this.field2475 < this.field2476) {
            this.field2475 = this.field2476;
        }
        return var5;
    }
}
