import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class309 extends class360 {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "J")
    private long field4651 = 0L;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
    private long field4652 = 0L;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[J")
    private long[] field4653 = new long[10];

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    private int field4655 = 0;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "J")
    private long field4656 = 0L;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field4654 = 1;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 <= 84) {
            this.field4653 = (long[]) null;
        }
        if (this.field4652 < this.field4651) {
            this.field4652 += this.field4651 - this.field4652;
        }
        this.field4656 = 0L;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public final int method151(int arg0, int arg1) {
        int var3 = 82 / ((15 - arg0) / 43);
        this.field4652 += this.method1887(0);
        long var4 = (long) arg1 * 1000000L;
        if (this.field4651 > this.field4652) {
            class109.method674((byte) 99, (this.field4651 - this.field4652) / 1000000L);
            this.field4656 += this.field4651 - this.field4652;
            this.field4652 += this.field4651 - this.field4652;
            this.field4651 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field4651 += var4;
        } while (var6 < 10 && this.field4651 < this.field4652);
        if (this.field4651 < this.field4652) {
            this.field4651 = this.field4652;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)J")
    public final long method150(byte arg0) {
        if (arg0 <= 121) {
            this.field4656 = 100L;
        }
        return this.field4652;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)J")
    private final long method1887(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4656;
        this.field4656 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4653[this.field4655] = var4;
            this.field4655 = (this.field4655 + 1) % 10;
            if (this.field4654 < 1) {
                this.field4654++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field4654; var8++) {
            var6 += this.field4653[(this.field4655 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4654;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class309() {
        this.field4652 = System.nanoTime();
        this.field4651 = System.nanoTime();
    }
}
