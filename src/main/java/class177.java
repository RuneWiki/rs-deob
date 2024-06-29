import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class177 extends class168 {

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "J")
    private long field2279 = 0L;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "J")
    private long field2280 = 0L;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    private int field2283 = 1;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "[J")
    private long[] field2282 = new long[10];

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "J")
    private long field2284 = 0L;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    private int field2281 = 0;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)J")
    private final long method1031(boolean arg0) {
        if (arg0) {
            this.field2281 = -53;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2284;
        this.field2284 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2282[this.field2281] = var4;
            this.field2281 = (this.field2281 + 1) % 10;
            if (this.field2283 < 1) {
                this.field2283++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2283; var8++) {
            var6 += this.field2282[(this.field2281 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2283;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)J")
    public final long method985(int arg0) {
        if (arg0 != 1) {
            this.method990(-2, -18);
        }
        return this.field2280;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public final void method986(int arg0) {
        if (arg0 != 9) {
            this.method986(-19);
        }
        this.field2284 = 0L;
        if (this.field2279 > this.field2280) {
            this.field2280 += this.field2279 - this.field2280;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I")
    public final int method990(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method985(-12);
        }
        this.field2280 += this.method1031(false);
        long var3 = (long) arg0 * 1000000L;
        if (this.field2279 > this.field2280) {
            class316.method1873((this.field2279 - this.field2280) / 1000000L, false);
            this.field2284 += this.field2279 - this.field2280;
            this.field2280 += this.field2279 - this.field2280;
            this.field2279 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2279 += var3;
        } while (var5 < 10 && this.field2280 > this.field2279);
        if (this.field2279 < this.field2280) {
            this.field2279 = this.field2280;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class177() {
        this.field2280 = System.nanoTime();
        this.field2279 = System.nanoTime();
    }
}
