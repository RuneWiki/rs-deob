import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class96 extends class215 {

    @OriginalMember(owner = "client!th", name = "r", descriptor = "J")
    private long field1493 = 0L;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "J")
    private long field1494 = 0L;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "J")
    private long field1495 = 0L;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    private int field1498 = 0;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "[J")
    private long[] field1497 = new long[10];

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private int field1496 = 1;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I", line = 5)
    public final int method819(int arg0, int arg1, int arg2) {
        if (arg2 >= -83) {
            return -92;
        }
        long var4 = (long) arg1 * 1000000L;
        class142.method1149((long) arg0, (byte) 127);
        this.field1494 += this.method820((byte) 118);
        if (this.field1494 < this.field1493) {
            class142.method1149((this.field1493 - this.field1494) / 1000000L, (byte) 124);
            this.field1495 += this.field1493 - this.field1494;
            this.field1494 += this.field1493 - this.field1494;
            this.field1493 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1493 += var4;
        } while (var6 < 10 && this.field1493 < this.field1494);
        if (this.field1494 > this.field1493) {
            this.field1493 = this.field1494;
        }
        return var6;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)J", line = 46)
    private final long method820(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1495;
        long var6 = 0L;
        if (arg0 < 41) {
            return 112L;
        }
        this.field1495 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1497[this.field1498] = var4;
            this.field1498 = (this.field1498 + 1) % 10;
            if (this.field1496 < 1) {
                this.field1496++;
            }
        }
        for (int var8 = 1; var8 <= this.field1496; var8++) {
            var6 += this.field1497[(this.field1498 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field1496;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 105)
    public class96() {
        this.field1493 = this.field1494 = jagmisc.nanoTime();
        if (this.field1494 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 82)
    public final void method821(byte arg0) {
        this.field1495 = 0L;
        if (this.field1493 > this.field1494) {
            this.field1494 += this.field1493 - this.field1494;
        }
        int var2 = -107 / ((-arg0 - 74) / 47);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)J", line = 94)
    public final long method822(int arg0) {
        if (arg0 != 32234) {
            this.method822(23);
        }
        return this.field1494;
    }
}
