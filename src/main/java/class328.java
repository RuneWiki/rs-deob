import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class328 extends class201 {

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "J")
    private long field4671 = 0L;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "J")
    private long field4672 = 0L;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "J")
    private long field4673 = 0L;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "[J")
    private long[] field4674 = new long[10];

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    private int field4675 = 1;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field4676 = 0;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)J")
    public final long method1288(byte arg0) {
        if (arg0 == 81) {
            this.field4672 += this.method1995((byte) -126);
            return this.field4672 >= this.field4671 ? 0L : (this.field4671 - this.field4672) / 1000000L;
        } else {
            return 24L;
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)J")
    private final long method1995(byte arg0) {
        int var2 = -5 % ((-arg0 - 69) / 39);
        long var3 = System.nanoTime();
        long var5 = var3 - this.field4673;
        this.field4673 = var3;
        if (var5 > -5000000000L && var5 < 5000000000L) {
            this.field4674[this.field4676] = var5;
            if (this.field4675 < 1) {
                this.field4675++;
            }
            this.field4676 = (this.field4676 + 1) % 10;
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field4675; var9++) {
            var7 += this.field4674[(this.field4676 + 10 - var9) % 10];
        }
        return var7 / (long) this.field4675;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BJ)I")
    public final int method1289(byte arg0, long arg1) {
        if (arg0 != -48) {
            return -6;
        } else if (this.field4672 < this.field4671) {
            this.field4673 += this.field4671 - this.field4672;
            this.field4672 += this.field4671 - this.field4672;
            this.field4671 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field4671 += arg1;
                var4++;
            } while (var4 < 10 && this.field4672 > this.field4671);
            if (this.field4671 < this.field4672) {
                this.field4671 = this.field4672;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)J")
    public final long method1285(byte arg0) {
        if (arg0 != -9) {
            this.field4675 = -98;
        }
        return this.field4672;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
    public final void method1286(boolean arg0) {
        this.field4673 = 0L;
        if (!arg0) {
            this.method1285((byte) 53);
        }
        if (this.field4671 > this.field4672) {
            this.field4672 += this.field4671 - this.field4672;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    public class328() {
        this.field4672 = System.nanoTime();
        this.field4671 = System.nanoTime();
    }
}
