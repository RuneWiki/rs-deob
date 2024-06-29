import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class425 extends class30 {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
    private long field6128 = 0L;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "J")
    private long field6129 = 0L;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    private int field6131 = 1;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "J")
    private long field6130 = 0L;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[J")
    private long[] field6133 = new long[10];

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    private int field6132 = 0;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)J", line = 3)
    public final long method303(byte arg0) {
        int var2 = -55 / ((arg0 + 71) / 32);
        return this.field6128;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J", line = 12)
    private final long method2615(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != 1687) {
            this.method303((byte) -57);
        }
        long var4 = var2 - this.field6130;
        this.field6130 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6133[this.field6132] = var4;
            this.field6132 = (this.field6132 + 1) % 10;
            if (this.field6131 < 1) {
                this.field6131++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6131; var8++) {
            var6 += this.field6133[(this.field6132 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6131;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 47)
    public final void method302(byte arg0) {
        this.field6130 = 0L;
        if (this.field6129 > this.field6128) {
            this.field6128 += this.field6129 - this.field6128;
        }
        if (arg0 > -20) {
            this.method2615(53);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 103)
    public class425() {
        this.field6129 = this.field6128 = jagmisc.nanoTime();
        if (this.field6128 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I", line = 64)
    public final int method301(int arg0, int arg1) {
        if (arg0 != -9862) {
            this.field6133 = null;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field6128 += this.method2615(1687);
        if (this.field6128 < this.field6129) {
            class418.method2587(false, (this.field6129 - this.field6128) / 1000000L);
            this.field6130 += this.field6129 - this.field6128;
            this.field6128 += this.field6129 - this.field6128;
            this.field6129 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6129 += var3;
            var5++;
        } while (var5 < 10 && this.field6128 > this.field6129);
        if (this.field6128 > this.field6129) {
            this.field6129 = this.field6128;
        }
        return var5;
    }
}
