import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class121 extends class391 {

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "J")
    private long field1477 = 0L;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "J")
    private long field1476 = 0L;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "[J")
    private long[] field1479 = new long[10];

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    private int field1480 = 1;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "J")
    private long field1481 = 0L;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    private int field1478 = 0;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)J", line = 3)
    public final long method798(int arg0) {
        return arg0 == 2 ? this.field1477 : 77L;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 15)
    public final void method799(byte arg0) {
        int var2 = -17 % ((-arg0 - 51) / 47);
        this.field1481 = 0L;
        if (this.field1476 > this.field1477) {
            this.field1477 += this.field1476 - this.field1477;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)J", line = 28)
    public final long method800(boolean arg0) {
        if (arg0) {
            this.method802(52L, 28);
        }
        this.field1477 += this.method801((byte) -116);
        return this.field1476 > this.field1477 ? (this.field1476 - this.field1477) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)J", line = 44)
    private final long method801(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1481;
        this.field1481 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1479[this.field1478] = var4;
            if (this.field1480 < 1) {
                this.field1480++;
            }
            this.field1478 = (this.field1478 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1480; var8++) {
            var6 += this.field1479[(this.field1478 + 10 - var8) % 10];
        }
        if (arg0 != -116) {
            this.field1481 = 16L;
        }
        return var6 / (long) this.field1480;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)I", line = 77)
    public final int method802(long arg0, int arg1) {
        if (arg1 > -62) {
            this.method798(-112);
        }
        if (this.field1477 < this.field1476) {
            this.field1481 += this.field1476 - this.field1477;
            this.field1477 += this.field1476 - this.field1477;
            this.field1476 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field1476 += arg0;
            var4++;
        } while (var4 < 10 && this.field1477 > this.field1476);
        if (this.field1477 > this.field1476) {
            this.field1476 = this.field1477;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V", line = 115)
    public class121() {
        this.field1476 = this.field1477 = jagmisc.nanoTime();
        if (this.field1477 == 0L) {
            throw new RuntimeException();
        }
    }
}
