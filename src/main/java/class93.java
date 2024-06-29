import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class93 extends class325 {

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "J")
    private long field1284 = 0L;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "J")
    private long field1283 = 0L;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "J")
    private long field1285 = 0L;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    private int field1288 = 0;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    private int field1286 = 1;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[J")
    private long[] field1287 = new long[10];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method716(byte arg0) {
        if (this.field1284 > this.field1283) {
            this.field1283 += this.field1284 - this.field1283;
        }
        this.field1285 = 0L;
        if (arg0 > -35) {
            this.method716((byte) -45);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)J")
    private final long method717(boolean arg0) {
        if (arg0) {
            this.field1286 = 86;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1285;
        this.field1285 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1287[this.field1288] = var4;
            this.field1288 = (this.field1288 + 1) % 10;
            if (this.field1286 < 1) {
                this.field1286++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1286; var8++) {
            var6 += this.field1287[(this.field1288 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1286;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)J")
    public final long method718(boolean arg0) {
        if (arg0) {
            this.field1286 = -67;
        }
        return this.field1283;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class93() {
        this.field1284 = this.field1283 = jagmisc.nanoTime();
        if (this.field1283 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
    public final int method719(int arg0, int arg1) {
        int var3 = -1 / ((arg0 - 2) / 43);
        long var4 = (long) arg1 * 1000000L;
        this.field1283 += this.method717(false);
        if (this.field1284 > this.field1283) {
            class325.method2005(true, (this.field1284 - this.field1283) / 1000000L);
            this.field1285 += this.field1284 - this.field1283;
            this.field1283 += this.field1284 - this.field1283;
            this.field1284 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field1284 += var4;
            var6++;
        } while (var6 < 10 && this.field1283 > this.field1284);
        if (this.field1284 < this.field1283) {
            this.field1284 = this.field1283;
        }
        return var6;
    }
}
