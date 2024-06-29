import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class6 extends class83 {

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "J")
    private long field135 = 0L;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[J")
    private long[] field136 = new long[10];

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    private int field133 = 0;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "J")
    private long field137 = 0L;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    private int field138 = 1;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "J")
    private long field134 = 0L;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)J", line = 10)
    private final long method40(int arg0) {
        long var2 = class176.method1234(5574) * 1000000L;
        long var4 = var2 - this.field137;
        this.field137 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field136[this.field133] = var4;
            this.field133 = (this.field133 + 1) % 10;
            if (this.field138 < 10) {
                this.field138++;
            }
        }
        if (arg0 != 10) {
            this.field136 = (long[]) null;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field138; var8++) {
            var6 += this.field136[(this.field133 + 10 - var8) % 10];
        }
        return var6 / (long) this.field138;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)J", line = 48)
    public final long method41(byte arg0) {
        if (arg0 != 6) {
            this.field133 = 12;
        }
        return this.field134;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 61)
    public final void method42(boolean arg0) {
        if (!arg0) {
            this.field137 = 116L;
        }
        this.field137 = 0L;
        if (this.field134 < this.field135) {
            this.field134 += this.field135 - this.field134;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I", line = 87)
    public final int method43(int arg0, int arg1, int arg2) {
        class184.method1283((long) arg1, 10);
        this.field134 += this.method40(10);
        long var4 = (long) arg2 * 1000000L;
        if (arg0 >= -29) {
            return -16;
        } else if (this.field135 > this.field134) {
            class184.method1283((this.field135 - this.field134) / 1000000L, 10);
            this.field137 += this.field135 - this.field134;
            this.field134 += this.field135 - this.field134;
            this.field135 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                var6++;
                this.field135 += var4;
            } while (var6 < 10 && this.field134 > this.field135);
            if (this.field134 > this.field135) {
                this.field135 = this.field134;
            }
            return var6;
        }
    }
}
