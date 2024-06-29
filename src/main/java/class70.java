import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class70 extends class75 {

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "J")
    private long field805 = 0L;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "J")
    private long field806 = 0L;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "[J")
    private long[] field807 = new long[10];

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "J")
    private long field810 = 0L;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    private int field809 = 1;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    private int field808 = 0;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)J", line = 5)
    public final long method399(int arg0) {
        return arg0 == 1 ? this.field806 : 115L;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V", line = 16)
    public final void method400(int arg0) {
        this.field810 = 0L;
        if (arg0 <= -83 && this.field805 > this.field806) {
            this.field806 += this.field805 - this.field806;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 99)
    public class70() {
        this.field806 = System.nanoTime();
        this.field805 = System.nanoTime();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)I", line = 33)
    public final int method401(byte arg0, int arg1) {
        if (arg0 != -51) {
            this.method399(14);
        }
        this.field806 += this.method402(0);
        long var3 = (long) arg1 * 1000000L;
        if (this.field806 < this.field805) {
            class150.method907((this.field805 - this.field806) / 1000000L, (byte) -32);
            this.field810 += this.field805 - this.field806;
            this.field806 += this.field805 - this.field806;
            this.field805 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field805 += var3;
        } while (var5 < 10 && this.field805 < this.field806);
        if (this.field806 > this.field805) {
            this.field805 = this.field806;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)J", line = 69)
    private final long method402(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field810;
        this.field810 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field807[this.field808] = var4;
            this.field808 = (this.field808 + 1) % 10;
            if (this.field809 < 1) {
                this.field809++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field809; var8++) {
            var6 += this.field807[(this.field808 + 10 - var8) % 10];
        }
        return var6 / (long) this.field809;
    }
}
