import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class285 extends class183 {

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
    private long field4727 = 0L;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "J")
    private long field4726 = 0L;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "J")
    private long field4728 = 0L;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "[J")
    private long[] field4729 = new long[10];

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    private int field4730 = 0;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    private int field4731 = 1;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
    public final long method417(int arg0) {
        if (arg0 != 0) {
            this.field4731 = 38;
        }
        return this.field4727;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
    public final int method420(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method1992(124);
        }
        long var4 = (long) arg2 * 1000000L;
        class28.method182((long) arg0, true);
        this.field4727 += this.method1992(-59);
        if (this.field4726 > this.field4727) {
            class28.method182((this.field4726 - this.field4727) / 1000000L, true);
            this.field4728 += this.field4726 - this.field4727;
            this.field4727 += this.field4726 - this.field4727;
            this.field4726 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field4726 += var4;
            var6++;
        } while (var6 < 10 && this.field4726 < this.field4727);
        if (this.field4726 < this.field4727) {
            this.field4726 = this.field4727;
        }
        return var6;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)J")
    private final long method1992(int arg0) {
        if (arg0 > -13) {
            this.method417(117);
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4728;
        this.field4728 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4729[this.field4730] = var4;
            this.field4730 = (this.field4730 + 1) % 10;
            if (this.field4731 < 1) {
                this.field4731++;
            }
        }
        for (int var8 = 1; var8 <= this.field4731; var8++) {
            var6 += this.field4729[(this.field4730 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4731;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class285() {
        this.field4727 = System.nanoTime();
        this.field4726 = System.nanoTime();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method419(boolean arg0) {
        if (this.field4727 < this.field4726) {
            this.field4727 += this.field4726 - this.field4727;
        }
        if (!arg0) {
            this.field4731 = -53;
        }
        this.field4728 = 0L;
    }
}
