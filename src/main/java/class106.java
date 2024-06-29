import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class106 extends class464 {

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
    private long field1537 = 0L;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[J")
    private long[] field1540 = new long[10];

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    private int field1538 = 0;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "J")
    private long field1539 = 0L;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "J")
    private long field1542 = 0L;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    private int field1541 = 1;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field1537 = 0L;
        if (arg0 != 112) {
            this.field1540 = null;
        }
        if (this.field1539 < this.field1542) {
            this.field1539 += this.field1542 - this.field1539;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)J")
    public final long method169(boolean arg0) {
        return arg0 ? -116L : this.field1539;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)J")
    private final long method711(byte arg0) {
        long var2 = class246.method1705((byte) 28) * 1000000L;
        if (arg0 <= 53) {
            this.method168(113);
        }
        long var4 = var2 - this.field1537;
        this.field1537 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1540[this.field1538] = var4;
            if (this.field1541 < 10) {
                this.field1541++;
            }
            this.field1538 = (this.field1538 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1541; var8++) {
            var6 += this.field1540[(this.field1538 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1541;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
    public final int method170(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field1539 += this.method711((byte) 99);
        if (arg0 < 88) {
            this.method169(true);
        }
        if (this.field1539 < this.field1542) {
            class208.method1464((byte) -100, (this.field1542 - this.field1539) / 1000000L);
            this.field1537 += this.field1542 - this.field1539;
            this.field1539 += this.field1542 - this.field1539;
            this.field1542 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1542 += var3;
        } while (var5 < 10 && this.field1539 > this.field1542);
        if (this.field1542 < this.field1539) {
            this.field1542 = this.field1539;
        }
        return var5;
    }
}
