import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class153 extends class470 {

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "J")
    private long field2266 = 0L;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
    private long field2267 = 0L;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    private int field2269 = 1;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "J")
    private long field2270 = 0L;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[J")
    private long[] field2271 = new long[10];

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    private int field2268 = 0;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)J", line = 5)
    private final long method992(byte arg0) {
        long var2 = System.nanoTime();
        if (arg0 > -63) {
            return 88L;
        }
        long var4 = var2 - this.field2270;
        this.field2270 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2271[this.field2268] = var4;
            this.field2268 = (this.field2268 + 1) % 10;
            if (this.field2269 < 1) {
                this.field2269++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2269; var8++) {
            var6 += this.field2271[(this.field2268 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2269;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)J", line = 39)
    public final long method843(byte arg0) {
        int var2 = -113 % ((-arg0 - 39) / 51);
        return this.field2266;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V", line = 48)
    public final void method841(byte arg0) {
        this.field2270 = 0L;
        if (this.field2267 > this.field2266) {
            this.field2266 += this.field2267 - this.field2266;
        }
        int var2 = -107 % ((arg0 + 65) / 47);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 103)
    public class153() {
        this.field2266 = System.nanoTime();
        this.field2267 = System.nanoTime();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I", line = 65)
    public final int method842(byte arg0, int arg1) {
        if (arg0 != 101) {
            this.method843((byte) -90);
        }
        long var3 = (long) arg1 * 1000000L;
        this.field2266 += this.method992((byte) -103);
        if (this.field2267 > this.field2266) {
            class246.method1659((byte) 117, (this.field2267 - this.field2266) / 1000000L);
            this.field2270 += this.field2267 - this.field2266;
            this.field2266 += this.field2267 - this.field2266;
            this.field2267 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2267 += var3;
        } while (var5 < 10 && this.field2267 < this.field2266);
        if (this.field2267 < this.field2266) {
            this.field2267 = this.field2266;
        }
        return var5;
    }
}
