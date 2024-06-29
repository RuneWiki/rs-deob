import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class320 extends class347 {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "J")
    private long field4645 = 0L;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "J")
    private long field4646 = 0L;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    private int field4647 = 0;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "[J")
    private long[] field4649 = new long[10];

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    private int field4650 = 1;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "J")
    private long field4648 = 0L;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)I", line = 5)
    public final int method1958(int arg0, int arg1) {
        if (arg0 != 24) {
            this.field4647 = 58;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field4646 += this.method1961(0);
        if (this.field4645 > this.field4646) {
            class85.method433((this.field4645 - this.field4646) / 1000000L, 88);
            this.field4648 += this.field4645 - this.field4646;
            this.field4646 += this.field4645 - this.field4646;
            this.field4645 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4645 += var3;
        } while (var5 < 10 && this.field4645 < this.field4646);
        if (this.field4646 > this.field4645) {
            this.field4645 = this.field4646;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 41)
    public final void method1959(int arg0) {
        this.field4648 = (long) arg0;
        if (this.field4645 > this.field4646) {
            this.field4646 += this.field4645 - this.field4646;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)J", line = 55)
    public final long method1960(int arg0) {
        int var2 = -46 % ((arg0) / 33);
        return this.field4646;
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)J", line = 63)
    private final long method1961(int arg0) {
        if (arg0 != 0) {
            this.field4645 = -66L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4648;
        this.field4648 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4649[this.field4647] = var4;
            this.field4647 = (this.field4647 + 1) % 10;
            if (this.field4650 < 1) {
                this.field4650++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4650; var8++) {
            var6 += this.field4649[(this.field4647 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4650;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 102)
    public class320() {
        this.field4646 = System.nanoTime();
        this.field4645 = System.nanoTime();
    }
}
