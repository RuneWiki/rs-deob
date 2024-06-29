import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class259 extends class265 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "J")
    private long field3758 = 0L;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "J")
    private long field3759 = 0L;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    private int field3761 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    private int field3762 = 1;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "[J")
    private long[] field3763 = new long[10];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "J")
    private long field3760 = 0L;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 5)
    public final void method197(int arg0) {
        this.field3760 = 0L;
        int var2 = 35 / ((arg0 - 2) / 59);
        if (this.field3759 > this.field3758) {
            this.field3758 += this.field3759 - this.field3758;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 23)
    public class259() {
        this.field3758 = System.nanoTime();
        this.field3759 = System.nanoTime();
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)J", line = 34)
    public final long method195(int arg0) {
        if (arg0 != 0) {
            this.method1790((byte) -33);
        }
        return this.field3758;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J", line = 46)
    private final long method1790(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3760;
        this.field3760 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3763[this.field3761] = var4;
            this.field3761 = (this.field3761 + 1) % 10;
            if (this.field3762 < 1) {
                this.field3762++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3762; var8++) {
            var6 += this.field3763[(this.field3761 + 10 - var8) % 10];
        }
        if (arg0 < 126) {
            this.field3759 = -33L;
        }
        return var6 / (long) this.field3762;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I", line = 87)
    public final int method198(int arg0, int arg1, int arg2) {
        if (arg1 < 91) {
            this.method1790((byte) -20);
        }
        class177.method1299((byte) 64, (long) arg0);
        long var4 = (long) arg2 * 1000000L;
        this.field3758 += this.method1790((byte) 127);
        if (this.field3759 > this.field3758) {
            class177.method1299((byte) 64, (this.field3759 - this.field3758) / 1000000L);
            this.field3760 += this.field3759 - this.field3758;
            this.field3758 += this.field3759 - this.field3758;
            this.field3759 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field3759 += var4;
        } while (var6 < 10 && this.field3759 < this.field3758);
        if (this.field3758 > this.field3759) {
            this.field3759 = this.field3758;
        }
        return var6;
    }
}
