import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class127 extends class470 {

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "J")
    private long field1891 = 0L;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "J")
    private long field1892 = 0L;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    private int field1893 = 1;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "J")
    private long field1894 = 0L;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    private int field1895 = 0;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "[J")
    private long[] field1896 = new long[10];

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)J", line = 3)
    private final long method840(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1894;
        this.field1894 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1896[this.field1895] = var4;
            if (this.field1893 < 1) {
                this.field1893++;
            }
            this.field1895 = (this.field1895 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != -32) {
            this.method843((byte) 52);
        }
        for (int var8 = 1; var8 <= this.field1893; var8++) {
            var6 += this.field1896[(this.field1895 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1893;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V", line = 37)
    public final void method841(byte arg0) {
        int var2 = 13 % ((-arg0 - 65) / 47);
        this.field1894 = 0L;
        if (this.field1892 > this.field1891) {
            this.field1891 += this.field1892 - this.field1891;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)I", line = 50)
    public final int method842(byte arg0, int arg1) {
        if (arg0 != 101) {
            this.method840((byte) -112);
        }
        long var3 = (long) arg1 * 1000000L;
        this.field1891 += this.method840((byte) -32);
        if (this.field1891 < this.field1892) {
            class246.method1659((byte) 117, (this.field1892 - this.field1891) / 1000000L);
            this.field1894 += this.field1892 - this.field1891;
            this.field1891 += this.field1892 - this.field1891;
            this.field1892 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1892 += var3;
        } while (var5 < 10 && this.field1892 < this.field1891);
        if (this.field1892 < this.field1891) {
            this.field1892 = this.field1891;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)J", line = 86)
    public final long method843(byte arg0) {
        int var2 = -120 / ((arg0 + 39) / 51);
        return this.field1891;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 101)
    public class127() {
        this.field1892 = this.field1891 = jagmisc.nanoTime();
        if (this.field1891 == 0L) {
            throw new RuntimeException();
        }
    }
}
