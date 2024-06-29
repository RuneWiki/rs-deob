import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class246 extends class266 {

    @OriginalMember(owner = "client!br", name = "i", descriptor = "J")
    private long field3647 = 0L;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "J")
    private long field3648 = 0L;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    private int field3650 = 1;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "J")
    private long field3651 = 0L;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    private int field3649 = 0;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[J")
    private long[] field3652 = new long[10];

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)I")
    public final int method954(int arg0, boolean arg1) {
        if (!arg1) {
            return -9;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field3648 += this.method1546((byte) 109);
        if (this.field3647 > this.field3648) {
            class111.method713(55, (this.field3647 - this.field3648) / 1000000L);
            this.field3651 += this.field3647 - this.field3648;
            this.field3648 += this.field3647 - this.field3648;
            this.field3647 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3647 += var3;
        } while (var5 < 10 && this.field3647 < this.field3648);
        if (this.field3647 < this.field3648) {
            this.field3647 = this.field3648;
        }
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)J")
    private final long method1546(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3651;
        this.field3651 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3652[this.field3649] = var4;
            this.field3649 = (this.field3649 + 1) % 10;
            if (this.field3650 < 1) {
                this.field3650++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3650; var8++) {
            var6 += this.field3652[(this.field3649 - (var8 - 10)) % 10];
        }
        if (arg0 <= 73) {
            this.method955(true);
        }
        return var6 / (long) this.field3650;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V")
    public final void method955(boolean arg0) {
        if (this.field3647 > this.field3648) {
            this.field3648 += this.field3647 - this.field3648;
        }
        this.field3651 = 0L;
        if (arg0) {
            this.field3647 = 45L;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)J")
    public final long method957(byte arg0) {
        if (arg0 >= -8) {
            this.field3648 = -32L;
        }
        return this.field3648;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
    public class246() {
        this.field3648 = System.nanoTime();
        this.field3647 = System.nanoTime();
    }
}
