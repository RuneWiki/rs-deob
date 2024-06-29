import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class86 extends class244 {

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "J")
    private long field1287 = 0L;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "J")
    private long field1288 = 0L;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "J")
    private long field1290 = 0L;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field1289 = 0;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[J")
    private long[] field1291 = new long[10];

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field1292 = 1;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)J", line = 7)
    private final long method774(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1290;
        this.field1290 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1291[this.field1289] = var4;
            this.field1289 = (this.field1289 + 1) % 10;
            if (this.field1292 < 1) {
                this.field1292++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1292; var8++) {
            var6 += this.field1291[(this.field1289 + 10 - var8) % 10];
        }
        if (arg0 > -25) {
            this.method776((byte) 32);
        }
        return var6 / (long) this.field1292;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 45)
    public class86() {
        this.field1287 = System.nanoTime();
        this.field1288 = System.nanoTime();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)J", line = 59)
    public final long method775(byte arg0) {
        int var2 = 96 / ((41 - arg0) / 62);
        return this.field1287;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 68)
    public final void method776(byte arg0) {
        this.field1290 = 0L;
        if (arg0 != 100) {
            this.method777(-83, (byte) 85);
        }
        if (this.field1287 < this.field1288) {
            this.field1287 += this.field1288 - this.field1287;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I", line = 83)
    public final int method777(int arg0, byte arg1) {
        this.field1287 += this.method774((byte) -57);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 != -79) {
            this.method776((byte) -58);
        }
        if (this.field1288 > this.field1287) {
            class229.method1541(63, (this.field1288 - this.field1287) / 1000000L);
            this.field1290 += this.field1288 - this.field1287;
            this.field1287 += this.field1288 - this.field1287;
            this.field1288 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1288 += var3;
            var5++;
        } while (var5 < 10 && this.field1287 > this.field1288);
        if (this.field1287 > this.field1288) {
            this.field1288 = this.field1287;
        }
        return var5;
    }
}
