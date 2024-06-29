import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class129 extends class57 {

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    private int field1351 = 0;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
    private long field1352 = 0L;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    private int field1353 = 1;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "J")
    private long field1356 = 0L;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[J")
    private long[] field1355 = new long[10];

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "J")
    private long field1354 = 0L;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)J")
    public final long method311(byte arg0) {
        this.field1352 += this.method813((byte) -95);
        if (arg0 <= 45) {
            this.method311((byte) -29);
        }
        return this.field1352 < this.field1354 ? (this.field1354 - this.field1352) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method310(byte arg0) {
        if (this.field1354 > this.field1352) {
            this.field1352 += this.field1354 - this.field1352;
        }
        this.field1356 = 0L;
        int var2 = -83 / ((arg0 + 62) / 49);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BJ)I")
    public final int method309(byte arg0, long arg1) {
        int var4 = -71 % ((-arg0 - 71) / 51);
        if (this.field1352 < this.field1354) {
            this.field1356 += this.field1354 - this.field1352;
            this.field1352 += this.field1354 - this.field1352;
            this.field1354 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1354 += arg1;
        } while (var5 < 10 && this.field1354 < this.field1352);
        if (this.field1352 > this.field1354) {
            this.field1354 = this.field1352;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)J")
    public final long method312(int arg0) {
        if (arg0 < 106) {
            this.field1355 = null;
        }
        return this.field1352;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)J")
    private final long method813(byte arg0) {
        long var2 = class652.method3700(-1) * 1000000L;
        long var4 = var2 - this.field1356;
        this.field1356 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1355[this.field1351] = var4;
            this.field1351 = (this.field1351 + 1) % 10;
            if (this.field1353 < 10) {
                this.field1353++;
            }
        }
        long var6 = 0L;
        if (arg0 != -95) {
            this.method309((byte) -51, -115L);
        }
        for (int var8 = 1; var8 <= this.field1353; var8++) {
            var6 += this.field1355[(this.field1351 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1353;
    }
}
