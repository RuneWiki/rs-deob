import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class314 extends class75 {

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "J")
    private long field4490 = 0L;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "J")
    private long field4489 = 0L;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    private int field4491 = 0;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    private int field4488 = 1;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "[J")
    private long[] field4492 = new long[10];

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "J")
    private long field4493 = 0L;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)J")
    public final long method399(int arg0) {
        if (arg0 != 1) {
            this.field4493 = -84L;
        }
        return this.field4490;
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V")
    public final void method400(int arg0) {
        if (this.field4490 < this.field4493) {
            this.field4490 += this.field4493 - this.field4490;
        }
        if (arg0 >= -83) {
            this.method2071((byte) -75);
        }
        this.field4489 = 0L;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)J")
    private final long method2071(byte arg0) {
        long var2 = class175.method1195(61) * 1000000L;
        long var4 = var2 - this.field4489;
        this.field4489 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4492[this.field4491] = var4;
            this.field4491 = (this.field4491 + 1) % 10;
            if (this.field4488 < 10) {
                this.field4488++;
            }
        }
        long var6 = 0L;
        if (arg0 < 27) {
            return 69L;
        } else {
            for (int var8 = 1; var8 <= this.field4488; var8++) {
                var6 += this.field4492[(this.field4491 + 10 - var8) % 10];
            }
            return var6 / (long) this.field4488;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)I")
    public final int method401(byte arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != -51) {
            this.field4488 = 60;
        }
        this.field4490 += this.method2071((byte) 44);
        if (this.field4490 < this.field4493) {
            class150.method907((this.field4493 - this.field4490) / 1000000L, (byte) -32);
            this.field4489 += this.field4493 - this.field4490;
            this.field4490 += this.field4493 - this.field4490;
            this.field4493 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4493 += var3;
        } while (var5 < 10 && this.field4490 > this.field4493);
        if (this.field4490 > this.field4493) {
            this.field4493 = this.field4490;
        }
        return var5;
    }
}
