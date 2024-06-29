import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class111 extends class271 {

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "J")
    private long field1508 = 0L;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "J")
    private long field1507 = 0L;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    private int field1511 = 0;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "J")
    private long field1509 = 0L;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "[J")
    private long[] field1510 = new long[10];

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    private int field1512 = 1;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public final void method714(boolean arg0) {
        if (this.field1507 > this.field1508) {
            this.field1508 += this.field1507 - this.field1508;
        }
        this.field1509 = 0L;
        if (arg0) {
            this.field1511 = -4;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
    public final int method715(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 69) {
            return -19;
        }
        this.field1508 += this.method717(-1757);
        if (this.field1507 > this.field1508) {
            class496.method2931((byte) 126, (this.field1507 - this.field1508) / 1000000L);
            this.field1509 += this.field1507 - this.field1508;
            this.field1508 += this.field1507 - this.field1508;
            this.field1507 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1507 += var3;
        } while (var5 < 10 && this.field1507 < this.field1508);
        if (this.field1508 > this.field1507) {
            this.field1507 = this.field1508;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)J")
    public final long method716(byte arg0) {
        if (arg0 < 121) {
            this.field1510 = null;
        }
        return this.field1508;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)J")
    private final long method717(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1509;
        this.field1509 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1510[this.field1511] = var4;
            this.field1511 = (this.field1511 + 1) % 10;
            if (this.field1512 < 1) {
                this.field1512++;
            }
        }
        long var6 = 0L;
        if (arg0 == -1757) {
            for (int var8 = 1; var8 <= this.field1512; var8++) {
                var6 += this.field1510[(this.field1511 + 10 - var8) % 10];
            }
            return var6 / (long) this.field1512;
        } else {
            return 76L;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
    public class111() {
        this.field1508 = System.nanoTime();
        this.field1507 = System.nanoTime();
    }
}
