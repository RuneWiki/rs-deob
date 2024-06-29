import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class649 extends class550 {

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "J")
    private long field9065 = 0L;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "J")
    private long field9066 = 0L;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    private int field9067 = 1;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[J")
    private long[] field9068 = new long[10];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "J")
    private long field9070 = 0L;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    private int field9069 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZJ)I", line = 4)
    public final int method2299(boolean arg0, long arg1) {
        if (!arg0) {
            this.method3719(65);
        }
        if (this.field9065 < this.field9066) {
            this.field9070 += this.field9066 - this.field9065;
            this.field9065 += this.field9066 - this.field9065;
            this.field9066 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field9066 += arg1;
            var4++;
        } while (var4 < 10 && this.field9066 < this.field9065);
        if (this.field9065 > this.field9066) {
            this.field9066 = this.field9065;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)J", line = 37)
    public final long method2302(byte arg0) {
        this.field9065 += this.method3719(0);
        if (this.field9066 <= this.field9065) {
            int var2 = -2 / ((arg0 - 71) / 40);
            return 0L;
        } else {
            return (this.field9066 - this.field9065) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)J", line = 55)
    public final long method2303(byte arg0) {
        int var2 = 23 / ((-arg0 - 70) / 48);
        return this.field9065;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)J", line = 64)
    private final long method3719(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field9070;
        this.field9070 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9068[this.field9069] = var4;
            this.field9069 = (this.field9069 + 1) % 10;
            if (this.field9067 < 1) {
                this.field9067++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9067; var8++) {
            var6 += this.field9068[(this.field9069 - (var8 - 10)) % 10];
        }
        if (arg0 != 0) {
            this.field9065 = -70L;
        }
        return var6 / (long) this.field9067;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V", line = 96)
    public final void method2300(byte arg0) {
        if (arg0 > 100) {
            this.field9070 = 0L;
            if (this.field9066 > this.field9065) {
                this.field9065 += this.field9066 - this.field9065;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 115)
    public class649() {
        this.field9065 = System.nanoTime();
        this.field9066 = System.nanoTime();
    }
}
