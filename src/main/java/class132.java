import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class132 extends class62 {

    @OriginalMember(owner = "client!st", name = "k", descriptor = "J")
    private long field1750 = 0L;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "J")
    private long field1751 = 0L;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "[J")
    private long[] field1753 = new long[10];

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    private int field1752 = 1;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "J")
    private long field1754 = 0L;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    private int field1755 = 0;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)J")
    private final long method810(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != 3983) {
            return -3L;
        }
        long var4 = var2 - this.field1754;
        this.field1754 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1753[this.field1755] = var4;
            this.field1755 = (this.field1755 + 1) % 10;
            if (this.field1752 < 1) {
                this.field1752++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1752; var8++) {
            var6 += this.field1753[(this.field1755 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1752;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(JI)I")
    public final int method392(long arg0, int arg1) {
        int var4 = 92 / ((44 - arg1) / 53);
        if (this.field1750 > this.field1751) {
            this.field1754 += this.field1750 - this.field1751;
            this.field1751 += this.field1750 - this.field1751;
            this.field1750 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1750 += arg0;
        } while (var5 < 10 && this.field1750 < this.field1751);
        if (this.field1751 > this.field1750) {
            this.field1750 = this.field1751;
        }
        return var5;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)J")
    public final long method393(boolean arg0) {
        if (arg0) {
            this.field1754 = -2L;
        }
        this.field1751 += this.method810(3983);
        return this.field1750 > this.field1751 ? (this.field1750 - this.field1751) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public final void method387(byte arg0) {
        if (arg0 == 36) {
            this.field1754 = 0L;
            if (this.field1750 > this.field1751) {
                this.field1751 += this.field1750 - this.field1751;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)J")
    public final long method391(int arg0) {
        return arg0 == -24244 ? this.field1751 : -94L;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class132() {
        this.field1750 = this.field1751 = jagmisc.nanoTime();
        if (this.field1751 == 0L) {
            throw new RuntimeException();
        }
    }
}
