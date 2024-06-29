import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class398 extends class715 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "J")
    private long field5640 = 0L;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "J")
    private long field5639 = 0L;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "J")
    private long field5641 = 0L;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    private int field5642 = 0;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field5643 = 1;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[J")
    private long[] field5644 = new long[10];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        this.field5641 = 0L;
        if (this.field5639 > this.field5640) {
            this.field5640 += this.field5639 - this.field5640;
        }
        if (arg0) {
            this.field5639 = 111L;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)J")
    public final long method70(byte arg0) {
        if (arg0 < 12) {
            this.method2308(104);
        }
        return this.field5640;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)J")
    private final long method2308(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5641;
        this.field5641 = var2;
        if (arg0 != 27103) {
            return -94L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5644[this.field5642] = var4;
            if (this.field5643 < 1) {
                this.field5643++;
            }
            this.field5642 = (this.field5642 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5643; var8++) {
            var6 += this.field5644[(this.field5642 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5643;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J")
    public final long method68(byte arg0) {
        this.field5640 += this.method2308(27103);
        if (this.field5639 > this.field5640) {
            return (this.field5639 - this.field5640) / 1000000L;
        } else {
            if (arg0 >= -80) {
                this.field5643 = -48;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IJ)I")
    public final int method69(int arg0, long arg1) {
        if (arg0 <= 117) {
            this.field5643 = 14;
        }
        if (this.field5639 > this.field5640) {
            this.field5641 += this.field5639 - this.field5640;
            this.field5640 += this.field5639 - this.field5640;
            this.field5639 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field5639 += arg1;
            var4++;
        } while (var4 < 10 && this.field5639 < this.field5640);
        if (this.field5639 < this.field5640) {
            this.field5639 = this.field5640;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class398() {
        this.field5639 = this.field5640 = jagmisc.nanoTime();
        if (this.field5640 == 0L) {
            throw new RuntimeException();
        }
    }
}
