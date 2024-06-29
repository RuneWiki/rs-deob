import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class606 extends class296 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "J")
    private long field8025 = 0L;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "J")
    private long field8026 = 0L;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[J")
    private long[] field8028 = new long[10];

    @OriginalMember(owner = "client!og", name = "j", descriptor = "J")
    private long field8029 = 0L;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    private int field8027 = 1;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    private int field8030 = 0;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)J")
    public final long method1273(int arg0) {
        this.field8026 += this.method3328(10);
        if (this.field8025 > this.field8026) {
            return (this.field8025 - this.field8026) / 1000000L;
        } else if (arg0 < 7) {
            return 69L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZJ)I")
    public final int method1271(boolean arg0, long arg1) {
        if (arg0) {
            this.method1271(true, -16L);
        }
        if (this.field8026 < this.field8025) {
            this.field8029 += this.field8025 - this.field8026;
            this.field8026 += this.field8025 - this.field8026;
            this.field8025 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field8025 += arg1;
        } while (var4 < 10 && this.field8026 > this.field8025);
        if (this.field8025 < this.field8026) {
            this.field8025 = this.field8026;
        }
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)J")
    private final long method3328(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field8029;
        this.field8029 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8028[this.field8030] = var4;
            if (this.field8027 < 1) {
                this.field8027++;
            }
            this.field8030 = (this.field8030 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field8027; var8++) {
            var6 += this.field8028[(this.field8030 + 10 - var8) % 10];
        }
        if (arg0 != 10) {
            this.field8026 = 94L;
        }
        return var6 / (long) this.field8027;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public final void method1269(int arg0) {
        int var2 = -124 / ((arg0 - 79) / 39);
        this.field8029 = 0L;
        if (this.field8026 < this.field8025) {
            this.field8026 += this.field8025 - this.field8026;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)J")
    public final long method1272(int arg0) {
        return arg0 == -1 ? this.field8026 : 75L;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class606() {
        this.field8026 = System.nanoTime();
        this.field8025 = System.nanoTime();
    }
}
