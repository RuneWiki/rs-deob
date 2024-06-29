import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class155 extends class96 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "J")
    private long field2365 = 0L;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "J")
    private long field2366 = 0L;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field2367 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[J")
    private long[] field2370 = new long[10];

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    private int field2369 = 1;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "J")
    private long field2368 = 0L;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)J")
    private final long method1037(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 > -103) {
            return 67L;
        }
        long var4 = var2 - this.field2368;
        this.field2368 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2370[this.field2367] = var4;
            if (this.field2369 < 1) {
                this.field2369++;
            }
            this.field2367 = (this.field2367 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2369; var8++) {
            var6 += this.field2370[(this.field2367 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2369;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public final int method708(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method705((byte) 70);
        }
        this.field2365 += this.method1037(-125);
        long var3 = (long) arg0 * 1000000L;
        if (this.field2366 > this.field2365) {
            class157.method1046(arg1 - 127, (-this.field2365 + this.field2366) / 1000000L);
            this.field2368 += this.field2366 - this.field2365;
            this.field2365 += this.field2366 - this.field2365;
            this.field2366 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2366 += var3;
            var5++;
        } while (var5 < 10 && this.field2366 < this.field2365);
        if (this.field2365 > this.field2366) {
            this.field2366 = this.field2365;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class155() {
        this.field2366 = this.field2365 = jagmisc.nanoTime();
        if (this.field2365 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)J")
    public final long method705(byte arg0) {
        if (arg0 < 44) {
            this.method709(74);
        }
        return this.field2365;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method709(int arg0) {
        this.field2368 = 0L;
        if (this.field2366 > this.field2365) {
            this.field2365 += this.field2366 - this.field2365;
        }
        if (arg0 != 64) {
            this.field2365 = 100L;
        }
    }
}
