import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class192 extends class96 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "J")
    private long field2750 = 0L;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "J")
    private long field2751 = 0L;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    private int field2752 = 1;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "J")
    private long field2754 = 0L;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "[J")
    private long[] field2755 = new long[10];

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    private int field2753 = 0;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)J", line = 4)
    public final long method705(byte arg0) {
        return arg0 <= 44 ? 97L : this.field2751;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V", line = 104)
    public class192() {
        this.field2751 = System.nanoTime();
        this.field2750 = System.nanoTime();
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)J", line = 19)
    private final long method1205(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2754;
        if (arg0 != 26820) {
            this.method1205(71);
        }
        this.field2754 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2755[this.field2753] = var4;
            this.field2753 = (this.field2753 + 1) % 10;
            if (this.field2752 < 1) {
                this.field2752++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2752; var8++) {
            var6 += this.field2755[(this.field2753 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2752;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 52)
    public final void method709(int arg0) {
        if (arg0 == 64) {
            this.field2754 = 0L;
            if (this.field2751 < this.field2750) {
                this.field2751 += this.field2750 - this.field2751;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I", line = 71)
    public final int method708(int arg0, int arg1) {
        this.field2751 += this.method1205(26820);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 != -1) {
            return -39;
        } else if (this.field2750 > this.field2751) {
            class157.method1046(-128, (this.field2750 - this.field2751) / 1000000L);
            this.field2754 += this.field2750 - this.field2751;
            this.field2751 += this.field2750 - this.field2751;
            this.field2750 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                var5++;
                this.field2750 += var3;
            } while (var5 < 10 && this.field2750 < this.field2751);
            if (this.field2751 > this.field2750) {
                this.field2750 = this.field2751;
            }
            return var5;
        }
    }
}
