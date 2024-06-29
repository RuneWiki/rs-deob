import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class200 extends class453 {

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "J")
    private long field3006 = 0L;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "J")
    private long field3007 = 0L;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "J")
    private long field3008 = 0L;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "[J")
    private long[] field3009 = new long[10];

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    private int field3010 = 0;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    private int field3011 = 1;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)J")
    private final long method1378(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3008;
        this.field3008 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3009[this.field3010] = var4;
            if (this.field3011 < 1) {
                this.field3011++;
            }
            this.field3010 = (this.field3010 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field3011; var8++) {
            var6 += this.field3009[(this.field3010 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3011;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field3008 = 0L;
        if (this.field3006 > this.field3007) {
            this.field3007 += this.field3006 - this.field3007;
        }
        int var2 = 25 % ((arg0 + 28) / 40);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)J")
    public final long method1(int arg0) {
        this.field3007 += this.method1378(arg0);
        return this.field3006 > this.field3007 ? (this.field3006 - this.field3007) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)J")
    public final long method5(int arg0) {
        if (arg0 != 56) {
            this.method5(-74);
        }
        return this.field3007;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class200() {
        this.field3006 = this.field3007 = jagmisc.nanoTime();
        if (this.field3007 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(JZ)I")
    public final int method4(long arg0, boolean arg1) {
        if (arg1) {
            this.field3009 = null;
        }
        if (this.field3006 > this.field3007) {
            this.field3008 += this.field3006 - this.field3007;
            this.field3007 += this.field3006 - this.field3007;
            this.field3006 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field3006 += arg0;
        } while (var4 < 10 && this.field3007 > this.field3006);
        if (this.field3007 > this.field3006) {
            this.field3006 = this.field3007;
        }
        return var4;
    }
}
