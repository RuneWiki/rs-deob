import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class107 extends class219 {

    @OriginalMember(owner = "client!td", name = "j", descriptor = "J")
    private long field1533 = 0L;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "J")
    private long field1534 = 0L;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    private int field1535 = 1;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[J")
    private long[] field1537 = new long[10];

    @OriginalMember(owner = "client!td", name = "o", descriptor = "J")
    private long field1538 = 0L;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field1536 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    public final int method369(int arg0, int arg1) {
        if (arg1 != 24168) {
            this.method371(-59);
        }
        long var3 = (long) arg0 * 1000000L;
        this.field1533 += this.method717(10);
        if (this.field1533 < this.field1534) {
            class144.method918((this.field1534 - this.field1533) / 1000000L, true);
            this.field1538 += this.field1534 - this.field1533;
            this.field1533 += this.field1534 - this.field1533;
            this.field1534 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1534 += var3;
            var5++;
        } while (var5 < 10 && this.field1533 > this.field1534);
        if (this.field1533 > this.field1534) {
            this.field1534 = this.field1533;
        }
        return var5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)J")
    public final long method370(int arg0) {
        if (arg0 != 4) {
            this.method371(-121);
        }
        return this.field1533;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)J")
    private final long method717(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1538;
        this.field1538 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1537[this.field1536] = var4;
            if (this.field1535 < 1) {
                this.field1535++;
            }
            this.field1536 = (this.field1536 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1535; var8++) {
            var6 += this.field1537[(this.field1536 + 10 - var8) % 10];
        }
        return arg0 == 10 ? var6 / (long) this.field1535 : -84L;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public final void method371(int arg0) {
        if (arg0 != 4) {
            this.field1536 = 12;
        }
        if (this.field1533 < this.field1534) {
            this.field1533 += this.field1534 - this.field1533;
        }
        this.field1538 = 0L;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class107() {
        this.field1533 = System.nanoTime();
        this.field1534 = System.nanoTime();
    }
}
