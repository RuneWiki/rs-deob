import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class94 extends class274 {

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "J")
    private long field1294 = 0L;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "J")
    private long field1293 = 0L;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field1295 = 0;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "J")
    private long field1297 = 0L;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[J")
    private long[] field1296 = new long[10];

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field1298 = 1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 4)
    public final void method246(byte arg0) {
        if (arg0 <= 124) {
            this.field1294 = 35L;
        }
        if (this.field1294 < this.field1293) {
            this.field1294 += this.field1293 - this.field1294;
        }
        this.field1297 = 0L;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)I", line = 19)
    public final int method248(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        class19.method140((long) arg0, 16711680);
        this.field1294 += this.method618(1);
        if (arg1 < 64) {
            return -43;
        } else if (this.field1294 < this.field1293) {
            class19.method140((this.field1293 - this.field1294) / 1000000L, 16711680);
            this.field1297 += this.field1293 - this.field1294;
            this.field1294 += this.field1293 - this.field1294;
            this.field1293 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                var6++;
                this.field1293 += var4;
            } while (var6 < 10 && this.field1294 > this.field1293);
            if (this.field1294 > this.field1293) {
                this.field1293 = this.field1294;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)J", line = 58)
    private final long method618(int arg0) {
        long var2 = 0L;
        long var4 = System.nanoTime();
        long var6 = var4 - this.field1297;
        this.field1297 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field1296[this.field1295] = var6;
            if (this.field1298 < 1) {
                this.field1298++;
            }
            this.field1295 = (this.field1295 + 1) % 10;
        }
        for (int var8 = arg0; var8 <= this.field1298; var8++) {
            var2 += this.field1296[(this.field1295 - (var8 - 10)) % 10];
        }
        return var2 / (long) this.field1298;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)J", line = 89)
    public final long method249(int arg0) {
        if (arg0 != 0) {
            this.field1298 = -106;
        }
        return this.field1294;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 103)
    public class94() {
        this.field1294 = System.nanoTime();
        this.field1293 = System.nanoTime();
    }
}
