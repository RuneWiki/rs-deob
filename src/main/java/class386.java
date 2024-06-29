import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class386 extends class347 {

    @OriginalMember(owner = "client!og", name = "g", descriptor = "J")
    private long field5539 = 0L;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "J")
    private long field5540 = 0L;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    private int field5541 = 1;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "J")
    private long field5543 = 0L;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[J")
    private long[] field5542 = new long[10];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    private int field5544 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)J", line = 8)
    private final long method2333(byte arg0) {
        long var2 = class434.method2591(-19310) * 1000000L;
        long var4 = var2 - this.field5540;
        this.field5540 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5542[this.field5544] = var4;
            this.field5544 = (this.field5544 + 1) % 10;
            if (this.field5541 < 10) {
                this.field5541++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5541; var8++) {
            var6 += this.field5542[(this.field5544 + 10 - var8) % 10];
        }
        if (arg0 != -22) {
            this.field5544 = -37;
        }
        return var6 / (long) this.field5541;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I", line = 44)
    public final int method1958(int arg0, int arg1) {
        if (arg0 != 24) {
            this.method1960(-53);
        }
        long var3 = (long) arg1 * 1000000L;
        this.field5539 += this.method2333((byte) -22);
        if (this.field5543 > this.field5539) {
            class85.method433((this.field5543 - this.field5539) / 1000000L, arg0 ^ 0x72);
            this.field5540 += this.field5543 - this.field5539;
            this.field5539 += this.field5543 - this.field5539;
            this.field5543 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5543 += var3;
            var5++;
        } while (var5 < 10 && this.field5539 > this.field5543);
        if (this.field5543 < this.field5539) {
            this.field5543 = this.field5539;
        }
        return var5;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V", line = 81)
    public final void method1959(int arg0) {
        if (this.field5543 > this.field5539) {
            this.field5539 += this.field5543 - this.field5539;
        }
        this.field5540 = (long) arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)J", line = 95)
    public final long method1960(int arg0) {
        int var2 = -66 / (-arg0 / 33);
        return this.field5539;
    }
}
