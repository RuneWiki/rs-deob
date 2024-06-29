import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class146 extends class62 {

    @OriginalMember(owner = "client!su", name = "k", descriptor = "J")
    private long field1880 = 0L;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "[J")
    private long[] field1881 = new long[10];

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    private int field1884 = 1;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "J")
    private long field1883 = 0L;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "J")
    private long field1882 = 0L;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    private int field1885 = 0;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)J", line = 5)
    public final long method391(int arg0) {
        return arg0 == -24244 ? this.field1882 : -114L;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V", line = 15)
    public final void method387(byte arg0) {
        if (this.field1882 < this.field1880) {
            this.field1882 += this.field1880 - this.field1882;
        }
        this.field1883 = 0L;
        if (arg0 != 36) {
            this.method862(123);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)J", line = 29)
    public final long method393(boolean arg0) {
        if (arg0) {
            this.field1883 = 53L;
        }
        this.field1882 += this.method862(9875);
        return this.field1880 > this.field1882 ? (this.field1880 - this.field1882) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(JI)I", line = 50)
    public final int method392(long arg0, int arg1) {
        int var4 = -54 % ((44 - arg1) / 53);
        if (this.field1880 > this.field1882) {
            this.field1883 += this.field1880 - this.field1882;
            this.field1882 += this.field1880 - this.field1882;
            this.field1880 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1880 += arg0;
        } while (var5 < 10 && this.field1882 > this.field1880);
        if (this.field1882 > this.field1880) {
            this.field1880 = this.field1882;
        }
        return var5;
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)J", line = 88)
    private final long method862(int arg0) {
        long var2 = class450.method2719((byte) -7) * 1000000L;
        long var4 = var2 - this.field1883;
        this.field1883 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1881[this.field1885] = var4;
            this.field1885 = (this.field1885 + 1) % 10;
            if (this.field1884 < 10) {
                this.field1884++;
            }
        }
        if (arg0 != 9875) {
            this.field1884 = 42;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1884; var8++) {
            var6 += this.field1881[(this.field1885 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1884;
    }
}
