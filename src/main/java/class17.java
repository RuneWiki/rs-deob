import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class17 extends class71 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
    private long field235 = 0L;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "J")
    private long field236 = 0L;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[J")
    private long[] field237 = new long[10];

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "J")
    private long field239 = 0L;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field240 = 1;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field238 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (this.field235 > this.field236) {
            this.field236 += this.field235 - this.field236;
        }
        if (arg0 != 99) {
            this.method100(-63, -98);
        }
        this.field239 = 0L;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)J")
    private final long method98(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field239;
        this.field239 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field237[this.field238] = var4;
            this.field238 = (this.field238 + 1) % 10;
            if (this.field240 < 1) {
                this.field240++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field240; var8++) {
            var6 += this.field237[(this.field238 + 10 - var8) % 10];
        }
        return arg0 > -49 ? 81L : var6 / (long) this.field240;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)J")
    public final long method99(byte arg0) {
        if (arg0 < 12) {
            this.field240 = -125;
        }
        return this.field236;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
    public final int method100(int arg0, int arg1) {
        if (arg0 != 99) {
            this.method98((byte) 40);
        }
        this.field236 += this.method98((byte) -94);
        long var3 = (long) arg1 * 1000000L;
        if (this.field235 > this.field236) {
            class134.method1106((this.field235 - this.field236) / 1000000L, 10);
            this.field239 += this.field235 - this.field236;
            this.field236 += this.field235 - this.field236;
            this.field235 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field235 += var3;
            var5++;
        } while (var5 < 10 && this.field236 > this.field235);
        if (this.field236 > this.field235) {
            this.field235 = this.field236;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class17() {
        this.field236 = System.nanoTime();
        this.field235 = System.nanoTime();
    }
}
