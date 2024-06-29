import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class118 extends class669 {

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "J")
    private long field1520 = 0L;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "J")
    private long field1519 = 0L;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    private int field1521 = 0;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[J")
    private long[] field1523 = new long[10];

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    private int field1522 = 1;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "J")
    private long field1524 = 0L;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)J", line = 4)
    public final long method639(int arg0) {
        this.field1520 += this.method642((byte) 40);
        if (arg0 > -96) {
            return -22L;
        } else if (this.field1520 < this.field1519) {
            return (this.field1519 - this.field1520) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(JB)I", line = 21)
    public final int method640(long arg0, byte arg1) {
        int var4 = 121 / ((50 - arg1) / 63);
        if (this.field1519 > this.field1520) {
            this.field1524 += this.field1519 - this.field1520;
            this.field1520 += this.field1519 - this.field1520;
            this.field1519 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1519 += arg0;
        } while (var5 < 10 && this.field1520 > this.field1519);
        if (this.field1520 > this.field1519) {
            this.field1519 = this.field1520;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 53)
    public final void method641(int arg0) {
        this.field1524 = arg0;
        if (this.field1519 > this.field1520) {
            this.field1520 += this.field1519 - this.field1520;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 68)
    public class118() {
        this.field1519 = this.field1520 = jagmisc.nanoTime();
        if (this.field1520 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)J", line = 81)
    private final long method642(byte arg0) {
        if (arg0 != 40) {
            this.field1524 = -1L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1524;
        this.field1524 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1523[this.field1521] = var4;
            if (this.field1522 < 1) {
                this.field1522++;
            }
            this.field1521 = (this.field1521 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1522; var8++) {
            var6 += this.field1523[(this.field1521 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1522;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)J", line = 126)
    public final long method643(int arg0) {
        return arg0 == 26262 ? this.field1520 : 95L;
    }
}
