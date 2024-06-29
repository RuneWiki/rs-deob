import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class291 extends class105 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "J")
    private long field4581 = 0L;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "J")
    private long field4582 = 0L;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[J")
    private long[] field4583 = new long[10];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "J")
    private long field4584 = 0L;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    private int field4585 = 0;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field4586 = 1;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)J")
    private final long method1931(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4584;
        long var6 = 0L;
        this.field4584 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4583[this.field4585] = var4;
            if (this.field4586 < 1) {
                this.field4586++;
            }
            this.field4585 = (this.field4585 + 1) % 10;
        }
        if (arg0 > -112) {
            return -8L;
        } else {
            for (int var8 = 1; var8 <= this.field4586; var8++) {
                var6 += this.field4583[(this.field4585 + 10 - var8) % 10];
            }
            return var6 / (long) this.field4586;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)I")
    public final int method501(int arg0, int arg1, int arg2) {
        if (arg2 != 25912) {
            return -32;
        }
        long var4 = (long) arg1 * 1000000L;
        class250.method1643(arg2 ^ 0x6539, (long) arg0);
        this.field4582 += this.method1931((byte) -123);
        if (this.field4582 < this.field4581) {
            class250.method1643(1, (this.field4581 - this.field4582) / 1000000L);
            this.field4584 += this.field4581 - this.field4582;
            this.field4582 += this.field4581 - this.field4582;
            this.field4581 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field4581 += var4;
            var6++;
        } while (var6 < 10 && this.field4582 > this.field4581);
        if (this.field4582 > this.field4581) {
            this.field4581 = this.field4582;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public final void method500(int arg0) {
        if (arg0 > -40) {
            this.method501(108, 87, 124);
        }
        if (this.field4582 < this.field4581) {
            this.field4582 += this.field4581 - this.field4582;
        }
        this.field4584 = 0L;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)J")
    public final long method499(int arg0) {
        if (arg0 != -22091) {
            this.method1931((byte) 81);
        }
        return this.field4582;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class291() {
        this.field4582 = System.nanoTime();
        this.field4581 = System.nanoTime();
    }
}
