import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class119 extends class485 {

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "J")
    private long field1948 = 0L;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "J")
    private long field1947 = 0L;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    private int field1949 = 1;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "[J")
    private long[] field1951 = new long[10];

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    private int field1950 = 0;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "J")
    private long field1952 = 0L;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)J")
    private final long method882(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1952;
        this.field1952 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1951[this.field1950] = var4;
            this.field1950 = (this.field1950 + 1) % 10;
            if (this.field1949 < 1) {
                this.field1949++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1949; var8++) {
            var6 += this.field1951[(this.field1950 + 10 - var8) % 10];
        }
        return arg0 == -6 ? var6 / (long) this.field1949 : 47L;
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)J")
    public final long method883(int arg0) {
        if (arg0 != 10679) {
            this.method882((byte) 125);
        }
        return this.field1948;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (arg0 != -18051) {
            this.field1948 = 77L;
        }
        this.field1952 = 0L;
        if (this.field1947 > this.field1948) {
            this.field1948 += this.field1947 - this.field1948;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)I")
    public final int method885(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field1948 += this.method882((byte) -6);
        if (arg0 >= -4) {
            this.method884(-25);
        }
        if (this.field1947 > this.field1948) {
            class71.method583((this.field1947 - this.field1948) / 1000000L, -97);
            this.field1952 += this.field1947 - this.field1948;
            this.field1948 += this.field1947 - this.field1948;
            this.field1947 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1947 += var3;
            var5++;
        } while (var5 < 10 && this.field1948 > this.field1947);
        if (this.field1948 > this.field1947) {
            this.field1947 = this.field1948;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
    public class119() {
        this.field1948 = System.nanoTime();
        this.field1947 = System.nanoTime();
    }
}
