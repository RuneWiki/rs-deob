import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class101 extends class83 {

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "J")
    private long field1449 = 0L;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "J")
    private long field1448 = 0L;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    private int field1450 = 0;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    private int field1451 = 1;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[J")
    private long[] field1453 = new long[10];

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "J")
    private long field1452 = 0L;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)J", line = 4)
    public final long method41(byte arg0) {
        if (arg0 != 6) {
            this.field1453 = (long[]) null;
        }
        return this.field1448;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)J", line = 19)
    private final long method787(byte arg0) {
        long var2 = 0L;
        long var4 = System.nanoTime();
        if (arg0 > -34) {
            this.field1452 = -33L;
        }
        long var6 = var4 - this.field1452;
        this.field1452 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field1453[this.field1450] = var6;
            this.field1450 = (this.field1450 + 1) % 10;
            if (this.field1451 < 1) {
                this.field1451++;
            }
        }
        for (int var8 = 1; var8 <= this.field1451; var8++) {
            var2 += this.field1453[(this.field1450 + 10 - var8) % 10];
        }
        return var2 / (long) this.field1451;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 104)
    public class101() {
        this.field1448 = System.nanoTime();
        this.field1449 = System.nanoTime();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I", line = 54)
    public final int method43(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg0 >= -29) {
            this.field1450 = -37;
        }
        class184.method1283((long) arg1, 10);
        this.field1448 += this.method787((byte) -46);
        if (this.field1448 < this.field1449) {
            class184.method1283((this.field1449 - this.field1448) / 1000000L, 10);
            this.field1452 += this.field1449 - this.field1448;
            this.field1448 += this.field1449 - this.field1448;
            this.field1449 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1449 += var4;
        } while (var6 < 10 && this.field1449 < this.field1448);
        if (this.field1449 < this.field1448) {
            this.field1449 = this.field1448;
        }
        return var6;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 93)
    public final void method42(boolean arg0) {
        if (this.field1449 > this.field1448) {
            this.field1448 += this.field1449 - this.field1448;
        }
        this.field1452 = 0L;
        if (!arg0) {
            this.method43(87, -79, -44);
        }
    }
}
