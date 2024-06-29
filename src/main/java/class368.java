import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class368 extends class583 {

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "J")
    private long field5345 = 0L;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "J")
    private long field5346 = 0L;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    private int field5348 = 0;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "[J")
    private long[] field5347 = new long[10];

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    private int field5349 = 1;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "J")
    private long field5350 = 0L;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)J", line = 5)
    private final long method2295(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5350;
        this.field5350 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5347[this.field5348] = var4;
            if (this.field5349 < 1) {
                this.field5349++;
            }
            this.field5348 = (this.field5348 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field5349; var8++) {
            var6 += this.field5347[(this.field5348 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5349;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V", line = 111)
    public class368() {
        this.field5345 = System.nanoTime();
        this.field5346 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V", line = 39)
    public final void method600(byte arg0) {
        this.field5350 = 0L;
        int var2 = -87 % ((17 - arg0) / 54);
        if (this.field5346 > this.field5345) {
            this.field5345 += this.field5346 - this.field5345;
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(B)J", line = 51)
    public final long method604(byte arg0) {
        return arg0 < 63 ? -61L : this.field5345;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(JI)I", line = 61)
    public final int method603(long arg0, int arg1) {
        if (arg1 != -21626) {
            return -11;
        } else if (this.field5345 < this.field5346) {
            this.field5350 += this.field5346 - this.field5345;
            this.field5345 += this.field5346 - this.field5345;
            this.field5346 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field5346 += arg0;
                var4++;
            } while (var4 < 10 && this.field5345 > this.field5346);
            if (this.field5346 < this.field5345) {
                this.field5346 = this.field5345;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)J", line = 93)
    public final long method601(byte arg0) {
        this.field5345 += this.method2295(0);
        if (this.field5346 > this.field5345) {
            return (this.field5346 - this.field5345) / 1000000L;
        } else {
            if (arg0 != -96) {
                this.field5346 = 77L;
            }
            return 0L;
        }
    }
}
