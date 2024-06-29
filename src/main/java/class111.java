import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class111 extends class260 {

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "J")
    private long field1502 = 0L;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    private int field1504 = 1;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "J")
    private long field1503 = 0L;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    private int field1507 = 0;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "J")
    private long field1505 = 0L;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[J")
    private long[] field1506 = new long[10];

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 3)
    public final void method266(int arg0) {
        this.field1502 = 0L;
        if (arg0 == -9282 && this.field1505 > this.field1503) {
            this.field1503 += this.field1505 - this.field1503;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)I", line = 21)
    public final int method265(byte arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        int var5 = 111 % ((arg0 + 5) / 37);
        this.field1503 += this.method755(0);
        if (this.field1505 > this.field1503) {
            class52.method411((this.field1505 - this.field1503) / 1000000L, (byte) 108);
            this.field1502 += this.field1505 - this.field1503;
            this.field1503 += this.field1505 - this.field1503;
            this.field1505 += var3;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1505 += var3;
        } while (var6 < 10 && this.field1503 > this.field1505);
        if (this.field1505 < this.field1503) {
            this.field1505 = this.field1503;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)J", line = 70)
    private final long method755(int arg0) {
        long var2 = class465.method2699((byte) 14) * 1000000L;
        long var4 = var2 - this.field1502;
        this.field1502 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1506[this.field1507] = var4;
            if (this.field1504 < 10) {
                this.field1504++;
            }
            this.field1507 = (this.field1507 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field1504; var8++) {
            var6 += this.field1506[(this.field1507 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1504;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)J", line = 101)
    public final long method267(int arg0) {
        if (arg0 < 116) {
            this.method755(57);
        }
        return this.field1503;
    }
}
