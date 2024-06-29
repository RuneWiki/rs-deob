import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class309 extends class148 {

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "J")
    private long field4597 = 0L;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "J")
    private long field4596 = 0L;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "[J")
    private long[] field4598 = new long[10];

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    private int field4600 = 1;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "J")
    private long field4599 = 0L;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    private int field4601 = 0;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)J", line = 3)
    public final long method1026(int arg0) {
        return arg0 == 0 ? this.field4597 : 36L;
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)J", line = 13)
    private final long method2023(byte arg0) {
        if (arg0 != -114) {
            return -90L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4599;
        this.field4599 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4598[this.field4601] = var4;
            this.field4601 = (this.field4601 + 1) % 10;
            if (this.field4600 < 1) {
                this.field4600++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4600; var8++) {
            var6 += this.field4598[(this.field4601 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4600;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 46)
    public final void method1020(byte arg0) {
        int var2 = 66 % ((arg0 - 13) / 45);
        this.field4599 = 0L;
        if (this.field4597 < this.field4596) {
            this.field4597 += this.field4596 - this.field4597;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(JB)I", line = 59)
    public final int method1021(long arg0, byte arg1) {
        if (arg1 != -14) {
            return 83;
        } else if (this.field4597 < this.field4596) {
            this.field4599 += this.field4596 - this.field4597;
            this.field4597 += this.field4596 - this.field4597;
            this.field4596 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field4596 += arg0;
            } while (var4 < 10 && this.field4596 < this.field4597);
            if (this.field4597 > this.field4596) {
                this.field4596 = this.field4597;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)J", line = 92)
    public final long method1025(byte arg0) {
        this.field4597 += this.method2023((byte) -114);
        if (this.field4596 > this.field4597) {
            return (this.field4596 - this.field4597) / 1000000L;
        } else {
            int var2 = -90 / ((-arg0 - 33) / 49);
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V", line = 114)
    public class309() {
        this.field4596 = this.field4597 = jagmisc.nanoTime();
        if (this.field4597 == 0L) {
            throw new RuntimeException();
        }
    }
}
