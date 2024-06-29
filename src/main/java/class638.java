import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class638 extends class29 {

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "J")
    private long field8847 = 0L;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "J")
    private long field8848 = 0L;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    private int field8850 = 0;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    private int field8851 = 1;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "[J")
    private long[] field8849 = new long[10];

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "J")
    private long field8852 = 0L;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)J")
    private final long method3563(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field8852;
        this.field8852 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8849[this.field8850] = var4;
            if (this.field8851 < 1) {
                this.field8851++;
            }
            this.field8850 = (this.field8850 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field8851; var8++) {
            var6 += this.field8849[(this.field8850 + 10 - var8) % 10];
        }
        return var6 / (long) this.field8851;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)J")
    public final long method284(byte arg0) {
        return arg0 < 31 ? -79L : this.field8847;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
    public final void method287(byte arg0) {
        if (arg0 != -9) {
            this.method287((byte) 60);
        }
        this.field8852 = 0L;
        if (this.field8848 > this.field8847) {
            this.field8847 += this.field8848 - this.field8847;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)I")
    public final int method280(byte arg0, long arg1) {
        if (arg0 != -100) {
            this.method287((byte) 5);
        }
        if (this.field8847 < this.field8848) {
            this.field8852 += this.field8848 - this.field8847;
            this.field8847 += this.field8848 - this.field8847;
            this.field8848 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field8848 += arg1;
        } while (var4 < 10 && this.field8848 < this.field8847);
        if (this.field8847 > this.field8848) {
            this.field8848 = this.field8847;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)J")
    public final long method283(byte arg0) {
        this.field8847 += this.method3563(1);
        if (arg0 <= 116) {
            this.method284((byte) -67);
        }
        return this.field8848 <= this.field8847 ? 0L : (this.field8848 - this.field8847) / 1000000L;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class638() {
        this.field8847 = System.nanoTime();
        this.field8848 = System.nanoTime();
    }
}
