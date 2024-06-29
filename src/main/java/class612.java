import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class612 extends class47 {

    @OriginalMember(owner = "client!et", name = "d", descriptor = "J")
    private long field8487 = 0L;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "J")
    private long field8488 = 0L;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "[J")
    private long[] field8489 = new long[10];

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    private int field8491 = 0;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    private int field8492 = 1;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "J")
    private long field8490 = 0L;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)I")
    public final int method247(int arg0, long arg1) {
        if (arg0 != 3) {
            this.field8490 = -118L;
        }
        if (this.field8488 < this.field8487) {
            this.field8490 += this.field8487 - this.field8488;
            this.field8488 += this.field8487 - this.field8488;
            this.field8487 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field8487 += arg1;
            var4++;
        } while (var4 < 10 && this.field8488 > this.field8487);
        if (this.field8487 < this.field8488) {
            this.field8487 = this.field8488;
        }
        return var4;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)J")
    public final long method250(int arg0) {
        return arg0 >= -33 ? 3L : this.field8488;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public final void method249(boolean arg0) {
        if (!arg0) {
            this.field8490 = 0L;
            if (this.field8488 < this.field8487) {
                this.field8488 += this.field8487 - this.field8488;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)J")
    private final long method3391(byte arg0) {
        if (arg0 != 22) {
            this.method251(11);
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field8490;
        this.field8490 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8489[this.field8491] = var4;
            this.field8491 = (this.field8491 + 1) % 10;
            if (this.field8492 < 1) {
                this.field8492++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field8492; var8++) {
            var6 += this.field8489[(this.field8491 + 10 - var8) % 10];
        }
        return var6 / (long) this.field8492;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)J")
    public final long method251(int arg0) {
        this.field8488 += this.method3391((byte) 22);
        int var2 = -101 % ((arg0 + 75) / 47);
        return this.field8487 > this.field8488 ? (this.field8487 - this.field8488) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class612() {
        this.field8488 = System.nanoTime();
        this.field8487 = System.nanoTime();
    }
}
