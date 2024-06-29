import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class117 extends class464 {

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "J")
    private long field1622 = 0L;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "J")
    private long field1623 = 0L;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    private int field1625 = 0;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    private int field1624 = 1;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "[J")
    private long[] field1626 = new long[10];

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "J")
    private long field1627 = 0L;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
    public final int method170(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 <= 88) {
            this.method170(50, 86);
        }
        this.field1622 += this.method750(94);
        if (this.field1622 < this.field1623) {
            class208.method1464((byte) -94, (this.field1623 - this.field1622) / 1000000L);
            this.field1627 += this.field1623 - this.field1622;
            this.field1622 += this.field1623 - this.field1622;
            this.field1623 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1623 += var3;
        } while (var5 < 10 && this.field1623 < this.field1622);
        if (this.field1622 > this.field1623) {
            this.field1623 = this.field1622;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field1627 = 0L;
        if (arg0 != 112) {
            this.method169(true);
        }
        if (this.field1622 < this.field1623) {
            this.field1622 += this.field1623 - this.field1622;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)J")
    public final long method169(boolean arg0) {
        return arg0 ? -46L : this.field1622;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class117() {
        this.field1622 = System.nanoTime();
        this.field1623 = System.nanoTime();
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)J")
    private final long method750(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1627;
        this.field1627 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1626[this.field1625] = var4;
            this.field1625 = (this.field1625 + 1) % 10;
            if (this.field1624 < 1) {
                this.field1624++;
            }
        }
        if (arg0 < 93) {
            return 124L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1624; var8++) {
            var6 += this.field1626[(this.field1625 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1624;
    }
}
