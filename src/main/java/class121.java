import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class121 extends class409 {

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "J")
    private long field1715 = 0L;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "J")
    private long field1716 = 0L;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[J")
    private long[] field1719 = new long[10];

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "J")
    private long field1718 = 0L;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    private int field1720 = 1;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    private int field1717 = 0;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)J")
    public final long method491(int arg0) {
        if (arg0 != -30419) {
            this.method493((byte) 86, 111);
        }
        return this.field1715;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public final void method492(int arg0) {
        int var2 = 0 % ((arg0 - 50) / 60);
        this.field1718 = 0L;
        if (this.field1716 > this.field1715) {
            this.field1715 += this.field1716 - this.field1715;
        }
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)J")
    private final long method818(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1718;
        this.field1718 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1719[this.field1717] = var4;
            this.field1717 = (this.field1717 + 1) % 10;
            if (this.field1720 < 1) {
                this.field1720++;
            }
        }
        long var6 = 0L;
        if (arg0 == 31555) {
            for (int var8 = 1; var8 <= this.field1720; var8++) {
                var6 += this.field1719[(this.field1717 - (var8 - 10)) % 10];
            }
            return var6 / (long) this.field1720;
        } else {
            return -70L;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)I")
    public final int method493(byte arg0, int arg1) {
        this.field1715 += this.method818(31555);
        if (arg0 != -126) {
            return 45;
        }
        long var3 = (long) arg1 * 1000000L;
        if (this.field1715 < this.field1716) {
            class4.method28((this.field1716 - this.field1715) / 1000000L, -123);
            this.field1718 += this.field1716 - this.field1715;
            this.field1715 += this.field1716 - this.field1715;
            this.field1716 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1716 += var3;
            var5++;
        } while (var5 < 10 && this.field1715 > this.field1716);
        if (this.field1715 > this.field1716) {
            this.field1716 = this.field1715;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
    public class121() {
        this.field1716 = this.field1715 = jagmisc.nanoTime();
        if (this.field1715 == 0L) {
            throw new RuntimeException();
        }
    }
}
