import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class210 extends class68 {

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
    private long field3115 = 0L;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "J")
    private long field3116 = 0L;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field3117 = 1;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    private int field3118 = 0;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "J")
    private long field3119 = 0L;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[J")
    private long[] field3120 = new long[10];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)J")
    public final long method382(byte arg0) {
        if (arg0 != 97) {
            this.method384((byte) -123, 24, 46);
        }
        return this.field3115;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)J")
    private final long method1304(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 <= 32) {
            return -39L;
        }
        long var4 = var2 - this.field3119;
        long var6 = 0L;
        this.field3119 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3120[this.field3118] = var4;
            if (this.field3117 < 1) {
                this.field3117++;
            }
            this.field3118 = (this.field3118 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field3117; var8++) {
            var6 += this.field3120[(this.field3118 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3117;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class210() {
        this.field3116 = this.field3115 = jagmisc.nanoTime();
        if (this.field3115 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method381(byte arg0) {
        this.field3119 = 0L;
        if (this.field3116 > this.field3115) {
            this.field3115 += this.field3116 - this.field3115;
        }
        if (arg0 < 34) {
            this.method384((byte) -66, 8, -50);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)I")
    public final int method384(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        int var6 = -98 / ((-arg0 - 44) / 59);
        class17.method116(98, (long) arg1);
        this.field3115 += this.method1304(85);
        if (this.field3115 < this.field3116) {
            class17.method116(107, (this.field3116 - this.field3115) / 1000000L);
            this.field3119 += this.field3116 - this.field3115;
            this.field3115 += this.field3116 - this.field3115;
            this.field3116 += var4;
            return 1;
        }
        int var7 = 0;
        do {
            var7++;
            this.field3116 += var4;
        } while (var7 < 10 && this.field3116 < this.field3115);
        if (this.field3116 < this.field3115) {
            this.field3116 = this.field3115;
        }
        return var7;
    }
}
