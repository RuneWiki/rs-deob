import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class225 extends class485 {

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "J")
    private long field3202 = 0L;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    private int field3204 = 1;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "J")
    private long field3203 = 0L;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "[J")
    private long[] field3205 = new long[10];

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "J")
    private long field3206 = 0L;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    private int field3201 = 0;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)J")
    private final long method1480(int arg0) {
        long var2 = class211.method1419(arg0 + 12911) * 1000000L;
        long var4 = var2 - this.field3206;
        this.field3206 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3205[this.field3201] = var4;
            this.field3201 = (this.field3201 + 1) % 10;
            if (this.field3204 < 10) {
                this.field3204++;
            }
        }
        long var6 = 0L;
        if (arg0 != 10) {
            this.method883(-11);
        }
        for (int var8 = 1; var8 <= this.field3204; var8++) {
            var6 += this.field3205[(this.field3201 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3204;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
    public final int method885(int arg0, int arg1) {
        if (arg0 > -4) {
            return 17;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field3203 += this.method1480(10);
        if (this.field3202 > this.field3203) {
            class71.method583((this.field3202 - this.field3203) / 1000000L, -119);
            this.field3206 += this.field3202 - this.field3203;
            this.field3203 += this.field3202 - this.field3203;
            this.field3202 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3202 += var3;
        } while (var5 < 10 && this.field3202 < this.field3203);
        if (this.field3203 > this.field3202) {
            this.field3202 = this.field3203;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (arg0 != -18051) {
            this.method884(-75);
        }
        this.field3206 = 0L;
        if (this.field3202 > this.field3203) {
            this.field3203 += this.field3202 - this.field3203;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)J")
    public final long method883(int arg0) {
        return arg0 == 10679 ? this.field3203 : -82L;
    }
}
