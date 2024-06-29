import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class9 extends class576 {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "J")
    private long field93 = 0L;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "J")
    private long field94 = 0L;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "J")
    private long field96 = 0L;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[J")
    private long[] field95 = new long[10];

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    private int field97 = 1;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)J")
    private final long method38(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field96;
        this.field96 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field95[this.field98] = var4;
            if (this.field97 < 1) {
                this.field97++;
            }
            this.field98 = (this.field98 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 < 13) {
            this.method41((byte) -126);
        }
        for (int var8 = 1; var8 <= this.field97; var8++) {
            var6 += this.field95[(this.field98 + 10 - var8) % 10];
        }
        return var6 / (long) this.field97;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(JB)I")
    public final int method39(long arg0, byte arg1) {
        if (arg1 < 104) {
            this.field95 = null;
        }
        if (this.field94 > this.field93) {
            this.field96 += this.field94 - this.field93;
            this.field93 += this.field94 - this.field93;
            this.field94 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field94 += arg0;
            var4++;
        } while (var4 < 10 && this.field94 < this.field93);
        if (this.field93 > this.field94) {
            this.field94 = this.field93;
        }
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)J")
    public final long method40(int arg0) {
        this.field93 += this.method38((byte) 93);
        if (arg0 == 0) {
            return this.field93 < this.field94 ? (this.field94 - this.field93) / 1000000L : 0L;
        } else {
            return -12L;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)J")
    public final long method41(byte arg0) {
        int var2 = 49 / ((-arg0 - 75) / 37);
        return this.field93;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public final void method42(int arg0) {
        this.field96 = 0L;
        if (this.field93 < this.field94) {
            this.field93 += this.field94 - this.field93;
        }
        if (arg0 >= -67) {
            this.field96 = -74L;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class9() {
        this.field93 = System.nanoTime();
        this.field94 = System.nanoTime();
    }
}
