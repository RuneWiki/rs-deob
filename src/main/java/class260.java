import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class260 extends class215 {

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    private int field4208 = 1;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "J")
    private long field4209 = 0L;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "J")
    private long field4210 = 0L;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    private int field4212 = 0;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "[J")
    private long[] field4211 = new long[10];

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "J")
    private long field4213 = 0L;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J", line = 4)
    public final long method822(int arg0) {
        if (arg0 != 32234) {
            this.method819(43, 60, 44);
        }
        return this.field4213;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 21)
    public final void method821(byte arg0) {
        int var2 = 9 / ((arg0 + 74) / 47);
        if (this.field4213 < this.field4209) {
            this.field4213 += this.field4209 - this.field4213;
        }
        this.field4210 = 0L;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)J", line = 42)
    private final long method1800(int arg0) {
        long var2 = class306.method2102(-289) * 1000000L;
        long var4 = var2 - this.field4210;
        this.field4210 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4211[this.field4212] = var4;
            if (this.field4208 < 10) {
                this.field4208++;
            }
            this.field4212 = (this.field4212 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != 14292) {
            this.field4213 = -32L;
        }
        for (int var8 = 1; var8 <= this.field4208; var8++) {
            var6 += this.field4211[(this.field4212 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4208;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)I", line = 74)
    public final int method819(int arg0, int arg1, int arg2) {
        class142.method1149((long) arg0, (byte) 127);
        this.field4213 += this.method1800(14292);
        if (arg2 >= -83) {
            return -20;
        }
        long var4 = (long) arg1 * 1000000L;
        if (this.field4213 < this.field4209) {
            class142.method1149((this.field4209 - this.field4213) / 1000000L, (byte) 125);
            this.field4210 += this.field4209 - this.field4213;
            this.field4213 += this.field4209 - this.field4213;
            this.field4209 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field4209 += var4;
        } while (var6 < 10 && this.field4213 > this.field4209);
        if (this.field4213 > this.field4209) {
            this.field4209 = this.field4213;
        }
        return var6;
    }
}
